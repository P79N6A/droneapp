package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.i;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

public class ama implements i {

    private static class a extends com.google.android.gms.internal.alo.a {
        private final com.google.android.gms.internal.ahl.b<SessionReadResult> a;

        private a(com.google.android.gms.internal.ahl.b<SessionReadResult> bVar) {
            this.a = bVar;
        }

        public void a(SessionReadResult sessionReadResult) {
            this.a.a(sessionReadResult);
        }
    }

    private static class b extends com.google.android.gms.internal.alp.a {
        private final com.google.android.gms.internal.ahl.b<SessionStopResult> a;

        private b(com.google.android.gms.internal.ahl.b<SessionStopResult> bVar) {
            this.a = bVar;
        }

        public void a(SessionStopResult sessionStopResult) {
            this.a.a(sessionStopResult);
        }
    }

    private com.google.android.gms.common.api.i<SessionStopResult> a(g gVar, final String str, final String str2) {
        return gVar.b(new a<SessionStopResult>(this, gVar) {
            final /* synthetic */ ama c;

            protected SessionStopResult a(Status status) {
                return SessionStopResult.a(status);
            }

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionStopRequest(str, str2, new b(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public com.google.android.gms.common.api.i<Status> a(g gVar, PendingIntent pendingIntent) {
        return a(gVar, pendingIntent, 0);
    }

    public com.google.android.gms.common.api.i<Status> a(g gVar, final PendingIntent pendingIntent, final int i) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ama c;

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionRegistrationRequest(pendingIntent, new amb(this), i));
            }
        });
    }

    public com.google.android.gms.common.api.i<Status> a(g gVar, final Session session) {
        d.a(session, "Session cannot be null");
        d.b(session.b(TimeUnit.MILLISECONDS) == 0, "Cannot start a session which has already ended");
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ama b;

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionStartRequest(session, new amb(this)));
            }
        });
    }

    public com.google.android.gms.common.api.i<Status> a(g gVar, final SessionInsertRequest sessionInsertRequest) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ ama b;

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionInsertRequest(sessionInsertRequest, new amb(this)));
            }
        });
    }

    public com.google.android.gms.common.api.i<SessionReadResult> a(g gVar, final SessionReadRequest sessionReadRequest) {
        return gVar.a(new a<SessionReadResult>(this, gVar) {
            final /* synthetic */ ama b;

            protected SessionReadResult a(Status status) {
                return SessionReadResult.a(status);
            }

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionReadRequest(sessionReadRequest, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public com.google.android.gms.common.api.i<SessionStopResult> a(g gVar, String str) {
        return a(gVar, null, str);
    }

    public com.google.android.gms.common.api.i<Status> b(g gVar, final PendingIntent pendingIntent) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ama b;

            protected void a(akv com_google_android_gms_internal_akv) {
                ((alk) com_google_android_gms_internal_akv.G()).a(new SessionUnregistrationRequest(pendingIntent, new amb(this)));
            }
        });
    }
}
