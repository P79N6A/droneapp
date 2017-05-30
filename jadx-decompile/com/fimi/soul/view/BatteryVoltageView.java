package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;

public class BatteryVoltageView extends View {
    private static final int m = Color.parseColor("#19ffffff");
    private static final int n = Color.parseColor("#222225");
    private static final int o = Color.parseColor("#30b0e5");
    private Context a;
    private Paint b;
    private RectF c;
    private Paint d;
    private RectF e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private int j = 0;
    private boolean k = false;
    private a l = a.NOMAL;

    public enum a {
        NOMAL,
        EXCEPT,
        DAMAGE
    }

    public BatteryVoltageView(Context context) {
        super(context);
        a(context);
    }

    public BatteryVoltageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public BatteryVoltageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private Bitmap a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Config.ARGB_8888);
        int height = (int) (8.0f + (((float) (this.g.getHeight() - 10)) - ((((float) this.j) / 100.0f) * ((float) (this.g.getHeight() - 10)))));
        Canvas canvas = new Canvas(createBitmap);
        if (this.l == a.NOMAL) {
            canvas.drawBitmap(this.g, 0.0f, 0.0f, paint);
        } else if (this.l == a.EXCEPT) {
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(this.i, 0.0f, 0.0f, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        paint.setColor(n);
        float f = (float) height;
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), f, paint);
        return createBitmap;
    }

    public void a(Context context) {
        this.a = context;
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.c = new RectF();
        this.d = new Paint();
        this.f = BitmapFactory.decodeResource(getResources(), R.drawable.img_battery_frame);
        this.g = BitmapFactory.decodeResource(getResources(), R.drawable.img_battery_blue);
        this.h = BitmapFactory.decodeResource(getResources(), R.drawable.img_battery_orange);
        this.i = BitmapFactory.decodeResource(getResources(), R.drawable.img_battery_red);
    }

    public void a(a aVar) {
        this.l = aVar;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f, 0.0f, 0.0f, this.b);
        canvas.drawBitmap(a(), 0.0f, 0.0f, this.b);
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.g.getWidth(), this.g.getHeight());
    }

    public void setPercent(int i) {
        this.j = i;
        invalidate();
    }
}
