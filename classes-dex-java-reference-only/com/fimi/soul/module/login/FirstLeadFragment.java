package com.fimi.soul.module.login;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.utils.ao;

public class FirstLeadFragment
  extends Fragment
  implements View.OnClickListener
{
  private static final int k = 1;
  private static final int l = 2;
  private static final int m = 3;
  private static final int n = 4;
  private static final int o = 5;
  private static final int p = 6;
  private static final int q = 7;
  private static final int r = 8;
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  RelativeLayout a;
  RelativeLayout b;
  RelativeLayout c;
  RelativeLayout d;
  RelativeLayout e;
  RelativeLayout f;
  RelativeLayout g;
  RelativeLayout h;
  PercentRelativeLayout i;
  a j;
  private int s = 1;
  private v t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  public a a()
  {
    return this.j;
  }
  
  void a(int paramInt)
  {
    this.a.setVisibility(8);
    this.b.setVisibility(8);
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.e.setVisibility(8);
    this.g.setVisibility(8);
    this.f.setVisibility(8);
    this.h.setVisibility(8);
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.b.setVisibility(0);
      return;
    case 2: 
      this.f.setVisibility(0);
      return;
    case 3: 
      this.g.setVisibility(0);
      return;
    case 4: 
      this.e.setVisibility(0);
      return;
    case 5: 
      this.d.setVisibility(0);
      return;
    case 6: 
      this.c.setVisibility(0);
      return;
    case 7: 
      this.a.setVisibility(0);
      return;
    }
    this.h.setVisibility(0);
  }
  
  void a(View paramView)
  {
    this.i = ((PercentRelativeLayout)paramView.findViewById(2131689841));
    this.a = ((RelativeLayout)paramView.findViewById(2131690379));
    this.b = ((RelativeLayout)paramView.findViewById(2131690359));
    this.c = ((RelativeLayout)paramView.findViewById(2131690367));
    this.d = ((RelativeLayout)paramView.findViewById(2131690371));
    this.e = ((RelativeLayout)paramView.findViewById(2131690363));
    this.f = ((RelativeLayout)paramView.findViewById(2131690383));
    this.g = ((RelativeLayout)paramView.findViewById(2131690375));
    this.h = ((RelativeLayout)paramView.findViewById(2131690387));
    this.C = ((TextView)paramView.findViewById(2131690362));
    this.D = ((TextView)paramView.findViewById(2131690382));
    this.E = ((TextView)paramView.findViewById(2131690386));
    this.F = ((TextView)paramView.findViewById(2131690378));
    this.G = ((TextView)paramView.findViewById(2131690366));
    this.H = ((TextView)paramView.findViewById(2131690374));
    this.J = ((TextView)paramView.findViewById(2131690390));
    this.u = ((TextView)paramView.findViewById(2131690361));
    this.v = ((TextView)paramView.findViewById(2131690381));
    this.w = ((TextView)paramView.findViewById(2131690385));
    this.x = ((TextView)paramView.findViewById(2131690377));
    this.y = ((TextView)paramView.findViewById(2131690365));
    this.z = ((TextView)paramView.findViewById(2131690373));
    this.B = ((TextView)paramView.findViewById(2131690389));
    ao.a(getActivity().getAssets(), new View[] { this.C, this.E, this.D, this.H, this.F, this.I, this.G, this.E, this.J, this.u, this.w, this.v, this.z, this.x, this.A, this.y, this.w, this.B });
    this.i.setOnClickListener(this);
  }
  
  public void a(a parama)
  {
    this.j = parama;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    for (;;)
    {
      a(this.s);
      this.t.a().edit().putInt("curModel", this.s).commit();
      return;
      this.s = 8;
      continue;
      this.s = 2;
      continue;
      this.s = 6;
      continue;
      this.s = 7;
      continue;
      this.s = 5;
      continue;
      this.s = 3;
      continue;
      this.s = 4;
      continue;
      if (this.j != null)
      {
        this.j.k();
        continue;
        switch (this.s)
        {
        default: 
          break;
        case 1: 
          this.s = 2;
          break;
        case 2: 
          this.s = 3;
          break;
        case 3: 
          this.s = 4;
          break;
        case 4: 
          this.s = 5;
          break;
        case 5: 
          this.s = 6;
          break;
        case 6: 
          this.s = 7;
          break;
        case 7: 
          this.s = 8;
          break;
        case 8: 
          if (this.j != null) {
            this.j.k();
          }
          break;
        }
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = View.inflate(getActivity(), 2130968726, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    this.t = v.a(getActivity());
    this.s = this.t.a().getInt("curModel", 1);
    a(this.s);
  }
  
  public static abstract interface a
  {
    public abstract void k();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/login/FirstLeadFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */