package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.plus.internal.g;

public final class PlusOneButton extends FrameLayout {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = -1;
    private View i;
    private int j;
    private int k;
    private String l;
    private int m;
    private b n;

    public interface b {
        void a(Intent intent);
    }

    protected class a implements OnClickListener, b {
        final /* synthetic */ PlusOneButton a;
        private final b b;

        public a(PlusOneButton plusOneButton, b bVar) {
            this.a = plusOneButton;
            this.b = bVar;
        }

        public void a(Intent intent) {
            Context context = this.a.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, this.a.m);
            }
        }

        public void onClick(View view) {
            Intent intent = (Intent) this.a.i.getTag();
            if (this.b != null) {
                this.b.a(intent);
            } else {
                a(intent);
            }
        }
    }

    public PlusOneButton(Context context) {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = a(context, attributeSet);
        this.k = b(context, attributeSet);
        this.m = -1;
        a(getContext());
        if (!isInEditMode()) {
        }
    }

    protected static int a(Context context, AttributeSet attributeSet) {
        String a = l.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        return "SMALL".equalsIgnoreCase(a) ? 0 : "MEDIUM".equalsIgnoreCase(a) ? 1 : "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    private void a(Context context) {
        if (this.i != null) {
            removeView(this.i);
        }
        this.i = g.a(context, this.j, this.k, this.l, this.m);
        setOnPlusOneClickListener(this.n);
        addView(this.i);
    }

    protected static int b(Context context, AttributeSet attributeSet) {
        String a = l.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        return "INLINE".equalsIgnoreCase(a) ? 2 : !"NONE".equalsIgnoreCase(a) ? 1 : 0;
    }

    public void a() {
        this.i.performClick();
    }

    public void a(String str, int i) {
        d.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.l = str;
        this.m = i;
        a(getContext());
    }

    public void a(String str, b bVar) {
        this.l = str;
        this.m = 0;
        a(getContext());
        setOnPlusOneClickListener(bVar);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i.layout(0, 0, i3 - i, i4 - i2);
    }

    protected void onMeasure(int i, int i2) {
        View view = this.i;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.k = i;
        a(getContext());
    }

    public void setIntent(Intent intent) {
        this.i.setTag(intent);
    }

    public void setOnPlusOneClickListener(b bVar) {
        this.n = bVar;
        this.i.setOnClickListener(new a(this, bVar));
    }

    public void setSize(int i) {
        this.j = i;
        a(getContext());
    }
}
