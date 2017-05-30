package com.google.android.gms.awareness;

import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.internal.d;

public class b
  implements a.a.d
{
  public static final int a = -1;
  private final String b;
  private final int c;
  private final String d;
  private final String e;
  private final int f;
  
  protected b(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    this.b = paramString1;
    this.c = paramInt1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramInt2;
  }
  
  public static b a(String paramString)
  {
    d.a(paramString);
    return new b(paramString, 1, null, null, -1);
  }
  
  public String a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public int e()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */