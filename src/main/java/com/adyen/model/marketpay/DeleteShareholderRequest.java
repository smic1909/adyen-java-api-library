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
 * DeleteShareholderRequest
 */
public class DeleteShareholderRequest {
    @SerializedName("accountHolderCode")
    private String accountHolderCode = null;

    @SerializedName("shareholderCodes")
    private List<String> shareholderCodes = new ArrayList<>();

    public DeleteShareholderRequest accountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
        return this;
    }

    /**
     * account holder code, whose shareholders have to be deleted
     *
     * @return accountHolderCode
     **/
    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    public void setAccountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
    }

    public DeleteShareholderRequest shareholderCodes(List<String> shareholderCodes) {
        this.shareholderCodes = shareholderCodes;
        return this;
    }

    public DeleteShareholderRequest addShareholderCodesItem(String shareholderCodesItem) {
        this.shareholderCodes.add(shareholderCodesItem);
        return this;
    }

    /**
     * codes of the shareholders to be deleted
     *
     * @return shareholderCodes
     **/
    public List<String> getShareholderCodes() {
        return shareholderCodes;
    }

    public void setShareholderCodes(List<String> shareholderCodes) {
        this.shareholderCodes = shareholderCodes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        DeleteShareholderRequest deleteShareholderRequest = (DeleteShareholderRequest) o;
        return Objects.equals(this.accountHolderCode, deleteShareholderRequest.accountHolderCode) && Objects.equals(this.shareholderCodes, deleteShareholderRequest.shareholderCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolderCode, shareholderCodes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteShareholderRequest {").append(TextConstants.LINE_BREAK);

        sb.append("    accountHolderCode: ").append(Util.toIndentedString(accountHolderCode)).append(TextConstants.LINE_BREAK);
        sb.append("    shareholderCodes: ").append(Util.toIndentedString(shareholderCodes)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}

