package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

public class dm implements m {
    private final Status a;
    private final int b;
    private final a c;
    private final dy d;

    public static class a {
        private final byte[] a;
        private final long b;
        private final dd c;
        private final dv d;

        public a(dd ddVar, byte[] bArr, dv dvVar, long j) {
            this.c = ddVar;
            this.a = bArr;
            this.d = dvVar;
            this.b = j;
        }

        public a(dv dvVar) {
            this(null, null, dvVar, 0);
        }

        public byte[] a() {
            return this.a;
        }

        public dd b() {
            return this.c;
        }

        public dv c() {
            return this.d;
        }

        public long d() {
            return this.b;
        }
    }

    public dm(Status status, int i) {
        this(status, i, null, null);
    }

    public dm(Status status, int i, a aVar, dy dyVar) {
        this.a = status;
        this.b = i;
        this.c = aVar;
        this.d = dyVar;
    }

    public Status a() {
        return this.a;
    }

    public a b() {
        return this.c;
    }

    public dy c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        if (this.b == 0) {
            return "Network";
        }
        if (this.b == 1) {
            return "Saved file on disk";
        }
        if (this.b == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
