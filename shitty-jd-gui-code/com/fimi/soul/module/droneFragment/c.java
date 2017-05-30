package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.entity.DroneModelType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.g;
import java.util.concurrent.atomic.AtomicInteger;

public class c
  extends com.fimi.kernel.b
{
  public static final int a = 0;
  public static final int b = 1;
  private static AtomicInteger c = new AtomicInteger(0);
  private static AtomicInteger d = new AtomicInteger(1);
  private static g f;
  private static final c h = new c();
  private com.fimi.soul.drone.a e;
  private com.google.android.gms.maps.c g;
  private Runnable i = new Runnable()
  {
    public void run()
    {
      if (c.g() != null)
      {
        c.a(c.this, true);
        c.h().set(1);
        c.g().a();
        c.a(null);
      }
    }
  };
  private boolean j = true;
  
  public static void a(int paramInt)
  {
    d.set(paramInt);
  }
  
  public static AtomicInteger b()
  {
    return d;
  }
  
  public static c c()
  {
    return h;
  }
  
  public static AtomicInteger d()
  {
    return c;
  }
  
  public static void f()
  {
    if (f != null)
    {
      f.a();
      f = null;
    }
  }
  
  protected void a(Message paramMessage) {}
  
  public void a(com.fimi.soul.drone.a parama)
  {
    if (parama.aj().g().isLightStream()) {}
    label224:
    do
    {
      do
      {
        do
        {
          return;
          this.e = parama;
          this.g = parama.aa();
          if ((!parama.T().a()) || (!parama.U()) || (((parama.ai().a <= 1.0D) || (parama.ai().b <= 1.0D) || (c.get() != 0)) && (d.get() != 0))) {
            break label224;
          }
          if (d.get() != 0) {
            break;
          }
          d.set(1);
          if (f == null) {
            f = this.g.a(com.fimi.soul.drone.b.a.a(parama.ai()).a(com.google.android.gms.maps.model.b.a(com.fimi.soul.drone.b.b.b(2130837972, parama.d.getResources().getString(2131362259), "", parama.d))));
          }
          this.g.b(com.google.android.gms.maps.b.a(parama.ai(), 18.0F));
        } while ((f == null) || (this.j != true));
        this.j = false;
        a().postDelayed(this.i, 5000L);
        return;
      } while (f == null);
      f.a(parama.ai());
      return;
    } while (f == null);
    f.a(parama.ai());
  }
  
  public void b(int paramInt)
  {
    c.set(paramInt);
  }
  
  public void e()
  {
    this.j = true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */