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
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class DownFailedActivity
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
  private String i = "is_setting_enter";
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689717: 
      if (this.f.booleanValue())
      {
        this.h.a().edit().putBoolean("connect_success", true).commit();
        this.dpa.d();
        return;
      }
      startActivity(new Intent(this, FlightActivity.class));
      return;
    }
    if (!ao.b(this))
    {
      z.a(this, 2131362508);
      return;
    }
    startActivity(new Intent(this, DowningActivity.class));
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa.b(this);
    this.h = v.a(this);
    this.i = "is_setting_enter";
    getWindow().setFlags(128, 128);
    this.f = Boolean.valueOf(this.h.a().getBoolean(this.i, false));
    setContentView(2130968607);
    this.a = ((TextView)findViewById(2131689715));
    this.b = ((TextView)findViewById(2131689716));
    ao.a(getAssets(), new View[] { this.a, this.b });
    this.d = ((Button)findViewById(2131689717));
    this.d.setOnClickListener(this);
    this.c = ((Button)findViewById(2131689718));
    this.c.setOnClickListener(this);
    this.e = ((ImageView)findViewById(2131689714));
    this.g = Boolean.valueOf(getIntent().getBooleanExtra("connect_success", true));
    paramBundle = getIntent().getStringExtra("DownLoadFailedInfo");
    this.b.setText(paramBundle);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/DownFailedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */