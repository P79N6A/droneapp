package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import java.util.Timer;

public class NewHandOneFragment
  extends BaseNewHandFragment
{
  private static a n;
  TextView c;
  TextView d;
  TextView e;
  TextView f;
  TextView g;
  TextView h;
  TextView i;
  TextView j;
  TextView k;
  Button l;
  private ImageView m;
  private boolean o = false;
  private Timer p;
  private AnimationDrawable q = null;
  
  public static NewHandOneFragment a(a parama)
  {
    n = parama;
    return new NewHandOneFragment();
  }
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968694, null);
  }
  
  protected void a()
  {
    this.c.setText("1");
    this.e.setText(2131362485);
    this.j.setText(2131362489);
    this.k.setText(2131362488);
    this.l.setText(2131362486);
    this.l.setOnClickListener(this);
  }
  
  protected void a(View paramView)
  {
    this.m = ((ImageView)paramView.findViewById(2131690257));
    this.m.setBackgroundResource(2130838214);
    this.c = ((TextView)paramView.findViewById(2131690238));
    this.d = ((TextView)paramView.findViewById(2131690239));
    this.e = ((TextView)paramView.findViewById(2131689753));
    this.f = ((TextView)paramView.findViewById(2131690242));
    this.g = ((TextView)paramView.findViewById(2131690246));
    this.j = ((TextView)paramView.findViewById(2131690247));
    this.h = ((TextView)paramView.findViewById(2131690254));
    this.k = ((TextView)paramView.findViewById(2131690255));
    this.l = ((Button)paramView.findViewById(2131690249));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.j, this.k, this.l });
  }
  
  protected String b()
  {
    return NewHandOneFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.l) {
      ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandOneFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */