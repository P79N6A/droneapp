package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.b.a.b.a.e;
import com.b.a.b.a.f;
import com.b.a.b.b.c;
import com.b.a.b.d.b;
import com.b.a.c.d;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

final class h implements com.b.a.c.c.a, Runnable {
    private static final String f = "ImageLoader is paused. Waiting...  [%s]";
    private static final String g = ".. Resume loading [%s]";
    private static final String h = "Delay %d ms before loading...  [%s]";
    private static final String i = "Start display image task [%s]";
    private static final String j = "Image already is loading. Waiting... [%s]";
    private static final String k = "...Get cached bitmap from memory after waiting. [%s]";
    private static final String l = "Load image from network [%s]";
    private static final String m = "Load image from disk cache [%s]";
    private static final String n = "Resize image in disk cache [%s]";
    private static final String o = "PreProcess image before caching in memory [%s]";
    private static final String p = "PostProcess image before displaying [%s]";
    private static final String q = "Cache image in memory [%s]";
    private static final String r = "Cache image on disk [%s]";
    private static final String s = "Process image before cache on disk [%s]";
    private static final String t = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private static final String u = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String v = "Task was interrupted [%s]";
    private static final String w = "No stream for image [%s]";
    private static final String x = "Pre-processor returned null [%s]";
    private static final String y = "Post-processor returned null [%s]";
    private static final String z = "Bitmap processor for disk cache returned null [%s]";
    private final f A;
    private final g B;
    private final Handler C;
    private final e D;
    private final b E;
    private final b F;
    private final b G;
    private final com.b.a.b.b.b H;
    private final String I;
    private final e J;
    private final boolean K;
    private f L = f.NETWORK;
    final String a;
    final com.b.a.b.e.a b;
    final c c;
    final com.b.a.b.f.a d;
    final com.b.a.b.f.b e;

