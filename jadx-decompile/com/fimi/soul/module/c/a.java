package com.fimi.soul.module.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class a {
    public static boolean a(Context context) {
        if (context != null) {
            for (NetworkInfo state : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
                if (state.getState() == State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }
}
