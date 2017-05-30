package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.g.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.e.a;
import com.fimi.soul.view.f;

public class ShowDroneControlFragment
  extends Fragment
  implements View.OnClickListener, d.b
{
  private ImageView A;
  private ImageView B;
  private com.fimi.soul.view.f.a C;
  private Dialog D;
  private PercentRelativeLayout a;
  private PercentRelativeLayout b;
  private PercentRelativeLayout c;
  private PercentRelativeLayout d;
  private PercentRelativeLayout e;
  private PercentRelativeLayout f;
  private PercentRelativeLayout g;
  private ImageButton h;
  private Context i;
  private DroidPlannerApp j;
  private com.fimi.soul.drone.a k;
  private com.fimi.soul.module.b.d l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private int t;
  private int u = 20;
  private ImageView v;
  private ImageView w;
  private ImageView x;
  private ImageView y;
  private ImageView z;
  
  private void a(int paramInt1, int paramInt2)
  {
    if ((this.k.T().a()) && (this.k.U()))
    {
      if (this.k.ac()) {
        break label283;
      }
      if (!this.k.aj().g().isEnforcementAtti()) {
        break label249;
      }
      a(1.0F, false, new View[] { this.a });
      a(0.3F, false, new View[] { this.y, this.m });
    }
    for (;;)
    {
      a(0.3F, false, new View[] { this.z, this.A, this.o, this.n, this.w, this.x, this.q, this.r, this.v, this.p, this.s, this.B });
      a(1.0F, false, new View[] { this.b, this.c, this.e, this.f, this.d, this.g });
      return;
      label249:
      a(1.0F, true, new View[] { this.a, this.y, this.m });
    }
    label283:
    a(0.3F, false, new View[] { this.y, this.m });
    a(1.0F, false, new View[] { this.a });
    if ((this.k.aj().g().isLightStream()) || (this.k.aj().g().isEnforcementAtti()))
    {
      if (this.k.aj().g().isEnforcementAtti())
      {
        a(0.3F, false, new View[] { this.z, this.n });
        a(1.0F, false, new View[] { this.b });
      }
      for (;;)
      {
        a(0.3F, false, new View[] { this.w, this.q, this.x, this.r, this.v, this.p, this.A, this.o, this.s, this.B });
        a(1.0F, false, new View[] { this.f, this.d, this.e, this.f, this.c, this.g });
        return;
        a(1.0F, true, new View[] { this.b, this.z, this.n });
      }
    }
    a(1.0F, true, new View[] { this.A, this.o, this.c, this.b, this.z, this.n });
    if ((this.k.aj().g().judgeNoAction()) && (!this.k.al().c()))
    {
      a(1.0F, true, new View[] { this.d, this.v, this.p, this.w, this.e, this.q, this.r, this.x, this.f, this.g, this.s, this.B });
      return;
    }
    a(0.3F, false, new View[] { this.w, this.x, this.q, this.r, this.p, this.v, this.s, this.B });
    a(1.0F, false, new View[] { this.d, this.e, this.f, this.g });
  }
  
  public void a()
  {
    a(1.0F, false, new View[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g });
    a(0.3F, false, new View[] { this.z, this.y, this.A, this.m, this.o, this.n, this.s });
    a(0.3F, false, new View[] { this.v, this.p, this.w, this.x, this.q, this.r, this.B });
  }
  
  public void a(float paramFloat, boolean paramBoolean, View... paramVarArgs)
  {
    int i1 = 0;
    while (i1 < paramVarArgs.length)
    {
      View localView = paramVarArgs[i1];
      if (localView.getAlpha() != paramFloat) {
        localView.setAlpha(paramFloat);
      }
      if (localView.isEnabled() != paramBoolean) {
        paramVarArgs[i1].setEnabled(paramBoolean);
      }
      i1 += 1;
    }
  }
  
  public void b()
  {
    int i1 = com.fimi.soul.module.update.a.a.a().a(0).b();
    if ((i1 > 0) && (i1 < 1894) && (!com.fimi.soul.biz.e.d.a().k()))
    {
      if (this.D == null)
      {
        e.a locala = new e.a(getActivity());
        locala.a(getString(2131362230));
        locala.a(false);
        locala.a(getString(2131362251), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        });
        this.D = locala.a();
        this.D.setCanceledOnTouchOutside(false);
      }
      this.D.show();
    }
  }
  
  public boolean c()
  {
    if (this.D == null) {
      return false;
    }
    return this.D.isShowing();
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.i = paramActivity.getApplicationContext();
    this.j = ((DroidPlannerApp)paramActivity.getApplication());
    this.k = this.j.a;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131690107: 
    case 2131690108: 
    case 2131690111: 
    case 2131690114: 
    case 2131690117: 
    case 2131690123: 
    case 2131690126: 
      do
      {
        do
        {
          do
          {
            return;
            this.k.a(d.a.aQ);
            return;
            h.a(getActivity().getApplicationContext()).a(0);
            if (!this.k.ac()) {
              if (this.u == 2)
              {
                this.C.a(getString(2131362827));
                this.C.b(getString(2131362175), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    ShowDroneControlFragment.a(ShowDroneControlFragment.this).a();
                    paramAnonymousDialogInterface.dismiss();
                  }
                }).a(getString(2131362051), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    paramAnonymousDialogInterface.dismiss();
                  }
                }).a().show();
              }
            }
            for (;;)
            {
              this.k.a(d.a.aQ);
              return;
              if (this.u == 1)
              {
                this.C.a(getString(2131362826));
                break;
              }
              z.a(getActivity(), 2131362920, 2000);
              return;
              z.a(getActivity(), 2131362920, 2000);
            }
            h.a(getActivity().getApplicationContext()).a(0);
            if (this.k.ac())
            {
              this.C.a(getString(2131362412));
              this.C.b(getString(2131362175), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  ShowDroneControlFragment.a(ShowDroneControlFragment.this).b();
                  paramAnonymousDialogInterface.dismiss();
                }
              }).a(getString(2131362051), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  paramAnonymousDialogInterface.dismiss();
                }
              }).a().show();
            }
            for (;;)
            {
              this.k.a(d.a.aQ);
              return;
              z.a(getActivity(), 2131362918, 2000);
            }
            h.a(getActivity().getApplicationContext()).a(0);
            boolean bool = this.k.aj().g().isLightStream();
            double d1 = (this.k.u().f() - 677216.0D) / 10.0D;
            if ((this.k.ac()) && (!bool))
            {
              this.C.a(getString(2131362308));
              this.C.b(getString(2131362175), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  ShowDroneControlFragment.a(ShowDroneControlFragment.this).c();
                  paramAnonymousDialogInterface.dismiss();
                }
              }).a(getString(2131362051), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  paramAnonymousDialogInterface.dismiss();
                }
              }).a().show();
            }
            for (;;)
            {
              this.k.a(d.a.aQ);
              return;
              if (bool) {
                z.a(getActivity(), 2131362418, 3000);
              } else {
                z.a(getActivity(), 2131362919, 2000);
              }
            }
            if (!this.k.aj().g().isGps()) {
              break;
            }
            b();
          } while (c());
          com.fimi.soul.biz.c.d.k().a(false);
          h.a(getActivity().getApplicationContext()).a(3);
          this.k.a(d.a.aQ);
          return;
          z.a(getActivity(), 2131362055);
          return;
          if (!this.k.aj().g().isGps()) {
            break;
          }
          b();
        } while (c());
        com.fimi.soul.biz.c.d.k().a(false);
        h.a(getActivity().getApplicationContext()).a(1);
        this.k.a(d.a.aQ);
        return;
        z.a(getActivity(), 2131362057);
        return;
        if (!this.k.aj().g().isGps()) {
          break;
        }
        b();
      } while (c());
      com.fimi.soul.biz.c.d.k().a(false);
      h.a(getActivity().getApplicationContext()).a(2);
      this.k.a(d.a.aQ);
      return;
      z.a(getActivity(), 2131362054);
      return;
    }
    if (this.k.aj().g().isGps())
    {
      if (this.k.ad().u())
      {
        z.a(getActivity(), 2131362143, 3000);
        return;
      }
      if (this.k.ad().t())
      {
        z.a(getActivity(), 2131362301, 3000);
        return;
      }
      if (!com.fimi.soul.biz.e.d.a().m())
      {
        z.a(getActivity(), 2131362510, 3000);
        return;
      }
      label911:
      do
      {
        try
        {
          paramView = (g)this.k.c;
          if (paramView.f() != g.a.f) {
            break label911;
          }
          z.a(getActivity(), 2131362842, 3000);
          return;
        }
        catch (Exception paramView)
        {
          b();
        }
        if (c()) {
          break;
        }
        h.a(getActivity().getApplicationContext()).a(4);
        this.k.a(d.a.aQ);
        return;
        if (paramView.f() == g.a.g)
        {
          z.a(getActivity(), 2131362837, 3000);
          return;
        }
        if (paramView.f() == g.a.d)
        {
          z.a(getActivity(), 2131362838, 3000);
          return;
        }
      } while (paramView.f() != g.a.l);
      z.a(getActivity(), 2131362839, 3000);
      return;
    }
    z.a(getActivity(), 2131362056);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.C = new com.fimi.soul.view.f.a(getActivity());
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968671, null);
    this.g = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690120));
    this.s = ((TextView)paramLayoutInflater.findViewById(2131690122));
    this.B = ((ImageView)paramLayoutInflater.findViewById(2131690121));
    this.h = ((ImageButton)paramLayoutInflater.findViewById(2131690107));
    this.a = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690108));
    this.b = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690111));
    this.c = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690114));
    this.d = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690117));
    this.e = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690123));
    this.f = ((PercentRelativeLayout)paramLayoutInflater.findViewById(2131690126));
    paramViewGroup = new View[8];
    paramViewGroup[0] = this.g;
    paramViewGroup[1] = this.a;
    paramViewGroup[2] = this.b;
    paramViewGroup[3] = this.c;
    paramViewGroup[4] = this.d;
    paramViewGroup[5] = this.e;
    paramViewGroup[6] = this.f;
    paramViewGroup[7] = this.h;
    int i2 = paramViewGroup.length;
    int i1 = 0;
    while (i1 < i2)
    {
      paramViewGroup[i1].setOnClickListener(this);
      i1 += 1;
    }
    this.l = com.fimi.soul.module.b.d.a(this.k);
    this.m = ((TextView)paramLayoutInflater.findViewById(2131690110));
    this.o = ((TextView)paramLayoutInflater.findViewById(2131690116));
    this.n = ((TextView)paramLayoutInflater.findViewById(2131690113));
    this.p = ((TextView)paramLayoutInflater.findViewById(2131690119));
    this.q = ((TextView)paramLayoutInflater.findViewById(2131690125));
    this.r = ((TextView)paramLayoutInflater.findViewById(2131690128));
    ao.a(getActivity().getAssets(), new View[] { this.m, this.o, this.p, this.q, this.r, this.s, this.n });
    this.y = ((ImageView)paramLayoutInflater.findViewById(2131690109));
    this.z = ((ImageView)paramLayoutInflater.findViewById(2131690112));
    this.A = ((ImageView)paramLayoutInflater.findViewById(2131690115));
    this.v = ((ImageView)paramLayoutInflater.findViewById(2131690118));
    this.w = ((ImageView)paramLayoutInflater.findViewById(2131690124));
    this.x = ((ImageView)paramLayoutInflater.findViewById(2131690127));
    a();
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.k.b(this);
    if (this.D != null) {
      this.D = null;
    }
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    this.k.b(this);
    if (this.C != null) {
      this.C = null;
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (8.a[parama.ordinal()])
    {
    }
    do
    {
      return;
      this.t = parama1.aj().e();
      this.u = parama1.aj().d();
      a(this.t, this.u);
      return;
      a();
      return;
    } while (parama1.U());
    a();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    this.k.a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/ShowDroneControlFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */