package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;

public class age extends a {
    private final View a;
    private final OnClickListener b;

    public age(View view, final long j) {
        this.a = view;
        this.b = new OnClickListener(this) {
            final /* synthetic */ age b;

            public void onClick(View view) {
                c a = this.b.a();
                if (a != null && a.t()) {
                    a.a(a.e() + j);
                }
            }
        };
    }

    private void e() {
        c a = a();
        if (a == null || !a.t() || a.k() || a.u()) {
            this.a.setEnabled(false);
        } else {
            this.a.setEnabled(true);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setOnClickListener(this.b);
        e();
    }

    public void b() {
        this.a.setOnClickListener(null);
        super.b();
    }

    public void c() {
        e();
    }

    public void d() {
        this.a.setEnabled(false);
    }
}
