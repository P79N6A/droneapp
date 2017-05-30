package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;

public class BaseCaliCompassFragment
  extends Fragment
  implements View.OnClickListener, d.b
{
  protected Context a;
  protected a b;
  protected FragmentManager c;
  protected d d;
  protected a e;
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.e = ((a)paramActivity);
    this.a = paramActivity.getApplicationContext();
    this.b = ((DroidPlannerApp)paramActivity.getApplication()).a;
    this.c = getFragmentManager();
    this.d = d.a(this.b);
  }
  
  public void onClick(View paramView) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDetach()
  {
    super.onDetach();
    if (this.e != null) {
      this.e = null;
    }
  }
  
  public void onDroneEvent(d.a parama, a parama1) {}
  
  public void onStart()
  {
    super.onStart();
    this.b.a(this);
  }
  
  public void onStop()
  {
    super.onStop();
    this.b.b(this);
  }
  
  protected static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/BaseCaliCompassFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */