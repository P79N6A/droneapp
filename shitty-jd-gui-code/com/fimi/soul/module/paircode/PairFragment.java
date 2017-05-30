package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.utils.ao;

public class PairFragment
  extends Fragment
  implements View.OnClickListener, d.b, a
{
  public static final int a = 2;
  public static final int b = 16;
  View c;
  private RelativeLayout d;
  private RelativeLayout e;
  private RelativeLayout f;
  private TextView g;
  private PairCodeActivity h;
  
  private void a()
  {
    Object localObject = new t();
    ((t)localObject).a((byte)8);
    ((t)localObject).a(d.a().k());
    this.h.drone.T().a(((t)localObject).a());
    localObject = this.h;
    PairCodeActivity.a = true;
  }
  
  private void a(a parama)
  {
    this.d.setVisibility(8);
    this.e.setVisibility(8);
    this.f.setVisibility(8);
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.d.setVisibility(0);
      return;
    case 2: 
      this.e.setVisibility(0);
      return;
    }
    this.f.setVisibility(0);
    ((Button)this.c.findViewById(2131690513)).setOnClickListener(this);
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 16: 
      if (this.h.drone.ac())
      {
        a(a.a);
        return;
      }
      a(a.c);
      return;
    }
    a(a.b);
  }
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.h = ((PairCodeActivity)paramActivity);
    this.h.a(this);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
    } while (!this.h.drone.T().a());
    a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramLayoutInflater.inflate(2130968760, null);
    this.d = ((RelativeLayout)this.c.findViewById(2131690599));
    this.e = ((RelativeLayout)this.c.findViewById(2131690593));
    this.f = ((RelativeLayout)this.c.findViewById(2131690510));
    this.g = ((TextView)this.c.findViewById(2131690511));
    return this.c;
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if ((parama1.U()) && (parama1.T().a())) {}
    switch (1.b[parama.ordinal()])
    {
    default: 
      return;
    }
    if (parama1.ac())
    {
      a(a.a);
      return;
    }
    a(a.c);
  }
  
  public void onResume()
  {
    super.onResume();
    if (d.a().k()) {
      this.g.setText(getString(2131362562));
    }
    for (;;)
    {
      ao.a(this.h.getAssets(), new View[] { this.g });
      if (!this.h.drone.T().a()) {
        break label110;
      }
      if (!this.h.drone.ac()) {
        break;
      }
      a(a.a);
      return;
      this.g.setText(getString(2131362561));
    }
    a(a.c);
    return;
    label110:
    a(a.b);
  }
  
  public void onStart()
  {
    super.onStart();
    this.h.drone.a(this);
  }
  
  public void onStop()
  {
    super.onStop();
    this.h.drone.b(this);
  }
  
  static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/paircode/PairFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */