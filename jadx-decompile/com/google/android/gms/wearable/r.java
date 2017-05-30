package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.wearable.internal.aa;
import com.google.android.gms.wearable.internal.ad;
import com.google.android.gms.wearable.internal.ao;
import com.google.android.gms.wearable.internal.ar;
import com.google.android.gms.wearable.internal.at;
import com.google.android.gms.wearable.internal.aw;
import com.google.android.gms.wearable.internal.ay;
import com.google.android.gms.wearable.internal.bb;
import com.google.android.gms.wearable.internal.bd;
import com.google.android.gms.wearable.internal.bo;
import com.google.android.gms.wearable.internal.bp;

public class r {
    public static final e a = new bp();
    public static final a b = new bb();
    public static final m c = new aa();
    public static final p d = new ad();
    public static final c e = new bd();
    public static final v f = new ay();
    public static final t g = new aw();
    public static final y h = new bo();
    public static final ab i = new ao();
    public static final ac j = new at();
    public static final g<ar> k = new g();
    public static final com.google.android.gms.common.api.a<a> l = new com.google.android.gms.common.api.a("Wearable.API", m, k);
    private static final b<ar, a> m = new b<ar, a>() {
        public ar a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
            if (aVar == null) {
                a aVar2 = new a(new a());
            }
            return new ar(context, looper, bVar, cVar, sVar);
        }
    };

    public static final class a implements d {

        public static class a {
            public a a() {
                return new a();
            }
        }

        private a(a aVar) {
        }
    }

    private r() {
    }
}
