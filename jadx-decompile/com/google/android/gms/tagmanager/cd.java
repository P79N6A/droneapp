package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gi.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class cd implements e {
    private final String a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final a d;
    private ScheduledFuture<?> e;
    private boolean f;
    private dq g;
    private String h;
    private av<j> i;

    interface b {
        ScheduledExecutorService a();
    }

    interface a {
        cc a(dq dqVar);
    }

    public cd(Context context, String str, dq dqVar) {
        this(context, str, dqVar, null, null);
    }

    cd(Context context, String str, dq dqVar, b bVar, a aVar) {
        this.g = dqVar;
        this.b = context;
        this.a = str;
        if (bVar == null) {
            bVar = new b(this) {
                final /* synthetic */ cd a;

                {
                    this.a = r1;
                }

                public ScheduledExecutorService a() {
                    return Executors.newSingleThreadScheduledExecutor();
                }
            };
        }
        this.c = bVar.a();
        if (aVar == null) {
            this.d = new a(this) {
                final /* synthetic */ cd a;

                {
                    this.a = r1;
                }

                public cc a(dq dqVar) {
                    return new cc(this.a.b, this.a.a, dqVar);
                }
            };
        } else {
            this.d = aVar;
        }
    }

    private synchronized void a() {
        if (this.f) {
            throw new IllegalStateException("called method after closed");
        }
    }

    private cc b(String str) {
        cc a = this.d.a(this.g);
        a.a(this.i);
        a.a(this.h);
        a.b(str);
        return a;
    }

    public synchronized void a(long j, String str) {
        String str2 = this.a;
        aw.e(new StringBuilder(String.valueOf(str2).length() + 55).append("loadAfterDelay: containerId=").append(str2).append(" delay=").append(j).toString());
        a();
        if (this.i == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.e != null) {
            this.e.cancel(false);
        }
        this.e = this.c.schedule(b(str), j, TimeUnit.MILLISECONDS);
    }

    public synchronized void a(av<j> avVar) {
        a();
        this.i = avVar;
    }

    public synchronized void a(String str) {
        a();
        this.h = str;
    }

    public synchronized void b() {
        a();
        if (this.e != null) {
            this.e.cancel(false);
        }
        this.c.shutdown();
        this.f = true;
    }
}
