package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.AppMeasurement;
import com.xiaomi.mipush.sdk.Constants;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class ab extends b {
    private final String a = y().a();
    private final char b;
    private final long c = y().M();
    private final a d;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final a k;
    private final a l;

    public class a {
        final /* synthetic */ ab a;
        private final int b;
        private final boolean c;
        private final boolean d;

        a(ab abVar, int i, boolean z, boolean z2) {
            this.a = abVar;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public void a(String str) {
            this.a.a(this.b, this.c, this.d, str, null, null, null);
        }

        public void a(String str, Object obj) {
            this.a.a(this.b, this.c, this.d, str, obj, null, null);
        }

        public void a(String str, Object obj, Object obj2) {
            this.a.a(this.b, this.c, this.d, str, obj, obj2, null);
        }

        public void a(String str, Object obj, Object obj2, Object obj3) {
            this.a.a(this.b, this.c, this.d, str, obj, obj2, obj3);
        }
    }

    ab(aj ajVar) {
        super(ajVar);
        if (y().O()) {
            this.b = y().N() ? 'P' : 'C';
        } else {
            this.b = y().N() ? 'p' : 'c';
        }
        this.d = new a(this, 6, false, false);
        this.e = new a(this, 6, true, false);
        this.f = new a(this, 6, false, true);
        this.g = new a(this, 5, false, false);
        this.h = new a(this, 5, true, false);
        this.i = new a(this, 5, false, true);
        this.j = new a(this, 4, false, false);
        this.k = new a(this, 3, false, false);
        this.l = new a(this, 2, false, false);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    static String a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf((long) ((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (!z) {
                return String.valueOf(valueOf);
            }
            if (Math.abs(((Long) valueOf).longValue()) < 100) {
                return String.valueOf(valueOf);
            }
            String str = String.valueOf(valueOf).charAt(0) == SignatureVisitor.SUPER ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
            String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
            return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 1.0d)).toString();
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (!(valueOf instanceof Throwable)) {
                return z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : String.valueOf(valueOf);
            } else {
                Throwable th = (Throwable) valueOf;
                StringBuilder stringBuilder = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String a = a(AppMeasurement.class.getCanonicalName());
                String a2 = a(aj.class.getCanonicalName());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = a(className);
                            if (className.equals(a) || className.equals(a2)) {
                                stringBuilder.append(": ");
                                stringBuilder.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = a(z, obj);
        Object a2 = a(z, obj2);
        Object a3 = a(z, obj3);
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
        }
        return stringBuilder.toString();
    }

    public a A() {
        return this.h;
    }

    public a B() {
        return this.i;
    }

    public a C() {
        return this.j;
    }

    public a D() {
        return this.k;
    }

    public a E() {
        return this.l;
    }

    public String F() {
        Pair a = x().b.a();
        if (a == null || a == af.a) {
            return null;
        }
        String valueOf = String.valueOf(String.valueOf(a.second));
        String str = (String) a.first;
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    protected void a(int i, String str) {
        Log.println(i, this.a, str);
    }

    public void a(int i, String str, Object obj, Object obj2, Object obj3) {
        d.a(str);
        ai k = this.n.k();
        if (k == null) {
            a(6, "Scheduler not set. Not logging error/warn.");
        } else if (!k.a()) {
            a(6, "Scheduler not initialized. Not logging error/warn.");
        } else if (k.b()) {
            a(6, "Scheduler shutdown. Not logging error/warn.");
        } else {
            if (i < 0) {
                i = 0;
            }
            if (i >= "01VDIWEA?".length()) {
                i = "01VDIWEA?".length() - 1;
            }
            String valueOf = String.valueOf("1");
            char charAt = "01VDIWEA?".charAt(i);
            char c = this.b;
            long j = this.c;
            String valueOf2 = String.valueOf(a(true, str, obj, obj2, obj3));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append(valueOf).append(charAt).append(c).append(j).append(":").append(valueOf2).toString();
            if (valueOf.length() > 1024) {
                valueOf = str.substring(0, 1024);
            }
            k.a(new Runnable(this) {
                final /* synthetic */ ab b;

                public void run() {
                    af e = this.b.n.e();
                    if (!e.a() || e.b()) {
                        this.b.a(6, "Persisted config not initialized . Not logging error/warn.");
                    } else {
                        e.b.a(valueOf);
                    }
                }
            });
        }
    }

    protected void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            a(i, str, obj, obj2, obj3);
        }
    }

    protected boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    protected void e() {
    }

    public a f() {
        return this.d;
    }

    public a g() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }

    public a z() {
        return this.g;
    }
}
