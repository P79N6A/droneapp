package com.fimi.soul.module.calibcompass;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Window;
import com.fimi.kernel.d.b;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.module.b.d;
import com.fimi.soul.view.f;
import java.util.Iterator;
import java.util.List;

public class CaliCompassActivity
  extends BaseActivity
  implements BaseCaliCompassFragment.a, CaliComPassFirstFragment.a, CaliComPassThirdFragment.a, CaliCompassErrorFragment.a
{
  private CaliComPassFirstFragment a;
  private CaliCompassSecondFragment b;
  private CaliCompassErrorFragment c;
  private CaliComPassThirdFragment d;
  private CaliCompassFourFragment e;
  private CaliCompassErrorVertialFragment f;
  private CaliCompassStatusFragment g;
  private FragmentManager h;
  private boolean i;
  private boolean j;
  private boolean k = true;
  private boolean l;
  private final int m = 11;
  private final int n = 12;
  private final int o = 13;
  private boolean p;
  private Handler q = new Handler()
  {
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
          return;
        } while (CaliCompassActivity.a(CaliCompassActivity.this) == null);
        CaliCompassActivity.a(CaliCompassActivity.this, true);
        CaliCompassActivity.a(CaliCompassActivity.this).a(true);
        return;
        if ((!CaliCompassActivity.this.drone.U()) && (CaliCompassActivity.this.drone.T().a()))
        {
          CaliCompassActivity.a(CaliCompassActivity.this, 2131361924, "error", false, false);
          return;
        }
      } while (CaliCompassActivity.this.drone.T().a());
      CaliCompassActivity.a(CaliCompassActivity.this, 2131361923, "error", false, false);
    }
  };
  private boolean r = false;
  
  private void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k)
    {
      Iterator localIterator = this.h.getFragments().iterator();
      while (localIterator.hasNext())
      {
        Fragment localFragment = (Fragment)localIterator.next();
        if ((localFragment != null) && (localFragment.isVisible()))
        {
          paramString = this.h.findFragmentByTag(paramString);
          if (((paramString instanceof CaliCompassErrorFragment)) && (paramString.isHidden()))
          {
            ((CaliCompassErrorFragment)paramString).a(getString(paramInt), paramBoolean1, paramBoolean2);
            this.h.beginTransaction().hide(localFragment).show(paramString).commitAllowingStateLoss();
          }
        }
      }
    }
    this.g.a(false);
  }
  
  private void a(Bundle paramBundle)
  {
    this.h = getSupportFragmentManager();
    if (paramBundle == null)
    {
      this.g = ((CaliCompassStatusFragment)this.h.findFragmentById(2131689945));
      if (this.g == null) {
        this.g = new CaliCompassStatusFragment();
      }
      this.h.beginTransaction().add(2131689945, this.g, "begin").commitAllowingStateLoss();
      this.a = ((CaliComPassFirstFragment)this.h.findFragmentById(2131689946));
      if (this.a == null) {
        this.a = new CaliComPassFirstFragment();
      }
      this.h.beginTransaction().add(2131689946, this.a, "first").hide(this.a).commitAllowingStateLoss();
      this.b = ((CaliCompassSecondFragment)this.h.findFragmentById(2131689947));
      if (this.b == null) {
        this.b = new CaliCompassSecondFragment();
      }
      this.h.beginTransaction().add(2131689947, this.b, "second").hide(this.b).commitAllowingStateLoss();
      this.c = ((CaliCompassErrorFragment)this.h.findFragmentById(2131689948));
      if (this.c == null)
      {
        this.c = new CaliCompassErrorFragment();
        this.c.a(this.i);
      }
      this.h.beginTransaction().add(2131689948, this.c, "error").hide(this.c).commitAllowingStateLoss();
      this.d = ((CaliComPassThirdFragment)this.h.findFragmentById(2131689949));
      if (this.d == null) {
        this.d = new CaliComPassThirdFragment();
      }
      this.h.beginTransaction().add(2131689949, this.d, "thrid").hide(this.d).commitAllowingStateLoss();
      this.e = ((CaliCompassFourFragment)this.h.findFragmentById(2131689950));
      if (this.e == null) {
        this.e = new CaliCompassFourFragment();
      }
      this.e.a(this.i);
      this.h.beginTransaction().add(2131689950, this.e, "four").hide(this.e).commitAllowingStateLoss();
      this.f = ((CaliCompassErrorVertialFragment)this.h.findFragmentById(2131689951));
      if (this.f == null) {
        this.f = new CaliCompassErrorVertialFragment();
      }
      this.h.beginTransaction().add(2131689951, this.f, "errortratil").hide(this.f).commitAllowingStateLoss();
    }
  }
  
  public void a()
  {
    new com.fimi.soul.view.f.a(this).a(getString(2131362360)).b(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).a(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (CaliCompassActivity.b(CaliCompassActivity.this) != null)
        {
          CaliCompassActivity.b(CaliCompassActivity.this, true);
          CaliCompassActivity.b(CaliCompassActivity.this).a();
        }
        CaliCompassActivity.this.finish();
      }
    }).a().show();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.q.hasMessages(13))) {
      this.q.removeMessages(13);
    }
    this.r = paramBoolean;
  }
  
  public void b() {}
  
  public void c()
  {
    this.j = true;
    this.h.beginTransaction().hide(this.c).show(this.h.findFragmentByTag("begin")).commitAllowingStateLoss();
  }
  
  public void d()
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    getWindow().setFlags(128, 128);
    super.onCreate(paramBundle);
    setContentView(2130968648);
    this.i = getIntent().getBooleanExtra("isdirectcalicompass", false);
    a(paramBundle);
    this.dpa.b(this);
    this.q.sendEmptyMessageDelayed(12, 300L);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.r = false;
    if (this.speakTTs != null) {
      this.speakTTs.e();
    }
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    super.onDroneEvent(parama, parama1);
    switch (4.a[parama.ordinal()])
    {
    }
    do
    {
      for (;;)
      {
        if ((parama == d.a.as) && (this.g != null) && (!this.g.isVisible())) {
          a(2131361923, "error", false, false);
        }
        if ((this.g != null) && (!this.g.isVisible()) && (parama == d.a.ba))
        {
          parama = parama1.i();
          if ((!this.p) || ((parama.d() != 1) && (parama.d() != 2)) || (parama.e() != 1) || (parama.b() != 1) || (parama.c() != 3)) {
            break;
          }
          a(2131362021, "error", false, false);
        }
        return;
        if ((!parama1.U()) && (this.g != null) && (!this.g.isVisible())) {
          if (this.r)
          {
            if (!this.q.hasMessages(13)) {
              this.q.sendEmptyMessageDelayed(13, 10000L);
            }
          }
          else {
            a(2131361924, "error", false, false);
          }
        }
      }
      if ((this.j) && ((parama.d() == 1) || (parama.d() == 0)) && (parama.e() == 1) && (parama.b() == 1) && ((parama.c() == 1) || (parama.c() == 0)))
      {
        this.j = false;
        this.k = true;
        d.a(parama1).a((byte)1, (byte)1, (byte)1);
        return;
      }
      if (parama.c() == 4)
      {
        if (this.l)
        {
          a(2131362020, "error", false, true);
          return;
        }
        a(2131362020, "error", false, false);
        return;
      }
    } while (parama.c() != 5);
    a(0, "errortratil", false, false);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.g != null) && (!this.g.isVisible()) && (this.c != null) && (!this.c.isVisible()))
    {
      a();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */