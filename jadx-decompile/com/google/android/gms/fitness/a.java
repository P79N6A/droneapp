package com.google.android.gms.fitness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public interface a {
    i<BleDevicesResult> a(g gVar);

    i<Status> a(g gVar, BleDevice bleDevice);

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    i<Status> a(g gVar, StartBleScanRequest startBleScanRequest);

    i<Status> a(g gVar, com.google.android.gms.fitness.request.a aVar);

    i<Status> a(g gVar, String str);

    i<Status> b(g gVar, BleDevice bleDevice);

    i<Status> b(g gVar, String str);
}
