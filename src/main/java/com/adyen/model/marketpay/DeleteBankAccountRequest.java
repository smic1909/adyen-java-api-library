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
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.marketpay;

import com.adyen.constants.TextConstants;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeleteBankAccountRequest
 */
public class DeleteBankAccountRequest {
    @SerializedName("accountHolderCode")
    private String accountHolderCode = null;

    @SerializedName("bankAccountUUIDs")
    private List<String> bankAccountUUIDs = new ArrayList<>();

    public DeleteBankAccountRequest accountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
        return this;
    }

    /**
     * account holder code, whose bank accounts have to be deleted
     *
     * @return accountHolderCode
     **/
    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    public void setAccountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
    }

    public DeleteBankAccountRequest bankAccountUUIDs(List<String> bankAccountUUIDs) {
        this.bankAccountUUIDs = bankAccountUUIDs;
        return this;
    }

    public DeleteBankAccountRequest addBankAccountUUIDsItem(String bankAccountUUIDsItem) {
        this.bankAccountUUIDs.add(bankAccountUUIDsItem);
        return this;
    }

    /**
     * codes of the bank accounts to be deleted
     *
     * @return bankAccountUUIDs
     **/
    public List<String> getBankAccountUUIDs() {
        return bankAccountUUIDs;
    }

    public void setBankAccountUUIDs(List<String> bankAccountUUIDs) {
        this.bankAccountUUIDs = bankAccountUUIDs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        DeleteBankAccountRequest deleteBankAccountRequest = (DeleteBankAccountRequest) o;
        return Objects.equals(this.accountHolderCode, deleteBankAccountRequest.accountHolderCode) && Objects.equals(this.bankAccountUUIDs, deleteBankAccountRequest.bankAccountUUIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolderCode, bankAccountUUIDs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBankAccountRequest {").append(TextConstants.LINE_BREAK);

        sb.append("    accountHolderCode: ").append(Util.toIndentedString(accountHolderCode)).append(TextConstants.LINE_BREAK);
        sb.append("    bankAccountUUIDs: ").append(Util.toIndentedString(bankAccountUUIDs)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}

