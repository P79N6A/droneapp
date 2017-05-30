package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.manager.MyLocationManager.a;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.a.e;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.g;

public abstract class DroneMap
  extends SupportMapFragment
  implements MyLocationManager.a, d.b, f
{
  public static int l = 20;
  public static final byte m = 80;
  public static final byte n = 82;
  public static final byte o = 67;
  public static int p = 0;
  public static final int q = 3;
  public static int r = 0;
  private boolean a = true;
  private g b;
  protected c j;
  public a k;
  
  private void a(LatLng paramLatLng)
  {
    this.b = this.j.a(new MarkerOptions().a(paramLatLng).a(com.google.android.gms.maps.model.b.a(2130838136)));
    this.b.a(1.0F, 0.5F);
  }
  
  public void a(Location paramLocation)
  {
    if ((this.j != null) && (paramLocation != null) && (paramLocation.getLatitude() != 0.0D) && (paramLocation.getLongitude() != 0.0D))
    {
      this.k.a(paramLocation);
      paramLocation = new LatLng(paramLocation.getLatitude(), paramLocation.getLongitude());
      if ((!this.k.U()) && (!this.k.ao()))
      {
        this.k.f(true);
        this.j.a(com.google.android.gms.maps.b.a(paramLocation, 18.0F));
      }
      if (this.b == null) {
        a(paramLocation);
      }
    }
    else
    {
      return;
    }
    if (!this.b.k())
    {
      this.b.a();
      a(paramLocation);
    }
    this.b.a(paramLocation);
  }
  
  public void b(c paramc)
  {
    if (paramc != null)
    {
      this.j = paramc;
      this.k.a(this.j);
    }
  }
  
  public void c()
  {
    super.onDestroy();
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.k = ((DroidPlannerApp)getActivity().getApplication()).a;
    MyLocationManager.a(getActivity()).a(this);
    a(this);
    return paramLayoutInflater;
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    switch (1.a[parama.ordinal()])
    {
    case 1: 
    default: 
      return;
    }
    parama1.r();
    l = parama1.aj().e();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStart()
  {
    super.onStart();
    this.k.a(this);
  }
  
  public void onStop()
  {
    super.onStop();
    this.k.b(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/DroneMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */