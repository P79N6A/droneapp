package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;

public class agg extends a {
    private final View a;
    private final int b;
    private final OnClickListener c = new OnClickListener(this) {
        final /* synthetic */ agg a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            c a = this.a.a();
            if (a != null && a.t()) {
                a.d(null);
            }
        }
    };

    public agg(View view, int i) {
        this.a = view;
        this.b = i;
    }

    private void e() {
        c a = a();
        if (a != null && a.t()) {
            boolean z;
            MediaStatus g = a.g();
            if (g.o() == 0) {
                Integer e = g.e(g.l());
                z = e != null && e.intValue() > 0;
            } else {
                z = true;
            }
            if (!z || a.u()) {
                this.a.setVisibility(this.b);
                this.a.setClickable(false);
                this.a.setEnabled(false);
                return;
            }
            this.a.setVisibility(0);
            this.a.setClickable(true);
            this.a.setEnabled(true);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setOnClickListener(this.c);
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
