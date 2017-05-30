package com.google.android.gms.internal;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.d;

public class agi extends a implements d {
    private final TextView a;
    private final String b;
    private final View c;

    public agi(TextView textView, String str, View view) {
        this.a = textView;
        this.b = str;
        this.c = view;
    }

    private void a(long j, boolean z) {
        c a = a();
        if (a == null || !a.t()) {
            this.a.setVisibility(0);
            this.a.setText(this.b);
            if (this.c != null) {
                this.c.setVisibility(4);
            }
        } else if (a.k()) {
            this.a.setText(this.b);
            if (this.c != null) {
                this.a.setVisibility(4);
                this.c.setVisibility(0);
            }
        } else {
            if (z) {
                j = a.f();
            }
            this.a.setVisibility(0);
            this.a.setText(DateUtils.formatElapsedTime(j / 1000));
            if (this.c != null) {
                this.c.setVisibility(4);
            }
        }
    }

    public void a(long j, long j2) {
        a(j2, false);
    }

    public void a(com.google.android.gms.cast.framework.d dVar) {
        super.a(dVar);
        if (a() != null) {
            a().a(this, 1000);
        }
        a(-1, true);
    }

    public void b() {
        this.a.setText(this.b);
        if (a() != null) {
            a().a(this);
        }
        super.b();
    }

    public void c() {
        a(-1, true);
    }
}
