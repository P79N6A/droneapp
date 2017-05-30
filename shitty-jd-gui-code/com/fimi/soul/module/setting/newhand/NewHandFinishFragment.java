package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public class NewHandFinishFragment
  extends BaseNewHandFragment
{
  TextView c;
  TextView d;
  Button e;
  Button f;
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    return paramLayoutInflater.inflate(2130968691, null);
  }
  
  protected void a() {}
  
  protected void a(View paramView)
  {
    this.c = ((TextView)paramView.findViewById(2131690232));
    this.d = ((TextView)paramView.findViewById(2131690233));
    this.e = ((Button)paramView.findViewById(2131690234));
    this.e.setOnClickListener(this);
    this.f = ((Button)paramView.findViewById(2131690235));
    this.f.setOnClickListener(this);
    ao.a(this.a.getAssets(), new View[] { this.c, this.d, this.e, this.f });
  }
  
  protected String b()
  {
    return NewHandFiveFragment.class.getName().toLowerCase();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView == this.e)
    {
      NewHandOneFragment localNewHandOneFragment = new NewHandOneFragment();
      this.b.beginTransaction().replace(2131689841, localNewHandOneFragment, localNewHandOneFragment.b()).commitAllowingStateLoss();
    }
    if (paramView == this.f)
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/NewHandFinishFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */