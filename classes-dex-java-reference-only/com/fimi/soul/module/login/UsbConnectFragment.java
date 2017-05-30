package com.fimi.soul.module.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.a.b;

public class UsbConnectFragment
  extends Fragment
  implements Handler.Callback, View.OnClickListener
{
  WifiManager a;
  private TextView b;
  private TextView c;
  private RelativeLayout d;
  private RelativeLayout e;
  private RelativeLayout f;
  private RelativeLayout g;
  private RelativeLayout h;
  private Context i;
  private Button j;
  private Button k;
  private Button l;
  private a m;
  private Handler n;
  private com.fimi.soul.drone.a o;
  private int p = 100;
  
  private void a()
  {
    a.b localb = new a.b(getActivity());
    localb.a(getString(2131362309), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (com.fimi.soul.biz.a.a.a().b() == 1)
        {
          if ((UsbConnectFragment.this.getActivity() != null) && (Build.VERSION.SDK_INT < 24) && (ao.i(UsbConnectFragment.this.getActivity()).booleanValue()))
          {
            UsbConnectFragment.g(UsbConnectFragment.this);
            UsbConnectFragment.h(UsbConnectFragment.this).b();
          }
          do
          {
            return;
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClassName("com.android.settings", "com.android.settings.TetherSettings");
          } while (UsbConnectFragment.this.getActivity() == null);
          UsbConnectFragment.this.startActivityForResult(paramAnonymousDialogInterface, 0);
          return;
        }
        if (UsbConnectFragment.i(UsbConnectFragment.this).T().a())
        {
          UsbConnectFragment.j(UsbConnectFragment.this).sendMessageDelayed(Message.obtain(), 300L);
          return;
        }
        if (!UsbConnectFragment.this.a.isWifiEnabled()) {
          UsbConnectFragment.this.a.setWifiEnabled(true);
        }
        paramAnonymousDialogInterface = new Intent("android.settings.WIFI_SETTINGS");
        UsbConnectFragment.this.startActivityForResult(paramAnonymousDialogInterface, UsbConnectFragment.k(UsbConnectFragment.this));
      }
    });
    localb.a().show();
  }
  
  private void a(View paramView)
  {
    TextView localTextView1 = (TextView)paramView.findViewById(2131690281);
    TextView localTextView2 = (TextView)paramView.findViewById(2131690284);
    TextView localTextView3 = (TextView)paramView.findViewById(2131690288);
    TextView localTextView4 = (TextView)paramView.findViewById(2131690292);
    TextView localTextView5 = (TextView)paramView.findViewById(2131690285);
    paramView = (TextView)paramView.findViewById(2131690289);
    ao.a(this.i.getAssets(), new View[] { localTextView1, localTextView2, localTextView3, localTextView4, localTextView5, paramView, this.j, this.k, this.b });
  }
  
  private void b()
  {
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.b, "translationX", new float[] { 0.0F, 1000.0F });
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.d, "translationX", new float[] { 0.0F, 1000.0F });
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.e, "translationX", new float[] { 0.0F, 1000.0F });
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.f, "translationX", new float[] { 0.0F, 1000.0F });
    ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(this.g, "translationX", new float[] { 0.0F, 1000.0F });
    ObjectAnimator localObjectAnimator6 = ObjectAnimator.ofFloat(this.h, "translationX", new float[] { 0.0F, 1000.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(localObjectAnimator6).with(localObjectAnimator5).with(localObjectAnimator4).with(localObjectAnimator2).with(localObjectAnimator3).with(localObjectAnimator1);
    localAnimatorSet.setDuration(500L);
    localAnimatorSet.start();
  }
  
  private void b(View paramView)
  {
    this.j = ((Button)paramView.findViewById(2131690293));
    this.j.setOnClickListener(this);
    this.k = ((Button)paramView.findViewById(2131689858));
    this.k.setOnClickListener(this);
    this.d = ((RelativeLayout)paramView.findViewById(2131689739));
    this.e = ((RelativeLayout)paramView.findViewById(2131690282));
    this.f = ((RelativeLayout)paramView.findViewById(2131690286));
    this.g = ((RelativeLayout)paramView.findViewById(2131690290));
    this.h = ((RelativeLayout)paramView.findViewById(2131689742));
    this.b = ((TextView)paramView.findViewById(2131690279));
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.b, "translationX", new float[] { 800.0F, 0.0F });
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.d, "translationX", new float[] { 800.0F, 0.0F });
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.e, "translationX", new float[] { 800.0F, 0.0F });
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.f, "translationX", new float[] { 800.0F, 0.0F });
    ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(this.g, "translationX", new float[] { 800.0F, 0.0F });
    ObjectAnimator localObjectAnimator6 = ObjectAnimator.ofFloat(this.h, "translationX", new float[] { 800.0F, 0.0F });
    this.l = ((Button)paramView.findViewById(2131690293));
    this.l.setOnClickListener(this);
    localObjectAnimator1.setStartDelay(0L);
    localObjectAnimator2.setStartDelay(70L);
    localObjectAnimator3.setStartDelay(140L);
    localObjectAnimator4.setStartDelay(210L);
    localObjectAnimator5.setStartDelay(280L);
    localObjectAnimator6.setStartDelay(350L);
    localObjectAnimator1.setDuration(250L);
    localObjectAnimator2.setDuration(250L);
    localObjectAnimator3.setDuration(250L);
    localObjectAnimator4.setDuration(250L);
    localObjectAnimator5.setDuration(250L);
    localObjectAnimator6.setDuration(250L);
    localObjectAnimator1.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.a(UsbConnectFragment.this).setVisibility(0);
      }
    });
    localObjectAnimator2.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.b(UsbConnectFragment.this).setVisibility(0);
      }
    });
    localObjectAnimator3.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.c(UsbConnectFragment.this).setVisibility(0);
      }
    });
    localObjectAnimator4.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.d(UsbConnectFragment.this).setVisibility(0);
      }
    });
    localObjectAnimator5.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.e(UsbConnectFragment.this).setVisibility(0);
      }
    });
    localObjectAnimator6.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        super.onAnimationStart(paramAnonymousAnimator);
        UsbConnectFragment.f(UsbConnectFragment.this).setVisibility(0);
      }
    });
    if ((getArguments() != null) && (getArguments().getBoolean("isEnterLoginFragment", false)))
    {
      localObjectAnimator1.start();
      localObjectAnimator2.start();
      localObjectAnimator3.start();
      localObjectAnimator4.start();
      localObjectAnimator5.start();
      localObjectAnimator6.start();
      return;
    }
    this.b.setVisibility(0);
    this.d.setVisibility(0);
    this.e.setVisibility(0);
    this.f.setVisibility(0);
    this.g.setVisibility(0);
    this.h.setVisibility(0);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    b();
    this.m.b();
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0) {
      if (Build.VERSION.SDK_INT < 24) {
        if (ao.i(this.i).booleanValue()) {
          this.n.sendMessageDelayed(Message.obtain(), 300L);
        }
      }
    }
    while (paramInt1 != this.p)
    {
      return;
      this.n.sendMessageDelayed(Message.obtain(), 300L);
      return;
    }
    if (!ao.c(getActivity().getApplicationContext()))
    {
      z.a(getActivity(), 2131362096, 3000);
      return;
    }
    this.n.sendMessageDelayed(Message.obtain(), 300L);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.i = paramActivity;
    this.m = ((a)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      if ((this.o != null) && ((this.o.T().a()) || (this.o.U())))
      {
        this.n.sendMessageDelayed(Message.obtain(), 300L);
        return;
      }
      a();
      return;
    } while (this.m == null);
    this.m.c();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = ((WifiManager)getActivity().getSystemService("wifi"));
    this.o = ((DroidPlannerApp)getActivity().getApplication()).a;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968701, paramViewGroup, false);
    b(paramLayoutInflater);
    a(paramLayoutInflater);
    this.n = new Handler(this);
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public static abstract interface a
  {
    public abstract void b();
    
    public abstract void c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/login/UsbConnectFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */