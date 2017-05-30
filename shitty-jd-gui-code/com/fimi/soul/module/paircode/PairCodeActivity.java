package com.fimi.soul.module.paircode;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ae;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;

public class PairCodeActivity
  extends BaseActivity
  implements View.OnClickListener, d.b
{
  public static boolean a = false;
  private FragmentManager b;
  private PairResultFragment c;
  private PairErrorFragment d;
  private PairFragment e;
  private TextView f;
  private ImageView g;
  private a h;
  
  private void b()
  {
    com.fimi.soul.view.f.a locala = new com.fimi.soul.view.f.a(this);
    locala.a(getString(2131362193));
    locala.a(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    locala.b(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        PairCodeActivity.a(PairCodeActivity.this);
      }
    });
    locala.a().show();
  }
  
  private void c()
  {
    t localt = new t();
    localt.a((byte)9);
    localt.a(d.a().k());
    this.drone.T().a(localt.a());
  }
  
  public void a()
  {
    this.b.beginTransaction().replace(2131690471, this.e).commit();
  }
  
  public void a(a parama)
  {
    this.h = parama;
  }
  
  public void onBackPressed()
  {
    if ((this.c != null) && (a) && (this.drone.T().a()))
    {
      b();
      return;
    }
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if ((this.c != null) && (a) && (this.drone.T().a()))
    {
      b();
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968762);
    this.f = ((TextView)findViewById(2131690470));
    this.g = ((ImageView)findViewById(2131690469));
    this.g.setOnClickListener(this);
    ao.a(getAssets(), new View[] { this.f, this.g });
    this.b = getFragmentManager();
    this.c = new PairResultFragment();
    this.e = new PairFragment();
    this.d = new PairErrorFragment();
    this.b.beginTransaction().replace(2131690471, this.e).commit();
    getWindow().addFlags(128);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    super.onDroneEvent(parama, parama1);
    switch (3.a[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        for (;;)
        {
          return;
          parama = parama1.e();
          int i = parama.c();
          if (parama.d() == 9) {
            if (i == 2) {
              finish();
            }
          }
          while (this.h != null)
          {
            this.h.a(i, parama.e());
            return;
            if (i == 3)
            {
              z.a(this, getString(2131362555));
              a = false;
              finish();
              return;
              this.b.beginTransaction().replace(2131690471, this.c).commit();
            }
          }
        }
        if (a)
        {
          this.b.beginTransaction().replace(2131690471, this.d).commit();
          a = false;
          return;
        }
      } while (this.h == null);
      this.h.a(2);
      a = false;
      return;
    } while (this.h == null);
    this.h.a(16);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/paircode/PairCodeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */