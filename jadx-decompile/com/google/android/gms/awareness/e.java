package com.google.android.gms.awareness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.snapshot.a;
import com.google.android.gms.awareness.snapshot.b;
import com.google.android.gms.awareness.snapshot.c;
import com.google.android.gms.awareness.snapshot.d;
import com.google.android.gms.awareness.snapshot.f;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.Collection;

public interface e {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    i<b> a(g gVar);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<a> a(g gVar, Collection<TypeFilter> collection);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<a> a(g gVar, TypeFilter... typeFilterArr);

    i<c> b(g gVar);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<d> c(g gVar);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<com.google.android.gms.awareness.snapshot.e> d(g gVar);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    i<f> e(g gVar);
}
