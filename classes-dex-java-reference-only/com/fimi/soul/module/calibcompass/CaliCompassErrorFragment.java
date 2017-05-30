package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c.c;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.ao;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class CaliCompassErrorFragment
  extends BaseCaliCompassFragment
{
  a f;
  private TextView g;
  private Button h;
  private Button i;
  private Button j;
  private Button k;
  private ImageView l;
  private TextView m;
  private TextView n;
  private boolean o;
  private boolean p;
  private boolean q;
  private Handler r = new Handler();
  private Runnable s = new Runnable()
  {
    public void run()
    {
      CaliCompassErrorFragment.this.getActivity().setResult(0);
      CaliCompassErrorFragment.this.getActivity().finish();
    }
  };
  private int t;
  
  private void a(View paramView)
  {
    this.l = ((ImageView)paramView.findViewById(2131689956));
    this.g = ((TextView)paramView.findViewById(2131689748).findViewById(2131690327));
    this.g.setText(2131362015);
    this.h = ((Button)paramView.findViewById(2131689748).findViewById(2131690535));
    this.h.setOnClickListener(this);
    this.i = ((Button)paramView.findViewById(2131689504));
    this.i.setOnClickListener(this);
    this.j = ((Button)paramView.findViewById(2131689959));
    this.j.setOnClickListener(this);
    this.k = ((Button)paramView.findViewById(2131689960));
    this.k.setOnClickListener(this);
    this.m = ((TextView)paramView.findViewById(2131689957));
    this.n = ((TextView)paramView.findViewById(2131689958));
    a(this.i, 128);
    a(this.j, 230);
    ao.a(getActivity().getAssets(), new View[] { this.g, this.h, this.i, this.j, this.k, this.m, this.n });
  }
  
  private void b()
  {
    this.i.setVisibility(0);
    this.j.setVisibility(0);
    this.k.setVisibility(8);
  }
  
  private void c()
  {
    this.i.setVisibility(8);
    this.j.setVisibility(8);
    this.k.setVisibility(0);
  }
  
  private void d()
  {
    new AsyncTask()
    {
      protected Void a(Void... paramAnonymousVarArgs)
      {
        CheckCampssBeann localCheckCampssBeann = (CheckCampssBeann)c.a().a("checkcampass", CheckCampssBeann.class);
        if (localCheckCampssBeann != null) {}
        for (paramAnonymousVarArgs = localCheckCampssBeann.getListLatlng();; paramAnonymousVarArgs = localCheckCampssBeann.getListLatlng())
        {
          Location localLocation = MyLocationManager.a(CaliCompassErrorFragment.this.getActivity()).c();
          if (localLocation != null)
          {
            paramAnonymousVarArgs.add(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()));
            localCheckCampssBeann.setListLatlng(paramAnonymousVarArgs);
            c.a().a("checkcampass", localCheckCampssBeann);
          }
          return null;
          localCheckCampssBeann = new CheckCampssBeann();
        }
      }
    }.execute(new Void[0]);
  }
  
  public void a()
  {
    d.a(this.b).a((byte)1, (byte)1, (byte)4);
    getActivity().finish();
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.p = paramBoolean1;
    this.q = paramBoolean2;
    if (true == paramBoolean1)
    {
      this.m.setText(2131362031);
      this.n.setText(paramString);
      paramString = (PercentRelativeLayout.LayoutParams)this.l.getLayoutParams();
      paramString.setMargins(0, (int)(this.t * 0.1111F), 0, 0);
      this.l.setLayoutParams(paramString);
      this.l.setImageResource(2130838148);
      c();
      d();
      return;
    }
    this.m.setText(2131362022);
    this.n.setText(paramString);
    paramString = (PercentRelativeLayout.LayoutParams)this.l.getLayoutParams();
    paramString.setMargins(0, (int)(this.t * 0.12592F), 0, 0);
    this.l.setLayoutParams(paramString);
    this.l.setImageResource(2130838146);
    b();
  }
  
  public void a(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.f = ((a)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    switch (paramView.getId())
    {
    default: 
    case 2131689959: 
    case 2131689504: 
      do
      {
        do
        {
          return;
        } while (this.f == null);
        this.f.c();
        return;
      } while (this.f == null);
      this.f.d();
      return;
    case 2131689960: 
      this.r.postDelayed(this.s, 300L);
      return;
    }
    this.r.postDelayed(this.s, 300L);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new DisplayMetrics();
    getActivity().getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    this.t = paramBundle.heightPixels;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968651, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDetach()
  {
    super.onDetach();
    if (this.f != null) {
      this.f = null;
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if ((!paramBoolean) && (isVisible()))
    {
      if (this.p != true) {
        break label41;
      }
      b.b(getActivity()).a(getString(2131362031));
    }
    label41:
    while (this.q) {
      return;
    }
    b.b(getActivity()).a(getString(2131362012));
  }
  
  static abstract interface a
  {
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassErrorFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */