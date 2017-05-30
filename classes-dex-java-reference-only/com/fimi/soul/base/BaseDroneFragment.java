package com.fimi.soul.base;

import android.app.Activity;
import com.fimi.kernel.BaseFragment;
import com.fimi.soul.drone.a;

public abstract class BaseDroneFragment
  extends BaseFragment
{
  private DroidPlannerApp a;
  
  public DroidPlannerApp d()
  {
    return this.a;
  }
  
  protected a e()
  {
    return d().a;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.a = ((DroidPlannerApp)paramActivity.getApplication());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/BaseDroneFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */