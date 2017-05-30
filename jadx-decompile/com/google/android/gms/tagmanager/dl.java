package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

class dl implements b {
    private final Looper a;
    private a b;
    private a c;
    private Status d;
    private b e;
    private a f;
    private boolean g;
    private f h;

    public interface a {
        void a();

        void a(String str);

        String b();
    }

    private class b extends Handler {
        final /* synthetic */ dl a;
        private final com.google.android.gms.tagmanager.b.a b;

        public b(dl dlVar, com.google.android.gms.tagmanager.b.a aVar, Looper looper) {
            this.a = dlVar;
            super(looper);
            this.b = aVar;
        }

        public void a(String str) {
            sendMessage(obtainMessage(1, str));
        }

        protected void b(String str) {
            this.b.a(this.a, str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    b((String) message.obj);
                    return;
                default:
                    aw.a("Don't know how to handle this message.");
                    return;
            }
        }
    }

    public dl(Status status) {
        this.d = status;
        this.a = null;
    }

    public dl(f fVar, Looper looper, a aVar, a aVar2) {
        this.h = fVar;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.a = looper;
        this.b = aVar;
        this.f = aVar2;
        this.d = Status.a;
        fVar.a(this);
    }

    private void g() {
        if (this.e != null) {
            this.e.a(this.c.d());
        }
    }

    public Status a() {
        return this.d;
    }

    public synchronized void a(a aVar) {
        if (!this.g) {
            if (aVar == null) {
                aw.a("Unexpected null container.");
            } else {
                this.c = aVar;
                g();
            }
        }
    }

    public synchronized void a(com.google.android.gms.tagmanager.b.a aVar) {
        if (this.g) {
            aw.a("ContainerHolder is released.");
        } else if (aVar == null) {
            this.e = null;
        } else {
            this.e = new b(this, aVar, this.a);
            if (this.c != null) {
                g();
            }
        }
    }

    public synchronized void a(String str) {
        if (!this.g) {
            this.b.i(str);
        }
    }

    public synchronized void b() {
        if (this.g) {
            aw.a("Releasing a released ContainerHolder.");
        } else {
            this.g = true;
            this.h.b(this);
            this.b.e();
            this.b = null;
            this.c = null;
            this.f = null;
            this.e = null;
        }
    }

    void b(String str) {
        if (this.g) {
            aw.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.f.a(str);
        }
    }

    public synchronized a c() {
        a aVar = null;
        synchronized (this) {
            if (this.g) {
                aw.a("ContainerHolder is released.");
            } else {
                if (this.c != null) {
                    this.b = this.c;
                    this.c = null;
                }
                aVar = this.b;
            }
        }
        return aVar;
    }

    public synchronized void d() {
        if (this.g) {
            aw.a("Refreshing a released ContainerHolder.");
        } else {
            this.f.a();
        }
    }

    String e() {
        if (!this.g) {
            return this.b.a();
        }
        aw.a("getContainerId called on a released ContainerHolder.");
        return "";
    }

    String f() {
        if (!this.g) {
            return this.f.b();
        }
        aw.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }
}
