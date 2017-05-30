package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.uf;

@aaa
public final class c {

    public interface a {
        void a(AdResponseParcel adResponseParcel);
    }

    interface b {
        boolean a(VersionInfoParcel versionInfoParcel);
    }

    class AnonymousClass1 implements b {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public boolean a(VersionInfoParcel versionInfoParcel) {
            return versionInfoParcel.e || (i.b(this.a) && !((Boolean) uf.I.c()).booleanValue());
        }
    }

    public static abx a(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, a aVar) {
        return a(context, versionInfoParcel, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar, new AnonymousClass1(context));
    }

    static abx a(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, a aVar, b bVar) {
        return bVar.a(versionInfoParcel) ? a(context, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar) : b(context, versionInfoParcel, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar);
    }

    private static abx a(Context context, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, a aVar) {
        com.google.android.gms.ads.internal.util.client.b.a("Fetching ad response from local ad request service.");
        abx aVar2 = new com.google.android.gms.ads.internal.request.d.a(context, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar);
        Void voidR = (Void) aVar2.e();
        return aVar2;
    }

    private static abx b(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, a aVar) {
        com.google.android.gms.ads.internal.util.client.b.a("Fetching ad response from remote ad request service.");
        if (ac.a().b(context)) {
            return new com.google.android.gms.ads.internal.request.d.b(context, versionInfoParcel, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, aVar);
        }
        com.google.android.gms.ads.internal.util.client.b.d("Failed to connect to remote ad request service.");
        return null;
    }
}
