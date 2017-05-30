package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;

public class agb extends a {
    private final ImageView a;
    private final View b;
    private final boolean c;
    private final Drawable d;
    private final String e;
    private final Drawable f;
    private final String g;
    private final Drawable h;
    private final String i;
    private final OnClickListener j;

    public agb(@NonNull ImageView imageView, Context context, @NonNull Drawable drawable, @NonNull Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.a = imageView;
        this.d = drawable;
        this.f = drawable2;
        if (drawable3 == null) {
            drawable3 = drawable2;
        }
        this.h = drawable3;
        this.e = context.getString(R.string.cast_play);
        this.g = context.getString(R.string.cast_pause);
        this.i = context.getString(R.string.cast_stop);
        this.b = view;
        this.c = z;
        this.j = new OnClickListener(this) {
            final /* synthetic */ agb a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                c a = this.a.a();
                if (a != null && a.t()) {
                    a.s();
                }
            }
        };
    }

    private void a(Drawable drawable, String str) {
        this.a.setImageDrawable(drawable);
        this.a.setContentDescription(str);
        this.a.setVisibility(0);
        this.a.setEnabled(true);
        if (this.b != null) {
            this.b.setVisibility(8);
        }
    }

    private void a(boolean z) {
        boolean z2 = false;
        if (this.b != null) {
            this.b.setVisibility(0);
        }
        this.a.setVisibility(this.c ? 4 : 0);
        ImageView imageView = this.a;
        if (!z) {
            z2 = true;
        }
        imageView.setEnabled(z2);
    }

    private void e() {
        c a = a();
        if (a != null && a.t()) {
            if (a.m()) {
                a(this.d, this.e);
            } else if (a.l()) {
                if (a.k()) {
                    a(this.h, this.i);
                } else {
                    a(this.f, this.g);
                }
            } else if (a.n()) {
                a(false);
            } else if (a.o()) {
                a(true);
            }
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setOnClickListener(this.j);
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
        a(true);
    }
}
