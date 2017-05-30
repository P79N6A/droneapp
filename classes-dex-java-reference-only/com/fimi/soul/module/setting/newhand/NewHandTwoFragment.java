package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class NewHandTwoFragment
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
  TextView k;
  TextView l;
  TextView m;
  Button n;
  LoopWidget o;
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968699, null);
  }
  
  protected void a()
  {
    this.c.setText("2");
    this.e.setText(2131362497);
    this.i.setText(2131362502);
    this.j.setText(2131362504);
    this.k.setText(2131362503);
    this.m.setText(2131362501);
    this.n.setOnClickListener(this);
    this.o.setVisibility(0);
    this.o.setImagesRes(new int[] { 2130838325, 2130838327, 2130838326, 2130838324 });
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
    this.k = ((TextView)paramView.findViewById(2131690255));
    this.n = ((Button)paramView.findViewById(2131690249));
    this.l = ((TextView)paramView.findViewById(2131690260));
    this.m = ((TextView)paramView.findViewById(2131690261));
    this.o = ((LoopWidget)paramView.findViewById(2131690272));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n });
  }
  
  protected String b()
  {
    return NewHandTwoFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.n) {
      ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandTwoFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */