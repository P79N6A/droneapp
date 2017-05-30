package com.google.android.gms.location;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface b {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    i<Status> a(g gVar, long j, PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    i<Status> a(g gVar, PendingIntent pendingIntent);
}
