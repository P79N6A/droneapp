package com.fimi.soul.module.remote;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class RemoteBeginMidCaFragment
  extends BaseRemoteFragment
{
  public DroidPlannerApp f;
  a g;
  private TextView h;
  private Button i;
  private Button j;
  private MidView k;
  private MidView l;
  private a m;
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.f = ((DroidPlannerApp)paramActivity.getApplication());
    this.m = this.f.a;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if (!this.m.T().a())
    {
      z.a(this.a, this.a.getString(2131362010), z.b);
      return;
    }
    if (this.m.U())
    {
      z.a(this.a, this.a.getString(2131362075), z.b);
      return;
    }
    this.d.l();
    this.c.beginTransaction().hide(this.c.findFragmentById(2131690528)).commit();
    this.c.beginTransaction().show(this.c.findFragmentById(2131690529)).commit();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968641, null);
    this.h = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.h.setText(2131362024);
    this.j = ((Button)paramLayoutInflater.findViewById(2131690033).findViewById(2131689874));
    this.k = ((MidView)paramLayoutInflater.findViewById(2131689934));
    this.l = ((MidView)paramLayoutInflater.findViewById(2131689935));
    this.i = ((Button)paramLayoutInflater.findViewById(2131689936));
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.h, this.j, this.i });
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    if (isVisible()) {
      switch (1.a[parama.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (!isVisible());
      parama = parama1.g();
      if (this.g == a.a)
      {
        this.l.a((float)(parama.f() * 0.0977D), (float)(parama.h() * 0.0977D));
        this.k.a((float)(parama.i() * 0.0977D), (float)(parama.g() * 0.0977D));
        return;
      }
    } while (this.g != a.b);
    this.k.a((float)(parama.i() * 0.0977D), (float)(parama.h() * 0.0977D));
    this.l.a((float)(parama.f() * 0.0977D), (float)(parama.g() * 0.0977D));
  }
  
  public void onStart()
  {
    super.onStart();
    if (v.a(getActivity()).a().getInt("remodel", 0) == 0)
    {
      this.g = a.b;
      return;
    }
    this.g = a.a;
  }
  
  static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteBeginMidCaFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */