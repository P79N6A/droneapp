package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

class apb extends Thread implements apa {
    private static apb d;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile apc e;
    private final Context f;
    private final e g = h.d();

    private apb(Context context) {
        super("GAThread");
        if (context != null) {
            this.f = context.getApplicationContext();
        } else {
            this.f = context;
        }
        start();
    }

    static apb a(Context context) {
        if (d == null) {
            d = new apb(context);
        }
        return d;
    }

    private String a(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    public void a(Runnable runnable) {
        this.a.add(runnable);
    }

    void a(String str, long j, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        final apb com_google_android_gms_internal_apb = this;
        final long j2 = j;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final Map<String, String> map2 = map;
        final String str8 = str4;
        a(new Runnable(this) {
            final /* synthetic */ apb h;

            public void run() {
                if (this.h.e == null) {
                    apu b = apu.b();
                    b.a(this.h.f, com_google_android_gms_internal_apb);
                    this.h.e = b.c();
                }
                this.h.e.a(j2, str5, str6, str7, map2, str8);
            }
        });
    }

    public void a(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        a(str, this.g.a(), str2, str3, map, str4);
    }

    public void run() {
        while (!this.c) {
            try {
                Runnable runnable = (Runnable) this.a.take();
                if (!this.b) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                aph.c(e.toString());
            } catch (Throwable th) {
                String str = "Error on Google TagManager Thread: ";
                String valueOf = String.valueOf(a(th));
                aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                aph.a("Google TagManager is shutting down.");
                this.b = true;
            }
        }
    }
}
