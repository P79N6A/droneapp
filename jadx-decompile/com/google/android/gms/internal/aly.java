package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.g;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import com.google.android.gms.internal.ahl.b;

public class aly implements g {

    private static class a extends com.google.android.gms.internal.all.a {
        private final b<ListSubscriptionsResult> a;

        private a(b<ListSubscriptionsResult> bVar) {
            this.a = bVar;
        }

        public void a(ListSubscriptionsResult listSubscriptionsResult) {
            this.a.a(listSubscriptionsResult);
        }
    }

    private i<Status> b(com.google.android.gms.common.api.g gVar, final Subscription subscription) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ aly b;

            protected void a(akt com_google_android_gms_internal_akt) {
                ((alh) com_google_android_gms_internal_akt.G()).a(new SubscribeRequest(subscription, false, new amb(this)));
            }
        });
    }

    public i<ListSubscriptionsResult> a(com.google.android.gms.common.api.g gVar) {
        return gVar.a(new a<ListSubscriptionsResult>(this, gVar) {
            final /* synthetic */ aly a;

            protected ListSubscriptionsResult a(Status status) {
                return ListSubscriptionsResult.a(status);
            }

            protected void a(akt com_google_android_gms_internal_akt) {
                ((alh) com_google_android_gms_internal_akt.G()).a(new ListSubscriptionsRequest(null, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, DataSource dataSource) {
        return b(gVar, new com.google.android.gms.fitness.data.Subscription.a().a(dataSource).a());
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, DataType dataType) {
        return b(gVar, new com.google.android.gms.fitness.data.Subscription.a().a(dataType).a());
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, Subscription subscription) {
        return subscription.b() == null ? b(gVar, subscription.a()) : b(gVar, subscription.b());
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final DataSource dataSource) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ aly b;

            protected void a(akt com_google_android_gms_internal_akt) {
                ((alh) com_google_android_gms_internal_akt.G()).a(new UnsubscribeRequest(null, dataSource, new amb(this)));
            }
        });
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final DataType dataType) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ aly b;

            protected void a(akt com_google_android_gms_internal_akt) {
                ((alh) com_google_android_gms_internal_akt.G()).a(new UnsubscribeRequest(dataType, null, new amb(this)));
            }
        });
    }

    public i<ListSubscriptionsResult> c(com.google.android.gms.common.api.g gVar, final DataType dataType) {
        return gVar.a(new a<ListSubscriptionsResult>(this, gVar) {
            final /* synthetic */ aly b;

            protected ListSubscriptionsResult a(Status status) {
                return ListSubscriptionsResult.a(status);
            }

            protected void a(akt com_google_android_gms_internal_akt) {
                ((alh) com_google_android_gms_internal_akt.G()).a(new ListSubscriptionsRequest(dataType, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
