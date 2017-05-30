package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class MyRadioButton extends RadioButton {
    private Context a;
    private Drawable b;
    private int c;

    public MyRadioButton(Context context) {
        super(context);
        this.a = context;
    }

    public MyRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            int gravity = getGravity() & 17;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i = 0;
            switch (gravity) {
                case 16:
                    i = (getHeight() - intrinsicHeight) / 2;
                    break;
                case 80:
                    i = getHeight() - intrinsicHeight;
                    break;
            }
            gravity = (getWidth() - intrinsicWidth) / 2;
            drawable.setBounds(gravity, i, intrinsicWidth + gravity, intrinsicHeight + i);
            drawable.draw(canvas);
        }
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.c) {
            this.c = i;
            Drawable drawable = null;
            if (this.c != 0) {
                drawable = getResources().getDrawable(this.c);
            }
            setButtonDrawable(drawable);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            if (this.b != null) {
                this.b.setCallback(null);
                unscheduleDrawable(this.b);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.b = drawable;
            this.b.setState(null);
            setMinHeight(this.b.getIntrinsicHeight());
        }
        refreshDrawableState();
    }
}
