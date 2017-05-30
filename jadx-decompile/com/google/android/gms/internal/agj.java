package com.google.android.gms.internal;

import android.text.format.DateUtils;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.d;

public class agj extends a implements d {
    private final TextView a;
    private final long b;
    private final String c;
    private boolean d = true;

    public agj(TextView textView, long j, String str) {
        this.a = textView;
        this.b = j;
        this.c = str;
    }

    public void a(long j) {
        this.a.setText(DateUtils.formatElapsedTime(j / 1000));
    }

    public void a(long j, long j2) {
        if (e()) {
            this.a.setText(DateUtils.formatElapsedTime(j / 1000));
        }
    }

    public void a(com.google.android.gms.cast.framework.d dVar) {
        super.a(dVar);
        c a = a();
        if (a != null) {
            a.a(this, this.b);
            if (a.t()) {
                this.a.setText(DateUtils.formatElapsedTime(a.e() / 1000));
            } else {
                this.a.setText(this.c);
            }
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b() {
        this.a.setText(this.c);
        if (a() != null) {
            a().a(this);
        }
        super.b();
    }

    public boolean e() {
        return this.d;
    }
}
