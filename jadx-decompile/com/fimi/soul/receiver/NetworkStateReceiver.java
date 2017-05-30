package com.fimi.soul.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;

public abstract class NetworkStateReceiver extends BroadcastReceiver {
    public static final String a = "android.net.conn.CONNECTIVITY_CHANGE";

    public enum a {
        Wifi,
        Mobile,
        None
    }

    private boolean a(State state) {
        return state != null && State.CONNECTED == state;
    }

    public abstract void a(a aVar, Context context);

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            State state = connectivityManager.getNetworkInfo(1).getState();
            if (connectivityManager.getNetworkInfo(0) != null) {
                State state2 = connectivityManager.getNetworkInfo(0).getState();
                if (a(state)) {
                    a(a.Wifi, context);
                } else if (a(state2)) {
                    a(a.Mobile, context);
                } else {
                    a(a.None, context);
                }
            }
        }
    }
}
