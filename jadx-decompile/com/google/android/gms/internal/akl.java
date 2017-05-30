package com.google.android.gms.internal;

import com.google.android.gms.internal.akm.a;
import java.util.concurrent.TimeUnit;

public class akl {
    public static <DP, DT> String a(DP dp, akg<DP, DT> com_google_android_gms_internal_akg_DP__DT) {
        aki a = com_google_android_gms_internal_akg_DP__DT.a();
        if (!a.a(com_google_android_gms_internal_akg_DP__DT.b(dp))) {
            return null;
        }
        Object a2 = com_google_android_gms_internal_akg_DP__DT.a(dp);
        for (int i = 0; i < a.a(a2); i++) {
            String c = a.c(a2, i);
            if (com_google_android_gms_internal_akg_DP__DT.c(dp, i)) {
                double a3 = (double) a.a(a2, i);
                if (a3 == 1.0d) {
                    a3 = (double) com_google_android_gms_internal_akg_DP__DT.b(dp, i);
                } else if (a3 == 2.0d) {
                    a3 = com_google_android_gms_internal_akg_DP__DT.a((Object) dp, i);
                } else {
                    continue;
                }
                a a4 = akm.a().a(c);
                if (a4 != null && !a4.a(a3)) {
                    return "Field out of range";
                }
                a a5 = akm.a().a(a.b(a2), c);
                if (a5 != null) {
                    long a6 = com_google_android_gms_internal_akg_DP__DT.a((Object) dp, TimeUnit.NANOSECONDS);
                    if (a6 == 0) {
                        return a3 == 0.0d ? null : "DataPoint out of range";
                    } else {
                        if (!a5.a(a3 / ((double) a6))) {
                            return "DataPoint out of range";
                        }
                    }
                } else {
                    continue;
                }
            } else if (!(a.b(a2, i) || akm.a.contains(c))) {
                return String.valueOf(c).concat(" not set");
            }
        }
        return null;
    }
}
