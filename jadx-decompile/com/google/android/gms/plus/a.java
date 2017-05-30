package com.google.android.gms.plus;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

@Deprecated
public interface a {
    @Deprecated
    i<Status> a(g gVar);

    @Deprecated
    void b(g gVar);

    @RequiresPermission("android.permission.GET_ACCOUNTS")
    @Deprecated
    String c(g gVar);
}
