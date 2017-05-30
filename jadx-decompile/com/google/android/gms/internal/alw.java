package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.f;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.internal.ahl.b;

public class alw implements f {

    private static class a extends com.google.android.gms.internal.akx.a {
        private final b<DataReadResult> a;
        private int b;
        private DataReadResult c;

        private a(b<DataReadResult> bVar) {
            this.b = 0;
            this.c = null;
            this.a = bVar;
        }

        public void a(DataReadResult dataReadResult) {
            synchronized (this) {
                if (Log.isLoggable("Fitness", 2)) {
                    Log.v("Fitness", "Received batch result " + this.b);
                }
                if (this.c == null) {
                    this.c = dataReadResult;
                } else {
                    this.c.a(dataReadResult);
                }
                this.b++;
                if (this.b == this.c.d()) {
                    this.a.a(this.c);
                }
            }
        }
    }

    private i<Status> a(g gVar, final DataSet dataSet, final boolean z) {
        d.a(dataSet, "Must set the data set");
        d.a(!dataSet.d().isEmpty(), "Cannot use an empty data set");
        d.a(dataSet.b().e(), "Must set the app package name for the data source");
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alw c;

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataInsertRequest(dataSet, new amb(this), z));
            }
        });
    }

    private i<DailyTotalResult> a(g gVar, final DataType dataType, final boolean z) {
        return gVar.a(new a<DailyTotalResult>(this, gVar) {
            final /* synthetic */ alw c;

            protected DailyTotalResult a(Status status) {
                return DailyTotalResult.a(status, dataType);
            }

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DailyTotalRequest(new com.google.android.gms.internal.akw.a(this) {
                    final /* synthetic */ AnonymousClass7 a;

                    {
                        this.a = r1;
                    }

                    public void a(DailyTotalResult dailyTotalResult) {
                        this.a.b(dailyTotalResult);
                    }
                }, dataType, z));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final PendingIntent pendingIntent) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alw b;

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataUpdateListenerUnregistrationRequest(pendingIntent, new amb(this)));
            }
        });
    }

    public i<Status> a(g gVar, DataSet dataSet) {
        return a(gVar, dataSet, false);
    }

    public i<DailyTotalResult> a(g gVar, DataType dataType) {
        return a(gVar, dataType, false);
    }

    public i<Status> a(g gVar, final DataDeleteRequest dataDeleteRequest) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alw b;

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataDeleteRequest(dataDeleteRequest, new amb(this)));
            }
        });
    }

    public i<DataReadResult> a(g gVar, final DataReadRequest dataReadRequest) {
        return gVar.a(new a<DataReadResult>(this, gVar) {
            final /* synthetic */ alw b;

            protected DataReadResult a(Status status) {
                return DataReadResult.a(status, dataReadRequest.a(), dataReadRequest.b());
            }

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataReadRequest(dataReadRequest, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alw b;

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataUpdateListenerRegistrationRequest(dataUpdateListenerRegistrationRequest, new amb(this)));
            }
        });
    }

    public i<Status> a(g gVar, final DataUpdateRequest dataUpdateRequest) {
        d.a(dataUpdateRequest.c(), "Must set the data set");
        d.a(dataUpdateRequest.a(), "Must set a non-zero value for startTimeMillis/startTime");
        d.a(dataUpdateRequest.b(), "Must set a non-zero value for endTimeMillis/endTime");
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ alw b;

            protected void a(akr com_google_android_gms_internal_akr) {
                ((alf) com_google_android_gms_internal_akr.G()).a(new DataUpdateRequest(dataUpdateRequest, new amb(this)));
            }
        });
    }

    public i<DailyTotalResult> b(g gVar, DataType dataType) {
        return a(gVar, dataType, true);
    }
}
