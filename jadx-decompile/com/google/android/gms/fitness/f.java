package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.concurrent.TimeUnit;

public interface f {

    public static class a {
        private final Context a;
        private final DataType b;
        private DataSource c;
        private long d;
        private long e;
        private String f;

        public a(Context context, DataType dataType) {
            this.a = context;
            this.b = dataType;
        }

        private Intent a(Intent intent) {
            if (this.f == null) {
                return intent;
            }
            Intent intent2 = new Intent(intent).setPackage(this.f);
            ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent2, 0);
            if (resolveActivity == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.f, resolveActivity.activityInfo.name));
            return intent2;
        }

        public Intent a() {
            boolean z = true;
            d.a(this.d > 0, "Start time must be set");
            if (this.e <= this.d) {
                z = false;
            }
            d.a(z, "End time must be set and after start time");
            Intent intent = new Intent(c.A);
            intent.setType(DataType.b(this.c.a()));
            intent.putExtra(c.C, this.d);
            intent.putExtra(c.D, this.e);
            c.a(this.c, intent, DataSource.a);
            return a(intent);
        }

        public a a(long j, long j2, TimeUnit timeUnit) {
            this.d = timeUnit.toMillis(j);
            this.e = timeUnit.toMillis(j2);
            return this;
        }

        public a a(DataSource dataSource) {
            d.b(dataSource.a().equals(this.b), "Data source %s is not for the data type %s", new Object[]{dataSource, this.b});
            this.c = dataSource;
            return this;
        }

        public a a(String str) {
            this.f = str;
            return this;
        }
    }

    i<Status> a(g gVar, PendingIntent pendingIntent);

    i<Status> a(g gVar, DataSet dataSet);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<DailyTotalResult> a(g gVar, DataType dataType);

    i<Status> a(g gVar, DataDeleteRequest dataDeleteRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<DataReadResult> a(g gVar, DataReadRequest dataReadRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<Status> a(g gVar, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    i<Status> a(g gVar, DataUpdateRequest dataUpdateRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    i<DailyTotalResult> b(g gVar, DataType dataType);
}
