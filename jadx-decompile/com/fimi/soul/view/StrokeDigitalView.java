package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.support.v4.view.ViewCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class StrokeDigitalView extends TextView {
    private TextView a = null;

    public StrokeDigitalView(Context context) {
        super(context);
        this.a = new TextView(context);
        ao.b(context.getAssets(), this.a, this);
        a();
    }

    public StrokeDigitalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new TextView(context, attributeSet);
        ao.b(context.getAssets(), this.a, this);
        a();
    }

    public StrokeDigitalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new TextView(context, attributeSet, i);
        ao.b(context.getAssets(), this.a, this);
        a();
    }

    public void a() {
        TextPaint paint = this.a.getPaint();
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Style.STROKE);
        this.a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.a.setGravity(getGravity());
    }

    protected void onDraw(Canvas canvas) {
        this.a.draw(canvas);
        super.onDraw(canvas);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.layout(i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        CharSequence text = this.a.getText();
        if (text == null || !text.equals(getText())) {
            this.a.setText(getText());
            postInvalidate();
        }
        super.onMeasure(i, i2);
        this.a.measure(i, i2);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.a.setLayoutParams(layoutParams);
    }
}
