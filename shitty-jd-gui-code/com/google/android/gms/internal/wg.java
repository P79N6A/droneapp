package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.u;

@aaa
public class wg
  extends abq
{
  final acy a;
  final wi b;
  private final String c;
  
  wg(acy paramacy, wi paramwi, String paramString)
  {
    this.a = paramacy;
    this.b = paramwi;
    this.c = paramString;
    u.B().a(this);
  }
  
  public void a()
  {
    try
    {
      this.b.a(this.c);
      return;
    }
    finally
    {
      abv.a.post(new wg.1(this));
    }
  }
  
  public void b()
  {
    this.b.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */