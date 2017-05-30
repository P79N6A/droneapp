package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class AdSizeParcel
  extends AbstractSafeParcelable
{
  public static final z CREATOR = new z();
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final boolean e;
  public final int f;
  public final int g;
  public final AdSizeParcel[] h;
  public final boolean i;
  public final boolean j;
  public boolean k;
  
  public AdSizeParcel()
  {
    this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  AdSizeParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, AdSizeParcel[] paramArrayOfAdSizeParcel, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean1;
    this.f = paramInt4;
    this.g = paramInt5;
    this.h = paramArrayOfAdSizeParcel;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramBoolean4;
  }
  
  public AdSizeParcel(Context paramContext, d paramd)
  {
    this(paramContext, new d[] { paramd });
  }
  
  public AdSizeParcel(Context paramContext, d[] paramArrayOfd)
  {
    d locald = paramArrayOfd[0];
    this.a = 5;
    this.e = false;
    this.j = locald.e();
    int n;
    label66:
    int i1;
    label78:
    DisplayMetrics localDisplayMetrics;
    label129:
    int i2;
    int m;
    if (this.j)
    {
      this.f = d.c.b();
      this.c = d.c.a();
      if (this.f != -1) {
        break label314;
      }
      n = 1;
      if (this.c != -2) {
        break label320;
      }
      i1 = 1;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (n == 0) {
        break label338;
      }
      if ((!ac.a().c(paramContext)) || (!ac.a().d(paramContext))) {
        break label326;
      }
      this.g = (a(localDisplayMetrics) - ac.a().e(paramContext));
      double d1 = this.g / localDisplayMetrics.density;
      i2 = (int)d1;
      m = i2;
      if (d1 - (int)d1 >= 0.01D) {
        m = i2 + 1;
      }
      label168:
      if (i1 == 0) {
        break label363;
      }
      i2 = c(localDisplayMetrics);
      label180:
      this.d = ac.a().a(localDisplayMetrics, i2);
      if ((n == 0) && (i1 == 0)) {
        break label372;
      }
      this.b = (26 + m + "x" + i2 + "_as");
    }
    for (;;)
    {
      if (paramArrayOfd.length <= 1) {
        break label400;
      }
      this.h = new AdSizeParcel[paramArrayOfd.length];
      m = 0;
      while (m < paramArrayOfd.length)
      {
        this.h[m] = new AdSizeParcel(paramContext, paramArrayOfd[m]);
        m += 1;
      }
      this.f = locald.b();
      this.c = locald.a();
      break;
      label314:
      n = 0;
      break label66;
      label320:
      i1 = 0;
      break label78;
      label326:
      this.g = a(localDisplayMetrics);
      break label129;
      label338:
      m = this.f;
      this.g = ac.a().a(localDisplayMetrics, this.f);
      break label168;
      label363:
      i2 = this.c;
      break label180;
      label372:
      if (this.j) {
        this.b = "320x50_mb";
      } else {
        this.b = locald.toString();
      }
    }
    label400:
    this.h = null;
    this.i = false;
    this.k = false;
  }
  
  public AdSizeParcel(AdSizeParcel paramAdSizeParcel, AdSizeParcel[] paramArrayOfAdSizeParcel)
  {
    this(5, paramAdSizeParcel.b, paramAdSizeParcel.c, paramAdSizeParcel.d, paramAdSizeParcel.e, paramAdSizeParcel.f, paramAdSizeParcel.g, paramArrayOfAdSizeParcel, paramAdSizeParcel.i, paramAdSizeParcel.j, paramAdSizeParcel.k);
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static AdSizeParcel a()
  {
    return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public static AdSizeParcel a(Context paramContext)
  {
    return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int m = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (m <= 400) {
      return 32;
    }
    if (m <= 720) {
      return 50;
    }
    return 90;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public d b()
  {
    return j.a(this.f, this.c, this.b);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    z.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/AdSizeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */