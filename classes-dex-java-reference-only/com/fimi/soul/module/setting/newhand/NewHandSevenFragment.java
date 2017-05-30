package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class NewHandSevenFragment
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
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968695, null);
  }
  
  protected void a()
  {
    this.c.setText("7");
    this.e.setText(2131362593);
    this.i.setText(2131362491);
    this.j.setText(2131362493);
    this.k.setText(2131362492);
    this.m.setText(2131362490);
    this.n.setOnClickListener(this);
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
    this.l = ((TextView)paramView.findViewById(2131690260));
    this.m = ((TextView)paramView.findViewById(2131690261));
    this.n = ((Button)paramView.findViewById(2131690249));
    ao.b(this.a.getAssets(), new View[] { this.c, this.d });
    ao.a(this.a.getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.n, this.l, this.m });
  }
  
  protected String b()
  {
    return NewHandSevenFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.n)
    {
      c.c().a("sp_new_hand", true);
      if (!c.c().d("is_setting_enter"))
      {
        startActivity(new Intent(getActivity(), FlightActivity.class));
        getActivity().finish();
      }
    }
    else
    {
      return;
    }
    getActivity().finish();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandSevenFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */