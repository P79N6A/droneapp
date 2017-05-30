package com.fimi.soul.module.droneui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.g.f;
import com.fimi.soul.drone.h.aa;
import com.fimi.soul.drone.h.ab;
import com.fimi.soul.drone.h.k;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class IMUActivity
  extends BaseActivity
  implements View.OnClickListener, d.b
{
  private static int E = 2;
  private static int F = 3;
  private static int G = 1;
  static f a;
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private d H;
  private f I;
  private boolean J = false;
  private int K = 0;
  private Handler L = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == IMUActivity.e()) {
        if (IMUActivity.a(IMUActivity.this) != null) {
          IMUActivity.a(IMUActivity.this).a((byte)4);
        }
      }
      do
      {
        return;
        if (paramAnonymousMessage.what == IMUActivity.f())
        {
          IMUActivity.this.a();
          return;
        }
      } while (paramAnonymousMessage.what != IMUActivity.g());
      IMUActivity.a(IMUActivity.this).a((byte)7);
    }
  };
  private Button b;
  private Button c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private void h()
  {
    this.b = ((Button)findViewById(2131689874));
    this.b.setOnClickListener(this);
    this.d = ((TextView)findViewById(2131689681));
    this.e = ((TextView)findViewById(2131689788));
    this.f = ((TextView)findViewById(2131689789));
    this.g = ((TextView)findViewById(2131689790));
    this.h = ((TextView)findViewById(2131689791));
    this.i = ((TextView)findViewById(2131689793));
    this.j = ((TextView)findViewById(2131689794));
    this.k = ((TextView)findViewById(2131689795));
    this.l = ((TextView)findViewById(2131689796));
    this.m = ((TextView)findViewById(2131689798));
    this.n = ((TextView)findViewById(2131689799));
    this.o = ((TextView)findViewById(2131689800));
    this.p = ((TextView)findViewById(2131689801));
    this.q = ((TextView)findViewById(2131689803));
    this.r = ((TextView)findViewById(2131689804));
    this.s = ((TextView)findViewById(2131689805));
    this.t = ((TextView)findViewById(2131689806));
    this.u = ((TextView)findViewById(2131689809));
    this.c = ((Button)findViewById(2131689808));
    this.c.setOnClickListener(this);
    this.v = ((TextView)findViewById(2131689807));
    this.w = ((TextView)findViewById(2131689783));
    this.x = ((TextView)findViewById(2131689784));
    this.y = ((TextView)findViewById(2131689785));
    this.w = ((TextView)findViewById(2131689786));
    this.A = ((TextView)findViewById(2131689787));
    this.B = ((TextView)findViewById(2131689792));
    this.C = ((TextView)findViewById(2131689797));
    this.D = ((TextView)findViewById(2131689802));
    if (!this.drone.U())
    {
      a(this.u, getResources().getColor(2131624292), getResources().getString(2131362097));
      return;
    }
    if (this.drone.ac())
    {
      a(this.u, getResources().getColor(2131624292), getResources().getString(2131362792));
      a(this.c, getResources().getColor(2131624293), false);
      return;
    }
    a(this.u, getResources().getColor(2131624292), getResources().getString(2131362327));
  }
  
  private void i()
  {
    this.H = d.a(this.drone);
    this.H.a((byte)4);
    this.H.a((byte)5);
    a();
  }
  
  public void a()
  {
    if ((!this.drone.U()) || (this.drone.ac()))
    {
      if (this.drone.ac()) {
        a(this.u, getResources().getColor(2131624292), getResources().getString(2131362792));
      }
      for (;;)
      {
        a(this.c, getResources().getColor(2131624293), false);
        this.e.setText(getResources().getString(2131362517));
        this.f.setText(getResources().getString(2131362517));
        this.g.setText(getResources().getString(2131362517));
        this.h.setText(getResources().getString(2131362517));
        this.i.setText(getResources().getString(2131362517));
        this.j.setText(getResources().getString(2131362517));
        this.k.setText(getResources().getString(2131362517));
        this.l.setText(getResources().getString(2131362517));
        this.m.setText(getResources().getString(2131362517));
        this.n.setText(getResources().getString(2131362517));
        this.o.setText(getResources().getString(2131362517));
        this.p.setText(getResources().getString(2131362517));
        this.q.setText(getResources().getString(2131362517));
        this.r.setText(getResources().getString(2131362517));
        this.s.setText(getResources().getString(2131362517));
        this.t.setText(getResources().getString(2131362517));
        return;
        if (this.K != 1)
        {
          a(this.u, getResources().getColor(2131624292), getResources().getString(2131362097));
          this.J = true;
        }
      }
    }
    if ((this.J) && (this.K != 1))
    {
      a(this.u, getResources().getColor(2131624292), getResources().getString(2131362327));
      this.J = false;
    }
    for (;;)
    {
      this.e.setText(this.drone.x().a() + "");
      this.f.setText(this.drone.x().b() + "");
      this.g.setText(this.drone.x().c() + "");
      this.h.setText(this.drone.x().d() + "");
      this.i.setText(this.drone.x().e() + "");
      this.j.setText(this.drone.x().f() + "");
      this.k.setText(this.drone.x().g() + "");
      this.l.setText(this.drone.x().h() + "");
      this.m.setText(this.drone.z().a() + "");
      this.n.setText(this.drone.z().b() + "");
      this.o.setText(this.drone.z().c() + "");
      this.p.setText(this.drone.z().d() + "");
      this.q.setText(this.drone.z().e() + "");
      this.r.setText(this.drone.z().f() + "");
      this.s.setText(this.drone.z().g() + "");
      this.t.setText(this.drone.z().h() + "");
      return;
      if (!this.u.getText().toString().equals(getResources().getString(2131362134))) {
        a(this.c, getResources().getColor(2131624292), true);
      }
    }
  }
  
  public void a(Button paramButton, int paramInt, boolean paramBoolean)
  {
    paramButton.setEnabled(paramBoolean);
    paramButton.setTextColor(paramInt);
  }
  
  public void a(TextView paramTextView, int paramInt, String paramString)
  {
    paramTextView.setTextColor(paramInt);
    paramTextView.setText(paramString);
  }
  
  public void b()
  {
    if (1 == this.drone.y().b())
    {
      d.a(this.drone).c(153);
      this.I.f();
      if (this.drone.y().a() == 0)
      {
        this.K = 1;
        a(this.c, getResources().getColor(2131624292), true);
        a(this.u, getResources().getColor(2131623955), getResources().getString(2131362345));
      }
    }
    else
    {
      return;
    }
    this.K = 1;
    a(this.c, getResources().getColor(2131624292), true);
    a(this.u, getResources().getColor(2131623958), getResources().getString(2131362342));
  }
  
  public void c()
  {
    if (a != null)
    {
      a.c();
      return;
    }
    a = new f(5000, new Runnable()
    {
      public void run()
      {
        IMUActivity.e(IMUActivity.this).sendEmptyMessage(IMUActivity.e());
      }
    });
    a.d();
  }
  
  public void d()
  {
    if (this.I != null)
    {
      this.I.c();
      return;
    }
    this.I = new f(1000, new Runnable()
    {
      public void run()
      {
        IMUActivity.e(IMUActivity.this).sendEmptyMessage(IMUActivity.g());
      }
    });
    this.I.d();
  }
  
  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    if (i1 == 2131689874) {
      finish();
    }
    while (i1 != 2131689808) {
      return;
    }
    a(this.c, getResources().getColor(2131624293), false);
    a(this.u, getResources().getColor(2131624293), getResources().getString(2131362134));
    this.K = 0;
    d();
    this.L.postDelayed(new Runnable()
    {
      public void run()
      {
        if (IMUActivity.b(IMUActivity.this) != 1)
        {
          IMUActivity.a(IMUActivity.this, 0);
          IMUActivity.this.a(IMUActivity.c(IMUActivity.this), IMUActivity.this.getResources().getColor(2131624292), IMUActivity.this.getResources().getString(2131362341));
          IMUActivity.d(IMUActivity.this).f();
        }
      }
    }, 10000L);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(128, 128);
    setContentView(2130968619);
    h();
    ao.a(getAssets(), new View[] { this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D });
    this.drone.a(this);
    i();
    c();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.drone.b(this);
    a.f();
    if (this.I != null) {
      this.I.f();
    }
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    switch (5.a[parama.ordinal()])
    {
    }
    for (;;)
    {
      this.L.sendEmptyMessage(F);
      return;
      this.L.sendEmptyMessage(F);
      continue;
      b();
      continue;
      this.L.sendEmptyMessage(F);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/IMUActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */