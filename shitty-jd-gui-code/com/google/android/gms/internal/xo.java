package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@aaa
public class xo
  implements xf
{
  private final AdRequestInfoParcel a;
  private final xq b;
  private final Context c;
  private final Object d = new Object();
  private final xh e;
  private final boolean f;
  private final long g;
  private final long h;
  private final un i;
  private final boolean j;
  private boolean k = false;
  private xk l;
  private List<xl> m = new ArrayList();
  
  public xo(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, xq paramxq, xh paramxh, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, un paramun)
  {
    this.c = paramContext;
    this.a = paramAdRequestInfoParcel;
    this.b = paramxq;
    this.e = paramxh;
    this.f = paramBoolean1;
    this.j = paramBoolean2;
    this.g = paramLong1;
    this.h = paramLong2;
    this.i = paramun;
  }
  
  public xl a(List<xg> arg1)
  {
    abr.a("Starting mediation.");
    Object localObject = new ArrayList();
    ul localul1 = this.i.a();
    Iterator localIterator1 = ???.iterator();
    label403:
    while (localIterator1.hasNext())
    {
      xg localxg = (xg)localIterator1.next();
      ??? = String.valueOf(localxg.b);
      Iterator localIterator2;
      if (???.length() != 0)
      {
        ??? = "Trying mediation network: ".concat(???);
        abr.c(???);
        localIterator2 = localxg.c.iterator();
      }
      for (;;)
      {
        if (!localIterator2.hasNext()) {
          break label403;
        }
        String str = (String)localIterator2.next();
        ul localul2 = this.i.a();
        synchronized (this.d)
        {
          if (this.k)
          {
            localObject = new xl(-1);
            return (xl)localObject;
            ??? = new String("Trying mediation network: ");
            break;
          }
          this.l = new xk(this.c, str, this.b, this.e, localxg, this.a.c, this.a.d, this.a.k, this.f, this.j, this.a.z, this.a.n);
          ??? = this.l.a(this.g, this.h);
          this.m.add(???);
          if (???.a == 0)
          {
            abr.a("Adapter succeeded.");
            this.i.a("mediation_network_succeed", str);
            if (!((List)localObject).isEmpty()) {
              this.i.a("mediation_networks_fail", TextUtils.join(",", (Iterable)localObject));
            }
            this.i.a(localul2, new String[] { "mls" });
            this.i.a(localul1, new String[] { "ttm" });
            return (xl)???;
          }
        }
        localIterable.add(str);
        this.i.a(localul2, new String[] { "mlf" });
        if (???.c != null) {
          abv.a.post(new xo.1(this, ???));
        }
      }
    }
    if (!localIterable.isEmpty()) {
      this.i.a("mediation_networks_fail", TextUtils.join(",", localIterable));
    }
    return new xl(1);
  }
  
  public void a()
  {
    synchronized (this.d)
    {
      this.k = true;
      if (this.l != null) {
        this.l.a();
      }
      return;
    }
  }
  
  public List<xl> b()
  {
    return this.m;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */