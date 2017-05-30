package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.a.g;
import com.google.android.gms.wearable.o;
import java.util.Map;
import java.util.Set;

public class bb implements com.google.android.gms.wearable.a {

    class AnonymousClass5 implements a<com.google.android.gms.wearable.a.c> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass5(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, com.google.android.gms.wearable.a.c cVar, ail<com.google.android.gms.wearable.a.c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c) {
            arVar.a((com.google.android.gms.internal.ahl.b) bVar, cVar, (ail) com_google_android_gms_internal_ail_com_google_android_gms_wearable_a_c, this.a);
        }
    }

    public static class a implements com.google.android.gms.wearable.a.a, g {
        private final Status a;

        public a(Status status) {
            this.a = status;
        }

        public Status a() {
            return this.a;
        }
    }

    private static class b implements com.google.android.gms.wearable.a.c {
        final com.google.android.gms.wearable.a.c a;
        final String b;

        b(com.google.android.gms.wearable.a.c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        public void a(com.google.android.gms.wearable.b bVar) {
            this.a.a(bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) ? this.b.equals(bVar.b) : false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public static class c implements com.google.android.gms.wearable.b {
        private final String a;
        private final Set<o> b;

        public c(com.google.android.gms.wearable.b bVar) {
            this(bVar.a(), bVar.b());
        }

        public c(String str, Set<o> set) {
            this.a = str;
            this.b = set;
        }

        public String a() {
            return this.a;
        }

        public Set<o> b() {
            return this.b;
        }
    }

    public static class d implements com.google.android.gms.wearable.a.d {
        private final Status a;
        private final Map<String, com.google.android.gms.wearable.b> b;

        public d(Status status, Map<String, com.google.android.gms.wearable.b> map) {
            this.a = status;
            this.b = map;
        }

        public Status a() {
            return this.a;
        }

        public Map<String, com.google.android.gms.wearable.b> b() {
            return this.b;
        }
    }

    public static class e implements com.google.android.gms.wearable.a.e {
        private final com.google.android.gms.wearable.b a;
        private final Status b;

        public e(Status status, com.google.android.gms.wearable.b bVar) {
            this.b = status;
            this.a = bVar;
        }

        public Status a() {
            return this.b;
        }

        public com.google.android.gms.wearable.b b() {
            return this.a;
        }
    }

    private static final class f extends ba<Status> {
        private com.google.android.gms.wearable.a.c a;

        private f(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar) {
            super(gVar);
            this.a = cVar;
        }

        public Status a(Status status) {
            this.a = null;
            return status;
        }

        protected void a(ar arVar) {
            arVar.a((com.google.android.gms.internal.ahl.b) this, this.a);
            this.a = null;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private i<Status> a(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar, IntentFilter[] intentFilterArr) {
        return ab.a(gVar, a(intentFilterArr), cVar);
    }

    private static a<com.google.android.gms.wearable.a.c> a(IntentFilter[] intentFilterArr) {
        return new AnonymousClass5(intentFilterArr);
    }

    public i<com.google.android.gms.wearable.a.d> a(com.google.android.gms.common.api.g gVar, final int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        com.google.android.gms.common.internal.d.b(z);
        return gVar.a(new ba<com.google.android.gms.wearable.a.d>(this, gVar) {
            final /* synthetic */ bb b;

            protected com.google.android.gms.wearable.a.d a(Status status) {
                return new d(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, i);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar) {
        return gVar.a(new f(gVar, cVar));
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar, Uri uri, int i) {
        com.google.android.gms.common.internal.d.b(uri != null, "uri must not be null");
        boolean z = i == 0 || i == 1;
        com.google.android.gms.common.internal.d.b(z, "invalid filter type");
        return a(gVar, cVar, new IntentFilter[]{ap.a(com.google.android.gms.wearable.a.a, uri, i)});
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar, String str) {
        String str2;
        com.google.android.gms.common.internal.d.b(str != null, "capability must not be null");
        com.google.android.gms.wearable.a.c bVar = new b(cVar, str);
        IntentFilter a = ap.a(com.google.android.gms.wearable.a.a);
        if (str.startsWith("/")) {
            str2 = str;
        } else {
            String str3 = "/";
            str2 = String.valueOf(str);
            str2 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
        }
        a.addDataPath(str2, 0);
        return a(gVar, bVar, new IntentFilter[]{a});
    }

    public i<com.google.android.gms.wearable.a.a> a(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.a(new ba<com.google.android.gms.wearable.a.a>(this, gVar) {
            final /* synthetic */ bb b;

            protected com.google.android.gms.wearable.a.a a(Status status) {
                return new a(status);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, str);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<com.google.android.gms.wearable.a.e> a(com.google.android.gms.common.api.g gVar, final String str, final int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        com.google.android.gms.common.internal.d.b(z);
        return gVar.a(new ba<com.google.android.gms.wearable.a.e>(this, gVar) {
            final /* synthetic */ bb c;

            protected com.google.android.gms.wearable.a.e a(Status status) {
                return new e(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, str, i);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, com.google.android.gms.wearable.a.c cVar, String str) {
        return gVar.a(new f(gVar, new b(cVar, str)));
    }

    public i<g> b(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.a(new ba<g>(this, gVar) {
            final /* synthetic */ bb b;

            protected g a(Status status) {
                return new a(status);
            }

            protected void a(ar arVar) {
                arVar.b(this, str);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
