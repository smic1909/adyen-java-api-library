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
package com.adyen.model.applicationinfo;

import com.adyen.constants.TextConstants;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class MerchantDevice {

    @SerializedName("os")
    private String os = null;

    @SerializedName("osVersion")
    private String osVersion = null;

    @SerializedName("reference")
    private String reference = null;

    public MerchantDevice os(String os) {
        this.os = os;
        return this;
    }


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public MerchantDevice osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }


    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public MerchantDevice reference(String reference) {
        this.reference = reference;
        return this;
    }


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        MerchantDevice merchantDevice = (MerchantDevice) o;
        return Objects.equals(this.os, merchantDevice.os) && Objects.equals(this.osVersion, merchantDevice.osVersion) && Objects.equals(this.reference, merchantDevice.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, osVersion, reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MerchantDevice {").append(TextConstants.LINE_BREAK);

        sb.append("    os: ").append(Util.toIndentedString(os)).append(TextConstants.LINE_BREAK);
        sb.append("    osVersion: ").append(Util.toIndentedString(osVersion)).append(TextConstants.LINE_BREAK);
        sb.append("    reference: ").append(Util.toIndentedString(reference)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }


}