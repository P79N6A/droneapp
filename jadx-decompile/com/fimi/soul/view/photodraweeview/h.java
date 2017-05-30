package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class h implements OnScaleGestureListener {
    private static final int c = -1;
    float a;
    float b;
    private final float d;
    private final float e;
    private final ScaleGestureDetector f;
    private final f g;
    private VelocityTracker h;
    private boolean i;
    private int j = -1;
    private int k = 0;

    public h(Context context, f fVar) {
        this.f = new ScaleGestureDetector(context, this);
        this.g = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = (float) viewConfiguration.getScaledTouchSlop();
    }

    private void a(int i, MotionEvent motionEvent) {
        int i2 = 0;
        switch (i) {
            case 0:
                this.j = motionEvent.getPointerId(0);
                break;
            case 1:
            case 3:
                this.j = -1;
                break;
            case 6:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.j) {
                    actionIndex = actionIndex == 0 ? 1 : 0;
                    this.j = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.a = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.b = MotionEventCompat.getY(motionEvent, actionIndex);
                    break;
                }
                break;
        }
        if (this.j != -1) {
            i2 = this.j;
        }
        this.k = MotionEventCompat.findPointerIndex(motionEvent, i2);
    }

    private float b(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getX(motionEvent, this.k);
        } catch (Exception e) {
            return motionEvent.getX();
        }
    }

    private void b(int i, MotionEvent motionEvent) {
        boolean z = false;
        float yVelocity;
        switch (i) {
            case 0:
                this.h = VelocityTracker.obtain();
                if (this.h != null) {
                    this.h.addMovement(motionEvent);
                }
                this.a = b(motionEvent);
                this.b = c(motionEvent);
                this.i = false;
                return;
            case 1:
                if (this.i && this.h != null) {
                    this.a = b(motionEvent);
                    this.b = c(motionEvent);
                    this.h.addMovement(motionEvent);
                    this.h.computeCurrentVelocity(1000);
                    float xVelocity = this.h.getXVelocity();
                    yVelocity = this.h.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.e) {
                        this.g.a(this.a, this.b, -xVelocity, -yVelocity);
                    }
                }
                if (this.h != null) {
                    this.h.recycle();
                    this.h = null;
                    return;
                }
                return;
            case 2:
                yVelocity = b(motionEvent);
                float c = c(motionEvent);
                float f = yVelocity - this.a;
                float f2 = c - this.b;
                if (!this.i) {
                    if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.d)) {
                        z = true;
                    }
                    this.i = z;
                }
                if (this.i) {
                    this.g.a(f, f2);
                    this.a = yVelocity;
                    this.b = c;
                    if (this.h != null) {
                        this.h.addMovement(motionEvent);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.h != null) {
                    this.h.recycle();
                    this.h = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private float c(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getY(motionEvent, this.k);
        } catch (Exception e) {
            return motionEvent.getY();
        }
    }

    public boolean a() {
        return this.f.isInProgress();
    }

    public boolean a(MotionEvent motionEvent) {
        this.f.onTouchEvent(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        a(actionMasked, motionEvent);
        b(actionMasked, motionEvent);
        return true;
    }

    public boolean b() {
        return this.i;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.g.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.g.f();
    }
}
