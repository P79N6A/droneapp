package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.client.i;

public class g {

    public static final class a {
        private final i a = new i();

        @Deprecated
        public a a(String str) {
            this.a.a(str);
            return this;
        }

        @Deprecated
        public a a(boolean z) {
            this.a.a(z);
            return this;
        }

        @Deprecated
        public String a() {
            return this.a.a();
        }

        @Deprecated
        public boolean b() {
            return this.a.b();
        }

        i c() {
            return this.a;
        }
    }

    private g() {
    }

    public static void a(float f) {
        h.a().a(f);
    }

    @Deprecated
    public static void a(Context context) {
        a(context, null, null);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void a(Context context, String str) {
        a(context, str, null);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    public static void a(Context context, String str, a aVar) {
        h.a().a(context, str, aVar == null ? null : aVar.c());
    }

    public static void a(boolean z) {
        h.a().a(z);
    }

    public static b b(Context context) {
        return h.a().a(context);
    }

    public static void b(Context context, String str) {
        h.a().a(context, str);
    }
}
