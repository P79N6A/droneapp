package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

class wv$1 implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ VersionInfoParcel b;
    final /* synthetic */ wv$a c;
    final /* synthetic */ ro d;
    final /* synthetic */ d e;
    final /* synthetic */ String f;
    final /* synthetic */ wv g;

    wv$1(wv wvVar, Context context, VersionInfoParcel versionInfoParcel, wv$a com_google_android_gms_internal_wv_a, ro roVar, d dVar, String str) {
        this.g = wvVar;
        this.a = context;
        this.b = versionInfoParcel;
        this.c = com_google_android_gms_internal_wv_a;
        this.d = roVar;
        this.e = dVar;
        this.f = str;
    }

    public void run() {
        wv.a(this.g, this.a, this.b, this.c, this.d, this.e).b(this.f);
    }
}
