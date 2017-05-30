package com.fimi.soul.view.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View;

public class b implements OnDoubleTapListener {
    private a a;

    public b(a aVar) {
        a(aVar);
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        try {
            float scale = this.a.getScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (scale < this.a.getMediumScale()) {
                this.a.a(this.a.getMediumScale(), x, y, true);
                return true;
            } else if (scale < this.a.getMediumScale() || scale >= this.a.getMaximumScale()) {
                this.a.a(this.a.getMinimumScale(), x, y, true);
                return true;
            } else {
                this.a.a(this.a.getMaximumScale(), x, y, true);
                return true;
            }
        } catch (Exception e) {
            return true;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        View a = this.a.a();
        if (a == null) {
            return false;
        }
        if (this.a.getOnPhotoTapListener() != null) {
            RectF c = this.a.c();
            if (c != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (c.contains(x, y)) {
                    this.a.getOnPhotoTapListener().a(a, (x - c.left) / c.width(), (y - c.top) / c.height());
                    return true;
                }
            }
        }
        if (this.a.getOnViewTapListener() == null) {
            return false;
        }
        this.a.getOnViewTapListener().a(a, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
