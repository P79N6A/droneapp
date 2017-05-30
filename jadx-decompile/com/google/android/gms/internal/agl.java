package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;

public class agl extends a {
    private final View a;
    private final int b;

    public agl(View view, int i) {
        this.a = view;
        this.b = i;
    }

    private void e() {
        c a = a();
        if (a == null || !a.t()) {
            this.a.setVisibility(this.b);
        } else {
            this.a.setVisibility(0);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        e();
    }

    public void b() {
        this.a.setVisibility(this.b);
        super.b();
    }

    public void c() {
        e();
    }
}
