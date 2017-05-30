package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.toolbox.k.c;
import com.android.volley.toolbox.k.d;
import com.android.volley.u;

public class NetworkImageView extends ImageView {
    private String a;
    private int b;
    private int c;
    private k d;
    private c e;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a() {
        if (this.b != 0) {
            setImageResource(this.b);
        } else {
            setImageBitmap(null);
        }
    }

    public void a(String str, k kVar) {
        this.a = str;
        this.d = kVar;
        a(false);
    }

    void a(final boolean z) {
        Object obj;
        Object obj2;
        Object obj3 = 1;
        int width = getWidth();
        int height = getHeight();
        ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            Object obj4 = getLayoutParams().height == -2 ? 1 : null;
            obj = getLayoutParams().width == -2 ? 1 : null;
            obj2 = obj4;
        } else {
            obj2 = null;
            obj = null;
        }
        if (obj == null || obj2 == null) {
            obj3 = null;
        }
        if (width != 0 || height != 0 || r1 != null) {
            if (TextUtils.isEmpty(this.a)) {
                if (this.e != null) {
                    this.e.a();
                    this.e = null;
                }
                a();
                return;
            }
            if (!(this.e == null || this.e.c() == null)) {
                if (!this.e.c().equals(this.a)) {
                    this.e.a();
                    a();
                } else {
                    return;
                }
            }
            int i = obj != null ? 0 : width;
            if (obj2 != null) {
                height = 0;
            }
            this.e = this.d.a(this.a, new d(this) {
                final /* synthetic */ NetworkImageView b;

                public void a(final c cVar, boolean z) {
                    if (z && z) {
                        this.b.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void run() {
                                this.b.a(cVar, false);
                            }
                        });
                    } else if (cVar.b() != null) {
                        this.b.setImageBitmap(cVar.b());
                    } else if (this.b.b != 0) {
                        this.b.setImageResource(this.b.b);
                    }
                }

                public void a(u uVar) {
                    if (this.b.c != 0) {
                        this.b.setImageResource(this.b.c);
                    }
                }
            }, i, height, scaleType);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public String getImageURL() {
        return this.a;
    }

    protected void onDetachedFromWindow() {
        if (this.e != null) {
            this.e.a();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    public void setDefaultImageResId(int i) {
        this.b = i;
    }

    public void setErrorImageResId(int i) {
        this.c = i;
    }
}
