package com.fimi.soul.biz.update;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.w;
import com.fimi.soul.drone.c.a.a.aa;
import com.fimi.soul.drone.c.a.a.bl;
import com.fimi.soul.drone.c.a.a.bn;
import com.fimi.soul.drone.c.a.a.bp;
import com.fimi.soul.drone.c.a.a.bq;
import com.fimi.soul.drone.c.a.a.z;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.d.r;
import com.fimi.soul.drone.d.s;
import com.fimi.soul.drone.d.t;
import com.fimi.soul.drone.h.ah;
import com.fimi.soul.drone.h.an;
import com.fimi.soul.drone.h.av;
import com.fimi.soul.drone.h.aw;
import com.fimi.soul.drone.h.ay;
import com.fimi.soul.drone.h.az;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.module.dronemanage.j;
import com.fimi.soul.module.update.a.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class f
  extends c
  implements d.b
{
  public static com.fimi.soul.drone.g.f A;
  private static int H = 0;
  private static int I = 0;
  private static bn Q;
  static i f;
  public static final int h = 300;
  public static final int i = -1;
  public static final String j = "firmware_info";
  public static int k = 0;
  public static final String l = "sp_upgrading";
  public static final int m = 2;
  public static final int n = 3;
  public static final int o = 10;
  public static final int p = 5;
  public static final int q = 9;
  public static final int r = 100;
  public static final int s = 10;
  public static boolean u = false;
  public static boolean v = false;
  public static boolean w = false;
  public static boolean x = false;
  static Queue<bn> z = new LinkedList();
  List<com.fimi.soul.drone.g.f> B = new ArrayList();
  com.fimi.soul.module.update.a.a C;
  int D;
  private Timer E = new Timer();
  private Context F;
  private com.fimi.soul.drone.a G;
  private FragmentManager J;
  private boolean K;
  private Timer L = new Timer();
  private long M;
  private boolean N;
  private c O;
  private int P;
  private int R;
  public b g;
  public int t = 1500;
  public d y;
  
  public f() {}
  
  public f(Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.F = paramContext;
    this.G = parama;
    parama.a(this);
    this.y = ((d)b.a().d());
    this.C = com.fimi.soul.module.update.a.a.a();
  }
  
  private void a(byte paramByte)
  {
    try
    {
      if (this.G.N().a() == Q.d)
      {
        if (A != null) {
          A.e();
        }
        Message localMessage = new Message();
        localMessage.what = 5;
        localMessage.arg1 = k;
        localMessage.arg2 = 300;
        if (this.G.N().a() == I)
        {
          this.D = this.G.N().a();
          a().sendMessage(localMessage);
          v = false;
          this.K = true;
          if (this.E != null) {
            this.E.cancel();
          }
          H = 1;
          s.a.d = paramByte;
          this.E = new Timer();
          this.E.schedule(new a(s.a.a(), this.G), 100L, 1000L);
          return;
        }
        this.D = this.G.N().a();
        a().sendMessage(localMessage);
        if (z.size() > 0)
        {
          b();
          return;
        }
      }
    }
    catch (Exception localException)
    {
      if (f != null) {
        f.a(false, 0L, 0L, -1);
      }
    }
  }
  
  public static void n()
  {
    try
    {
      UpgradeResultInfo localUpgradeResultInfo = (UpgradeResultInfo)com.fimi.kernel.c.c().a("upgradeResultInfo", UpgradeResultInfo.class);
      if (com.fimi.kernel.c.a() != null)
      {
        if (localUpgradeResultInfo == null) {
          return;
        }
        new Thread(new Runnable()
        {
          public void run()
          {
            w.a(com.fimi.kernel.c.a()).a(new k()
            {
              public void a(PlaneMsg paramAnonymous2PlaneMsg, File paramAnonymous2File)
              {
                if (paramAnonymous2PlaneMsg.isSuccess()) {
                  com.fimi.kernel.c.c().a("upgradeResultInfo", "");
                }
              }
            }, this.a);
          }
        }).start();
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private long r()
  {
    I = this.C.f().a();
    z = this.C.f().b();
    return I;
  }
  
  private void s()
  {
    A = new com.fimi.soul.drone.g.f(this.t, new Runnable()
    {
      public void run()
      {
        if (f.o() != null) {
          f.a(f.this).T().a(f.o().a());
        }
        f.b(f.this);
        if (f.c(f.this) >= 10) {
          f.d(f.this).sendEmptyMessage(2);
        }
      }
    });
    if (!this.B.contains(A)) {
      this.B.add(A);
    }
  }
  
  public void a(int paramInt)
  {
    this.C.b(paramInt);
  }
  
  protected void a(Message paramMessage)
  {
    super.a(paramMessage);
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      f.a(false, 0L, 0L, -1);
      return;
      f.a(false, 0L, 0L, -1);
      return;
      if (A != null)
      {
        A.e();
        A.f();
      }
      this.R = 0;
      f.a(false, 0L, 0L, -1);
      return;
    } while ((f == null) || (paramMessage.arg2 != 300));
    if (com.fimi.kernel.c.c.a().b("sp_upgrading") == 5)
    {
      f.a(false, this.D / 2, I, k);
      return;
    }
    f.a(false, this.D, I, k);
  }
  
  public void a(b paramb)
  {
    this.g = paramb;
  }
  
  public void a(final c paramc)
  {
    if (com.fimi.kernel.c.a() == null) {
      return;
    }
    w.a(com.fimi.kernel.c.a()).b(new k()
    {
      public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
      {
        if (paramAnonymousPlaneMsg.isSuccess())
        {
          paramAnonymousPlaneMsg = (List)paramAnonymousPlaneMsg.getData();
          paramc.a(paramAnonymousPlaneMsg);
        }
      }
    });
  }
  
  public void a(i parami)
  {
    f = parami;
  }
  
  public void a(FirmwareInfo paramFirmwareInfo)
  {
    this.C.a(paramFirmwareInfo.getSysId(), Integer.valueOf(paramFirmwareInfo.getVersion()).intValue());
    this.C.a(paramFirmwareInfo.getSysId()).b(Integer.valueOf(paramFirmwareInfo.getVersion()).intValue());
  }
  
  public void a(FirmwareInfo paramFirmwareInfo, int paramInt)
  {
    k = paramInt;
    this.t = 1500;
    this.N = false;
    com.fimi.kernel.c.c.a().a("sp_upgrading", paramFirmwareInfo.getSysId());
    a(paramFirmwareInfo.getSysId());
    b(paramFirmwareInfo.getSysId());
  }
  
  public void b()
  {
    Q = (bn)z.poll();
    if ((Q != null) && (f != null))
    {
      this.G.T().a(Q.a());
      if (!A.b()) {
        A.c();
      }
    }
  }
  
  public void b(int paramInt)
  {
    try
    {
      if ((int)r() > 0)
      {
        if (this.E != null)
        {
          this.E.cancel();
          this.E = null;
        }
        H = 1;
        x = false;
        this.L = new Timer();
        o.a.d = ((byte)paramInt);
        o.a.e = 1;
        this.G.T().a(o.a.a());
        this.L.schedule(new a(o.a.a(), this.G), 200L, 2000L);
        return;
      }
      Toast.makeText(this.F, this.F.getResources().getString(2131362253), 1).show();
      return;
    }
    catch (Exception localException)
    {
      f.a(false, 0L, 0L, -1);
      localException.printStackTrace();
    }
  }
  
  public void b(UpdateVersonBean paramUpdateVersonBean, String paramString, i parami)
  {
    a(paramUpdateVersonBean, paramString, parami);
  }
  
  public boolean c()
  {
    if (this.G != null) {
      return this.G.ac();
    }
    return false;
  }
  
  public void d()
  {
    try
    {
      Thread.sleep(100L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
  
  public String e(UpdateVersonBean paramUpdateVersonBean)
  {
    return d(paramUpdateVersonBean);
  }
  
  public void e()
  {
    if (this.E != null)
    {
      this.E.cancel();
      this.E = null;
    }
    if (this.L != null)
    {
      this.L.cancel();
      this.L = null;
    }
    if (A != null)
    {
      A.e();
      A = null;
    }
    f = null;
    k = 1;
    if ((this.B != null) && (this.B.size() > 0))
    {
      Iterator localIterator = this.B.iterator();
      while (localIterator.hasNext())
      {
        com.fimi.soul.drone.g.f localf = (com.fimi.soul.drone.g.f)localIterator.next();
        if (localf != null)
        {
          localf.e();
          localf.f();
        }
      }
    }
  }
  
  public void f()
  {
    if (A != null) {
      A.e();
    }
    A = null;
  }
  
  public void k()
  {
    com.fimi.soul.drone.d.g.a.d = 1;
    this.G.T().a(com.fimi.soul.drone.d.g.a.a());
  }
  
  public void l()
  {
    this.G.b(this);
  }
  
  public void m()
  {
    try
    {
      UpgradeResultInfo localUpgradeResultInfo = l.a(this.F);
      if (localUpgradeResultInfo != null) {
        com.fimi.kernel.c.c().a("upgradeResultInfo", localUpgradeResultInfo);
      }
      if (com.fimi.kernel.c.a() == null) {
        return;
      }
      w.a(com.fimi.kernel.c.a()).a(new k()
      {
        public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
        {
          if (paramAnonymousPlaneMsg.isSuccess()) {
            com.fimi.kernel.c.c().a("upgradeResultInfo", "");
          }
        }
      }, localUpgradeResultInfo);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    boolean bool = false;
    int i2 = 0;
    switch (5.b[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        for (;;)
        {
          return;
          parama = parama1.Y();
          if (parama.d == 0)
          {
            if ((parama.c == 1) && (!x))
            {
              x = true;
              H = 1;
              if (this.L != null) {
                this.L.cancel();
              }
              this.E = new Timer();
              r.a.d = ((byte)parama.b);
              r.a.e = 0;
              r.a.f = 1;
              if (System.currentTimeMillis() - this.M > 800L)
              {
                parama1.T().a(r.a.a());
                this.E.schedule(new a(r.a.a(), parama1), 200L, 2000L);
              }
            }
            this.M = System.currentTimeMillis();
            if ((parama.c == 2) && (f != null) && (!u))
            {
              t.a.d = ((byte)com.fimi.kernel.c.c.a().b("sp_upgrading"));
              t.a.e = 1;
              u = true;
              H = 1;
              if (this.E != null)
              {
                this.E.cancel();
                this.E = new Timer();
                this.E.schedule(new a(t.a.a(), parama1), 100L, 1000L);
                return;
                int i1 = parama1.c.a();
                if (i1 == 51)
                {
                  parama = (com.fimi.soul.drone.h.i)parama1.c;
                  this.y.i().setDvVersion(parama.d() + "");
                  return;
                }
                if (i1 == 50)
                {
                  parama = (com.fimi.soul.drone.h.g)parama1.c;
                  switch (5.a[parama.f().ordinal()])
                  {
                  default: 
                    return;
                  case 1: 
                    if (this.g != null)
                    {
                      this.g.a(parama.e());
                      if (parama.e() == 100)
                      {
                        this.g.a(true);
                        return;
                      }
                    }
                    break;
                  case 2: 
                    if (this.g != null)
                    {
                      this.g.a(false);
                      return;
                      if (x)
                      {
                        x = false;
                        H = 1;
                        if (this.E != null) {
                          this.E.cancel();
                        }
                        this.P = parama1.O().a();
                        if (r.a.d == this.P)
                        {
                          i1 = parama1.O().b();
                          if ((i1 == 0) || (i1 == 4))
                          {
                            this.R = 0;
                            if (A == null)
                            {
                              s();
                              A.d();
                            }
                            b();
                            return;
                          }
                          f.a(false, 0L, 0L, -1);
                          return;
                          this.R = 0;
                          i1 = parama1.N().b();
                          if ((i1 == 0) || (i1 == 4))
                          {
                            this.t = 300;
                            a(parama1.N().b);
                            return;
                          }
                          f.a(false, 0L, 0L, -1);
                          return;
                          parama = parama1.R();
                          H = 0;
                          if (this.E != null)
                          {
                            this.E.cancel();
                            this.E = null;
                          }
                          if (parama.b == 1) {
                            try
                            {
                              Thread.sleep(1000L);
                              if (f != null)
                              {
                                i1 = i2;
                                if (this.K)
                                {
                                  if (com.fimi.kernel.c.c.a().b("sp_upgrading") == 5)
                                  {
                                    this.N = true;
                                    f.a(false, I / 2, I, k);
                                    this.K = false;
                                    i1 = i2;
                                  }
                                }
                                else {
                                  while (i1 < 4)
                                  {
                                    t.a(parama1, 2, com.fimi.kernel.c.c.a().b("sp_upgrading"));
                                    d();
                                    i1 += 1;
                                  }
                                }
                              }
                            }
                            catch (InterruptedException parama)
                            {
                              for (;;)
                              {
                                parama.printStackTrace();
                                continue;
                                f.a(true, I, I, k);
                              }
                            }
                          }
                        }
                      }
                    }
                    break;
                  }
                }
              }
            }
          }
        }
        a().sendEmptyMessage(9);
        j.b();
        u = false;
        H = 1;
      } while (v);
      v = true;
      o.a.d = parama1.Q().c;
      o.a.e = 2;
      if (this.E != null) {
        this.E.cancel();
      }
      this.E = new Timer();
      this.E.schedule(new a(o.a.a(), parama1), 100L, 1000L);
      return;
    } while ((f == null) || (com.fimi.kernel.c.c.a().b("sp_upgrading") != 5) || (!this.N));
    parama = f;
    if (parama1.ar().a() == 100) {
      bool = true;
    }
    parama.a(bool, parama1.ar().a() / 2 + 50, 100L, k);
  }
  
  class a
    extends TimerTask
  {
    private com.fimi.soul.drone.c.a.c b;
    private com.fimi.soul.drone.a c;
    
    public a(com.fimi.soul.drone.c.a.c paramc, com.fimi.soul.drone.a parama)
    {
      this.b = paramc;
      this.c = parama;
    }
    
    public void run()
    {
      f.p();
      this.c.T().a(this.b);
      if (f.q() == 20)
      {
        if (f.e(f.this) != null) {
          f.e(f.this).cancel();
        }
        if (f.f != null) {
          f.f.a(false, 0L, 0L, -1);
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
    
    public abstract void a(boolean paramBoolean);
  }
  
  public static abstract interface c
  {
    public abstract void a(List<UpdateVersonBean> paramList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */