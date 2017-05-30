package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

public class s {
    private final v a;

    protected s(v vVar) {
        d.a((Object) vVar);
        this.a = vVar;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
        } else {
            return obj == Boolean.TRUE ? "true" : "false";
        }
    }

    private void a(int i, String str, Object obj, Object obj2, Object obj3) {
        g gVar = null;
        if (this.a != null) {
            gVar = this.a.g();
        }
        if (gVar != null) {
            gVar.a(i, str, obj, obj2, obj3);
            return;
        }
        String str2 = (String) ao.c.a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, c(str, obj, obj2, obj3));
        }
    }

    protected static String c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = a(obj);
        Object a2 = a(obj2);
        Object a3 = a(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str2);
            stringBuilder.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str2);
            stringBuilder.append(a3);
            str2 = ", ";
        }
        return stringBuilder.toString();
    }

    protected ak A() {
        return this.a.r();
    }

    public boolean B() {
        return Log.isLoggable((String) ao.c.a(), 2);
    }

    public void a(String str, Object obj) {
        a(2, str, obj, null, null);
    }

    public void a(String str, Object obj, Object obj2) {
        a(2, str, obj, obj2, null);
    }

    public void a(String str, Object obj, Object obj2, Object obj3) {
        a(3, str, obj, obj2, obj3);
    }

    public void b(String str, Object obj) {
        a(3, str, obj, null, null);
    }

    public void b(String str, Object obj, Object obj2) {
        a(3, str, obj, obj2, null);
    }

    public void b(String str, Object obj, Object obj2, Object obj3) {
        a(5, str, obj, obj2, obj3);
    }

    public void c(String str, Object obj) {
        a(4, str, obj, null, null);
    }

    public void c(String str, Object obj, Object obj2) {
        a(5, str, obj, obj2, null);
    }

    public void d(String str, Object obj) {
        a(5, str, obj, null, null);
    }

    public void d(String str, Object obj, Object obj2) {
        a(6, str, obj, obj2, null);
    }

    public void e(String str, Object obj) {
        a(6, str, obj, null, null);
    }

    public v k() {
        return this.a;
    }

    protected void l() {
        if (q().a()) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }

    protected void m() {
        this.a.s();
    }

    protected e n() {
        return this.a.d();
    }

    protected Context o() {
        return this.a.b();
    }

    protected g p() {
        return this.a.f();
    }

    protected ah q() {
        return this.a.e();
    }

    public void q(String str) {
        a(2, str, null, null, null);
    }

    protected p r() {
        return this.a.h();
    }

    public void r(String str) {
        a(3, str, null, null, null);
    }

    public c s() {
        return this.a.k();
    }

    public void s(String str) {
        a(4, str, null, null, null);
    }

    protected r t() {
        return this.a.i();
    }

    public void t(String str) {
        a(5, str, null, null, null);
    }

    protected al u() {
        return this.a.j();
    }

    public void u(String str) {
        a(6, str, null, null, null);
    }

    protected q v() {
        return this.a.l();
    }

    protected j w() {
        return this.a.m();
    }

    protected ad x() {
        return this.a.p();
    }

    protected a y() {
        return this.a.o();
    }

    protected aa z() {
        return this.a.q();
    }
}
