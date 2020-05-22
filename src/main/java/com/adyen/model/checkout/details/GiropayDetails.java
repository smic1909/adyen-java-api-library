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

package com.adyen.model.checkout.details;

import com.adyen.constants.TextConstants;
import com.adyen.model.checkout.PaymentMethodDetails;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GiropayDetails
 */

public class GiropayDetails implements PaymentMethodDetails {
    /**
     * Possible types
     */
    public static final String GIROPAY = "giropay";

    @SerializedName("type")
    private String type = GIROPAY;

    public GiropayDetails type(String type) {
        this.type = type;
        return this;
    }

    /**
     * **giropay**
     *
     * @return type
     **/
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        GiropayDetails giropayDetails = (GiropayDetails) o;
        return Objects.equals(this.type, giropayDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GiropayDetails {").append(TextConstants.LINE_BREAK);

        sb.append("    type: ").append(Util.toIndentedString(type)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}
