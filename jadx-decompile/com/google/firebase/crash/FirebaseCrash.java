package com.google.firebase.crash;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.firebase.b;
import com.google.firebase.crash.internal.FirebaseCrashOptions;
import com.google.firebase.crash.internal.a;
import com.google.firebase.crash.internal.config.flag.Flags;
import com.google.firebase.crash.internal.d;
import com.google.firebase.crash.internal.g;
import com.google.firebase.crash.internal.h;

public class FirebaseCrash {
    private static final String a = FirebaseCrash.class.getSimpleName();
    private static volatile FirebaseCrash e;
    private boolean b;
    private d c;
    private a d;

    FirebaseCrash(b bVar, boolean z) {
        this.b = z;
        Context a = bVar.a();
        if (a == null) {
            Log.w(a, "Application context is missing, disabling api");
            this.b = false;
        }
        if (this.b) {
            try {
                FirebaseCrashOptions firebaseCrashOptions = new FirebaseCrashOptions(bVar.c().b(), bVar.c().a());
                g.a().a(a);
                this.c = g.a().b();
                this.c.a(f.a(a), firebaseCrashOptions);
                this.d = new a(a);
                f();
                String str = a;
                String str2 = "FirebaseCrash reporting initialized ";
                String valueOf = String.valueOf(g.a().toString());
                Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return;
            } catch (Throwable e) {
                Log.e(a, "Failed to initialize crash reporting", e);
                this.b = false;
                return;
            }
        }
        Log.i(a, "Crash reporting is disabled");
    }

    public static FirebaseCrash a() {
        if (e == null) {
            synchronized (FirebaseCrash.class) {
                if (e == null) {
                    e = getInstance(b.d());
                }
            }
        }
        return e;
    }

    public static void a(int i, String str, String str2) {
        try {
            a().b(i, str, str2);
        } catch (com.google.firebase.crash.internal.b e) {
            Log.v(a, e.getMessage());
        }
    }

    public static void a(String str) {
        try {
            a().b(str);
        } catch (com.google.firebase.crash.internal.b e) {
            Log.v(a, e.getMessage());
        }
    }

    public static void a(Throwable th) {
        try {
            a().b(th);
        } catch (com.google.firebase.crash.internal.b e) {
            Log.v(a, e.getMessage());
        }
    }

    public static boolean b() {
        return e != null;
    }

    private d c() {
        return this.c;
    }

    private boolean d() {
        return this.b;
    }

    private static boolean e() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    private void f() {
        if (e()) {
            Thread.setDefaultUncaughtExceptionHandler(new h(Thread.getDefaultUncaughtExceptionHandler(), this));
            return;
        }
        throw new RuntimeException("FirebaseCrash reporting may only be initialized on the main thread (preferably in your app's Application.onCreate)");
    }

    private String g() {
        return com.google.firebase.iid.b.a().b();
    }

    @Keep
    public static FirebaseCrash getInstance(b bVar) {
        Flags.initialize(bVar.a());
        FirebaseCrash firebaseCrash = new FirebaseCrash(bVar, ((Boolean) Flags.aVh.c()).booleanValue());
        synchronized (FirebaseCrash.class) {
            if (e == null) {
                e = firebaseCrash;
            }
        }
        return firebaseCrash;
    }

    public void b(int i, String str, String str2) {
        if (str2 != null) {
            if (str == null) {
                str = "";
            }
            Log.println(i, str, str2);
            b(str2);
        }
    }

    public void b(String str) {
        if (d()) {
            d c = c();
            if (c != null && str != null) {
                try {
                    c.a(str);
                    return;
                } catch (Throwable e) {
                    Log.e(a, "log remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new com.google.firebase.crash.internal.b("Firebase Crash Reporting is disabled.");
    }

    public void b(Throwable th) {
        if (d()) {
            d c = c();
            if (c != null && th != null) {
                this.d.a(false, System.currentTimeMillis());
                try {
                    c.b(g());
                    c.a(f.a(th));
                    return;
                } catch (Throwable e) {
                    Log.e(a, "report remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new com.google.firebase.crash.internal.b("Firebase Crash Reporting is disabled.");
    }

    public void c(Throwable th) {
        if (d()) {
            d c = c();
            if (c != null && th != null) {
                try {
                    this.d.a(true, System.currentTimeMillis());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    c.b(g());
                    c.b(f.a(th));
                    return;
                } catch (Throwable e2) {
                    Log.e(a, "report remoting failed", e2);
                    return;
                }
            }
            return;
        }
        throw new com.google.firebase.crash.internal.b("Firebase Crash Reporting is disabled.");
    }
}
