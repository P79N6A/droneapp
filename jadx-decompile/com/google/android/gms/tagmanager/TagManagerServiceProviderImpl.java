package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.apf;
import com.google.android.gms.internal.apy;
import com.google.android.gms.tagmanager.al.a;

@DynamiteApi
public class TagManagerServiceProviderImpl extends a {
    private static volatile apy a;

    public apf getService(e eVar, aj ajVar, af afVar) {
        apf com_google_android_gms_internal_apf = a;
        if (com_google_android_gms_internal_apf == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                com_google_android_gms_internal_apf = a;
                if (com_google_android_gms_internal_apf == null) {
                    apy com_google_android_gms_internal_apy = new apy((Context) f.a(eVar), ajVar, afVar);
                    a = com_google_android_gms_internal_apy;
                    com_google_android_gms_internal_apf = com_google_android_gms_internal_apy;
                }
            }
        }
        return com_google_android_gms_internal_apf;
    }
}
