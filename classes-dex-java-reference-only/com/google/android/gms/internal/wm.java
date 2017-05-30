package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@aaa
public class wm
{
  private final Context a;
  private final xq b;
  private final VersionInfoParcel c;
  private final d d;
  
  wm(Context paramContext, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    this.a = paramContext;
    this.b = paramxq;
    this.c = paramVersionInfoParcel;
    this.d = paramd;
  }
  
  public Context a()
  {
    return this.a.getApplicationContext();
  }
  
  public l a(String paramString)
  {
    return new l(this.a, new AdSizeParcel(), paramString, this.b, this.c, this.d);
  }
  
  public l b(String paramString)
  {
    return new l(this.a.getApplicationContext(), new AdSizeParcel(), paramString, this.b, this.c, this.d);
  }
  
  public wm b()
  {
    return new wm(a(), this.b, this.c, this.d);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */