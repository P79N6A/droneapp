package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement$b;
import com.google.android.gms.measurement.AppMeasurement$c;
import com.google.android.gms.tagmanager.aj.a;
import java.util.Map;

class l$1 extends a {
    final /* synthetic */ AppMeasurement a;

    l$1(AppMeasurement appMeasurement) {
        this.a = appMeasurement;
    }

    public Map<String, Object> a() {
        return this.a.b(true);
    }

    public void a(final ag agVar) {
        this.a.a(new AppMeasurement$c(this) {
            final /* synthetic */ l$1 b;

            public void a(String str, String str2, Bundle bundle, long j) {
                try {
                    agVar.a(str, str2, bundle, j);
                } catch (Throwable e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public void a(final ai aiVar) {
        this.a.a(new AppMeasurement$b(this) {
            final /* synthetic */ l$1 b;

            public void a(String str, String str2, Bundle bundle, long j) {
                try {
                    aiVar.a(str, str2, bundle, j);
                } catch (Throwable e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public void a(String str, String str2, Bundle bundle, long j) {
        this.a.a(str, str2, bundle, j);
    }
}
