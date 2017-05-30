package com.google.firebase.crash.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;

public class a {
    static AppMeasurement a;
    private final Context b;

    public a(Context context) {
        this.b = context;
    }

    private void a(Bundle bundle) {
        AppMeasurement instance;
        if (null == null) {
            try {
                instance = AppMeasurement.getInstance(this.b);
            } catch (NoClassDefFoundError e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseCrashAnalytics", new StringBuilder(String.valueOf(valueOf).length() + 50).append("Unable to log event, missing measurement library: ").append(valueOf).toString());
                return;
            }
        }
        instance = a;
        instance.a("crash", "_ae", bundle);
    }

    public void a(boolean z, long j) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("fatal", 1);
        } else {
            bundle.putInt("fatal", 0);
        }
        bundle.putLong("timestamp", j);
        a(bundle);
    }
}
