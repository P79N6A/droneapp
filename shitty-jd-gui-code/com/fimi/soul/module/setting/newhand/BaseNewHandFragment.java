package com.fimi.soul.module.setting.newhand;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;

public abstract class BaseNewHandFragment
  extends Fragment
  implements View.OnClickListener
{
  protected Context a;
  protected FragmentManager b;
  private TextView c;
  
  protected abstract View a(LayoutInflater paramLayoutInflater);
  
  protected abstract void a();
  
  protected abstract void a(View paramView);
  
  protected abstract String b();
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.a = paramActivity.getApplicationContext();
    this.b = getFragmentManager();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    c.c().a("sp_new_hand", true);
    if (!c.c().d("is_setting_enter"))
    {
      startActivity(new Intent(getActivity(), FlightActivity.class));
      getActivity().finish();
      return;
    }
    getActivity().finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramLayoutInflater = a(paramLayoutInflater);
    a(paramLayoutInflater);
    a();
    this.c = ((TextView)paramLayoutInflater.findViewById(2131690250));
    this.c.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.c });
    return paramLayoutInflater;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/BaseNewHandFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */