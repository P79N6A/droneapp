package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.d;
import java.io.InputStream;

public final class bh extends InputStream {
    private final InputStream a;
    private volatile be b;

    public bh(InputStream inputStream) {
        this.a = (InputStream) d.a(inputStream);
    }

    private int a(int i) {
        if (i == -1) {
            be beVar = this.b;
            if (beVar != null) {
                throw new com.google.android.gms.wearable.d("Channel closed unexpectedly before stream was finished", beVar.a, beVar.b);
            }
        }
        return i;
    }

    bm a() {
        return new bm(this) {
            final /* synthetic */ bh a;

            {
                this.a = r1;
            }

            public void a(be beVar) {
                this.a.a(beVar);
            }
        };
    }

    void a(be beVar) {
        this.b = (be) d.a(beVar);
    }

    public int available() {
        return this.a.available();
    }

    public void close() {
        this.a.close();
    }

    public void mark(int i) {
        this.a.mark(i);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public int read() {
        return a(this.a.read());
    }

    public int read(byte[] bArr) {
        return a(this.a.read(bArr));
    }

    public int read(byte[] bArr, int i, int i2) {
        return a(this.a.read(bArr, i, i2));
    }

    public void reset() {
        this.a.reset();
    }

    public long skip(long j) {
        return this.a.skip(j);
    }
}
