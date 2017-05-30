package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.t.a;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.p;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.view.EVview;
import com.fimi.soul.view.LightView;
import java.util.Timer;
import java.util.TimerTask;

public class ShowDroneStatusFragment
  extends Fragment
  implements d.b
{
  private static float M = 0.0F;
  private static final int T = 1;
  private static final int U = 0;
  private static final double Z = 0.20000000298023224D;
  private static final double aa = 0.4000000059604645D;
  private static final int ad = 1;
  private static final int ae = 2;
  private static final int af = 3;
  public static int e;
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private Context E;
  private com.fimi.soul.drone.a F;
  private DroidPlannerApp G;
  private boolean H = true;
  private int I;
  private EVview J;
  private LinearLayout K;
  private TextView L;
  private LightView N;
  private double O = 0.0D;
  private int P = 1;
  private boolean Q = false;
  private boolean R = false;
  private a S = a.a;
  private boolean V = false;
  private boolean W = false;
  private boolean X = false;
  private boolean Y = false;
  com.fimi.soul.biz.manager.t a;
  private BatteryOverDischange ab;
  private com.fimi.soul.utils.d ac;
  private Handler ag = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      case 0: 
        ShowDroneStatusFragment.a(ShowDroneStatusFragment.this).setVisibility(8);
        return;
      }
      z.a(ShowDroneStatusFragment.b(ShowDroneStatusFragment.this), 2131362716, 1);
    }
  };
  private boolean ah = true;
  private double ai;
  private double aj;
  Timer b;
  Timer c;
  com.fimi.soul.module.setting.newhand.c d;
  boolean f = false;
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
  
  private double a()
  {
    double[] arrayOfDouble = new double[4];
    arrayOfDouble[0] = (this.F.w().a() / 100.0D + 2.0D);
    arrayOfDouble[1] = (this.F.w().b() / 100.0D + 2.0D);
    arrayOfDouble[2] = (this.F.w().c() / 100.0D + 2.0D);
    arrayOfDouble[3] = (this.F.w().d() / 100.0D + 2.0D);
    double d1 = 0.0D;
    int i1 = 0;
    while (i1 < 4)
    {
      int i2 = i1 + 1;
      while (i2 < 4)
      {
        double d2 = d1;
        if (Math.abs(arrayOfDouble[i2] - arrayOfDouble[i1]) > d1) {
          d2 = Math.abs(arrayOfDouble[i2] - arrayOfDouble[i1]);
        }
        i2 += 1;
        d1 = d2;
      }
      i1 += 1;
    }
    return d1;
  }
  
  private void a(String paramString, TextView paramTextView)
  {
    if ((paramString != null) && (!paramString.equals(paramTextView.getText().toString()))) {
      paramTextView.setText(paramString);
    }
  }
  
  private String b(int paramInt)
  {
    return com.fimi.kernel.utils.t.b(paramInt / 100.0D + 2.0D, 2);
  }
  
  private boolean b()
  {
    double d1 = this.F.w().a() / 100.0D;
    double d2 = this.F.w().b() / 100.0D;
    double d3 = this.F.w().c() / 100.0D;
    double d4 = this.F.w().d() / 100.0D;
    int i1 = 0;
    while (i1 < 4)
    {
      if (new double[] { d1 + 2.0D, d2 + 2.0D, d3 + 2.0D, d4 + 2.0D }[i1] < 3.0D) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private void c()
  {
    this.d.e();
    e();
  }
  
  private void c(int paramInt)
  {
    if (this.ac == null) {
      this.ac = com.fimi.soul.utils.d.a(this.E);
    }
    this.ab = new BatteryOverDischange();
    double d1 = (this.F.w().a() + this.F.w().b() + this.F.w().c() + this.F.w().d()) / 100.0D;
    this.ab.setVoltage(com.fimi.kernel.utils.t.b(d1 + 8.0D, 2));
    int i2 = this.F.w().g();
    int i1 = i2;
    if (i2 < 0) {
      i1 = 0;
    }
    this.ab.setBatteryCurrent(i1 + "");
    Object localObject = this.F.w().i() - 60 + "";
    this.ab.setTemperature((String)localObject);
    this.ai = this.F.D().e();
    this.aj = this.F.D().d();
    label316:
    BatteryOverDischange localBatteryOverDischange;
    if (this.aj > this.ai)
    {
      i2 = (int)this.aj;
      this.ab.setBatteryFull(i2 + "");
      e = (int)(i1 / this.ai * 100.0D);
      if (e > 30) {
        break label680;
      }
      this.ab.setBatteryLevel(e + "%");
      this.ab.setUserId(com.fimi.soul.base.a.b(this.E).getUserID());
      localBatteryOverDischange = this.ab;
      if (com.fimi.soul.module.update.a.a.a().a(5).i() != null) {
        break label712;
      }
    }
    label680:
    label712:
    for (localObject = "0";; localObject = com.fimi.soul.module.update.a.a.a().a(5).i())
    {
      localBatteryOverDischange.setBatteryId((String)localObject);
      this.ab.setBatteryLevel(this.F.w().j() + "");
      this.ab.setBatteryOne(b(this.F.w().a()));
      this.ab.setBatteryTwo(b(this.F.w().b()));
      this.ab.setBatteryThree(b(this.F.w().c()));
      this.ab.setBatteryFour(b(this.F.w().d()));
      this.ab.setBatteryRecyle(this.F.D().c() + "");
      this.ab.setVersion(com.fimi.soul.module.update.a.a.a().a(5).b() + "");
      this.ab.setAppType("0");
      this.ab.setAccidentType(paramInt);
      localObject = (b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class);
      if (localObject != null) {
        this.ab.setFcVersion(String.valueOf(((b)localObject).a()));
      }
      this.ab.setUpdateTimes(String.valueOf(this.F.w().m()));
      this.ab.setUpdateTimes(String.valueOf(-this.F.w().h()));
      new com.fimi.soul.biz.f.a(getActivity()).a(this.ab);
      return;
      i2 = (int)this.ai;
      break;
      this.ab.setBatteryLevel(e + "%");
      break label316;
    }
  }
  
  private float d(int paramInt)
  {
    float f2 = 0.0F;
    float f1;
    if ((paramInt >= 0) && (paramInt <= 78)) {
      f1 = -2.0F;
    }
    do
    {
      do
      {
        do
        {
          return f1;
          if ((paramInt > 78) && (paramInt <= 156)) {
            return -1.7F;
          }
          if ((paramInt > 156) && (paramInt <= 234)) {
            return -1.3F;
          }
          if ((paramInt > 234) && (paramInt <= 312)) {
            return -1.0F;
          }
          if ((paramInt > 312) && (paramInt <= 390)) {
            return -0.7F;
          }
          if ((paramInt > 390) && (paramInt <= 468)) {
            return -0.3F;
          }
          if (paramInt <= 468) {
            break;
          }
          f1 = f2;
        } while (paramInt <= 546);
        if ((paramInt > 546) && (paramInt <= 624)) {
          return 0.3F;
        }
        if ((paramInt > 624) && (paramInt <= 702)) {
          return 0.7F;
        }
        if ((paramInt > 702) && (paramInt <= 780)) {
          return 1.0F;
        }
        if ((paramInt > 780) && (paramInt <= 858)) {
          return 1.3F;
        }
        if ((paramInt > 858) && (paramInt <= 936)) {
          return 1.7F;
        }
        f1 = f2;
      } while (paramInt <= 936);
      f1 = f2;
    } while (paramInt > 1024);
    return 2.0F;
  }
  
  private void d()
  {
    if (this.ai > 0.0D)
    {
      int i2 = this.F.w().g();
      int i1 = i2;
      if (i2 < 0) {
        i1 = 0;
      }
      e = (int)(i1 / this.ai * 100.0D);
      if (e >= 0) {}
    }
    else
    {
      return;
    }
    if (e > 100)
    {
      this.ah = true;
      this.ai = 0.0D;
      return;
    }
    if ((e > 0) && (e < 30))
    {
      this.m.setTextColor(getResources().getColor(2131623998));
      this.i.setTextColor(getResources().getColor(2131623998));
      this.q.setTextColor(getResources().getColor(2131623998));
      this.r.setTextColor(getResources().getColor(2131623998));
      if (e > 30) {
        break label322;
      }
      this.i.setText(e + "");
    }
    for (;;)
    {
      this.r.setVisibility(8);
      this.q.setVisibility(0);
      a("%", this.q);
      a(getString(2131362172), this.m);
      this.q.setTextSize(16.0F);
      this.F.a(d.a.aP);
      return;
      this.m.setTextColor(getResources().getColor(2131623997));
      this.i.setTextColor(getResources().getColor(2131623997));
      this.q.setTextColor(getResources().getColor(2131623997));
      this.r.setTextColor(getResources().getColor(2131623997));
      break;
      label322:
      this.i.setText(e + "");
    }
  }
  
  private float e(int paramInt)
  {
    float f2 = 0.0F;
    float f1;
    if ((paramInt >= 0) && (paramInt <= 156)) {
      f1 = -2.0F;
    }
    do
    {
      do
      {
        do
        {
          return f1;
          if ((paramInt > 156) && (paramInt <= 312)) {
            return -1.3F;
          }
          if ((paramInt > 312) && (paramInt <= 468)) {
            return -0.7F;
          }
          if (paramInt <= 468) {
            break;
          }
          f1 = f2;
        } while (paramInt <= 546);
        if ((paramInt > 546) && (paramInt <= 702)) {
          return 0.7F;
        }
        if ((paramInt > 702) && (paramInt <= 858)) {
          return 1.3F;
        }
        f1 = f2;
      } while (paramInt <= 858);
      f1 = f2;
    } while (paramInt > 1024);
    return 2.0F;
  }
  
  private void e()
  {
    bf localbf = new bf();
    localbf.d = 115;
    localbf.e = 1;
    localbf.f = 0;
    this.F.T().a(localbf.a());
  }
  
  public void a(int paramInt)
  {
    this.B.setVisibility(paramInt);
    this.A.setVisibility(paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.K.setVisibility(8);
      this.C.setVisibility(8);
      this.D.setVisibility(8);
    }
    this.f = paramBoolean;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.E = paramActivity.getApplicationContext();
    this.G = ((DroidPlannerApp)paramActivity.getApplication());
    this.a = com.fimi.soul.biz.manager.t.a(getActivity());
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968788, null);
    if (com.fimi.kernel.c.e().d()) {
      paramLayoutInflater.findViewById(2131690556).setVisibility(0);
    }
    for (;;)
    {
      this.s = ((TextView)paramLayoutInflater.findViewById(2131690557));
      this.t = ((TextView)paramLayoutInflater.findViewById(2131690558));
      this.J = ((EVview)paramLayoutInflater.findViewById(2131690140));
      this.N = ((LightView)paramLayoutInflater.findViewById(2131690141));
      this.L = ((TextView)paramLayoutInflater.findViewById(2131690139));
      this.u = ((TextView)paramLayoutInflater.findViewById(2131690559));
      this.v = ((TextView)paramLayoutInflater.findViewById(2131690560));
      this.w = ((TextView)paramLayoutInflater.findViewById(2131690561));
      this.x = ((TextView)paramLayoutInflater.findViewById(2131690562));
      this.y = ((TextView)paramLayoutInflater.findViewById(2131690563));
      this.z = ((TextView)paramLayoutInflater.findViewById(2131690564));
      this.A = ((TextView)paramLayoutInflater.findViewById(2131690565));
      this.B = ((TextView)paramLayoutInflater.findViewById(2131690566));
      this.C = ((TextView)paramLayoutInflater.findViewById(2131690567));
      this.D = ((TextView)paramLayoutInflater.findViewById(2131690568));
      this.K = ((LinearLayout)paramLayoutInflater.findViewById(2131690555));
      this.k = ((TextView)paramLayoutInflater.findViewById(2131690542));
      this.k.getPaint().setFakeBoldText(true);
      this.l = ((TextView)paramLayoutInflater.findViewById(2131690545));
      this.l.getPaint().setFakeBoldText(true);
      this.m = ((TextView)paramLayoutInflater.findViewById(2131690550));
      this.m.getPaint().setFakeBoldText(true);
      this.o = ((TextView)paramLayoutInflater.findViewById(2131690543));
      this.n = ((TextView)paramLayoutInflater.findViewById(2131690548));
      this.n.getPaint().setFakeBoldText(true);
      this.j = ((TextView)paramLayoutInflater.findViewById(2131690549));
      this.p = ((TextView)paramLayoutInflater.findViewById(2131690547));
      this.q = ((TextView)paramLayoutInflater.findViewById(2131690553));
      this.r = ((TextView)paramLayoutInflater.findViewById(2131690554));
      this.g = ((TextView)paramLayoutInflater.findViewById(2131690544));
      this.g.getPaint().setFakeBoldText(true);
      this.i = ((TextView)paramLayoutInflater.findViewById(2131690552));
      this.i.getPaint().setFakeBoldText(true);
      this.h = ((TextView)paramLayoutInflater.findViewById(2131690546));
      this.h.getPaint().setFakeBoldText(true);
      this.j = ((TextView)paramLayoutInflater.findViewById(2131690549));
      this.j.getPaint().setFakeBoldText(true);
      com.fimi.soul.utils.ao.b(getActivity().getAssets(), new View[] { this.g, this.h, this.i, this.o, this.p, this.q, this.t, this.v });
      com.fimi.soul.utils.ao.a(getActivity().getAssets(), new View[] { this.j, this.k, this.l, this.m, this.n, this.r, this.s, this.u, this.w, this.y, this.x, this.z, this.A, this.B });
      this.F = this.G.a;
      this.a.a(new t.a()
      {
        public void a(String paramAnonymousString1, String paramAnonymousString2)
        {
          ShowDroneStatusFragment.c(ShowDroneStatusFragment.this).setText(paramAnonymousString2 + "," + paramAnonymousString1);
        }
      });
      return paramLayoutInflater;
      paramLayoutInflater.findViewById(2131690556).setVisibility(4);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.F.b(this);
    this.a.a();
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if ((parama1.U()) && (parama1.T().a())) {
      switch (5.a[parama.ordinal()])
      {
      }
    }
    label716:
    label798:
    label875:
    label958:
    label994:
    label1032:
    label1040:
    label1145:
    label1466:
    label1607:
    label1609:
    label1645:
    do
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              return;
              if ((parama1.U()) && (this.ah)) {
                com.fimi.soul.drone.d.e.a(parama1);
              }
              double d1 = com.fimi.kernel.utils.t.a(parama1.r().a() / 100.0D, 1);
              double d2 = com.fimi.kernel.utils.t.a(parama1.r().b() / 100.0D, 1);
              a(d1 + "m/s", this.t);
              a(d2 + "m/s", this.v);
              if ((!this.W) && (a() > 0.20000000298023224D) && (a() <= 0.4000000059604645D))
              {
                this.W = true;
                c(1);
              }
              if ((!this.X) && (a() > 0.4000000059604645D))
              {
                this.X = true;
                c(2);
              }
              if ((!this.Y) && (b()))
              {
                this.Y = true;
                c(3);
                return;
                i1 = parama1.K().a();
                if ((30 <= i1) && (i1 < 80))
                {
                  a(getString(2131362634), this.x);
                  return;
                }
                if (i1 >= 80)
                {
                  a(getString(2131362807), this.x);
                  return;
                }
                if ((5 < i1) && (i1 < 30))
                {
                  a(getString(2131362632), this.x);
                  return;
                }
                a(getString(2131362528), this.x);
                return;
                this.O = parama1.g().e();
                if ((this.Q) && (!this.R))
                {
                  this.D.setVisibility(8);
                  this.C.setVisibility(8);
                  if ((int)(this.O * 100.0D) / 1034 <= 0) {
                    i1 = 0;
                  }
                  for (;;)
                  {
                    this.N.setLightPercent(this.P);
                    if ((i1 == this.P) || (this.S != a.b)) {
                      break;
                    }
                    this.K.setVisibility(0);
                    this.N.setVisibility(0);
                    this.P = i1;
                    this.ag.removeMessages(0);
                    if (this.c != null)
                    {
                      this.c.cancel();
                      this.c = null;
                    }
                    if (this.c == null) {
                      this.c = new Timer();
                    }
                    this.c.schedule(new TimerTask()
                    {
                      public void run()
                      {
                        ShowDroneStatusFragment.d(ShowDroneStatusFragment.this).sendEmptyMessage(0);
                      }
                    }, 3000L);
                    return;
                    if ((int)(this.O * 100.0D) / 1020 >= 100) {
                      i1 = 100;
                    } else {
                      i1 = (int)(this.O * 100.0D) / 1020;
                    }
                  }
                  d1 = (parama1.u().f() - 677216.0D) / 10.0D;
                  if (!parama1.ac()) {
                    d1 = 0.0D;
                  }
                  if (d1 < 3000.0D)
                  {
                    if ((d1 < 100.0D) && (d1 >= 0.0D)) {
                      break label958;
                    }
                    d2 = d1;
                    if (d1 < -999.0D) {
                      d2 = -999.0D;
                    }
                    if (d2 < 100.0D)
                    {
                      parama = com.fimi.kernel.utils.t.a(d2, 1) + "";
                      a(parama, this.g);
                    }
                  }
                  else
                  {
                    d1 = parama1.u().g();
                    if (!parama1.ac()) {
                      d1 = 0.0D;
                    }
                    if ((d1 > -50.0D) && (d1 < 10000.0D) && (!parama1.aj().g().isLightStream()))
                    {
                      if (d1 < 100.0D) {
                        break label994;
                      }
                      a((int)d1 + "", this.h);
                    }
                    parama = com.fimi.soul.biz.e.d.a();
                    i1 = parama.f();
                    if ((!com.fimi.soul.biz.e.d.a().m()) || (i1 >= 50) || (d1 >= 300.0D) || (parama1.aj().g().isLightStream())) {
                      break label1032;
                    }
                    if ((!this.V) && (!com.fimi.soul.biz.e.d.a().k()))
                    {
                      this.ag.sendEmptyMessage(1);
                      this.V = true;
                    }
                    if ((parama.n()) && (parama.m())) {
                      break label1040;
                    }
                    a(getString(2131362528), this.z);
                  }
                  for (;;)
                  {
                    if (!parama1.aj().g().isLightStream()) {
                      break label1145;
                    }
                    a(getString(2131362528), this.j);
                    return;
                    parama = (int)d2 + "";
                    break;
                    d1 = com.fimi.kernel.utils.t.a(d1, 1);
                    a(d1 + "", this.g);
                    break label716;
                    d2 = com.fimi.kernel.utils.t.a(d1, 1);
                    a(d2 + "", this.h);
                    break label798;
                    this.V = false;
                    break label875;
                    if ((30 <= i1) && (i1 < 60)) {
                      a(getString(2131362634), this.z);
                    } else if (i1 >= 60) {
                      a(getString(2131362807), this.z);
                    } else if ((i1 > 0) && (i1 < 30)) {
                      a(getString(2131362632), this.z);
                    } else {
                      a(getString(2131362528), this.z);
                    }
                  }
                  i1 = parama1.u().c();
                  if (i1 > 13) {
                    a(i1 + " ", this.j);
                  }
                  while (i1 <= 8)
                  {
                    this.j.setTextColor(getResources().getColor(2131623998));
                    this.n.setTextColor(getResources().getColor(2131623998));
                    return;
                    if ((8 < i1) && (i1 <= 13)) {
                      a(i1 + " ", this.j);
                    } else if ((i1 <= 8) && (i1 > 4)) {
                      a(i1 + " ", this.j);
                    } else {
                      a(getString(2131362528), this.j);
                    }
                  }
                  this.j.setTextColor(getResources().getColor(2131623997));
                  this.n.setTextColor(getResources().getColor(2131623997));
                  return;
                  this.ah = false;
                  this.ai = parama1.D().e();
                  this.aj = parama1.D().d();
                  return;
                  if ((parama1.al().f() == 3) && (parama1.al().d() == 51) && (parama1.al().g() == 4))
                  {
                    if (parama1.al().h() == 1.0F)
                    {
                      this.R = true;
                      this.K.setVisibility(8);
                    }
                  }
                  else
                  {
                    if ((parama1.al().d() != 34) || ((parama1.al().f() != 1) && (parama1.al().f() != 3))) {
                      break label1607;
                    }
                    if (parama1.al().d() == 34)
                    {
                      if (((int)parama1.al().h() & 0x4) != 4) {
                        break label1609;
                      }
                      this.R = true;
                      this.K.setVisibility(8);
                    }
                  }
                  for (;;)
                  {
                    if ((parama1.al().f() != 1) || (parama1.al().e() != 0)) {
                      break label1645;
                    }
                    this.R = false;
                    e();
                    return;
                    this.R = false;
                    if (this.S == a.b) {
                      this.K.setVisibility(0);
                    }
                    this.ag.sendEmptyMessageDelayed(0, 2000L);
                    break label1466;
                    break;
                    this.R = false;
                    if (this.S == a.b) {
                      this.K.setVisibility(0);
                    }
                    this.ag.sendEmptyMessageDelayed(0, 2000L);
                  }
                }
              }
            }
            d();
            return;
            parama = parama1.L();
          } while ((parama == null) || (parama.b() != 115) || (parama.c != 2));
          switch (parama.d)
          {
          default: 
            return;
          case 1: 
            if (!this.f) {
              a(false);
            }
            this.L.setText(getString(2131362186));
            this.Q = false;
            this.N.setVisibility(8);
            this.J.setVisibility(0);
            this.C.setVisibility(0);
            this.D.setVisibility(0);
            this.D.setText(String.valueOf(M));
            return;
          }
        } while (this.R);
        a(false);
        this.L.setText(getString(2131362415));
        this.N.setVisibility(0);
        this.J.setVisibility(8);
        this.Q = true;
        this.S = a.b;
        return;
        this.S = a.c;
        parama = parama1.f();
      } while (parama.c() != 2);
      int i1 = parama.d() & 0xFF;
      int i2 = parama.e() & 0xFF;
      if (com.fimi.soul.biz.e.d.a().k()) {}
      for (float f1 = e(i2 << 8 | i1);; f1 = d(i2 << 8 | i1))
      {
        this.L.setText(getString(2131362186));
        if ((M == f1) || ((i2 == 255) && (i1 == 255))) {
          break;
        }
        this.ag.removeMessages(0);
        M = f1;
        this.D.setText(String.valueOf(M));
        this.J.a(f1);
        if ((this.K.getVisibility() == 8) && (!this.f))
        {
          this.D.setVisibility(0);
          this.C.setVisibility(0);
          this.K.setVisibility(0);
        }
        if (this.b != null)
        {
          this.b.cancel();
          this.b = null;
        }
        if (this.b == null) {
          this.b = new Timer();
        }
        this.b.schedule(new TimerTask()
        {
          public void run()
          {
            ShowDroneStatusFragment.d(ShowDroneStatusFragment.this).sendEmptyMessage(0);
          }
        }, 3000L);
        return;
      }
      if (!parama1.T().a())
      {
        this.W = false;
        this.X = false;
        this.Y = false;
        this.r.setVisibility(8);
        this.q.setVisibility(0);
        a("0.0", this.h);
        a("0.0", this.g);
        a("0", this.i);
        a("0.0m/s", this.t);
        a("0.0m/s", this.v);
        a(getString(2131362172), this.m);
        a("%", this.q);
        a(getString(2131362528), this.j);
        a(getString(2131362528), this.x);
        a(getString(2131362528), this.z);
      }
    } while (parama1.U());
    this.ai = 0.0D;
    this.ah = true;
    this.W = false;
    this.X = false;
    this.Y = false;
  }
  
  public void onResume()
  {
    super.onResume();
    c();
  }
  
  public void onStart()
  {
    super.onStart();
    this.F.a(this);
    this.d = new com.fimi.soul.module.setting.newhand.c(this.F, this.E);
  }
  
  public void onStop()
  {
    super.onStop();
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/ShowDroneStatusFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */