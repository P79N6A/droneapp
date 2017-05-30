package com.fimi.soul.module.update;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.c.f;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.droneui.a.a;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.a.g;
import java.util.List;

public class CheckFirmwareActvity
  extends BaseActivity
  implements d.b, UpdateConnectDefeaFrgment.a
{
  private String A = "connect_success";
  List<FirmwareInfo> a = null;
  com.fimi.soul.biz.camera.d b;
  g c;
  com.fimi.soul.biz.e.d d;
  Handler e = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.obj != null) {}
      for (float f = ((Float)paramAnonymousMessage.obj).floatValue();; f = 0.0F)
      {
        CheckFirmwareActvity.a(CheckFirmwareActvity.this).setCurrentCount(f);
        if (!CheckFirmwareActvity.b(CheckFirmwareActvity.this).T().a()) {
          CheckFirmwareActvity.a(CheckFirmwareActvity.this, CheckFirmwareActvity.this.getString(2131362147), CheckFirmwareActvity.this.getString(2131362145), false, false, false);
        }
        do
        {
          do
          {
            return;
            if (!CheckFirmwareActvity.b(CheckFirmwareActvity.this).U())
            {
              CheckFirmwareActvity.a(CheckFirmwareActvity.this, CheckFirmwareActvity.this.getString(2131362860), CheckFirmwareActvity.this.getString(2131362228), false, false, false);
              return;
            }
            if (f != 390.0F) {
              break;
            }
          } while (CheckFirmwareActvity.c(CheckFirmwareActvity.this));
          if (!com.fimi.kernel.c.c().d("sp_new_hand"))
          {
            CheckFirmwareActvity.this.e.removeCallbacks(CheckFirmwareActvity.this.f);
            paramAnonymousMessage = new Intent(CheckFirmwareActvity.this, NewHandActivity.class);
            CheckFirmwareActvity.this.startActivity(paramAnonymousMessage);
            CheckFirmwareActvity.this.finish();
            CheckFirmwareActvity.this.overridePendingTransition(17432576, 17432577);
            return;
          }
          CheckFirmwareActvity.this.e.postDelayed(CheckFirmwareActvity.this.f, 10L);
          return;
          if (f >= 400.0F)
          {
            CheckFirmwareActvity.this.e.removeCallbacks(CheckFirmwareActvity.this.f);
            if (CheckFirmwareActvity.d(CheckFirmwareActvity.this))
            {
              CheckFirmwareActvity.f(CheckFirmwareActvity.this).a().edit().putBoolean(CheckFirmwareActvity.e(CheckFirmwareActvity.this), true).commit();
              CheckFirmwareActvity.this.dpa.d();
              return;
            }
            paramAnonymousMessage = new Intent(CheckFirmwareActvity.this, FlightActivity.class);
            CheckFirmwareActvity.this.startActivity(paramAnonymousMessage);
            return;
          }
        } while (CheckFirmwareActvity.g(CheckFirmwareActvity.this) <= 0.0F);
        CheckFirmwareActvity.this.e.postDelayed(CheckFirmwareActvity.this.f, 10L);
        return;
      }
    }
  };
  Runnable f = new Runnable()
  {
    public void run()
    {
      CheckFirmwareActvity.h(CheckFirmwareActvity.this);
      Message localMessage = CheckFirmwareActvity.this.e.obtainMessage();
      localMessage.obj = Float.valueOf(CheckFirmwareActvity.g(CheckFirmwareActvity.this));
      localMessage.what = 1;
      CheckFirmwareActvity.this.e.sendMessage(localMessage);
    }
  };
  int g = 0;
  private ProgressView h;
  private boolean i = false;
  private final int j = 400;
  private final int k = 10;
  private final int l = 1;
  private final int m = 2;
  private UpdateConnectDefeaFrgment n;
  private AutoSelfErrorFrgment o;
  private float p = 0.0F;
  private final int q = 1536;
  private TextView r;
  private boolean s = false;
  private com.fimi.soul.module.droneui.a t;
  private com.fimi.soul.biz.e.b u = null;
  private com.fimi.soul.drone.a v;
  private boolean w = false;
  private ProgressBar x;
  private boolean y;
  private v z;
  
  private void a(q paramq)
  {
    int i1 = 5;
    String str2 = getString(2131362673);
    String str1;
    if ((this.v.af()) || (paramq.n()))
    {
      str1 = getString(2131362663);
      i1 = 1;
    }
    for (;;)
    {
      this.i = true;
      if ((this.g < i1) && (this.g != 0))
      {
        getFragmentManager().beginTransaction().remove(this.n).commit();
        a(getString(2131362660), getString(2131362659), false, true);
        this.g = i1;
      }
      if ((this.g != i1) && (paramq.a() >= 0) && ((this.n == null) || (!this.n.isVisible()))) {
        break label489;
      }
      return;
      if (paramq.m())
      {
        str1 = getString(2131362662);
        i1 = 2;
      }
      else if (paramq.ae())
      {
        str1 = getString(2131362222);
        i1 = 3;
      }
      else if (paramq.P())
      {
        str1 = getString(2131362216);
        i1 = 4;
      }
      else if (paramq.f())
      {
        str1 = getString(2131362375);
      }
      else if (paramq.j())
      {
        str1 = getString(2131362378);
      }
      else if (paramq.k())
      {
        str1 = getString(2131362380);
      }
      else if (paramq.l())
      {
        str1 = getString(2131362369);
      }
      else if (((paramq.h()) || (paramq.i())) && (!paramq.I()))
      {
        str1 = getString(2131362371);
        i1 = 6;
      }
      else if (paramq.ai())
      {
        str1 = getString(2131362205);
        i1 = 7;
      }
      else if (paramq.I())
      {
        str1 = getString(2131362207);
        i1 = 8;
        this.s = true;
      }
      else if ((!paramq.J()) || ((!paramq.K()) || ((!paramq.L()) || (paramq.M()))))
      {
        str1 = getString(2131362211);
        i1 = 12;
      }
      else if (this.v.K().g())
      {
        str1 = getString(2131362589);
        i1 = 13;
      }
      else
      {
        if (!paramq.p()) {
          break;
        }
        str2 = getString(2131362227);
        str1 = getString(2131362226);
        i1 = 14;
      }
    }
    if (this.i)
    {
      getFragmentManager().beginTransaction().remove(this.n).commit();
      a(getString(2131362660), getString(2131362659), false, true);
      this.i = false;
      this.g = 0;
      return;
    }
    this.i = false;
    return;
    label489:
    this.g = i1;
    a(str2, str1, true, false, this.s);
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.p = 0.0F;
    this.e.removeCallbacks(this.f);
    if (this.o == null) {
      this.o = new AutoSelfErrorFrgment();
    }
    this.o.a(paramString2);
    this.o.b(paramString1);
    this.o.b(paramBoolean1);
    this.o.a(paramBoolean2);
    getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
    getFragmentManager().beginTransaction().add(2131689710, this.o).commit();
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.p = 0.0F;
    this.e.removeCallbacks(this.f);
    boolean bool = c();
    if (this.n == null) {
      this.n = new UpdateConnectDefeaFrgment();
    }
    if (bool) {
      if (this.n.isAdded())
      {
        getFragmentManager().beginTransaction().remove(this.n).commit();
        this.n = new UpdateConnectDefeaFrgment();
        getFragmentManager().beginTransaction().add(2131689710, this.n).commitAllowingStateLoss();
      }
    }
    for (;;)
    {
      this.n.a(paramString2);
      this.n.b(paramString1);
      this.n.c(getString(2131362509));
      this.n.c(paramBoolean1);
      this.n.a(paramBoolean2);
      this.n.b(paramBoolean3);
      getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
      return;
      getFragmentManager().beginTransaction().replace(2131689710, this.n).commitAllowingStateLoss();
    }
  }
  
  private boolean b()
  {
    new StringBuffer();
    Object localObject = com.fimi.soul.module.update.a.a.a().e();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      com.fimi.kernel.c.c.a().a("sp_need_down_firmwares", (List)localObject);
      this.e.removeCallbacks(this.f);
      startActivity(new Intent(this, FindOnlineFirmwareAvtivity.class));
      finish();
      overridePendingTransition(17432576, 17432577);
      return true;
    }
    this.a = com.fimi.soul.module.update.a.a.a().d();
    if ((this.a != null) && (this.a.size() > 0))
    {
      this.e.removeCallbacks(this.f);
      localObject = new Intent(this, FindNewFirmwareAvtivity.class);
      com.fimi.kernel.c.c.a().a("upgrade_firmwares", this.a);
      startActivity((Intent)localObject);
      finish();
      overridePendingTransition(17432576, 17432577);
      return true;
    }
    return false;
  }
  
  private boolean c()
  {
    try
    {
      this.n = ((UpdateConnectDefeaFrgment)getFragmentManager().findFragmentById(2131689819));
      UpdateConnectDefeaFrgment localUpdateConnectDefeaFrgment = this.n;
      if (localUpdateConnectDefeaFrgment != null) {
        return true;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  private a.a f()
  {
    new a.a()
    {
      public void a() {}
      
      public void b() {}
      
      public void c() {}
      
      public void d()
      {
        Intent localIntent = new Intent(CheckFirmwareActvity.this, LoginActivity.class);
        localIntent.putExtra("login", false);
        CheckFirmwareActvity.this.startActivity(localIntent);
        CheckFirmwareActvity.this.finish();
      }
    };
  }
  
  public void a()
  {
    this.r = ((TextView)findViewById(2131689712));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.r });
    this.h = ((ProgressView)findViewById(2131689713));
    this.h.setMaxCount(400.0F);
    com.fimi.soul.module.update.a.a.a().c();
    this.v = ((DroidPlannerApp)getApplication()).a;
    com.fimi.soul.biz.e.d.a().b(null);
    this.b = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.b.t().b();
    if (this.b.d()) {
      this.b.r().k();
    }
    this.x = ((ProgressBar)findViewById(2131689711));
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(300L);
    this.x.setAnimation(localAlphaAnimation);
    localAlphaAnimation.start();
  }
  
  public void d()
  {
    if ((this.v.U()) && (!b())) {
      if (this.y)
      {
        this.z.a().edit().putBoolean(this.A, false).commit();
        this.dpa.d();
      }
    }
    while (this.v.U())
    {
      return;
      startActivity(new Intent(this, FlightActivity.class));
      return;
    }
    startActivity(new Intent(this, FlightActivity.class));
  }
  
  public void e()
  {
    if (this.s)
    {
      startActivity(new Intent(this, CaliCompassActivity.class));
      finish();
      overridePendingTransition(17432576, 17432577);
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    this.z = v.a(this);
    this.A = "connect_success";
    this.y = com.fimi.kernel.c.c().d("is_setting_enter");
    this.i = false;
    getWindow().setFlags(128, 128);
    setContentView(2130968606);
    a();
    this.c = new g(this, this.v);
    new Thread(new Runnable()
    {
      public void run()
      {
        Looper.prepare();
        int i = 0;
        while (i < 5)
        {
          CheckFirmwareActvity.this.c.a();
          i += 1;
        }
      }
    }).start();
    this.e.postDelayed(this.f, 200L);
    this.v.a(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.e.removeMessages(1);
    this.v.b(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (5.a[parama.ordinal()])
    {
    }
    do
    {
      return;
      parama1.ad();
    } while ((this.p > 200.0F) || (!this.i));
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.p > 0.0F) {
      this.e.postDelayed(this.f, 10L);
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    this.c.c();
    this.e.removeCallbacks(this.f);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/CheckFirmwareActvity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */