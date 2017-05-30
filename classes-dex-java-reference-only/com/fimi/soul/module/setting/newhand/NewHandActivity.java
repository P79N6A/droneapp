package com.fimi.soul.module.setting.newhand;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import com.fimi.soul.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;

public class NewHandActivity
  extends BaseActivity
{
  private NewHandAdapt a;
  private ViewPager b;
  private int c;
  private int d;
  private int e;
  
  public ViewPager a()
  {
    if (this.b == null) {
      this.b = ((ViewPager)findViewById(2131689840));
    }
    return this.b;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968625);
    paramBundle = new ArrayList();
    paramBundle.add(new NewHandStartPagerFragment());
    paramBundle.add(new NewHandOneFragment());
    paramBundle.add(new NewHandTwoFragment());
    paramBundle.add(new NewHandThreeFragment());
    paramBundle.add(new NewHandFourFragment());
    paramBundle.add(new NewHandFiveFragment());
    paramBundle.add(new NewHandSixFragment());
    paramBundle.add(new NewHandSevenFragment());
    this.a = new NewHandAdapt(getSupportFragmentManager(), paramBundle, a());
    a().setAdapter(this.a);
    a().setCurrentItem(0);
    a().setOnPageChangeListener(new ViewPager.OnPageChangeListener()
    {
      public void onPageScrollStateChanged(int paramAnonymousInt)
      {
        Log.i("zhej", "pager:" + paramAnonymousInt);
      }
      
      public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {}
      
      public void onPageSelected(int paramAnonymousInt) {}
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */