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
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PaymentResultRequest
 */
public class PaymentResultRequest {

    @SerializedName("payload")
    private String payload = null;

    public PaymentResultRequest payload(String payload) {
        this.payload = payload;
        return this;
    }


    /**
     * Encrypted and signed payment result data. You should receive this value from the Checkout SDK after the shopper completes the payment.
     *
     * @return payload
     **/
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        PaymentResultRequest paymentResultRequest = (PaymentResultRequest) o;
        return Objects.equals(this.payload, paymentResultRequest.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentResultRequest {\n");

        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (Objects.isNull(o)) {
            return TextConstants.NULL;
        }
        return o.toString().replace("\n", "\n    ");
    }


}



