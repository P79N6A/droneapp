package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import com.fimi.soul.b.f;

public class MyGridView extends GridView {
    private f a;

    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        if (this.a != null) {
            this.a.a();
        }
        super.onMeasure(i, i2);
    }

    public void setAdapter(f fVar) {
        this.a = fVar;
        super.setAdapter(fVar);
    }
}
