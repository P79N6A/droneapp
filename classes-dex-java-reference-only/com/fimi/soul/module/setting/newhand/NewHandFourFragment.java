package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class NewHandFourFragment
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
  Button l;
  
  private SpannableString a(int paramInt)
  {
    String str = getString(paramInt);
    SpannableString localSpannableString = new SpannableString(str);
    localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131624291)), str.length() - 2, str.length(), 33);
    return localSpannableString;
  }
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968693, null);
  }
  
  protected void a()
  {
    this.c.setText("4");
    this.e.setText(2131361950);
    this.i.setText(2131362481);
    this.j.setText(2131362482);
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
    this.l = ((Button)paramView.findViewById(2131690249));
    this.l.setOnClickListener(this);
    this.k = ((TextView)paramView.findViewById(2131690261));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l });
  }
  
  protected String b()
  {
    return NewHandFourFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.l)
    {
      Log.i("zhej", "current:" + ((NewHandActivity)getActivity()).a().getCurrentItem());
      ((NewHandActivity)getActivity()).a().setCurrentItem(((NewHandActivity)getActivity()).a().getCurrentItem() + 1, true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandFourFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */