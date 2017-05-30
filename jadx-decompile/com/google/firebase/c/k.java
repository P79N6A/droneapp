package com.google.firebase.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nk;
import java.io.IOException;
import java.io.InputStream;

public class k extends j<b> {
    private i b;
    private nb c;
    private volatile Exception d = null;
    private volatile int e = 0;
    private a f;
    private long g;
    private long h;
    private long i;
    private InputStream j;
    private nk k;

    public interface a {
        void a(b bVar, InputStream inputStream);
    }

    public class b extends b {
        final /* synthetic */ k a;
        private final long c;

        b(k kVar, Exception exception, long j) {
            this.a = kVar;
            super(kVar, exception);
            this.c = j;
        }

        public long a() {
            return this.c;
        }

        public long b() {
            return this.a.k();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Exception c() {
            return super.c();
        }

        @NonNull
        public /* bridge */ /* synthetic */ i d() {
            return super.d();
        }

        @NonNull
        public /* bridge */ /* synthetic */ j e() {
            return super.e();
        }

        public InputStream f() {
            return this.a.j;
        }
    }

    private static class c extends InputStream {
        private k a;
        private InputStream b;
        private int c;

        public c(@NonNull k kVar, @NonNull InputStream inputStream) {
            this.a = kVar;
            this.b = inputStream;
        }

        private void a() {
            if (this.a.v() == 32) {
                throw g.k;
            }
        }

        public int available() {
            a();
            return this.b.available();
        }

        public void close() {
            this.b.close();
            if (this.a.k != null) {
                this.a.k.b();
            }
            a();
        }

        public void mark(int i) {
            this.c = i;
            this.b.mark(i);
        }

        public boolean markSupported() {
            return this.b.markSupported();
        }

        public int read() {
            a();
            int read = this.b.read();
            if (read != -1) {
                this.a.a(1);
            }
            return read;
        }

        public int read(@NonNull byte[] bArr, int i, int i2) {
            a();
            int i3 = 0;
            int i4 = i2;
            int i5 = i;
            while (((long) i4) > 262144) {
                int read = this.b.read(bArr, i5, AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
                if (read != -1) {
                    i3 += read;
                    i5 += read;
                    i4 -= read;
                    this.a.a((long) read);
                    a();
                    if (((long) read) < 262144) {
                        break;
                    }
                }
                return i3 == 0 ? -1 : i3;
            }
            if (i4 > 0) {
                i4 = this.b.read(bArr, i5, i4);
                if (i4 == -1) {
                    return i3 != 0 ? i3 : -1;
                } else {
                    i3 += i4;
                    this.a.a((long) i4);
                }
            }
            return i3;
        }

        public synchronized void reset() {
            a();
            this.a.a((long) (-this.c));
            this.b.reset();
        }

        public long skip(long j) {
            long skip;
            a();
            int i = 0;
            while (j > 262144) {
                skip = this.b.skip(262144);
                i = (int) (((long) i) + skip);
                if (skip < 262144) {
                    this.a.a(skip);
                    return (long) i;
                }
                this.a.a(262144);
                j -= 262144;
                a();
            }
            skip = this.b.skip(j);
            i = (int) (((long) i) + skip);
            this.a.a(skip);
            return (long) i;
        }
    }

    k(@NonNull i iVar) {
        this.b = iVar;
        this.c = new nb(this.b.g(), this.b.f().b());
    }

    private void a(long j) {
        this.g += j;
        if (this.i + 262144 <= this.g) {
            a(4, false);
        }
    }

    private boolean a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    k a(@NonNull a aVar) {
        d.a(aVar);
        d.a(this.f == null);
        this.f = aVar;
        return this;
    }

    public boolean h() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    public boolean i() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    long k() {
        return this.h;
    }

    @NonNull
    i l() {
        return this.b;
    }

    protected void m() {
        p.a().c(D());
    }

    @NonNull
    b n() {
        return new b(this, g.a(this.d, this.e), this.i);
    }

    void o() {
        this.c.b();
        if (this.d != null) {
            a(64, false);
        } else if (a(4, false)) {
            try {
                this.k = this.b.h().a(this.b.o(), 0);
                this.c.a(this.k, false);
                this.e = this.k.g();
                this.d = this.k.f() != null ? this.k.f() : this.d;
                boolean z = a(this.e) && this.d == null && v() == 4;
                if (z) {
                    this.h = (long) this.k.i();
                    InputStream c = this.k.c();
                    if (c != null) {
                        this.j = new c(this, c);
                        if (this.f != null) {
                            try {
                                this.f.a((b) x(), this.j);
                            } catch (Throwable e) {
                                Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e);
                                this.d = e;
                            }
                        }
                    } else {
                        this.d = new IOException("Could not open resulting stream.");
                    }
                }
                if (this.j == null) {
                    this.k.b();
                }
                boolean z2 = z && this.d == null && v() == 4;
                if (z2) {
                    a(4, false);
                    a(128, false);
                    return;
                }
                if (!a(v() == 32 ? 256 : 64, false)) {
                    Log.w("StreamDownloadTask", "Unable to change download task to final state from " + v());
                }
            } catch (Throwable e2) {
                Log.e("StreamDownloadTask", "Unable to create firebase storage network request.", e2);
                this.d = e2;
                a(64, false);
            }
        }
    }

    protected void p() {
        this.c.a();
    }

    @NonNull
    /* synthetic */ a q() {
        return n();
    }

    protected void z() {
        this.i = this.g;
    }
}
