package com.fimi.soul.module.setting.newhand;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.button.SwitchButton.a;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.n;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;
import com.fimi.soul.view.f.b;

public class GpsSettingActivity
  extends BaseActivity
  implements View.OnClickListener, SwitchButton.a, d.b
{
  private static final int B = 1;
  private static final int C = 2;
  private static final int D = 3;
  private static final int E = 4;
  private static final int F = 1000;
  private static final float G = 0.3F;
  private static final float H = 1.0F;
  private static final int I = 300;
  private static final int J = 3000;
  public static final String b = "newhand_mode";
  public static final String c = "optical_flow_mode";
  public static final String d = "force_attitude_mode";
  private boolean A = false;
  private boolean K = false;
  private boolean L = false;
  private boolean M = false;
  private Handler N = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        return;
        com.fimi.soul.module.setting.d.a(GpsSettingActivity.a(GpsSettingActivity.this)).a();
        return;
        GpsSettingActivity.b(GpsSettingActivity.this).b();
        return;
        GpsSettingActivity.b(GpsSettingActivity.this).a();
        return;
        if (!GpsSettingActivity.c(GpsSettingActivity.this))
        {
          Toast.makeText(GpsSettingActivity.d(GpsSettingActivity.this), 2131362318, 0).show();
          GpsSettingActivity.e(GpsSettingActivity.this).setText("N/A");
        }
        if (!GpsSettingActivity.f(GpsSettingActivity.this))
        {
          Toast.makeText(GpsSettingActivity.d(GpsSettingActivity.this), 2131362317, 0).show();
          if (GpsSettingActivity.g(GpsSettingActivity.this).getToggleOn())
          {
            GpsSettingActivity.g(GpsSettingActivity.this).a(false, true);
            GpsSettingActivity.h(GpsSettingActivity.this).setText(2131362315);
          }
        }
      } while (GpsSettingActivity.i(GpsSettingActivity.this));
      Toast.makeText(GpsSettingActivity.d(GpsSettingActivity.this), 2131362303, 0).show();
      GpsSettingActivity.j(GpsSettingActivity.this).setText("N/A");
    }
  };
  TextView a;
  private RelativeLayout e;
  private RelativeLayout f;
  private RelativeLayout g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private ImageView n;
  private ImageView o;
  private SwitchButton p;
  private Context q;
  private d r;
  private b s;
  private boolean t;
  private com.fimi.soul.drone.a u;
  private boolean v = false;
  private int w;
  private int x;
  private int y;
  private int z;
  
  private void a()
  {
    this.e = ((RelativeLayout)findViewById(2131689762));
    this.f = ((RelativeLayout)findViewById(2131689766));
    this.g = ((RelativeLayout)findViewById(2131689770));
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h = ((TextView)findViewById(2131689763));
    this.i = ((TextView)findViewById(2131689767));
    this.m = ((TextView)findViewById(2131689768));
    this.j = ((TextView)findViewById(2131689771));
    this.k = ((TextView)findViewById(2131689765));
    this.l = ((TextView)findViewById(2131689773));
    TextView localTextView = (TextView)findViewById(2131690327);
    localTextView.setText(getString(2131362698));
    this.a = ((TextView)findViewById(2131689774));
    ao.a(getAssets(), new View[] { this.h, this.i, this.m, this.j, this.k, this.l, localTextView, this.a });
    this.n = ((ImageView)findViewById(2131689764));
    this.o = ((ImageView)findViewById(2131689772));
    this.p = ((SwitchButton)findViewById(2131689769));
    this.p.setOnSwitchListener(this);
    this.m.setText(2131362315);
    findViewById(2131690535).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        GpsSettingActivity.this.finish();
      }
    });
  }
  
  @TargetApi(16)
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (float f1 = 0.3F;; f1 = 1.0F)
    {
      this.h.setAlpha(f1);
      this.k.setAlpha(f1);
      this.n.setAlpha(f1);
      this.i.setAlpha(f1);
      this.m.setAlpha(f1);
      this.p.setAlpha(f1);
      this.j.setAlpha(f1);
      this.l.setAlpha(f1);
      this.o.setAlpha(f1);
      if (!paramBoolean) {
        break;
      }
      this.e.setBackgroundColor(getResources().getColor(2131624131));
      this.f.setBackgroundColor(getResources().getColor(2131624131));
      this.g.setBackgroundColor(getResources().getColor(2131624131));
      return;
    }
    this.e.setBackground(getResources().getDrawable(2130838257));
    this.f.setBackground(getResources().getDrawable(2130838257));
    this.g.setBackground(getResources().getDrawable(2130838257));
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.y = paramInt;
      com.fimi.kernel.c.e().c(this.y + "");
    }
    if (paramInt <= 6)
    {
      this.k.setText(paramInt + this.q.getString(2131362773) + this.q.getString(2131362701));
      return;
    }
    if ((paramInt > 6) && (paramInt <= 10))
    {
      this.k.setText(paramInt + this.q.getString(2131362773) + this.q.getString(2131362702));
      return;
    }
    this.k.setText(paramInt + this.q.getString(2131362773) + this.q.getString(2131362700));
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    if (paramView.getId() == 2131689769)
    {
      if (!paramBoolean) {
        break label30;
      }
      this.p.a(false, false);
    }
    while (this.v)
    {
      return;
      label30:
      this.p.a(true, false);
    }
    this.r.a(this.z, new e()
    {
      public void a(int paramAnonymousInt)
      {
        GpsSettingActivity.b(GpsSettingActivity.this, paramAnonymousInt);
      }
    });
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
        do
        {
          return;
        } while (this.v);
        this.r.b(this.y, new e()
        {
          public void a(int paramAnonymousInt)
          {
            GpsSettingActivity.a(GpsSettingActivity.this, paramAnonymousInt);
          }
        });
        return;
      } while (this.v);
      this.r.a(this.z, new e()
      {
        public void a(int paramAnonymousInt)
        {
          GpsSettingActivity.b(GpsSettingActivity.this, paramAnonymousInt);
        }
      });
      return;
    } while (this.v);
    if ((!com.fimi.soul.biz.e.d.a().k()) && (this.w < com.fimi.soul.module.setting.d.g))
    {
      z.a(this.q, this.q.getString(2131362582), 0);
      return;
    }
    if (!this.u.U())
    {
      z.a(this.q, 2131362686, z.b);
      return;
    }
    if (this.u.ac())
    {
      z.a(this.q, this.q.getString(2131362522), z.b);
      return;
    }
    new f.b(this.q).c(this.q.getString(2131362642)).b(120).a(30).a(this.q.getString(2131362151)).b(this.q.getString(2131362139)).d(this.q.getResources().getColor(2131624046)).c(Integer.parseInt(com.fimi.kernel.c.e().f())).a(this.q.getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).b(this.q.getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        com.fimi.soul.module.setting.d.a(GpsSettingActivity.a(GpsSettingActivity.this)).a(GpsSettingActivity.k(GpsSettingActivity.this));
      }
    }).a(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GpsSettingActivity.c(GpsSettingActivity.this, paramAnonymousInt + 30);
      }
      
      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {}
      
      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {}
    }).a().show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968616);
    getWindow().setFlags(128, 128);
    a();
    this.q = this;
    this.u = ((DroidPlannerApp)getApplication()).a;
    if (getIntent().getBooleanExtra("newhand_mode", true))
    {
      a(6, true);
      this.l.setText(30 + getString(2131362151));
    }
    if (this.u.U())
    {
      this.a.setVisibility(4);
      if ((getIntent().getBooleanExtra("newhand_mode", true)) || (getIntent().getBooleanExtra("force_attitude_mode", false)))
      {
        a(true);
        this.v = true;
      }
      return;
    }
    this.a.setVisibility(0);
    a(true);
    this.v = true;
    this.A = true;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (9.a[parama.ordinal()])
    {
    default: 
    case 1: 
    case 2: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  if (parama1.al().d() != 51) {
                    break;
                  }
                } while (parama1.al().f() != 4);
                if (parama1.al().i() != 0) {
                  break;
                }
                z.a(this.q, 2131362685);
                if (parama1.al().g() == 7)
                {
                  this.N.sendEmptyMessageDelayed(2, 1000L);
                  if (parama1.al().h() == 5000.0F)
                  {
                    this.p.a(true, true);
                    this.m.setText(2131362316);
                    this.z = 5000;
                    return;
                  }
                  this.p.a(false, true);
                  this.m.setText(2131362315);
                  this.z = 500;
                  return;
                }
              } while (parama1.al().g() != 3);
              this.N.sendEmptyMessageDelayed(3, 1000L);
              a((int)parama1.al().h(), false);
              return;
              z.a(this.q, 2131362684);
              return;
            } while ((parama1.al().d() != 34) || (parama1.al().f() != 4));
            if (parama1.al().g() == 7)
            {
              this.M = true;
              i1 = (int)parama1.al().h();
              if (i1 != 0) {
                com.fimi.kernel.c.e().a(i1 + "");
              }
              if (i1 == 5000)
              {
                this.p.a(true, true);
                this.m.setText(2131362316);
                this.z = 5000;
                return;
              }
              this.p.a(false, true);
              this.m.setText(2131362315);
              this.z = 500;
              return;
            }
          } while (parama1.al().g() != 3);
          this.L = true;
          i1 = (int)parama1.al().h();
          if (i1 != 0)
          {
            a(i1, false);
            return;
          }
          a(10, false);
          return;
          if (parama1.p().b() == com.fimi.soul.module.setting.d.d)
          {
            if (parama1.p().d() == com.fimi.soul.module.setting.d.f)
            {
              z.a(this.q, 2131362685);
              i1 = (int)parama1.p().c();
              com.fimi.kernel.c.e().b(i1 + "");
              this.x = i1;
              this.l.setText(this.x + this.q.getString(2131362151));
            }
            for (;;)
            {
              this.N.sendEmptyMessageDelayed(1, 1000L);
              return;
              z.a(this.q, 2131362684);
            }
          }
        } while (parama1.p().b() != com.fimi.soul.module.setting.d.e);
        this.K = true;
      } while (parama1.p().d() != com.fimi.soul.module.setting.d.f);
      int i1 = (int)parama1.p().c();
      com.fimi.kernel.c.e().b(i1 + "");
      this.x = i1;
      this.l.setText(this.x + this.q.getString(2131362151));
      return;
    }
    if (parama1.U())
    {
      if ((getIntent().getBooleanExtra("newhand_mode", true)) || (getIntent().getBooleanExtra("force_attitude_mode", false))) {
        a(true);
      }
      for (this.v = true;; this.v = false)
      {
        this.a.setVisibility(4);
        if (!this.A) {
          break;
        }
        this.A = false;
        this.r.b();
        this.r.a();
        this.N.sendEmptyMessageDelayed(2, 300L);
        this.N.sendEmptyMessageDelayed(3, 300L);
        this.N.sendEmptyMessageDelayed(2, 600L);
        this.N.sendEmptyMessageDelayed(3, 600L);
        if ((!this.t) && (this.w < com.fimi.soul.module.setting.d.g)) {
          break;
        }
        com.fimi.soul.module.setting.d.a(parama1).a();
        return;
        a(false);
      }
    }
    this.l.setText("N/A");
    this.k.setText("N/A");
    this.p.a(false, false);
    this.m.setText(2131362315);
    this.a.setVisibility(0);
    a(true);
    this.v = true;
    this.A = true;
  }
  
  public void onStart()
  {
    super.onStart();
    this.u.a(this);
    this.s = ((b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class));
    this.t = com.fimi.soul.biz.e.d.a().k();
    if (this.r == null) {
      this.r = new c(this.u, this.q);
    }
    if (this.s != null) {
      this.w = this.s.a();
    }
    this.r.b();
    this.r.a();
    this.N.sendEmptyMessageDelayed(2, 300L);
    this.N.sendEmptyMessageDelayed(3, 300L);
    this.N.sendEmptyMessageDelayed(2, 600L);
    this.N.sendEmptyMessageDelayed(3, 600L);
    this.N.sendEmptyMessageDelayed(2, 900L);
    this.N.sendEmptyMessageDelayed(3, 900L);
    this.N.sendEmptyMessageDelayed(2, 1200L);
    this.N.sendEmptyMessageDelayed(3, 1200L);
    if ((com.fimi.soul.biz.e.d.a().k()) || (this.w >= com.fimi.soul.module.setting.d.g))
    {
      com.fimi.soul.module.setting.d.a(this.u).a();
      this.N.sendEmptyMessageDelayed(1, 300L);
      this.N.sendEmptyMessageDelayed(1, 600L);
      this.N.sendEmptyMessageDelayed(1, 900L);
      this.N.sendEmptyMessageDelayed(1, 1200L);
      this.K = false;
      this.y = Integer.parseInt(com.fimi.kernel.c.e().g());
      a(this.y, true);
      this.l.setText(com.fimi.kernel.c.e().f() + this.q.getString(2131362151));
      this.z = Integer.parseInt(com.fimi.kernel.c.e().e());
      if (this.z != 5000) {
        break label413;
      }
      this.p.a(true, false);
      this.m.setText(2131362316);
    }
    for (;;)
    {
      if (!this.u.U()) {
        break label434;
      }
      this.N.sendEmptyMessageDelayed(4, 3000L);
      return;
      this.K = true;
      break;
      label413:
      this.p.a(false, false);
      this.m.setText(2131362315);
    }
    label434:
    this.l.setText("N/A");
    this.k.setText("N/A");
    this.p.a(false, false);
    this.m.setText(2131362315);
  }
  
  public void onStop()
  {
    super.onStop();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/GpsSettingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */