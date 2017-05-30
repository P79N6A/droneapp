package com.fimi.soul.biz.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.fimi.soul.biz.n.a;
import com.fimi.soul.receiver.NetworkStateReceiver;
import com.fimi.soul.receiver.NetworkStateReceiver.a;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.e;
import com.google.android.gms.location.l;
import com.google.android.gms.location.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLocationManager
  extends NetworkStateReceiver
  implements g.b, g.c, l
{
  private static MyLocationManager d;
  private Location e = null;
  private Location f;
  private LocationManager g;
  private List<a> h = new ArrayList();
  private g i;
  private int j = 1000;
  
  @SuppressLint({"ServiceCast"})
  private MyLocationManager(Context paramContext)
  {
    this.g = ((LocationManager)paramContext.getSystemService("location"));
    this.i = new g.a(paramContext.getApplicationContext()).a(this).a(this).a(n.a).c();
  }
  
  public static MyLocationManager a(Context paramContext)
  {
    if (d == null) {
      d = new MyLocationManager(paramContext);
    }
    return d;
  }
  
  private void d()
  {
    if ((this.i != null) && (!this.i.j())) {
      this.i.e();
    }
  }
  
  public double a()
  {
    if (this.f != null) {
      return this.f.getLatitude();
    }
    return -1.0D;
  }
  
  public void a(int paramInt) {}
  
  public void a(Location paramLocation)
  {
    this.f = paramLocation;
    this.e = paramLocation;
  }
  
  public void a(@Nullable Bundle paramBundle)
  {
    paramBundle = new LocationRequest();
    paramBundle.a(this.j);
    paramBundle.c(this.j);
    paramBundle.a(100);
    n.b.a(this.i, paramBundle, this);
  }
  
  public void a(a parama)
  {
    if (!this.h.contains(parama)) {
      this.h.add(parama);
    }
    d();
  }
  
  public void a(NetworkStateReceiver.a parama, Context paramContext)
  {
    if ((parama != null) && (parama != NetworkStateReceiver.a.c)) {
      d();
    }
  }
  
  public void a(@NonNull ConnectionResult paramConnectionResult) {}
  
  public double b()
  {
    if (this.f != null) {
      return this.f.getLongitude();
    }
    return -1.0D;
  }
  
  public void b(Location paramLocation)
  {
    Object localObject;
    if (!a.a().b())
    {
      localObject = z.a(paramLocation.getLatitude(), paramLocation.getLongitude());
      paramLocation.setLatitude(((af)localObject).a());
      paramLocation.setLongitude(((af)localObject).b());
    }
    for (;;)
    {
      a(paramLocation);
      localObject = this.h.iterator();
      while (((Iterator)localObject).hasNext())
      {
        a locala = (a)((Iterator)localObject).next();
        if (locala != null) {
          locala.a(paramLocation);
        }
      }
      paramLocation.setLatitude(paramLocation.getLatitude());
      paramLocation.setLongitude(paramLocation.getLongitude());
    }
  }
  
  public void b(a parama)
  {
    if (this.h.contains(parama)) {
      this.h.remove(parama);
    }
  }
  
  public Location c()
  {
    if (this.e == null) {
      return null;
    }
    return this.e;
  }
  
  public static abstract interface a
  {
    public abstract void a(Location paramLocation);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/MyLocationManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */