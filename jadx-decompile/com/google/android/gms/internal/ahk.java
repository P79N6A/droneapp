package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import java.util.Set;

public final class ahk extends ahn<t> {
    private int a;
    private boolean b;

    private void a(ConnectionResult connectionResult) {
        ArrayMap arrayMap = null;
        for (int i = 0; i < arrayMap.size(); i++) {
            a((ahh) arrayMap.keyAt(i), connectionResult);
        }
    }

    protected t a(Status status) {
        t tVar;
        synchronized (null) {
            try {
                a(new ConnectionResult(8));
                ArrayMap arrayMap = null;
                if (arrayMap.size() != 1) {
                    tVar = new t(status, null);
                }
            } finally {
            }
        }
        return tVar;
    }

    public void a(ahh<?> com_google_android_gms_internal_ahh_, ConnectionResult connectionResult) {
        synchronized (null) {
            ArrayMap arrayMap = null;
            try {
                arrayMap.put(com_google_android_gms_internal_ahh_, connectionResult);
                this.a--;
                boolean b = connectionResult.b();
                if (!b) {
                    this.b = b;
                }
                if (this.a == 0) {
                    Status status = this.b ? new Status(13) : Status.a;
                    arrayMap = null;
                    b(arrayMap.size() == 1 ? new s(status, null) : new t(status, null));
                }
            } finally {
            }
        }
    }

    protected /* synthetic */ m b(Status status) {
        return a(status);
    }

    public Set<ahh<?>> b() {
        ArrayMap arrayMap = null;
        return arrayMap.keySet();
    }
}
