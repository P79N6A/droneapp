package com.fimi.soul.view.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchableMap extends FrameLayout {
    private a a;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    public TouchableMap(Context context) {
        super(context);
    }

    public TouchableMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchableMap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            this.a.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNonConsumingTouchListener(a aVar) {
        this.a = aVar;
    }
}
