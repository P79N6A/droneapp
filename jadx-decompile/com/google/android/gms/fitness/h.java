package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.request.c;
import com.google.android.gms.fitness.result.DataSourcesResult;

public interface h {
    i<Status> a(g gVar, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<DataSourcesResult> a(g gVar, DataSourcesRequest dataSourcesRequest);

    i<Status> a(g gVar, b bVar);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<Status> a(g gVar, c cVar, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<Status> a(g gVar, c cVar, b bVar);
}
