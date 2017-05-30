package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acb;
import com.google.android.gms.internal.acb.a;
import com.google.android.gms.internal.acb.b;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uj;
import com.google.android.gms.internal.ul;
import com.google.android.gms.internal.un;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@aaa
public class x
{
  private final Context a;
  private final String b;
  private final VersionInfoParcel c;
  @Nullable
  private final ul d;
  @Nullable
  private final un e;
  private final acb f = new acb.b().a("min_1", Double.MIN_VALUE, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D).a("30_max", 30.0D, Double.MAX_VALUE).a();
  private final long[] g;
  private final String[] h;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m;
  private i n;
  private boolean o;
  private boolean p;
  private long q = -1L;
  
  public x(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, @Nullable un paramun, @Nullable ul paramul)
  {
    this.a = paramContext;
    this.c = paramVersionInfoParcel;
    this.b = paramString;
    this.e = paramun;
    this.d = paramul;
    paramContext = (String)uf.z.c();
    if (paramContext == null)
    {
      this.h = new String[0];
      this.g = new long[0];
      return;
    }
    paramContext = TextUtils.split(paramContext, ",");
    this.h = new String[paramContext.length];
    this.g = new long[paramContext.length];
    int i1 = 0;
    while (i1 < paramContext.length) {
      try
      {
        this.g[i1] = Long.parseLong(paramContext[i1]);
        i1 += 1;
      }
      catch (NumberFormatException paramVersionInfoParcel)
      {
        for (;;)
        {
          abr.d("Unable to parse frame hash target time number.", paramVersionInfoParcel);
          this.g[i1] = -1L;
        }
      }
    }
  }
  
  private void c(i parami)
  {
    long l1 = ((Long)uf.A.c()).longValue();
    long l2 = parami.getCurrentPosition();
    int i1 = 0;
    if (i1 < this.h.length)
    {
      if (this.h[i1] != null) {}
      while (l1 <= Math.abs(l2 - this.g[i1]))
      {
        i1 += 1;
        break;
      }
      this.h[i1] = a(parami);
    }
  }
  
  private void e()
  {
    if ((this.k) && (!this.l))
    {
      uj.a(this.e, this.d, new String[] { "vff2" });
      this.l = true;
    }
    long l1 = u.k().c();
    if ((this.m) && (this.p) && (this.q != -1L))
    {
      double d1 = TimeUnit.SECONDS.toNanos(1L) / (l1 - this.q);
      this.f.a(d1);
    }
    this.p = this.m;
    this.q = l1;
  }
  
  @TargetApi(14)
  String a(TextureView paramTextureView)
  {
    paramTextureView = paramTextureView.getBitmap(8, 8);
    long l2 = 0L;
    long l1 = 63L;
    int i1 = 0;
    while (i1 < 8)
    {
      long l3 = l1;
      int i2 = 0;
      l1 = l2;
      l2 = l3;
      if (i2 < 8)
      {
        int i3 = paramTextureView.getPixel(i2, i1);
        int i4 = Color.blue(i3);
        int i5 = Color.red(i3);
        if (Color.green(i3) + (i4 + i5) > 128) {}
        for (l3 = 1L;; l3 = 0L)
        {
          l1 |= l3 << (int)l2;
          l2 -= 1L;
          i2 += 1;
          break;
        }
      }
      i1 += 1;
      l3 = l1;
      l1 = l2;
      l2 = l3;
    }
    return String.format("%016X", new Object[] { Long.valueOf(l2) });
  }
  
  public void a()
  {
    if ((!this.i) || (this.j)) {
      return;
    }
    uj.a(this.e, this.d, new String[] { "vfr2" });
    this.j = true;
  }
  
  public void a(i parami)
  {
    uj.a(this.e, this.d, new String[] { "vpc2" });
    this.i = true;
    if (this.e != null) {
      this.e.a("vpn", parami.a());
    }
    this.n = parami;
  }
  
  public void b()
  {
    if ((((Boolean)uf.y.c()).booleanValue()) && (!this.o))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.b);
      localBundle.putString("player", this.n.a());
      Object localObject1 = this.f.a().iterator();
      Object localObject2;
      String str1;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (acb.a)((Iterator)localObject1).next();
        str1 = String.valueOf("fps_c_");
        String str2 = String.valueOf(((acb.a)localObject2).a);
        if (str2.length() != 0)
        {
          str1 = str1.concat(str2);
          label133:
          localBundle.putString(str1, Integer.toString(((acb.a)localObject2).e));
          str1 = String.valueOf("fps_p_");
          str2 = String.valueOf(((acb.a)localObject2).a);
          if (str2.length() == 0) {
            break label206;
          }
        }
        label206:
        for (str1 = str1.concat(str2);; str1 = new String(str1))
        {
          localBundle.putString(str1, Double.toString(((acb.a)localObject2).d));
          break;
          str1 = new String(str1);
          break label133;
        }
      }
      int i1 = 0;
      if (i1 < this.g.length)
      {
        str1 = this.h[i1];
        if (str1 == null) {}
        for (;;)
        {
          i1 += 1;
          break;
          localObject1 = String.valueOf("fh_");
          localObject2 = String.valueOf(Long.valueOf(this.g[i1]));
          localBundle.putString(String.valueOf(localObject1).length() + 0 + String.valueOf(localObject2).length() + (String)localObject1 + (String)localObject2, str1);
        }
      }
      u.e().a(this.a, this.c.b, "gmob-apps", localBundle, true);
      this.o = true;
    }
  }
  
  public void b(i parami)
  {
    e();
    c(parami);
  }
  
  public void c()
  {
    this.m = true;
    if ((this.j) && (!this.k))
    {
      uj.a(this.e, this.d, new String[] { "vfp2" });
      this.k = true;
    }
  }
  
  public void d()
  {
    this.m = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */