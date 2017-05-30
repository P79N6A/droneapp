package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;
import com.google.android.gms.maps.model.b;
import com.tencent.open.yyb.TitleBar;

public class TunWheel extends View {
    private static final int e = 5;
    private static final int h = 7;
    private static final int j = 8;
    private static final int k = 5;
    private static int l = 20;
    int a;
    Context b;
    private float c;
    private int d;
    private int f = 0;
    private int g = 5;
    private int i = 0;
    private a m;
    private Boolean n = Boolean.valueOf(true);
    private Bitmap o;

    public interface a {
        void a(float f);
    }

    public TunWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        this.c = getContext().getResources().getDisplayMetrics().density;
        if (((double) this.c) == 1.5d) {
            this.a = (int) (b.e * this.c);
        } else if (this.c == 2.0f) {
            this.a = (int) (this.c * 220.0f);
        } else if (this.c == c.a) {
            this.a = (int) (this.c * 220.0f);
        }
        setBackgroundDrawable(getResources().getDrawable(R.drawable.speedbg));
        this.o = BitmapFactory.decodeResource(getResources(), R.drawable.speedbg);
        if (this.o != null && !this.o.isRecycled()) {
            this.o.recycle();
        }
    }

    private void a() {
        if (this.m != null) {
            this.m.a((float) this.f);
        }
    }

    private void a(Canvas canvas) {
        canvas.save();
        Paint textPaint = new TextPaint(1);
        textPaint.setTextSize(11.0f * this.c);
        float desiredWidth = Layout.getDesiredWidth("0", textPaint);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.black));
        canvas.drawRect(4.0f * this.c, (((float) (getHeight() / 2)) - desiredWidth) - (this.c * 4.0f), ((float) getWidth()) - (this.c * 1.0f), (this.c * 2.0f) + (((float) (getHeight() / 2)) + desiredWidth), paint);
        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.linetun));
        paint.setStyle(Style.STROKE);
        if (this.n.booleanValue()) {
            canvas.drawRect(4.0f * this.c, (((float) (getHeight() / 2)) - desiredWidth) - (this.c * 4.0f), ((float) getWidth()) - (this.c * 1.0f), (this.c * 2.0f) + (((float) (getHeight() / 2)) + desiredWidth), paint);
        } else {
            canvas.drawRect((this.c * 4.0f) - this.c, (((float) (getHeight() / 2)) - desiredWidth) - (this.c * 4.0f), (((float) getWidth()) - (this.c * 1.0f)) - this.c, (this.c * 2.0f) + (((float) (getHeight() / 2)) + desiredWidth), paint);
        }
        textPaint.setColor(getResources().getColor(R.color.red));
        float desiredWidth2 = Layout.getDesiredWidth("0", textPaint);
        if (this.f >= 100 && this.f < 1000) {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), ((float) l) + (c.a * this.c), (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        } else if (this.f >= 1000) {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), (float) l, (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        } else if (this.f < 0 && this.f > -100) {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), ((float) l) + (this.c * 4.0f), (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        } else if (this.f < -100 && this.f > com.google.firebase.database.c.m) {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), ((float) l) + (this.c * 2.0f), (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        } else if (this.f <= -1000) {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), ((float) l) - this.c, (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        } else {
            canvas.drawText(String.valueOf(((double) this.f) / 10.0d), ((float) l) + (6.0f * this.c), (desiredWidth2 / 2.0f) + ((float) (getHeight() / 2)), textPaint);
        }
        canvas.restore();
    }

    private void b(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setColor(getResources().getColor(R.color.linetun));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        Paint textPaint = new TextPaint(1);
        textPaint.setTextSize(7.0f * this.c);
        textPaint.setColor(getResources().getColor(R.color.linetun));
        int i = this.d;
        float desiredWidth = Layout.getDesiredWidth("0", textPaint);
        l = (int) (7.0f * this.c);
        Paint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(11.0f * this.c);
        textPaint2.setColor(getResources().getColor(R.color.linetun));
        int i2;
        float f;
        int i3;
        float f2;
        if (this.n.booleanValue()) {
            canvas.drawLine(((float) (getPaddingLeft() + l)) - this.c, (TitleBar.SHAREBTN_RIGHT_MARGIN * this.c) + ((float) getPaddingTop()), ((float) (getPaddingLeft() + l)) - this.c, ((float) getHeight()) - (TitleBar.SHAREBTN_RIGHT_MARGIN * this.c), paint);
            i2 = 0;
            f = 0.0f;
            i3 = 0;
            while (((float) i2) <= ((float) i) - (TitleBar.BACKBTN_LEFT_MARGIN * this.c)) {
                f2 = ((float) ((i / 2) + this.i)) - (((float) (this.g * i3)) * this.c);
                if ((this.f + i3) % 5 == 0) {
                    canvas.drawLine((float) (l + getPaddingLeft()), f2, (this.c * 8.0f) + ((float) l), f2, paint);
                    canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), (((float) l) + (this.c * 8.0f)) + (c.a * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                } else {
                    canvas.drawLine((float) (l + getPaddingLeft()), f2, (this.c * 5.0f) + ((float) l), f2, paint);
                }
                f2 = ((float) ((i / 2) + this.i)) + (((float) (this.g * i3)) * this.c);
                if (((float) i2) != ((float) i) - (TitleBar.BACKBTN_LEFT_MARGIN * this.c)) {
                    if ((this.f - i3) % 5 == 0) {
                        canvas.drawLine((float) (l + getPaddingLeft()), f2, (this.c * 8.0f) + ((float) l), f2, paint);
                        if (f2 < ((float) i) - (23.0f * this.c)) {
                            canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), (((float) l) + (this.c * 8.0f)) + (c.a * this.c), (desiredWidth / 2.0f) + f2, textPaint);
                        }
                    } else {
                        canvas.drawLine((float) (l + getPaddingLeft()), f2, (this.c * 5.0f) + ((float) l), f2, paint);
                    }
                }
                i3++;
                f = f2;
                i2 = (int) (((float) i2) + (((float) (this.g * 2)) * this.c));
            }
            canvas.drawLine((float) (l + getPaddingLeft()), f - ((float) this.i), 2.0f * (((float) l) + (this.c * 8.0f)), f - ((float) this.i), paint);
            canvas.drawText("m", ((float) l) + (this.c * 8.0f), (((desiredWidth / 2.0f) + f) - (4.0f * this.c)) - ((float) this.i), textPaint2);
        } else {
            canvas.drawLine((2.0f * this.c) + ((float) (getWidth() - l)), (TitleBar.SHAREBTN_RIGHT_MARGIN * this.c) + ((float) getPaddingTop()), (2.0f * this.c) + ((float) (getWidth() - l)), ((float) getHeight()) - (TitleBar.SHAREBTN_RIGHT_MARGIN * this.c), paint);
            i2 = 0;
            f = 0.0f;
            i3 = 0;
            while (((float) i2) <= ((float) i) - (TitleBar.BACKBTN_LEFT_MARGIN * this.c)) {
                f2 = ((float) ((i / 2) + this.i)) - (((float) (this.g * i3)) * this.c);
                if ((this.f + i3) % 5 == 0) {
                    canvas.drawLine(this.c + ((float) (getWidth() - l)), f2, this.c + (((float) (getWidth() - l)) - (this.c * 8.0f)), f2, paint);
                    if (this.f + i3 >= 100 && this.f + i3 < 1000) {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) l) + (5.0f * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f + i3 >= 1000) {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) l) + this.c, f2 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f + i3 < 0 && this.f + i3 > -100) {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) l) + (7.0f * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f + i3 < -100 && this.f + i3 > com.google.firebase.database.c.m) {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) l) + (c.a * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f + i3 <= -1000) {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) l) - (2.0f * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                    } else {
                        canvas.drawText(String.valueOf(((double) (this.f + i3)) / 10.0d), ((float) (l * 2)) + (2.0f * this.c), f2 + (desiredWidth / 2.0f), textPaint);
                    }
                } else {
                    canvas.drawLine(this.c + ((float) (getWidth() - l)), f2, this.c + (((float) (getWidth() - l)) - (this.c * 5.0f)), f2, paint);
                }
                f2 = ((float) ((i / 2) + this.i)) + (((float) (this.g * i3)) * this.c);
                if (((float) i2) != ((float) i) - (TitleBar.BACKBTN_LEFT_MARGIN * this.c)) {
                    if ((this.f - i3) % 5 == 0) {
                        canvas.drawLine(this.c + ((float) (getWidth() - l)), f2, this.c + (((float) (getWidth() - l)) - (this.c * 8.0f)), f2, paint);
                        if (f2 < ((float) i) - (23.0f * this.c)) {
                            if (this.f - i3 >= 100 && this.f - i3 < 1000) {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) l) + (5.0f * this.c), (desiredWidth / 2.0f) + f2, textPaint);
                            } else if (this.f - i3 >= 1000) {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) l) + this.c, (desiredWidth / 2.0f) + f2, textPaint);
                            } else if (this.f - i3 < 0 && this.f - i3 > -100) {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) l) + (this.c * 7.0f), (desiredWidth / 2.0f) + f2, textPaint);
                            } else if (this.f - i3 <= -100 && this.f - i3 > com.google.firebase.database.c.m) {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) l) + (c.a * this.c), (desiredWidth / 2.0f) + f2, textPaint);
                            } else if (this.f - i3 <= -1000) {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) l) - (2.0f * this.c), (desiredWidth / 2.0f) + f2, textPaint);
                            } else {
                                canvas.drawText(String.valueOf(((double) (this.f - i3)) / 10.0d), ((float) (l * 2)) + (2.0f * this.c), (desiredWidth / 2.0f) + f2, textPaint);
                            }
                        }
                    } else {
                        canvas.drawLine(this.c + ((float) (getWidth() - l)), f2, this.c + (((float) (getWidth() - l)) - (this.c * 5.0f)), f2, paint);
                    }
                }
                i3++;
                i2 = (int) (((float) i2) + (((float) (this.g * 2)) * this.c));
                f = f2;
            }
            canvas.drawLine(this.c + ((float) (getWidth() / 4)), f - ((float) this.i), this.c + ((float) (getWidth() - l)), f - ((float) this.i), paint);
            canvas.drawText("m/s", (8.0f * this.c) + this.c, (((desiredWidth / 2.0f) + f) - (4.0f * this.c)) - ((float) this.i), textPaint2);
        }
        canvas.restore();
    }

    public void a(float f) {
        this.f = (int) (TitleBar.SHAREBTN_RIGHT_MARGIN * f);
        a();
        postInvalidate();
    }

    public void a(int i, int i2) {
        this.f = i;
        this.i = (int) ((((float) i2) * this.c) / 2.0f);
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.d = getHeight();
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.o.getWidth(), this.a);
    }

    public void setDirection(Boolean bool) {
        this.n = bool;
    }
}
