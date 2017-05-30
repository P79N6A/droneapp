package com.fimi.soul.module.update;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.e.d.a;
import com.fimi.soul.biz.update.f;
import com.fimi.soul.biz.update.f.b;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.utils.ao;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class UpgradingActivity
  extends BaseActivity
  implements e<X11RespCmd>, c.a
{
  public static final String a = "sp_upgrade_skip";
  private static final int q = 153;
  private static final int r = 256;
  private static final int s = 136;
  private static final int t = 102;
  private static final int u = 50;
  private static int w = 1;
  private int A = 0;
  private com.fimi.soul.biz.camera.d B = null;
  private com.fimi.soul.biz.update.d C;
  private String D = null;
  private a E;
  private Boolean F;
  private boolean G;
  private StringBuffer H = null;
  private boolean I;
  private TextView J;
  private boolean K = false;
  private boolean L = false;
  private boolean M = false;
  private v N;
  private String O = "is_setting_enter";
  private Toast P;
  List<FirmwareInfo> b;
  com.fimi.soul.biz.update.a c = null;
  c d = null;
  com.fimi.soul.biz.e.d e = null;
  d.a f;
  com.fimi.soul.biz.e.c g = null;
  com.fimi.soul.biz.e.c.a h;
  long i;
  private ProgressView j;
  private TextView k;
  private ImageView l;
  private com.fimi.soul.drone.a m;
  private TextView n;
  private f o;
  private TextView p;
  private final int v = 32;
  private boolean x;
  private int y = 0;
  private int z = 1;
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((System.currentTimeMillis() - this.i > 500L) || (paramInt2 == paramInt3) || (paramInt1 == 256))
    {
      this.i = System.currentTimeMillis();
      Message localMessage = new Message();
      localMessage.what = paramInt1;
      localMessage.arg1 = paramInt2;
      localMessage.arg2 = paramInt3;
      getHandler().sendMessageDelayed(localMessage, 50L);
    }
  }
  
  private void a(FirmwareInfo paramFirmwareInfo)
  {
    if (b(paramFirmwareInfo))
    {
      this.c.a(new i()
      {
        public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
        {
          if (paramAnonymousBoolean) {
            UpgradingActivity.d(UpgradingActivity.this).sendEmptyMessageDelayed(102, 50L);
          }
        }
      }, this, paramFirmwareInfo);
      return;
    }
    this.o.a(paramFirmwareInfo, this.z);
  }
  
  private void a(String paramString)
  {
    a(153, Integer.valueOf(paramString.substring(paramString.lastIndexOf("=") + 1, paramString.length()).trim()).intValue() / 2 + 50, 100);
  }
  
  private void b()
  {
    this.o.e();
    this.b = com.fimi.soul.module.update.a.a.a().d();
    if ((this.b == null) || (this.b.size() == 0)) {
      finish();
    }
    FirmwareInfo localFirmwareInfo;
    do
    {
      return;
      this.p.setText(getResources().getString(2131362890) + ((FirmwareInfo)this.b.get(this.z - 1)).getSysName());
      this.E = a(this.b);
      this.A = this.b.size();
      this.y = (this.b.size() * 100);
      this.j.setMaxCount(this.y);
      this.o.a(new i()
      {
        public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
        {
          if (paramAnonymousInt == -1)
          {
            UpgradingActivity.a(UpgradingActivity.this);
            return;
          }
          if (paramAnonymousBoolean)
          {
            UpgradingActivity.a(UpgradingActivity.this, 256, paramAnonymousInt, 0);
            return;
          }
          UpgradingActivity.a(UpgradingActivity.this, paramAnonymousInt);
          UpgradingActivity.a(UpgradingActivity.this, 153, (int)paramAnonymousLong1, (int)paramAnonymousLong2);
        }
      });
      this.o.a(new f.b()
      {
        public void a(int paramAnonymousInt)
        {
          UpgradingActivity.b(UpgradingActivity.this, paramAnonymousInt);
        }
        
        public void a(boolean paramAnonymousBoolean)
        {
          if ((paramAnonymousBoolean) && (!UpgradingActivity.b(UpgradingActivity.this)))
          {
            UpgradingActivity.c(UpgradingActivity.this);
            UpgradingActivity.a(UpgradingActivity.this, true);
          }
        }
      });
      localFirmwareInfo = (FirmwareInfo)this.b.get(0);
    } while (!c());
    this.d.a();
    if ((localFirmwareInfo.getSysId() == 4) || (localFirmwareInfo.getSysId() == 13))
    {
      b(localFirmwareInfo.getSysId());
      return;
    }
    a(localFirmwareInfo);
  }
  
  private void b(final int paramInt)
  {
    this.D = "firmware.zip";
    new Thread(new Runnable()
    {
      public void run()
      {
        l.c("request camera upgrade:" + paramInt);
        if (paramInt == 13)
        {
          l.c("request camera upgrade:xx");
          locald = UpgradingActivity.i(UpgradingActivity.this).s();
          UpgradingActivity.h(UpgradingActivity.this);
          locald.h(com.fimi.soul.biz.update.d.c());
          return;
        }
        com.fimi.soul.biz.camera.c.d locald = UpgradingActivity.i(UpgradingActivity.this).s();
        UpgradingActivity.h(UpgradingActivity.this);
        locald.h(com.fimi.soul.biz.update.d.b());
      }
    }).start();
  }
  
  private boolean b(FirmwareInfo paramFirmwareInfo)
  {
    return (paramFirmwareInfo.getSysId() == 11) || (paramFirmwareInfo.getSysId() == 15) || (paramFirmwareInfo.getSysId() == 14);
  }
  
  private void c(int paramInt)
  {
    a(153, paramInt / 2 + 50, 100);
  }
  
  private void c(FirmwareInfo paramFirmwareInfo)
  {
    if (b(paramFirmwareInfo))
    {
      this.c.a(new i()
      {
        public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
        {
          if (paramAnonymousBoolean) {
            UpgradingActivity.j(UpgradingActivity.this).sendEmptyMessageDelayed(102, 50L);
          }
        }
      }, this, paramFirmwareInfo);
      return;
    }
    if (d(paramFirmwareInfo))
    {
      this.o.a(paramFirmwareInfo, this.z);
      return;
    }
    if (d(paramFirmwareInfo))
    {
      this.o.a(paramFirmwareInfo, this.z);
      return;
    }
    if (!this.m.U())
    {
      getHandler().sendEmptyMessageDelayed(32, 50L);
      return;
    }
    this.o.a(paramFirmwareInfo, this.z);
  }
  
  private boolean c()
  {
    if (this.o.c())
    {
      k();
      return false;
    }
    return true;
  }
  
  private void d()
  {
    this.d.b();
    this.d.a();
    try
    {
      this.c.e();
      this.e = com.fimi.soul.biz.e.d.a();
      this.f = new d.a()
      {
        public void a(RelayEntity paramAnonymousRelayEntity)
        {
          int i = paramAnonymousRelayEntity.getFirmupg_finished();
          if (i <= 0) {}
          do
          {
            return;
            if (!UpgradingActivity.e(UpgradingActivity.this)) {
              UpgradingActivity.a(UpgradingActivity.this, 153, i, 100);
            }
            if (i < 100)
            {
              UpgradingActivity.this.d.b();
              return;
            }
          } while (UpgradingActivity.e(UpgradingActivity.this));
          l.d(((FirmwareInfo)UpgradingActivity.this.b.get(UpgradingActivity.f(UpgradingActivity.this) - 1)).getVersion());
          UpgradingActivity.a(UpgradingActivity.this, 256, 0, 0);
          UpgradingActivity.b(UpgradingActivity.this, true);
        }
      };
      this.e.a(this.f);
      this.g = com.fimi.soul.biz.e.c.a();
      this.h = new com.fimi.soul.biz.e.c.a()
      {
        public void a(RelayEntity paramAnonymousRelayEntity)
        {
          int i = paramAnonymousRelayEntity.getFirmupg_finished();
          if (i <= 0) {}
          do
          {
            return;
            if (!UpgradingActivity.g(UpgradingActivity.this)) {
              UpgradingActivity.a(UpgradingActivity.this, 153, i, 100);
            }
            if (i < 100)
            {
              UpgradingActivity.this.d.b();
              return;
            }
          } while (UpgradingActivity.g(UpgradingActivity.this));
          l.d(((FirmwareInfo)UpgradingActivity.this.b.get(UpgradingActivity.f(UpgradingActivity.this) - 1)).getVersion());
          try
          {
            Thread.sleep(2000L);
            UpgradingActivity.a(UpgradingActivity.this, 256, 0, 0);
            UpgradingActivity.c(UpgradingActivity.this, true);
            return;
          }
          catch (InterruptedException paramAnonymousRelayEntity)
          {
            for (;;)
            {
              paramAnonymousRelayEntity.printStackTrace();
            }
          }
        }
      };
      this.g.a(this.h);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l.b("e:closeFtpNetwork:" + localException.getMessage().toString());
      }
    }
  }
  
  private boolean d(FirmwareInfo paramFirmwareInfo)
  {
    return paramFirmwareInfo.getSysId() == 1;
  }
  
  private void e()
  {
    this.d = new c(0, this);
    this.H = new StringBuffer();
    this.E = a.d;
    w = 1;
    this.c = new com.fimi.soul.biz.update.a();
    this.C = new com.fimi.soul.biz.update.d();
    this.B = ((com.fimi.soul.biz.camera.d)b.a().d());
    this.I = false;
    this.B.c(false);
    this.B.a(this);
    this.B.c(new com.fimi.kernel.b.c.d()
    {
      public void a(String paramAnonymousString) {}
    });
    this.B.s().a(new i()
    {
      public void a(boolean paramAnonymousBoolean, long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt)
      {
        l.c("uplaod file progress:" + 100L * paramAnonymousLong1 / paramAnonymousLong2 + "%");
        if (!UpgradingActivity.i(UpgradingActivity.this).s().g()) {
          UpgradingActivity.a(UpgradingActivity.this, 153, (int)paramAnonymousLong1 / 2, (int)paramAnonymousLong2);
        }
      }
    });
    l.e();
    this.m = ((DroidPlannerApp)getApplication()).a;
    this.o = new f(this, this.m);
  }
  
  private void f()
  {
    l.c("fw_upgrade_complete");
    this.I = true;
    l.e(((FirmwareInfo)this.b.get(0)).getVersion());
    g();
  }
  
  private void g()
  {
    ((FirmwareInfo)this.b.get(0)).setIsUpgradeSuccess(Boolean.valueOf(true));
    if (this.A >= 2)
    {
      FirmwareInfo localFirmwareInfo = (FirmwareInfo)this.b.get(1);
      this.z += 1;
      a(localFirmwareInfo);
      return;
    }
    h();
  }
  
  private void h()
  {
    w = 0;
    this.d.d();
    this.o.m();
    if (this.G) {}
    try
    {
      this.H.deleteCharAt(this.H.length() - 1);
      if (!this.M)
      {
        if (this.E != a.b) {
          break label82;
        }
        l.b("reset rc");
        this.o.k();
        i();
      }
      for (;;)
      {
        this.M = true;
        return;
        label82:
        i();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void i()
  {
    n();
    try
    {
      Thread.sleep(1000L);
      w = 0;
      m();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
  
  private void j()
  {
    if (this.G)
    {
      com.fimi.kernel.utils.z.a(this, this.H.toString() + getResources().getString(2131362874));
      return;
    }
    com.fimi.kernel.utils.z.a(this, 2131362882);
  }
  
  private void k()
  {
    this.G = true;
    this.I = true;
    this.B.s().a(true);
    getHandler().sendEmptyMessageDelayed(32, 50L);
  }
  
  private void l()
  {
    this.H.append(((FirmwareInfo)this.b.get(this.z - 1)).getSysName() + ",");
    if ((a()) && (this.m.T().a()))
    {
      this.z += 1;
      if (!c()) {
        return;
      }
      int i1 = this.z;
      c((FirmwareInfo)this.b.get(i1 - 1));
      return;
    }
    m();
  }
  
  private void m()
  {
    Intent localIntent = new Intent(this, UpgradeResultActivity.class);
    localIntent.putExtra("result_list", (Serializable)this.b);
    startActivity(localIntent);
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  private void n()
  {
    if (this.B != null)
    {
      this.B.s().a(true);
      this.B = null;
    }
    this.o.e();
    this.o.l();
    this.c = null;
    this.d.d();
    o();
    p();
    getHandler().removeCallbacksAndMessages(null);
    System.gc();
  }
  
  private void o()
  {
    if ((this.e != null) && (this.f != null)) {
      this.e.b(this.f);
    }
  }
  
  private void p()
  {
    if ((this.g != null) && (this.h != null)) {
      this.g.b(this.h);
    }
  }
  
  private void q()
  {
    if (this.x)
    {
      this.B.s().a(true);
      new Thread(new Runnable()
      {
        public void run()
        {
          o.a.d = 0;
          o.a.e = 2;
          UpgradingActivity.k(UpgradingActivity.this).T().a(o.a.a());
        }
      }).start();
      this.P.cancel();
      startActivity(new Intent(this, FindNewFirmwareAvtivity.class));
      finish();
      return;
    }
    this.x = true;
    this.P = Toast.makeText(getApplicationContext(), 2131362891, 0);
    this.P.show();
    getHandler().sendEmptyMessageDelayed(136, 2000L);
  }
  
  public a a(List<FirmwareInfo> paramList)
  {
    a locala = a.d;
    Iterator localIterator = paramList.iterator();
    Object localObject = locala;
    if (localIterator.hasNext())
    {
      localObject = (FirmwareInfo)localIterator.next();
      if (((FirmwareInfo)localObject).getSysId() == 11)
      {
        locala = a.a;
        localIterator = paramList.iterator();
        paramList = locala;
        label58:
        localObject = paramList;
        if (!localIterator.hasNext()) {
          break label109;
        }
        if (((FirmwareInfo)localIterator.next()).getSysId() != 1) {
          break label114;
        }
        paramList = a.c;
      }
    }
    label109:
    label114:
    for (;;)
    {
      break label58;
      if (((FirmwareInfo)localObject).getSysId() == 1) {
        locala = a.b;
      }
      for (;;)
      {
        break;
        return (a)localObject;
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.z = paramInt;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      k();
    }
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if ((paramBoolean) && (paramX11RespCmd.isNotification()))
    {
      if ("put_file_complete".equals(paramX11RespCmd.getType()))
      {
        l.c("put_file_complete");
        this.d.b();
      }
      if ("fw_upgrade_complete".equals(paramX11RespCmd.getType())) {
        f();
      }
      if ("fw_unzip_finish".equals(paramX11RespCmd.getType())) {
        l.c("fw_unzip_finish");
      }
      if ("fw_unzipping".equals(paramX11RespCmd.getType())) {
        l.c("fw_unzipping");
      }
      if ((paramX11RespCmd.getType().contains("progress")) && (!this.I))
      {
        paramX11RespCmd = paramX11RespCmd.getType();
        l.c(paramX11RespCmd);
        a(paramX11RespCmd);
      }
    }
  }
  
  public boolean a()
  {
    return this.A > this.z;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    this.N = v.a(this);
    this.F = Boolean.valueOf(this.N.a().getBoolean(this.O, false));
    getWindow().setFlags(128, 128);
    setContentView(2130968635);
    this.j = ((ProgressView)findViewById(2131689873));
    this.k = ((TextView)findViewById(2131689872));
    ao.b(getAssets(), new View[] { this.k });
    this.l = ((ImageView)findViewById(2131689871));
    this.p = ((TextView)findViewById(2131689723));
    this.J = ((TextView)findViewById(2131689724));
    ao.a(getAssets(), new View[] { this.p, this.J });
    this.n = ((TextView)findViewById(2131689722));
    ao.b(getAssets(), new View[] { this.n });
    this.z = 1;
    e();
    b();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    n();
  }
  
  public void onHandleMessage(Message paramMessage)
  {
    if (paramMessage.what == 153)
    {
      this.d.b();
      this.p.setText(getResources().getString(2131362890) + ((FirmwareInfo)this.b.get(this.z - 1)).getSysName());
      int i1 = paramMessage.arg1 * 100 / paramMessage.arg2 + (this.z - 1) * 100;
      this.k.setText(i1 * 100 / this.y + "");
      this.j.setCurrentCount(i1);
    }
    if (paramMessage.what == 256)
    {
      this.o.f();
      ((FirmwareInfo)this.b.get(this.z - 1)).setIsUpgradeSuccess(Boolean.valueOf(true));
      this.o.a((FirmwareInfo)this.b.get(this.z - 1));
      if (!c()) {
        return;
      }
      if (!a()) {
        break label294;
      }
      this.z += 1;
      a((FirmwareInfo)this.b.get(this.z - 1));
    }
    for (;;)
    {
      if (paramMessage.what == 136) {
        this.x = false;
      }
      if (paramMessage.what == 102) {
        d();
      }
      if (paramMessage.what != 32) {
        break;
      }
      l();
      return;
      label294:
      h();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      q();
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (w == 0)
    {
      w = 0;
      m();
    }
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    this.l.setBackgroundResource(2130838593);
    ((AnimationDrawable)this.l.getBackground()).start();
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/UpgradingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */