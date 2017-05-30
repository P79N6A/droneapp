package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.ai.a;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;

@aaa
public class k extends a {
    private ag a;
    private vf b;
    private vg c;
    private SimpleArrayMap<String, vh> d = new SimpleArrayMap();
    private SimpleArrayMap<String, vi> e = new SimpleArrayMap();
    private NativeAdOptionsParcel f;
    private ao g;
    private final Context h;
    private final xq i;
    private final String j;
    private final VersionInfoParcel k;
    private final d l;

    public k(Context context, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        this.h = context;
        this.j = str;
        this.i = xqVar;
        this.k = versionInfoParcel;
        this.l = dVar;
    }

    public ah a() {
        return new j(this.h, this.j, this.i, this.k, this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.l);
    }

    public void a(ag agVar) {
        this.a = agVar;
    }

    public void a(ao aoVar) {
        this.g = aoVar;
    }

    public void a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        this.f = nativeAdOptionsParcel;
    }

    public void a(vf vfVar) {
        this.b = vfVar;
    }

    public void a(vg vgVar) {
        this.c = vgVar;
    }

    public void a(String str, vi viVar, vh vhVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.e.put(str, viVar);
        this.d.put(str, vhVar);
    }
}
