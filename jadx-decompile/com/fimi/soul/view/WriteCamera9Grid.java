package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;

public class WriteCamera9Grid extends View {
    private Paint a;
    private float b;
    private float c;
    private int d;
    private int e;

    public WriteCamera9Grid(Context context) {
        super(context);
    }

    public WriteCamera9Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WriteCamera9Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.a = new Paint();
        this.a.setColor(getResources().getColor(R.color.white));
        this.a.setAlpha(153);
        this.a.setStrokeWidth(1.0f);
        this.a.setAntiAlias(true);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.b = (float) displayMetrics.widthPixels;
        this.c = (float) displayMetrics.heightPixels;
        this.d = (int) (this.b / c.a);
        this.e = (int) (this.c / c.a);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, (float) this.e, this.b, (float) this.e, this.a);
        canvas.drawLine(0.0f, (float) (this.e * 2), this.b, (float) (this.e * 2), this.a);
        canvas.drawLine((float) this.d, 0.0f, (float) this.d, this.c, this.a);
        canvas.drawLine((float) (this.d * 2), 0.0f, (float) (this.d * 2), this.c, this.a);
    }
}
