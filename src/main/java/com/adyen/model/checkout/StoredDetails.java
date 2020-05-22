/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2018 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.checkout;

import com.adyen.constants.TextConstants;
import com.adyen.model.BankAccount;
import com.adyen.model.Card;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StoredDetails
 */
public class StoredDetails {

    @SerializedName("bank")
    private BankAccount bank = null;

    @SerializedName("card")
    private Card card = null;

    @SerializedName("emailAddress")
    private String emailAddress = null;

    public StoredDetails bank(BankAccount bank) {
        this.bank = bank;
        return this;
    }


    /**
     * Get bank
     *
     * @return bank
     **/
    public BankAccount getBank() {
        return bank;
    }

    public void setBank(BankAccount bank) {
        this.bank = bank;
    }

    public StoredDetails card(Card card) {
        this.card = card;
        return this;
    }


    /**
     * Get card
     *
     * @return card
     **/
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public StoredDetails emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }


    /**
     * The email associated with stored payment details.
     *
     * @return emailAddress
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        StoredDetails storedDetails = (StoredDetails) o;
        return Objects.equals(this.bank, storedDetails.bank) &&
                Objects.equals(this.card, storedDetails.card) &&
                Objects.equals(this.emailAddress, storedDetails.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bank, card, emailAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoredDetails {").append(TextConstants.LINE_BREAK);

        sb.append("    bank: ").append(Util.toIndentedString(bank)).append(TextConstants.LINE_BREAK);
        sb.append("    card: ").append(Util.toIndentedString(card)).append(TextConstants.LINE_BREAK);
        sb.append("    emailAddress: ").append(Util.toIndentedString(emailAddress)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }




}



