package com.google.android.gms.fitness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public interface g {
    i<ListSubscriptionsResult> a(com.google.android.gms.common.api.g gVar);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<Status> a(com.google.android.gms.common.api.g gVar, DataSource dataSource);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<Status> a(com.google.android.gms.common.api.g gVar, DataType dataType);

    i<Status> a(com.google.android.gms.common.api.g gVar, Subscription subscription);

    i<Status> b(com.google.android.gms.common.api.g gVar, DataSource dataSource);

    i<Status> b(com.google.android.gms.common.api.g gVar, DataType dataType);

    i<ListSubscriptionsResult> c(com.google.android.gms.common.api.g gVar, DataType dataType);
}
