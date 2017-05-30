package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.p;
import com.fimi.overseas.soul.R;
import it.a.a.e;

public class RemoteRollerView extends View {
    private static final float A = 0.1718f;
    private static final float B = 0.35f;
    private static final float C = 0.522f;
    private static final int D = 21;
    private static final int E = 22;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 51;
    public static final int f = 1;
    public static final int g = 50;
    private static final int m = -14671840;
    private static final float w = 0.2229f;
    private static final float x = 0.3851f;
    private static final float y = 0.175f;
    private static final float z = 0.4685f;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private Paint l;
    private int n;
    private RectF o;
    private RectF p;
    private Bitmap q;
    private int r;
    private float s;
    private float t;
    private float u;
    private Context v;

    public RemoteRollerView(Context context) {
        this(context, null);
    }

    public RemoteRollerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.v = context;
        this.h = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_left_up_empty);
        this.i = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_left_down_empty);
        this.j = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_right_up_empty);
        this.k = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_right_down_empty);
        this.l = new Paint();
        this.l.setAntiAlias(true);
        this.l.setColor(m);
        this.l.setStrokeWidth(p.b(context) * 0.092f);
        this.l.setStyle(Style.STROKE);
        setLayerType(2, this.l);
    }

    public RemoteRollerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0;
        this.r = 0;
        this.s = 0.0f;
    }

    private void a(int i, Canvas canvas) {
        switch (i) {
            case 0:
                canvas.drawBitmap(this.h, ((float) getWidth()) * w, ((float) getHeight()) * x, this.l);
                this.o = new RectF(((float) getWidth()) * A, ((float) getHeight()) * B, (((float) getWidth()) * A) + this.u, (((float) getHeight()) * B) + this.u);
                this.p = new RectF(((float) getWidth()) * w, ((float) getHeight()) * x, (((float) getWidth()) * w) + ((float) this.h.getWidth()), (((float) getHeight()) * x) + ((float) this.h.getHeight()));
                this.r = e.D;
                this.s = ((this.t - 50.0f) / 50.0f) * 21.0f;
                return;
            case 1:
                canvas.drawBitmap(this.i, ((float) getWidth()) * y, ((float) getHeight()) * z, this.l);
                this.o = new RectF(((float) getWidth()) * A, ((float) getHeight()) * B, (((float) getWidth()) * A) + this.u, (((float) getHeight()) * B) + this.u);
                this.p = new RectF(((float) getWidth()) * y, ((float) getHeight()) * z, (((float) getWidth()) * y) + ((float) this.i.getWidth()), (((float) getHeight()) * z) + ((float) this.i.getHeight()));
                this.r = 215;
                this.s = ((-this.t) / 50.0f) * 22.0f;
                return;
            case 2:
                canvas.drawBitmap(this.j, ((float) (getWidth() - this.j.getWidth())) - (((float) getWidth()) * w), ((float) getHeight()) * x, this.l);
                this.o = new RectF((((float) getWidth()) - (((float) getWidth()) * A)) - this.u, ((float) getHeight()) * B, ((float) getWidth()) - (((float) getWidth()) * A), (((float) getHeight()) * B) + this.u);
                this.p = new RectF(((float) (getWidth() - this.j.getWidth())) - (((float) getWidth()) * w), ((float) getHeight()) * x, ((float) getWidth()) - (((float) getWidth()) * w), (((float) getHeight()) * x) + ((float) this.h.getHeight()));
                this.r = 314;
                this.s = ((-(this.t - 50.0f)) / 50.0f) * 21.0f;
                return;
            case 3:
                canvas.drawBitmap(this.k, ((float) (getWidth() - this.k.getWidth())) - (((float) getWidth()) * y), ((float) getHeight()) * z, this.l);
                this.o = new RectF((((float) getWidth()) - (((float) getWidth()) * A)) - this.u, ((float) getHeight()) * B, ((float) getWidth()) - (((float) getWidth()) * A), (((float) getHeight()) * B) + this.u);
                this.p = new RectF(((float) (getWidth() - this.k.getWidth())) - (((float) getWidth()) * y), ((float) getHeight()) * z, ((float) getWidth()) - (((float) getWidth()) * y), (((float) getHeight()) * z) + ((float) this.k.getHeight()));
                this.r = 325;
                this.s = (this.t / 50.0f) * 22.0f;
                return;
            default:
                return;
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        a(this.n, canvas);
        canvas.drawArc(this.o, (float) this.r, this.s, false, this.l);
        this.l.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(this.q, null, this.p, this.l);
        this.l.setXfermode(null);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.u = p.b(this.v) * C;
    }

    public void setInitView(int i) {
        this.n = i;
        switch (i) {
            case 0:
                this.q = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_left_up_full);
                return;
            case 1:
                this.q = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_left_down_full);
                return;
            case 2:
                this.q = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_right_up_full);
                return;
            case 3:
                this.q = BitmapFactory.decodeResource(getResources(), R.drawable.arrow_right_down_full);
                return;
            default:
                return;
        }
    }

    public void setSweep(float f) {
        this.t = f;
        invalidate();
    }
}
