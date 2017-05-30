package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.aaa;
import java.util.List;

@aaa
public class a
{
  static final int a = d;
  static final int b = c;
  private static final int c = Color.rgb(12, 174, 206);
  private static final int d = Color.rgb(204, 204, 204);
  private final String e;
  private final List<Drawable> f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  
  public a(String paramString, List<Drawable> paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2)
  {
    this.e = paramString;
    this.f = paramList;
    if (paramInteger1 != null)
    {
      m = paramInteger1.intValue();
      this.g = m;
      if (paramInteger2 == null) {
        break label87;
      }
      m = paramInteger2.intValue();
      label42:
      this.h = m;
      if (paramInteger3 == null) {
        break label95;
      }
    }
    label87:
    label95:
    for (int m = paramInteger3.intValue();; m = 12)
    {
      this.i = m;
      this.j = paramInt1;
      this.k = paramInt2;
      return;
      m = a;
      break;
      m = b;
      break label42;
    }
  }
  
  public String a()
  {
    return this.e;
  }
  
  public List<Drawable> b()
  {
    return this.f;
  }
  
  public int c()
  {
    return this.g;
  }
  
  public int d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.i;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public int g()
  {
    return this.k;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */