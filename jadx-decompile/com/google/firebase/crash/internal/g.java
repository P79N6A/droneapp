package com.google.firebase.crash.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.akb;

public class g {
    private static g b;
    private akb a;

    public static class a extends Exception {
        private a(Throwable th) {
            super(th);
        }
    }

    private g() {
    }

    public static g a() {
        g gVar;
        synchronized (g.class) {
            if (b != null) {
                gVar = b;
            } else {
                b = new g();
                gVar = b;
            }
        }
        return gVar;
    }

    public void a(Context context) {
        synchronized (g.class) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = akb.a(context, akb.c, "com.google.android.gms.crash");
            } catch (Throwable e) {
                throw new a(e);
            }
        }
    }

    public d b() {
        d.a(this.a);
        try {
            return com.google.firebase.crash.internal.d.a.a(this.a.a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"));
        } catch (Throwable e) {
            throw new a(e);
        }
    }

    public e c() {
        d.a(this.a);
        try {
            return com.google.firebase.crash.internal.e.a.a(this.a.a("com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"));
        } catch (Throwable e) {
            throw new a(e);
        }
    }

    public f d() {
        d.a(this.a);
        try {
            return com.google.firebase.crash.internal.f.a.a(this.a.a("com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"));
        } catch (Throwable e) {
            throw new a(e);
        }
    }
}
