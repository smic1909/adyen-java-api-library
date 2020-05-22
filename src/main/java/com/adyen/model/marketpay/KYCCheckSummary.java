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
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.marketpay;

import com.adyen.constants.TextConstants;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * KYCCheckSummary
 */
public class KYCCheckSummary {
    @SerializedName("kycCheckCode")
    private Integer kycCheckCode = null;

    @SerializedName("kycCheckDescription")
    private String kycCheckDescription = null;

    public KYCCheckSummary kycCheckCode(Integer kycCheckCode) {
        this.kycCheckCode = kycCheckCode;
        return this;
    }

    /**
     * The code of the check.
     *
     * @return kycCheckCode
     **/
    public Integer getKycCheckCode() {
        return kycCheckCode;
    }

    public void setKycCheckCode(Integer kycCheckCode) {
        this.kycCheckCode = kycCheckCode;
    }

    public KYCCheckSummary kycCheckDescription(String kycCheckDescription) {
        this.kycCheckDescription = kycCheckDescription;
        return this;
    }

    /**
     * A description of the check.
     *
     * @return kycCheckDescription
     **/
    public String getKycCheckDescription() {
        return kycCheckDescription;
    }

    public void setKycCheckDescription(String kycCheckDescription) {
        this.kycCheckDescription = kycCheckDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        KYCCheckSummary kyCCheckSummary = (KYCCheckSummary) o;
        return Objects.equals(this.kycCheckCode, kyCCheckSummary.kycCheckCode) &&
                Objects.equals(this.kycCheckDescription, kyCCheckSummary.kycCheckDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kycCheckCode, kycCheckDescription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KYCCheckSummary {").append(TextConstants.LINE_BREAK);

        sb.append("    kycCheckCode: ").append(Util.toIndentedString(kycCheckCode)).append(TextConstants.LINE_BREAK);
        sb.append("    kycCheckDescription: ").append(Util.toIndentedString(kycCheckDescription)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }

}
