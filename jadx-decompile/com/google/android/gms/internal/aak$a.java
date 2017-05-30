package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.i;
import com.google.firebase.a.a.b;
import java.util.Locale;

public final class aak$a {
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private boolean p;
    private boolean q;
    private String r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private float w;
    private int x;
    private int y;
    private boolean z;

    public aak$a(Context context) {
        boolean z = true;
        PackageManager packageManager = context.getPackageManager();
        a(context);
        a(context, packageManager);
        b(context);
        Locale locale = Locale.getDefault();
        this.p = a(packageManager, "geo:0,0?q=donuts") != null;
        if (a(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.q = z;
        this.r = locale.getCountry();
        this.s = ac.a().a();
        this.t = i.b(context);
        this.u = locale.getLanguage();
        this.v = a(packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.w = displayMetrics.density;
                this.x = displayMetrics.widthPixels;
                this.y = displayMetrics.heightPixels;
            }
        }
    }

    public aak$a(Context context, aak com_google_android_gms_internal_aak) {
        PackageManager packageManager = context.getPackageManager();
        a(context);
        a(context, packageManager);
        b(context);
        c(context);
        this.p = com_google_android_gms_internal_aak.b;
        this.q = com_google_android_gms_internal_aak.c;
        this.r = com_google_android_gms_internal_aak.e;
        this.s = com_google_android_gms_internal_aak.f;
        this.t = com_google_android_gms_internal_aak.g;
        this.u = com_google_android_gms_internal_aak.j;
        this.v = com_google_android_gms_internal_aak.k;
        this.w = com_google_android_gms_internal_aak.r;
        this.x = com_google_android_gms_internal_aak.s;
        this.y = com_google_android_gms_internal_aak.t;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String a(PackageManager packageManager) {
        String str = null;
        ResolveInfo a = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a != null) {
            ActivityInfo activityInfo = a.activityInfo;
            if (activityInfo != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        int i = packageInfo.versionCode;
                        String valueOf = String.valueOf(activityInfo.packageName);
                        str = new StringBuilder(String.valueOf(valueOf).length() + 12).append(i).append(".").append(valueOf).toString();
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return str;
    }

    private void a(Context context) {
        AudioManager i = u.e().i(context);
        if (i != null) {
            try {
                this.a = i.getMode();
                this.b = i.isMusicActive();
                this.c = i.isSpeakerphoneOn();
                this.d = i.getStreamVolume(3);
                this.e = i.getRingerMode();
                this.f = i.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                u.i().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    @TargetApi(16)
    private void a(Context context, PackageManager packageManager) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        this.i = telephonyManager.getNetworkType();
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        if (u.e().a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private void b(Context context) {
        boolean z = false;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra(b.q, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.n = z;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    private void c(Context context) {
        this.o = Build.FINGERPRINT;
        this.z = ut.a(context);
    }

    public aak a() {
        return new aak(this.a, this.p, this.q, this.g, this.r, this.s, this.t, this.b, this.c, this.u, this.v, this.d, this.h, this.i, this.j, this.e, this.f, this.w, this.x, this.y, this.m, this.n, this.k, this.l, this.o, this.z);
    }
}
