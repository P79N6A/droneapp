package com.mining.app.zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;
import com.google.zxing.ResultPoint;
import com.tencent.open.yyb.TitleBar;
import java.util.Collection;
import java.util.HashSet;

public final class ViewfinderView extends View {
    private static final int[] b = new int[]{0, 64, 128, 192, 255, 192, 128, 64};
    private static final String c = "log";
    private static final long d = 10;
    private static final int e = 255;
    private static final int g = 10;
    private static final int h = 6;
    private static final int i = 2;
    private static final int j = 2;
    private static float k = 0.0f;
    private static final int l = 16;
    private static final int m = 30;
    boolean a;
    private int f = ((int) (TitleBar.BACKBTN_LEFT_MARGIN * k));
    private Paint n = new Paint();
    private int o;
    private int p;
    private Bitmap q;
    private final int r;
    private final int s;
    private final int t;
    private Collection<ResultPoint> u;
    private Collection<ResultPoint> v;
    private int w;
    private int x;
    private Paint y;
    private int z;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k = context.getResources().getDisplayMetrics().density;
        Resources resources = getResources();
        this.r = resources.getColor(R.color.viewfinder_mask);
        this.s = resources.getColor(R.color.result_view);
        this.w = resources.getColor(R.color.viewfinder_laser);
        this.z = resources.getColor(R.color.kuang);
        this.t = resources.getColor(R.color.possible_result_points);
        this.u = new HashSet(5);
        this.y = new Paint();
        this.y.setStyle(Style.STROKE);
        this.y.setColor(this.z);
        int i = (int) ((4.0f * k) / c.a);
        this.y.setStrokeWidth((float) i);
        this.n.setStrokeWidth((float) i);
    }

    public void a() {
        this.q = null;
        invalidate();
    }

    public void a(Bitmap bitmap) {
        this.q = bitmap;
        invalidate();
    }

    public void a(ResultPoint resultPoint) {
        this.u.add(resultPoint);
    }

    public void onDraw(Canvas canvas) {
        Rect e = com.mining.app.zxing.a.c.a().e();
        if (e != null) {
            if (!this.a) {
                this.a = true;
                this.o = e.top;
                this.p = e.bottom;
            }
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.n.setColor(this.q != null ? this.s : this.r);
            canvas.drawRect(0.0f, 0.0f, (float) width, (float) e.top, this.n);
            canvas.drawRect(0.0f, (float) e.top, (float) e.left, (float) (e.bottom + 1), this.n);
            canvas.drawRect((float) (e.right + 1), (float) e.top, (float) width, (float) (e.bottom + 1), this.n);
            canvas.drawRect(0.0f, (float) (e.bottom + 1), (float) width, (float) height, this.n);
            canvas.drawRect((float) e.left, (float) e.top, (float) e.right, (float) e.bottom, this.y);
            if (this.q != null) {
                this.n.setAlpha(255);
                canvas.drawBitmap(this.q, (float) e.left, (float) e.top, this.n);
                return;
            }
            this.o += 2;
            if (this.o >= e.bottom) {
                this.o = e.top;
            }
            this.n.setColor(this.w);
            canvas.drawRect((float) (e.left + 2), (float) (this.o - 3), (float) (e.right - 2), (float) (this.o + 3), this.n);
            postInvalidateDelayed(d, e.left, e.top, e.right, e.bottom);
        }
    }
}
