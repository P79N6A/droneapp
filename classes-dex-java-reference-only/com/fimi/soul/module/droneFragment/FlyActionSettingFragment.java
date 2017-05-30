package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.d;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.e.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FlyActionSettingFragment
  extends Fragment
  implements View.OnClickListener, d.b
{
  private Button a;
  private Button b;
  private TextView c;
  private com.fimi.soul.drone.a d;
  private PercentRelativeLayout e;
  private com.fimi.soul.biz.c.h f;
  private v g;
  private f h;
  private h i;
  private ImageButton j;
  private boolean k;
  private a l;
  private View m;
  private Dialog n;
  
  private void a(View paramView)
  {
    this.j = ((ImageButton)paramView.findViewById(2131690166));
    this.j.setOnClickListener(this);
    this.e = ((PercentRelativeLayout)paramView.findViewById(2131690144));
    this.a = ((Button)paramView.findViewById(2131690085));
    this.a.setOnClickListener(this);
    this.b = ((Button)paramView.findViewById(2131690086));
    this.b.setOnClickListener(this);
    this.c = ((TextView)paramView.findViewById(2131689628));
    ao.a(getActivity().getAssets(), new View[] { this.a, this.b, this.c });
    ao.b(getActivity().getAssets(), new View[0]);
  }
  
  private void a(String paramString)
  {
    if ((this.n != null) && (this.n.isShowing()))
    {
      this.n.dismiss();
      this.n = null;
    }
    e.a locala = new e.a(getActivity());
    locala.a(paramString);
    locala.a(true);
    locala.a(getString(2131362251), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (FlyActionSettingFragment.a(FlyActionSettingFragment.this).a().get() == 2) {
          z.a(FlyActionSettingFragment.this.getActivity(), 2131362587, 2000);
        }
        do
        {
          return;
          if (FlyActionSettingFragment.a(FlyActionSettingFragment.this).a().get() == 1)
          {
            z.a(FlyActionSettingFragment.this.getActivity(), 2131362588, 2000);
            return;
          }
        } while (FlyActionSettingFragment.a(FlyActionSettingFragment.this).a().get() != 3);
        FlyActionSettingFragment.b(FlyActionSettingFragment.this).a();
      }
    });
    this.n = locala.a();
    this.n.setCanceledOnTouchOutside(false);
    this.n.show();
  }
  
  private boolean b(View paramView)
  {
    Rect localRect = new Rect();
    paramView.getWindowVisibleDisplayFrame(localRect);
    DisplayMetrics localDisplayMetrics = paramView.getResources().getDisplayMetrics();
    return paramView.getBottom() - localRect.bottom > localDisplayMetrics.density * 100.0F;
  }
  
  private void c()
  {
    this.d.a(d.a.bq);
    this.d.a(d.a.bS);
  }
  
  private void d()
  {
    if (this.f.a().get() == 1)
    {
      this.c.setText(2131362705);
      this.l.c(2131362125);
      this.h.e();
      this.j.setVisibility(8);
      if (!this.g.a().getBoolean("REMEBERACTIONTIP", false)) {
        a(getString(2131362262));
      }
    }
    for (;;)
    {
      int i1 = (int)((this.d.u().f() - 677216.0D) / 10.0D);
      this.l.a(i1);
      d.k().a(i1);
      d.k().m();
      this.d.a(d.a.bj);
      this.l.b();
      return;
      z.a(getActivity(), 2131362588, 2000);
      continue;
      if (this.f.a().get() == 2)
      {
        this.c.setText(2131362704);
        this.l.c(2131362122);
        this.h.e();
        this.j.setVisibility(8);
        if (!this.g.a().getBoolean("REMEBERACTIONTIPFlYTO", false)) {
          a(getString(2131362260));
        } else {
          z.a(getActivity(), 2131362587, 2000);
        }
      }
      else if (this.f.a().get() == 3)
      {
        this.c.setText(2131362683);
        this.j.setVisibility(0);
        if (!this.g.a().getBoolean("REMEBERACTIONTIPPOI", false)) {
          a(getString(2131362261));
        } else {
          this.h.a();
        }
      }
    }
  }
  
  private void e()
  {
    if (d.k().f().size() > 0)
    {
      this.b.setBackgroundResource(2130837943);
      return;
    }
    this.b.setBackgroundResource(2130837942);
  }
  
  private void f()
  {
    this.b.setBackgroundResource(2130837942);
  }
  
  public void a()
  {
    this.h.d();
    this.h.e();
    this.i.b();
    this.j.setImageResource(2130838524);
    this.k = false;
    d.k().m();
    com.fimi.soul.biz.c.h.a(getActivity().getApplicationContext()).a(0);
    this.d.a(d.a.bi);
  }
  
  public boolean b()
  {
    if ((this.n != null) && (this.n.isShowing())) {
      return false;
    }
    return b(this.m);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.d = ((DroidPlannerApp)paramActivity.getApplication()).a;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      if (!this.k)
      {
        if (this.d.W())
        {
          this.k = true;
          this.i.a();
          this.j.setImageResource(2130838525);
          return;
        }
        z.a(this.d.d, 2131362144, 3000);
        return;
      }
      this.k = false;
      this.i.b();
      this.j.setImageResource(2130838524);
      return;
      a();
      return;
      if (this.d.aj().g().isLightStream())
      {
        z.a(getActivity(), 2131362350, 3000);
        return;
      }
      if (this.d.aj().g().isEnforcementAtti())
      {
        z.a(getActivity(), 2131362349, 3000);
        return;
      }
      if (this.f.a().get() == 1)
      {
        this.d.a(d.a.r);
        return;
      }
      if (this.f.a().get() == 2)
      {
        this.d.a(d.a.u);
        return;
      }
    } while (this.f.a().get() != 3);
    this.d.a(d.a.w);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.f = com.fimi.soul.biz.c.h.a(this.d.d);
    this.g = v.a(getActivity());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968679, null);
    this.m = paramLayoutInflater.getRootView();
    this.h = new f(paramLayoutInflater, this.d);
    this.i = new h(paramLayoutInflater, this.d.d);
    this.l = new a(this.d, paramLayoutInflater);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDetach()
  {
    super.onDetach();
    if (this.h != null) {
      this.h = null;
    }
    if (this.i != null) {
      this.i = null;
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (2.a[parama.ordinal()])
    {
    case 3: 
    default: 
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              a();
              return;
              this.k = false;
              this.i.b();
              this.j.setImageResource(2130838524);
              return;
            } while (this.h == null);
            this.h.a(false);
            return;
            this.l.a();
            parama = d.k().j();
            if (parama != null)
            {
              this.l.a(parama.getHeight());
              this.l.d(parama.getSpeek());
            }
            e();
            return;
            e();
            this.l.b();
            return;
          } while ((!isVisible()) || (!parama1.aj().g().judgeNoAction()));
          d();
          c();
          return;
          e();
          this.h.g();
          return;
        } while (this.h == null);
        this.h.d();
        return;
      } while (this.h == null);
      this.h.d();
      return;
    case 11: 
      this.i.b();
      this.h.j();
      this.j.setImageResource(2130838524);
      this.k = false;
      return;
    }
    e();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (isAdded())
    {
      if (paramBoolean) {
        break label29;
      }
      f();
      d();
      c();
    }
    label29:
    do
    {
      return;
      if (this.n != null) {
        this.n.dismiss();
      }
      this.k = false;
      if (this.i != null) {
        this.i.b();
      }
    } while (this.j == null);
    this.j.setImageResource(2130838524);
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    super.onStart();
    this.d.a(this);
  }
  
  public void onStop()
  {
    super.onStop();
    this.d.b(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/FlyActionSettingFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */