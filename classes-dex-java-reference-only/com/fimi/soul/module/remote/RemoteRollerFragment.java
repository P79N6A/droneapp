package com.fimi.soul.module.remote;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;
import com.fimi.soul.view.RemoteRollerView;

public class RemoteRollerFragment
  extends BaseRemoteFragment
{
  MidView f;
  MidView g;
  a h;
  private TextView i;
  private TextView j;
  private TextView k;
  private Button l;
  private Button m;
  private RemoteRollerView n;
  private RemoteRollerView o;
  private RemoteRollerView p;
  private RemoteRollerView q;
  
  public void a()
  {
    if (this.b.U())
    {
      if (this.b.ac()) {
        this.j.setText(2131362033);
      }
      for (;;)
      {
        this.l.setEnabled(false);
        a(this.l, 77);
        this.k.setVisibility(4);
        return;
        this.j.setText(2131362633);
      }
    }
    if (!this.b.T().a())
    {
      this.l.setEnabled(false);
      a(this.l, 77);
      this.j.setText(2131362148);
      this.k.setVisibility(4);
      return;
    }
    if (!this.l.isEnabled()) {
      b.b(getActivity()).a(getString(2131362621));
    }
    this.l.setEnabled(true);
    a(this.l, 230);
    this.j.setText(2131362629);
    this.k.setVisibility(0);
  }
  
  public void a(View paramView)
  {
    this.l = ((Button)paramView.findViewById(2131689936));
    this.l.setOnClickListener(this);
    this.l.setEnabled(false);
    this.n = ((RemoteRollerView)paramView.findViewById(2131690273));
    this.o = ((RemoteRollerView)paramView.findViewById(2131690275));
    this.p = ((RemoteRollerView)paramView.findViewById(2131690274));
    this.q = ((RemoteRollerView)paramView.findViewById(2131690276));
    this.n.setInitView(0);
    this.o.setInitView(1);
    this.p.setInitView(2);
    this.q.setInitView(3);
    this.n.setSweep(51.0F);
    this.o.setSweep(1.0F);
    this.p.setSweep(51.0F);
    this.q.setSweep(1.0F);
    this.i.setText(2131362011);
    ao.a(getActivity().getAssets(), new View[] { this.m, this.i, this.j, this.k, this.l });
    a();
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
    case 2131689936: 
      do
      {
        return;
        if (!this.b.T().a())
        {
          z.a(this.a, this.a.getString(2131362010), z.b);
          return;
        }
        if (this.b.U())
        {
          z.a(this.a, this.a.getString(2131362075), z.b);
          return;
        }
        this.d.l();
      } while (this.e == null);
      this.e.a(2131690532, 2131690529);
      return;
    }
    this.d.m();
    getActivity().finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968700, null);
    this.f = ((MidView)paramLayoutInflater.findViewById(2131690277).findViewById(2131689937));
    this.g = ((MidView)paramLayoutInflater.findViewById(2131690278).findViewById(2131689937));
    this.m = ((Button)paramLayoutInflater.findViewById(2131689748).findViewById(2131690535));
    this.m.setOnClickListener(this);
    this.i = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.j = ((TextView)paramLayoutInflater.findViewById(2131689932));
    this.k = ((TextView)paramLayoutInflater.findViewById(2131689953));
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    float f3 = 51.0F;
    float f2 = 1.0F;
    super.onDroneEvent(parama, parama1);
    if (parama == d.a.as) {
      a();
    }
    if (isVisible()) {}
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      parama = parama1.g();
      int i1;
      label145:
      int i2;
      label160:
      int i3;
      if (this.h == a.a)
      {
        this.f.a((float)(parama.f() * 0.0977D), (float)(parama.h() * 0.0977D));
        this.g.a((float)(parama.i() * 0.0977D), (float)(parama.g() * 0.0977D));
        if (parama.d() <= 50) {
          break label374;
        }
        i1 = parama.d();
        if (parama.e() <= 50) {
          break label383;
        }
        i2 = parama.e();
        i3 = i1;
        if (i1 >= 992) {
          i3 = 1023;
        }
        i3 = (int)(i3 * 0.0977D);
        if (i2 < 992) {
          break label392;
        }
        i1 = 1023;
        label200:
        i1 = (int)(i1 * 0.0977D);
        parama = this.n;
        if (i3 <= 50) {
          break label399;
        }
        f1 = i3;
        label226:
        parama.setSweep(f1);
        parama = this.o;
        if (i3 >= 50) {
          break label405;
        }
      }
      label374:
      label383:
      label392:
      label399:
      label405:
      for (float f1 = 50 - i3;; f1 = 1.0F)
      {
        parama.setSweep(f1);
        parama = this.p;
        f1 = f3;
        if (i1 > 50) {
          f1 = i1;
        }
        parama.setSweep(f1);
        parama = this.q;
        f1 = f2;
        if (i1 < 50) {
          f1 = 50 - i1;
        }
        parama.setSweep(f1);
        return;
        if (this.h != a.b) {
          break;
        }
        this.g.a((float)(parama.i() * 0.0977D), (float)(parama.h() * 0.0977D));
        this.f.a((float)(parama.f() * 0.0977D), (float)(parama.g() * 0.0977D));
        break;
        i1 = parama.d();
        break label145;
        i2 = parama.e();
        break label160;
        i1 = i2;
        break label200;
        f1 = 51.0F;
        break label226;
      }
    }
    a();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.l.setEnabled(false);
  }
  
  public void onStart()
  {
    super.onStart();
    if (v.a(getActivity()).a().getInt("remodel", 0) == 0)
    {
      this.h = a.b;
      return;
    }
    this.h = a.a;
  }
  
  static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteRollerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */