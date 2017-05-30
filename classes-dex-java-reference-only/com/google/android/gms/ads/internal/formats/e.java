package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vb.a;
import java.util.List;

@aaa
public class e
  extends vb.a
  implements i.a
{
  private String a;
  private List<c> b;
  private String c;
  private uu d;
  private String e;
  private String f;
  @Nullable
  private a g;
  private Bundle h;
  private Object i = new Object();
  private i j;
  
  public e(String paramString1, List paramList, String paramString2, uu paramuu, String paramString3, String paramString4, @Nullable a parama, Bundle paramBundle)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = paramuu;
    this.e = paramString3;
    this.f = paramString4;
    this.g = parama;
    this.h = paramBundle;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(i parami)
  {
    synchronized (this.i)
    {
      this.j = parami;
      return;
    }
  }
  
  public List b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public uu d()
  {
    return this.d;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public com.google.android.gms.c.e g()
  {
    return f.a(this.j);
  }
  
  public Bundle h()
  {
    return this.h;
  }
  
  public void i()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
  }
  
  public String k()
  {
    return "1";
  }
  
  public String l()
  {
    return "";
  }
  
  public a m()
  {
    return this.g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */