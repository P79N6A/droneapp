package com.fimi.soul.module.remote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;

public class RemoteModelActivity
  extends BaseActivity
  implements View.OnClickListener, d.b
{
  public static final String a = "remodel";
  private PercentRelativeLayout b;
  private Button c;
  private Button d;
  private Button e;
  private TextView f;
  private TextView g;
  private TextView h;
  private ImageView i;
  private ImageView j;
  private d k;
  private boolean l;
  private v m;
  
  private void a()
  {
    this.l = false;
    this.i.setImageResource(2130838528);
    this.j.setImageResource(2130838527);
    a(this.e, 75);
    a(this.d, 255);
    this.e.setBackgroundResource(2130837730);
    this.d.setBackgroundResource(2130837735);
  }
  
  private void b()
  {
    this.l = true;
    this.i.setImageResource(2130838530);
    this.j.setImageResource(2130838529);
    a(this.e, 255);
    a(this.d, 75);
    this.e.setBackgroundResource(2130837731);
    this.d.setBackgroundResource(2130837734);
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
        finish();
        return;
      } while (this.l);
      if (!this.drone.T().a())
      {
        z.a(this, getString(2131362809), z.b);
        return;
      }
      if (this.drone.U())
      {
        z.a(this, getString(2131362074), z.b);
        return;
      }
      new com.fimi.soul.view.f.a(this).a(getString(2131362072)).c(17).a(getResources().getColor(2131624046)).b(getString(2131362175), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          RemoteModelActivity.a(RemoteModelActivity.this).h();
        }
      }).a(getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).a().show();
      return;
    } while (!this.l);
    if (!this.drone.T().a())
    {
      z.a(this, getString(2131362809), z.b);
      return;
    }
    if (this.drone.U())
    {
      z.a(this, getString(2131362074), z.b);
      return;
    }
    new com.fimi.soul.view.f.a(this).a(getString(2131362072)).c(17).a(getResources().getColor(2131624046)).b(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        RemoteModelActivity.a(RemoteModelActivity.this).i();
      }
    }).a(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a().show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968672);
    getWindow().setFlags(128, 128);
    this.b = ((PercentRelativeLayout)findViewById(2131689748));
    this.c = ((Button)this.b.findViewById(2131690535));
    this.c.setOnClickListener(this);
    this.e = ((Button)findViewById(2131690134));
    this.e.setOnClickListener(this);
    this.d = ((Button)findViewById(2131690135));
    this.d.setOnClickListener(this);
    this.i = ((ImageView)findViewById(2131690133));
    this.j = ((ImageView)findViewById(2131690132));
    this.f = ((TextView)findViewById(2131690327));
    this.g = ((TextView)findViewById(2131690130));
    this.h = ((TextView)findViewById(2131690131));
    this.f.setText(2131362810);
    ao.a(getAssets(), new View[] { this.f, this.g, this.h, this.e, this.d });
    this.m = v.a(this);
    if (this.m.a().getInt("remodel", 0) == 0) {
      b();
    }
    for (;;)
    {
      this.k = d.a(this.drone);
      return;
      a();
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    super.onDroneEvent(parama, parama1);
    switch (5.a[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        return;
        com.fimi.soul.module.calibcompass.a.a().a("98");
      } while (parama1.L().c() != 2);
      if (parama1.L().d() == 2)
      {
        this.m.a().edit().putInt("remodel", 1).commit();
        a();
        return;
      }
    } while (parama1.L().d() != 1);
    this.m.a().edit().putInt("remodel", 0).commit();
    b();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.drone.a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.drone.b(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteModelActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */