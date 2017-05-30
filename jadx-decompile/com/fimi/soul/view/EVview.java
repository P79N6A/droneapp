package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.view.photodraweeview.c;

public class EVview extends View {
    boolean a = false;
    private Paint b;
    private Paint c;
    private Paint d;
    private int e = 6;
    private float f = 0.0f;
    private Context g;
    private Typeface h;

    public EVview(Context context) {
        super(context);
        this.g = context;
        this.a = d.a().k();
        a();
    }

    public EVview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        this.a = d.a().k();
        a();
    }

    private void b(float f) {
        if (f == -2.0f) {
            this.e = 0;
        } else if (f == -1.7f) {
            this.e = 1;
        } else if (f == -1.3f) {
            this.e = 2;
        } else if (f == -1.0f) {
            this.e = 3;
        } else if (f == -0.7f) {
            this.e = 4;
        } else if (f == -0.3f) {
            this.e = 5;
        } else if (f == 0.0f) {
            this.e = 6;
        } else if (f == 0.3f) {
            this.e = 7;
        } else if (f == 0.7f) {
            this.e = 8;
        } else if (f == 1.0f) {
            this.e = 9;
        } else if (f == 1.3f) {
            this.e = 10;
        } else if (f == 1.7f) {
            this.e = 11;
        } else if (f == 2.0f) {
            this.e = 12;
        }
    }

    private void c(float f) {
        if (f == -2.0f) {
            this.e = 0;
        } else if (f == -1.3f) {
            this.e = 2;
        } else if (f == -0.7f) {
            this.e = 4;
        } else if (f == 0.0f) {
            this.e = 6;
        } else if (f == 0.7f) {
            this.e = 8;
        } else if (f == 1.3f) {
            this.e = 10;
        } else if (f == 2.0f) {
            this.e = 12;
        }
    }

    void a() {
        this.b = new Paint();
        this.b.setColor(-1);
        this.b.setAlpha(80);
        this.b.setStrokeWidth(c.a);
        this.b.setStyle(Style.FILL);
        this.b.setAntiAlias(true);
        this.b.setTextSize(25.0f);
        this.c = new Paint();
        this.c.setColor(getResources().getColor(R.color.changebetery));
        this.c.setStrokeWidth(c.a);
        this.c.setAntiAlias(true);
        this.c.setStyle(Style.FILL);
        if (this.h == null) {
            this.h = Typeface.createFromAsset(this.g.getAssets(), "DIN Alternate Bold.TTF");
        }
        this.c.setTypeface(this.h);
        this.b.setTypeface(this.h);
    }

    public void a(float f) {
        this.f = f;
        this.a = d.a().k();
        if (this.a) {
            c(f);
        } else {
            b(f);
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.setColor(-1);
        Canvas canvas2 = canvas;
        canvas2.drawLine(this.g.getResources().getDimension(R.dimen.dp50), this.g.getResources().getDimension(R.dimen.dp28) + getY(), ((float) getWidth()) - this.g.getResources().getDimension(R.dimen.dp50), this.g.getResources().getDimension(R.dimen.dp28) + getY(), this.b);
        float dimension = this.g.getResources().getDimension(R.dimen.dp50);
        float width = (((float) getWidth()) - this.g.getResources().getDimension(R.dimen.dp100)) / 12.0f;
        for (int i = 0; i <= 12; i++) {
            this.b.setColor(-1);
            if (i % 2 == 0) {
                canvas2 = canvas;
                canvas2.drawLine(dimension + (((float) i) * width), 13.0f + getY(), dimension + (((float) i) * width), this.g.getResources().getDimension(R.dimen.dp43) + getY(), this.b);
            } else if (!this.a) {
                canvas2 = canvas;
                canvas2.drawLine(dimension + (((float) i) * width), this.g.getResources().getDimension(R.dimen.dp23) + getY(), dimension + (((float) i) * width), this.g.getResources().getDimension(R.dimen.dp33) + getY(), this.b);
            }
            if (i == 0) {
                if (this.e != 0) {
                    canvas.drawText("-2", ((((float) i) * width) + dimension) - (this.b.getTextSize() / c.a), getY() + this.g.getResources().getDimension(R.dimen.dp70), this.b);
                }
            } else if (i == 6) {
                if (this.e != 6) {
                    canvas.drawText("0", ((((float) i) * width) + dimension) - (this.b.getTextSize() / c.a), getY() + this.g.getResources().getDimension(R.dimen.dp70), this.b);
                }
            } else if (i == 12 && this.e != 12) {
                canvas.drawText("2", ((((float) i) * width) + dimension) - (this.b.getTextSize() / c.a), getY() + this.g.getResources().getDimension(R.dimen.dp70), this.b);
            }
        }
        canvas.drawCircle((((float) this.e) * width) + dimension, getY() + this.g.getResources().getDimension(R.dimen.dp28), this.g.getResources().getDimension(R.dimen.dp_ev_20), this.c);
        this.b.setColor(this.g.getResources().getColor(R.color.ev_color));
        canvas.drawText(String.valueOf(this.f), ((((float) this.e) * width) + dimension) - (this.b.getTextSize() / 2.0f), getY() + this.g.getResources().getDimension(R.dimen.dp70), this.b);
    }
}
