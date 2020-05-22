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
 * Copyright (c) 2019 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.binlookup;

import com.adyen.constants.TextConstants;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ThreeDS2CardRangeDetail
 */

public class ThreeDS2CardRangeDetail {

    @SerializedName("brandCode")
    private String brandCode = null;

    @SerializedName("endRange")
    private String endRange = null;

    @SerializedName("startRange")
    private String startRange = null;

    @SerializedName("threeDS2Version")
    private String threeDS2Version = null;

    @SerializedName("threeDSMethodURL")
    private String threeDSMethodURL = null;

    public ThreeDS2CardRangeDetail brandCode(String brandCode) {
        this.brandCode = brandCode;
        return this;
    }


    /**
     * Card brand.
     *
     * @return brandCode
     **/
    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public ThreeDS2CardRangeDetail endRange(String endRange) {
        this.endRange = endRange;
        return this;
    }


    /**
     * BIN end range.
     *
     * @return endRange
     **/
    public String getEndRange() {
        return endRange;
    }

    public void setEndRange(String endRange) {
        this.endRange = endRange;
    }

    public ThreeDS2CardRangeDetail startRange(String startRange) {
        this.startRange = startRange;
        return this;
    }


    /**
     * BIN start range.
     *
     * @return startRange
     **/
    public String getStartRange() {
        return startRange;
    }

    public void setStartRange(String startRange) {
        this.startRange = startRange;
    }

    public ThreeDS2CardRangeDetail threeDS2Version(String threeDS2Version) {
        this.threeDS2Version = threeDS2Version;
        return this;
    }


    /**
     * 3D Secure protocol version.
     *
     * @return threeDS2Version
     **/
    public String getThreeDS2Version() {
        return threeDS2Version;
    }

    public void setThreeDS2Version(String threeDS2Version) {
        this.threeDS2Version = threeDS2Version;
    }

    public ThreeDS2CardRangeDetail threeDSMethodURL(String threeDSMethodURL) {
        this.threeDSMethodURL = threeDSMethodURL;
        return this;
    }


    /**
     * In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.
     *
     * @return threeDSMethodURL
     **/
    public String getThreeDSMethodURL() {
        return threeDSMethodURL;
    }

    public void setThreeDSMethodURL(String threeDSMethodURL) {
        this.threeDSMethodURL = threeDSMethodURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        ThreeDS2CardRangeDetail threeDS2CardRangeDetail = (ThreeDS2CardRangeDetail) o;
        return Objects.equals(this.brandCode, threeDS2CardRangeDetail.brandCode)
                && Objects.equals(this.endRange, threeDS2CardRangeDetail.endRange)
                && Objects.equals(this.startRange,
                                  threeDS2CardRangeDetail.startRange)
                && Objects.equals(this.threeDS2Version, threeDS2CardRangeDetail.threeDS2Version)
                && Objects.equals(this.threeDSMethodURL, threeDS2CardRangeDetail.threeDSMethodURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandCode, endRange, startRange, threeDS2Version, threeDSMethodURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreeDS2CardRangeDetail {").append(TextConstants.LINE_BREAK);

        sb.append("    brandCode: ").append(Util.toIndentedString(brandCode)).append(TextConstants.LINE_BREAK);
        sb.append("    endRange: ").append(Util.toIndentedString(endRange)).append(TextConstants.LINE_BREAK);
        sb.append("    startRange: ").append(Util.toIndentedString(startRange)).append(TextConstants.LINE_BREAK);
        sb.append("    threeDS2Version: ").append(Util.toIndentedString(threeDS2Version)).append(TextConstants.LINE_BREAK);
        sb.append("    threeDSMethodURL: ").append(Util.toIndentedString(threeDSMethodURL)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }

}
