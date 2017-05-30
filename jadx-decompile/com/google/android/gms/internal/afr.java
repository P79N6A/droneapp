package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.view.View;
import com.google.android.gms.cast.AdBreakInfo;
import java.util.List;

public class afr extends View {
    private final int a = a(getContext(), 3.0d);
    private int b = 1;
    private List<AdBreakInfo> c;
    private Paint d;

    public afr(Context context) {
        super(context);
    }

    private static int a(Context context, double d) {
        return context == null ? (int) Math.round(d) : (int) Math.round(((double) context.getResources().getDisplayMetrics().density) * d);
    }

    public synchronized void a(int i) {
        this.b = i;
    }

    public synchronized void a(List<AdBreakInfo> list, @ColorInt int i) {
        this.c = list;
        this.d = new Paint(1);
        this.d.setColor(i);
        this.d.setStyle(Style.FILL);
        invalidate();
    }

    protected synchronized void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (!(this.c == null || this.c.isEmpty())) {
            int round = Math.round(((float) getMeasuredHeight()) / 2.0f);
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (AdBreakInfo adBreakInfo : this.c) {
                if (adBreakInfo != null) {
                    long b = adBreakInfo.b();
                    if (b >= 0 && b <= ((long) this.b)) {
                        canvas.drawCircle((float) (((int) ((((double) b) * ((double) measuredWidth)) / ((double) this.b))) + getPaddingLeft()), (float) round, (float) this.a, this.d);
                    }
                }
            }
        }
    }
}
