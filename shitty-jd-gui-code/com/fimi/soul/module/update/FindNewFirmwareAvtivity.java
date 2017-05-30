package com.fimi.soul.module.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.g.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.TranslationView;
import com.fimi.soul.view.f.a;
import java.io.File;
import java.util.List;

public class FindNewFirmwareAvtivity
  extends BaseActivity
  implements View.OnClickListener, com.fimi.soul.biz.camera.b.e<X11RespCmd>
{
  public static final String a = "upgrade_firmwares";
  boolean b = false;
  List<FirmwareInfo> c = null;
  TranslationView d;
  TextView e;
  TextView f;
  private Button g;
  private Button h;
  private Button i;
  private Context j;
  private int k;
  private Boolean l;
  private com.fimi.soul.biz.camera.d m = null;
  private boolean n;
  private v o;
  private String p = "is_setting_enter";
  private ListView q;
  private TextView r;
  private com.fimi.soul.b.d s;
  private boolean t;
  private boolean u;
  private a v = a.a;
  
  private void a(a parama)
  {
    if (this.v == parama)
    {
      this.r.setText(2131362094);
      this.v = a.a;
      i();
    }
  }
  
  private void a(a parama, int paramInt)
  {
    if (this.v == parama) {
      return;
    }
    this.v = parama;
    this.r.setText(paramInt);
    j();
  }
  
  private void f()
  {
    if ((this.c != null) && (this.c.size() > 0))
    {
      int i2 = 0;
      int i1 = 0;
      for (;;)
      {
        i3 = i1;
        if (i2 >= this.c.size()) {
          break;
        }
        localObject = (FirmwareInfo)this.c.get(i2);
        if ((((FirmwareInfo)localObject).getSysId() == 4) || (((FirmwareInfo)localObject).getSysId() == 13)) {
          this.b = true;
        }
        i1 += ((FirmwareInfo)localObject).getUpdateTime();
        i2 += 1;
      }
    }
    int i3 = 0;
    this.n = com.fimi.soul.biz.e.d.a().k();
    this.m = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.m.a(this);
    if ((!this.m.d()) && (this.drone.W())) {
      this.m.t().b();
    }
    if ((this.b) && (this.m.d())) {
      this.m.r().c(com.fimi.soul.biz.camera.e.cy);
    }
    Object localObject = getString(2131362156);
    String str = getString(2131362869);
    l.a(i3);
    localObject = String.format((String)localObject, new Object[] { l.c() }) + " | " + String.format(str, new Object[] { l.a(i3) });
    this.f.setText((CharSequence)localObject);
  }
  
  private void g()
  {
    if (this.v == a.j)
    {
      e();
      return;
    }
    startActivity(new Intent(this.j, UpgradingActivity.class));
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  private void h()
  {
    a(a.d);
    a(a.i);
    a(a.b);
    a(a.c);
    a(a.j);
    a(a.l);
    if (this.m.i().getFreeKBSpace() == 0L)
    {
      this.m.r().c(com.fimi.soul.biz.camera.e.cy);
      return;
    }
    if (!b())
    {
      a(a.e, 2131362043);
      return;
    }
    a(a.e);
  }
  
  private void i()
  {
    this.h.setTextColor(-419430401);
    this.i.setTextColor(-419430401);
    this.h.setClickable(true);
    this.i.setClickable(true);
  }
  
  private void j()
  {
    this.h.setTextColor(872415231);
    this.i.setTextColor(872415231);
    this.h.setClickable(false);
    this.i.setClickable(false);
  }
  
  public void a()
  {
    if (!this.drone.U())
    {
      a(a.g, 2131362093);
      return;
    }
    if (this.drone.K().g())
    {
      a(a.h, 2131362871);
      return;
    }
    if ((this.c != null) && (this.c.size() > 0) && (this.drone.ac()))
    {
      a(a.f, 2131362469);
      return;
    }
    if (this.u)
    {
      this.r.setText(getString(2131362095));
      return;
    }
    this.r.setText(getString(2131362094));
  }
  
  public void a(d.a parama)
  {
    switch (3.b[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        return;
      } while (this.drone.c.a() != 50);
      parama = (com.fimi.soul.drone.h.g)this.drone.c;
      if (parama.f() != g.a.f) {
        this.m.b(true);
      }
      for (;;)
      {
        switch (3.a[parama.f().ordinal()])
        {
        default: 
          h();
          return;
          this.m.b(false);
        }
      }
      a(a.d, 2131362249);
      return;
      a(a.i, 2131362835);
      return;
      a(a.l, 2131362873);
      return;
      if (!this.n)
      {
        h();
        return;
      }
      a(a.b, 2131362836);
      return;
      a(a.c, 2131362834);
      return;
    } while (this.v == a.j);
    this.v = a.j;
    this.r.setText(2131362581);
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if (isFinishing()) {
      return;
    }
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
      return;
    }
    if (paramBoolean)
    {
      a(a.j);
      com.fimi.kernel.utils.g.b(new File(j.n()));
      z.a(this, getString(2131362291), z.c);
      this.m.r().c(com.fimi.soul.biz.camera.e.cy);
      this.m.a(true);
    }
    for (;;)
    {
      com.fimi.kernel.c.b().c();
      return;
      z.a(this, getString(2131362289), z.c);
    }
  }
  
  public boolean b()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.b)
    {
      bool1 = bool2;
      if (this.m.i().getFreeKBSpace() > 81920L) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void c()
  {
    this.g = ((Button)findViewById(2131689743));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.g });
    this.g.setOnClickListener(this);
    this.h = ((Button)findViewById(2131689744));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.h });
    this.h.setOnClickListener(this);
    this.i = ((Button)findViewById(2131689745));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.i });
    this.i.setOnClickListener(this);
    this.d = ((TranslationView)findViewById(2131689736));
    this.d.setVisibility(0);
    this.d.a();
    this.e = ((TextView)findViewById(2131689737));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.e });
    this.f = ((TextView)findViewById(2131689738));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.f });
    this.r = ((TextView)findViewById(2131689741));
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.r });
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.t)
    {
      this.g.setVisibility(8);
      this.h.setVisibility(8);
      this.i.setVisibility(0);
      localStringBuilder.append(getString(2131362868));
    }
    for (;;)
    {
      this.e.setText(localStringBuilder.toString());
      this.q = ((ListView)findViewById(2131689740));
      return;
      this.g.setVisibility(0);
      this.h.setVisibility(0);
      this.i.setVisibility(8);
      localStringBuilder.append(getString(2131362607));
    }
  }
  
  public void d()
  {
    if ((this.c != null) && (this.c.size() > 0))
    {
      this.s = new com.fimi.soul.b.d(this, this.c);
      this.q.setAdapter(this.s);
    }
  }
  
  public void e()
  {
    new f.a(this).a(getString(2131362067)).a(false).a(getResources().getColor(2131624046)).b(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        com.fimi.kernel.c.b().a();
        FindNewFirmwareAvtivity.a(FindNewFirmwareAvtivity.this).r().c();
      }
    }).a(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689743: 
      if (!com.fimi.kernel.c.c().d("sp_new_hand"))
      {
        startActivity(new Intent(this, NewHandActivity.class));
        finish();
        overridePendingTransition(17432576, 17432577);
        return;
      }
      if (this.k == 1)
      {
        finish();
        return;
      }
      if (this.l.booleanValue())
      {
        this.o.a().edit().putBoolean("connect_success", true).commit();
        this.dpa.d();
        return;
      }
      startActivity(new Intent(this, FlightActivity.class));
      return;
    case 2131689744: 
      g();
      return;
    }
    g();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    this.o = v.a(this);
    this.p = "is_setting_enter";
    this.l = Boolean.valueOf(this.o.a().getBoolean(this.p, false));
    getWindow().setFlags(128, 128);
    setContentView(2130968611);
    com.fimi.soul.utils.ao.a(getAssets(), new View[] { this.h });
    this.j = this;
    this.k = getIntent().getIntExtra("check_firmware_model", 0);
    this.c = com.fimi.soul.module.update.a.a.a().d();
    int i1 = 0;
    for (;;)
    {
      if (i1 < this.c.size())
      {
        if ("2".equals(((FirmwareInfo)this.c.get(i1)).getForceSign())) {
          this.t = true;
        }
        if (((FirmwareInfo)this.c.get(i1)).isVersionError())
        {
          this.t = true;
          this.u = true;
        }
      }
      else
      {
        c();
        f();
        d();
        a();
        return;
      }
      i1 += 1;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    super.onDroneEvent(parama, parama1);
    if (parama1.U())
    {
      a(a.g);
      if ((parama1.ad().ak()) || (com.fimi.soul.biz.e.d.a().h()) || (com.fimi.soul.biz.e.c.a().d())) {
        a(a.l, 2131362873);
      }
      do
      {
        return;
        a(a.l);
        if (parama1.ad().aj())
        {
          a(a.m, 2131362866);
          return;
        }
        a(a.m);
        if (parama1.K().g())
        {
          a(a.h, 2131362871);
          return;
        }
        a(a.h);
        if ((parama1.ad().O()) || (parama1.ad().P()))
        {
          a(a.k, 2131362870);
          return;
        }
        a(a.k);
        if (parama1.ac())
        {
          a(a.f, 2131362469);
          return;
        }
        a(a.f);
      } while (!this.b);
      a(parama);
      return;
    }
    a(a.g, 2131362093);
  }
  
  protected void onStart()
  {
    super.onStart();
    if (this.b) {
      this.m.u().i();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/FindNewFirmwareAvtivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */