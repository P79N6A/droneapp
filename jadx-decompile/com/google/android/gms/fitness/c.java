package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.ako;
import com.google.android.gms.internal.akp;
import com.google.android.gms.internal.akq;
import com.google.android.gms.internal.akr;
import com.google.android.gms.internal.aks;
import com.google.android.gms.internal.akt;
import com.google.android.gms.internal.aku;
import com.google.android.gms.internal.akv;
import com.google.android.gms.internal.als;
import com.google.android.gms.internal.alt;
import com.google.android.gms.internal.alu;
import com.google.android.gms.internal.alv;
import com.google.android.gms.internal.alw;
import com.google.android.gms.internal.alx;
import com.google.android.gms.internal.aly;
import com.google.android.gms.internal.alz;
import com.google.android.gms.internal.ama;
import com.google.android.gms.internal.amc;
import java.util.concurrent.TimeUnit;

public class c {
    public static final String A = "vnd.google.fitness.VIEW";
    public static final String B = "vnd.google.fitness.VIEW_GOAL";
    public static final String C = "vnd.google.fitness.start_time";
    public static final String D = "vnd.google.fitness.end_time";
    @Deprecated
    public static final Void a = null;
    public static final a<b> b = aku.e;
    public static final h c = new alz();
    public static final a<b> d = akt.e;
    public static final g e = new aly();
    public static final a<b> f = akv.e;
    public static final i g = new ama();
    public static final a<b> h = akr.e;
    public static final f i = new alw();
    public static final a<b> j = akq.e;
    public static final k k = new alv();
    public static final a<b> l = akp.e;
    public static final b m = new alu();
    public static final a<b> n = ako.e;
    public static final a o = a();
    public static final a<b> p = aks.e;
    public static final als q = new alx();
    public static final Scope r = new Scope(f.k);
    public static final Scope s = new Scope(f.l);
    public static final Scope t = new Scope(f.m);
    public static final Scope u = new Scope(f.n);
    public static final Scope v = new Scope(f.o);
    public static final Scope w = new Scope(f.p);
    public static final Scope x = new Scope(f.q);
    public static final Scope y = new Scope(f.r);
    public static final String z = "vnd.google.fitness.TRACK";

    private c() {
    }

    public static long a(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(C, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    private static a a() {
        return VERSION.SDK_INT >= 18 ? new alt() : new amc();
    }

    public static long b(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(D, -1);
        return longExtra == -1 ? -1 : timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }
}
