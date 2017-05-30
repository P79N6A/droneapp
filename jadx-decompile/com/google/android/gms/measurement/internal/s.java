package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.e;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class s extends b {
    private long a;
    private String b;
    private Boolean c;

    s(aj ajVar) {
        super(ajVar);
    }

    public String A() {
        c();
        return this.b;
    }

    public boolean a(Context context) {
        if (this.c == null) {
            if (y().N()) {
                this.c = Boolean.valueOf(true);
            } else {
                this.c = Boolean.valueOf(false);
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        packageManager.getPackageInfo("com.google.android.gms", 128);
                        this.c = Boolean.valueOf(true);
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return this.c.booleanValue();
    }

    protected void e() {
        Calendar instance = Calendar.getInstance();
        this.a = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String valueOf = String.valueOf(locale.getLanguage().toLowerCase(Locale.ENGLISH));
        String valueOf2 = String.valueOf(locale.getCountry().toLowerCase(Locale.ENGLISH));
        this.b = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(valueOf2).toString();
    }

    public String f() {
        c();
        return Build.MODEL;
    }

    public String g() {
        c();
        return VERSION.RELEASE;
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

    public long z() {
        c();
        return this.a;
    }
}
