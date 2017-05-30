package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.MyEditView.b;
import com.fimi.soul.view.SwitchButtonStoke;
import com.fimi.soul.view.SwitchButtonStoke.a;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.fimi.soul.view.myhorizontalseebar.SeekBar.a;
import com.google.android.gms.maps.model.LatLng;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class k
  implements View.OnClickListener, SwitchButtonStoke.a
{
  private int A = 8;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F = 20;
  private int G = 1;
  private double H;
  private double I;
  private double J;
  private double K;
  private double L;
  private com.fimi.soul.biz.camera.d M;
  private int N = 300;
  private boolean O;
  private boolean P = false;
  private int Q = 0;
  private String R;
  private String S = "s";
  private String T = "m/s";
  private Button a;
  private Button b;
  private Button c;
  private MyEditView d;
  private MyEditView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private SeekBar n;
  private SeekBar o;
  private SwitchButtonStoke p;
  private com.fimi.soul.drone.a q;
  private PercentRelativeLayout r;
  private ImageView s;
  private int t = 1;
  private int u = 30;
  private int v = 10;
  private int w = 10;
  private int x = 120;
  private int y = 500;
  private int z = 4;
  
  public k(View paramView, com.fimi.soul.drone.a parama)
  {
    this.q = parama;
    a(paramView);
    this.M = ((com.fimi.soul.biz.camera.d)b.a().d());
  }
  
  private int a(double paramDouble)
  {
    this.H = paramDouble;
    double d1 = (int)(this.z / Math.sin(Math.toRadians(paramDouble)));
    double d2 = (int)(this.A / Math.cos(Math.toRadians(paramDouble)));
    if ((Math.cos(Math.toRadians(paramDouble)) * d1 <= this.A) && (Math.sin(Math.toRadians(paramDouble)) * d2 > this.z)) {
      this.B = ((int)d1);
    }
    if ((Math.cos(Math.toRadians(paramDouble)) * d1 > this.A) && (Math.sin(Math.toRadians(paramDouble)) * d2 <= this.z)) {
      this.B = ((int)d2);
    }
    if ((Math.sin(Math.toRadians(paramDouble)) * d2 <= this.z) && (Math.cos(Math.toRadians(paramDouble)) * d1 <= this.A)) {
      if (d1 < d2) {
        break label276;
      }
    }
    label276:
    for (this.B = ((int)d1);; this.B = ((int)d2))
    {
      this.o.setMax(this.B);
      this.m.setText(String.format(this.q.d.getString(2131362263), new Object[] { Integer.valueOf((int)paramDouble) }));
      int i2 = this.o.getProgress();
      int i1 = i2;
      if (i2 < this.t) {
        i1 = this.t;
      }
      a(j(), paramDouble, (int)(this.y - i()), i1);
      return this.B;
    }
  }
  
  private int a(int paramInt1, double paramDouble, int paramInt2, int paramInt3)
  {
    double d1 = paramInt1 / Math.sin(Math.toRadians(paramDouble));
    double d2 = this.N;
    paramInt2 = this.N;
    if ((Math.cos(Math.toRadians(paramDouble)) * d1 - i() <= paramInt2) && (Math.sin(Math.toRadians(paramDouble)) * d2 - (this.q.u().f() - 677216.0D) / 10.0D <= paramInt1))
    {
      if (d1 > d2) {
        break label278;
      }
      this.E = ((int)(d2 / paramInt3));
    }
    for (this.C = ((int)d2);; this.C = ((int)d1))
    {
      if ((Math.cos(Math.toRadians(paramDouble)) * d1 - i() <= paramInt2) && (Math.sin(Math.toRadians(paramDouble)) * d2 - (this.q.u().f() - 677216.0D) / 10.0D > paramInt1))
      {
        this.E = ((int)(d1 / paramInt3));
        this.C = ((int)d1);
      }
      if ((d1 * Math.cos(Math.toRadians(paramDouble)) - i() > paramInt2) && (Math.sin(Math.toRadians(paramDouble)) * d2 - (this.q.u().f() - 677216.0D) / 10.0D <= paramInt1))
      {
        this.E = ((int)(d2 / paramInt3));
        this.C = ((int)d2);
      }
      k();
      this.n.setMax(this.E);
      return this.E;
      label278:
      this.E = ((int)(d1 / paramInt3));
    }
  }
  
  private void a(View paramView)
  {
    this.j = ((TextView)paramView.findViewById(2131690098));
    this.k = ((TextView)paramView.findViewById(2131690097));
    this.l = ((TextView)paramView.findViewById(2131690100));
    this.m = ((TextView)paramView.findViewById(2131690101));
    this.s = ((ImageView)paramView.findViewById(2131690105));
    this.r = ((PercentRelativeLayout)paramView.findViewById(2131690090));
    this.a = ((Button)paramView.findViewById(2131690085));
    this.b = ((Button)paramView.findViewById(2131690086));
    this.f = ((TextView)paramView.findViewById(2131690089));
    this.g = ((TextView)paramView.findViewById(2131690091));
    this.h = ((TextView)paramView.findViewById(2131690094));
    this.n = ((SeekBar)paramView.findViewById(2131690092));
    this.n.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar) {}
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          k.a(k.this).setText(paramAnonymousInt + "s");
          k.b(k.this);
        }
      }
      
      public void b(SeekBar paramAnonymousSeekBar) {}
    });
    this.o = ((SeekBar)paramView.findViewById(2131690095));
    this.o.setOnSeekBarChangeListener(new SeekBar.a()
    {
      public void a(SeekBar paramAnonymousSeekBar) {}
      
      public void a(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        int i = paramAnonymousInt;
        if (paramAnonymousInt < 1) {
          i = 1;
        }
        k.b(k.this);
        k.c(k.this).setText(i + "m/s");
      }
      
      public void b(SeekBar paramAnonymousSeekBar)
      {
        k.this.g();
      }
    });
    this.p = ((SwitchButtonStoke)paramView.findViewById(2131690104));
    this.p.setOnSwitchListener(new SwitchButtonStoke.a()
    {
      public void a(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          k.a(k.this, 1);
          return;
        }
        k.a(k.this, 0);
      }
    });
    this.i = ((TextView)paramView.findViewById(2131690103));
    this.c = ((Button)paramView.findViewById(2131690106));
    this.d = ((MyEditView)paramView.findViewById(2131690093));
    this.d.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        k.a(k.this).clearFocus();
      }
    });
    this.d.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          k.a(k.this, k.a(k.this), k.d(k.this), 0, k.e(k.this), k.f(k.this));
          return;
        }
        k.a(k.this, k.a(k.this).getText().toString());
      }
    });
    this.e = ((MyEditView)paramView.findViewById(2131690096));
    this.e.setOnFinishComposingListener(new MyEditView.b()
    {
      public void a()
      {
        k.c(k.this).clearFocus();
      }
    });
    this.e.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          k.a(k.this, k.c(k.this), k.g(k.this), k.h(k.this), k.i(k.this), k.j(k.this));
          return;
        }
        k.a(k.this, k.a(k.this).getText().toString());
      }
    });
    ao.a(this.q.d.getAssets(), new View[] { this.a, this.b, this.f, this.g, this.h, this.i, this.c, this.j, this.k, this.l, this.m });
    ao.b(this.q.d.getAssets(), new View[] { this.d, this.e });
    paramView = new View[3];
    paramView[0] = this.a;
    paramView[1] = this.b;
    paramView[2] = this.c;
    int i2 = paramView.length;
    int i1 = 0;
    Object localObject;
    if (i1 < i2)
    {
      localObject = paramView[i1];
      if ((localObject instanceof SwitchButtonStoke)) {
        ((SwitchButtonStoke)localObject).setOnSwitchListener(this);
      }
      for (;;)
      {
        i1 += 1;
        break;
        ((View)localObject).setOnClickListener(this);
      }
    }
    paramView = new MyEditView[2];
    paramView[0] = this.d;
    paramView[1] = this.e;
    i2 = paramView.length;
    i1 = 0;
    while (i1 < i2)
    {
      localObject = paramView[i1];
      ((MyEditView)localObject).clearFocus();
      ((MyEditView)localObject).setInputType(2);
      i1 += 1;
    }
  }
  
  private void a(TextView paramTextView, int paramInt, double paramDouble)
  {
    String str = String.format(this.q.d.getString(paramInt), new Object[] { Double.valueOf(paramDouble) });
    if (!paramTextView.getText().toString().equals(str)) {
      paramTextView.setText(String.format(this.q.d.getString(paramInt), new Object[] { Double.valueOf(paramDouble) }));
    }
  }
  
  private void a(MyEditView paramMyEditView, int paramInt1, int paramInt2, SeekBar paramSeekBar, String paramString)
  {
    for (;;)
    {
      try
      {
        str = a(b(paramMyEditView.getText().toString()));
        i1 = Integer.parseInt(str);
        if (i1 <= paramInt1) {
          continue;
        }
        str = paramInt1 + paramString;
        paramMyEditView.setText(str);
      }
      catch (Exception paramSeekBar)
      {
        String str;
        int i1;
        if (this.R == null) {
          return;
        }
        paramMyEditView.setText(this.R);
        this.R = " ";
        return;
        paramInt1 = i1;
        continue;
      }
      paramSeekBar.setProgress(Integer.valueOf(paramInt1).intValue());
      if (str.contains(paramString)) {
        return;
      }
      paramMyEditView.setText(str + paramString);
      return;
      if (i1 >= paramInt2) {
        continue;
      }
      str = paramInt2 + paramString;
      paramMyEditView.setText(str);
      paramInt1 = paramInt2;
    }
  }
  
  public static String b(String paramString)
  {
    return Pattern.compile("[^0-9]").matcher(paramString).replaceAll("").trim();
  }
  
  private double i()
  {
    return y.c(new LatLng(this.q.v().b(), this.q.v().c()), new LatLng(this.q.u().e(), this.q.u().d())).a();
  }
  
  private int j()
  {
    return (int)(this.x - (this.q.u().f() - 677216.0D) / 10.0D);
  }
  
  private void k()
  {
    int i2 = this.o.getProgress();
    int i1 = i2;
    if (i2 < this.t) {
      i1 = this.t;
    }
    i1 *= this.n.getProgress();
    double d1 = t.a(i1 * Math.sin(Math.toRadians(this.H)) + (this.q.u().f() - 677216.0D) / 10.0D, 1);
    double d2 = t.a(i1 * Math.cos(Math.toRadians(this.H)), 1);
    a(this.k, 2131362816, d1);
    a(this.j, 2131362323, d2);
  }
  
  public LatLng a(LatLng paramLatLng, double paramDouble1, double paramDouble2)
  {
    return y.a(paramLatLng, paramDouble1, paramDouble2);
  }
  
  public String a(String paramString)
  {
    return BigDecimal.valueOf(Double.parseDouble(paramString)).stripTrailingZeros().toPlainString();
  }
  
  public void a()
  {
    if (this.q.aj().g().isEnforcementAtti())
    {
      com.fimi.kernel.utils.z.a(this.q.d, 2131362059, 3000);
      return;
    }
    if (this.q.aj().g().isLightStream())
    {
      com.fimi.kernel.utils.z.a(this.q.d, 2131362058, 3000);
      return;
    }
    if ((this.E > 0) && (this.n.getProgress() == 0))
    {
      com.fimi.kernel.utils.z.a(this.q.d, 2131362679, 3000);
      return;
    }
    if ((this.M != null) && (this.M.f() == c.a.c)) {
      b();
    }
    for (;;)
    {
      this.q.a(d.a.bx);
      return;
      this.M.u().f();
    }
  }
  
  public void a(int paramInt)
  {
    this.D = paramInt;
    this.f.setText(this.D + "°");
    a(Math.abs(paramInt));
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public void a(com.fimi.soul.drone.h.a.a parama)
  {
    if (parama != null) {}
    try
    {
      if (this.J == 0.0D) {
        this.J = parama.d();
      }
      if (this.K == 0.0D) {
        this.K = parama.e();
      }
      if (this.L == 0.0D) {
        this.L = parama.c();
      }
      if (this.I == 0.0D) {
        this.I = (parama.f() / 10);
      }
      this.o.setProgress(parama.g() / 10);
      this.n.setProgress(parama.h() / parama.g());
      return;
    }
    catch (Exception parama) {}
  }
  
  public void b()
  {
    if (this.P == true)
    {
      if (this.J == 0.0D) {
        this.J = (this.q.u().f() - 677216.0D);
      }
      LatLng localLatLng = new LatLng(this.q.u().e(), this.q.u().d());
      if (this.K == 0.0D) {
        this.K = localLatLng.b;
      }
      if (this.L == 0.0D) {
        this.L = localLatLng.a;
      }
      if (this.I == 0.0D) {
        this.I = this.H;
      }
      c();
    }
  }
  
  public void c()
  {
    int i1 = this.o.getProgress();
    if (i1 < this.t) {
      i1 = this.t;
    }
    for (;;)
    {
      if (!com.fimi.soul.biz.n.a.a().b())
      {
        af localaf = com.fimi.soul.utils.z.a(0.5D, this.L, this.K);
        this.L = localaf.a();
        this.K = localaf.b();
      }
      com.fimi.soul.module.b.d.a(this.q).a((byte)18, (byte)this.Q, (short)(this.n.getProgress() * i1 * 10), (short)(int)(this.I * 100.0D), (byte)(i1 * 10), (short)(int)this.J, (float)this.K, (float)this.L);
      return;
    }
  }
  
  public void d()
  {
    com.fimi.kernel.utils.z.a(this.q.d, 2131362824, 2000);
  }
  
  public void e()
  {
    this.c.setVisibility(0);
    this.s.setVisibility(0);
  }
  
  public void f()
  {
    this.c.setVisibility(8);
    this.c.setVisibility(8);
    if (this.r.isShown()) {
      this.r.setVisibility(8);
    }
  }
  
  public void g()
  {
    if (this.E >= 20)
    {
      this.n.setProgress(this.F);
      this.d.setText(this.F + "s");
      return;
    }
    if ((this.E == 0) && (this.r.isShown()) && (j() < 2)) {
      com.fimi.kernel.utils.z.a(this.q.d, "飞机将达到最大高度，请调节云台角度", 3000);
    }
    this.n.setProgress(this.E);
    this.d.setText(this.E + "s");
  }
  
  public void h()
  {
    g();
    if (this.B >= 1)
    {
      this.o.setProgress(this.G);
      this.e.setText(this.G + "m/s");
    }
    for (;;)
    {
      this.r.setVisibility(8);
      this.p.setSwitchState(false);
      this.Q = 0;
      this.L = 0.0D;
      this.J = 0.0D;
      this.K = 0.0D;
      this.I = 0.0D;
      this.O = false;
      this.P = false;
      k();
      return;
      this.o.setProgress(this.B);
      this.e.setText(this.B + "m/s");
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      this.P = false;
      f();
      h.a(this.q.d).a(0);
      this.q.a(d.a.bi);
      return;
      if (this.O)
      {
        this.P = true;
        a();
        return;
      }
      com.fimi.kernel.utils.z.a(this.q.d, 2131362533, 3000);
      return;
      this.O = true;
      if (!this.r.isShown()) {
        this.r.setVisibility(0);
      }
      if (this.s.isShown()) {
        this.s.setVisibility(8);
      }
    } while (!this.c.isShown());
    this.c.setVisibility(8);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */