package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public abstract interface e
{
  @Deprecated
  public static final String a = "com.google.android.location.LOCATION";
  public static final String b = "mockLocation";
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract Location a(g paramg);
  
  public abstract i<Status> a(g paramg, PendingIntent paramPendingIntent);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, Location paramLocation);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, LocationRequest paramLocationRequest, k paramk, Looper paramLooper);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, LocationRequest paramLocationRequest, l paraml);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, LocationRequest paramLocationRequest, l paraml, Looper paramLooper);
  
  public abstract i<Status> a(g paramg, k paramk);
  
  public abstract i<Status> a(g paramg, l paraml);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract i<Status> a(g paramg, boolean paramBoolean);
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public abstract LocationAvailability b(g paramg);
  
  public abstract i<Status> c(g paramg);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */