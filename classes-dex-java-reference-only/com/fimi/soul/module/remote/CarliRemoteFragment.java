package com.fimi.soul.module.remote;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class CarliRemoteFragment
  extends BaseRemoteFragment
{
  a f;
  private Button g;
  private Button h;
  private TextView i;
  private TextView j;
  private TextView k;
  private MidView l;
  private MidView m;
  
  public void a()
  {
    a(2131690531, 2131690534, getString(2131362625), false);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
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
        this.d.o();
      } while (this.e == null);
      this.e.a(2131690531, 2131690533);
      return;
    } while ((!isVisible()) || (this.e == null));
    this.e.a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968650, null);
    this.k = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.k.setText(2131362024);
    this.h = ((Button)paramLayoutInflater.findViewById(2131689748).findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.l = ((MidView)paramLayoutInflater.findViewById(2131689954).findViewById(2131689937));
    this.m = ((MidView)paramLayoutInflater.findViewById(2131689955).findViewById(2131689937));
    this.i = ((TextView)paramLayoutInflater.findViewById(2131689932));
    this.j = ((TextView)paramLayoutInflater.findViewById(2131689953));
    this.g = ((Button)paramLayoutInflater.findViewById(2131689936));
    this.g.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.g, this.i, this.j, this.k });
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    if (isVisible()) {
      switch (1.a[parama.ordinal()])
      {
      }
    }
    for (;;)
    {
      return;
      parama1.b(this);
      return;
      if (isVisible())
      {
        parama = parama1.g();
        if (this.f != a.b) {
          break label163;
        }
        this.m.a((float)(parama.i() * 0.0977D), (float)(parama.h() * 0.0977D));
        this.l.a((float)(parama.f() * 0.0977D), (float)(parama.g() * 0.0977D));
      }
      while ((parama1.L().c() == 3) && ((parama1.L().b() == 86) || (parama1.L().b() == 85)))
      {
        a();
        return;
        label163:
        if (this.f == a.a)
        {
          this.m.a((float)(parama.i() * 0.0977D), (float)(parama.g() * 0.0977D));
          this.l.a((float)(parama.f() * 0.0977D), (float)(parama.h() * 0.0977D));
        }
      }
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if ((!paramBoolean) && (isVisible())) {
      b.b(getActivity()).a(getString(2131362029));
    }
  }
  
  public void onStart()
  {
    super.onStart();
    if (v.a(getActivity()).a().getInt("remodel", 0) == 0)
    {
      this.f = a.b;
      return;
    }
    this.f = a.a;
  }
  
  static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/CarliRemoteFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */