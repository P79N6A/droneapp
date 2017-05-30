package com.fimi.soul.media.gallery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import com.fimi.soul.view.photodraweeview.d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class DroneImagePagerAdapter
  extends FragmentStatePagerAdapter
{
  Map<Integer, DroneImageDetailFragment> a = new Hashtable();
  private ArrayList<String> b;
  private ArrayList<String> c;
  private DroneImageDetailFragment d;
  private d e;
  private ViewPager f;
  
  public DroneImagePagerAdapter(FragmentManager paramFragmentManager, ArrayList<String> paramArrayList)
  {
    super(paramFragmentManager);
    this.b = paramArrayList;
  }
  
  public DroneImagePagerAdapter(FragmentManager paramFragmentManager, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    super(paramFragmentManager);
    this.b = paramArrayList1;
    this.c = paramArrayList2;
  }
  
  public DroneImageDetailFragment a(int paramInt)
  {
    return (DroneImageDetailFragment)this.a.get(Integer.valueOf(paramInt));
  }
  
  public void a(ViewPager paramViewPager)
  {
    this.f = paramViewPager;
  }
  
  public void a(d paramd)
  {
    this.e = paramd;
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    String str = (String)this.b.get(paramInt);
    this.d = new DroneImageDetailFragment();
    this.d.b(str);
    this.d.a(paramInt);
    if (this.e != null) {
      this.d.a(this.e);
    }
    if ((this.c != null) && (this.c.size() > 0))
    {
      str = (String)this.c.get(paramInt);
      this.d.c(str);
    }
    this.a.put(Integer.valueOf(paramInt), this.d);
    return this.d;
  }
  
  public int getItemPosition(Object paramObject)
  {
    if ((paramObject != null) && (((DroneImageDetailFragment)paramObject).a() == this.f.getCurrentItem())) {
      return -2;
    }
    return super.getItemPosition(paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/DroneImagePagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */