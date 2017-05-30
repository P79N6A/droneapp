package com.fimi.soul.module.remote;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class ErrorCaliBretionFragment
  extends BaseRemoteFragment
{
  v f;
  Runnable g = new Runnable()
  {
    public void run()
    {
      ErrorCaliBretionFragment.this.d.m();
      ErrorCaliBretionFragment.this.getActivity().finish();
    }
  };
  private TextView h;
  private Button i;
  private Button j;
  private Button k;
  private Button l;
  private TextView m;
  private TextView n;
  private ImageView o;
  private int p;
  private boolean q;
  
  private void a()
  {
    this.j.setVisibility(0);
    this.k.setVisibility(0);
    this.l.setVisibility(8);
  }
  
  private void b()
  {
    this.j.setVisibility(8);
    this.k.setVisibility(8);
    this.l.setVisibility(0);
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.q = paramBoolean;
    PercentRelativeLayout.LayoutParams localLayoutParams = (PercentRelativeLayout.LayoutParams)this.o.getLayoutParams();
    if (true == paramBoolean)
    {
      this.m.setText(2131362031);
      this.n.setText(2131362026);
      this.n.setVisibility(4);
      localLayoutParams.setMargins(0, (int)(this.p * 0.1111D), 0, 0);
      this.o.setLayoutParams(localLayoutParams);
      this.o.setImageResource(2130838148);
      b();
      return;
    }
    this.m.setText(2131362022);
    this.n.setVisibility(0);
    if ((paramString != null) && (!"".equals(paramString))) {
      this.n.setText(paramString);
    }
    for (;;)
    {
      localLayoutParams.setMargins(0, (int)(this.p * 0.12592D), 0, 0);
      this.o.setLayoutParams(localLayoutParams);
      this.o.setImageResource(2130838146);
      a();
      return;
      this.n.setText(2131362025);
    }
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
    case 2131690535: 
    case 2131689504: 
    case 2131689959: 
      do
      {
        return;
        getActivity().finish();
        return;
        this.d.n();
        this.d.m();
        getActivity().finish();
        return;
      } while (this.e == null);
      this.e.a(2131690534, 2131690532);
      return;
    }
    getActivity().finish();
    new Handler().post(this.g);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new DisplayMetrics();
    getActivity().getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    this.p = paramBundle.heightPixels;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968651, null);
    this.o = ((ImageView)paramLayoutInflater.findViewById(2131689956));
    this.h = ((TextView)paramLayoutInflater.findViewById(2131689748).findViewById(2131690327));
    this.h.setText(2131362026);
    this.i = ((Button)paramLayoutInflater.findViewById(2131689748).findViewById(2131690535));
    this.i.setOnClickListener(this);
    this.j = ((Button)paramLayoutInflater.findViewById(2131689504));
    this.j.setOnClickListener(this);
    this.k = ((Button)paramLayoutInflater.findViewById(2131689959));
    this.k.setOnClickListener(this);
    this.l = ((Button)paramLayoutInflater.findViewById(2131689960));
    this.l.setOnClickListener(this);
    this.m = ((TextView)paramLayoutInflater.findViewById(2131689957));
    this.n = ((TextView)paramLayoutInflater.findViewById(2131689958));
    this.f = new v(getActivity());
    ao.a(getActivity().getAssets(), new View[] { this.h, this.i, this.j, this.k, this.l, this.m, this.n });
    a(this.j, 128);
    a(this.k, 230);
    return paramLayoutInflater;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean)
    {
      if (this.q) {
        b.b(getActivity()).a(getString(2131362031));
      }
    }
    else {
      return;
    }
    b.b(getActivity()).a(getString(2131362012));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/ErrorCaliBretionFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */