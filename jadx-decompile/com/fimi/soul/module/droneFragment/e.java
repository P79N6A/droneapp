package com.fimi.soul.module.droneFragment;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.maps.model.g;

public abstract class e implements OnTouchListener {
    private final View a;
    private final Drawable b;
    private final Drawable c;
    private final Handler d = new Handler();
    private g e;
    private boolean f = false;
    private final Runnable g = new Runnable(this) {
        final /* synthetic */ e a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.b()) {
                this.a.a(this.a.a, this.a.e);
            }
        }
    };

    public e(View view, Drawable drawable, Drawable drawable2) {
        this.a = view;
        this.b = drawable;
        this.c = drawable2;
    }

    private void a() {
        if (!this.f) {
            this.f = true;
            this.d.removeCallbacks(this.g);
            this.a.setBackgroundDrawable(this.c);
            if (this.e != null) {
                this.e.h();
            }
        }
    }

    private boolean b() {
        if (!this.f) {
            return false;
        }
        this.f = false;
        this.d.removeCallbacks(this.g);
        this.a.setBackgroundDrawable(this.b);
        if (this.e != null) {
            this.e.h();
        }
        return true;
    }

    protected abstract void a(View view, g gVar);

    public void a(g gVar) {
        this.e = gVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (0.0f <= motionEvent.getX() && motionEvent.getX() <= ((float) this.a.getWidth()) && 0.0f <= motionEvent.getY() && motionEvent.getY() <= ((float) this.a.getHeight())) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    a();
                    break;
                case 1:
                    this.d.postDelayed(this.g, 150);
                    break;
                case 3:
                    b();
                    break;
            }
        }
        b();
        return false;
    }
}
