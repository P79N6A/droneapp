package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

public abstract class c extends d {
    protected final Handler a;
    protected final e b;
    protected final long c;
    protected final Runnable d;
    protected boolean e;

    private class a implements Runnable {
        final /* synthetic */ c a;

        private a(c cVar) {
            this.a = cVar;
        }

        public void run() {
            this.a.e = false;
            this.a.a(this.a.a(this.a.b.b()));
        }
    }

    public c(String str, e eVar, String str2, String str3) {
        this(str, eVar, str2, str3, 1000);
    }

    public c(String str, e eVar, String str2, String str3, long j) {
        super(str, str2, str3);
        this.a = new Handler(Looper.getMainLooper());
        this.b = eVar;
        this.d = new a();
        this.c = j;
        a(false);
    }

    public c(String str, String str2, String str3) {
        this(str, h.d(), str2, str3);
    }

    public void a() {
        a(false);
    }

    protected final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (z) {
                this.a.postDelayed(this.d, this.c);
            } else {
                this.a.removeCallbacks(this.d);
            }
        }
    }

    protected abstract boolean a(long j);
}
