package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.utils.ao;

public class RemoteEndCaliFragment
  extends BaseRemoteFragment
{
  private Button f;
  private TextView g;
  private Button h;
  private Handler i = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (RemoteEndCaliFragment.this.e != null) {
        RemoteEndCaliFragment.this.e.a(2131690530, 2131690531);
      }
    }
  };
  
  public void a()
  {
    a(2131690530, 2131690534, getString(2131362625), false);
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
      return;
    } while ((!isVisible()) || (this.e == null));
    this.e.a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968673, null);
    this.g = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.g.setText(2131362024);
    this.h = ((Button)paramLayoutInflater.findViewById(2131689748).findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.f = ((Button)paramLayoutInflater.findViewById(2131689936));
    this.f.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.g, this.h, this.f });
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if (isVisible()) {
      switch (2.a[parama.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        parama1.b(this);
        return;
      } while (!isVisible());
      com.fimi.soul.module.calibcompass.a.a().a("98");
    } while ((parama1.L().c() != 3) || (parama1.L().b() != 86));
    a();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean) {
      this.i.sendEmptyMessageDelayed(0, 2000L);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteEndCaliFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */