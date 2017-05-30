package com.fimi.soul.module.login;

import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.twitter.Twitter;
import com.fimi.kernel.utils.z;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.c.a;
import com.fimi.soul.module.setting.ShowTextActivity;
import com.fimi.soul.module.thirdpartlogin.c;
import com.fimi.soul.module.thirdpartlogin.c.a;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.ai;
import com.fimi.soul.utils.aj;
import com.fimi.soul.utils.aj.a;
import com.fimi.soul.utils.ao;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.mipush.sdk.MiPushClient;

public class LoginFragment
  extends Fragment
  implements View.OnClickListener
{
  private c.a A = new c.a()
  {
    public void a(int paramAnonymousInt, Object paramAnonymousObject)
    {
      LoginFragment.a(LoginFragment.this, false);
      LoginFragment.a(LoginFragment.this, paramAnonymousInt);
      if (paramAnonymousInt == 0)
      {
        LoginFragment.a(LoginFragment.this).setVisibility(4);
        MiPushClient.registerPush(LoginFragment.b(LoginFragment.this), "2882303761517518920", "5761751863920");
        LoginFragment.c(LoginFragment.this);
        paramAnonymousObject = new Intent(LoginFragment.b(LoginFragment.this), InitAppService.class);
        LoginFragment.b(LoginFragment.this).startService((Intent)paramAnonymousObject);
        return;
      }
      if (paramAnonymousInt == 1)
      {
        LoginFragment.a(LoginFragment.this).setVisibility(4);
        z.a(LoginFragment.b(LoginFragment.this), (String)paramAnonymousObject, z.c);
        return;
      }
      LoginFragment.a(LoginFragment.this).setVisibility(4);
    }
  };
  private TextView a;
  private Context b;
  private TextView c;
  private TextView d;
  private Button e;
  private Button f;
  private Button g;
  private Button h;
  private LinearLayout i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private RelativeLayout n;
  private RelativeLayout o;
  private LayoutTransition p;
  private a q;
  private String r = "http://dev.xiaomi.com";
  private XiaomiOAuthResults s;
  private x t;
  private String u;
  private User v = new User();
  private Boolean w = Boolean.valueOf(false);
  private aj x;
  private boolean y = false;
  private int z = -10;
  
  private void a()
  {
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.a, "translationX", new float[] { this.a.getTranslationX(), 1000.0F });
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.d, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    localObjectAnimator1.setStartDelay(100L);
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.e, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    localObjectAnimator1.setStartDelay(200L);
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.i, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    localObjectAnimator1.setStartDelay(200L);
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.f, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    localObjectAnimator1.setStartDelay(300L);
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.j, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.k, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.m, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.l, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(localObjectAnimator1).with(localObjectAnimator4).with(localObjectAnimator2).with(localObjectAnimator3);
    localAnimatorSet.setStartDelay(400L);
    localAnimatorSet.setDuration(500L);
    localAnimatorSet.start();
    localObjectAnimator1 = ObjectAnimator.ofFloat(this.c, "translationX", new float[] { this.d.getTranslationX(), 1000.0F });
    localObjectAnimator1.setStartDelay(500L);
    localObjectAnimator1.setDuration(500L);
    localObjectAnimator1.start();
    this.q.a();
  }
  
  public void facebookLogin()
  {
    if (this.y) {
      return;
    }
    this.y = false;
    if (a.a(this.b)) {
      this.o.setVisibility(0);
    }
    c.a().a(Facebook.NAME, this.A);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.q = ((a)paramActivity);
    this.b = paramActivity;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131690229: 
      do
      {
        return;
      } while (this.w.booleanValue());
      this.w = Boolean.valueOf(true);
      a();
      return;
    case 2131690222: 
      if (ao.b(this.b))
      {
        this.o.setVisibility(0);
        this.x.a(this.b, new aj.a()
        {
          public void a()
          {
            LoginFragment.a(LoginFragment.this).setVisibility(4);
            MiPushClient.registerPush(LoginFragment.b(LoginFragment.this), "2882303761517518920", "5761751863920");
            LoginFragment.c(LoginFragment.this);
            Intent localIntent = new Intent(LoginFragment.b(LoginFragment.this), InitAppService.class);
            LoginFragment.b(LoginFragment.this).startService(localIntent);
          }
          
          public void a(String paramAnonymousString)
          {
            LoginFragment.a(LoginFragment.this).setVisibility(4);
            z.a(LoginFragment.b(LoginFragment.this), paramAnonymousString, z.c);
          }
          
          public void b()
          {
            LoginFragment.a(LoginFragment.this).setVisibility(4);
          }
        });
        return;
      }
      z.a(this.b, 2131362440, 1000);
      return;
    case 2131690224: 
      facebookLogin();
      return;
    case 2131690225: 
      twitterLogin();
      return;
    case 2131690221: 
      if (ao.b(this.b))
      {
        paramView = new Intent(this.b, RegisterActivity.class);
        this.b.startActivity(paramView);
        return;
      }
      z.a(this.b, 2131362440, 1000);
      return;
    case 2131690227: 
      paramView = new Intent(getActivity(), ShowTextActivity.class);
      paramView.putExtra("URL_ONLINE", "https://fimiservice-us.mi-ae.com/privacy.html");
      paramView.putExtra("URL_TITLE", 2131361964);
      paramView.putExtra("URL_LOCAL", "file:///android_asset/privacy.html");
      startActivity(paramView);
      return;
    }
    paramView = new Intent(getActivity(), ShowTextActivity.class);
    paramView.putExtra("URL_ONLINE", "https://fimiservice-us.mi-ae.com/statement.html");
    paramView.putExtra("URL_TITLE", 2131361965);
    paramView.putExtra("URL_LOCAL", "file:///android_asset/statement.html");
    startActivity(paramView);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968690, paramViewGroup, false);
    this.c = ((TextView)paramLayoutInflater.findViewById(2131690229));
    this.c.setOnClickListener(this);
    this.a = ((TextView)paramLayoutInflater.findViewById(2131690219));
    this.e = ((Button)paramLayoutInflater.findViewById(2131690222));
    this.f = ((Button)paramLayoutInflater.findViewById(2131690221));
    this.d = ((TextView)paramLayoutInflater.findViewById(2131690220));
    this.d = ((TextView)paramLayoutInflater.findViewById(2131690220));
    this.e = ((Button)paramLayoutInflater.findViewById(2131690222));
    this.e.setOnClickListener(this);
    this.i = ((LinearLayout)paramLayoutInflater.findViewById(2131690223));
    this.g = ((Button)paramLayoutInflater.findViewById(2131690224));
    this.g.setOnClickListener(this);
    this.h = ((Button)paramLayoutInflater.findViewById(2131690225));
    this.h.setOnClickListener(this);
    this.m = ((TextView)paramLayoutInflater.findViewById(2131690228));
    this.f = ((Button)paramLayoutInflater.findViewById(2131690221));
    this.f.setOnClickListener(this);
    this.j = ((TextView)paramLayoutInflater.findViewById(2131690227));
    this.j.getPaint().setFlags(8);
    this.j.getPaint().setAntiAlias(true);
    this.j.setOnClickListener(this);
    this.k = ((TextView)paramLayoutInflater.findViewById(2131689709));
    this.k.getPaint().setFlags(8);
    this.k.getPaint().setAntiAlias(true);
    this.k.setOnClickListener(this);
    this.l = ((TextView)paramLayoutInflater.findViewById(2131690226));
    this.n = ((RelativeLayout)paramLayoutInflater.findViewById(2131690218));
    this.o = ((RelativeLayout)paramLayoutInflater.findViewById(2131690230));
    this.t = x.a(this.b);
    ao.a(this.b.getAssets(), new View[] { this.c, this.a, this.e, this.f, this.d, this.j, this.m, this.k, this.l, this.g, this.h });
    this.x = new ai();
    if (getActivity() != null) {
      c.a().a(getActivity());
    }
    return paramLayoutInflater;
  }
  
  public void twitterLogin()
  {
    if (this.y) {
      return;
    }
    this.y = false;
    if (a.a(this.b)) {
      this.o.setVisibility(0);
    }
    c.a().a(Twitter.NAME, this.A);
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/login/LoginFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */