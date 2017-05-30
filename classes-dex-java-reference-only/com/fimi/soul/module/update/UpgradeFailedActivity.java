package com.fimi.soul.module.update;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.a.z;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class UpgradeFailedActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private Button c;
  private Button d;
  private ImageView e;
  private Boolean f;
  private Boolean g;
  private v h;
  
  public void a()
  {
    o.a.d = 0;
    o.a.e = 2;
    this.drone.T().a(o.a.a());
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689858: 
      if (this.f.booleanValue())
      {
        v.a(this).a().edit().putBoolean("connect_success", true).commit();
        this.dpa.d();
        return;
      }
      startActivity(new Intent(this, FlightActivity.class));
      return;
    }
    if (!this.drone.T().a())
    {
      finish();
      return;
    }
    startActivity(new Intent(this, UpgradingActivity.class));
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    this.h = v.a(this);
    getWindow().setFlags(128, 128);
    this.f = Boolean.valueOf(this.h.a().getBoolean("is_setting_enter", false));
    setContentView(2130968633);
    this.a = ((TextView)findViewById(2131689860));
    ao.a(getAssets(), new View[] { this.a });
    this.b = ((TextView)findViewById(2131689861));
    ao.a(getAssets(), new View[] { this.b });
    this.d = ((Button)findViewById(2131689858));
    this.d.setOnClickListener(this);
    this.c = ((Button)findViewById(2131689718));
    this.c.setOnClickListener(this);
    this.e = ((ImageView)findViewById(2131689714));
    this.g = Boolean.valueOf(getIntent().getBooleanExtra("connect_success", true));
    if (!this.g.booleanValue()) {
      this.b.setText(getIntent().getStringExtra("reson"));
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/UpgradeFailedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */