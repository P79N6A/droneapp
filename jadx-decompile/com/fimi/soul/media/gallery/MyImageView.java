package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class MyImageView extends ImageView {
    private a a;

    public interface a {
        void a(int i, int i2);
    }

    public MyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != null) {
            this.a.a(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setOnMeasureListener(a aVar) {
        this.a = aVar;
    }
}
