package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aio;
import java.util.HashSet;

public class b implements com.google.android.gms.auth.api.signin.a {

    private abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, c> {
        final /* synthetic */ b c;

        public a(b bVar, g gVar) {
            this.c = bVar;
            super(com.google.android.gms.auth.api.a.f, gVar);
        }
    }

    private h<com.google.android.gms.auth.api.signin.b> a(g gVar, final GoogleSignInOptions googleSignInOptions) {
        Log.d("GoogleSignInApiImpl", "trySilentSignIn");
        return new aio(gVar.a(new a<com.google.android.gms.auth.api.signin.b>(this, gVar) {
            final /* synthetic */ b b;

            protected com.google.android.gms.auth.api.signin.b a(Status status) {
                return new com.google.android.gms.auth.api.signin.b(null, status);
            }

            protected void a(c cVar) {
                final j a = j.a(cVar.B());
                ((g) cVar.G()).a(new a(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void a(GoogleSignInAccount googleSignInAccount, Status status) {
                        if (googleSignInAccount != null) {
                            a.b(googleSignInAccount, googleSignInOptions);
                        }
                        this.b.b(new com.google.android.gms.auth.api.signin.b(googleSignInAccount, status));
                    }
                }, googleSignInOptions);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        }));
    }

    private boolean a(Account account, Account account2) {
        return account == null ? account2 == null : account.equals(account2);
    }

    private GoogleSignInOptions e(g gVar) {
        return ((c) gVar.a(com.google.android.gms.auth.api.a.c)).i_();
    }

    public Intent a(g gVar) {
        d.a((Object) gVar);
        return ((c) gVar.a(com.google.android.gms.auth.api.a.c)).e();
    }

    public com.google.android.gms.auth.api.signin.b a(Context context, GoogleSignInOptions googleSignInOptions) {
        Log.d("GoogleSignInApiImpl", "getSavedSignInResultIfEligible");
        d.a((Object) googleSignInOptions);
        j a = j.a(context);
        GoogleSignInOptions b = a.b();
        if (b == null || !a(b.c(), googleSignInOptions.c()) || googleSignInOptions.e()) {
            return null;
        }
        if ((googleSignInOptions.d() && (!b.d() || !googleSignInOptions.g().equals(b.g()))) || !new HashSet(b.a()).containsAll(new HashSet(googleSignInOptions.a()))) {
            return null;
        }
        GoogleSignInAccount a2 = a.a();
        return (a2 == null || a2.j()) ? null : new com.google.android.gms.auth.api.signin.b(a2, Status.a);
    }

    public com.google.android.gms.auth.api.signin.b a(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.a;
        }
        return new com.google.android.gms.auth.api.signin.b(googleSignInAccount, status);
    }

    public h<com.google.android.gms.auth.api.signin.b> b(g gVar) {
        GoogleSignInOptions e = e(gVar);
        m a = a(gVar.b(), e);
        return a != null ? j.b(a, gVar) : a(gVar, e);
    }

    public i<Status> c(g gVar) {
        j.a(gVar.b()).c();
        for (g d : g.a()) {
            d.d();
        }
        return gVar.b(new a<Status>(this, gVar) {
            final /* synthetic */ b a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(c cVar) {
                ((g) cVar.G()).b(new a(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a(Status status) {
                        this.a.b((m) status);
                    }
                }, cVar.i_());
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> d(g gVar) {
        j.a(gVar.b()).c();
        for (g d : g.a()) {
            d.d();
        }
        return gVar.b(new a<Status>(this, gVar) {
            final /* synthetic */ b a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(c cVar) {
                ((g) cVar.G()).c(new a(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void b(Status status) {
                        this.a.b((m) status);
                    }
                }, cVar.i_());
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
