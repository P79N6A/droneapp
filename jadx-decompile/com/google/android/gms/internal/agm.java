package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.cast.internal.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.util.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class agm extends com.google.android.gms.cast.internal.c {
    static final String g = f.b("com.google.cast.games");
    private static final m h = new m("GameManagerChannel");
    private final Map<String, String> i = new ConcurrentHashMap();
    private final List<q> j;
    private final SharedPreferences k;
    private final String l;
    private final com.google.android.gms.cast.a.b m;
    private final g n;
    private agn o;
    private boolean p = false;
    private com.google.android.gms.cast.a.b q;
    private com.google.android.gms.cast.a.b r;
    private String s;
    private JSONObject t;
    private long u = 0;
    private com.google.android.gms.cast.a.a.c v;
    private final com.google.android.gms.common.util.e w;
    private String x;

    public abstract class b<R extends com.google.android.gms.common.api.m> extends com.google.android.gms.cast.internal.b<R> {
        protected p f;
        final /* synthetic */ agm g;

        public b(agm com_google_android_gms_internal_agm) {
            this.g = com_google_android_gms_internal_agm;
            super(com_google_android_gms_internal_agm.n);
        }

        protected void a(com.google.android.gms.cast.internal.e eVar) {
            b();
        }

        public abstract void b();

        public p c() {
            return this.f;
        }
    }

    public abstract class c extends b<com.google.android.gms.cast.a.a.a> {
        private com.google.android.gms.cast.a.a a;
        final /* synthetic */ agm b;

        public c(final agm com_google_android_gms_internal_agm, com.google.android.gms.cast.a.a aVar) {
            this.b = com_google_android_gms_internal_agm;
            super(com_google_android_gms_internal_agm);
            this.a = aVar;
            this.f = new p(this) {
                final /* synthetic */ c b;

                public void a(long j) {
                    this.b.b((com.google.android.gms.cast.a.a.a) this.b.b(new Status(2103)));
                }

                public void a(long j, int i, Object obj) {
                    if (obj == null) {
                        try {
                            this.b.b(new d(new Status(i, null, null), this.b.a));
                            return;
                        } catch (ClassCastException e) {
                            this.b.b((com.google.android.gms.cast.a.a.a) this.b.b(new Status(13)));
                            return;
                        }
                    }
                    ago com_google_android_gms_internal_ago = (ago) obj;
                    agn m = com_google_android_gms_internal_ago.m();
                    if (m == null || f.a("1.0.0", m.c())) {
                        this.b.b(new d(new Status(i, com_google_android_gms_internal_ago.c(), null), this.b.a));
                        return;
                    }
                    this.b.b.o = null;
                    this.b.b((com.google.android.gms.cast.a.a.a) this.b.b(new Status(com.google.android.gms.cast.a.a.a, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[]{m.c(), "1.0.0"}))));
                }
            };
        }

        public com.google.android.gms.cast.a.a.a a(Status status) {
            return new d(status, null);
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    public abstract class a extends b<com.google.android.gms.cast.a.a.b> {
        final /* synthetic */ agm e;

        public a(final agm com_google_android_gms_internal_agm) {
            this.e = com_google_android_gms_internal_agm;
            super(com_google_android_gms_internal_agm);
            this.f = new p(this) {
                final /* synthetic */ a b;

                public void a(long j) {
                    this.b.b((com.google.android.gms.cast.a.a.b) this.b.b(new Status(2103)));
                }

                public void a(long j, int i, Object obj) {
                    if (obj == null) {
                        try {
                            this.b.b(new e(new Status(i, null, null), null, j, null));
                            return;
                        } catch (ClassCastException e) {
                            this.b.b((com.google.android.gms.cast.a.a.b) this.b.b(new Status(13)));
                            return;
                        }
                    }
                    ago com_google_android_gms_internal_ago = (ago) obj;
                    String j2 = com_google_android_gms_internal_ago.j();
                    if (i == 0 && j2 != null) {
                        this.b.e.x = j2;
                    }
                    this.b.b(new e(new Status(i, com_google_android_gms_internal_ago.c(), null), j2, com_google_android_gms_internal_ago.k(), com_google_android_gms_internal_ago.d()));
                }
            };
        }

        public com.google.android.gms.cast.a.a.b a(Status status) {
            return new e(status, null, -1, null);
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    private static final class d implements com.google.android.gms.cast.a.a.a {
        private final Status a;
        private final com.google.android.gms.cast.a.a b;

        d(Status status, com.google.android.gms.cast.a.a aVar) {
            this.a = status;
            this.b = aVar;
        }

        public Status a() {
            return this.a;
        }

        public com.google.android.gms.cast.a.a b() {
            return this.b;
        }
    }

    private static final class e implements com.google.android.gms.cast.a.a.b {
        private final Status a;
        private final String b;
        private final long c;
        private final JSONObject d;

        e(Status status, String str, long j, JSONObject jSONObject) {
            this.a = status;
            this.b = str;
            this.c = j;
            this.d = jSONObject;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }

        public JSONObject d() {
            return this.d;
        }
    }

    public agm(g gVar, String str, com.google.android.gms.cast.a.b bVar) {
        super(g, "CastGameManagerChannel", null);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("castSessionId cannot be null.");
        } else if (gVar != null && gVar.j() && gVar.b(com.google.android.gms.cast.a.k)) {
            this.w = h.d();
            this.j = new ArrayList();
            this.l = str;
            this.m = bVar;
            this.n = gVar;
            this.k = r0.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", new Object[]{gVar.b().getApplicationContext().getPackageName(), "game_manager_channel_data"}), 0);
            this.r = null;
            this.q = new agq(0, 0, "", null, new ArrayList(), "", -1);
        } else {
            throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
        }
    }

    private int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 2001;
            case 2:
                return com.google.android.gms.cast.f.h;
            case 3:
                return com.google.android.gms.cast.a.a.a;
            case 4:
                return com.google.android.gms.cast.a.a.b;
            default:
                h.d("Unknown GameManager protocol status code: " + i, new Object[0]);
                return 13;
        }
    }

    private JSONObject a(long j, String str, int i, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("requestId", j);
            jSONObject2.put("type", i);
            jSONObject2.put("extraMessageData", jSONObject);
            jSONObject2.put("playerId", str);
            jSONObject2.put("playerToken", c(str));
            return jSONObject2;
        } catch (JSONException e) {
            h.d("JSONException when trying to create a message: %s", new Object[]{e.getMessage()});
            return null;
        }
    }

    private void a(long j, int i, Object obj) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).a(j, i, obj)) {
                it.remove();
            }
        }
    }

    private synchronized void a(ago com_google_android_gms_internal_ago) {
        Object obj = 1;
        synchronized (this) {
            if (com_google_android_gms_internal_ago.a() != 1) {
                obj = null;
            }
            this.r = this.q;
            if (!(obj == null || com_google_android_gms_internal_ago.m() == null)) {
                this.o = com_google_android_gms_internal_ago.m();
            }
            if (h()) {
                Collection arrayList = new ArrayList();
                for (ags com_google_android_gms_internal_ags : com_google_android_gms_internal_ago.g()) {
                    String c = com_google_android_gms_internal_ags.c();
                    arrayList.add(new agr(c, com_google_android_gms_internal_ags.a(), com_google_android_gms_internal_ags.b(), this.i.containsKey(c)));
                }
                this.q = new agq(com_google_android_gms_internal_ago.f(), com_google_android_gms_internal_ago.e(), com_google_android_gms_internal_ago.i(), com_google_android_gms_internal_ago.h(), arrayList, this.o.a(), this.o.b());
                com.google.android.gms.cast.a.c a = this.q.a(com_google_android_gms_internal_ago.j());
                if (a != null && a.e() && com_google_android_gms_internal_ago.a() == 2) {
                    this.s = com_google_android_gms_internal_ago.j();
                    this.t = com_google_android_gms_internal_ago.d();
                }
            }
        }
    }

    private void a(String str, int i, JSONObject jSONObject, p pVar) {
        final long j = 1 + this.u;
        this.u = j;
        JSONObject a = a(j, str, i, jSONObject);
        if (a == null) {
            pVar.a(-1, 2001, null);
            h.d("Not sending request because it was invalid.", new Object[0]);
            return;
        }
        q qVar = new q(this.w, NotificationOptions.b);
        qVar.a(j, pVar);
        this.j.add(qVar);
        a(true);
        this.m.a(this.n, b(), a.toString()).a(new n<Status>(this) {
            final /* synthetic */ agm b;

            public void a(Status status) {
                if (!status.f()) {
                    this.b.a(j, status.i());
                }
            }

            public /* synthetic */ void a(com.google.android.gms.common.api.m mVar) {
                a((Status) mVar);
            }
        });
    }

    private synchronized void j() {
        if (!h()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
        } else if (g()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
        }
    }

    private void k() {
        if (this.v != null) {
            if (!(this.r == null || this.q.equals(this.r))) {
                this.v.a(this.q, this.r);
            }
            if (!(this.t == null || this.s == null)) {
                this.v.a(this.s, this.t);
            }
        }
        this.r = null;
        this.s = null;
        this.t = null;
    }

    private synchronized void l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("castSessionId", this.l);
            jSONObject.put("playerTokenMap", new JSONObject(this.i));
            this.k.edit().putString("save_data", jSONObject.toString()).commit();
        } catch (JSONException e) {
            h.d("Error while saving data: %s", new Object[]{e.getMessage()});
        }
    }

    private synchronized void m() {
        String string = this.k.getString("save_data", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (this.l.equals(jSONObject.getString("castSessionId"))) {
                    jSONObject = jSONObject.getJSONObject("playerTokenMap");
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        string = (String) keys.next();
                        this.i.put(string, jSONObject.getString(string));
                    }
                    this.u = 0;
                }
            } catch (JSONException e) {
                h.d("Error while loading data: %s", new Object[]{e.getMessage()});
            }
        }
    }

    public synchronized i<com.google.android.gms.cast.a.a.a> a(com.google.android.gms.cast.a.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("gameManagerClient can't be null.");
        }
        return this.n.b(new c(this, aVar) {
            final /* synthetic */ agm a;

            public void b() {
                try {
                    this.a.m.a(this.a.n, this.a.b(), new com.google.android.gms.cast.a.e(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void a(CastDevice castDevice, String str, String str2) {
                            this.a.a.b(str2);
                        }
                    });
                    this.a.m();
                    this.a.l();
                    this.a.a(null, 1100, null, c());
                } catch (IOException e) {
                    c().a(-1, 8, null);
                } catch (IllegalStateException e2) {
                    c().a(-1, 8, null);
                }
            }
        });
    }

    public synchronized i<com.google.android.gms.cast.a.a.b> a(final String str, final int i, final JSONObject jSONObject) {
        j();
        return this.n.b(new a(this) {
            final /* synthetic */ agm d;

            public void b() {
                int a = agp.a(i);
                if (a == 0) {
                    c().a(-1, 2001, null);
                    agm.h.d("sendPlayerRequest for unsupported playerState: %d", new Object[]{Integer.valueOf(i)});
                    return;
                }
                this.d.a(str, a, jSONObject, c());
            }
        });
    }

    public void a(long j, int i) {
        a(j, i, null);
    }

    public synchronized void a(com.google.android.gms.cast.a.a.c cVar) {
        this.v = cVar;
    }

    public synchronized void a(String str, JSONObject jSONObject) {
        j();
        long j = 1 + this.u;
        this.u = j;
        JSONObject a = a(j, str, 7, jSONObject);
        if (a != null) {
            this.m.a(this.n, b(), a.toString());
        }
    }

    protected boolean a(long j) {
        boolean z;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).b(j, 15)) {
                it.remove();
            }
        }
        synchronized (q.a) {
            for (q b : this.j) {
                if (b.b()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public synchronized i<com.google.android.gms.cast.a.a.b> b(final String str, final JSONObject jSONObject) {
        j();
        return this.n.b(new a(this) {
            final /* synthetic */ agm c;

            public void b() {
                this.c.a(str, 6, jSONObject, c());
            }
        });
    }

    public final void b(String str) {
        h.b("message received: %s", new Object[]{str});
        try {
            Object a = ago.a(new JSONObject(str));
            if (a == null) {
                h.d("Could not parse game manager message from string: %s", new Object[]{str});
            } else if ((h() || a.m() != null) && !g()) {
                int i = a.a() == 1 ? 1 : 0;
                if (!(i == 0 || TextUtils.isEmpty(a.l()))) {
                    this.i.put(a.j(), a.l());
                    l();
                }
                if (a.b() == 0) {
                    a((ago) a);
                } else {
                    h.d("Not updating from game message because the message contains error code: %d", new Object[]{Integer.valueOf(a.b())});
                }
                int a2 = a(a.b());
                if (i != 0) {
                    a(a.k(), a2, a);
                }
                if (h() && a2 == 0) {
                    k();
                }
            }
        } catch (JSONException e) {
            h.d("Message is malformed (%s); ignoring: %s", new Object[]{e.getMessage(), str});
        }
    }

    public synchronized String c(String str) {
        return str == null ? null : (String) this.i.get(str);
    }

    public synchronized void d() {
        if (!this.p) {
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.p = true;
            try {
                this.m.d(this.n, b());
            } catch (IOException e) {
                h.d("Exception while detaching game manager channel.", new Object[]{e});
            }
        }
    }

    public synchronized com.google.android.gms.cast.a.b e() {
        j();
        return this.q;
    }

    public synchronized String f() {
        j();
        return this.x;
    }

    public synchronized boolean g() {
        return this.p;
    }

    public synchronized boolean h() {
        return this.o != null;
    }
}
