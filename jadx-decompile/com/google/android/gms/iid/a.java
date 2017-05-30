package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class a {
    public static final String a = "SERVICE_NOT_AVAILABLE";
    public static final String b = "TIMEOUT";
    public static final String c = "MISSING_INSTANCEID_SERVICE";
    public static final String d = "RETRY_LATER";
    public static final String e = "MAIN_THREAD";
    static Map<String, a> f = new HashMap();
    static String k;
    private static e l;
    private static d m;
    Context g;
    KeyPair h;
    String i = "";
    long j;

    protected a(Context context, String str, Bundle bundle) {
        this.g = context.getApplicationContext();
        this.i = str;
    }

    static int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return i;
        }
    }

    public static synchronized a a(Context context, Bundle bundle) {
        a aVar;
        synchronized (a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (l == null) {
                l = new e(applicationContext);
                m = new d(applicationContext);
            }
            k = Integer.toString(a(applicationContext));
            aVar = (a) f.get(str);
            if (aVar == null) {
                aVar = new a(applicationContext, str, bundle);
                f.put(str, aVar);
            }
        }
        return aVar;
    }

    static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    public static a c(Context context) {
        return a(context, null);
    }

    KeyPair a() {
        if (this.h == null) {
            this.h = l.c(this.i);
        }
        if (this.h == null) {
            this.j = System.currentTimeMillis();
            this.h = l.a(this.i, this.j);
        }
        return this.h;
    }

    public void a(String str, String str2) {
        a(str, str2, null);
    }

    public void a(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        l.b(this.i, str, str2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.i) ? str : this.i);
        String str3 = "X-subtype";
        if (!"".equals(this.i)) {
            str = this.i;
        }
        bundle.putString(str3, str);
        m.b(m.a(bundle, a()));
    }

    public String b() {
        return a(a());
    }

    public String b(String str, String str2) {
        return b(str, str2, null);
    }

    public String b(String str, String str2, Bundle bundle) {
        Object obj = null;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        Object obj2 = 1;
        String a = h() ? null : l.a(this.i, str, str2);
        if (a == null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("ttl") != null) {
                obj2 = null;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                obj = obj2;
            }
            a = c(str, str2, bundle);
            if (!(a == null || r1 == null)) {
                l.a(this.i, str, str2, a, k);
            }
        }
        return a;
    }

    public long c() {
        if (this.j == 0) {
            String a = l.a(this.i, "cre");
            if (a != null) {
                this.j = Long.parseLong(a);
            }
        }
        return this.j;
    }

    public String c(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.i) ? str : this.i;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        return m.b(m.a(bundle, a()));
    }

    public void d() {
        a("*", "*", null);
        e();
    }

    public void e() {
        this.j = 0;
        l.d(this.i);
        this.h = null;
    }

    public e f() {
        return l;
    }

    public d g() {
        return m;
    }

    boolean h() {
        String a = l.a("appVersion");
        if (a == null || !a.equals(k)) {
            return true;
        }
        a = l.a("lastToken");
        if (a == null) {
            return true;
        }
        return (System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a)).longValue() > 604800;
    }
}
