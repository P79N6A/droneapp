package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class ac extends Thread implements ab {
    private static ac d;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile ad e;
    private final Context f;

    private ac(Context context) {
        super("GAThread");
        if (context != null) {
            this.f = context.getApplicationContext();
        } else {
            this.f = context;
        }
        start();
    }

    static ac a(Context context) {
        if (d == null) {
            d = new ac(context);
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

    public void a(String str) {
        a(str, System.currentTimeMillis());
    }

    void a(String str, long j) {
        final ac acVar = this;
        final long j2 = j;
        final String str2 = str;
        a(new Runnable(this) {
            final /* synthetic */ ac d;

            public void run() {
                if (this.d.e == null) {
                    cm c = cm.c();
                    c.a(this.d.f, acVar);
                    this.d.e = c.d();
                }
                this.d.e.a(j2, str2);
            }
        });
    }

    public void run() {
        while (!this.c) {
            try {
                Runnable runnable = (Runnable) this.a.take();
                if (!this.b) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                aw.c(e.toString());
            } catch (Throwable th) {
                String str = "Error on Google TagManager Thread: ";
                String valueOf = String.valueOf(a(th));
                aw.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                aw.a("Google TagManager is shutting down.");
                this.b = true;
            }
        }
    }
}
