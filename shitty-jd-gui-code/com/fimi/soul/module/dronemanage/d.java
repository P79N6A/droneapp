package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Point;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.d.a.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.drone.h.z;
import com.google.android.gms.maps.c.a;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBounds.a;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class d
  implements d.b
{
  private float A = 0.0F;
  PolylineOptions a;
  List<ba> b;
  com.fimi.soul.module.droneFragment.g c;
  PolylineOptions d = null;
  int e = 0;
  private com.google.android.gms.maps.c f;
  private Context g;
  private com.fimi.soul.drone.a h;
  private LatLng i;
  private LatLng j = null;
  private int k = 20;
  private boolean l = true;
  private com.google.android.gms.maps.model.g m;
  private float n;
  private int o;
  private boolean p;
  private int q;
  private int r;
  private v s;
  private String t = "DRONELATITUDE";
  private String u = "DRONELONGITUDE";
  private final int v = 100;
  private Handler w = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if ((paramAnonymousMessage.what == 100) && (com.fimi.kernel.d.b.b(d.a(d.this).d) != null)) {
        com.fimi.kernel.d.b.b(d.a(d.this).d).a(d.a(d.this).d.getString(2131362681));
      }
    }
  };
  private i x;
  private i y;
  private List<LatLng> z = new ArrayList();
  
  public d(com.google.android.gms.maps.c paramc, Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.f = paramc;
    this.g = paramContext;
    this.h = parama;
    this.c = com.fimi.soul.module.droneFragment.g.a();
    a();
  }
  
  private double a(com.google.android.gms.maps.model.g paramg, ba paramba, LatLng paramLatLng)
  {
    double d1 = com.fimi.soul.utils.y.c(paramLatLng, paramba.b()).a();
    if (com.fimi.kernel.c.e().m())
    {
      paramg.a(this.g.getResources().getString(2131362152) + t.a(d1) + this.g.getResources().getString(2131362285));
      return t.a(d1);
    }
    paramg.a(this.g.getResources().getString(2131362152) + t.a(d1, 1) + this.g.getResources().getString(2131362458));
    return d1;
  }
  
  private void a(z paramz)
  {
    this.i = new LatLng(paramz.b(), paramz.c());
    paramz = new LatLng(paramz.b(), paramz.c());
    this.c.a(this.f, paramz);
    this.c.a("homename");
  }
  
  private void b(LatLng paramLatLng)
  {
    DisplayMetrics localDisplayMetrics = this.g.getResources().getDisplayMetrics();
    Point localPoint = this.f.n().a(paramLatLng);
    if ((localPoint.y > localDisplayMetrics.heightPixels) || (localPoint.y < 0) || (localPoint.x < 0) || (localPoint.x > localDisplayMetrics.widthPixels))
    {
      this.h.a(d.a.aW);
      if (this.h.r().a() / 100.0D >= 1.0D) {
        this.f.a(com.google.android.gms.maps.b.a(paramLatLng, this.A));
      }
      return;
    }
    this.h.a(d.a.aX);
  }
  
  private void c(LatLng paramLatLng)
  {
    if (this.h.ac())
    {
      h(paramLatLng);
      g(paramLatLng);
    }
    for (;;)
    {
      f(paramLatLng);
      e(paramLatLng);
      d(paramLatLng);
      return;
      if (this.x != null) {
        this.x.a();
      }
    }
  }
  
  private void d(LatLng paramLatLng)
  {
    ba localba;
    if ((this.b != null) && (this.b.size() > 0) && (this.k == 6) && (this.o > 0) && (this.o <= this.b.size()))
    {
      localba = (ba)this.b.get(this.o - 1);
      a(this.m, localba, paramLatLng);
      if (this.k == 6) {
        this.m.h();
      }
    }
    do
    {
      do
      {
        return;
        if (this.k != 4) {
          break;
        }
      } while ((this.b == null) || (this.b.size() <= 0));
      localba = (ba)this.b.get(0);
      a(this.m, localba, paramLatLng);
      this.m.h();
      return;
    } while ((!this.m.j()) || (com.fimi.soul.module.droneFragment.c.d().get() == 1));
    this.m.i();
  }
  
  private void e()
  {
    Object localObject = new LatLngBounds.a();
    Location localLocation = this.h.b();
    if (this.j != null) {
      ((LatLngBounds.a)localObject).a(this.j);
    }
    if (localLocation != null) {
      ((LatLngBounds.a)localObject).a(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()));
    }
    if (this.i != null) {
      ((LatLngBounds.a)localObject).a(this.i);
    }
    a(((LatLngBounds.a)localObject).a());
    localObject = com.fimi.soul.biz.d.a.a();
    ((com.fimi.soul.biz.d.a)localObject).a(true);
    ((com.fimi.soul.biz.d.a)localObject).a(a.a.b);
  }
  
  private void e(LatLng paramLatLng)
  {
    if (this.m != null)
    {
      com.fimi.soul.module.droneFragment.c.c().a(this.h);
      this.m.a(paramLatLng);
    }
    for (;;)
    {
      this.m.a(0.5F, 0.5F);
      if (this.n < 0.0F) {
        this.n += 360.0F;
      }
      this.m.b(this.n + g());
      return;
      this.m = this.f.a(new MarkerOptions().a(paramLatLng).a(com.google.android.gms.maps.model.b.a(2130838159)).a(false));
    }
  }
  
  private void f()
  {
    if (!this.h.U())
    {
      if (this.h.T().a()) {
        break label103;
      }
      if (this.m != null)
      {
        this.m.a();
        this.m = null;
        com.fimi.soul.module.droneFragment.g.a().b("dronename");
      }
      if (this.y != null)
      {
        this.y.a();
        this.y = null;
      }
      if (this.x != null)
      {
        this.x.a();
        this.x = null;
      }
      com.fimi.soul.module.droneFragment.g.a().b("homename");
    }
    for (;;)
    {
      com.fimi.soul.module.droneFragment.c.f();
      return;
      label103:
      if ((this.y != null) && (!this.y.h())) {
        this.y.b(true);
      }
    }
  }
  
  private void f(LatLng paramLatLng)
  {
    if (this.f.a() != null) {
      this.A = this.f.a().b;
    }
    if ((this.l) && (this.j.a > 1.0D) && (this.j.b > 1.0D) && (this.h.u().c() >= 6))
    {
      this.e += 1;
      this.h.f(true);
      this.A = 18.0F;
      if (!this.h.ac())
      {
        this.l = false;
        this.f.b(com.google.android.gms.maps.b.a(this.j, this.A));
      }
    }
    else
    {
      return;
    }
    paramLatLng = new LatLngBounds.a();
    Location localLocation = this.h.b();
    paramLatLng.a(this.j);
    if (localLocation != null) {
      paramLatLng.a(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()));
    }
    if (this.i != null) {
      paramLatLng.a(this.i);
    }
    a(paramLatLng.a());
  }
  
  /* Error */
  private float g()
  {
    // Byte code:
    //   0: fconst_0
    //   1: fstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 95	com/fimi/soul/module/dronemanage/d:f	Lcom/google/android/gms/maps/c;
    //   8: invokevirtual 417	com/google/android/gms/maps/c:a	()Lcom/google/android/gms/maps/model/CameraPosition;
    //   11: astore_3
    //   12: fload_2
    //   13: fstore_1
    //   14: aload_3
    //   15: ifnull +8 -> 23
    //   18: aload_3
    //   19: getfield 443	com/google/android/gms/maps/model/CameraPosition:d	F
    //   22: fstore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: fload_1
    //   26: freturn
    //   27: astore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_3
    //   31: athrow
    //   32: astore_3
    //   33: fload_2
    //   34: fstore_1
    //   35: goto -12 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	d
    //   13	22	1	f1	float
    //   1	33	2	f2	float
    //   11	8	3	localCameraPosition	CameraPosition
    //   27	4	3	localObject	Object
    //   32	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   4	12	27	finally
    //   18	23	27	finally
    //   4	12	32	java/lang/Exception
    //   18	23	32	java/lang/Exception
  }
  
  private void g(LatLng paramLatLng)
  {
    if (this.i != null)
    {
      this.z.add(paramLatLng);
      this.z.add(this.i);
      if (this.d == null)
      {
        this.d = new PolylineOptions();
        this.d.a(this.h.d.getResources().getColor(2131624057)).a(5.0F);
      }
      if ((this.y != null) && (this.y.h()))
      {
        this.y.a();
        this.y = null;
      }
      if (this.y == null) {
        break label155;
      }
      this.y.a(this.z);
      if (!this.y.g()) {
        this.y.a(true);
      }
    }
    for (;;)
    {
      this.z.clear();
      return;
      label155:
      this.y = this.f.a(this.d.a(new LatLng[] { paramLatLng, this.i }));
    }
  }
  
  private void h(LatLng paramLatLng)
  {
    if (this.x != null) {
      this.x.a();
    }
    this.x = this.f.a(a(paramLatLng));
  }
  
  public PolylineOptions a(LatLng paramLatLng)
  {
    if (this.a == null)
    {
      this.a = new PolylineOptions();
      this.a.b(true);
      this.a.a(3.0F);
      this.a.a(-65536);
    }
    this.a.a(paramLatLng);
    paramLatLng = this.a.b();
    if ((paramLatLng != null) && (paramLatLng.size() >= 10)) {
      paramLatLng.remove(paramLatLng.get(0));
    }
    return this.a;
  }
  
  public void a()
  {
    this.h.a(this);
    com.fimi.soul.module.droneFragment.c.c().e();
  }
  
  public void a(LatLngBounds paramLatLngBounds)
  {
    this.f.a(com.google.android.gms.maps.b.a(paramLatLngBounds, com.fimi.soul.utils.g.a(this.h.d, 30.0F), com.fimi.soul.utils.g.a(this.h.d, 30.0F), 0), new c.a()
    {
      public void a()
      {
        if (d.this.e >= 2)
        {
          d.a(d.this, false);
          d.this.e = 0;
        }
      }
      
      public void b()
      {
        d.a(d.this, true);
      }
    });
  }
  
  public void a(com.google.android.gms.maps.model.g paramg)
  {
    double d1;
    if ((this.j != null) && (this.m != null))
    {
      d1 = com.fimi.soul.utils.y.c(this.j, paramg.c()).a();
      if (!com.fimi.kernel.c.e().m()) {
        break label100;
      }
      this.m.a(this.g.getResources().getString(2131362152) + t.a(d1) + this.g.getResources().getString(2131362285));
    }
    for (;;)
    {
      this.m.h();
      return;
      label100:
      this.m.a(this.g.getResources().getString(2131362152) + t.a(d1, 1) + this.g.getResources().getString(2131362458));
    }
  }
  
  public void b()
  {
    this.l = true;
  }
  
  public void c()
  {
    com.fimi.soul.module.droneFragment.c.c().b(0);
    com.fimi.soul.module.droneFragment.c.c();
    com.fimi.soul.module.droneFragment.c.f();
  }
  
  public void d()
  {
    if (this.m != null)
    {
      this.m.a();
      this.m = null;
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (3.a[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        do
        {
          return;
          f();
          return;
        } while (parama1.u().c() <= 3);
        parama = parama1.u();
        this.j = new LatLng(parama.e(), parama.d());
        parama1.a(this.j);
      } while (parama1.aj().d() == 2);
      c(this.j);
      return;
      f();
      return;
      if (parama1.ac()) {
        if (parama1.v().f())
        {
          a(parama1.v());
          if ((!this.p) && (parama1.aj().b() == 3))
          {
            this.p = true;
            this.s = v.a(this.g);
            this.t = "DRONELATITUDE";
            this.u = "DRONELONGITUDE";
            this.s.a().edit().putFloat(this.t, (float)parama1.v().b()).commit();
            this.s.a().edit().putFloat(this.u, (float)parama1.v().c()).commit();
            this.w.sendEmptyMessageDelayed(100, 1500L);
            e();
          }
          if (this.r != this.k) {
            this.r = this.k;
          }
        }
      }
      for (;;)
      {
        this.o = parama1.v().e();
        if (this.q == this.k) {
          break;
        }
        this.q = this.k;
        return;
        this.p = false;
        com.fimi.soul.module.droneFragment.g.a().b("homename");
        if (this.y != null)
        {
          this.y.a();
          this.y = null;
        }
      }
      this.n = ((float)(parama1.r().k() / 10.0D));
      return;
      this.k = parama1.aj().e();
      return;
    } while (this.m == null);
    if (this.n < 0.0F) {
      this.n += 360.0F;
    }
    this.m.b(this.n + parama1.ae());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */