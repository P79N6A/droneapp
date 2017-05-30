package com.google.android.gms.internal;

import android.accounts.Account;
import com.google.android.gms.auth.a.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public class aen implements com.google.android.gms.auth.a.b {
    private static final Status a = new Status(13);

    static class a extends com.google.android.gms.auth.a.c.a {
        a() {
        }

        public void a(Account account) {
            throw new UnsupportedOperationException();
        }

        public void a(boolean z) {
            throw new UnsupportedOperationException();
        }
    }

    static class b implements com.google.android.gms.auth.a.b.a {
        private final Status a;
        private final Account b;

        public b(Status status, Account account) {
            this.a = status;
            this.b = account;
        }

        public Status a() {
            return this.a;
        }

        public Account b() {
            return this.b;
        }
    }

    static class c implements m {
        private final Status a;

        public c(Status status) {
            this.a = status;
        }

        public Status a() {
            return this.a;
        }
    }

    public i<m> a(g gVar, final Account account) {
        return gVar.b(new com.google.android.gms.internal.ahl.a<m, aeo>(this, com.google.android.gms.auth.a.a.a, gVar) {
            final /* synthetic */ aen b;

            protected void a(aeo com_google_android_gms_internal_aeo) {
                ((d) com_google_android_gms_internal_aeo.G()).a(new a(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a(boolean z) {
                        this.a.b(new c(z ? Status.a : aen.a));
                    }
                }, account);
            }

            protected m b(Status status) {
                return new c(status);
            }
        });
    }

    public i<com.google.android.gms.auth.a.b.a> a(g gVar, final String str) {
        return gVar.b(new com.google.android.gms.internal.ahl.a<com.google.android.gms.auth.a.b.a, aeo>(this, com.google.android.gms.auth.a.a.a, gVar) {
            final /* synthetic */ aen b;

            protected com.google.android.gms.auth.a.b.a a(Status status) {
                return new b(status, null);
            }

            protected void a(aeo com_google_android_gms_internal_aeo) {
                ((d) com_google_android_gms_internal_aeo.G()).a(new a(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a(Account account) {
                        this.a.b(new b(account != null ? Status.a : aen.a, account));
                    }
                }, str);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public void a(g gVar, final boolean z) {
        gVar.b(new com.google.android.gms.internal.ahl.a<m, aeo>(this, com.google.android.gms.auth.a.a.a, gVar) {
            final /* synthetic */ aen b;

            protected void a(aeo com_google_android_gms_internal_aeo) {
                ((d) com_google_android_gms_internal_aeo.G()).a(z);
            }

            protected m b(Status status) {
                return null;
            }
        });
    }
}
