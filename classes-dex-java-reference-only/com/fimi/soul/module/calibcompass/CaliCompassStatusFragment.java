package com.fimi.soul.module.calibcompass;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class CaliCompassStatusFragment
  extends BaseCaliCompassFragment
{
  private TextView f;
  private TextView g;
  private Button h;
  private Button i;
  private boolean j;
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (!getString(paramInt).toString().equals(this.g.getText().toString())) {
      this.g.setText(paramInt);
    }
    if ((this.i.isEnabled() != paramBoolean) && (paramBoolean)) {
      b.b(getActivity()).a(getString(2131362621));
    }
    this.i.setEnabled(paramBoolean);
    if (paramBoolean)
    {
      a(this.i, 230);
      return;
    }
    a(this.i, 77);
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void a(boolean paramBoolean)
  {
    this.i.setEnabled(paramBoolean);
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131690535: 
      getActivity().finish();
      return;
    }
    d.a(this.b).a((byte)1, (byte)1, (byte)1);
    this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("first")).commitAllowingStateLoss();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968640, null);
    this.f = ((TextView)paramLayoutInflater.findViewById(2131690327));
    this.f.setText(2131362082);
    this.g = ((TextView)paramLayoutInflater.findViewById(2131689932));
    this.h = ((Button)paramLayoutInflater.findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.i = ((Button)paramLayoutInflater.findViewById(2131689933));
    this.i.setOnClickListener(this);
    this.i.setEnabled(false);
    ao.a(getActivity().getAssets(), new View[] { this.h, this.f, this.g });
    if ((!this.b.T().a()) || (this.b.ac()))
    {
      if (this.b.ac())
      {
        a(2131362575, false);
        return paramLayoutInflater;
      }
      a(2131362019, false);
      return paramLayoutInflater;
    }
    if (this.b.ad().aj())
    {
      a(2131362018, false);
      b.b(getActivity()).a(getString(2131362018));
      return paramLayoutInflater;
    }
    a(2131362007, true);
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    super.onDroneEvent(parama, parama1);
    if (isVisible()) {}
    switch (1.a[parama.ordinal()])
    {
    case 2: 
    default: 
    case 1: 
    case 3: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              parama = parama1.i();
            } while ((parama.d() != 2) || (parama.e() != 1) || (parama.b() != 1) || ((parama.c() != 2) && (parama.c() != 3)));
            if (parama.c() != 2) {
              break;
            }
            parama = this.c.findFragmentByTag("error");
          } while ((parama == null) || (!(parama instanceof CaliCompassErrorFragment)) || (parama.isHidden()));
          ((CaliCompassErrorFragment)parama).a(getString(2131362017), true, false);
          this.c.beginTransaction().hide(this).show(parama).commitAllowingStateLoss();
          return;
          this.j = true;
          a(2131362014, false);
          return;
          if ((!parama1.U()) && (this.j)) {
            this.j = false;
          }
        } while (this.j);
        if (!parama1.U())
        {
          a(2131362030, false);
          return;
        }
        if ((parama1.U()) && (parama1.ac()))
        {
          a(2131362575, false);
          return;
        }
      } while (!parama1.U());
      if (parama1.ad().aj())
      {
        a(2131362018, false);
        return;
      }
      a(2131362007, true);
      return;
    }
    a(2131361923, false);
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if ((!paramBoolean) && ((!this.b.T().a()) || (this.b.ac())))
    {
      if (this.b.ac()) {
        a(2131362575, false);
      }
    }
    else {
      return;
    }
    a(2131362019, false);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassStatusFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */