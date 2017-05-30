package com.google.android.gms.internal;

import com.google.android.gms.internal.rq.a;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class sp {
    protected static final String a = sp.class.getSimpleName();
    private final rw b;
    private final String c;
    private final String d;
    private final int e = 2;
    private volatile Method f = null;
    private List<Class> g;
    private CountDownLatch h = new CountDownLatch(1);

    public sp(rw rwVar, String str, String str2, List<Class> list) {
        this.b = rwVar;
        this.c = str;
        this.d = str2;
        this.g = new ArrayList(list);
        this.b.c().submit(new Runnable(this) {
            final /* synthetic */ sp a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.b();
            }
        });
    }

    private String a(byte[] bArr, String str) {
        return new String(this.b.e().a(bArr, str), "UTF-8");
    }

    private void b() {
        try {
            Class loadClass = this.b.d().loadClass(a(this.b.f(), this.c));
            if (loadClass != null) {
                this.f = loadClass.getMethod(a(this.b.f(), this.d), (Class[]) this.g.toArray(new Class[this.g.size()]));
                if (this.f == null) {
                    this.h.countDown();
                } else {
                    this.h.countDown();
                }
            }
        } catch (a e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            this.h.countDown();
        }
    }

    public Method a() {
        if (this.f != null) {
            return this.f;
        }
        try {
            return this.h.await(2, TimeUnit.SECONDS) ? this.f : null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
