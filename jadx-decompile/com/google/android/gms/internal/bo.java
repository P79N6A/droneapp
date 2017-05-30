package com.google.android.gms.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.d;

public class bo implements aqe {
    private final Context a;

    public bo(Context context) {
        this.a = (Context) d.a(context);
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        ea eaVar = ee.e;
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                return new ej(networkOperatorName);
            }
        }
        return eaVar;
    }
}
