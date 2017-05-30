package com.google.firebase.database;

import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.mi;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.firebase.b;
import com.google.firebase.database.j.a;
import java.util.HashMap;
import java.util.Map;

public class g {
    private static final Map<String, g> a = new HashMap();
    private final b b;
    private final in c;
    private final id d;
    private im e;

    private g(b bVar, in inVar, id idVar) {
        this.b = bVar;
        this.c = inVar;
        this.d = idVar;
    }

    public static g a() {
        return a(b.d());
    }

    public static synchronized g a(b bVar) {
        g gVar;
        synchronized (g.class) {
            if (!a.containsKey(bVar.b())) {
                String c = bVar.c().c();
                if (c == null) {
                    throw new d("Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object.");
                }
                mi a = mk.a(c);
                if (a.b.h()) {
                    id idVar = new id();
                    if (!bVar.e()) {
                        idVar.c(bVar.b());
                    }
                    idVar.a(bVar);
                    a.put(bVar.b(), new g(bVar, a.a, idVar));
                } else {
                    String valueOf = String.valueOf(a.b.toString());
                    throw new d(new StringBuilder((String.valueOf(c).length() + 114) + String.valueOf(valueOf).length()).append("Configured Database URL '").append(c).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(valueOf).toString());
                }
            }
            gVar = (g) a.get(bVar.b());
        }
        return gVar;
    }

    private void c(String str) {
        if (this.e != null) {
            throw new d(new StringBuilder(String.valueOf(str).length() + 77).append("Calls to ").append(str).append("() must be made before any other usage of FirebaseDatabase instance.").toString());
        }
    }

    public static String g() {
        return "3.0.0";
    }

    private synchronized void h() {
        if (this.e == null) {
            this.e = io.a(this.d, this.c, this);
        }
    }

    public e a(String str) {
        h();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        ml.b(str);
        return new e(this.e, new ij(str));
    }

    public synchronized void a(a aVar) {
        c("setLogLevel");
        this.d.a(aVar);
    }

    public synchronized void a(boolean z) {
        c("setPersistenceEnabled");
        this.d.a(z);
    }

    public b b() {
        return this.b;
    }

    public e b(String str) {
        h();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
        }
        mi a = mk.a(str);
        if (a.a.a.equals(this.e.d().a)) {
            return new e(this.e, a.b);
        }
        String valueOf = String.valueOf(c().toString());
        throw new d(new StringBuilder((String.valueOf(str).length() + 93) + String.valueOf(valueOf).length()).append("Invalid URL (").append(str).append(") passed to getReference().  URL was expected to match configured Database URL: ").append(valueOf).toString());
    }

    public e c() {
        h();
        return new e(this.e, ij.a());
    }

    public void d() {
        h();
        this.e.a(new Runnable(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e.g();
            }
        });
    }

    public void e() {
        h();
        io.b(this.e);
    }

    public void f() {
        h();
        io.a(this.e);
    }
}
