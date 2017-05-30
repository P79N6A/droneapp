package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.c.a;
import com.google.android.gms.ads.internal.client.d;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.f;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
import java.util.Map;

@aaa
public class add extends a {
    private final acy a;
    private final Object b = new Object();
    private final float c;
    private int d;
    private d e;
    private boolean f;
    private boolean g;
    private float h;
    private boolean i = true;
    private float j;

    public add(acy com_google_android_gms_internal_acy, float f) {
        this.a = com_google_android_gms_internal_acy;
        this.c = f;
    }

    private void a(int i, int i2) {
        u.e().a(new 2(this, i, i2));
    }

    private void a(String str) {
        a(str, null);
    }

    private void a(String str, @Nullable Map<String, String> map) {
        Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(AuthActivity.ACTION_KEY, str);
        u.e().a(new 1(this, hashMap));
    }

    public void a() {
        a("play");
    }

    public void a(float f, int i, boolean z, float f2) {
        int i2;
        synchronized (this.b) {
            this.h = f;
            this.g = z;
            i2 = this.d;
            this.d = i;
            this.j = f2;
        }
        a(i2, i);
    }

    public void a(d dVar) {
        synchronized (this.b) {
            this.e = dVar;
        }
    }

    public void a(boolean z) {
        a(z ? "mute" : "unmute");
    }

    public void b() {
        a("pause");
    }

    public void b(boolean z) {
        synchronized (this.b) {
            this.i = z;
        }
        a("initialState", f.c("muteStart", z ? "1" : "0"));
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.g;
        }
        return z;
    }

    public int d() {
        int i;
        synchronized (this.b) {
            i = this.d;
        }
        return i;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        float f;
        synchronized (this.b) {
            f = this.h;
        }
        return f;
    }

    public float g() {
        float f;
        synchronized (this.b) {
            f = this.j;
        }
        return f;
    }
}
