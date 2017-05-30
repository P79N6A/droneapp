package com.google.android.gms.location;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.List;

public interface h {
    i<Status> a(g gVar, PendingIntent pendingIntent);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<Status> a(g gVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    i<Status> a(g gVar, List<String> list);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    i<Status> a(g gVar, List<f> list, PendingIntent pendingIntent);
}
