package com.fimi.soul.module.remote;

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

public class BaseRemoteFragment
  extends Fragment
  implements View.OnClickListener, d.b
{
  protected Context a;
  protected a b;
  protected FragmentManager c;
  protected d d;
  protected a e;
  
  protected void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    if ((this.c.findFragmentById(2131690534).isHidden()) && (this.e != null)) {
      this.e.a(paramInt1, paramInt2, paramString, paramBoolean);
    }
  }
  
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
  
  public void onDestroy()
  {
    super.onDestroy();
    this.b.b(this);
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
  }
  
  protected static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(int paramInt1, int paramInt2);
    
    public abstract void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/BaseRemoteFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */