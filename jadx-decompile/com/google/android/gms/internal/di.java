package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class di {
    final Map<String, c<dv>> a;
    private final Context b;
    private final dn c;
    private final e d;
    private String e;
    private final Map<String, dt> f;

    public interface a {
        void a(dm dmVar);
    }

    class b extends dh {
        final /* synthetic */ di e;
        private final a f;
        private final List<Integer> g;
        private final int h;

        b(di diVar, int i, dl dlVar, dj djVar, List<Integer> list, int i2, a aVar, @Nullable aos com_google_android_gms_internal_aos) {
            this.e = diVar;
            super(i, dlVar, djVar, com_google_android_gms_internal_aos);
            this.f = aVar;
            this.g = list;
            this.h = i2;
        }

        protected void a(dm dmVar) {
            String valueOf;
            Object obj;
            String valueOf2;
            if (dmVar.a() == Status.a) {
                String str = "Container resource successfully loaded from ";
                valueOf = String.valueOf(dmVar.e());
                aph.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                int i;
                if (dmVar.d() == 0) {
                    com.google.android.gms.internal.dm.a b = dmVar.b();
                    if (b.b().e()) {
                        obj = 1;
                    } else {
                        this.e.a(dmVar.a(), b);
                        if (b.a() != null && b.a().length > 0) {
                            this.e.c.a(b.b().d(), b.a());
                            i = 1;
                        }
                    }
                } else {
                    i = 1;
                }
                if (obj == null) {
                    this.f.a(dmVar);
                }
                valueOf2 = String.valueOf(dmVar.e());
                valueOf = dmVar.a().f() ? "SUCCESS" : "FAILURE";
                aph.d(new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf).length()).append("Cannot fetch a valid resource from ").append(valueOf2).append(". Response status: ").append(valueOf).toString());
                if (dmVar.a().f()) {
                    valueOf2 = "Response source: ";
                    valueOf = String.valueOf(dmVar.e());
                    aph.d(valueOf.length() == 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                    aph.d("Response size: " + dmVar.b().a().length);
                }
                this.e.a(this.a, this.g, this.h + 1, this.f, this.d);
                return;
            }
            obj = null;
            if (obj == null) {
                valueOf2 = String.valueOf(dmVar.e());
                if (dmVar.a().f()) {
                }
                aph.d(new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf).length()).append("Cannot fetch a valid resource from ").append(valueOf2).append(". Response status: ").append(valueOf).toString());
                if (dmVar.a().f()) {
                    valueOf2 = "Response source: ";
                    valueOf = String.valueOf(dmVar.e());
                    if (valueOf.length() == 0) {
                    }
                    aph.d(valueOf.length() == 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                    aph.d("Response size: " + dmVar.b().a().length);
                }
                this.e.a(this.a, this.g, this.h + 1, this.f, this.d);
                return;
            }
            this.f.a(dmVar);
        }
    }

    static class c<T> {
        private Status a;
        private T b;
        private long c;

        public c(Status status, T t, long j) {
            this.a = status;
            this.b = t;
            this.c = j;
        }

        public long a() {
            return this.c;
        }

        public void a(long j) {
            this.c = j;
        }

        public void a(Status status) {
            this.a = status;
        }

        public void a(T t) {
            this.b = t;
        }
    }

    public di(Context context) {
        this(context, new HashMap(), new dn(context), h.d());
    }

    di(Context context, Map<String, dt> map, dn dnVar, e eVar) {
        this.e = null;
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        this.d = eVar;
        this.c = dnVar;
        this.f = map;
    }

    private void a(dl dlVar, List<Integer> list, int i, a aVar) {
        dd a = dlVar.a();
        String valueOf = String.valueOf(a.a());
        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 52).append("Attempting to fetch container ").append(valueOf).append(" from a saved resource").toString());
        this.c.a(a.d(), new b(this, 1, dlVar, dk.a, list, i, aVar, null));
    }

    private void b(dl dlVar, List<Integer> list, int i, a aVar) {
        dd a = dlVar.a();
        String valueOf = String.valueOf(a.a());
        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Attempting to fetch container ").append(valueOf).append(" from the default resource").toString());
        this.c.a(a.d(), a.b(), new b(this, 2, dlVar, dk.a, list, i, aVar, null));
    }

    private void b(dl dlVar, List<Integer> list, int i, a aVar, @Nullable aos com_google_android_gms_internal_aos) {
        Object obj;
        dd a = dlVar.a();
        c cVar = (c) this.a.get(a.a());
        if (dlVar.a().e()) {
            obj = 1;
        } else {
            obj = (cVar != null ? cVar.a() : this.c.a(a.a())) + 900000 < this.d.a() ? 1 : null;
        }
        if (obj != null) {
            dt dtVar;
            dt dtVar2 = (dt) this.f.get(dlVar.b());
            if (dtVar2 == null) {
                dtVar2 = null == null ? new dt() : new dt(this.e);
                this.f.put(dlVar.b(), dtVar2);
                dtVar = dtVar2;
            } else {
                dtVar = dtVar2;
            }
            String valueOf = String.valueOf(a.a());
            aph.d(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Attempting to fetch container ").append(valueOf).append(" from network").toString());
            dtVar.a(this.b, dlVar, 0, new b(this, 0, dlVar, dk.a, list, i, aVar, com_google_android_gms_internal_aos));
            return;
        }
        a(dlVar, list, i + 1, aVar, com_google_android_gms_internal_aos);
    }

    void a(Status status, com.google.android.gms.internal.dm.a aVar) {
        String a = aVar.b().a();
        Object c = aVar.c();
        if (this.a.containsKey(a)) {
            c cVar = (c) this.a.get(a);
            cVar.a(this.d.a());
            if (status == Status.a) {
                cVar.a(status);
                cVar.a(c);
                return;
            }
            return;
        }
        this.a.put(a, new c(status, c, this.d.a()));
    }

    void a(dl dlVar, List<Integer> list, int i, a aVar, @Nullable aos com_google_android_gms_internal_aos) {
        if (i == 0) {
            aph.d("Starting to fetch a new resource");
        }
        if (i >= list.size()) {
            String str = "There is no valid resource for the container: ";
            String valueOf = String.valueOf(dlVar.a().a());
            valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            aph.d(valueOf);
            aVar.a(new dm(new Status(16, valueOf), ((Integer) list.get(i - 1)).intValue()));
            return;
        }
        switch (((Integer) list.get(i)).intValue()) {
            case 0:
                b(dlVar, list, i, aVar, com_google_android_gms_internal_aos);
                return;
            case 1:
                a(dlVar, list, i, aVar);
                return;
            case 2:
                b(dlVar, list, i, aVar);
                return;
            default:
                throw new UnsupportedOperationException("Unknown fetching source: " + i);
        }
    }

    public void a(String str, @Nullable String str2, @Nullable String str3, List<Integer> list, a aVar, aos com_google_android_gms_internal_aos) {
        d.b(!list.isEmpty());
        a(new dl().a(new dd(str, str2, str3, a(str), apn.a().c())), Collections.unmodifiableList(list), 0, aVar, com_google_android_gms_internal_aos);
    }

    boolean a(String str) {
        apn a = apn.a();
        return a.b() && str.equals(a.d());
    }
}
