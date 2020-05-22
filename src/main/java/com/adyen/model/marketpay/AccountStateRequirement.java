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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.adyen.constants.TextConstants.LINE_BREAK;
import static com.adyen.util.Util.toIndentedString;

/**
 * AccountStateRequirement
 */
public class AccountStateRequirement {
    @SerializedName("requiredFields")
    private List<FieldType> requiredFields = new ArrayList<>();

    @SerializedName("state")
    private AccountState state = null;

    public AccountStateRequirement requiredFields(List<FieldType> requiredFields) {
        this.requiredFields = requiredFields;
        return this;
    }

    public AccountStateRequirement addRequiredFieldsItem(FieldType requiredFieldsItem) {
        this.requiredFields.add(requiredFieldsItem);
        return this;
    }

    /**
     * properties that need to be provided for the account holder to reach the next processing state
     *
     * @return requiredFields
     **/
    public List<FieldType> getRequiredFields() {
        return requiredFields;
    }

    public void setRequiredFields(List<FieldType> requiredFields) {
        this.requiredFields = requiredFields;
    }

    public AccountStateRequirement state(AccountState state) {
        this.state = state;
        return this;
    }

    /**
     * the processing state that can be reached if the given properties are provided
     *
     * @return state
     **/
    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        AccountStateRequirement accountStateRequirement = (AccountStateRequirement) o;
        return Objects.equals(this.requiredFields, accountStateRequirement.requiredFields) && Objects.equals(this.state, accountStateRequirement.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredFields, state);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountStateRequirement {").append(LINE_BREAK);

        sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append(LINE_BREAK);
        sb.append("    state: ").append(toIndentedString(state)).append(LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}

