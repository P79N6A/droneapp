package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;

public class afx extends a {
    private final View a;

    public afx(View view) {
        this.a = view;
    }

    private void e() {
        c a = a();
        if (a != null && a.t() && a.n()) {
            this.a.setVisibility(0);
        } else {
            this.a.setVisibility(8);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        e();
    }

    public void b() {
        this.a.setVisibility(8);
        super.b();
    }

    public void c() {
        e();
    }

    public void d() {
        this.a.setVisibility(0);
    }
}
