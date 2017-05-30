package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.fimi.soul.drone.a;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;

public class f
{
  private Context a;
  private d b;
  private WeakReference<Context> c;
  private WeakReference<a> d;
  
  public f(a parama, FragmentActivity paramFragmentActivity, FlightMapFragment paramFlightMapFragment)
  {
    this.c = new WeakReference(paramFragmentActivity);
    this.d = new WeakReference(parama);
    this.a = ((Context)this.c.get());
    a(this.a, parama.aa(), (a)this.d.get(), paramFlightMapFragment);
  }
  
  private void a(Context paramContext, c paramc, a parama, FlightMapFragment paramFlightMapFragment)
  {
    this.b = new d(paramc, paramContext, parama);
  }
  
  public d a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    a().a();
    a().d();
  }
  
  public void a(int paramInt, LatLng paramLatLng)
  {
    switch ()
    {
    }
  }
  
  public void b()
  {
    this.b.c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */