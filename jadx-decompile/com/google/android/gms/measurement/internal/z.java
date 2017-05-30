package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aie;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class z extends b {
    private static final X500Principal a = new X500Principal("CN=Android Debug,O=Android,C=US");
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private long g;
    private String h;

    z(aj ajVar) {
        super(ajVar);
    }

    int A() {
        c();
        return this.d;
    }

    String B() {
        c();
        return this.e;
    }

    long C() {
        return y().M();
    }

    long D() {
        c();
        return this.g;
    }

    boolean E() {
        try {
            PackageInfo packageInfo = q().getPackageManager().getPackageInfo(q().getPackageName(), 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(a);
            }
        } catch (CertificateException e) {
            w().f().a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            w().f().a("Package name not found", e2);
        }
        return true;
    }

    AppMetadata a(String str) {
        return new AppMetadata(f(), g(), z(), (long) A(), B(), C(), D(), str, this.n.E(), !x().m, x().g());
    }

    protected void a(Status status) {
        if (status == null) {
            w().f().a("GoogleService failed to initialize (no status)");
        } else {
            w().f().a("GoogleService failed to initialize, status", Integer.valueOf(status.i()), status.c());
        }
    }

    protected void e() {
        String str = "unknown";
        String str2 = "Unknown";
        int i = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String packageName = q().getPackageName();
        PackageManager packageManager = q().getPackageManager();
        if (packageManager == null) {
            w().f().a("PackageManager is null, app identity information might be inaccurate");
        } else {
            str = packageManager.getInstallerPackageName(packageName);
            if (str == null) {
                str = "manual_install";
            } else if ("com.android.vending".equals(str)) {
                str = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(q().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        str3 = applicationLabel.toString();
                    }
                    str2 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (NameNotFoundException e) {
                w().f().a("Error retrieving package info: appName", str3);
            }
        }
        this.b = packageName;
        this.e = str;
        this.c = str2;
        this.d = i;
        this.f = str3;
        this.g = 0;
        MessageDigest j = m.j("MD5");
        if (j == null) {
            w().f().a("Could not get MD5 instance");
            this.g = -1;
        } else if (packageManager != null) {
            try {
                if (!E()) {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(q().getPackageName(), 64);
                    if (packageInfo2.signatures != null && packageInfo2.signatures.length > 0) {
                        this.g = m.c(j.digest(packageInfo2.signatures[0].toByteArray()));
                    }
                }
            } catch (NameNotFoundException e2) {
                w().f().a("Package name not found", e2);
            }
        }
        Status a = y().N() ? aie.a(q(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, true) : aie.a(q());
        boolean z = a != null && a.f();
        if (!z) {
            a(a);
        }
        if (z) {
            Boolean Q = y().Q();
            if (y().P()) {
                w().C().a("Collection disabled with firebase_analytics_collection_deactivated=1");
                z = false;
            } else if (Q != null && !Q.booleanValue()) {
                w().C().a("Collection disabled with firebase_analytics_collection_enabled=0");
                z = false;
            } else if (Q == null && y().R()) {
                w().C().a("Collection disabled with google_app_measurement_enable=0");
                z = false;
            } else {
                w().E().a("Collection enabled");
                z = true;
            }
        } else {
            z = false;
        }
        this.h = "";
        if (!y().N()) {
            try {
                String a2 = aie.a();
                if (TextUtils.isEmpty(a2)) {
                    a2 = "";
                }
                this.h = a2;
                if (z) {
                    w().E().a("App package, google app id", this.b, this.h);
                }
            } catch (IllegalStateException e3) {
                w().f().a("getGoogleAppId or isMeasurementEnabled failed with exception", e3);
            }
        }
    }

    String f() {
        c();
        return this.b;
    }

    String g() {
        c();
        return this.h;
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

    String z() {
        c();
        return this.c;
    }
}
