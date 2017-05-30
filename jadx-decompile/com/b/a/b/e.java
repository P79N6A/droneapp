package com.b.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.b.a.b.a.g;
import com.b.a.c.d;
import java.io.InputStream;
import java.util.concurrent.Executor;

public final class e {
    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final com.b.a.b.g.a f;
    final Executor g;
    final Executor h;
    final boolean i;
    final boolean j;
    final int k;
    final int l;
    final g m;
    final com.b.a.a.b.c n;
    final com.b.a.a.a.a o;
    final com.b.a.b.d.b p;
    final com.b.a.b.b.b q;
    final c r;
    final com.b.a.b.d.b s;
    final com.b.a.b.d.b t;

    public static class a {
        public static final int a = 3;
        public static final int b = 3;
        public static final g c = g.FIFO;
        private static final String d = "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other";
        private static final String e = "diskCache() and diskCacheFileNameGenerator() calls overlap each other";
        private static final String f = "memoryCache() and memoryCacheSize() calls overlap each other";
        private static final String g = "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.";
        private com.b.a.a.a.b.a A = null;
        private com.b.a.b.d.b B = null;
        private com.b.a.b.b.b C;
        private c D = null;
        private boolean E = false;
        private Context h;
        private int i = 0;
        private int j = 0;
        private int k = 0;
        private int l = 0;
        private com.b.a.b.g.a m = null;
        private Executor n = null;
        private Executor o = null;
        private boolean p = false;
        private boolean q = false;
        private int r = 3;
        private int s = 3;
        private boolean t = false;
        private g u = c;
        private int v = 0;
        private long w = 0;
        private int x = 0;
        private com.b.a.a.b.c y = null;
        private com.b.a.a.a.a z = null;

        public a(Context context) {
            this.h = context.getApplicationContext();
        }

        private void d() {
            if (this.n == null) {
                this.n = a.a(this.r, this.s, this.u);
            } else {
                this.p = true;
            }
            if (this.o == null) {
                this.o = a.a(this.r, this.s, this.u);
            } else {
                this.q = true;
            }
            if (this.z == null) {
                if (this.A == null) {
                    this.A = a.b();
                }
                this.z = a.a(this.h, this.A, this.w, this.x);
            }
            if (this.y == null) {
                this.y = a.a(this.h, this.v);
            }
            if (this.t) {
                this.y = new com.b.a.a.b.a.b(this.y, com.b.a.c.e.a());
            }
            if (this.B == null) {
                this.B = a.a(this.h);
            }
            if (this.C == null) {
                this.C = a.a(this.E);
            }
            if (this.D == null) {
                this.D = c.t();
            }
        }

        public a a() {
            this.t = true;
            return this;
        }

        public a a(int i) {
            if (!(this.n == null && this.o == null)) {
                d.c(g, new Object[0]);
            }
            this.r = i;
            return this;
        }

        public a a(int i, int i2) {
            this.i = i;
            this.j = i2;
            return this;
        }

        @Deprecated
        public a a(int i, int i2, com.b.a.b.g.a aVar) {
            return b(i, i2, aVar);
        }

        @Deprecated
        public a a(com.b.a.a.a.a aVar) {
            return b(aVar);
        }

        @Deprecated
        public a a(com.b.a.a.a.b.a aVar) {
            return b(aVar);
        }

        public a a(com.b.a.a.b.c cVar) {
            if (this.v != 0) {
                d.c(f, new Object[0]);
            }
            this.y = cVar;
            return this;
        }

        public a a(g gVar) {
            if (!(this.n == null && this.o == null)) {
                d.c(g, new Object[0]);
            }
            this.u = gVar;
            return this;
        }

        public a a(com.b.a.b.b.b bVar) {
            this.C = bVar;
            return this;
        }

        public a a(c cVar) {
            this.D = cVar;
            return this;
        }

        public a a(com.b.a.b.d.b bVar) {
            this.B = bVar;
            return this;
        }

        public a a(Executor executor) {
            if (!(this.r == 3 && this.s == 3 && this.u == c)) {
                d.c(g, new Object[0]);
            }
            this.n = executor;
            return this;
        }

