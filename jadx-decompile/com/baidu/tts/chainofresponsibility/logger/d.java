package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class d {
    private static volatile d a = null;
    private List<b> b = g();
    private ExecutorService c;
    private f d = new f();
    private e e = new e();
    private a f = a.RELEASE;
    private boolean g = false;

    private enum a {
        DEVELOP,
        RELEASE
    }

    private class b implements Runnable {
        final /* synthetic */ d a;
        private c b;

        public b(d dVar, c cVar) {
            this.a = dVar;
            this.b = cVar;
        }

        public void run() {
            for (b a : this.a.b) {
                a.a(this.b, null, d.a);
            }
        }
    }

    private d() {
        this.b.add(this.d);
        this.c = Executors.newSingleThreadExecutor(new com.baidu.tts.g.a.a("LoggerChainPoolThread"));
    }

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    private void a(c cVar, int i, String str, String str2) {
        if (cVar == null) {
            cVar = new c();
        }
        cVar.a(i);
        cVar.a(str);
        cVar.b(str2);
        a(cVar);
    }

    private void b(c cVar) {
        try {
            if (this.c != null && !this.c.isShutdown()) {
                this.c.execute(new b(this, cVar));
            }
        } catch (Exception e) {
            Log.e("LoggerChain", "executeWork exception=" + e.toString());
        }
    }

    private List<b> g() {
        return this.b == null ? new CopyOnWriteArrayList() : this.b;
    }

    public void a(int i, String str, String str2) {
        a(new c(), i, str, str2);
    }

    public void a(c cVar) {
        if (cVar != null) {
            switch (this.f) {
                case DEVELOP:
                    cVar.a(6);
                    this.e.a(cVar, null, a);
                    break;
                case RELEASE:
                    if (this.g) {
                        this.e.a(cVar, null, a);
                        break;
                    }
                    break;
            }
            b(cVar);
        }
    }

    public void a(String str) {
        if (this.e != null) {
            this.e.a(str);
        }
    }

    public void a(List<String> list) {
        if (this.e != null) {
            this.e.a((List) list);
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void b() {
        if (this.b != null) {
            this.b.clear();
        }
    }

    public void b(String str) {
        if (this.e != null) {
            this.e.b(str);
        }
    }

    public void c() {
        if (this.e != null) {
            this.e.a();
        }
    }

    public void d() {
        this.f = a.RELEASE;
    }

    public boolean e() {
        return this.f == null || this.f == a.RELEASE;
    }
}