package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.drive.internal.br;
import com.google.android.gms.drive.internal.bt;
import com.google.android.gms.drive.internal.bw;
import com.google.android.gms.drive.internal.d;

public final class b {
    public static final g<bt> a = new g();
    public static final Scope b = new Scope(f.i);
    public static final Scope c = new Scope(f.j);
    public static final Scope d = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> f = new com.google.android.gms.common.api.a("Drive.API", new a<com.google.android.gms.common.api.a.a.b>() {
        protected Bundle a(com.google.android.gms.common.api.a.a.b bVar) {
            return new Bundle();
        }
    }, a);
    public static final com.google.android.gms.common.api.a<b> g = new com.google.android.gms.common.api.a("Drive.INTERNAL_API", new a<b>() {
        protected Bundle a(b bVar) {
            return bVar == null ? new Bundle() : bVar.a();
        }
    }, a);
    public static final c h = new br();
    public static final s i = new bw();
    public static final u j = new d();
    public static final g k = new com.google.android.gms.drive.internal.b();

    public static abstract class a<O extends com.google.android.gms.common.api.a.a> extends com.google.android.gms.common.api.a.b<bt, O> {
        protected abstract Bundle a(O o);

        public bt a(Context context, Looper looper, s sVar, O o, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return new bt(context, looper, sVar, bVar, cVar, a(o));
        }
    }

    public static class b implements com.google.android.gms.common.api.a.a.d {
        public Bundle a() {
            return null;
        }
    }

    private b() {
    }
}
