package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.s;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Creator<TextTrackStyle> CREATOR = new r();
    public static final float a = 1.0f;
    public static final int b = 0;
    public static final int c = -1;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = -1;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = -1;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = 6;
    public static final int u = -1;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    private final int A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private String J;
    private int K;
    private int L;
    private JSONObject M;
    String z;

    public TextTrackStyle() {
        this(1, 1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    TextTrackStyle(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
        this.A = i;
        this.B = f;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        this.F = i5;
        this.G = i6;
        this.H = i7;
        this.I = i8;
        this.J = str;
        this.K = i9;
        this.L = i10;
        this.z = str2;
        if (this.z != null) {
            try {
                this.M = new JSONObject(this.z);
                return;
            } catch (JSONException e) {
                this.M = null;
                this.z = null;
                return;
            }
        }
        this.M = null;
    }

    @TargetApi(19)
    public static TextTrackStyle a(Context context) {
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (!s.h()) {
            return textTrackStyle;
        }
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        textTrackStyle.a(captioningManager.getFontScale());
        CaptionStyle userStyle = captioningManager.getUserStyle();
        textTrackStyle.b(userStyle.backgroundColor);
        textTrackStyle.a(userStyle.foregroundColor);
        switch (userStyle.edgeType) {
            case 1:
                textTrackStyle.c(1);
                break;
            case 2:
                textTrackStyle.c(2);
                break;
            default:
                textTrackStyle.c(0);
                break;
        }
        textTrackStyle.d(userStyle.edgeColor);
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                textTrackStyle.h(1);
            } else if (Typeface.SANS_SERIF.equals(typeface)) {
                textTrackStyle.h(0);
            } else if (Typeface.SERIF.equals(typeface)) {
                textTrackStyle.h(2);
            } else {
                textTrackStyle.h(0);
            }
            boolean isBold = typeface.isBold();
            boolean isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                textTrackStyle.i(3);
            } else if (isBold) {
                textTrackStyle.i(1);
            } else if (isItalic) {
                textTrackStyle.i(2);
            } else {
                textTrackStyle.i(0);
            }
        }
        return textTrackStyle;
    }

    private int b(String str) {
        int i = 0;
        if (str != null && str.length() == 9 && str.charAt(i) == '#') {
            try {
                i = Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    private String j(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    int a() {
        return this.A;
    }

    public void a(float f) {
        this.B = f;
    }

    public void a(int i) {
        this.C = i;
    }

    public void a(String str) {
        this.J = str;
    }

    public void a(JSONObject jSONObject) {
        this.M = jSONObject;
    }

    public float b() {
        return this.B;
    }

    public void b(int i) {
        this.D = i;
    }

    public void b(JSONObject jSONObject) {
        String string;
        this.B = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.C = b(jSONObject.optString("foregroundColor"));
        this.D = b(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.E = 0;
            } else if ("OUTLINE".equals(string)) {
                this.E = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.E = 2;
            } else if ("RAISED".equals(string)) {
                this.E = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.E = 4;
            }
        }
        this.F = b(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            string = jSONObject.getString("windowType");
            if ("NONE".equals(string)) {
                this.G = 0;
            } else if ("NORMAL".equals(string)) {
                this.G = 1;
            } else if ("ROUNDED_CORNERS".equals(string)) {
                this.G = 2;
            }
        }
        this.H = b(jSONObject.optString("windowColor"));
        if (this.G == 2) {
            this.I = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.J = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            string = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string)) {
                this.K = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string)) {
                this.K = 1;
            } else if ("SERIF".equals(string)) {
                this.K = 2;
            } else if ("MONOSPACED_SERIF".equals(string)) {
                this.K = 3;
            } else if ("CASUAL".equals(string)) {
                this.K = 4;
            } else if ("CURSIVE".equals(string)) {
                this.K = 5;
            } else if ("SMALL_CAPITALS".equals(string)) {
                this.K = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            string = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string)) {
                this.L = 0;
            } else if ("BOLD".equals(string)) {
                this.L = 1;
            } else if ("ITALIC".equals(string)) {
                this.L = 2;
            } else if ("BOLD_ITALIC".equals(string)) {
                this.L = 3;
            }
        }
        this.M = jSONObject.optJSONObject("customData");
    }

    public int c() {
        return this.C;
    }

    public void c(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.E = i;
    }

    public int d() {
        return this.D;
    }

    public void d(int i) {
        this.F = i;
    }

    public int e() {
        return this.E;
    }

    public void e(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.G = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        if ((this.M == null) != (textTrackStyle.M == null)) {
            return false;
        }
        if (this.M != null && textTrackStyle.M != null && !p.a(this.M, textTrackStyle.M)) {
            return false;
        }
        if (!(this.B == textTrackStyle.B && this.C == textTrackStyle.C && this.D == textTrackStyle.D && this.E == textTrackStyle.E && this.F == textTrackStyle.F && this.G == textTrackStyle.G && this.I == textTrackStyle.I && f.a(this.J, textTrackStyle.J) && this.K == textTrackStyle.K && this.L == textTrackStyle.L)) {
            z = false;
        }
        return z;
    }

    public int f() {
        return this.F;
    }

    public void f(int i) {
        this.H = i;
    }

    public int g() {
        return this.G;
    }

    public void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.I = i;
    }

    public int h() {
        return this.H;
    }

    public void h(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.K = i;
    }

    public int hashCode() {
        return c.a(Float.valueOf(this.B), Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Integer.valueOf(this.I), this.J, Integer.valueOf(this.K), Integer.valueOf(this.L), this.M);
    }

    public int i() {
        return this.I;
    }

    public void i(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.L = i;
    }

    public String j() {
        return this.J;
    }

    public int k() {
        return this.K;
    }

    public int l() {
        return this.L;
    }

    public JSONObject m() {
        return this.M;
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", (double) this.B);
            if (this.C != 0) {
                jSONObject.put("foregroundColor", j(this.C));
            }
            if (this.D != 0) {
                jSONObject.put("backgroundColor", j(this.D));
            }
            switch (this.E) {
                case 0:
                    jSONObject.put("edgeType", "NONE");
                    break;
                case 1:
                    jSONObject.put("edgeType", "OUTLINE");
                    break;
                case 2:
                    jSONObject.put("edgeType", "DROP_SHADOW");
                    break;
                case 3:
                    jSONObject.put("edgeType", "RAISED");
                    break;
                case 4:
                    jSONObject.put("edgeType", "DEPRESSED");
                    break;
            }
            if (this.F != 0) {
                jSONObject.put("edgeColor", j(this.F));
            }
            switch (this.G) {
                case 0:
                    jSONObject.put("windowType", "NONE");
                    break;
                case 1:
                    jSONObject.put("windowType", "NORMAL");
                    break;
                case 2:
                    jSONObject.put("windowType", "ROUNDED_CORNERS");
                    break;
            }
            if (this.H != 0) {
                jSONObject.put("windowColor", j(this.H));
            }
            if (this.G == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.I);
            }
            if (this.J != null) {
                jSONObject.put("fontFamily", this.J);
            }
            switch (this.K) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            switch (this.L) {
                case 0:
                    jSONObject.put("fontStyle", "NORMAL");
                    break;
                case 1:
                    jSONObject.put("fontStyle", "BOLD");
                    break;
                case 2:
                    jSONObject.put("fontStyle", "ITALIC");
                    break;
                case 3:
                    jSONObject.put("fontStyle", "BOLD_ITALIC");
                    break;
            }
            if (this.M != null) {
                jSONObject.put("customData", this.M);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.z = this.M == null ? null : this.M.toString();
        r.a(this, parcel, i);
    }
}
