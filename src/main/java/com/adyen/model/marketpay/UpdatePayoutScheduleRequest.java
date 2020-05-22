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

import java.util.Objects;

/**
 * UpdatePayoutScheduleRequest
 */
public class UpdatePayoutScheduleRequest {
    /**
     * schedule interval
     */
    public enum ScheduleEnum {
        @SerializedName("DAILY")
        DAILY("DAILY"),

        @SerializedName("DEFAULT")
        DEFAULT("DEFAULT"),

        @SerializedName("HOLD")
        HOLD("HOLD"),

        @SerializedName("MONTHLY")
        MONTHLY("MONTHLY"),

        @SerializedName("WEEKLY")
        WEEKLY("WEEKLY");

        private String value;

        ScheduleEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @SerializedName("schedule")
    private ScheduleEnum schedule = null;

    @SerializedName("reason")
    private String reason = null;

    /**
     * behavior for the current payout period (relevant if the schedule already exists)
     */
    public enum ActionEnum {
        @SerializedName("CLOSE")
        CLOSE("CLOSE"),

        @SerializedName("NOTHING")
        NOTHING("NOTHING"),

        @SerializedName("UPDATE")
        UPDATE("UPDATE");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @SerializedName("action")
    private ActionEnum action = null;

    public UpdatePayoutScheduleRequest schedule(ScheduleEnum schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * schedule interval
     *
     * @return schedule
     **/
    public ScheduleEnum getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleEnum schedule) {
        this.schedule = schedule;
    }

    public UpdatePayoutScheduleRequest reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * reason of updating the schedule
     *
     * @return reason
     **/
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UpdatePayoutScheduleRequest action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * behavior for the current payout period (relevant if the schedule already exists)
     *
     * @return action
     **/
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o) || getClass() != o.getClass()) {
            return false;
        }
        UpdatePayoutScheduleRequest updatePayoutScheduleRequest = (UpdatePayoutScheduleRequest) o;
        return Objects.equals(this.schedule, updatePayoutScheduleRequest.schedule) && Objects.equals(this.reason, updatePayoutScheduleRequest.reason) && Objects.equals(this.action,
                                                                                                                                                                        updatePayoutScheduleRequest.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, reason, action);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePayoutScheduleRequest {").append(TextConstants.LINE_BREAK);

        sb.append("    schedule: ").append(Util.toIndentedString(schedule)).append(TextConstants.LINE_BREAK);
        sb.append("    reason: ").append(Util.toIndentedString(reason)).append(TextConstants.LINE_BREAK);
        sb.append("    action: ").append(Util.toIndentedString(action)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }

}

