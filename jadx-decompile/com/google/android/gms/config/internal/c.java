package com.google.android.gms.config.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.games.f;
import com.google.android.gms.internal.aie;
import com.google.android.gms.internal.ajq;
import com.google.android.gms.internal.ajr;
import com.google.android.gms.internal.ajs;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class c implements ajr {
    private static final Charset a = Charset.forName("UTF-8");
    private static final Pattern b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    private static final Pattern c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    static abstract class b<R extends m> extends com.google.android.gms.internal.ahl.a<R, e> {
        public b(g gVar) {
            super(ajq.c, gVar);
        }

        protected abstract void a(Context context, j jVar);

        protected final void a(e eVar) {
            a(eVar.B(), (j) eVar.G());
        }
    }

    static abstract class c extends b<com.google.android.gms.internal.ajr.b> {
        protected i c = new a(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
                if (fetchConfigIpcResponse.b() == f.H || fetchConfigIpcResponse.b() == f.M) {
                    this.a.b(new d(c.b(fetchConfigIpcResponse.b()), c.b(fetchConfigIpcResponse), fetchConfigIpcResponse.d()));
                } else {
                    this.a.b(new d(c.b(fetchConfigIpcResponse.b()), c.b(fetchConfigIpcResponse)));
                }
            }
        };

        public c(g gVar) {
            super(gVar);
        }
    }

    static abstract class a extends com.google.android.gms.config.internal.i.a {
        a() {
        }

        public void a(Status status) {
            throw new UnsupportedOperationException();
        }

        public void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
            throw new UnsupportedOperationException();
        }

        public void a(Status status, Map map) {
            throw new UnsupportedOperationException();
        }

        public void a(Status status, byte[] bArr) {
            throw new UnsupportedOperationException();
        }
    }

    public static class d implements com.google.android.gms.internal.ajr.b {
        private final Map<String, TreeMap<String, byte[]>> a;
        private final Status b;
        private final long c;

        public d(Status status, Map<String, TreeMap<String, byte[]>> map) {
            this(status, map, -1);
        }

        public d(Status status, Map<String, TreeMap<String, byte[]>> map, long j) {
            this.b = status;
            this.a = map;
            this.c = j;
        }

        public Status a() {
            return this.b;
        }

        public boolean a(String str, String str2) {
            return (this.a == null || this.a.get(str2) == null) ? false : ((TreeMap) this.a.get(str2)).get(str) != null;
        }

        public byte[] a(String str, byte[] bArr, String str2) {
            return a(str, str2) ? (byte[]) ((TreeMap) this.a.get(str2)).get(str) : bArr;
        }

        public long b() {
            return this.c;
        }

        public Map<String, Set<String>> c() {
            Map<String, Set<String>> hashMap = new HashMap();
            if (this.a != null) {
                for (String str : this.a.keySet()) {
                    Map map = (Map) this.a.get(str);
                    if (map != null) {
                        hashMap.put(str, map.keySet());
                    }
                }
            }
            return hashMap;
        }
    }

    private static Status b(int i) {
        return new Status(i, ajs.a(i));
    }

    private static HashMap<String, TreeMap<String, byte[]>> b(FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse == null) {
            return null;
        }
        DataHolder c = fetchConfigIpcResponse.c();
        if (c == null) {
            return null;
        }
        PackageConfigTable packageConfigTable = (PackageConfigTable) new k(c, PackageConfigTable.CREATOR).a(0);
        fetchConfigIpcResponse.e();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap();
        for (String str : packageConfigTable.b().keySet()) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(str, treeMap);
            Bundle bundle = packageConfigTable.b().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    public i<com.google.android.gms.internal.ajr.b> a(g gVar, final com.google.android.gms.internal.ajr.a aVar) {
        return (gVar == null || aVar == null) ? null : gVar.a(new c(this, gVar) {
            final /* synthetic */ c b;

            protected com.google.android.gms.internal.ajr.b a(Status status) {
                return new d(status, new HashMap());
            }

            protected void a(Context context, j jVar) {
                String b;
                String c;
                Throwable e;
                com.google.android.gms.common.data.DataHolder.a h = k.h();
                for (Entry entry : aVar.b().entrySet()) {
                    k.a(h, new CustomVariable((String) entry.getKey(), (String) entry.getValue()));
                }
                DataHolder a = h.a(0);
                String a2 = aie.a(context) == Status.a ? aie.a() : null;
                try {
                    b = com.google.firebase.iid.b.a().b();
                    try {
                        c = com.google.firebase.iid.b.a().c();
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (Log.isLoggable("ConfigApiImpl", 3)) {
                            Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                        }
                        c = null;
                        jVar.a(this.c, new FetchConfigIpcRequest(context.getPackageName(), aVar.a(), a, a2, b, c, null, aVar.c(), b.b(context)));
                        a.close();
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    b = null;
                    if (Log.isLoggable("ConfigApiImpl", 3)) {
                        Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                    }
                    c = null;
                    jVar.a(this.c, new FetchConfigIpcRequest(context.getPackageName(), aVar.a(), a, a2, b, c, null, aVar.c(), b.b(context)));
                    a.close();
                }
                jVar.a(this.c, new FetchConfigIpcRequest(context.getPackageName(), aVar.a(), a, a2, b, c, null, aVar.c(), b.b(context)));
                a.close();
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
