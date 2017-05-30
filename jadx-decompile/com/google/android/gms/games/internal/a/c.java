package com.google.android.gms.games.internal.a;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;

public final class c implements com.google.android.gms.games.event.c {

    private static abstract class a extends c$a<com.google.android.gms.games.event.c.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.event.c.a a(final Status status) {
            return new com.google.android.gms.games.event.c.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.event.a c() {
                    return new com.google.android.gms.games.event.a(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class b extends c$a<m> {
        private b(g gVar) {
            super(gVar);
        }

        public m b(final Status status) {
            return new m(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }
            };
        }
    }

    public i<com.google.android.gms.games.event.c.a> a(g gVar, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ c b;

            public void a(d dVar) {
                dVar.d((com.google.android.gms.internal.ahl.b) this, z);
            }
        });
    }

    public i<com.google.android.gms.games.event.c.a> a(g gVar, final boolean z, final String... strArr) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ c c;

            public void a(d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, z, strArr);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public void a(g gVar, final String str, final int i) {
        d b = com.google.android.gms.games.c.b(gVar, false);
        if (b != null) {
            if (b.t()) {
                b.a(str, i);
            } else {
                gVar.b(new b(this, gVar) {
                    final /* synthetic */ c c;

                    public void a(d dVar) {
                        dVar.a(str, i);
                    }
                });
            }
        }
    }
}
