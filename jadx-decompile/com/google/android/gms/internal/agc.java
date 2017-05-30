package com.google.android.gms.internal;

import android.widget.ProgressBar;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.d;

public class agc extends a implements d {
    private final ProgressBar a;
    private final long b;

    public agc(ProgressBar progressBar, long j) {
        this.a = progressBar;
        this.b = j;
    }

    public void a(long j, long j2) {
        this.a.setProgress((int) j);
        this.a.setMax((int) j2);
    }

    public void a(com.google.android.gms.cast.framework.d dVar) {
        super.a(dVar);
        c a = a();
        if (a != null) {
            a.a(this, this.b);
            if (a.t()) {
                this.a.setProgress((int) a.e());
                this.a.setMax((int) a.f());
                return;
            }
            this.a.setProgress(0);
            this.a.setMax(1);
        }
    }

    public void b() {
        if (a() != null) {
            a().a(this);
        }
        this.a.setProgress(0);
        this.a.setMax(1);
        super.b();
    }

    public void c() {
        c a = a();
        if (a == null || !a.t()) {
            this.a.setProgress(0);
            this.a.setMax(1);
        }
    }
}
