package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.g;

public class MapWrapperLayout extends RelativeLayout {
    private c a;
    private int b;
    private g c;
    private View d;

    public MapWrapperLayout(Context context) {
        super(context);
    }

    public MapWrapperLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MapWrapperLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(c cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    public void a(g gVar, View view) {
        this.c = gVar;
        this.d = view;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.c == null || !this.c.j() || this.a == null || this.d == null) {
            z = false;
        } else {
            Point a = this.a.n().a(this.c.c());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation((float) ((-a.x) + (this.d.getWidth() / 3)), (float) (((-a.y) + this.d.getHeight()) + this.b));
            z = this.d.dispatchTouchEvent(obtain);
        }
        return z || super.dispatchTouchEvent(motionEvent);
    }
}
