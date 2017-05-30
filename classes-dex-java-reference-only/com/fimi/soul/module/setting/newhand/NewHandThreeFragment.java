package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class NewHandThreeFragment
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
  private ImageView o;
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968698, null);
  }
  
  protected void a()
  {
    this.c.setText("3");
    this.e.setText(2131362477);
    this.i.setText(2131362498);
    this.j.setText(2131362500);
    this.k.setText(2131362499);
    this.n.setOnClickListener(this);
  }
  
  protected void a(View paramView)
  {
    this.o = ((ImageView)paramView.findViewById(2131690269));
    this.o.setBackgroundResource(2130838331);
    ((AnimationDrawable)this.o.getBackground()).start();
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
    this.l = ((TextView)paramView.findViewById(2131690267));
    this.m = ((TextView)paramView.findViewById(2131690270));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.n, this.l, this.m });
  }
  
  protected String b()
  {
    return NewHandThreeFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.n)
    {
      Log.i("zhej", "current:" + ((NewHandActivity)getActivity()).a().getCurrentItem());
      ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandThreeFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */