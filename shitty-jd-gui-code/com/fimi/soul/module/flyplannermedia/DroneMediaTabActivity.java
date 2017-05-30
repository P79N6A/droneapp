package com.fimi.soul.module.flyplannermedia;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.utils.ao;

public class DroneMediaTabActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private DroneOnlineFragment a;
  private DroneLocalFragment b;
  private boolean c = false;
  private RelativeLayout d;
  private RelativeLayout e;
  private ImageView f;
  private ImageView g;
  private TextView h;
  private TextView i;
  private View j;
  private View k;
  private View l;
  private View m;
  private ImageButton n;
  
  private void c()
  {
    FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
    if (!this.c)
    {
      this.h.setTextColor(getResources().getColor(2131624059));
      this.f.setVisibility(4);
      this.i.setTextColor(-1);
      this.g.setVisibility(0);
      localFragmentTransaction.replace(2131689729, this.b);
      localFragmentTransaction.addToBackStack(null);
      localFragmentTransaction.commitAllowingStateLoss();
      return;
    }
    this.i.setTextColor(getResources().getColor(2131624059));
    this.g.setVisibility(4);
    this.h.setTextColor(-1);
    this.f.setVisibility(0);
    localFragmentTransaction.replace(2131689729, this.a);
    localFragmentTransaction.addToBackStack(null);
    localFragmentTransaction.commitAllowingStateLoss();
  }
  
  public View a()
  {
    return this.k;
  }
  
  public void a(boolean paramBoolean)
  {
    View localView = this.m;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      localView.setVisibility(i1);
      return;
    }
  }
  
  public View b()
  {
    return this.l;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 0) && (paramIntent != null)) {}
    switch (paramInt2)
    {
    default: 
      return;
    case 1: 
      this.b.a(paramIntent);
      return;
    }
    this.a.a(paramIntent);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131690498) {
      this.c = false;
    }
    if (paramView.getId() == 2131690495) {
      this.c = true;
    }
    c();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new DroneOnlineFragment();
    this.b = new DroneLocalFragment();
    setContentView(2130968609);
    getWindow().setFlags(128, 128);
    this.j = findViewById(2131690490);
    this.j.findViewById(2131690494).setVisibility(0);
    this.n = ((ImageButton)this.j.findViewById(2131690492));
    this.k = findViewById(2131690472);
    this.k.setVisibility(8);
    this.l = findViewById(2131690479);
    this.d = ((RelativeLayout)findViewById(2131690495));
    this.e = ((RelativeLayout)findViewById(2131690498));
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.h = ((TextView)findViewById(2131690496));
    this.i = ((TextView)findViewById(2131690499));
    paramBundle = (ViewGroup)getWindow().getDecorView();
    ao.a(c.a().getResources().getAssets(), paramBundle);
    this.f = ((ImageView)findViewById(2131690497));
    this.g = ((ImageView)findViewById(2131690500));
    this.m = findViewById(2131689726);
    this.n.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        DroneMediaTabActivity.this.overridePendingTransition(17432576, 17432577);
        DroneMediaTabActivity.this.finish();
      }
    });
    this.c = ((d)b.a().d()).d();
    c();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && ((b().getVisibility() == 0) || (a().getVisibility() == 0)))
    {
      if (this.c) {
        this.a.o();
      }
      for (;;)
      {
        return true;
        this.b.o();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/DroneMediaTabActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */