package com.google.ads;

import android.content.Context;
import com.google.android.gms.ads.d;

@Deprecated
public final class b
{
  public static final int a = -1;
  public static final int b = -2;
  public static final int c = 32;
  public static final int d = 50;
  public static final int e = 90;
  public static final b f = new b(-1, -2, "mb");
  public static final b g = new b(320, 50, "mb");
  public static final b h = new b(300, 250, "as");
  public static final b i = new b(468, 60, "as");
  public static final b j = new b(728, 90, "as");
  public static final b k = new b(160, 600, "as");
  private final d l;
  
  public b(int paramInt1, int paramInt2)
  {
    this(new d(paramInt1, paramInt2));
  }
  
  private b(int paramInt1, int paramInt2, String paramString)
  {
    this(new d(paramInt1, paramInt2));
  }
  
  public b(d paramd)
  {
    this.l = paramd;
  }
  
  public int a()
  {
    return this.l.b();
  }
  
  public int a(Context paramContext)
  {
    return this.l.b(paramContext);
  }
  
  public b a(b... paramVarArgs)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramVarArgs == null) {}
    float f1;
    int n;
    int i1;
    int i2;
    int m;
    do
    {
      return (b)localObject2;
      f1 = 0.0F;
      n = a();
      i1 = b();
      i2 = paramVarArgs.length;
      m = 0;
      localObject2 = localObject1;
    } while (m >= i2);
    localObject2 = paramVarArgs[m];
    int i3 = ((b)localObject2).a();
    int i4 = ((b)localObject2).b();
    float f2;
    if (a(i3, i4))
    {
      float f3 = i3 * i4 / (n * i1);
      f2 = f3;
      if (f3 > 1.0F) {
        f2 = 1.0F / f3;
      }
      if (f2 > f1) {
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      m += 1;
      f1 = f2;
      break;
      f2 = f1;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    int m = a();
    int n = b();
    return (paramInt1 <= m * 1.25F) && (paramInt1 >= m * 0.8F) && (paramInt2 <= n * 1.25F) && (paramInt2 >= n * 0.8F);
  }
  
  public int b()
  {
    return this.l.a();
  }
  
  public int b(Context paramContext)
  {
    return this.l.a(paramContext);
  }
  
  public boolean c()
  {
    return this.l.d();
  }
  
  public boolean d()
  {
    return this.l.c();
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return this.l.equals(((b)paramObject).l);
  }
  
  public int hashCode()
  {
    return this.l.hashCode();
  }
  
  public String toString()
  {
    return this.l.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/ads/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */