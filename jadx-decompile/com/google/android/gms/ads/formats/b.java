package com.google.android.gms.ads.formats;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.i;
import com.google.android.gms.internal.aaa;

@aaa
public final class b {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final int k;
    private final i l;

    public @interface a {
    }

    public static final class b {
        private boolean a = false;
        private int b = 0;
        private boolean c = false;
        private i d;
        private int e = 1;

        public b a(int i) {
            this.b = i;
            return this;
        }

        public b a(i iVar) {
            this.d = iVar;
            return this;
        }

        public b a(boolean z) {
            this.a = z;
            return this;
        }

        public b a() {
            return new b();
        }

        public b b(@a int i) {
            this.e = i;
            return this;
        }

        public b b(boolean z) {
            this.c = z;
            return this;
        }
    }

    private b(b bVar) {
        this.h = bVar.a;
        this.i = bVar.b;
        this.j = bVar.c;
        this.k = bVar.e;
        this.l = bVar.d;
    }

    public boolean a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public boolean c() {
        return this.j;
    }

    public int d() {
        return this.k;
    }

    @Nullable
    public i e() {
        return this.l;
    }
}
