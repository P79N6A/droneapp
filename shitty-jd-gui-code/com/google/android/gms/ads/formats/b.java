package com.google.android.gms.ads.formats;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.i;
import com.google.android.gms.internal.aaa;
import java.lang.annotation.Annotation;

@aaa
public final class b
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = 2;
  public static final int g = 3;
  private final boolean h;
  private final int i;
  private final boolean j;
  private final int k;
  private final i l;
  
  private b(b paramb)
  {
    this.h = b.a(paramb);
    this.i = b.b(paramb);
    this.j = b.c(paramb);
    this.k = b.d(paramb);
    this.l = b.e(paramb);
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public int b()
  {
    return this.i;
  }
  
  public boolean c()
  {
    return this.j;
  }
  
  public int d()
  {
    return this.k;
  }
  
  @Nullable
  public i e()
  {
    return this.l;
  }
  
  public static @interface a {}
  
  public static final class b
  {
    private boolean a = false;
    private int b = 0;
    private boolean c = false;
    private i d;
    private int e = 1;
    
    public b a(int paramInt)
    {
      this.b = paramInt;
      return this;
    }
    
    public b a(i parami)
    {
      this.d = parami;
      return this;
    }
    
    public b a(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
    
    public b a()
    {
      return new b(this, null);
    }
    
    public b b(@b.a int paramInt)
    {
      this.e = paramInt;
      return this;
    }
    
    public b b(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/formats/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */