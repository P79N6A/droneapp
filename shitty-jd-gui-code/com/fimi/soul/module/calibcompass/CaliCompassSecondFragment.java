package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class CaliCompassSecondFragment
  extends BaseCaliCompassFragment
{
  private TextView f;
  private TextView g;
  private Button h;
  private Button i;
  private Handler j = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      d.a(CaliCompassSecondFragment.this.b).b((byte)1, (byte)1, (byte)3);
    }
  };
  
  private void a(View paramView)
  {
    this.f = ((TextView)paramView.findViewById(2131690327));
    this.f.setText(2131362084);
    this.g = ((TextView)paramView.findViewById(2131689932));
    this.h = ((Button)paramView.findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.i = ((Button)paramView.findViewById(2131689944));
    this.i.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.f, this.g, this.i, this.h });
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    }
    do
    {
      return;
    } while (this.e == null);
    this.e.a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968646, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    super.onDroneEvent(parama, parama1);
    if ((isVisible()) && (parama == d.a.ba))
    {
      parama = parama1.i();
      if ((parama.d() == 2) && (parama.e() == 1) && (parama.b() == 1) && (parama.c() == 1))
      {
        a.a().a("153");
        this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("thrid")).commitAllowingStateLoss();
      }
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean) {
      this.j.sendEmptyMessageDelayed(0, 2000L);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassSecondFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */