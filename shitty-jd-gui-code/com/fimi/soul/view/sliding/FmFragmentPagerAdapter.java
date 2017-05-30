package com.fimi.soul.view.sliding;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class FmFragmentPagerAdapter
  extends FragmentPagerAdapter
{
  private ArrayList<Fragment> a = null;
  
  public FmFragmentPagerAdapter(FragmentManager paramFragmentManager, ArrayList<Fragment> paramArrayList)
  {
    super(paramFragmentManager);
    this.a = paramArrayList;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    if (paramInt < this.a.size()) {
      return (Fragment)this.a.get(paramInt);
    }
    return (Fragment)this.a.get(0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/sliding/FmFragmentPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */