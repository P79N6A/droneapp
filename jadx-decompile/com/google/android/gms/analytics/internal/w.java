package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

public class w {
    private final Context a;
    private final Context b;

    public w(Context context) {
        d.a((Object) context);
        Object applicationContext = context.getApplicationContext();
        d.a(applicationContext, (Object) "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }

    public Context a() {
        return this.a;
    }

    protected ak a(v vVar) {
        return new ak(vVar);
    }

    protected p a(Context context) {
        return p.a(context);
    }

    public Context b() {
        return this.b;
    }

    protected aa b(v vVar) {
        return new aa(vVar);
    }

    protected a c(v vVar) {
        return new a(vVar);
    }

    protected ad d(v vVar) {
        return new ad(vVar);
    }

    protected q e(v vVar) {
        return new q(vVar);
    }

    protected g f(v vVar) {
        return new g(vVar);
    }

    protected ah g(v vVar) {
        return new ah(vVar);
    }

    protected e h(v vVar) {
        return h.d();
    }

    protected c i(v vVar) {
        return new c(vVar);
    }

    ab j(v vVar) {
        return new ab(vVar, this);
    }

    h k(v vVar) {
        return new h(vVar);
    }

    protected r l(v vVar) {
        return new r(vVar, this);
    }

    public z m(v vVar) {
        return new z(vVar);
    }

    public i n(v vVar) {
        return new i(vVar);
    }

    public y o(v vVar) {
        return new y(vVar);
    }

    public al p(v vVar) {
        return new al(vVar);
    }

    public j q(v vVar) {
        return new j(vVar);
    }
}
