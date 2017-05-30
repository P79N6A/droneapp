package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public final class uo
  extends uq.a
{
  private final h a;
  @Nullable
  private final String b;
  private final String c;
  
  public uo(h paramh, @Nullable String paramString1, String paramString2)
  {
    this.a = paramh;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(@Nullable e parame)
  {
    if (parame == null) {
      return;
    }
    this.a.b((View)f.a(parame));
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void c()
  {
    this.a.E();
  }
  
  public void d()
  {
    this.a.F();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */