package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

public class MyExpandableListView extends ExpandableListView {
    private float a;
    private float b;
    private int c;

    public MyExpandableListView(Context context) {
        super(context);
        a();
    }

    public MyExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MyExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.a = x;
                this.b = y;
                break;
            case 2:
                action = (int) (this.a - x);
                boolean z = Math.abs(action) > this.c && Math.abs(((int) (this.b - y)) / action) < 1;
                if (z) {
                    return true;
                }
                break;
        }
        return false;
    }
}
