package com.google.firebase;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(24)
class b$c extends BroadcastReceiver {
    private static AtomicReference<b$c> a = new AtomicReference();
    private final Context b;

    public b$c(Context context) {
        this.b = context;
    }

    private static void b(Context context) {
        if (a.get() == null) {
            BroadcastReceiver com_google_firebase_b_c = new b$c(context);
            if (a.compareAndSet(null, com_google_firebase_b_c)) {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_UNLOCKED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(com_google_firebase_b_c, intentFilter);
            }
        }
    }

    public void a() {
        this.b.unregisterReceiver(this);
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (b.g()) {
            for (b a : b.b.values()) {
                b.a(a);
            }
        }
        a();
    }
}
