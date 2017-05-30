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

public final class TextTrackStyle
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<TextTrackStyle> CREATOR = new r();
  public static final float a = 1.0F;
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
  
  public TextTrackStyle()
  {
    this(1, 1.0F, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
  }
  
  TextTrackStyle(int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, String paramString1, int paramInt9, int paramInt10, String paramString2)
  {
    this.A = paramInt1;
    this.B = paramFloat;
    this.C = paramInt2;
    this.D = paramInt3;
    this.E = paramInt4;
    this.F = paramInt5;
    this.G = paramInt6;
    this.H = paramInt7;
    this.I = paramInt8;
    this.J = paramString1;
    this.K = paramInt9;
    this.L = paramInt10;
    this.z = paramString2;
    if (this.z != null) {
      try
      {
        this.M = new JSONObject(this.z);
        return;
      }
      catch (JSONException paramString1)
      {
        this.M = null;
        this.z = null;
        return;
      }
    }
    this.M = null;
  }
  
  @TargetApi(19)
  public static TextTrackStyle a(Context paramContext)
  {
    TextTrackStyle localTextTrackStyle = new TextTrackStyle();
    if (!s.h()) {
      return localTextTrackStyle;
    }
    paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
    localTextTrackStyle.a(paramContext.getFontScale());
    paramContext = paramContext.getUserStyle();
    localTextTrackStyle.b(paramContext.backgroundColor);
    localTextTrackStyle.a(paramContext.foregroundColor);
    label117:
    boolean bool1;
    boolean bool2;
    switch (paramContext.edgeType)
    {
    default: 
      localTextTrackStyle.c(0);
      localTextTrackStyle.d(paramContext.edgeColor);
      paramContext = paramContext.getTypeface();
      if (paramContext != null)
      {
        if (!Typeface.MONOSPACE.equals(paramContext)) {
          break label158;
        }
        localTextTrackStyle.h(1);
        bool1 = paramContext.isBold();
        bool2 = paramContext.isItalic();
        if ((!bool1) || (!bool2)) {
          break label202;
        }
        localTextTrackStyle.i(3);
      }
      break;
    }
    for (;;)
    {
      return localTextTrackStyle;
      localTextTrackStyle.c(1);
      break;
      localTextTrackStyle.c(2);
      break;
      label158:
      if (Typeface.SANS_SERIF.equals(paramContext))
      {
        localTextTrackStyle.h(0);
        break label117;
      }
      if (Typeface.SERIF.equals(paramContext))
      {
        localTextTrackStyle.h(2);
        break label117;
      }
      localTextTrackStyle.h(0);
      break label117;
      label202:
      if (bool1) {
        localTextTrackStyle.i(1);
      } else if (bool2) {
        localTextTrackStyle.i(2);
      } else {
        localTextTrackStyle.i(0);
      }
    }
  }
  
  private int b(String paramString)
  {
    int i2 = 0;
    int i1 = i2;
    if (paramString != null)
    {
      i1 = i2;
      if (paramString.length() == 9)
      {
        i1 = i2;
        if (paramString.charAt(0) != '#') {}
      }
    }
    try
    {
      i1 = Integer.parseInt(paramString.substring(1, 3), 16);
      i2 = Integer.parseInt(paramString.substring(3, 5), 16);
      int i3 = Integer.parseInt(paramString.substring(5, 7), 16);
      i1 = Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), i1, i2, i3);
      return i1;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  private String j(int paramInt)
  {
    return String.format("#%02X%02X%02X%02X", new Object[] { Integer.valueOf(Color.red(paramInt)), Integer.valueOf(Color.green(paramInt)), Integer.valueOf(Color.blue(paramInt)), Integer.valueOf(Color.alpha(paramInt)) });
  }
  
  int a()
  {
    return this.A;
  }
  
  public void a(float paramFloat)
  {
    this.B = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.C = paramInt;
  }
  
  public void a(String paramString)
  {
    this.J = paramString;
  }
  
  public void a(JSONObject paramJSONObject)
  {
    this.M = paramJSONObject;
  }
  
  public float b()
  {
    return this.B;
  }
  
  public void b(int paramInt)
  {
    this.D = paramInt;
  }
  
  public void b(JSONObject paramJSONObject)
  {
    this.B = ((float)paramJSONObject.optDouble("fontScale", 1.0D));
    this.C = b(paramJSONObject.optString("foregroundColor"));
    this.D = b(paramJSONObject.optString("backgroundColor"));
    String str;
    if (paramJSONObject.has("edgeType"))
    {
      str = paramJSONObject.getString("edgeType");
      if ("NONE".equals(str)) {
        this.E = 0;
      }
    }
    else
    {
      this.F = b(paramJSONObject.optString("edgeColor"));
      if (paramJSONObject.has("windowType"))
      {
        str = paramJSONObject.getString("windowType");
        if (!"NONE".equals(str)) {
          break label319;
        }
        this.G = 0;
      }
      label122:
      this.H = b(paramJSONObject.optString("windowColor"));
      if (this.G == 2) {
        this.I = paramJSONObject.optInt("windowRoundedCornerRadius", 0);
      }
      this.J = paramJSONObject.optString("fontFamily", null);
      if (paramJSONObject.has("fontGenericFamily"))
      {
        str = paramJSONObject.getString("fontGenericFamily");
        if (!"SANS_SERIF".equals(str)) {
          break label355;
        }
        this.K = 0;
      }
      label202:
      if (paramJSONObject.has("fontStyle"))
      {
        str = paramJSONObject.getString("fontStyle");
        if (!"NORMAL".equals(str)) {
          break label464;
        }
        this.L = 0;
      }
    }
    for (;;)
    {
      this.M = paramJSONObject.optJSONObject("customData");
      return;
      if ("OUTLINE".equals(str))
      {
        this.E = 1;
        break;
      }
      if ("DROP_SHADOW".equals(str))
      {
        this.E = 2;
        break;
      }
      if ("RAISED".equals(str))
      {
        this.E = 3;
        break;
      }
      if (!"DEPRESSED".equals(str)) {
        break;
      }
      this.E = 4;
      break;
      label319:
      if ("NORMAL".equals(str))
      {
        this.G = 1;
        break label122;
      }
      if (!"ROUNDED_CORNERS".equals(str)) {
        break label122;
      }
      this.G = 2;
      break label122;
      label355:
      if ("MONOSPACED_SANS_SERIF".equals(str))
      {
        this.K = 1;
        break label202;
      }
      if ("SERIF".equals(str))
      {
        this.K = 2;
        break label202;
      }
      if ("MONOSPACED_SERIF".equals(str))
      {
        this.K = 3;
        break label202;
      }
      if ("CASUAL".equals(str))
      {
        this.K = 4;
        break label202;
      }
      if ("CURSIVE".equals(str))
      {
        this.K = 5;
        break label202;
      }
      if (!"SMALL_CAPITALS".equals(str)) {
        break label202;
      }
      this.K = 6;
      break label202;
      label464:
      if ("BOLD".equals(str)) {
        this.L = 1;
      } else if ("ITALIC".equals(str)) {
        this.L = 2;
      } else if ("BOLD_ITALIC".equals(str)) {
        this.L = 3;
      }
    }
  }
  
  public int c()
  {
    return this.C;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4)) {
      throw new IllegalArgumentException("invalid edgeType");
    }
    this.E = paramInt;
  }
  
  public int d()
  {
    return this.D;
  }
  
  public void d(int paramInt)
  {
    this.F = paramInt;
  }
  
  public int e()
  {
    return this.E;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("invalid windowType");
    }
    this.G = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool3 = false;
    if (this == paramObject) {
      bool1 = true;
    }
    int i1;
    int i2;
    label51:
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool3;
        } while (!(paramObject instanceof TextTrackStyle));
        paramObject = (TextTrackStyle)paramObject;
        if (this.M != null) {
          break;
        }
        i1 = 1;
        if (((TextTrackStyle)paramObject).M != null) {
          break label218;
        }
        i2 = 1;
        bool1 = bool3;
      } while (i1 != i2);
      if ((this.M == null) || (((TextTrackStyle)paramObject).M == null)) {
        break;
      }
      bool1 = bool3;
    } while (!p.a(this.M, ((TextTrackStyle)paramObject).M));
    if ((this.B == ((TextTrackStyle)paramObject).B) && (this.C == ((TextTrackStyle)paramObject).C) && (this.D == ((TextTrackStyle)paramObject).D) && (this.E == ((TextTrackStyle)paramObject).E) && (this.F == ((TextTrackStyle)paramObject).F) && (this.G == ((TextTrackStyle)paramObject).G) && (this.I == ((TextTrackStyle)paramObject).I) && (f.a(this.J, ((TextTrackStyle)paramObject).J)) && (this.K == ((TextTrackStyle)paramObject).K) && (this.L == ((TextTrackStyle)paramObject).L)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return bool1;
      i1 = 0;
      break;
      label218:
      i2 = 0;
      break label51;
    }
  }
  
  public int f()
  {
    return this.F;
  }
  
  public void f(int paramInt)
  {
    this.H = paramInt;
  }
  
  public int g()
  {
    return this.G;
  }
  
  public void g(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("invalid windowCornerRadius");
    }
    this.I = paramInt;
  }
  
  public int h()
  {
    return this.H;
  }
  
  public void h(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 6)) {
      throw new IllegalArgumentException("invalid fontGenericFamily");
    }
    this.K = paramInt;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Float.valueOf(this.B), Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Integer.valueOf(this.I), this.J, Integer.valueOf(this.K), Integer.valueOf(this.L), this.M });
  }
  
  public int i()
  {
    return this.I;
  }
  
  public void i(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3)) {
      throw new IllegalArgumentException("invalid fontStyle");
    }
    this.L = paramInt;
  }
  
  public String j()
  {
    return this.J;
  }
  
  public int k()
  {
    return this.K;
  }
  
  public int l()
  {
    return this.L;
  }
  
  public JSONObject m()
  {
    return this.M;
  }
  
  public JSONObject n()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fontScale", this.B);
      if (this.C != 0) {
        localJSONObject.put("foregroundColor", j(this.C));
      }
      if (this.D != 0) {
        localJSONObject.put("backgroundColor", j(this.D));
      }
      switch (this.E)
      {
      case 0: 
        if (this.F != 0) {
          localJSONObject.put("edgeColor", j(this.F));
        }
        switch (this.G)
        {
        case 0: 
          label156:
          if (this.H != 0) {
            localJSONObject.put("windowColor", j(this.H));
          }
          if (this.G == 2) {
            localJSONObject.put("windowRoundedCornerRadius", this.I);
          }
          if (this.J != null) {
            localJSONObject.put("fontFamily", this.J);
          }
          switch (this.K)
          {
          case 0: 
            label264:
            switch (this.L)
            {
            }
            break;
          }
          break;
        }
        break;
      }
      for (;;)
      {
        if (this.M == null) {
          break label599;
        }
        localJSONObject.put("customData", this.M);
        return localJSONObject;
        localJSONObject.put("edgeType", "NONE");
        break;
        localJSONObject.put("edgeType", "OUTLINE");
        break;
        localJSONObject.put("edgeType", "DROP_SHADOW");
        break;
        localJSONObject.put("edgeType", "RAISED");
        break;
        localJSONObject.put("edgeType", "DEPRESSED");
        break;
        localJSONObject.put("windowType", "NONE");
        break label156;
        localJSONObject.put("windowType", "NORMAL");
        break label156;
        localJSONObject.put("windowType", "ROUNDED_CORNERS");
        break label156;
        localJSONObject.put("fontGenericFamily", "SANS_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "CASUAL");
        break label264;
        localJSONObject.put("fontGenericFamily", "CURSIVE");
        break label264;
        localJSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
        break label264;
        localJSONObject.put("fontStyle", "NORMAL");
        continue;
        localJSONObject.put("fontStyle", "BOLD");
        continue;
        localJSONObject.put("fontStyle", "ITALIC");
        continue;
        localJSONObject.put("fontStyle", "BOLD_ITALIC");
        continue;
        break;
        break label156;
        break label264;
      }
      label599:
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.M == null) {}
    for (String str = null;; str = this.M.toString())
    {
      this.z = str;
      r.a(this, paramParcel, paramInt);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/TextTrackStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */