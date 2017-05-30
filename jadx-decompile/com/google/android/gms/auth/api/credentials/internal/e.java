package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ahl;

public final class e implements b {

    private static class a extends a {
        private ahl.b<Status> a;

        a(ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(status);
        }
    }

    private PasswordSpecification b(g gVar) {
        com.google.android.gms.auth.api.a.a d = ((g) gVar.a(com.google.android.gms.auth.api.a.a)).d();
        return (d == null || d.a() == null) ? PasswordSpecification.a : d.a();
    }

    public PendingIntent a(g gVar, HintRequest hintRequest) {
        d.a((Object) gVar, (Object) "client must not be null");
        d.a((Object) hintRequest, (Object) "request must not be null");
        d.b(gVar.a(com.google.android.gms.auth.api.a.e), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
        return PendingIntent.getActivity(gVar.b(), 2000, c.a(gVar.b(), hintRequest, b(gVar)), com.google.android.gms.drive.e.a_);
    }

    public i<Status> a(g gVar) {
        return gVar.b(new f<Status>(this, gVar) {
            final /* synthetic */ e a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, k kVar) {
                kVar.a(new a(this));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final Credential credential) {
        return gVar.b(new f<Status>(this, gVar) {
            final /* synthetic */ e b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, k kVar) {
                kVar.a(new a(this), new SaveRequest(credential));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<com.google.android.gms.auth.api.credentials.a> a(g gVar, final CredentialRequest credentialRequest) {
        return gVar.a(new f<com.google.android.gms.auth.api.credentials.a>(this, gVar) {
            final /* synthetic */ e b;

            protected com.google.android.gms.auth.api.credentials.a a(Status status) {
                return d.a(status);
            }

            protected void a(Context context, k kVar) {
                kVar.a(new a(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(Status status) {
                        this.a.b(d.a(status));
                    }

                    public void a(Status status, Credential credential) {
                        this.a.b(new d(status, credential));
                    }
                }, credentialRequest);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, final Credential credential) {
        return gVar.b(new f<Status>(this, gVar) {
            final /* synthetic */ e b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, k kVar) {
                kVar.a(new a(this), new DeleteRequest(credential));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
