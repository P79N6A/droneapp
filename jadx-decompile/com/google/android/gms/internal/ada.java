package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@aaa
public class ada {
    public acy a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable ro roVar, VersionInfoParcel versionInfoParcel) {
        return a(context, adSizeParcel, z, z2, roVar, versionInfoParcel, null, null, null);
    }

    public acy a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable ro roVar, VersionInfoParcel versionInfoParcel, un unVar, s sVar, d dVar) {
        acy com_google_android_gms_internal_adb = new adb(adc.a(context, adSizeParcel, z, z2, roVar, versionInfoParcel, unVar, sVar, dVar));
        com_google_android_gms_internal_adb.setWebViewClient(u.g().a(com_google_android_gms_internal_adb, z2));
        com_google_android_gms_internal_adb.setWebChromeClient(u.g().c(com_google_android_gms_internal_adb));
        return com_google_android_gms_internal_adb;
    }
}
