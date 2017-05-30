package com.fimi.kernel.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.List;

public class q {
    public static ScanResult a(Context context, String str) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!wifiManager.startScan()) {
            a(context, str);
        }
        List scanResults = wifiManager.getScanResults();
        if (scanResults == null) {
            return null;
        }
        ScanResult scanResult = null;
        for (int i = 0; i < scanResults.size(); i++) {
            scanResult = (ScanResult) scanResults.get(i);
            if (scanResult.BSSID.equals(str)) {
                return scanResult;
            }
        }
        return scanResult;
    }

    public static void a(Context context, boolean z) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (z) {
            wifiManager.setWifiEnabled(true);
        } else {
            wifiManager.setWifiEnabled(false);
        }
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().getState() == State.CONNECTED) || ((TelephonyManager) context.getSystemService("phone")).getNetworkType() == 3;
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public static List<ScanResult> c(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager.startScan()) {
            return wifiManager.getScanResults();
        }
        c(context);
        return null;
    }

    public static WifiInfo d(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
    }
}
