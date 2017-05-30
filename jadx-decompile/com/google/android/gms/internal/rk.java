package com.google.android.gms.internal;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public class rk extends CustomTabsServiceConnection {
    private WeakReference<rl> a;

    public rk(rl rlVar) {
        this.a = new WeakReference(rlVar);
    }

    public void a(ComponentName componentName) {
        rl rlVar = (rl) this.a.get();
        if (rlVar != null) {
            rlVar.a();
        }
    }

    public void a(ComponentName componentName, CustomTabsClient customTabsClient) {
        rl rlVar = (rl) this.a.get();
        if (rlVar != null) {
            rlVar.a(customTabsClient);
        }
    }
}
