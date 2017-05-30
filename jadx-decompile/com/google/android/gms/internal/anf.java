package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.a$a;
import com.google.android.gms.nearby.connection.a$b;
import com.google.android.gms.nearby.connection.a$c;
import com.google.android.gms.nearby.connection.a$d;
import com.google.android.gms.nearby.connection.a$e;
import com.xiaomi.market.sdk.j;

public final class anf extends w<ani> {
    private final long a = ((long) hashCode());

    private static class b extends ane {
        private final ail<a$d> a;

        b(ail<a$d> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d;
        }

        public void a(final String str, final byte[] bArr, final boolean z) {
            this.a.a(new com.google.android.gms.internal.ail.c<a$d>(this) {
                final /* synthetic */ b d;

                public void a() {
                }

                public void a(a$d com_google_android_gms_nearby_connection_a_d) {
                    com_google_android_gms_nearby_connection_a_d.a(str, bArr, z);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$d) obj);
                }
            });
        }

        public void b(final String str) {
            this.a.a(new com.google.android.gms.internal.ail.c<a$d>(this) {
                final /* synthetic */ b b;

                public void a() {
                }

                public void a(a$d com_google_android_gms_nearby_connection_a_d) {
                    com_google_android_gms_nearby_connection_a_d.a(str);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$d) obj);
                }
            });
        }
    }

    private static final class a extends b {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        public a(com.google.android.gms.internal.ahl.b<Status> bVar, ail<a$d> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d) {
            super(com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d);
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar);
        }

        public void c(int i) {
            this.a.a(new Status(i));
        }
    }

    private static class c extends ane {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        c(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void d(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class d extends b {
        private final com.google.android.gms.internal.ahl.b<Status> a;
        private final ail<a$b> b;

        public d(com.google.android.gms.internal.ahl.b<Status> bVar, ail<a$b> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_b, ail<a$d> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d) {
            super(com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d);
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar);
            this.b = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_b);
        }

        public void a(final String str, final int i, final byte[] bArr) {
            this.b.a(new com.google.android.gms.internal.ail.c<a$b>(this) {
                final /* synthetic */ d d;

                public void a() {
                }

                public void a(a$b com_google_android_gms_nearby_connection_a_b) {
                    com_google_android_gms_nearby_connection_a_b.a(str, new Status(i), bArr);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$b) obj);
                }
            });
        }

        public void b(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class e extends ane {
        private final com.google.android.gms.internal.ahl.b<a$e> a;
        private final ail<a$a> b;

        e(com.google.android.gms.internal.ahl.b<a$e> bVar, ail<a$a> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_a) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar);
            this.b = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_a);
        }

        public void a(int i, String str) {
            this.a.a(new f(new Status(i), str));
        }

        public void a(String str, String str2, String str3, byte[] bArr) {
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final byte[] bArr2 = bArr;
            this.b.a(new com.google.android.gms.internal.ail.c<a$a>(this) {
                final /* synthetic */ e e;

                public void a() {
                }

                public void a(a$a com_google_android_gms_nearby_connection_a_a) {
                    com_google_android_gms_nearby_connection_a_a.a(str4, str5, str6, bArr2);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$a) obj);
                }
            });
        }
    }

    private static final class f implements a$e {
        private final Status a;
        private final String b;

        f(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class g extends ane {
        private final com.google.android.gms.internal.ahl.b<Status> a;
        private final ail<a$c> b;

        g(com.google.android.gms.internal.ahl.b<Status> bVar, ail<a$c> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_c) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar);
            this.b = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_c);
        }

        public void a(int i) {
            this.a.a(new Status(i));
        }

        public void a(final String str) {
            this.b.a(new com.google.android.gms.internal.ail.c<a$c>(this) {
                final /* synthetic */ g b;

                public void a() {
                }

                public void a(a$c com_google_android_gms_nearby_connection_a_c) {
                    com_google_android_gms_nearby_connection_a_c.a(str);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$c) obj);
                }
            });
        }

        public void a(String str, String str2, String str3, String str4) {
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final String str8 = str4;
            this.b.a(new com.google.android.gms.internal.ail.c<a$c>(this) {
                final /* synthetic */ g e;

                public void a() {
                }

                public void a(a$c com_google_android_gms_nearby_connection_a_c) {
                    com_google_android_gms_nearby_connection_a_c.a(str5, str6, str7, str8);
                }

                public /* synthetic */ void a(Object obj) {
                    a((a$c) obj);
                }
            });
        }
    }

    public anf(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 54, sVar, bVar, cVar);
    }

    protected ani a(IBinder iBinder) {
        return com.google.android.gms.internal.ani.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, String str) {
        ((ani) G()).a(new c(bVar), str, this.a);
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, String str, long j, ail<a$c> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_c) {
        ((ani) G()).a(new g(bVar, com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_c), str, j, this.a);
    }

    public void a(com.google.android.gms.internal.ahl.b<a$e> bVar, String str, AppMetadata appMetadata, long j, ail<a$a> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_a) {
        ((ani) G()).a(new e(bVar, com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_a), str, appMetadata, j, this.a);
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, String str, String str2, byte[] bArr, ail<a$b> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_b, ail<a$d> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d) {
        ((ani) G()).a(new d(bVar, com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_b, com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d), str, str2, bArr, this.a);
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, String str, byte[] bArr, ail<a$d> com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d) {
        ((ani) G()).a(new a(bVar, com_google_android_gms_internal_ail_com_google_android_gms_nearby_connection_a_d), str, bArr, this.a);
    }

    public void a(String str) {
        try {
            ((ani) G()).a(str, this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", e);
        }
    }

    public void a(String[] strArr, byte[] bArr) {
        try {
            ((ani) G()).a(strArr, bArr, this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", e);
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    public void b(String str) {
        try {
            ((ani) G()).b(str, this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", e);
        }
    }

    public void b(String[] strArr, byte[] bArr) {
        try {
            ((ani) G()).b(strArr, bArr, this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", e);
        }
    }

    protected Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putLong(j.aa, this.a);
        return bundle;
    }

    public void f() {
        if (t()) {
            try {
                ((ani) G()).c(this.a);
            } catch (Throwable e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.f();
    }

    public String h() {
        try {
            return ((ani) G()).d(this.a);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String i() {
        try {
            return ((ani) G()).a();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void j() {
        try {
            ((ani) G()).a(this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", e);
        }
    }

    public void k() {
        try {
            ((ani) G()).b(this.a);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", e);
        }
    }
}
