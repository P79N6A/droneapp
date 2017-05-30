package com.fimi.soul.module.login;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.update.CheckFirmwareActvity;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment.a;
import com.fimi.soul.service.UsbStatus;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.BreathLeapView;
import com.fimi.soul.view.TranslationView;

public class LoginActivity
  extends BaseActivity
  implements d.b, LoginFragment.a, UsbConnectFragment.a, UpdateConnectDefeaFrgment.a
{
  private static final int A = 4;
  private static final int D = 8;
  private static final int N = 0;
  private static final int o = 0;
  private static final int p = 1;
  private static final int u = 2;
  private static final int v = 3;
  private static final int w = 0;
  private static final int x = 1;
  private static final int y = 2;
  private static final int z = 3;
  private boolean B;
  private int C = 0;
  private boolean E = false;
  private boolean F = false;
  private final int G = 35000;
  private int H = 0;
  private ImageView I;
  private ValueAnimator J;
  private com.fimi.soul.biz.update.b K;
  private int L = 0;
  private Thread M;
  private final Handler O = new Handler()
  {
    @TargetApi(17)
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        do
        {
          do
          {
            return;
          } while ((LoginActivity.a(LoginActivity.this) != 1) || (LoginActivity.b(LoginActivity.this) > 0));
          if (!LoginActivity.this.drone.U()) {
            LoginActivity.a(LoginActivity.this, LoginActivity.this.getString(2131362228), LoginActivity.this.getString(2131362860));
          }
          for (;;)
          {
            LoginActivity.this.f.d();
            return;
            if (LoginActivity.this.drone.ac())
            {
              LoginActivity.c(LoginActivity.this);
            }
            else
            {
              LoginActivity.a(LoginActivity.this, 0);
              LoginActivity.this.dpa.b();
              LoginActivity.this.dpa.b(LoginActivity.this);
              paramAnonymousMessage = new Intent(LoginActivity.this, CheckFirmwareActvity.class);
              LoginActivity.this.startActivityForResult(paramAnonymousMessage, 0);
              LoginActivity.this.overridePendingTransition(17432576, 17432577);
            }
          }
          LoginActivity.e(LoginActivity.this).removeCallbacks(LoginActivity.d(LoginActivity.this));
        } while ((LoginActivity.a(LoginActivity.this) != 1) || (LoginActivity.b(LoginActivity.this) > 0));
        LoginActivity.a(LoginActivity.this, 3);
        LoginActivity.a(LoginActivity.this, LoginActivity.this.getString(2131362590), LoginActivity.this.getString(2131362861));
        LoginActivity.f(LoginActivity.this);
        return;
        LoginActivity.a(LoginActivity.this, false);
        return;
      } while (LoginActivity.a(LoginActivity.this) == 0);
      LoginActivity.this.f.a(false);
      LoginActivity.f(LoginActivity.this);
      LoginActivity.a(LoginActivity.this, new Thread(LoginActivity.g(LoginActivity.this)));
      LoginActivity.h(LoginActivity.this).start();
      LoginActivity.i(LoginActivity.this).start();
      LoginActivity.e(LoginActivity.this).postDelayed(LoginActivity.d(LoginActivity.this), 200L);
      LoginActivity.e(LoginActivity.this).sendEmptyMessageDelayed(0, 35000L);
    }
  };
  private Runnable P = new Runnable()
  {
    public void run()
    {
      if ((!LoginActivity.o(LoginActivity.this).isAdded()) && (!LoginActivity.this.isFinishing()))
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("isEnterLoginFragment", true);
        LoginActivity.o(LoginActivity.this).setArguments(localBundle);
        LoginActivity.this.getFragmentManager().beginTransaction().replace(2131689819, LoginActivity.o(LoginActivity.this)).commitAllowingStateLoss();
      }
    }
  };
  private Runnable Q = new Runnable()
  {
    public void run()
    {
      if (LoginActivity.a(LoginActivity.this) == 0)
      {
        LoginActivity.p(LoginActivity.this).a();
        LoginActivity.k(LoginActivity.this).setVisibility(4);
        LoginActivity.p(LoginActivity.this).setVisibility(0);
        return;
      }
      if (LoginActivity.this.a)
      {
        LoginActivity.q(LoginActivity.this).start();
        LoginActivity.r(LoginActivity.this).setVisibility(0);
        LoginActivity.j(LoginActivity.this).setVisibility(0);
        LoginActivity.this.getFragmentManager().beginTransaction().remove(LoginActivity.o(LoginActivity.this)).commitAllowingStateLoss();
        LoginActivity.this.a = false;
      }
      LoginActivity.k(LoginActivity.this).setVisibility(0);
      LoginActivity.p(LoginActivity.this).setVisibility(4);
      LoginActivity.k(LoginActivity.this).setting(LoginActivity.s(LoginActivity.this));
      LoginActivity.t(LoginActivity.this);
      if (LoginActivity.s(LoginActivity.this) == 8)
      {
        LoginActivity.b(LoginActivity.this, 0);
        LoginActivity.e(LoginActivity.this).postDelayed(LoginActivity.d(LoginActivity.this), 600L);
        return;
      }
      LoginActivity.e(LoginActivity.this).postDelayed(LoginActivity.d(LoginActivity.this), 200L);
    }
  };
  private Runnable R = new Runnable()
  {
    public void run()
    {
      boolean bool2 = false;
      boolean bool1 = false;
      int i = 0;
      int k = 0;
      boolean bool3;
      int j;
      for (;;)
      {
        if (k < 25)
        {
          bool3 = LoginActivity.this.f.c();
          if (!bool3)
          {
            LoginActivity.this.f.a();
            LoginActivity.this.e.b();
            LoginActivity.c(LoginActivity.this, 2500);
            k += 1;
            bool2 = bool3;
          }
          else
          {
            bool2 = bool1;
            if (!bool1) {
              bool2 = ao.d(com.fimi.soul.drone.g.c.b());
            }
            if ((bool2) && (!LoginActivity.this.drone.T().a())) {
              LoginActivity.u(LoginActivity.this);
            }
            LoginActivity.c(LoginActivity.this, 1500);
            j = i;
            if (LoginActivity.this.drone.T().a())
            {
              j = i;
              if (i == 0)
              {
                o.a.d = 0;
                o.a.e = 2;
                LoginActivity.this.drone.T().a(o.a.a());
                j = 1;
              }
            }
            if (((!LoginActivity.this.drone.T().a()) && (!LoginActivity.this.drone.U())) || (!bool3)) {
              break;
            }
          }
        }
      }
      for (;;)
      {
        LoginActivity.e(LoginActivity.this).removeMessages(0);
        if (LoginActivity.e(LoginActivity.this).hasMessages(0)) {
          LoginActivity.e(LoginActivity.this).removeMessages(0);
        }
        if ((LoginActivity.this.drone.T().a()) && (bool3))
        {
          LoginActivity.e(LoginActivity.this).removeCallbacks(LoginActivity.d(LoginActivity.this));
          LoginActivity.e(LoginActivity.this).sendEmptyMessageDelayed(1, 500L);
          return;
        }
        LoginActivity.e(LoginActivity.this).sendEmptyMessage(0);
        return;
        i = j;
        bool1 = bool2;
        break;
        bool3 = bool2;
      }
    }
  };
  boolean a = true;
  v b;
  boolean c;
  com.fimi.soul.biz.e.d d;
  com.fimi.soul.biz.e.c e;
  com.fimi.soul.biz.i.a f;
  private UpdateConnectDefeaFrgment g;
  private LoginFragment h;
  private UsbConnectFragment i;
  private ImageView j;
  private AnimationDrawable k;
  private TranslationView l;
  private BreathLeapView m;
  private int n = 0;
  private ProgressView q;
  private final int r = 200;
  private ValueAnimator s;
  private TextView t;
  
  private void a(int paramInt)
  {
    long l1 = paramInt;
    try
    {
      Thread.sleep(l1);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    boolean bool = g();
    if (this.g == null) {
      this.g = new UpdateConnectDefeaFrgment();
    }
    if (this.F) {
      return;
    }
    if (bool) {
      getFragmentManager().beginTransaction().show(this.g);
    }
    for (;;)
    {
      this.g.a(paramString1);
      this.g.b(paramString2);
      this.g.c(getString(2131362509));
      this.g.c(false);
      this.g.a(false);
      getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
      return;
      getFragmentManager().beginTransaction().add(2131689819, this.g).commitAllowingStateLoss();
    }
  }
  
  private void f()
  {
    if ((this.M != null) && (this.M.isAlive()) && (!this.M.isInterrupted())) {
      this.M.interrupt();
    }
  }
  
  private boolean g()
  {
    try
    {
      this.g = ((UpdateConnectDefeaFrgment)getFragmentManager().findFragmentById(2131689819));
      UpdateConnectDefeaFrgment localUpdateConnectDefeaFrgment = this.g;
      if (localUpdateConnectDefeaFrgment != null) {
        return true;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  private void h()
  {
    try
    {
      String str1 = getPackageName();
      String str2 = "https://play.google.com/store/apps/details?id=" + str1;
      new com.fimi.soul.biz.update.e(this, getPackageManager().getPackageInfo(str1, 0).versionName).execute(new String[] { str2 });
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.printStackTrace();
    }
  }
  
  private void i()
  {
    com.fimi.soul.drone.droneconnection.connection.a.a.a(com.fimi.soul.drone.g.c.d);
    this.drone.T().b();
  }
  
  private void j()
  {
    if (this.B)
    {
      finish();
      return;
    }
    this.B = true;
    com.fimi.kernel.utils.z.a(getApplicationContext(), 2131361962, com.fimi.kernel.utils.z.b);
    this.O.sendEmptyMessageDelayed(3, 2000L);
  }
  
  private void k()
  {
    startActivity(new Intent(this, FlightActivity.class));
    finish();
  }
  
  public void a()
  {
    if (this.k == null) {
      return;
    }
    this.C = 0;
    this.k.stop();
    this.k.start();
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        LoginActivity.l(LoginActivity.this).setAlpha(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
      }
    });
    localValueAnimator.setDuration(720L);
    localValueAnimator.start();
    getWindow().setFlags(128, 128);
    this.O.postDelayed(this.P, 1100L);
  }
  
  public void b()
  {
    this.d.o().f().a(com.fimi.soul.biz.camera.e.b());
    this.e.f().f().a(com.fimi.soul.biz.camera.e.c());
    Object localObject = com.fimi.soul.biz.camera.b.a().e();
    if ((localObject != null) && ((localObject instanceof com.fimi.soul.biz.camera.a.b)))
    {
      localObject = (com.fimi.soul.biz.camera.a.b)localObject;
      com.fimi.kernel.b.d.c localc = ((com.fimi.soul.biz.camera.a.b)localObject).g();
      if (localc != null) {
        localc.f().a(com.fimi.soul.biz.camera.e.a());
      }
      localObject = ((com.fimi.soul.biz.camera.a.b)localObject).f();
      if (localObject != null) {
        ((com.fimi.kernel.b.d.c)localObject).f().a(com.fimi.soul.biz.camera.e.a());
      }
    }
    this.C = 1;
    if (this.j != null) {
      this.j.setVisibility(8);
    }
    this.l.setVisibility(0);
    this.l.a(500);
    this.O.sendEmptyMessageDelayed(4, 500L);
    this.n = 0;
    this.I.setAlpha(0.0F);
    getFragmentManager().beginTransaction().remove(this.i).commitAllowingStateLoss();
  }
  
  public void c()
  {
    if (this.E)
    {
      this.b.a().edit().putBoolean("connect_success", false).commit();
      this.dpa.d();
      return;
    }
    startActivity(new Intent(this, FlightActivity.class));
  }
  
  public void d()
  {
    if (this.E)
    {
      this.b.a().edit().putBoolean("connect_success", false);
      this.dpa.d();
      return;
    }
    startActivity(new Intent(this, FlightActivity.class));
  }
  
  public void e()
  {
    this.C = 0;
    getFragmentManager().beginTransaction().remove(this.g).commit();
    this.a = true;
    this.t.setVisibility(4);
    this.q.setVisibility(4);
    this.m.setAlpha(0.0F);
    this.l.setVisibility(0);
    this.l.a();
    getFragmentManager().beginTransaction().replace(2131689819, this.i).commit();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 0)
    {
      this.a = true;
      this.t.setVisibility(4);
      this.q.setVisibility(4);
      if (this.m != null) {
        this.m.setAlpha(0.0F);
      }
      if (this.j != null) {
        this.j.setVisibility(4);
      }
      this.l.setVisibility(0);
      this.l.a();
      getFragmentManager().beginTransaction().replace(2131689819, this.i).commit();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  @TargetApi(16)
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968622);
    this.dpa.b(this);
    startService(new Intent(this, UsbStatus.class));
    this.I = ((ImageView)findViewById(2131689821));
    this.l = ((TranslationView)findViewById(2131689736));
    this.h = new LoginFragment();
    this.i = new UsbConnectFragment();
    this.d = com.fimi.soul.biz.e.d.a();
    this.e = com.fimi.soul.biz.e.c.a();
    if (getIntent().getBooleanExtra("islaunchexit", false)) {}
    this.b = v.a(this);
    this.E = this.b.a().getBoolean("is_setting_enter", false);
    if (!getIntent().getBooleanExtra("login", true))
    {
      this.C = 0;
      this.l.setVisibility(0);
      this.l.a();
      paramBundle = new Bundle();
      paramBundle.putBoolean("isenterLoginFragment", true);
      this.i.setArguments(paramBundle);
      getFragmentManager().beginTransaction().replace(2131689819, this.i).commit();
      getWindow().setFlags(128, 128);
      this.I.setAlpha(1.0F);
    }
    for (;;)
    {
      this.s = ValueAnimator.ofFloat(new float[] { 0.0F, 200.0F });
      this.s.setDuration(35000L);
      this.s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          LoginActivity.j(LoginActivity.this).setCurrentCount(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        }
      });
      this.J = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.J.setDuration(200L);
      this.J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          LoginActivity.k(LoginActivity.this).setAlpha(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        }
      });
      new IntentFilter().addAction("exit");
      this.drone.a(this);
      this.q = ((ProgressView)findViewById(2131689713));
      this.q.setMaxCount(200.0F);
      this.t = ((TextView)findViewById(2131689823));
      ao.a(getAssets(), new View[] { this.t });
      this.O.postDelayed(new Runnable()
      {
        public void run()
        {
          ((ViewStub)LoginActivity.this.findViewById(2131689822)).inflate();
          LoginActivity.a(LoginActivity.this, (BreathLeapView)LoginActivity.this.findViewById(2131690613));
          LoginActivity.l(LoginActivity.this).setBackgroundResource(2130838270);
          if (LoginActivity.this.getIntent().getBooleanExtra("login", true))
          {
            Drawable localDrawable = LoginActivity.this.getResources().getDrawable(2130838264);
            LoginActivity.a(LoginActivity.this, (AnimationDrawable)localDrawable);
            LoginActivity.m(LoginActivity.this).setOneShot(true);
            LoginActivity.n(LoginActivity.this).setBackground(localDrawable);
          }
        }
      }, 500L);
      this.L = getIntent().getIntExtra("sp_upgrade_skip", 0);
      paramBundle = getIntent().getBundleExtra("launchBundle");
      if (paramBundle != null)
      {
        Intent localIntent = new Intent(this, MessageDetailActivity.class);
        localIntent.putExtra("redirectURL", paramBundle.getString("redirectURL"));
        startActivity(localIntent);
      }
      return;
      ((ViewStub)findViewById(2131689820)).inflate();
      this.j = ((ImageView)findViewById(2131690614));
      this.j.setVisibility(0);
      this.C = 2;
      getFragmentManager().beginTransaction().replace(2131689819, this.h).commit();
      this.I.setAlpha(0.0F);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.F = true;
    if ((this.l != null) && (this.m != null))
    {
      this.l.c();
      this.m.a();
    }
    this.drone.b(this);
    f();
    if (this.O.hasMessages(0)) {
      this.O.removeMessages(0);
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    int i1 = 9.a[parama.ordinal()];
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {}
    switch (this.C)
    {
    default: 
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 0: 
      if (this.E)
      {
        finish();
        return false;
      }
      j();
      return false;
    case 1: 
      if (this.J.isRunning()) {
        this.J.cancel();
      }
      if (this.s.isRunning()) {
        this.s.cancel();
      }
      this.C = 0;
      this.a = true;
      this.O.removeCallbacks(this.Q);
      this.O.removeCallbacks(this.R);
      this.t.setVisibility(4);
      this.q.setVisibility(4);
      this.m.setAlpha(0.0F);
      getFragmentManager().beginTransaction().replace(2131689819, this.i).commit();
      this.l.setVisibility(0);
      this.l.b();
      this.l.a();
      return false;
    case 2: 
      if (this.E)
      {
        finish();
        return false;
      }
      j();
      return false;
    }
    this.C = 0;
    getFragmentManager().beginTransaction().remove(this.g).commit();
    this.a = true;
    this.t.setVisibility(4);
    this.q.setVisibility(4);
    this.m.setAlpha(0.0F);
    this.l.setVisibility(0);
    this.l.a();
    getFragmentManager().beginTransaction().replace(2131689819, this.i).commit();
    return false;
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.L == 20) {
      a(getString(2131362571), getString(2131362628));
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.f = com.fimi.soul.biz.i.a.b();
    this.F = false;
    if (this.C == 1) {
      this.O.post(this.Q);
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    this.F = true;
    this.O.removeCallbacks(this.Q);
    this.O.removeCallbacks(this.P);
    if ((this.K != null) && (this.K.b() != null)) {
      this.K.a(null);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/login/LoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */