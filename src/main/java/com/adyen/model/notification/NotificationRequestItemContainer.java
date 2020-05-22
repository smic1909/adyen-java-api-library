/**
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
package com.adyen.model.notification;

import com.adyen.constants.TextConstants;
import com.adyen.util.Util;
import com.google.gson.annotations.SerializedName;

/**
 * Container for NotificationRequestItem
 */
public class NotificationRequestItemContainer {
    @SerializedName("NotificationRequestItem")
    private NotificationRequestItem notificationItem = null;

    public NotificationRequestItem getNotificationItem() {
        return notificationItem;
    }

    public void setNotificationItem(NotificationRequestItem notificationItem) {
        this.notificationItem = notificationItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationRequestItemContainer {").append(TextConstants.LINE_BREAK);

        sb.append("    notificationItem: ").append(Util.toIndentedString(notificationItem)).append(TextConstants.LINE_BREAK);
        sb.append("}");
        return sb.toString();
    }


}
