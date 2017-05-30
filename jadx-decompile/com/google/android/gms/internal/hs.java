package com.google.android.gms.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.tencent.mm.sdk.platformtools.Util;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class hs implements com.google.android.gms.internal.hl.a, hr {
    static final /* synthetic */ boolean a = (!hs.class.desiredAssertionStatus());
    private static long b = 0;
    private ScheduledFuture<?> A = null;
    private long B;
    private boolean C;
    private final com.google.android.gms.internal.hr.a c;
    private final hp d;
    private String e;
    private HashSet<String> f = new HashSet();
    private boolean g = true;
    private long h;
    private hl i;
    private b j = b.Disconnected;
    private long k = 0;
    private long l = 0;
    private Map<Long, a> m;
    private List<d> n;
    private Map<Long, f> o;
    private Map<c, e> p;
    private String q;
    private boolean r;
    private final hn s;
    private final hm t;
    private final ScheduledExecutorService u;
    private final ks v;
    private final hw w;
    private String x;
    private long y = 0;
    private int z = 0;

    private interface a {
        void a(Map<String, Object> map);
    }

    private enum b {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    private static class c {
        private final List<String> a;
        private final Map<String, Object> b;

        public c(List<String> list, Map<String, Object> map) {
            this.a = list;
            this.b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) ? this.b.equals(cVar.b) : false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(ho.a(this.a));
            String valueOf2 = String.valueOf(this.b);
            return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(" (params: ").append(valueOf2).append(")").toString();
        }
    }

    private static class d {
        private final String a;
        private final List<String> b;
        private final Object c;
        private final hu d;

        private d(String str, List<String> list, Object obj, hu huVar) {
            this.a = str;
            this.b = list;
            this.c = obj;
            this.d = huVar;
        }

        public String a() {
            return this.a;
        }

        public List<String> b() {
            return this.b;
        }

        public Object c() {
            return this.c;
        }

        public hu d() {
            return this.d;
        }
    }

    private static class e {
        private final hu a;
        private final c b;
        private final hq c;
        private final Long d;

        private e(hu huVar, c cVar, Long l, hq hqVar) {
            this.a = huVar;
            this.b = cVar;
            this.c = hqVar;
            this.d = l;
        }

        public c a() {
            return this.b;
        }

        public Long b() {
            return this.d;
        }

        public hq c() {
            return this.c;
        }

        public String toString() {
            String valueOf = String.valueOf(this.b.toString());
            String valueOf2 = String.valueOf(this.d);
            return new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(valueOf2).length()).append(valueOf).append(" (Tag: ").append(valueOf2).append(")").toString();
        }
    }

    private static class f {
        private String a;
        private Map<String, Object> b;
        private hu c;
        private boolean d;

        private f(String str, Map<String, Object> map, hu huVar) {
            this.a = str;
            this.b = map;
            this.c = huVar;
        }

        public String a() {
            return this.a;
        }

        public Map<String, Object> b() {
            return this.b;
        }

        public hu c() {
            return this.c;
        }

        public void d() {
            this.d = true;
        }

        public boolean e() {
            return this.d;
        }
    }

    public hs(hn hnVar, hp hpVar, com.google.android.gms.internal.hr.a aVar) {
        this.c = aVar;
        this.s = hnVar;
        this.u = hnVar.c();
        this.t = hnVar.b();
        this.d = hpVar;
        this.p = new HashMap();
        this.m = new HashMap();
        this.o = new HashMap();
        this.n = new ArrayList();
        this.w = new com.google.android.gms.internal.hw.a(this.u, hnVar.a(), "ConnectionRetryHelper").a(1000).a(1.3d).b((long) NotificationOptions.b).b(0.7d).a();
        long j = b;
        b = 1 + j;
        this.v = new ks(hnVar.a(), "PersistentConnection", "pc_" + j);
        this.x = null;
        q();
    }

    private e a(c cVar) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String valueOf = String.valueOf(cVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("removing query ").append(valueOf).toString(), new Object[0]);
        }
        if (this.p.containsKey(cVar)) {
            e eVar = (e) this.p.get(cVar);
            this.p.remove(cVar);
            q();
            return eVar;
        }
        if (this.v.a()) {
            ksVar = this.v;
            valueOf = String.valueOf(cVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Trying to remove listener for QuerySpec ").append(valueOf).append(" but no listener exists.").toString(), new Object[0]);
        }
        return null;
    }

    private Collection<e> a(List<String> list) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String valueOf = String.valueOf(list);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 29).append("removing all listens at path ").append(valueOf).toString(), new Object[0]);
        }
        Collection<e> arrayList = new ArrayList();
        for (Entry entry : this.p.entrySet()) {
            c cVar = (c) entry.getKey();
            e eVar = (e) entry.getValue();
            if (cVar.a.equals(list)) {
                arrayList.add(eVar);
            }
        }
        for (e eVar2 : arrayList) {
            this.p.remove(eVar2.a());
        }
        q();
        return arrayList;
    }

    private Map<String, Object> a(List<String> list, Object obj, String str) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("p", ho.a((List) list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    private void a(long j) {
        if (this.v.a()) {
            this.v.a("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        Map hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.c.a(hashMap);
    }

    private void a(e eVar) {
        Map hashMap = new HashMap();
        hashMap.put("p", ho.a(eVar.b.a));
        Long b = eVar.b();
        if (b != null) {
            hashMap.put("q", eVar.a().b);
            hashMap.put("t", b);
        }
        a("n", hashMap, null);
    }

    private void a(String str, String str2) {
        this.v.a(new StringBuilder((String.valueOf(str).length() + 23) + String.valueOf(str2).length()).append("Auth token revoked: ").append(str).append(" (").append(str2).append(")").toString());
        this.q = null;
        this.r = true;
        this.c.a(false);
        this.i.b();
    }

    private void a(String str, List<String> list, Object obj, final hu huVar) {
        Map hashMap = new HashMap();
        hashMap.put("p", ho.a((List) list));
        hashMap.put("d", obj);
        a(str, hashMap, new a(this) {
            final /* synthetic */ hs b;

            public void a(Map<String, Object> map) {
                String str = null;
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    str2 = null;
                } else {
                    str = (String) map.get("d");
                }
                if (huVar != null) {
                    huVar.a(str2, str);
                }
            }
        });
    }

    private void a(String str, List<String> list, Object obj, String str2, hu huVar) {
        Map a = a((List) list, obj, str2);
        long j = this.k;
        this.k = 1 + j;
        this.o.put(Long.valueOf(j), new f(str, a, huVar));
        if (g()) {
            b(j);
        }
        this.B = System.currentTimeMillis();
        q();
    }

    private void a(String str, Map<String, Object> map) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String valueOf = String.valueOf(map);
            ksVar.a(new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(valueOf).length()).append("handleServerMessage: ").append(str).append(" ").append(valueOf).toString(), new Object[0]);
        }
        String str2;
        ks ksVar2;
        String str3;
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long a = ho.a(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.c.a(ho.a(str2), obj, equals, a);
            } else if (this.v.a()) {
                ksVar2 = this.v;
                str3 = "ignoring empty merge for path ";
                str2 = String.valueOf(str2);
                ksVar2.a(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("rm")) {
            str2 = (String) map.get("p");
            List a2 = ho.a(str2);
            Object obj2 = map.get("d");
            Long a3 = ho.a(map.get("t"));
            List<Map> list = (List) obj2;
            List arrayList = new ArrayList();
            for (Map map2 : list) {
                str3 = (String) map2.get("s");
                String str4 = (String) map2.get("e");
                arrayList.add(new ht(str3 != null ? ho.a(str3) : null, str4 != null ? ho.a(str4) : null, map2.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.c.a(a2, arrayList, a3);
            } else if (this.v.a()) {
                ksVar2 = this.v;
                str3 = "Ignoring empty range merge for path ";
                str2 = String.valueOf(str2);
                ksVar2.a(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("c")) {
            b(ho.a((String) map.get("p")));
        } else if (str.equals("ac")) {
            a((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("sd")) {
            b((Map) map);
        } else if (this.v.a()) {
            ksVar2 = this.v;
            str3 = "Unrecognized action from server: ";
            str2 = String.valueOf(str);
            ksVar2.a(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
        }
    }

    private void a(String str, Map<String, Object> map, a aVar) {
        a(str, false, (Map) map, aVar);
    }

    private void a(String str, boolean z, Map<String, Object> map, a aVar) {
        long p = p();
        Map hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(p));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.i.a(hashMap, z);
        this.m.put(Long.valueOf(p), aVar);
    }

    private void a(List<String> list, c cVar) {
        if (list.contains("no_index")) {
            String valueOf = String.valueOf(cVar.b.get("i"));
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 14).append("\".indexOn\": \"").append(valueOf).append("\"").toString();
            ks ksVar = this.v;
            String valueOf2 = String.valueOf(ho.a(cVar.a));
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + Opcodes.FNEG) + String.valueOf(valueOf2).length()).append("Using an unspecified index. Consider adding '").append(valueOf).append("' at ").append(valueOf2).append(" to your security and Firebase Database rules for better performance").toString());
        }
    }

    private void a(final boolean z) {
        ho.a(f(), "Must be connected to send auth, but was: %s", this.j);
        ho.a(this.q != null, "Auth token must be set to authenticate!", new Object[0]);
        a anonymousClass3 = new a(this) {
            final /* synthetic */ hs b;

            public void a(Map<String, Object> map) {
                this.b.j = b.Connected;
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    this.b.z = 0;
                    this.b.c.a(true);
                    if (z) {
                        this.b.n();
                        return;
                    }
                    return;
                }
                this.b.q = null;
                this.b.r = true;
                this.b.c.a(false);
                String str2 = (String) map.get("d");
                this.b.v.a(new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(str2).length()).append("Authentication failed: ").append(str).append(" (").append(str2).append(")").toString(), new Object[0]);
                this.b.i.b();
                if (str.equals("invalid_token")) {
                    this.b.z = this.b.z + 1;
                    if (((long) this.b.z) >= 3) {
                        this.b.w.b();
                        this.b.v.a("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                    }
                }
            }
        };
        Map hashMap = new HashMap();
        ma a = ma.a(this.q);
        if (a != null) {
            hashMap.put("cred", a.a());
            if (a.b() != null) {
                hashMap.put("authvar", a.b());
            }
            a("gauth", true, hashMap, anonymousClass3);
            return;
        }
        hashMap.put("cred", this.q);
        a("auth", true, hashMap, anonymousClass3);
    }

    private void b(long j) {
        if (a || g()) {
            final f fVar = (f) this.o.get(Long.valueOf(j));
            final hu c = fVar.c();
            final String a = fVar.a();
            fVar.d();
            final long j2 = j;
            a(a, fVar.b(), new a(this) {
                final /* synthetic */ hs e;

                public void a(Map<String, Object> map) {
                    if (this.e.v.a()) {
                        ks a = this.e.v;
                        String str = a;
                        String valueOf = String.valueOf(map);
                        a.a(new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length()).append(str).append(" response: ").append(valueOf).toString(), new Object[0]);
                    }
                    if (((f) this.e.o.get(Long.valueOf(j2))) == fVar) {
                        this.e.o.remove(Long.valueOf(j2));
                        if (c != null) {
                            String str2 = (String) map.get("s");
                            if (str2.equals("ok")) {
                                c.a(null, null);
                            } else {
                                c.a(str2, (String) map.get("d"));
                            }
                        }
                    } else if (this.e.v.a()) {
                        this.e.v.a("Ignoring on complete for put " + j2 + " because it was removed already.", new Object[0]);
                    }
                    this.e.q();
                }
            });
            return;
        }
        throw new AssertionError("sendPut called when we can't send writes (we're disconnected or writes are paused).");
    }

    private void b(final e eVar) {
        Map hashMap = new HashMap();
        hashMap.put("p", ho.a(eVar.a().a));
        Long b = eVar.b();
        if (b != null) {
            hashMap.put("q", eVar.b.b);
            hashMap.put("t", b);
        }
        hq c = eVar.c();
        hashMap.put("h", c.a());
        if (c.b()) {
            hk c2 = c.c();
            List arrayList = new ArrayList();
            for (List a : c2.a()) {
                arrayList.add(ho.a(a));
            }
            Map hashMap2 = new HashMap();
            hashMap2.put("hs", c2.b());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        a("q", hashMap, new a(this) {
            final /* synthetic */ hs b;

            public void a(Map<String, Object> map) {
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    Map map2 = (Map) map.get("d");
                    if (map2.containsKey("w")) {
                        this.b.a((List) map2.get("w"), eVar.b);
                    }
                }
                if (((e) this.b.p.get(eVar.a())) != eVar) {
                    return;
                }
                if (str.equals("ok")) {
                    eVar.a.a(null, null);
                    return;
                }
                this.b.a(eVar.a());
                eVar.a.a(str, (String) map.get("d"));
            }
        });
    }

    private void b(List<String> list) {
        Collection<e> a = a((List) list);
        if (a != null) {
            for (e b : a) {
                b.a.a("permission_denied", null);
            }
        }
    }

    private void b(Map<String, Object> map) {
        this.v.b((String) map.get(SocialConstants.PARAM_SEND_MSG));
    }

    private void c(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            Map hashMap = new HashMap();
            hashMap.put("c", map);
            a("s", hashMap, new a(this) {
                final /* synthetic */ hs a;

                {
                    this.a = r1;
                }

                public void a(Map<String, Object> map) {
                    String str = (String) map.get("s");
                    if (!str.equals("ok")) {
                        String str2 = (String) map.get("d");
                        if (this.a.v.a()) {
                            this.a.v.a(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Failed to send stats: ").append(str).append(" (message: ").append(str2).append(")").toString(), new Object[0]);
                        }
                    }
                }
            });
        } else if (this.v.a()) {
            this.v.a("Not sending stats because stats are empty", new Object[0]);
        }
    }

    private boolean f() {
        return this.j == b.Authenticating || this.j == b.Connected;
    }

    private boolean g() {
        return this.j == b.Connected;
    }

    private void h() {
        if (e()) {
            ho.a(this.j == b.Disconnected, "Not in disconnected state: %s", this.j);
            final boolean z = this.r;
            this.v.a("Scheduling connection attempt", new Object[0]);
            this.r = false;
            this.w.a(new Runnable(this) {
                final /* synthetic */ hs b;

                public void run() {
                    this.b.v.a("Trying to fetch auth token", new Object[0]);
                    ho.a(this.b.j == b.Disconnected, "Not in disconnected state: %s", this.b.j);
                    this.b.j = b.GettingToken;
                    this.b.y = 1 + this.b.y;
                    final long d = this.b.y;
                    this.b.t.a(z, new com.google.android.gms.internal.hm.a(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void a(String str) {
                            if (d != this.b.b.y) {
                                this.b.b.v.a("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                            } else if (this.b.b.j == b.GettingToken) {
                                this.b.b.v.a("Successfully fetched token, opening connection", new Object[0]);
                                this.b.b.g(str);
                            } else {
                                ho.a(this.b.b.j == b.Disconnected, "Expected connection state disconnected, but was %s", this.b.b.j);
                                this.b.b.v.a("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                            }
                        }

                        public void b(String str) {
                            if (d == this.b.b.y) {
                                this.b.b.j = b.Disconnected;
                                ks a = this.b.b.v;
                                String str2 = "Error fetching token: ";
                                String valueOf = String.valueOf(str);
                                a.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                                this.b.b.h();
                                return;
                            }
                            this.b.b.v.a("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                        }
                    });
                }
            });
        }
    }

    private void i() {
        Iterator it = this.o.entrySet().iterator();
        while (it.hasNext()) {
            f fVar = (f) ((Entry) it.next()).getValue();
            if (fVar.b().containsKey("h") && fVar.e()) {
                fVar.c().a("disconnected", null);
                it.remove();
            }
        }
    }

    private void j() {
        a(false);
    }

    private void k() {
        a(true);
    }

    private void l() {
        ho.a(f(), "Must be connected to send unauth.", new Object[0]);
        ho.a(this.q == null, "Auth token must not be set.", new Object[0]);
        a("unauth", Collections.emptyMap(), null);
    }

    private void m() {
        if (this.v.a()) {
            this.v.a("calling restore state", new Object[0]);
        }
        ho.a(this.j == b.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.j);
        if (this.q == null) {
            if (this.v.a()) {
                this.v.a("Not restoring auth because token is null.", new Object[0]);
            }
            this.j = b.Connected;
            n();
            return;
        }
        if (this.v.a()) {
            this.v.a("Restoring auth.", new Object[0]);
        }
        this.j = b.Authenticating;
        k();
    }

    private void n() {
        ho.a(this.j == b.Connected, "Should be connected if we're restoring state, but we are: %s", this.j);
        if (this.v.a()) {
            this.v.a("Restoring outstanding listens", new Object[0]);
        }
        for (e eVar : this.p.values()) {
            if (this.v.a()) {
                ks ksVar = this.v;
                String valueOf = String.valueOf(eVar.a());
                ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Restoring listen ").append(valueOf).toString(), new Object[0]);
            }
            b(eVar);
        }
        if (this.v.a()) {
            this.v.a("Restoring writes.", new Object[0]);
        }
        Object arrayList = new ArrayList(this.o.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(((Long) it.next()).longValue());
        }
        for (d dVar : this.n) {
            a(dVar.a(), dVar.b(), dVar.c(), dVar.d());
        }
        this.n.clear();
    }

    private void o() {
        Map hashMap = new HashMap();
        String str;
        String valueOf;
        if (lz.a()) {
            if (this.s.d()) {
                hashMap.put("persistence.android.enabled", Integer.valueOf(1));
            }
            str = "sdk.android.";
            valueOf = String.valueOf(this.s.e().replace('.', SignatureVisitor.SUPER));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else if (a || !this.s.d()) {
            str = "sdk.java.";
            valueOf = String.valueOf(this.s.e().replace('.', SignatureVisitor.SUPER));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else {
            throw new AssertionError("Stats for persistence on JVM missing (persistence not yet supported)");
        }
        if (this.v.a()) {
            this.v.a("Sending first connection stats", new Object[0]);
        }
        c(hashMap);
    }

    private long p() {
        long j = this.l;
        this.l = 1 + j;
        return j;
    }

    private void q() {
        boolean z = false;
        if (r()) {
            if (this.A != null) {
                this.A.cancel(false);
            }
            this.A = this.u.schedule(new Runnable(this) {
                final /* synthetic */ hs a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.A = null;
                    if (this.a.s()) {
                        this.a.d("connection_idle");
                    } else {
                        this.a.q();
                    }
                }
            }, Util.MILLSECONDS_OF_MINUTE, TimeUnit.MILLISECONDS);
        } else if (f("connection_idle")) {
            if (!r()) {
                z = true;
            }
            ho.a(z);
            e("connection_idle");
        }
    }

    private boolean r() {
        return this.p.isEmpty() && this.m.isEmpty() && !this.C && this.o.isEmpty();
    }

    private boolean s() {
        return r() && System.currentTimeMillis() > this.B + Util.MILLSECONDS_OF_MINUTE;
    }

    public void a() {
        h();
    }

    public void a(long j, String str) {
        if (this.v.a()) {
            this.v.a("onReady", new Object[0]);
        }
        this.h = System.currentTimeMillis();
        a(j);
        if (this.g) {
            o();
        }
        m();
        this.g = false;
        this.x = str;
        this.c.a();
    }

    public void a(com.google.android.gms.internal.hl.b bVar) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String str = "Got on disconnect due to ";
            String valueOf = String.valueOf(bVar.name());
            ksVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.j = b.Disconnected;
        this.i = null;
        this.C = false;
        this.m.clear();
        i();
        if (e()) {
            boolean z = this.h > 0 ? System.currentTimeMillis() - this.h > NotificationOptions.b : false;
            if (bVar == com.google.android.gms.internal.hl.b.SERVER_RESET || r0) {
                this.w.a();
            }
            h();
        }
        this.h = 0;
        this.c.b();
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(List<String> list, hu huVar) {
        if (g()) {
            a("oc", (List) list, null, huVar);
        } else {
            this.n.add(new d("oc", list, null, huVar));
        }
        q();
    }

    public void a(List<String> list, Object obj, hu huVar) {
        a("p", (List) list, obj, null, huVar);
    }

    public void a(List<String> list, Object obj, String str, hu huVar) {
        a("p", (List) list, obj, str, huVar);
    }

    public void a(List<String> list, Map<String, Object> map) {
        c cVar = new c(list, map);
        if (this.v.a()) {
            ks ksVar = this.v;
            String valueOf = String.valueOf(cVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("unlistening on ").append(valueOf).toString(), new Object[0]);
        }
        e a = a(cVar);
        if (a != null && f()) {
            a(a);
        }
        q();
    }

    public void a(List<String> list, Map<String, Object> map, hq hqVar, Long l, hu huVar) {
        c cVar = new c(list, map);
        if (this.v.a()) {
            ks ksVar = this.v;
            String valueOf = String.valueOf(cVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Listening on ").append(valueOf).toString(), new Object[0]);
        }
        ho.a(!this.p.containsKey(cVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.v.a()) {
            ksVar = this.v;
            valueOf = String.valueOf(cVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Adding listen query: ").append(valueOf).toString(), new Object[0]);
        }
        e eVar = new e(huVar, cVar, l, hqVar);
        this.p.put(cVar, eVar);
        if (f()) {
            b(eVar);
        }
        q();
    }

    public void a(List<String> list, Map<String, Object> map, hu huVar) {
        a("m", (List) list, (Object) map, null, huVar);
    }

    public void a(Map<String, Object> map) {
        if (map.containsKey("r")) {
            a aVar = (a) this.m.remove(Long.valueOf((long) ((Integer) map.get("r")).intValue()));
            if (aVar != null) {
                aVar.a((Map) map.get("b"));
            }
        } else if (!map.containsKey("error")) {
            if (map.containsKey("a")) {
                a((String) map.get("a"), (Map) map.get("b"));
            } else if (this.v.a()) {
                ks ksVar = this.v;
                String valueOf = String.valueOf(map);
                ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Ignoring unknown message: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public void b() {
        d("shutdown");
    }

    public void b(String str) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String str2 = "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ";
            String valueOf = String.valueOf(str);
            ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        d("server_kill");
    }

    public void b(List<String> list, Object obj, hu huVar) {
        this.C = true;
        if (g()) {
            a("o", (List) list, obj, huVar);
        } else {
            this.n.add(new d("o", list, obj, huVar));
        }
        q();
    }

    public void b(List<String> list, Map<String, Object> map, hu huVar) {
        this.C = true;
        if (g()) {
            a("om", (List) list, (Object) map, huVar);
        } else {
            this.n.add(new d("om", list, map, huVar));
        }
        q();
    }

    public void c() {
        this.v.a("Auth token refresh requested", new Object[0]);
        d("token_refresh");
        e("token_refresh");
    }

    public void c(String str) {
        this.v.a("Auth token refreshed.", new Object[0]);
        this.q = str;
        if (!f()) {
            return;
        }
        if (str != null) {
            j();
        } else {
            l();
        }
    }

    public void d() {
        for (f fVar : this.o.values()) {
            if (fVar.c != null) {
                fVar.c.a("write_canceled", null);
            }
        }
        for (d dVar : this.n) {
            if (dVar.d != null) {
                dVar.d.a("write_canceled", null);
            }
        }
        this.o.clear();
        this.n.clear();
        if (!f()) {
            this.C = false;
        }
        q();
    }

    public void d(String str) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String str2 = "Connection interrupted for: ";
            String valueOf = String.valueOf(str);
            ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.f.add(str);
        if (this.i != null) {
            this.i.b();
            this.i = null;
        } else {
            this.w.c();
            this.j = b.Disconnected;
        }
        this.w.a();
    }

    public void e(String str) {
        if (this.v.a()) {
            ks ksVar = this.v;
            String str2 = "Connection no longer interrupted for: ";
            String valueOf = String.valueOf(str);
            ksVar.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.f.remove(str);
        if (e() && this.j == b.Disconnected) {
            h();
        }
    }

    boolean e() {
        return this.f.size() == 0;
    }

    public boolean f(String str) {
        return this.f.contains(str);
    }

    public void g(String str) {
        ho.a(this.j == b.GettingToken, "Trying to open network connection while in the wrong state: %s", this.j);
        if (str == null) {
            this.c.a(false);
        }
        this.q = str;
        this.j = b.Connecting;
        this.i = new hl(this.s, this.d, this.e, this, this.x);
        this.i.a();
    }
}
