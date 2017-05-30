package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.cast.internal.h;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.agu;
import com.google.android.gms.internal.agv;

public final class d {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final com.google.android.gms.common.api.a<a> d = new com.google.android.gms.common.api.a("CastRemoteDisplay.API", f, l.b);
    public static final e e = new agu(d);
    private static final com.google.android.gms.common.api.a.b<agv, a> f = new com.google.android.gms.common.api.a.b<agv, a>() {
        public agv a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("configuration", aVar.c);
            return new agv(context, looper, sVar, aVar.a, bundle, aVar.b, bVar, cVar);
        }
    };

    public interface b {
        void a(Status status);
    }

    public static final class a implements com.google.android.gms.common.api.a.a.a {
        final CastDevice a;
        final b b;
        final int c;

        public static final class a {
            CastDevice a;
            b b;
            int c = 2;

            public a(CastDevice castDevice, b bVar) {
                com.google.android.gms.common.internal.d.a((Object) castDevice, (Object) "CastDevice parameter cannot be null");
                this.a = castDevice;
                this.b = bVar;
            }

            public a a(@d int i) {
                this.c = i;
                return this;
            }

            public a a() {
                return new a();
            }
        }

        private a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    public interface c extends m {
        Display b();
    }

    public @interface d {
    }

    private d() {
    }

    public static final boolean a(Context context) {
        h.a(context);
        return ((Boolean) h.a.c()).booleanValue();
    }
}