        public a b() {
            this.E = true;
            return this;
        }

        public a b(int i) {
            if (!(this.n == null && this.o == null)) {
                d.c(g, new Object[0]);
            }
            if (i < 1) {
                this.s = 1;
            } else if (i > 10) {
                this.s = 10;
            } else {
                this.s = i;
            }
            return this;
        }

        public a b(int i, int i2, com.b.a.b.g.a aVar) {
            this.k = i;
            this.l = i2;
            this.m = aVar;
            return this;
        }

        public a b(com.b.a.a.a.a aVar) {
            if (this.w > 0 || this.x > 0) {
                d.c(d, new Object[0]);
            }
            if (this.A != null) {
                d.c(e, new Object[0]);
            }
            this.z = aVar;
            return this;
        }

        public a b(com.b.a.a.a.b.a aVar) {
            if (this.z != null) {
                d.c(e, new Object[0]);
            }
            this.A = aVar;
            return this;
        }

        public a b(Executor executor) {
            if (!(this.r == 3 && this.s == 3 && this.u == c)) {
                d.c(g, new Object[0]);
            }
            this.o = executor;
            return this;
        }

        public a c(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("memoryCacheSize must be a positive number");
            }
            if (this.y != null) {
                d.c(f, new Object[0]);
            }
            this.v = i;
            return this;
        }

        public e c() {
            d();
            return new e();
        }

        public a d(int i) {
            if (i <= 0 || i >= 100) {
                throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
            }
            if (this.y != null) {
                d.c(f, new Object[0]);
            }
            this.v = (int) (((float) Runtime.getRuntime().maxMemory()) * (((float) i) / 100.0f));
            return this;
        }

        @Deprecated
        public a e(int i) {
            return f(i);
        }

        public a f(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxCacheSize must be a positive number");
            }
            if (this.z != null) {
                d.c(d, new Object[0]);
            }
            this.w = (long) i;
            return this;
        }

        @Deprecated
        public a g(int i) {
            return h(i);
        }

        public a h(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxFileCount must be a positive number");
            }
            if (this.z != null) {
                d.c(d, new Object[0]);
            }
            this.x = i;
            return this;
        }
    }

    private static class b implements com.b.a.b.d.b {
        private final com.b.a.b.d.b a;

        public b(com.b.a.b.d.b bVar) {
            this.a = bVar;
        }

        public InputStream a(String str, Object obj) {
            switch (com.b.a.b.d.b.a.a(str)) {
                case HTTP:
                case HTTPS:
                    throw new IllegalStateException();
                default:
                    return this.a.a(str, obj);
            }
        }
    }

    private static class c implements com.b.a.b.d.b {
        private final com.b.a.b.d.b a;

        public c(com.b.a.b.d.b bVar) {
            this.a = bVar;
        }

        public InputStream a(String str, Object obj) {
            InputStream a = this.a.a(str, obj);
            switch (com.b.a.b.d.b.a.a(str)) {
                case HTTP:
                case HTTPS:
                    return new com.b.a.b.a.c(a);
                default:
                    return a;
            }
        }
    }

    private e(a aVar) {
        this.a = aVar.h.getResources();
        this.b = aVar.i;
        this.c = aVar.j;
        this.d = aVar.k;
        this.e = aVar.l;
        this.f = aVar.m;
        this.g = aVar.n;
        this.h = aVar.o;
        this.k = aVar.r;
        this.l = aVar.s;
        this.m = aVar.u;
        this.o = aVar.z;
        this.n = aVar.y;
        this.r = aVar.D;
        this.p = aVar.B;
        this.q = aVar.C;
        this.i = aVar.p;
        this.j = aVar.q;
        this.s = new b(this.p);
        this.t = new c(this.p);
        d.a(aVar.E);
    }

    public static e a(Context context) {
        return new a(context).c();
    }

    com.b.a.b.a.e a() {
        DisplayMetrics displayMetrics = this.a.getDisplayMetrics();
        int i = this.b;
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        int i2 = this.c;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return new com.b.a.b.a.e(i, i2);
    }
}
