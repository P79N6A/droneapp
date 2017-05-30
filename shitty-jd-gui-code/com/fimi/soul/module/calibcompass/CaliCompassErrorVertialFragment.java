package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class CaliCompassErrorVertialFragment
  extends BaseCaliCompassFragment
{
  private TextView f;
  private TextView g;
  private Button h;
  
  private void a(View paramView)
  {
    this.f = ((TextView)paramView.findViewById(2131689628));
    this.g = ((TextView)paramView.findViewById(2131689938));
    this.h = ((Button)paramView.findViewById(2131689940));
    this.h.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.f, this.g, this.h });
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
      return;
    }
    getActivity().finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968643, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */