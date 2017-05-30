package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.a$a;
import com.google.android.gms.nearby.connection.a$b;
import com.google.android.gms.nearby.connection.a$c;
import com.google.android.gms.nearby.connection.a$d;
import com.google.android.gms.nearby.connection.a$e;
import java.util.List;

public final class ang implements com.google.android.gms.nearby.connection.a {
    public static final g<anf> a = new g();
    public static final com.google.android.gms.common.api.a.b<anf, com.google.android.gms.common.api.a.a.b> b = new com.google.android.gms.common.api.a.b<anf, com.google.android.gms.common.api.a.a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public anf a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new anf(context, looper, sVar, bVar2, cVar);
        }
    };

    private static abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, anf> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(com.google.android.gms.nearby.a.a, gVar);
        }
    }

    private static abstract class b extends a<a$e> {
        private b(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public a$e a(final Status status) {
            return new a$e(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public String b() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class c extends a<Status> {
        private c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static anf a(com.google.android.gms.common.api.g gVar, boolean z) {
        d.b(gVar != null, "GoogleApiClient parameter is required.");
        d.a(gVar.j(), "GoogleApiClient must be connected.");
        return b(gVar, z);
    }

    public static anf b(com.google.android.gms.common.api.g gVar, boolean z) {
        d.a(gVar.a(com.google.android.gms.nearby.a.a), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b = gVar.b(com.google.android.gms.nearby.a.a);
        if (!z || b) {
            return b ? (anf) gVar.a(a) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        }
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, String str, long j, a$c com_google_android_gms_nearby_connection_a_c) {
        final ail a = gVar.a(com_google_android_gms_nearby_connection_a_c);
        final String str2 = str;
        final long j2 = j;
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ang d;

            protected void a(anf com_google_android_gms_internal_anf) {
                com_google_android_gms_internal_anf.a((com.google.android.gms.internal.ahl.b) this, str2, j2, a);
            }
        });
    }

    public i<a$e> a(com.google.android.gms.common.api.g gVar, String str, AppMetadata appMetadata, long j, a$a com_google_android_gms_nearby_connection_a_a) {
        final ail a = gVar.a(com_google_android_gms_nearby_connection_a_a);
        final String str2 = str;
        final AppMetadata appMetadata2 = appMetadata;
        final long j2 = j;
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ ang e;

            protected void a(anf com_google_android_gms_internal_anf) {
                com_google_android_gms_internal_anf.a(this, str2, appMetadata2, j2, a);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, String str, String str2, byte[] bArr, a$b com_google_android_gms_nearby_connection_a_b, a$d com_google_android_gms_nearby_connection_a_d) {
        final ail a = gVar.a(com_google_android_gms_nearby_connection_a_b);
        final ail a2 = gVar.a(com_google_android_gms_nearby_connection_a_d);
        final String str3 = str;
        final String str4 = str2;
        final byte[] bArr2 = bArr;
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ang f;

            protected void a(anf com_google_android_gms_internal_anf) {
                com_google_android_gms_internal_anf.a(this, str3, str4, bArr2, a, a2);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, a$d com_google_android_gms_nearby_connection_a_d) {
        final ail a = gVar.a(com_google_android_gms_nearby_connection_a_d);
        final String str2 = str;
        final byte[] bArr2 = bArr;
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ang d;

            protected void a(anf com_google_android_gms_internal_anf) {
                com_google_android_gms_internal_anf.a((com.google.android.gms.internal.ahl.b) this, str2, bArr2, a);
            }
        });
    }

    public String a(com.google.android.gms.common.api.g gVar) {
        return a(gVar, true).h();
    }

    public void a(com.google.android.gms.common.api.g gVar, String str) {
        anf a = a(gVar, false);
        if (a != null) {
            a.a(str);
        }
    }

    public void a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr) {
        anf a = a(gVar, false);
        if (a != null) {
            a.a(new String[]{str}, bArr);
        }
    }

    public void a(com.google.android.gms.common.api.g gVar, List<String> list, byte[] bArr) {
        anf a = a(gVar, false);
        if (a != null) {
            a.a((String[]) list.toArray(new String[0]), bArr);
        }
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ ang b;

            protected void a(anf com_google_android_gms_internal_anf) {
                com_google_android_gms_internal_anf.a((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public String b(com.google.android.gms.common.api.g gVar) {
        return a(gVar, true).i();
    }

    public void b(com.google.android.gms.common.api.g gVar, String str, byte[] bArr) {
        anf a = a(gVar, false);
        if (a != null) {
            a.b(new String[]{str}, bArr);
        }
    }

    public void b(com.google.android.gms.common.api.g gVar, List<String> list, byte[] bArr) {
        anf a = a(gVar, false);
        if (a != null) {
            a.b((String[]) list.toArray(new String[0]), bArr);
        }
    }

    public void c(com.google.android.gms.common.api.g gVar) {
        anf a = a(gVar, false);
        if (a != null) {
            a.j();
        }
    }

    public void c(com.google.android.gms.common.api.g gVar, String str) {
        anf a = a(gVar, false);
        if (a != null) {
            a.b(str);
        }
    }

    public void d(com.google.android.gms.common.api.g gVar) {
        anf a = a(gVar, false);
        if (a != null) {
            a.k();
        }
    }
}
