package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.fitness.data.y;
import com.google.android.gms.fitness.h;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

public class alz implements h {

    private interface a {
        void a();
    }

    private static class b extends com.google.android.gms.internal.aky.a {
        private final com.google.android.gms.internal.ahl.b<DataSourcesResult> a;

        private b(com.google.android.gms.internal.ahl.b<DataSourcesResult> bVar) {
            this.a = bVar;
        }

        public void a(DataSourcesResult dataSourcesResult) {
            this.a.a(dataSourcesResult);
        }
    }

    private static class c extends com.google.android.gms.internal.alq.a {
        private final com.google.android.gms.internal.ahl.b<Status> a;
        private final a b;

        private c(com.google.android.gms.internal.ahl.b<Status> bVar, a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        public void a(Status status) {
            if (this.b != null && status.f()) {
                this.b.a();
            }
            this.a.a(status);
        }
    }

    private i<Status> a(g gVar, y yVar, PendingIntent pendingIntent, a aVar) {
        final a aVar2 = aVar;
        final y yVar2 = yVar;
        final PendingIntent pendingIntent2 = pendingIntent;
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alz d;

            protected Status a(Status status) {
                return status;
            }

            protected void a(aku com_google_android_gms_internal_aku) {
                ((alj) com_google_android_gms_internal_aku.G()).a(new SensorUnregistrationRequest(yVar2, pendingIntent2, new c(this, aVar2)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    private i<Status> a(g gVar, com.google.android.gms.fitness.request.c cVar, y yVar, PendingIntent pendingIntent) {
        final com.google.android.gms.fitness.request.c cVar2 = cVar;
        final y yVar2 = yVar;
        final PendingIntent pendingIntent2 = pendingIntent;
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alz d;

            protected Status a(Status status) {
                return status;
            }

            protected void a(aku com_google_android_gms_internal_aku) {
                ((alj) com_google_android_gms_internal_aku.G()).a(new SensorRegistrationRequest(cVar2, yVar2, pendingIntent2, new amb(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, PendingIntent pendingIntent) {
        return a(gVar, null, pendingIntent, null);
    }

    public i<DataSourcesResult> a(g gVar, final DataSourcesRequest dataSourcesRequest) {
        return gVar.a(new a<DataSourcesResult>(this, gVar) {
            final /* synthetic */ alz b;

            protected DataSourcesResult a(Status status) {
                return DataSourcesResult.a(status);
            }

            protected void a(aku com_google_android_gms_internal_aku) {
                ((alj) com_google_android_gms_internal_aku.G()).a(new DataSourcesRequest(dataSourcesRequest, new b(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final com.google.android.gms.fitness.request.b bVar) {
        y b = com.google.android.gms.fitness.request.aj.a.a().b(bVar);
        return b == null ? j.a(Status.a, gVar) : a(gVar, b, null, new a(this) {
            final /* synthetic */ alz b;

            public void a() {
                com.google.android.gms.fitness.request.aj.a.a().c(bVar);
            }
        });
    }

    public i<Status> a(g gVar, com.google.android.gms.fitness.request.c cVar, PendingIntent pendingIntent) {
        return a(gVar, cVar, null, pendingIntent);
    }

    public i<Status> a(g gVar, com.google.android.gms.fitness.request.c cVar, com.google.android.gms.fitness.request.b bVar) {
        return a(gVar, cVar, com.google.android.gms.fitness.request.aj.a.a().a(bVar), null);
    }
}