    class a extends Exception {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }
    }

    public h(f fVar, g gVar, Handler handler) {
        this.A = fVar;
        this.B = gVar;
        this.C = handler;
        this.D = fVar.a;
        this.E = this.D.p;
        this.F = this.D.s;
        this.G = this.D.t;
        this.H = this.D.q;
        this.a = gVar.a;
        this.I = gVar.b;
        this.b = gVar.c;
        this.J = gVar.d;
        this.c = gVar.e;
        this.d = gVar.f;
        this.e = gVar.g;
        this.K = this.c.s();
    }

    private Bitmap a(String str) {
        String str2 = str;
        return this.H.a(new c(this.I, str2, this.a, this.J, this.b.c(), h(), this.c));
    }

    private void a(final com.b.a.b.a.b.a aVar, final Throwable th) {
        if (!this.K && !p() && !j()) {
            a(new Runnable(this) {
                final /* synthetic */ h c;

                public void run() {
                    if (this.c.c.c()) {
                        this.c.b.a(this.c.c.c(this.c.D.a));
                    }
                    this.c.d.a(this.c.a, this.c.b.d(), new com.b.a.b.a.b(aVar, th));
                }
            }, false, this.C, this.A);
        }
    }

    static void a(Runnable runnable, boolean z, Handler handler, f fVar) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            fVar.a(runnable);
        } else {
            handler.post(runnable);
        }
    }

    private boolean b() {
        AtomicBoolean d = this.A.d();
        if (d.get()) {
            synchronized (this.A.e()) {
                if (d.get()) {
                    d.a(f, this.I);
                    try {
                        this.A.e().wait();
                        d.a(g, this.I);
                    } catch (InterruptedException e) {
                        d.d(v, this.I);
                        return true;
                    }
                }
            }
        }
        return j();
    }

    private boolean b(int i, int i2) {
        File a = this.D.o.a(this.a);
        if (a != null && a.exists()) {
            Bitmap a2 = this.H.a(new c(this.I, com.b.a.b.d.b.a.FILE.b(a.getAbsolutePath()), this.a, new e(i, i2), com.b.a.b.a.h.FIT_INSIDE, h(), new com.b.a.b.c.a().a(this.c).a(com.b.a.b.a.d.IN_SAMPLE_INT).d()));
            if (!(a2 == null || this.D.f == null)) {
                d.a(s, this.I);
                a2 = this.D.f.a(a2);
                if (a2 == null) {
                    d.d(z, this.I);
                }
            }
            Bitmap bitmap = a2;
            if (bitmap != null) {
                boolean a3 = this.D.o.a(this.a, bitmap);
                bitmap.recycle();
                return a3;
            }
        }
        return false;
    }

    private boolean c() {
        if (!this.c.f()) {
            return false;
        }
        d.a(h, Integer.valueOf(this.c.l()), this.I);
        try {
            Thread.sleep((long) this.c.l());
            return j();
        } catch (InterruptedException e) {
            d.d(v, this.I);
            return true;
        }
    }

    private boolean c(final int i, final int i2) {
        if (p() || j()) {
            return false;
        }
        if (this.e != null) {
            a(new Runnable(this) {
                final /* synthetic */ h c;

                public void run() {
                    this.c.e.a(this.c.a, this.c.b.d(), i, i2);
                }
            }, false, this.C, this.A);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap d() {
        /*
        r7 = this;
        r1 = 0;
        r0 = r7.D;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.o;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = r7.a;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.a(r2);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        if (r0 == 0) goto L_0x00d9;
    L_0x000d:
        r2 = r0.exists();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        if (r2 == 0) goto L_0x00d9;
    L_0x0013:
        r2 = r0.length();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x00d9;
    L_0x001d:
        r2 = "Load image from disk cache [%s]";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r4 = 0;
        r5 = r7.I;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r3[r4] = r5;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        com.b.a.c.d.a(r2, r3);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = com.b.a.b.a.f.DISC_CACHE;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r7.L = r2;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r7.i();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r2 = com.b.a.b.d.b.a.FILE;	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r0.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r2.b(r0);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
        r0 = r7.a(r0);	 Catch:{ IllegalStateException -> 0x00a0, a -> 0x00a8, IOException -> 0x00aa, OutOfMemoryError -> 0x00b7, Throwable -> 0x00c4 }
    L_0x003f:
        if (r0 == 0) goto L_0x004d;
    L_0x0041:
        r2 = r0.getWidth();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 <= 0) goto L_0x004d;
    L_0x0047:
        r2 = r0.getHeight();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 > 0) goto L_0x009f;
    L_0x004d:
        r2 = "Load image from network [%s]";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r4 = 0;
        r5 = r7.I;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3[r4] = r5;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        com.b.a.c.d.a(r2, r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = com.b.a.b.a.f.NETWORK;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r7.L = r2;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = r7.a;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r7.c;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.i();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x0068:
        r3 = r7.e();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x006e:
        r3 = r7.D;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.o;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r4 = r7.a;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.a(r4);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r3 == 0) goto L_0x0084;
    L_0x007a:
        r2 = com.b.a.b.d.b.a.FILE;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = r3.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r2 = r2.b(r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
    L_0x0084:
        r7.i();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r0 = r7.a(r2);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r0 == 0) goto L_0x0099;
    L_0x008d:
        r2 = r0.getWidth();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 <= 0) goto L_0x0099;
    L_0x0093:
        r2 = r0.getHeight();	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        if (r2 > 0) goto L_0x009f;
    L_0x0099:
        r2 = com.b.a.b.a.b.a.DECODING_ERROR;	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
        r3 = 0;
        r7.a(r2, r3);	 Catch:{ IllegalStateException -> 0x00d7, a -> 0x00a8, IOException -> 0x00d5, OutOfMemoryError -> 0x00d3, Throwable -> 0x00d1 }
    L_0x009f:
        return r0;
    L_0x00a0:
        r0 = move-exception;
        r0 = r1;
    L_0x00a2:
        r2 = com.b.a.b.a.b.a.NETWORK_DENIED;
        r7.a(r2, r1);
        goto L_0x009f;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00ae:
        com.b.a.c.d.a(r1);
        r2 = com.b.a.b.a.b.a.IO_ERROR;
        r7.a(r2, r1);
        goto L_0x009f;
    L_0x00b7:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00bb:
        com.b.a.c.d.a(r1);
        r2 = com.b.a.b.a.b.a.OUT_OF_MEMORY;
        r7.a(r2, r1);
        goto L_0x009f;
    L_0x00c4:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x00c8:
        com.b.a.c.d.a(r1);
        r2 = com.b.a.b.a.b.a.UNKNOWN;
        r7.a(r2, r1);
        goto L_0x009f;
    L_0x00d1:
        r1 = move-exception;
        goto L_0x00c8;
    L_0x00d3:
        r1 = move-exception;
        goto L_0x00bb;
    L_0x00d5:
        r1 = move-exception;
        goto L_0x00ae;
    L_0x00d7:
        r2 = move-exception;
        goto L_0x00a2;
    L_0x00d9:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.h.d():android.graphics.Bitmap");
    }

    private boolean e() {
        d.a(r, this.I);
        try {
            boolean f = f();
            if (!f) {
                return f;
            }
            int i = this.D.d;
            int i2 = this.D.e;
            if (i <= 0 && i2 <= 0) {
                return f;
            }
            d.a(n, this.I);
            b(i, i2);
            return f;
        } catch (Throwable e) {
            d.a(e);
            return false;
        }
    }

    private boolean f() {
        boolean z = false;
        Closeable a = h().a(this.a, this.c.n());
        if (a == null) {
            d.d(w, this.I);
        } else {
            try {
                z = this.D.o.a(this.a, a, this);
            } finally {
                com.b.a.c.c.a(a);
            }
        }
        return z;
    }

    private void g() {
        if (!this.K && !p()) {
            a(new Runnable(this) {
                final /* synthetic */ h a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.d.b(this.a.a, this.a.b.d());
                }
            }, false, this.C, this.A);
        }
    }

    private b h() {
        return this.A.f() ? this.F : this.A.g() ? this.G : this.E;
    }

    private void i() {
        k();
        m();
    }

    private boolean j() {
        return l() || n();
    }

    private void k() {
        if (l()) {
            throw new a(this);
        }
    }

    private boolean l() {
        if (!this.b.e()) {
            return false;
        }
        d.a(u, this.I);
        return true;
    }

    private void m() {
        if (n()) {
            throw new a(this);
        }
    }

    private boolean n() {
        if (!(!this.I.equals(this.A.a(this.b)))) {
            return false;
        }
        d.a(t, this.I);
        return true;
    }

    private void o() {
        if (p()) {
            throw new a(this);
        }
    }

    private boolean p() {
        if (!Thread.interrupted()) {
            return false;
        }
        d.a(v, this.I);
        return true;
    }

    String a() {
        return this.a;
    }

    public boolean a(int i, int i2) {
        return this.K || c(i, i2);
    }

    public void run() {
        if (!b() && !c()) {
            ReentrantLock reentrantLock = this.B.h;
            d.a(i, this.I);
            if (reentrantLock.isLocked()) {
                d.a(j, this.I);
            }
            reentrantLock.lock();
            try {
                i();
                Bitmap a = this.D.n.a(this.I);
                if (a == null || a.isRecycled()) {
                    a = d();
                    if (a != null) {
                        i();
                        o();
                        if (this.c.d()) {
                            d.a(o, this.I);
                            a = this.c.o().a(a);
                            if (a == null) {
                                d.d(x, this.I);
                            }
                        }
                        if (a != null && this.c.h()) {
                            d.a(q, this.I);
                            this.D.n.a(this.I, a);
                        }
                    } else {
                        return;
                    }
                }
                this.L = f.MEMORY_CACHE;
                d.a(k, this.I);
                if (a != null && this.c.e()) {
                    d.a(p, this.I);
                    a = this.c.p().a(a);
                    if (a == null) {
                        d.d(y, this.I);
                    }
                }
                i();
                o();
                reentrantLock.unlock();
                a(new b(a, this.B, this.A, this.L), this.K, this.C, this.A);
            } catch (a e) {
                g();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
