package com.google.android.gms.location;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.List;

public abstract interface h
{
  public abstract i<Status> a(g paramg, PendingIntent paramPendingIntent);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<Status> a(g paramg, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent);
  
  public abstract i<Status> a(g paramg, List<String> paramList);
  
  @Deprecated
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<Status> a(g paramg, List<f> paramList, PendingIntent paramPendingIntent);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */