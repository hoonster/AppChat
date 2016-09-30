package com.hoonrah.appchat;

/**
 * Created by hlee on 9/29/16.
 */

public class Constants {
    private static final String ROOT_URL = "http://192.168.3.243/PushNotification/v1/";

    public static final String URL_ADD_USER = ROOT_URL + "adduser";
    public static final String URL_REGISTRATION_TOKEN = ROOT_URL + "addtoken/";

    public static final String SHARED_PREF = "gcmpushnotification";
    public static final String KEY_IS_USER_ADDED = "isuseradded";
    public static final String KEY_USER_EMAIL = "useremail";
    public static final String KEY_USER_NAME = "username";
}
