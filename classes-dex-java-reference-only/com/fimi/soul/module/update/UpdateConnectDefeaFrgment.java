package com.fimi.soul.module.update;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class UpdateConnectDefeaFrgment
  extends Fragment
  implements View.OnClickListener
{
  Handler a = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      UpdateConnectDefeaFrgment.a(UpdateConnectDefeaFrgment.this).d();
    }
  };
  private Button b;
  private Button c;
  private Button d;
  private ImageView e;
  private TextView f;
  private TextView g;
  private Context h;
  private String i;
  private String j;
  private String k;
  private boolean l = false;
  private boolean m = false;
  private a n;
  private boolean o = false;
  
  private void a()
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this.h, 2131034129);
    this.e.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(this.h, 2131034128);
    localAnimation.setStartOffset(350L);
    this.f.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(this.h, 2131034128);
    localAnimation.setStartOffset(400L);
    this.g.startAnimation(localAnimation);
    localAnimation = AnimationUtils.loadAnimation(this.h, 2131034128);
    localAnimation.setStartOffset(450L);
    this.b.startAnimation(localAnimation);
    this.c.startAnimation(localAnimation);
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public void b(String paramString)
  {
    this.i = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public void c(String paramString)
  {
    this.k = paramString;
  }
  
  public void c(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    int i2 = 0;
    super.onActivityCreated(paramBundle);
    this.g.setText(this.j);
    this.f.setText(this.i);
    this.b.setText(this.k);
    if (this.m)
    {
      this.a.sendEmptyMessageDelayed(0, 2000L);
      this.e.setBackgroundResource(2130838313);
    }
    if (this.o)
    {
      this.c.setVisibility(0);
      this.c.setText(getString(2131362006));
      this.b.setVisibility(0);
      this.b.setText(getString(2131362330));
      this.d.setVisibility(8);
      return;
    }
    paramBundle = this.c;
    if ((this.l) || (this.m))
    {
      i1 = 8;
      paramBundle.setVisibility(i1);
      paramBundle = this.b;
      if ((!this.l) && (!this.m)) {
        break label213;
      }
      i1 = 8;
      label176:
      paramBundle.setVisibility(i1);
      paramBundle = this.d;
      if ((!this.l) || (this.m)) {
        break label218;
      }
    }
    label213:
    label218:
    for (int i1 = i2;; i1 = 8)
    {
      paramBundle.setVisibility(i1);
      return;
      i1 = 0;
      break;
      i1 = 0;
      break label176;
    }
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.h = paramActivity;
    this.n = ((a)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689858: 
      this.n.d();
      return;
    case 2131689718: 
      this.n.e();
      return;
    }
    this.n.d();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968632, paramViewGroup, false);
    this.f = ((TextView)paramLayoutInflater.findViewById(2131689855));
    this.g = ((TextView)paramLayoutInflater.findViewById(2131689856));
    this.e = ((ImageView)paramLayoutInflater.findViewById(2131689854));
    this.b = ((Button)paramLayoutInflater.findViewById(2131689858));
    this.c = ((Button)paramLayoutInflater.findViewById(2131689718));
    this.d = ((Button)paramLayoutInflater.findViewById(2131689859));
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    a();
    ao.a(this.h.getAssets(), new View[] { this.f, this.g, this.c, this.b });
    return paramLayoutInflater;
  }
  
  public static abstract interface a
  {
    public abstract void d();
    
    public abstract void e();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/UpdateConnectDefeaFrgment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */