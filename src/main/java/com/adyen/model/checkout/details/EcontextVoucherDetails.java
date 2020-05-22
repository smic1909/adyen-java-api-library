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
 * EcontextVoucherDetails
 */

public class EcontextVoucherDetails implements PaymentMethodDetails {
    /**
     * Possible types
     */
    public static final String SEVENELEVEN = "econtext_seveneleven";
    public static final String STORES = "econtext_stores";

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("lastName")
    private String lastName = null;

    @SerializedName("shopperEmail")
    private String shopperEmail = null;

    @SerializedName("telephoneNumber")
    private String telephoneNumber = null;

    @SerializedName("type")
    private String type = null;

    public EcontextVoucherDetails firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * The shopper&#x27;s first name.
     *
     * @return firstName
     **/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public EcontextVoucherDetails lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The shopper&#x27;s last name.
     *
     * @return lastName
     **/
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EcontextVoucherDetails shopperEmail(String shopperEmail) {
        this.shopperEmail = shopperEmail;
        return this;
    }

    /**
     * The shopper&#x27;s email.
     *
     * @return shopperEmail
     **/
    public String getShopperEmail() {
        return shopperEmail;
    }

    public void setShopperEmail(String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }

    public EcontextVoucherDetails telephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    /**
     * The shopper&#x27;s contact number.
     *
     * @return telephoneNumber
     **/
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public EcontextVoucherDetails type(String type) {
        this.type = type;
        return this;
    }

    /**
     * **econtextvoucher**
     * One of
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
        EcontextVoucherDetails econtextVoucherDetails = (EcontextVoucherDetails) o;
        return Objects.equals(this.firstName, econtextVoucherDetails.firstName) &&
                Objects.equals(this.lastName, econtextVoucherDetails.lastName) &&
                Objects.equals(this.shopperEmail, econtextVoucherDetails.shopperEmail) &&
                Objects.equals(this.telephoneNumber, econtextVoucherDetails.telephoneNumber) &&
                Objects.equals(this.type, econtextVoucherDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, shopperEmail, telephoneNumber, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcontextVoucherDetails {").append(TextConstants.LINE_BREAK);

        sb.append("    firstName: ").append(Util.toIndentedString(firstName)).append(TextConstants.LINE_BREAK);
        sb.append("    lastName: ").append(Util.toIndentedString(lastName)).append(TextConstants.LINE_BREAK);
        sb.append("    shopperEmail: ").append(Util.toIndentedString(shopperEmail)).append(TextConstants.LINE_BREAK);
        sb.append("    telephoneNumber: ").append(Util.toIndentedString(telephoneNumber)).append(TextConstants.LINE_BREAK);
        sb.append("    type: ").append(Util.toIndentedString(type)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }

}
