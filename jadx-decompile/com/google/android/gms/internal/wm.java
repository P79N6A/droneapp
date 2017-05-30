package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@aaa
public class wm {
    private final Context a;
    private final xq b;
    private final VersionInfoParcel c;
    private final d d;

    wm(Context context, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        this.a = context;
        this.b = xqVar;
        this.c = versionInfoParcel;
        this.d = dVar;
    }

    public Context a() {
        return this.a.getApplicationContext();
    }

    public l a(String str) {
        return new l(this.a, new AdSizeParcel(), str, this.b, this.c, this.d);
    }

    public l b(String str) {
        return new l(this.a.getApplicationContext(), new AdSizeParcel(), str, this.b, this.c, this.d);
    }

    public wm b() {
        return new wm(a(), this.b, this.c, this.d);
    }
}
