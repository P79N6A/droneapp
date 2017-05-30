package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface e {
    @Deprecated
    public static final String a = "com.google.android.location.LOCATION";
    public static final String b = "mockLocation";

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Location a(g gVar);

    i<Status> a(g gVar, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, Location location);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, LocationRequest locationRequest, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, LocationRequest locationRequest, k kVar, Looper looper);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, LocationRequest locationRequest, l lVar);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, LocationRequest locationRequest, l lVar, Looper looper);

    i<Status> a(g gVar, k kVar);

    i<Status> a(g gVar, l lVar);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    i<Status> a(g gVar, boolean z);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    LocationAvailability b(g gVar);

    i<Status> c(g gVar);
}
