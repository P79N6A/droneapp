package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class AutoScrollTextView extends TextView implements OnClickListener {
    public static final String a = AutoScrollTextView.class.getSimpleName();
    public boolean b = false;
    String c;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 0.0f;
    private Paint j = null;
    private CharSequence k = "";
    private float l = 0.5f;
    private int m = ViewCompat.MEASURED_STATE_MASK;
    private int n = 0;

    public AutoScrollTextView(Context context) {
        super(context);
        c();
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        setOnClickListener(this);
    }

    public void a() {
        this.b = true;
        invalidate();
    }

    public void a(float f) {
        this.k = super.getText();
        this.j = super.getPaint();
        this.k = getText().toString();
        this.d = this.j.measureText(this.k.toString());
        this.e = (float) getWidth();
        this.e = f;
        this.f = this.d;
        this.h = this.e + this.d;
        this.i = this.e + (this.d * 1.5f);
        this.g = getTextSize() + ((float) getPaddingTop());
        this.j.setColor(this.m);
    }

    public void b() {
        this.b = false;
        invalidate();
    }

    public float getSpeed() {
        return this.l;
    }

    public int getTextColor() {
        return this.m;
    }

    public void onClick(View view) {
        if (this.b) {
            b();
        } else {
            a();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.j != null) {
            canvas.drawText(this.k, 0, this.k.length(), this.h - this.f, this.g, this.j);
            if (this.b) {
                this.f += this.l;
                if (this.f > this.i) {
                    this.n++;
                    if (this.n == this.k.length()) {
                        this.n = 0;
                    }
                    a(0.0f);
                    this.f = this.d;
                }
                invalidate();
            }
        }
    }

    public void setSpeed(float f) {
        this.l = f;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a(0.0f);
    }

    public void setTextColor(int i) {
        this.m = i;
    }
}
