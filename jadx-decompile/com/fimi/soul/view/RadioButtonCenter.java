package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.fimi.overseas.soul.R;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class RadioButtonCenter extends RadioButton {
    private Drawable a;

    public RadioButtonCenter(Context context) {
        super(context);
    }

    public RadioButtonCenter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioButtonCenter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadioButtonCenter, i, 0);
        try {
            this.a = obtainStyledAttributes.getDrawable(0);
            setButtonDrawable(AsyncImageView.a);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            this.a.setState(getDrawableState());
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.a.getIntrinsicHeight();
            int i = 0;
            switch (gravity) {
                case 16:
                    i = (getHeight() - intrinsicHeight) / 2;
                    break;
                case 80:
                    i = getHeight() - intrinsicHeight;
                    break;
            }
            gravity = this.a.getIntrinsicWidth();
            int width = (getWidth() - gravity) / 2;
            this.a.setBounds(width, i, gravity + width, intrinsicHeight + i);
            this.a.draw(canvas);
        }
    }
}
