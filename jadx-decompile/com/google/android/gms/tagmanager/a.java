package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.en.g;
import com.google.android.gms.internal.gi.f;
import com.google.android.gms.internal.gi.i;
import com.google.android.gms.internal.gi.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    private final Context a;
    private final String b;
    private final e c;
    private cg d;
    private Map<String, a> e = new HashMap();
    private Map<String, b> f = new HashMap();
    private volatile long g;
    private volatile String h = "";

    public interface a {
        Object a(String str, Map<String, Object> map);
    }

    public interface b {
        void a(String str, Map<String, Object> map);
    }

    private class c implements com.google.android.gms.tagmanager.dr.a {
        final /* synthetic */ a a;

        private c(a aVar) {
            this.a = aVar;
        }

        public Object a(String str, Map<String, Object> map) {
            a f = this.a.f(str);
            return f == null ? null : f.a(str, map);
        }
    }

    private class d implements com.google.android.gms.tagmanager.dr.a {
        final /* synthetic */ a a;

        private d(a aVar) {
            this.a = aVar;
        }

        public Object a(String str, Map<String, Object> map) {
            b h = this.a.h(str);
            if (h != null) {
                h.a(str, map);
            }
            return cw.f();
        }
    }

    a(Context context, e eVar, String str, long j, com.google.android.gms.internal.en.c cVar) {
        this.a = context;
        this.c = eVar;
        this.b = str;
        this.g = j;
        a(cVar);
    }

    a(Context context, e eVar, String str, long j, j jVar) {
        this.a = context;
        this.c = eVar;
        this.b = str;
        this.g = j;
        a(jVar.b);
        if (jVar.a != null) {
            a(jVar.a);
        }
    }

    private void a(com.google.android.gms.internal.en.c cVar) {
        this.h = cVar.c();
        com.google.android.gms.internal.en.c cVar2 = cVar;
        a(new cg(this.a, cVar2, this.c, new c(), new d(), j(this.h)));
        if (a("_gtm.loadEventEnabled")) {
            this.c.a("gtm.load", e.a("gtm.id", this.b));
        }
    }

    private void a(f fVar) {
        if (fVar == null) {
            throw new NullPointerException();
        }
        try {
            a(en.a(fVar));
        } catch (g e) {
            String valueOf = String.valueOf(fVar);
            String valueOf2 = String.valueOf(e.toString());
            aw.a(new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Not loading resource: ").append(valueOf).append(" because it is invalid: ").append(valueOf2).toString());
        }
    }

    private synchronized void a(cg cgVar) {
        this.d = cgVar;
    }

    private void a(i[] iVarArr) {
        List arrayList = new ArrayList();
        for (Object add : iVarArr) {
            arrayList.add(add);
        }
        f().a(arrayList);
    }

    private synchronized cg f() {
        return this.d;
    }

    public String a() {
        return this.b;
    }

    public void a(String str, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.e) {
            this.e.put(str, aVar);
        }
    }

    public void a(String str, b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.f) {
            this.f.put(str, bVar);
        }
    }

    public boolean a(String str) {
        cg f = f();
        if (f == null) {
            aw.a("getBoolean called for closed container.");
            return cw.d().booleanValue();
        }
        try {
            return cw.e((com.google.android.gms.internal.hj.a) f.b(str).a()).booleanValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aw.a(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Calling getBoolean() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return cw.d().booleanValue();
        }
    }

    public double b(String str) {
        cg f = f();
        if (f == null) {
            aw.a("getDouble called for closed container.");
            return cw.c().doubleValue();
        }
        try {
            return cw.d((com.google.android.gms.internal.hj.a) f.b(str).a()).doubleValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aw.a(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getDouble() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return cw.c().doubleValue();
        }
    }

    public long b() {
        return this.g;
    }

    public long c(String str) {
        cg f = f();
        if (f == null) {
            aw.a("getLong called for closed container.");
            return cw.b().longValue();
        }
        try {
            return cw.c((com.google.android.gms.internal.hj.a) f.b(str).a()).longValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aw.a(new StringBuilder(String.valueOf(valueOf).length() + 63).append("Calling getLong() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return cw.b().longValue();
        }
    }

    public boolean c() {
        return b() == 0;
    }

    public String d() {
        return this.h;
    }

    public String d(String str) {
        cg f = f();
        if (f == null) {
            aw.a("getString called for closed container.");
            return cw.f();
        }
        try {
            return cw.a((com.google.android.gms.internal.hj.a) f.b(str).a());
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aw.a(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getString() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return cw.f();
        }
    }

    void e() {
        this.d = null;
    }

    public void e(String str) {
        synchronized (this.e) {
            this.e.remove(str);
        }
    }

    a f(String str) {
        a aVar;
        synchronized (this.e) {
            aVar = (a) this.e.get(str);
        }
        return aVar;
    }

    public void g(String str) {
        synchronized (this.f) {
            this.f.remove(str);
        }
    }

    public b h(String str) {
        b bVar;
        synchronized (this.f) {
            bVar = (b) this.f.get(str);
        }
        return bVar;
    }

    public void i(String str) {
        f().a(str);
    }

    q j(String str) {
        if (bs.a().b().equals(a.CONTAINER_DEBUG)) {
        }
        return new be();
    }
}
