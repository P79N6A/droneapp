package com.fimi.soul.view.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class CropViewBase extends ImageView {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    static final float n = 1.25f;
    private static final String o = "ImageViewTouchBase";
    protected Matrix a;
    protected Matrix b;
    public final a c;
    int d;
    int e;
    float f;
    protected int j;
    protected Handler k;
    protected int l;
    protected int m;
    private final Matrix p;
    private final float[] q;
    private a r;
    private Runnable s;

    public interface a {
        void a(Bitmap bitmap);
    }

    public CropViewBase(Context context) {
        super(context);
        this.a = new Matrix();
        this.b = new Matrix();
        this.p = new Matrix();
        this.q = new float[9];
        this.c = new a(null);
        this.d = -1;
        this.e = -1;
        this.j = 0;
        this.k = new Handler();
        this.s = null;
        e();
    }

    public CropViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Matrix();
        this.b = new Matrix();
        this.p = new Matrix();
        this.q = new float[9];
        this.c = new a(null);
        this.d = -1;
        this.e = -1;
        this.j = 0;
        this.k = new Handler();
        this.s = null;
        e();
    }

    private void a(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap b = this.c.b();
        this.c.a(bitmap);
        this.c.a(i);
        if (b != null && b != bitmap && this.r != null) {
            this.r.a(b);
        }
    }

    private void a(a aVar, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f = (float) aVar.f();
        float e = (float) aVar.e();
        matrix.reset();
        float min = Math.min(Math.min(width / f, 2.0f), Math.min(height / e, 2.0f));
        matrix.postConcat(aVar.c());
        matrix.postScale(min, min);
        matrix.postTranslate((width - (f * min)) / 2.0f, (height - (e * min)) / 2.0f);
    }

    private void e() {
        setScaleType(ScaleType.MATRIX);
    }

    protected float a(Matrix matrix) {
        return a(matrix, 0);
    }

    protected float a(Matrix matrix, int i) {
        matrix.getValues(this.q);
        return this.q[i];
    }

    public void a() {
        a(null, true);
    }

    protected void a(float f) {
        a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    protected void a(float f, float f2) {
        this.b.postTranslate(f, f2);
    }

    protected void a(float f, float f2, float f3) {
        if (f > this.f) {
            f = this.f;
        }
        float scale = f / getScale();
        this.b.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        a(true, true);
    }

    protected void a(float f, float f2, float f3, float f4) {
        final float scale = (f - getScale()) / f4;
        final float scale2 = getScale();
        final long currentTimeMillis = System.currentTimeMillis();
        final float f5 = f4;
        final float f6 = f2;
        final float f7 = f3;
        this.k.post(new Runnable(this) {
            final /* synthetic */ CropViewBase g;

            public void run() {
                float min = Math.min(f5, (float) (System.currentTimeMillis() - currentTimeMillis));
                this.g.a(scale2 + (scale * min), f6, f7);
                if (min < f5) {
                    this.g.k.post(this);
                }
            }
        });
    }

    public void a(Bitmap bitmap, boolean z) {
        a(new a(bitmap), z);
    }

    public void a(final a aVar, final boolean z) {
        if (getWidth() <= 0) {
            this.s = new Runnable(this) {
                final /* synthetic */ CropViewBase c;

                public void run() {
                    this.c.a(aVar, z);
                }
            };
            return;
        }
        if (aVar.b() != null) {
            a(aVar, this.a);
            a(aVar.b(), aVar.a());
        } else {
            this.a.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.b.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.f = b();
    }

    public void a(boolean z, boolean z2) {
        float f = 0.0f;
        if (this.c.b() != null) {
            int height;
            Matrix imageViewMatrix = getImageViewMatrix();
            RectF rectF = new RectF(0.0f, 0.0f, (float) this.c.b().getWidth(), (float) this.c.b().getHeight());
            imageViewMatrix.mapRect(rectF);
            float height2 = rectF.height();
            float width = rectF.width();
            if (z2) {
                height = getHeight();
                if (height2 < ((float) height)) {
                    height2 = ((((float) height) - height2) / 2.0f) - rectF.top;
                } else if (rectF.top > 0.0f) {
                    height2 = -rectF.top;
                } else if (rectF.bottom < ((float) height)) {
                    height2 = ((float) getHeight()) - rectF.bottom;
                }
                if (z) {
                    height = getWidth();
                    if (width < ((float) height)) {
                        f = ((((float) height) - width) / 2.0f) - rectF.left;
                    } else if (rectF.left > 0.0f) {
                        f = -rectF.left;
                    } else if (rectF.right < ((float) height)) {
                        f = ((float) height) - rectF.right;
                    }
                }
                a(f, height2);
                setImageMatrix(getImageViewMatrix());
            }
            height2 = 0.0f;
            if (z) {
                height = getWidth();
                if (width < ((float) height)) {
                    f = ((((float) height) - width) / 2.0f) - rectF.left;
                } else if (rectF.left > 0.0f) {
                    f = -rectF.left;
                } else if (rectF.right < ((float) height)) {
                    f = ((float) height) - rectF.right;
                }
            }
            a(f, height2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    protected float b() {
        if (this.c.b() == null) {
            return 1.0f;
        }
        float max = Math.max(((float) this.c.f()) / ((float) this.d), ((float) this.c.e()) / ((float) this.e)) * 4.0f;
        return max >= 1.0f ? max : 1.0f;
    }

    protected void b(float f) {
        if (getScale() < this.f && this.c.b() != null) {
            this.b.postScale(f, f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            setImageMatrix(getImageViewMatrix());
        }
    }

    protected void b(float f, float f2) {
        a(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    protected void c() {
        b(n);
    }

    protected void c(float f) {
        if (this.c.b() != null) {
            float width = ((float) getWidth()) / 2.0f;
            float height = ((float) getHeight()) / 2.0f;
            Matrix matrix = new Matrix(this.b);
            matrix.postScale(1.0f / f, 1.0f / f, width, height);
            if (a(matrix) < 1.0f) {
                this.b.setScale(1.0f, 1.0f, width, height);
            } else {
                this.b.postScale(1.0f / f, 1.0f / f, width, height);
            }
            setImageMatrix(getImageViewMatrix());
            a(true, true);
        }
    }

    protected void d() {
        c(n);
    }

    protected Matrix getImageViewMatrix() {
        this.p.set(this.a);
        this.p.postConcat(this.b);
        return this.p;
    }

    public float getScale() {
        return a(this.b);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        a(1.0f);
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d = i3 - i;
        this.e = i4 - i2;
        Runnable runnable = this.s;
        if (runnable != null) {
            this.s = null;
            runnable.run();
        }
        if (this.c.b() != null) {
            a(this.c, this.a);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        a(bitmap, 0);
    }

    public void setRecycler(a aVar) {
        this.r = aVar;
    }
}
