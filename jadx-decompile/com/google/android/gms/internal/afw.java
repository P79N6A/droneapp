package com.google.android.gms.internal;

import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.common.util.s;

public class afw extends a {
    private final SeekBar a;
    private final SeekBar b;

    public afw(SeekBar seekBar, SeekBar seekBar2) {
        this.a = seekBar;
        this.b = seekBar2;
        this.a.setClickable(false);
        if (s.h()) {
            this.a.setThumb(null);
        } else {
            this.a.setThumb(new ColorDrawable(0));
        }
        this.a.setProgress(1);
        this.a.setMax(1);
        this.a.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ afw a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    private void e() {
        int i = 4;
        c a = a();
        if (a != null && a.t()) {
            boolean k = a.k();
            this.a.setVisibility(k ? 0 : 4);
            SeekBar seekBar = this.b;
            if (!k) {
                i = 0;
            }
            seekBar.setVisibility(i);
        }
    }

    public void a(d dVar) {
        super.a(dVar);
        e();
    }

    public void c() {
        e();
    }
}
