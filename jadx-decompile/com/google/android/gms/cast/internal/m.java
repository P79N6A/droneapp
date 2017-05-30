package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import java.util.Locale;

public class m {
    private static boolean b = false;
    protected final String a;
    private final boolean c;
    private boolean d;
    private boolean e;
    private String f;

    public m(String str) {
        this(str, c());
    }

    public m(String str, boolean z) {
        d.a(str, (Object) "The log tag cannot be null or empty.");
        this.a = str;
        this.c = str.length() <= 23;
        this.d = z;
        this.e = false;
    }

    public static boolean c() {
        return false;
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = String.format("[%s] ", new Object[]{str});
        }
        this.f = str2;
    }

    public void a(String str, Object... objArr) {
        if (b()) {
            Log.v(this.a, f(str, objArr));
        }
    }

    public void a(Throwable th, String str, Object... objArr) {
        if (a()) {
            Log.d(this.a, f(str, objArr), th);
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean a() {
        return this.d || (this.c && Log.isLoggable(this.a, 3));
    }

    public void b(String str, Object... objArr) {
        if (a()) {
            Log.d(this.a, f(str, objArr));
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        Log.w(this.a, f(str, objArr), th);
    }

    public boolean b() {
        return false;
    }

    public void c(String str, Object... objArr) {
        Log.i(this.a, f(str, objArr));
    }

    public void c(Throwable th, String str, Object... objArr) {
        Log.e(this.a, f(str, objArr), th);
    }

    public void d(String str, Object... objArr) {
        Log.w(this.a, f(str, objArr));
    }

    public void e(String str, Object... objArr) {
        Log.e(this.a, f(str, objArr));
    }

    protected String f(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f)) {
            return str;
        }
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
