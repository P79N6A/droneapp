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
import android.view.ViewGroup;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.x;
import com.fimi.soul.view.e.a;
import java.util.concurrent.atomic.AtomicInteger;

public class DroneTakePhotoFragment
  extends Fragment
  implements d.b
{
  v a;
  private k b;
  private j c;
  private com.fimi.soul.drone.a d;
  private View e;
  private Dialog f;
  private int g;
  private double h;
  
  private void a(String paramString)
  {
    if ((this.f != null) && (this.f.isShowing()))
    {
      this.f.dismiss();
      this.f = null;
    }
    e.a locala = new e.a(getActivity());
    locala.a(paramString);
    locala.a(true);
    locala.a(getString(2131362251), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.f = locala.a();
    this.f.setCanceledOnTouchOutside(false);
    this.f.show();
  }
  
  private boolean a(View paramView)
  {
    Rect localRect = new Rect();
    paramView.getWindowVisibleDisplayFrame(localRect);
    DisplayMetrics localDisplayMetrics = paramView.getResources().getDisplayMetrics();
    return paramView.getBottom() - localRect.bottom > localDisplayMetrics.density * 100.0F;
  }
  
  public boolean a()
  {
    if ((this.f != null) && (this.f.isShowing())) {
      return false;
    }
    return a(this.e);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.d = ((DroidPlannerApp)paramActivity.getApplication()).a;
    this.a = v.a(getActivity());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968670, null);
    this.e = paramLayoutInflater;
    this.b = new k(paramLayoutInflater, this.d);
    this.c = new j(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.d.b(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (2.a[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        return;
      } while (h.a(getActivity().getApplicationContext()).a().get() != 4);
      this.b.b();
      return;
      int i = parama1.S().b();
      if (this.g - i < 0) {}
      for (this.h = ((i - 255) * 90 / 255);; this.h = (i * 90 / 255 - 90))
      {
        this.g = i;
        this.b.a((int)this.h);
        return;
      }
      this.b.a();
      return;
      parama = parama1.ap();
    } while (parama.j() != 19);
    this.b.a(parama);
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (isAdded())
    {
      if (paramBoolean) {
        break label94;
      }
      if (!this.a.a().getBoolean("REMEBERACTIONTAKEPHOTO", false)) {
        a(getString(2131362271));
      }
      this.b.d();
      this.b.e();
      this.b.h();
      this.c.b();
      this.d.a(d.a.bM);
      this.d.a(d.a.bj);
    }
    label94:
    do
    {
      return;
      if (this.f != null) {
        this.f.dismiss();
      }
      if (this.c != null) {
        this.c.a();
      }
    } while (this.b == null);
    this.b.f();
  }
  
  public void onStart()
  {
    super.onStart();
    this.d.a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/DroneTakePhotoFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */