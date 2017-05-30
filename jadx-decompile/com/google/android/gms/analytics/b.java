package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.d.c;
import com.google.android.gms.analytics.internal.f;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

public class b implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private final g b;
    private final Context c;
    private a d;
    private c e;

    public b(g gVar, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (gVar == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException("context cannot be null");
        } else {
            this.a = uncaughtExceptionHandler;
            this.b = gVar;
            this.d = new f(context, new ArrayList());
            this.c = context.getApplicationContext();
            String str = "ExceptionReporter created, original handler is ";
            String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
            f.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public a a() {
        return this.d;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    c b() {
        if (this.e == null) {
            this.e = c.a(this.c);
        }
        return this.e;
    }

    UncaughtExceptionHandler c() {
        return this.a;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.d != null) {
            str = this.d.a(thread != null ? thread.getName() : null, th);
        }
        String str2 = "Reporting uncaught exception: ";
        String valueOf = String.valueOf(str);
        f.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.b.a(new c().a(str).a(true).a());
        c b = b();
        b.i();
        b.j();
        if (this.a != null) {
            f.b("Passing exception to the original handler");
            this.a.uncaughtException(thread, th);
        }
    }
}
