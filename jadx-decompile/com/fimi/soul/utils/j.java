package com.fimi.soul.utils;

import android.os.Environment;

public class j {
    public static String a() {
        return Environment.getExternalStorageDirectory().getPath() + "/MiDroneEn/";
    }

    public static String a(String str) {
        return b(n(), str);
    }

    public static String a(String str, String str2) {
        return n() + "THUMB_VIDEO_" + (str2 != null ? str2.replaceAll(" ", "") : "") + "_" + str.substring(0, str.lastIndexOf(".")) + ".jpg";
    }

    public static String b() {
        return a() + "/Parameters/";
    }

    public static String b(String str) {
        return b(o(), str);
    }

    private static String b(String str, String str2) {
        return String.format("%s%s", new Object[]{str, str2});
    }

    public static String c() {
        return a() + "/Waypoints/";
    }

    public static String d() {
        return a() + "/GCP/";
    }

    public static String e() {
        return a() + "/Logs/";
    }

    public static String f() {
        return a() + "/Maps/";
    }

    public static String g() {
        return a() + "/CameraInfo/";
    }

    public static String h() {
        return a() + "/LogCat/";
    }

    public static String i() {
        return a() + "/update/";
    }

    public static String j() {
        return a() + "/wifi/";
    }

    public static String k() {
        return a() + "/ErrorCode/";
    }

    public static String l() {
        return a() + "PlaneMedia/";
    }

    public static String m() {
        return a() + "LOGDOWN/";
    }

    public static String n() {
        return l() + "cache/";
    }

    public static String o() {
        return Environment.getExternalStorageDirectory().getPath() + "/DCIM/" + "MiDrone/";
    }

    public static String p() {
        return a() + "/firmware/";
    }

    public static String q() {
        return a() + "/CameraCmdLog/log.txt";
    }
}
