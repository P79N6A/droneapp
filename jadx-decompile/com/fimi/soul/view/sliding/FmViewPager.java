package com.fimi.soul.view.sliding;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class FmViewPager extends ViewPager {
    private boolean a = true;

    public FmViewPager(Context context) {
        super(context);
    }

    public FmViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a ? super.onTouchEvent(motionEvent) : false;
    }

    public void setPagingEnabled(boolean z) {
        this.a = z;
    }
}
