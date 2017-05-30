package com.fimi.kernel.utils;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

public final class h {
    public static float a(TextPaint textPaint) {
        FontMetrics fontMetrics = textPaint.getFontMetrics();
        return (float) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
    }

    public static float a(String str, TextPaint textPaint) {
        return textPaint.measureText(str);
    }

    public static int a(Canvas canvas, String str, int i, TextPaint textPaint, int i2, int i3) {
        if (n.b(str)) {
            return 1;
        }
        List b = b(str, i, textPaint);
        int a = (int) a(textPaint);
        for (int i4 = 0; i4 < b.size(); i4++) {
            canvas.drawText((String) b.get(i4), (float) i2, (float) ((a * i4) + ((a / 2) + i3)), textPaint);
        }
        return b.size();
    }

    public static int a(String str, int i, TextPaint textPaint) {
        if (n.b(str)) {
            return 0;
        }
        int i2 = 0;
        while (i2 < str.length()) {
            float measureText = textPaint.measureText(str.substring(0, i2 + 1));
            if (measureText <= ((float) i)) {
                if (measureText == ((float) i)) {
                    break;
                }
                i2++;
            } else {
                i2--;
                break;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            i2 = str.length() - 1;
        }
        return i2;
    }

    public static float b(String str, TextPaint textPaint) {
        return Layout.getDesiredWidth(str, textPaint);
    }

    public static List<String> b(String str, int i, TextPaint textPaint) {
        String[] split = str.indexOf("\n") != -1 ? str.split("\n") : new String[]{str};
        List<String> arrayList = new ArrayList();
        for (String str2 : split) {
            while (true) {
                String substring;
                int a = a(substring, i, textPaint);
                if (a <= 0) {
                    arrayList.add(substring);
                } else if (a == substring.length() - 1) {
                    arrayList.add(substring);
                } else {
                    arrayList.add(substring.substring(0, a + 1));
                }
                if (substring.length() <= a + 1) {
                    break;
                }
                substring = substring.substring(a + 1);
            }
        }
        return arrayList;
    }

    public static int c(String str, int i, TextPaint textPaint) {
        String[] split = str.indexOf("\n") != -1 ? str.split("\n") : new String[]{str};
        List arrayList = new ArrayList();
        for (String str2 : split) {
            while (true) {
                String substring;
                int a = a(substring, i, textPaint);
                if (a <= 0) {
                    arrayList.add(substring);
                } else if (a == substring.length() - 1) {
                    arrayList.add(substring);
                } else {
                    arrayList.add(substring.substring(0, a + 1));
                }
                if (substring.length() <= a + 1) {
                    break;
                }
                substring = substring.substring(a + 1);
            }
        }
        return arrayList.size();
    }
}
