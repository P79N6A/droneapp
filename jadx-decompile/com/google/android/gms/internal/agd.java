package com.google.android.gms.internal;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.d;

public class agd extends a implements d {
    private final SeekBar a;
    private final long b;
    private final OnSeekBarChangeListener c;
    private boolean d = true;

    public agd(SeekBar seekBar, long j, final OnSeekBarChangeListener onSeekBarChangeListener) {
        this.a = seekBar;
        this.b = j;
        this.c = new OnSeekBarChangeListener(this) {
            final /* synthetic */ agd b;

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                this.b.a(false);
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                this.b.a(true);
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStopTrackingTouch(seekBar);
                }
                c a = this.b.a();
                if (a != null && a.t()) {
                    a.a((long) seekBar.getProgress());
                }
            }
        };
    }

    public void a(long j, long j2) {
        if (e()) {
            this.a.setMax((int) j2);
            this.a.setProgress((int) j);
        }
    }

    public void a(com.google.android.gms.cast.framework.d dVar) {
        super.a(dVar);
        this.a.setOnSeekBarChangeListener(this.c);
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

    public void a(boolean z) {
        this.d = z;
    }

    public void b() {
        if (a() != null) {
            a().a(this);
        }
        this.a.setOnSeekBarChangeListener(null);
        this.a.setProgress(0);
        this.a.setMax(1);
        super.b();
    }

    public void d() {
    }

    public boolean e() {
        return this.d;
    }
}
