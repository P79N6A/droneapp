package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.google.android.gms.internal.ahl.b;

public class alt implements com.google.android.gms.fitness.a {

    private static class a extends com.google.android.gms.internal.amd.a {
        private final b<BleDevicesResult> a;

        private a(b<BleDevicesResult> bVar) {
            this.a = bVar;
        }

        public void a(BleDevicesResult bleDevicesResult) {
            this.a.a(bleDevicesResult);
        }
    }

    public i<BleDevicesResult> a(g gVar) {
        return gVar.a(new a<BleDevicesResult>(this, gVar) {
            final /* synthetic */ alt a;

            protected BleDevicesResult a(Status status) {
                return BleDevicesResult.a(status);
            }

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new ListClaimedBleDevicesRequest(new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final BleDevice bleDevice) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alt b;

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new ClaimBleDeviceRequest(bleDevice.a(), bleDevice, new amb(this)));
            }
        });
    }

    public i<Status> a(g gVar, final StartBleScanRequest startBleScanRequest) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alt b;

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new StartBleScanRequest(startBleScanRequest, new amb(this)));
            }
        });
    }

    public i<Status> a(g gVar, final com.google.android.gms.fitness.request.a aVar) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alt b;

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new StopBleScanRequest(aVar, new amb(this)));
            }
        });
    }

    public i<Status> a(g gVar, final String str) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alt b;

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new ClaimBleDeviceRequest(str, null, new amb(this)));
            }
        });
    }

    public i<Status> b(g gVar, BleDevice bleDevice) {
        return b(gVar, bleDevice.a());
    }

    public i<Status> b(g gVar, final String str) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alt b;

            protected void a(ako com_google_android_gms_internal_ako) {
                ((alc) com_google_android_gms_internal_ako.G()).a(new UnclaimBleDeviceRequest(str, new amb(this)));
            }
        });
    }
}
