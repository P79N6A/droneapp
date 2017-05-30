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
import com.fimi.kernel.d.b;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.RemoteRollerView;

public class WhellRemoteFragment
  extends BaseRemoteFragment
{
  private TextView f;
  private TextView g;
  private TextView h;
  private Button i;
  private Button j;
  private RemoteRollerView k;
  private RemoteRollerView l;
  private RemoteRollerView m;
  private RemoteRollerView n;
  private boolean o;
  private final int p = 1;
  private Handler q = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (!WhellRemoteFragment.a(WhellRemoteFragment.this)) {
        b.b(WhellRemoteFragment.this.getActivity()).a(WhellRemoteFragment.this.getString(2131362032));
      }
    }
  };
  
  public void a(boolean paramBoolean, String paramString)
  {
    if (this.q.hasMessages(1)) {
      this.q.removeMessages(1);
    }
    if (paramBoolean)
    {
      a(2131690533, 2131690534, "", paramBoolean);
      return;
    }
    a(2131690533, 2131690534, paramString, paramBoolean);
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
    }
    do
    {
      return;
      this.d.p();
      return;
    } while ((!isVisible()) || (this.e == null));
    this.e.a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968806, null);
    this.h = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.h.setText(2131362024);
    this.j = ((Button)paramLayoutInflater.findViewById(2131689748).findViewById(2131690535));
    this.j.setOnClickListener(this);
    this.f = ((TextView)paramLayoutInflater.findViewById(2131689932));
    this.g = ((TextView)paramLayoutInflater.findViewById(2131689953));
    this.i = ((Button)paramLayoutInflater.findViewById(2131689936));
    this.i.setOnClickListener(this);
    this.k = ((RemoteRollerView)paramLayoutInflater.findViewById(2131690273));
    this.l = ((RemoteRollerView)paramLayoutInflater.findViewById(2131690275));
    this.m = ((RemoteRollerView)paramLayoutInflater.findViewById(2131690274));
    this.n = ((RemoteRollerView)paramLayoutInflater.findViewById(2131690276));
    this.k.setInitView(0);
    this.l.setInitView(1);
    this.m.setInitView(2);
    this.n.setInitView(3);
    this.k.setSweep(51.0F);
    this.l.setSweep(1.0F);
    this.m.setSweep(51.0F);
    this.n.setSweep(1.0F);
    ao.a(getActivity().getAssets(), new View[] { this.i, this.f, this.g });
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    super.onDroneEvent(parama, parama1);
    if (isVisible()) {}
    switch (2.a[parama.ordinal()])
    {
    default: 
    case 1: 
    case 2: 
      do
      {
        return;
        parama1.b(this);
        return;
        com.fimi.soul.module.calibcompass.a.a().a("98");
        if ((parama1.L().b() == 86) && (parama1.L().c() == 2) && (parama1.L().d() == 1))
        {
          a(true, "");
          return;
        }
        if ((parama1.L().c() >= 2) && (parama1.L().b() == 85) && (parama1.L().d() == 2))
        {
          this.o = true;
          a(false, getString(2131362626));
          return;
        }
        if ((parama1.L().c() >= 2) && (parama1.L().b() == 86) && (parama1.L().d() == 2))
        {
          this.o = true;
          a(false, getString(2131362627));
          return;
        }
      } while ((parama1.L().c() != 3) || (parama1.L().b() != 86));
      a(false, getString(2131362625));
      return;
    }
    parama = parama1.g();
    int i1;
    int i2;
    if (parama.d() > 50)
    {
      i1 = parama.d();
      if (parama.e() <= 50) {
        break label427;
      }
      i2 = parama.e();
      label277:
      int i3 = i1;
      if (i1 >= 992) {
        i3 = 1023;
      }
      i3 = (int)(i3 * 0.0977D);
      if (i2 < 992) {
        break label436;
      }
      i1 = 1023;
      label317:
      i1 = (int)(i1 * 0.0977D);
      parama = this.k;
      if (i3 <= 50) {
        break label443;
      }
      f1 = i3;
      label343:
      parama.setSweep(f1);
      parama = this.l;
      if (i3 >= 50) {
        break label449;
      }
      f1 = 50 - i3;
      label367:
      parama.setSweep(f1);
      parama = this.m;
      if (i1 <= 50) {
        break label454;
      }
      f1 = i1;
      label388:
      parama.setSweep(f1);
      parama = this.n;
      if (i1 >= 50) {
        break label460;
      }
    }
    label427:
    label436:
    label443:
    label449:
    label454:
    label460:
    for (float f1 = 50 - i1;; f1 = 1.0F)
    {
      parama.setSweep(f1);
      return;
      i1 = parama.d();
      break;
      i2 = parama.e();
      break label277;
      i1 = i2;
      break label317;
      f1 = 51.0F;
      break label343;
      f1 = 1.0F;
      break label367;
      f1 = 51.0F;
      break label388;
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean)
    {
      this.q.sendEmptyMessageDelayed(1, 2000L);
      return;
    }
    this.o = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/WhellRemoteFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */