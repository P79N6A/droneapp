package com.mining.app.zxing.a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

final class b {
    private static final String a = b.class.getSimpleName();
    private static final int b = 27;
    private static final int c = 30;
    private static final Pattern d = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
    private final Context e;
    private Point f;
    private Point g;
    private int h;
    private String i;

    b(Context context) {
        this.e = context;
    }

    private static int a(CharSequence charSequence, int i) {
        String[] split = d.split(charSequence);
        int length = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            try {
                double parseDouble = Double.parseDouble(split[i2].trim());
                int i4 = (int) (10.0d * parseDouble);
                if (Math.abs(((double) i) - parseDouble) >= ((double) Math.abs(i - i3))) {
                    i4 = i3;
                }
                i2++;
                i3 = i4;
            } catch (NumberFormatException e) {
                return i;
            }
        }
        return i3;
    }

    private static Point a(Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            CharSequence charSequence = parameters.get("preview-size-value");
        } else {
            Object obj = str;
        }
        Point point2 = null;
        if (charSequence != null) {
            Log.d(a, "preview-size-values parameter: " + charSequence);
            point2 = a(charSequence, point);
        }
        return point2 == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    private static Point a(CharSequence charSequence, Point point) {
        int indexOf;
        int parseInt;
        String[] split = d.split(charSequence);
        int length = split.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (i < length) {
            int i5;
            String trim = split[i].trim();
            indexOf = trim.indexOf(120);
            if (indexOf < 0) {
                Log.w(a, "Bad preview-size: " + trim);
                i5 = i2;
                i2 = i3;
            } else {
                try {
                    parseInt = Integer.parseInt(trim.substring(0, indexOf));
                    indexOf = Integer.parseInt(trim.substring(indexOf + 1));
                    i5 = Math.abs(parseInt - point.x) + Math.abs(indexOf - point.y);
                    if (i5 == 0) {
                        break;
                    } else if (i5 < i4) {
                        i4 = i5;
                        i2 = parseInt;
                        i5 = indexOf;
                    } else {
                        i5 = i2;
                        i2 = i3;
                    }
                } catch (NumberFormatException e) {
                    Log.w(a, "Bad preview-size: " + trim);
                    i5 = i2;
                    i2 = i3;
                }
            }
            i++;
            i3 = i2;
            i2 = i5;
        }
        indexOf = i2;
        parseInt = i3;
        return (parseInt <= 0 || indexOf <= 0) ? null : new Point(parseInt, indexOf);
    }

    private void a(Parameters parameters) {
        if (Build.MODEL.contains("Behold II") && c.a == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", "off");
    }

    private void b(Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int parseDouble;
            int i = 27;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 <= parseDouble) {
                        parseDouble = 27;
                    }
                    i = parseDouble;
                } catch (NumberFormatException e) {
                    Log.w(a, "Bad max-zoom: " + str2);
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    parseDouble = Integer.parseInt(str3);
                    if (i > parseDouble) {
                        i = parseDouble;
                    }
                } catch (NumberFormatException e2) {
                    Log.w(a, "Bad taking-picture-zoom-max: " + str3);
                }
            }
            CharSequence charSequence = parameters.get("mot-zoom-values");
            if (charSequence != null) {
                i = a(charSequence, i);
            }
            String str4 = parameters.get("mot-zoom-step");
            if (str4 != null) {
                try {
                    int parseDouble2 = (int) (Double.parseDouble(str4.trim()) * 10.0d);
                    if (parseDouble2 > 1) {
                        i -= i % parseDouble2;
                    }
                } catch (NumberFormatException e3) {
                }
            }
            if (!(str2 == null && charSequence == null)) {
                parameters.set("zoom", String.valueOf(((double) i) / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", i);
            }
        }
    }

    public static int e() {
        return 30;
    }

    Point a() {
        return this.g;
    }

    void a(Camera camera) {
        Parameters parameters = camera.getParameters();
        this.h = parameters.getPreviewFormat();
        this.i = parameters.get("preview-format");
        Log.d(a, "Default preview format: " + this.h + '/' + this.i);
        Display defaultDisplay = ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay();
        this.f = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Log.d(a, "Screen resolution: " + this.f);
        this.g = a(parameters, this.f);
        Log.d(a, "Camera resolution: " + this.f);
    }

    protected void a(Camera camera, int i) {
        try {
            Method method = camera.getClass().getMethod("setDisplayOrientation", new Class[]{Integer.TYPE});
            if (method != null) {
                method.invoke(camera, new Object[]{Integer.valueOf(i)});
            }
        } catch (Exception e) {
        }
    }

    Point b() {
        return this.f;
    }

    void b(Camera camera) {
        Parameters parameters = camera.getParameters();
        Log.d(a, "Setting preview size: " + this.g);
        parameters.setPreviewSize(this.g.x, this.g.y);
        a(parameters);
        b(parameters);
        a(camera, 90);
        camera.setParameters(parameters);
    }

    int c() {
        return this.h;
    }

    String d() {
        return this.i;
    }
}
