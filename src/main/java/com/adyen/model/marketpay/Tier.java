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
import com.adyen.model.Amount;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Tier
 */
public class Tier {
    @SerializedName("deadlineConfiguration")
    private String deadlineConfiguration = null;

    @SerializedName("fromAmount")
    private Amount fromAmount = null;

    @SerializedName("tierNumber")
    private Integer tierNumber = null;

    @SerializedName("toAmount")
    private Amount toAmount = null;

    public Tier deadlineConfiguration(String deadlineConfiguration) {
        this.deadlineConfiguration = deadlineConfiguration;
        return this;
    }

    /**
     * Get deadlineConfiguration
     *
     * @return deadlineConfiguration
     **/
    public String getDeadlineConfiguration() {
        return deadlineConfiguration;
    }

    public void setDeadlineConfiguration(String deadlineConfiguration) {
        this.deadlineConfiguration = deadlineConfiguration;
    }

    public Tier fromAmount(Amount fromAmount) {
        this.fromAmount = fromAmount;
        return this;
    }

    /**
     * Get fromAmount
     *
     * @return fromAmount
     **/
    public Amount getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Amount fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Tier tierNumber(Integer tierNumber) {
        this.tierNumber = tierNumber;
        return this;
    }

    /**
     * Get tierNumber
     *
     * @return tierNumber
     **/
    public Integer getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(Integer tierNumber) {
        this.tierNumber = tierNumber;
    }

    public Tier toAmount(Amount toAmount) {
        this.toAmount = toAmount;
        return this;
    }

    /**
     * Get toAmount
     *
     * @return toAmount
     **/
    public Amount getToAmount() {
        return toAmount;
    }

    public void setToAmount(Amount toAmount) {
        this.toAmount = toAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        Tier tier = (Tier) o;
        return Objects.equals(this.deadlineConfiguration, tier.deadlineConfiguration) && Objects.equals(this.fromAmount, tier.fromAmount) && Objects.equals(this.tierNumber, tier.tierNumber) && Objects
                .equals(this.toAmount, tier.toAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deadlineConfiguration, fromAmount, tierNumber, toAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tier {").append(TextConstants.LINE_BREAK);

        sb.append("    deadlineConfiguration: ").append(Util.toIndentedString(deadlineConfiguration)).append(TextConstants.LINE_BREAK);
        sb.append("    fromAmount: ").append(Util.toIndentedString(fromAmount)).append(TextConstants.LINE_BREAK);
        sb.append("    tierNumber: ").append(Util.toIndentedString(tierNumber)).append(TextConstants.LINE_BREAK);
        sb.append("    toAmount: ").append(Util.toIndentedString(toAmount)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }

}

