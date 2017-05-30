package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.aj;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class aoq {
    private final String a;
    private final String b;
    private final String c;
    private final apq d;
    private final di e;
    private final ExecutorService f;
    private final ScheduledExecutorService g;
    private final aj h;
    private final com.google.android.gms.common.util.e i;
    private final aos j;
    private app k;
    private volatile int l = 1;
    private List<aow> m = new ArrayList();
    private ScheduledFuture<?> n = null;
    private boolean o = false;

    private class a implements Runnable {
        final /* synthetic */ aoq a;

        private a(aoq com_google_android_gms_internal_aoq) {
            this.a = com_google_android_gms_internal_aoq;
        }

        @WorkerThread
        public void run() {
            this.a.l = 3;
            String d = this.a.a;
            aph.b(new StringBuilder(String.valueOf(d).length() + 26).append("Container ").append(d).append(" loading failed.").toString());
            if (this.a.m != null) {
                for (aow com_google_android_gms_internal_aow : this.a.m) {
                    if (com_google_android_gms_internal_aow.h()) {
                        try {
                            this.a.h.a("app", com_google_android_gms_internal_aow.d(), com_google_android_gms_internal_aow.e(), com_google_android_gms_internal_aow.a());
                            d = String.valueOf(com_google_android_gms_internal_aow.d());
                            aph.d(new StringBuilder(String.valueOf(d).length() + 50).append("Logged event ").append(d).append(" to Firebase (marked as passthrough).").toString());
                        } catch (RemoteException e) {
                            String str = "Error logging event with measurement proxy:";
                            d = String.valueOf(e.getMessage());
                            aph.a(d.length() != 0 ? str.concat(d) : new String(str));
                        }
                    } else {
                        d = String.valueOf(com_google_android_gms_internal_aow.d());
                        aph.d(new StringBuilder(String.valueOf(d).length() + 45).append("Discarded event ").append(d).append(" (marked as non-passthrough).").toString());
                    }
                }
                this.a.m = null;
            }
        }
    }

    private class b implements com.google.android.gms.internal.di.a, Runnable {
        final /* synthetic */ aoq a;

        private b(aoq com_google_android_gms_internal_aoq) {
            this.a = com_google_android_gms_internal_aoq;
        }

        public void a(dm dmVar) {
            if (dmVar.a() == Status.a) {
                this.a.f.execute(new e(this.a, dmVar));
            } else {
                this.a.f.execute(new a());
            }
        }

        @WorkerThread
        public void run() {
            com.google.android.gms.common.internal.d.a(this.a.l == 1);
            List arrayList = new ArrayList();
            this.a.o = false;
            if (apn.a().a(this.a.a)) {
                arrayList.add(Integer.valueOf(0));
            } else {
                this.a.o = this.a.j.d();
                if (this.a.o) {
                    arrayList.add(Integer.valueOf(1));
                    arrayList.add(Integer.valueOf(0));
                } else {
                    arrayList.add(Integer.valueOf(0));
                    arrayList.add(Integer.valueOf(1));
                }
                arrayList.add(Integer.valueOf(2));
            }
            this.a.e.a(this.a.a, this.a.c, this.a.b, arrayList, this, this.a.j);
        }
    }

    private class c implements Runnable {
        final /* synthetic */ aoq a;
        private final aow b;

        public c(aoq com_google_android_gms_internal_aoq, aow com_google_android_gms_internal_aow) {
            this.a = com_google_android_gms_internal_aoq;
            this.b = com_google_android_gms_internal_aow;
        }

        @WorkerThread
        public void run() {
            String str;
            String valueOf;
            if (this.a.l == 2) {
                str = "Evaluating tags for event ";
                valueOf = String.valueOf(this.b.d());
                aph.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.a.k.a(this.b);
            } else if (this.a.l == 1) {
                this.a.m.add(this.b);
                valueOf = String.valueOf(this.b.d());
                aph.d(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Added event ").append(valueOf).append(" to pending queue.").toString());
            } else if (this.a.l == 3) {
                valueOf = String.valueOf(this.b.d());
                aph.d(new StringBuilder(String.valueOf(valueOf).length() + 61).append("Failed to evaluate tags for event ").append(valueOf).append(" (container failed to load)").toString());
                if (this.b.h()) {
                    try {
                        this.a.h.a("app", this.b.d(), this.b.e(), this.b.a());
                        valueOf = String.valueOf(this.b.d());
                        aph.d(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Logged passthrough event ").append(valueOf).append(" to Firebase.").toString());
                        return;
                    } catch (RemoteException e) {
                        str = "Error logging event with measurement proxy:";
                        valueOf = String.valueOf(e.getMessage());
                        aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return;
                    }
                }
                str = "Discarded non-passthrough event ";
                valueOf = String.valueOf(this.b.d());
                aph.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    private class d implements com.google.android.gms.internal.di.a, Runnable {
        final /* synthetic */ aoq a;

        private d(aoq com_google_android_gms_internal_aoq) {
            this.a = com_google_android_gms_internal_aoq;
        }

        public void a(dm dmVar) {
            if (dmVar.a() == Status.a) {
                String d = this.a.a;
                aph.d(new StringBuilder(String.valueOf(d).length() + 47).append("Refreshed container ").append(d).append(". Reinitializing runtime...").toString());
                this.a.f.execute(new e(this.a, dmVar));
                return;
            }
            this.a.a(this.a.j.b());
        }

        @WorkerThread
        public void run() {
            com.google.android.gms.common.internal.d.a(this.a.l == 2);
            if (!apn.a().a(this.a.a)) {
                String d = this.a.a;
                aph.d(new StringBuilder(String.valueOf(d).length() + 24).append("Refreshing container ").append(d).append("...").toString());
                List arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(0));
                this.a.e.a(this.a.a, this.a.c, this.a.b, arrayList, this, this.a.j);
            }
        }
    }

    private class e implements Runnable {
        final /* synthetic */ aoq a;
        private final dm b;

        e(aoq com_google_android_gms_internal_aoq, dm dmVar) {
            this.a = com_google_android_gms_internal_aoq;
            this.b = dmVar;
        }

        @WorkerThread
        public void run() {
            String valueOf;
            dv c = this.b.b().c();
            dy c2 = this.b.c();
            Object obj = this.a.k == null ? 1 : null;
            this.a.k = this.a.d.a(c, c2);
            this.a.l = 2;
            String d = this.a.a;
            aph.d(new StringBuilder(String.valueOf(d).length() + 48).append("Container ").append(d).append(" loaded during runtime initialization.").toString());
            if (this.a.m != null) {
                for (aow com_google_android_gms_internal_aow : this.a.m) {
                    String str = "Evaluating tags for pending event ";
                    valueOf = String.valueOf(com_google_android_gms_internal_aow.d());
                    aph.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    this.a.k.a(com_google_android_gms_internal_aow);
                }
                this.a.m = null;
            }
            this.a.k.a();
            valueOf = "Runtime initialized successfully for container ";
            d = String.valueOf(this.a.a);
            aph.d(d.length() != 0 ? valueOf.concat(d) : new String(valueOf));
            long d2 = this.b.b().d() + this.a.j.a();
            if (obj == null || !this.a.o || this.b.d() != 1 || d2 >= this.a.i.a()) {
                this.a.a(Math.max(900000, d2 - this.a.i.a()));
            } else {
                this.a.a(this.a.j.c());
            }
        }
    }

    aoq(String str, @Nullable String str2, @Nullable String str3, apq com_google_android_gms_internal_apq, di diVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, aj ajVar, com.google.android.gms.common.util.e eVar, aos com_google_android_gms_internal_aos) {
        this.a = (String) com.google.android.gms.common.internal.d.a(str);
        this.d = (apq) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_apq);
        this.e = (di) com.google.android.gms.common.internal.d.a(diVar);
        this.f = (ExecutorService) com.google.android.gms.common.internal.d.a(executorService);
        this.g = (ScheduledExecutorService) com.google.android.gms.common.internal.d.a(scheduledExecutorService);
        this.h = (aj) com.google.android.gms.common.internal.d.a(ajVar);
        this.i = (com.google.android.gms.common.util.e) com.google.android.gms.common.internal.d.a(eVar);
        this.j = (aos) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_aos);
        this.b = str3;
        this.c = str2;
        this.m.add(new aow("gtm.load", new Bundle(), "gtm", new Date(), false, this.h));
        String str4 = this.a;
        aph.d(new StringBuilder(String.valueOf(str4).length() + 35).append("Container ").append(str4).append("is scheduled for loading.").toString());
        this.f.execute(new b());
    }

    private void a(long j) {
        if (this.n != null) {
            this.n.cancel(false);
        }
        String str = this.a;
        aph.d(new StringBuilder(String.valueOf(str).length() + 45).append("Refresh container ").append(str).append(" in ").append(j).append("ms.").toString());
        this.n = this.g.schedule(new Runnable(this) {
            final /* synthetic */ aoq a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.f.execute(new d());
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    public void a() {
        this.f.execute(new Runnable(this) {
            final /* synthetic */ aoq a;

            {
                this.a = r1;
            }

            @WorkerThread
            public void run() {
                if (this.a.l == 2) {
                    this.a.k.a();
                }
            }
        });
    }

    public void a(aow com_google_android_gms_internal_aow) {
        this.f.execute(new c(this, com_google_android_gms_internal_aow));
    }
}
