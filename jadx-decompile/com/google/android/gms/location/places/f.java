package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface f {
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<h> a(g gVar, @Nullable PlaceFilter placeFilter);

    i<Status> a(g gVar, PlaceReport placeReport);
}
