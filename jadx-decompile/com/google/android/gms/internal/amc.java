package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.fitness.a;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.e;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class amc implements a {
    private static final Status a = new Status(e.B);

    public i<BleDevicesResult> a(g gVar) {
        return j.a(BleDevicesResult.a(a), gVar);
    }

    public i<Status> a(g gVar, BleDevice bleDevice) {
        return j.a(a, gVar);
    }

    public i<Status> a(g gVar, StartBleScanRequest startBleScanRequest) {
        return j.a(a, gVar);
    }

    public i<Status> a(g gVar, com.google.android.gms.fitness.request.a aVar) {
        return j.a(a, gVar);
    }

    public i<Status> a(g gVar, String str) {
        return j.a(a, gVar);
    }

    public i<Status> b(g gVar, BleDevice bleDevice) {
        return j.a(a, gVar);
    }

    public i<Status> b(g gVar, String str) {
        return j.a(a, gVar);
    }
}
