package com.google.android.gms.fitness.service;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.CallSuper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.s;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.alq;
import java.util.List;

public abstract class FitnessSensorService extends Service {
    public static final String a = "com.google.android.gms.fitness.service.FitnessSensorService";
    private a b;

    private static class a extends com.google.android.gms.fitness.internal.service.c.a {
        private final FitnessSensorService a;

        private a(FitnessSensorService fitnessSensorService) {
            this.a = fitnessSensorService;
        }

        public void a(FitnessDataSourcesRequest fitnessDataSourcesRequest, aky com_google_android_gms_internal_aky) {
            this.a.a();
            com_google_android_gms_internal_aky.a(new DataSourcesResult(this.a.a(fitnessDataSourcesRequest.a()), Status.a));
        }

        public void a(FitnessUnregistrationRequest fitnessUnregistrationRequest, alq com_google_android_gms_internal_alq) {
            this.a.a();
            if (this.a.a(fitnessUnregistrationRequest.a())) {
                com_google_android_gms_internal_alq.a(Status.a);
            } else {
                com_google_android_gms_internal_alq.a(new Status(13));
            }
        }

        public void a(FitnessSensorServiceRequest fitnessSensorServiceRequest, alq com_google_android_gms_internal_alq) {
            this.a.a();
            if (this.a.a(fitnessSensorServiceRequest)) {
                com_google_android_gms_internal_alq.a(Status.a);
            } else {
                com_google_android_gms_internal_alq.a(new Status(13));
            }
        }
    }

    public abstract List<DataSource> a(List<DataType> list);

    @TargetApi(19)
    protected void a() {
        int callingUid = Binder.getCallingUid();
        if (s.h()) {
            ((AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (i < length) {
                if (!packagesForUid[i].equals("com.google.android.gms")) {
                    i++;
                } else {
                    return;
                }
            }
        }
        throw new SecurityException("Unauthorized caller");
    }

    public abstract boolean a(DataSource dataSource);

    public abstract boolean a(FitnessSensorServiceRequest fitnessSensorServiceRequest);

    @CallSuper
    public IBinder onBind(Intent intent) {
        if (!a.equals(intent.getAction())) {
            return null;
        }
        if (Log.isLoggable("FitnessSensorService", 3)) {
            String valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(getClass().getName());
            Log.d("FitnessSensorService", new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length()).append("Intent ").append(valueOf).append(" received by ").append(valueOf2).toString());
        }
        return this.b.asBinder();
    }

    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.b = new a();
    }
}
