package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.uz.a;
import java.util.List;

@aaa
public class d
  extends uz.a
  implements i.a
{
  private String a;
  private List<c> b;
  private String c;
  private uu d;
  private String e;
  private double f;
  private String g;
  private String h;
  @Nullable
  private a i;
  private Bundle j;
  @Nullable
  private com.google.android.gms.ads.internal.client.c k;
  @Nullable
  private View l;
  private Object m = new Object();
  private i n;
  
  public d(String paramString1, List paramList, String paramString2, uu paramuu, String paramString3, double paramDouble, String paramString4, String paramString5, @Nullable a parama, Bundle paramBundle, com.google.android.gms.ads.internal.client.c paramc, View paramView)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = paramuu;
    this.e = paramString3;
    this.f = paramDouble;
    this.g = paramString4;
    this.h = paramString5;
    this.i = parama;
    this.j = paramBundle;
    this.k = paramc;
    this.l = paramView;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(i parami)
  {
    synchronized (this.m)
    {
      this.n = parami;
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
  
  public double f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public com.google.android.gms.ads.internal.client.c i()
  {
    return this.k;
  }
  
  public e j()
  {
    return f.a(this.n);
  }
  
  public String k()
  {
    return "2";
  }
  
  public String l()
  {
    return "";
  }
  
  public a m()
  {
    return this.i;
  }
  
  public Bundle n()
  {
    return this.j;
  }
  
  public View o()
  {
    return this.l;
  }
  
  public void p()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = 0.0D;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
    this.m = null;
    this.n = null;
    this.k = null;
    this.l = null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */