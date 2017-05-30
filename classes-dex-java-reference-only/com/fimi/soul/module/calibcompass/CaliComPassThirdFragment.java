package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.utils.ao;

public class CaliComPassThirdFragment
  extends BaseCaliCompassFragment
{
  a f;
  private TextView g;
  private TextView h;
  private Button i;
  private boolean j;
  
  private void a(View paramView)
  {
    this.g = ((TextView)paramView.findViewById(2131690327));
    this.g.setText(2131362086);
    this.h = ((TextView)paramView.findViewById(2131689932));
    this.i = ((Button)paramView.findViewById(2131690535));
    this.i.setOnClickListener(this);
    a(this.h, 128);
    ao.a(getActivity().getAssets(), new View[] { this.g, this.h, this.i });
  }
  
  private void a(TextView paramTextView)
  {
    ForegroundColorSpan localForegroundColorSpan1 = new ForegroundColorSpan(getResources().getColor(2131624291));
    ForegroundColorSpan localForegroundColorSpan2 = new ForegroundColorSpan(getResources().getColor(2131624291));
    paramTextView = new SpannableStringBuilder(paramTextView.getText().toString());
    paramTextView.setSpan(localForegroundColorSpan1, 19, 23, 33);
    paramTextView.setSpan(localForegroundColorSpan2, 29, this.h.getText().length(), 33);
    this.h.setText(paramTextView);
    a(this.h, 128);
  }
  
  public void a(TextView paramTextView, int paramInt)
  {
    paramTextView.setTextColor(paramTextView.getTextColors().withAlpha(paramInt));
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.f = ((a)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    }
    do
    {
      return;
    } while (this.e == null);
    this.e.a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968647, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.f = null;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    super.onDroneEvent(parama, parama1);
    if (isVisible()) {
      switch (1.a[parama.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        parama = parama1.i();
        if (this.f != null) {
          this.f.a(true);
        }
      } while ((parama.d() != 2) || (parama.e() != 1) || (parama.b() != 1) || (parama.c() != 2));
      if (this.f != null) {
        this.f.a(false);
      }
      this.j = false;
      parama = this.c.findFragmentByTag("error");
    } while ((parama == null) || (!(parama instanceof CaliCompassErrorFragment)) || (!parama.isHidden()));
    ((CaliCompassErrorFragment)parama).a(getString(2131362017), true, false);
    this.c.beginTransaction().hide(this).show(parama).commitAllowingStateLoss();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean) {
      b.a(getActivity()).a(getString(2131362085));
    }
  }
  
  static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliComPassThirdFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */