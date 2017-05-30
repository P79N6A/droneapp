package com.fimi.soul.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPage extends ViewPager {
    PointF a = new PointF();
    PointF b = new PointF();
    private float c;

    public MyViewPage(Context context) {
        super(context);
    }

    public MyViewPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        System.out.println("MyViewPage2 onInterceptTouchEvent");
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.b.x = motionEvent.getX();
        this.b.y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.a.x = motionEvent.getX();
            this.a.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1 && this.a.x == this.b.x && this.a.y == this.b.y) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
