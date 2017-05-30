package com.fimi.soul.module.remote;

import android.app.Activity;
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
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.MidView;

public class RemoteMidCalibrationFragment
  extends BaseRemoteFragment
{
  a f;
  private PercentRelativeLayout g;
  private Button h;
  private Button i;
  private TextView j;
  private TextView k;
  private TextView l;
  private MidView m;
  private MidView n;
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131690535: 
      this.d.m();
      getActivity().finish();
      return;
    }
    this.c.beginTransaction().hide(this.c.findFragmentById(2131690527)).commit();
    this.c.beginTransaction().show(this.c.findFragmentById(2131690532)).commit();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968732, null);
    this.g = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131689748));
    this.m = ((MidView)paramLayoutInflater.findViewById(2131690403));
    this.n = ((MidView)paramLayoutInflater.findViewById(2131689937));
    this.k = ((TextView)paramLayoutInflater.findViewById(2131689932));
    this.l = ((TextView)paramLayoutInflater.findViewById(2131689953));
    this.h = ((Button)this.g.findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.j = ((TextView)this.g.findViewById(2131690327));
    this.j.setText(2131362013);
    this.i = ((Button)paramLayoutInflater.findViewById(2131689936));
    this.i.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.j, this.i, this.k, this.l });
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
      return;
      parama = parama1.g();
      if (this.f == a.a)
      {
        this.m.a((float)(parama.f() * 0.0977D), (float)(parama.h() * 0.0977D));
        this.n.a((float)(parama.i() * 0.0977D), (float)(parama.g() * 0.0977D));
        return;
      }
    } while (this.f != a.b);
    this.n.a((float)(parama.i() * 0.0977D), (float)(parama.h() * 0.0977D));
    this.m.a((float)(parama.f() * 0.0977D), (float)(parama.g() * 0.0977D));
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteMidCalibrationFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */