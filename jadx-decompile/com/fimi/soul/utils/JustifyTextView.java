package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import org.a.a.f.c.l;

public class JustifyTextView extends TextView {
    private int a;
    private int b;
    private Context c;

    public JustifyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    private void a(Canvas canvas, int i, String str, float f) {
        float f2 = 0.0f;
        if (a(i, str)) {
            CharSequence charSequence = "  ";
            canvas.drawText(charSequence, 0.0f, ((float) this.a) - 5.0f, getPaint());
            f2 = 0.0f + StaticLayout.getDesiredWidth(charSequence, getPaint());
            str = str.substring(3);
        }
        float length = ((((float) this.b) - f) / ((float) str.length())) - 1.0f;
        float f3 = f2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            Object valueOf = String.valueOf(str.charAt(i2));
            float desiredWidth = StaticLayout.getDesiredWidth(valueOf, getPaint());
            canvas.drawText(valueOf, f3, (float) this.a, getPaint());
            f3 += desiredWidth + length;
        }
    }

    private boolean a(int i, String str) {
        return str.length() > 3 && str.charAt(0) == l.c && str.charAt(1) == l.c;
    }

    private boolean a(String str) {
        return (str.length() == 0 || str.charAt(str.length() - 1) == '\n') ? false : true;
    }

    protected void onDraw(Canvas canvas) {
        int i = 0;
        Paint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        paint.setTypeface(ao.a(this.c.getAssets()));
        this.b = getMeasuredWidth();
        String str = (String) getText();
        this.a = 0;
        this.a = (int) (((float) this.a) + getTextSize());
        Layout layout = getLayout();
        while (i < layout.getLineCount()) {
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            String substring = str.substring(lineStart, lineEnd);
            float desiredWidth = StaticLayout.getDesiredWidth(str, lineStart, lineEnd, getPaint());
            if (!a(substring) || i == layout.getLineCount() - 1) {
                canvas.drawText(substring, 0.0f, ((float) this.a) - 5.0f, paint);
            } else {
                a(canvas, lineStart, substring, desiredWidth);
            }
            this.a += getLineHeight();
            i++;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
