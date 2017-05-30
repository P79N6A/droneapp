package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class PairErrorFragment
  extends Fragment
  implements View.OnClickListener
{
  PairCodeActivity a;
  Button b;
  View c;
  private TextView d;
  private TextView e;
  
  private void a(View paramView)
  {
    this.d = ((TextView)paramView.findViewById(2131690450));
    this.e = ((TextView)paramView.findViewById(2131690451));
    this.b = ((Button)paramView.findViewById(2131690452));
    ao.a(this.a.getAssets(), new View[] { this.e, this.d, this.b });
    this.b.setOnClickListener(this);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.a = ((PairCodeActivity)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    this.a.finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramLayoutInflater.inflate(2130968756, null);
    a(this.c);
    return this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/paircode/PairErrorFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */