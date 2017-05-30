package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ap.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.uf;

@aaa
public class o extends a {
    private static final Object b = new Object();
    @Nullable
    private static o c;
    private final Context a;
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private float g = -1.0f;
    private VersionInfoParcel h;

    o(Context context, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.h = versionInfoParcel;
        this.e = false;
    }

    public static o a(Context context, VersionInfoParcel versionInfoParcel) {
        o oVar;
        synchronized (b) {
            if (c == null) {
                c = new o(context.getApplicationContext(), versionInfoParcel);
            }
            oVar = c;
        }
        return oVar;
    }

    @Nullable
    public static o b() {
        o oVar;
        synchronized (b) {
            oVar = c;
        }
        return oVar;
    }

    public void a() {
        synchronized (b) {
            if (this.e) {
                b.d("Mobile ads is initialized already.");
                return;
            }
            this.e = true;
            u.i().a(this.a, this.h);
            u.j().a(this.a);
        }
    }

    public void a(float f) {
        synchronized (this.d) {
            this.g = f;
        }
    }

    public void a(e eVar, String str) {
        aby b = b(eVar, str);
        if (b == null) {
            b.b("Context is null. Failed to open debug menu.");
        } else {
            b.a();
        }
    }

    public void a(String str) {
        uf.a(this.a);
        if (!TextUtils.isEmpty(str) && ((Boolean) uf.cd.c()).booleanValue()) {
            u.A().a(this.a, this.h, true, null, str, null);
        }
    }

    public void a(boolean z) {
        synchronized (this.d) {
            this.f = z;
        }
    }

    @Nullable
    protected aby b(e eVar, String str) {
        if (eVar == null) {
            return null;
        }
        Context context = (Context) f.a(eVar);
        if (context == null) {
            return null;
        }
        aby com_google_android_gms_internal_aby = new aby(context);
        com_google_android_gms_internal_aby.a(str);
        return com_google_android_gms_internal_aby;
    }

    public float c() {
        float f;
        synchronized (this.d) {
            f = this.g;
        }
        return f;
    }

    public boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.g >= 0.0f;
        }
        return z;
    }

    public boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }
}
