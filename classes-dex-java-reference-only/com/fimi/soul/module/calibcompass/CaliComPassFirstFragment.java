package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;

public class CaliComPassFirstFragment
  extends BaseCaliCompassFragment
{
  a f;
  private TextView g;
  private TextView h;
  private Button i;
  private boolean j;
  private boolean k;
  private Handler l = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      CaliComPassFirstFragment.a(CaliComPassFirstFragment.this, true);
    }
  };
  private boolean m;
  private boolean n;
  
  private void a(View paramView)
  {
    this.g = ((TextView)paramView.findViewById(2131690327));
    this.g.setText(2131362084);
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
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramTextView.getText().toString());
    localSpannableStringBuilder.setSpan(localForegroundColorSpan1, 19, 21, 33);
    localSpannableStringBuilder.setSpan(localForegroundColorSpan2, 27, paramTextView.getText().length(), 33);
    paramTextView.setText(localSpannableStringBuilder);
    a(paramTextView, 128);
  }
  
  public void a(TextView paramTextView, int paramInt)
  {
    paramTextView.setTextColor(paramTextView.getTextColors().withAlpha(paramInt));
  }
  
  public void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
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
    paramLayoutInflater = paramLayoutInflater.inflate(2130968644, null);
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
      switch (2.a[parama.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          parama = parama1.i();
        } while (!this.m);
        if ((this.k) && (parama.d() == 1) && (parama.e() == 1) && (parama.b() == 1) && (parama.c() == 2))
        {
          this.k = false;
          this.n = true;
          d.a(parama1).b((byte)1, (byte)1, (byte)3);
          return;
        }
        if ((parama.d() != 1) || (parama.e() != 1) || (parama.b() != 0) || (parama.c() != 1)) {
          break;
        }
        parama = this.c.findFragmentByTag("error");
      } while ((parama == null) || (!(parama instanceof CaliCompassErrorFragment)) || (!parama.isHidden()));
      ((CaliCompassErrorFragment)parama).a(getString(2131362622), false, false);
      this.c.beginTransaction().hide(this).show(parama).commitAllowingStateLoss();
      return;
      if ((this.n) && (parama.d() == 2) && (parama.e() == 1) && (parama.b() == 1) && (parama.c() == 1))
      {
        this.n = false;
        this.j = false;
        this.c.beginTransaction().hide(this).show(this.c.findFragmentByTag("thrid")).setCustomAnimations(17432578, 17432579).commitAllowingStateLoss();
        return;
      }
    } while ((parama.d() != 1) || (parama.e() != 1) || (parama.b() != 1) || (parama.c() != 1) || (this.j));
    this.j = true;
    this.n = true;
    b.b(getActivity()).a(getString(2131362083));
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean)
    {
      this.j = false;
      this.l.sendEmptyMessageDelayed(0, 2000L);
    }
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  static abstract interface a
  {
    public abstract void b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliComPassFirstFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */