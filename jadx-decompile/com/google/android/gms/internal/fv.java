package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.gb.a;

public class fv extends w<ga> implements fu {
    private static ajl a = new ajl("FirebaseAuth", "FirebaseAuth:");
    private final Context e;
    private final a f;

    public fv(Context context, Looper looper, s sVar, a aVar, b bVar, c cVar) {
        super(context, looper, 112, sVar, bVar, cVar);
        this.e = (Context) d.a(context);
        this.f = aVar;
    }

    protected ga a(IBinder iBinder) {
        return ga.a.a(iBinder);
    }

    protected String a() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    protected Bundle c() {
        Bundle c = super.c();
        if (c == null) {
            c = new Bundle();
        }
        if (this.f != null) {
            c.putString("com.google.firebase.auth.API_KEY", this.f.a());
        }
        return c;
    }

    public /* synthetic */ ga o_() {
        return (ga) super.G();
    }

    public boolean w() {
        return akb.a(this.e, "com.google.firebase.auth") == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String y() {
        /*
        r4 = this;
        r2 = -1;
        r1 = 0;
        r0 = "firebear.preference";
        r0 = com.google.android.gms.internal.gh.a(r0);
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 == 0) goto L_0x0010;
    L_0x000e:
        r0 = "default";
    L_0x0010:
        r3 = r0.hashCode();
        switch(r3) {
            case 103145323: goto L_0x004f;
            case 1544803905: goto L_0x0059;
            default: goto L_0x0017;
        };
    L_0x0017:
        r3 = r2;
    L_0x0018:
        switch(r3) {
            case 0: goto L_0x001d;
            case 1: goto L_0x001d;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = "default";
    L_0x001d:
        r3 = r0.hashCode();
        switch(r3) {
            case 103145323: goto L_0x0063;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r2;
    L_0x0025:
        switch(r0) {
            case 0: goto L_0x006d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r0 = a;
        r2 = "Loading module via default loading order.";
        r3 = new java.lang.Object[r1];
        r0.a(r2, r3);
        r0 = r4.e;
        r2 = "com.google.firebase.auth";
        r0 = com.google.android.gms.internal.akb.a(r0, r2);
        r2 = r4.e;
        r3 = "com.google.android.gms.firebase_auth";
        r2 = com.google.android.gms.internal.akb.b(r2, r3);
        if (r2 < r0) goto L_0x007d;
    L_0x0043:
        r0 = a;
        r2 = "Loading remote module.";
        r1 = new java.lang.Object[r1];
        r0.a(r2, r1);
        r0 = "com.google.android.gms";
    L_0x004e:
        return r0;
    L_0x004f:
        r3 = "local";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0017;
    L_0x0057:
        r3 = r1;
        goto L_0x0018;
    L_0x0059:
        r3 = "default";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0017;
    L_0x0061:
        r3 = 1;
        goto L_0x0018;
    L_0x0063:
        r3 = "local";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0024;
    L_0x006b:
        r0 = r1;
        goto L_0x0025;
    L_0x006d:
        r0 = a;
        r2 = "Loading fallback module override.";
        r1 = new java.lang.Object[r1];
        r0.a(r2, r1);
        r0 = r4.e;
        r0 = r0.getPackageName();
        goto L_0x004e;
    L_0x007d:
        r0 = a;
        r2 = "Loading fallback module.";
        r1 = new java.lang.Object[r1];
        r0.a(r2, r1);
        r0 = r4.e;
        r0 = r0.getPackageName();
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fv.y():java.lang.String");
    }
}
