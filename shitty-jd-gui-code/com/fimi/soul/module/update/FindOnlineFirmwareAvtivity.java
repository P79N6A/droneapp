package com.fimi.soul.module.update;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.b.h;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.TranslationView;
import java.util.List;

public class FindOnlineFirmwareAvtivity
  extends BaseActivity
  implements View.OnClickListener
{
  TranslationView a;
  TextView b;
  TextView c;
  List<UpdateVersonBean> d = null;
  private Button e;
  private Button f;
  private Button g;
  private Boolean h;
  private ListView i;
  private TextView j;
  private h k;
  private boolean l;
  private String m = "is_setting_enter";
  private Handler n = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      FindOnlineFirmwareAvtivity.b(FindOnlineFirmwareAvtivity.this).setTextColor(-419430401);
      FindOnlineFirmwareAvtivity.c(FindOnlineFirmwareAvtivity.this).setTextColor(-419430401);
      FindOnlineFirmwareAvtivity.b(FindOnlineFirmwareAvtivity.this).setClickable(true);
      FindOnlineFirmwareAvtivity.c(FindOnlineFirmwareAvtivity.this).setClickable(true);
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      case 0: 
        FindOnlineFirmwareAvtivity.this.b();
        return;
      }
      z.a(FindOnlineFirmwareAvtivity.this, 2131362473);
    }
  };
  
  public void a()
  {
    if (!ao.b(this))
    {
      z.a(this, 2131362473);
      return;
    }
    if (com.fimi.soul.biz.a.a.a().c())
    {
      this.f.setTextColor(872415231);
      this.g.setTextColor(872415231);
      this.f.setClickable(false);
      this.g.setClickable(false);
      c();
      return;
    }
    b();
  }
  
  public void b()
  {
    startActivity(new Intent(this, DowningActivity.class));
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  public void c()
  {
    new Thread()
    {
      public void run()
      {
        if (ao.d("192.168.100.1"))
        {
          FindOnlineFirmwareAvtivity.a(FindOnlineFirmwareAvtivity.this).sendEmptyMessage(1);
          return;
        }
        FindOnlineFirmwareAvtivity.a(FindOnlineFirmwareAvtivity.this).sendEmptyMessage(0);
      }
    }.start();
  }
  
  public void d()
  {
    this.e = ((Button)findViewById(2131689842));
    ao.a(getAssets(), new View[] { this.e });
    this.e.setOnClickListener(this);
    this.f = ((Button)findViewById(2131689843));
    ao.a(getAssets(), new View[] { this.f });
    this.f.setOnClickListener(this);
    this.g = ((Button)findViewById(2131689844));
    ao.a(getAssets(), new View[] { this.g });
    this.g.setOnClickListener(this);
    this.a = ((TranslationView)findViewById(2131689736));
    this.a.setVisibility(0);
    this.a.a();
    this.b = ((TextView)findViewById(2131689737));
    ao.a(getAssets(), new View[] { this.b });
    this.c = ((TextView)findViewById(2131689738));
    ao.a(getAssets(), new View[] { this.c });
    this.j = ((TextView)findViewById(2131689741));
    ao.a(getAssets(), new View[] { this.j });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getString(2131362867));
    String str = getString(2131362156);
    if (this.l)
    {
      this.e.setVisibility(8);
      this.f.setVisibility(8);
      this.g.setVisibility(0);
      localStringBuilder.append(getString(2131362868));
    }
    for (;;)
    {
      this.b.setText(localStringBuilder.toString());
      this.c.setText(String.format(str, new Object[] { l.b() }));
      this.i = ((ListView)findViewById(2131689740));
      return;
      this.e.setVisibility(0);
      this.f.setVisibility(0);
      this.g.setVisibility(8);
    }
  }
  
  public void e()
  {
    this.k = new h(this, this.d);
    this.i.setAdapter(this.k);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689842: 
      if (!c.c().d("sp_new_hand"))
      {
        startActivity(new Intent(this, NewHandActivity.class));
        finish();
        overridePendingTransition(17432576, 17432577);
        return;
      }
      if (this.h.booleanValue())
      {
        this.preferencesUtil.a().edit().putBoolean("connect_success", true).commit();
        this.dpa.d();
        return;
      }
      startActivity(new Intent(this, FlightActivity.class));
      return;
    case 2131689843: 
      a();
      return;
    }
    a();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    setContentView(2130968626);
    getWindow().setFlags(128, 128);
    com.fimi.soul.biz.update.c.c = true;
    com.fimi.soul.biz.update.c.b = true;
    this.preferencesUtil = v.a(this);
    this.m = "is_setting_enter";
    this.h = Boolean.valueOf(this.preferencesUtil.a().getBoolean(this.m, false));
    this.d = c.c().b("sp_need_down_firmwares", UpdateVersonBean.class);
    int i1 = 0;
    for (;;)
    {
      if (i1 < this.d.size())
      {
        if ("2".equals(((UpdateVersonBean)this.d.get(i1)).getForceSign())) {
          this.l = true;
        }
      }
      else
      {
        d();
        e();
        return;
      }
      i1 += 1;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/FindOnlineFirmwareAvtivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */