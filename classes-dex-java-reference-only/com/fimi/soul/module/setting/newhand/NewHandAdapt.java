package com.fimi.soul.module.setting.newhand;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import java.util.List;

public class NewHandAdapt
  extends FragmentStatePagerAdapter
{
  private List<Fragment> a;
  private Fragment b;
  private FragmentManager c;
  private FragmentTransaction d;
  private ViewPager e;
  private int f;
  
  public NewHandAdapt(FragmentManager paramFragmentManager, List<Fragment> paramList, ViewPager paramViewPager)
  {
    super(paramFragmentManager);
    this.a = paramList;
    this.e = paramViewPager;
    this.c = paramFragmentManager;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    return (Fragment)this.a.get(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandAdapt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */