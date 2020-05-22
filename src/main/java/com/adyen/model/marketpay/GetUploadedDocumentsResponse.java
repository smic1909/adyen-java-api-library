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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetUploadedDocumentsResponse
 */
public class GetUploadedDocumentsResponse {
    @SerializedName("documentDetails")
    private List<DocumentDetail> documentDetails = null;

    @SerializedName("invalidFields")
    private List<ErrorFieldType> invalidFields = null;

    @SerializedName("pspReference")
    private String pspReference = null;

    @SerializedName("resultCode")
    private String resultCode = null;

    public GetUploadedDocumentsResponse documentDetails(List<DocumentDetail> documentDetails) {
        this.documentDetails = documentDetails;
        return this;
    }

    public GetUploadedDocumentsResponse addDocumentDetailsItem(DocumentDetail documentDetailsItem) {
        if (this.documentDetails == null) {
            this.documentDetails = new ArrayList<>();
        }
        this.documentDetails.add(documentDetailsItem);
        return this;
    }

    /**
     * A list of the documents and their details.
     *
     * @return documentDetails
     **/
    public List<DocumentDetail> getDocumentDetails() {
        return documentDetails;
    }

    public void setDocumentDetails(List<DocumentDetail> documentDetails) {
        this.documentDetails = documentDetails;
    }

    public GetUploadedDocumentsResponse invalidFields(List<ErrorFieldType> invalidFields) {
        this.invalidFields = invalidFields;
        return this;
    }

    public GetUploadedDocumentsResponse addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
        if (this.invalidFields == null) {
            this.invalidFields = new ArrayList<>();
        }
        this.invalidFields.add(invalidFieldsItem);
        return this;
    }

    /**
     * Contains field validation errors that would prevent requests from being processed.
     *
     * @return invalidFields
     **/
    public List<ErrorFieldType> getInvalidFields() {
        return invalidFields;
    }

    public void setInvalidFields(List<ErrorFieldType> invalidFields) {
        this.invalidFields = invalidFields;
    }

    public GetUploadedDocumentsResponse pspReference(String pspReference) {
        this.pspReference = pspReference;
        return this;
    }

    /**
     * The reference of a request.  Can be used to uniquely identify the request.
     *
     * @return pspReference
     **/
    public String getPspReference() {
        return pspReference;
    }

    public void setPspReference(String pspReference) {
        this.pspReference = pspReference;
    }

    public GetUploadedDocumentsResponse resultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * The result code.
     *
     * @return resultCode
     **/
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        GetUploadedDocumentsResponse getUploadedDocumentsResponse = (GetUploadedDocumentsResponse) o;
        return Objects.equals(this.documentDetails, getUploadedDocumentsResponse.documentDetails) &&
                Objects.equals(this.invalidFields, getUploadedDocumentsResponse.invalidFields) &&
                Objects.equals(this.pspReference, getUploadedDocumentsResponse.pspReference) &&
                Objects.equals(this.resultCode, getUploadedDocumentsResponse.resultCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentDetails, invalidFields, pspReference, resultCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUploadedDocumentsResponse {").append(TextConstants.LINE_BREAK);

        sb.append("    documentDetails: ").append(Util.toIndentedString(documentDetails)).append(TextConstants.LINE_BREAK);
        sb.append("    invalidFields: ").append(Util.toIndentedString(invalidFields)).append(TextConstants.LINE_BREAK);
        sb.append("    pspReference: ").append(Util.toIndentedString(pspReference)).append(TextConstants.LINE_BREAK);
        sb.append("    resultCode: ").append(Util.toIndentedString(resultCode)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }



}
