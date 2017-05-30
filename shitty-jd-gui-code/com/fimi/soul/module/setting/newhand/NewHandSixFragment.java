package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class NewHandSixFragment
  extends BaseNewHandFragment
{
  TextView c;
  TextView d;
  TextView e;
  TextView f;
  TextView g;
  TextView h;
  TextView i;
  TextView j;
  Button k;
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968696, null);
  }
  
  protected void a()
  {
    this.c.setText("6");
    this.e.setText(2131361952);
    this.i.setText(2131362494);
    this.j.setText(2131362496);
    this.k.setOnClickListener(this);
  }
  
  protected void a(View paramView)
  {
    this.c = ((TextView)paramView.findViewById(2131690238));
    this.d = ((TextView)paramView.findViewById(2131690239));
    this.e = ((TextView)paramView.findViewById(2131689753));
    this.f = ((TextView)paramView.findViewById(2131690242));
    this.i = ((TextView)paramView.findViewById(2131690243));
    this.g = ((TextView)paramView.findViewById(2131690246));
    this.j = ((TextView)paramView.findViewById(2131690247));
    this.h = ((TextView)paramView.findViewById(2131690254));
    this.k = ((Button)paramView.findViewById(2131690249));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.j, this.k });
  }
  
  protected String b()
  {
    return NewHandSixFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.k)
    {
      Log.i("zhej", "current:" + ((NewHandActivity)getActivity()).a().getCurrentItem());
      ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandSixFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */