package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;

public final class gb {
    public static final g<fu> a = new g();
    public static final com.google.android.gms.common.api.a<a> b = new com.google.android.gms.common.api.a("InternalFirebaseAuth.FIREBASE_AUTH_API", c, a);
    private static final b<fu, a> c = new b<fu, a>() {
        public fu a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return new fv(context, looper, sVar, aVar, bVar, cVar);
        }
    };

    public static final class a implements com.google.android.gms.common.api.a.a.a {
        private final String a;

        public static final class a {
            private String a;

            public a(@NonNull String str) {
                this.a = d.a(str);
            }

            public a a() {
                return new a(this.a);
            }
        }

        private a(@NonNull String str) {
            this.a = d.a(str, "A valid API key must be provided");
        }

        public String a() {
            return this.a;
        }
    }

    public static ft a(Context context, a aVar) {
        return new ft(context, aVar);
    }
}
