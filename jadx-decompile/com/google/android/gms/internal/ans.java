package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.plus.b;
import com.google.android.gms.plus.b$a;
import com.google.android.gms.plus.c;
import com.google.android.gms.plus.c$b;
import com.google.android.gms.plus.internal.e;
import java.util.Collection;

public final class ans implements b {

    private static abstract class a extends c$b<b$a> {
        private a(g gVar) {
            super(gVar);
        }

        public b$a a(final Status status) {
            return new b$a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.plus.a.a.b c() {
                    return null;
                }

                public String d() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    @SuppressLint({"MissingRemoteException"})
    public i<b$a> a(g gVar, final int i, final String str) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ ans c;

            protected void a(e eVar) {
                a(eVar.a(this, i, str));
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public i<b$a> a(g gVar, final String str) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ ans b;

            protected void a(e eVar) {
                a(eVar.a((ahl.b) this, str));
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public i<b$a> a(g gVar, final Collection<String> collection) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ ans b;

            protected void a(e eVar) {
                eVar.a((ahl.b) this, collection);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public i<b$a> a(g gVar, final String... strArr) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ ans b;

            protected void a(e eVar) {
                eVar.a((ahl.b) this, strArr);
            }
        });
    }

    public com.google.android.gms.plus.a.a.a a(g gVar) {
        return c.a(gVar, true).i();
    }

    @SuppressLint({"MissingRemoteException"})
    public i<b$a> b(g gVar) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ ans a;

            protected void a(e eVar) {
                eVar.a((ahl.b) this);
            }
        });
    }
}
