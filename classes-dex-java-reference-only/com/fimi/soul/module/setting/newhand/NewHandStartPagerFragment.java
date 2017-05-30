package com.fimi.soul.module.setting.newhand;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class NewHandStartPagerFragment
  extends BaseNewHandFragment
{
  private TextView c;
  private TextView d;
  private Button e;
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968697, null);
  }
  
  protected void a() {}
  
  protected void a(View paramView)
  {
    this.c = ((TextView)paramView.findViewById(2131690263));
    this.d = ((TextView)paramView.findViewById(2131690264));
    this.e = ((Button)paramView.findViewById(2131690265));
    this.e.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.c, this.d, this.e });
  }
  
  protected String b()
  {
    return null;
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
      return;
    }
    Log.i("zhej", "current:" + ((NewHandActivity)getActivity()).a().getCurrentItem());
    ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandStartPagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */