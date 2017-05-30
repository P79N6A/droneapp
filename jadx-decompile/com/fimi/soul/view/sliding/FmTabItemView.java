package com.fimi.soul.view.sliding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.kernel.utils.p;

public class FmTabItemView extends LinearLayout {
    private Context a;
    private int b;
    private TextView c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private int h;
    private int i;
    private int j;
    private int k;

    public FmTabItemView(Context context) {
        this(context, null);
    }

    public FmTabItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(17);
        setPadding(10, 10, 10, 10);
        this.a = context;
        this.c = new TextView(context);
        this.c.setGravity(17);
        this.c.setLayoutParams(new LayoutParams(-1, -2));
        this.c.setFocusable(true);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setCompoundDrawablePadding(10);
        this.c.setSingleLine();
        addView(this.c);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.h = p.e(this.a, (float) i);
        this.i = p.e(this.a, (float) i2);
        this.j = p.e(this.a, (float) i3);
        this.k = p.e(this.a, (float) i4);
    }

    public void a(int i, String str) {
        this.b = i;
        this.c.setText(str);
    }

    public void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.d = drawable;
        this.e = drawable2;
        this.f = drawable3;
        this.g = drawable4;
        if (this.d != null) {
            this.d.setBounds(this.h, this.i, this.j, this.k);
        }
        if (this.e != null) {
            this.e.setBounds(this.h, this.i, this.j, this.k);
        }
        if (this.f != null) {
            this.f.setBounds(this.h, this.i, this.j, this.k);
        }
        if (this.g != null) {
            this.g.setBounds(this.h, this.i, this.j, this.k);
        }
        this.c.setCompoundDrawables(this.d, this.e, this.f, this.g);
    }

    public int getIndex() {
        return this.b;
    }

    public TextView getTextView() {
        return this.c;
    }

    public void setTabBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setTabBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setTabTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTabTextSize(int i) {
        p.b(this.c, (float) i);
    }
}
