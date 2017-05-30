package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

@aaa
public class zl
  extends zj
{
  private zk g;
  
  zl(Context paramContext, abi.a parama, acy paramacy, zn.a parama1)
  {
    super(paramContext, parama, paramacy, parama1);
  }
  
  protected void b()
  {
    Object localObject = this.c.k();
    int j;
    if (((AdSizeParcel)localObject).e)
    {
      localObject = this.b.getResources().getDisplayMetrics();
      j = ((DisplayMetrics)localObject).widthPixels;
    }
    for (int i = ((DisplayMetrics)localObject).heightPixels;; i = ((AdSizeParcel)localObject).d)
    {
      this.g = new zk(this, this.c, j, i);
      this.c.l().a(this);
      this.g.a(this.e);
      return;
      j = ((AdSizeParcel)localObject).g;
    }
  }
  
  protected int c()
  {
    if (this.g.c())
    {
      abr.a("Ad-Network indicated no fill with passback URL.");
      return 3;
    }
    if (!this.g.d()) {
      return 2;
    }
    return -2;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */