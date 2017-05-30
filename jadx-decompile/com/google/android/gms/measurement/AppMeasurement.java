package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.android.gms.measurement.internal.aj;
import com.xiaomi.market.sdk.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    private final aj a;

    public AppMeasurement(aj ajVar) {
        d.a((Object) ajVar);
        this.a = ajVar;
    }

    private void b(String str, String str2, Object obj) {
        this.a.l().a(str, str2, obj);
    }

    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return aj.a(context).m();
    }

    public void a(long j) {
        this.a.l().a(j);
    }

    @WorkerThread
    public void a(b bVar) {
        this.a.l().a(bVar);
    }

    public void a(c cVar) {
        this.a.l().a(cVar);
    }

    public void a(String str) {
        a("app", k._ID, (Object) str);
    }

    public void a(@Size(max = 32, min = 1) @NonNull String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (this.a.d().N() || !"_iap".equals(str)) {
            int b = this.a.o().b(str);
            if (b != 0) {
                this.a.o().a(b, "_ev", this.a.o().a(str, this.a.d().c(), true), str != null ? str.length() : 0);
                return;
            }
        }
        this.a.l().a("app", str, bundle, true);
    }

    public void a(@Size(max = 24, min = 1) @NonNull String str, @Nullable @Size(max = 36) String str2) {
        int d = this.a.o().d(str);
        if (d != 0) {
            this.a.o().a(d, "_ev", this.a.o().a(str, this.a.d().d(), true), str != null ? str.length() : 0);
        } else {
            a("app", str, (Object) str2);
        }
    }

    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.l().a(str, str2, bundle);
    }

    public void a(String str, String str2, Bundle bundle, long j) {
        this.a.l().a(str, str2, bundle == null ? new Bundle() : bundle, j);
    }

    public void a(String str, String str2, Object obj) {
        b(str, str2, obj);
    }

    @Deprecated
    public void a(boolean z) {
        this.a.l().a(z);
    }

    @WorkerThread
    public Map<String, Object> b(boolean z) {
        List<UserAttributeParcel> b = this.a.l().b(z);
        Map<String, Object> hashMap = new HashMap(b.size());
        for (UserAttributeParcel userAttributeParcel : b) {
            hashMap.put(userAttributeParcel.b, userAttributeParcel.a());
        }
        return hashMap;
    }

    public void b(long j) {
        this.a.l().b(j);
    }
}
