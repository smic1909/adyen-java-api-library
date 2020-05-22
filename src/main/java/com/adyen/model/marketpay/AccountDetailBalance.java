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

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.constants.TextConstants.LINE_BREAK;
import static com.adyen.util.Util.toIndentedString;

/**
 * AccountDetailBalance
 */
public class AccountDetailBalance {
    @SerializedName("detailBalance")
    private DetailBalance detailBalance = null;

    @SerializedName("accountCode")
    private String accountCode = null;

    public AccountDetailBalance detailBalance(DetailBalance detailBalance) {
        this.detailBalance = detailBalance;
        return this;
    }

    /**
     * detail balance
     *
     * @return detailBalance
     **/
    public DetailBalance getDetailBalance() {
        return detailBalance;
    }

    public void setDetailBalance(DetailBalance detailBalance) {
        this.detailBalance = detailBalance;
    }

    public AccountDetailBalance accountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    /**
     * account code
     *
     * @return accountCode
     **/
    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        AccountDetailBalance accountDetailBalance = (AccountDetailBalance) o;
        return Objects.equals(this.detailBalance, accountDetailBalance.detailBalance) && Objects.equals(this.accountCode, accountDetailBalance.accountCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailBalance, accountCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountDetailBalance {").append(LINE_BREAK);

        sb.append("    detailBalance: ").append(toIndentedString(detailBalance)).append(LINE_BREAK);
        sb.append("    accountCode: ").append(toIndentedString(accountCode)).append(LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}

