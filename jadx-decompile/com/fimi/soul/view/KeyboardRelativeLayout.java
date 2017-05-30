package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class KeyboardRelativeLayout extends RelativeLayout {
    public static final byte a = (byte) -4;
    private static final String b = KeyboardRelativeLayout.class.getSimpleName();
    private a c;

    public interface a {
        void a(int i);
    }

    public KeyboardRelativeLayout(Context context) {
        super(context);
    }

    public KeyboardRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected boolean fitSystemWindows(Rect rect) {
        rect.top = 0;
        return super.fitSystemWindows(rect);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != null) {
            this.c.a(-4);
        }
    }

    public void setOnKeyboardStateChangedListener(a aVar) {
        this.c = aVar;
    }
}
