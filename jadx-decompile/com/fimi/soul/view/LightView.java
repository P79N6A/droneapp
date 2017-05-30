package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;

public class LightView extends View {
    Typeface a = null;
    private Paint b;
    private Paint c;
    private int d = 0;
    private int e = 0;
    private Context f;
    private Bitmap g;

    public LightView(Context context) {
        super(context);
        this.f = context;
        a();
    }

    public LightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context;
        a();
    }

    void a() {
        this.b = new Paint();
        this.b.setColor(-1);
        this.b.setAlpha(80);
        this.b.setStrokeWidth(c.a);
        this.b.setStyle(Style.FILL);
        this.b.setAntiAlias(true);
        this.b.setTextSize(25.0f);
        this.c = new Paint();
        this.c.setColor(getResources().getColor(R.color.changebetery));
        this.c.setStrokeWidth(c.a);
        this.c.setTextSize(25.0f);
        this.c.setAntiAlias(true);
        this.c.setStyle(Style.FILL);
        if (this.a == null) {
            this.a = Typeface.createFromAsset(this.f.getAssets(), "DIN Alternate Bold.TTF");
        }
        this.c.setTypeface(this.a);
        this.b.setTypeface(this.a);
        this.g = BitmapFactory.decodeResource(getResources(), R.drawable.icon_brightness_circle);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dimension = this.f.getResources().getDimension(R.dimen.dp50);
        float width = (((float) getWidth()) - this.f.getResources().getDimension(R.dimen.dp100)) / 100.0f;
        Canvas canvas2 = canvas;
        canvas2.drawLine(this.f.getResources().getDimension(R.dimen.dp50), this.f.getResources().getDimension(R.dimen.dp28) + getY(), ((float) getWidth()) - this.f.getResources().getDimension(R.dimen.dp50), this.f.getResources().getDimension(R.dimen.dp28) + getY(), this.b);
        canvas2 = canvas;
        canvas2.drawLine(dimension + (0.0f * width), 8.0f + getY(), dimension + (0.0f * width), this.f.getResources().getDimension(R.dimen.dp20) + getY(), this.b);
        canvas2 = canvas;
        canvas2.drawLine(dimension + (100.0f * width), 8.0f + getY(), dimension + (100.0f * width), this.f.getResources().getDimension(R.dimen.dp20) + getY(), this.b);
        if (this.e != 0) {
            canvas.drawText("1%", dimension - (this.b.getTextSize() / 2.0f), getY() + this.f.getResources().getDimension(R.dimen.dp70), this.b);
        }
        if (this.e != 100) {
            canvas.drawText("100%", ((100.0f * width) + dimension) - this.b.getTextSize(), getY() + this.f.getResources().getDimension(R.dimen.dp70), this.b);
        }
        canvas.drawBitmap(this.g, ((((float) this.d) * width) + dimension) - (this.c.getTextSize() / 2.0f), getY() + this.f.getResources().getDimension(R.dimen.dp12_v), this.c);
        this.c.setColor(this.f.getResources().getColor(R.color.ev_color));
        canvas.drawText(String.valueOf(this.e + "%"), ((((float) this.d) * width) + dimension) - (this.b.getTextSize() / 2.0f), getY() + this.f.getResources().getDimension(R.dimen.dp70), this.c);
    }

    public void setLightPercent(int i) {
        this.e = Math.abs(i) <= 0 ? 1 : Math.abs(i);
        this.d = Math.abs(i);
        invalidate();
    }
}
