package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.WorkerThread;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.b;
import com.google.android.gms.common.util.a;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.ahg.d;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class aic implements Callback {
    private static final Object d = new Object();
    private static aic e;
    private long a;
    private long b;
    private long c;
    private final Context f;
    private final b g;
    private int h;
    private final AtomicInteger i;
    private final SparseArray<c<?>> j;
    private final Map<ahh<?>, c<?>> k;
    private ahr l;
    private final Set<ahh<?>> m;
    private final Handler n;
    private final ReferenceQueue<u<?>> o;
    private final SparseArray<a> p;
    private b q;

    private aic(Context context) {
        this(context, b.a());
    }

    private aic(Context context, b bVar) {
        this.a = 5000;
        this.b = 120000;
        this.c = NotificationOptions.a;
        this.h = -1;
        this.i = new AtomicInteger(1);
        this.j = new SparseArray();
        this.k = new ConcurrentHashMap(5, 0.75f, 1);
        this.l = null;
        this.m = new a();
        this.o = new ReferenceQueue();
        this.p = new SparseArray();
        this.f = context;
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        this.n = new Handler(handlerThread.getLooper(), this);
        this.g = bVar;
    }

    private int a(u<?> uVar) {
        int andIncrement = this.i.getAndIncrement();
        this.n.sendMessage(this.n.obtainMessage(6, andIncrement, 0, uVar));
        return andIncrement;
    }

    public static Pair<aic, Integer> a(Context context, u<?> uVar) {
        Pair<aic, Integer> create;
        synchronized (d) {
            if (e == null) {
                e = new aic(context.getApplicationContext());
            }
            create = Pair.create(e, Integer.valueOf(e.a((u) uVar)));
        }
        return create;
    }

    public static aic a() {
        aic com_google_android_gms_internal_aic;
        synchronized (d) {
            com_google_android_gms_internal_aic = e;
        }
        return com_google_android_gms_internal_aic;
    }

    @WorkerThread
    private void a(int i) {
        c cVar = (c) this.j.get(i);
        if (cVar != null) {
            this.j.delete(i);
            cVar.c(i);
            return;
        }
        Log.wtf("GoogleApiManager", "onCleanupLeakInternal received for unknown instance: " + i, new Exception());
    }

    @WorkerThread
    private void a(int i, ail.b<?> bVar, g<Void> gVar) {
        ((c) this.j.get(i)).a(i, bVar, gVar);
    }

    @WorkerThread
    private void a(int i, aiq com_google_android_gms_internal_aiq, g<Void> gVar) {
        ((c) this.j.get(i)).a(i, com_google_android_gms_internal_aiq, gVar);
    }

    @WorkerThread
    private void a(u<?> uVar, int i) {
        ahh e = uVar.e();
        if (!this.k.containsKey(e)) {
            this.k.put(e, new c(this, uVar));
        }
        c cVar = (c) this.k.get(e);
        cVar.b(i);
        this.j.put(i, cVar);
        c.a(cVar);
        this.p.put(i, new a(this, uVar, i, this.o));
        if (this.q == null || !b.a(this.q).get()) {
            this.q = new b(this.o, this.p);
            this.q.start();
        }
    }

    @WorkerThread
    private void a(ahg com_google_android_gms_internal_ahg) {
        ((c) this.j.get(com_google_android_gms_internal_ahg.a)).a(com_google_android_gms_internal_ahg);
    }

    @WorkerThread
    private void b(int i, boolean z) {
        c cVar = (c) this.j.get(i);
        if (cVar != null) {
            if (!z) {
                this.j.delete(i);
            }
            cVar.a(i, z);
            return;
        }
        Log.wtf("GoogleApiManager", "onRelease received for unknown instance: " + i, new Exception());
    }

    @WorkerThread
    private void d() {
        for (c cVar : this.k.values()) {
            cVar.b();
            c.a(cVar);
        }
    }

    public void a(int i, boolean z) {
        this.n.sendMessage(this.n.obtainMessage(8, i, z ? 1 : 2));
    }

    public <O extends com.google.android.gms.common.api.a.a> void a(u<O> uVar, int i, ahl.a<? extends m, c> aVar) {
        this.n.sendMessage(this.n.obtainMessage(4, new ahg.b(uVar.f(), i, aVar)));
    }

    public <O extends com.google.android.gms.common.api.a.a, TResult> void a(u<O> uVar, int i, aiv<c, TResult> com_google_android_gms_internal_aiv_com_google_android_gms_common_api_a_c__TResult, g<TResult> gVar) {
        this.n.sendMessage(this.n.obtainMessage(4, new d(uVar.f(), i, com_google_android_gms_internal_aiv_com_google_android_gms_common_api_a_c__TResult, gVar)));
    }

    @WorkerThread
    public void a(ahk com_google_android_gms_internal_ahk) {
        for (ahh com_google_android_gms_internal_ahh : com_google_android_gms_internal_ahk.b()) {
            c cVar = (c) this.k.get(com_google_android_gms_internal_ahh);
            if (cVar == null) {
                com_google_android_gms_internal_ahk.a();
                return;
            } else if (cVar.d()) {
                com_google_android_gms_internal_ahk.a(com_google_android_gms_internal_ahh, ConnectionResult.v);
            } else if (cVar.c() != null) {
                com_google_android_gms_internal_ahk.a(com_google_android_gms_internal_ahh, cVar.c());
            } else {
                cVar.a(com_google_android_gms_internal_ahk);
            }
        }
    }

    public void a(ahr com_google_android_gms_internal_ahr) {
        synchronized (d) {
            if (com_google_android_gms_internal_ahr == null) {
                this.l = null;
                this.m.clear();
            }
        }
    }

    boolean a(ConnectionResult connectionResult, int i) {
        if (!connectionResult.a() && !this.g.a(connectionResult.c())) {
            return false;
        }
        this.g.a(this.f, connectionResult, i);
        return true;
    }

    public void b() {
        this.n.sendMessage(this.n.obtainMessage(3));
    }

    public void b(ConnectionResult connectionResult, int i) {
        if (!a(connectionResult, i)) {
            this.n.sendMessage(this.n.obtainMessage(5, i, 0));
        }
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        boolean z = false;
        Pair pair;
        switch (message.what) {
            case 1:
                a((ahk) message.obj);
                break;
            case 2:
                a(message.arg1);
                break;
            case 3:
                d();
                break;
            case 4:
                a((ahg) message.obj);
                break;
            case 5:
                if (this.j.get(message.arg1) != null) {
                    c.a((c) this.j.get(message.arg1), new Status(17, "Error resolution was canceled by the user."));
                    break;
                }
                break;
            case 6:
                a((u) message.obj, message.arg1);
                break;
            case 7:
                pair = (Pair) message.obj;
                a(message.arg1, (aiq) pair.first, (g) pair.second);
                break;
            case 8:
                int i = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                b(i, z);
                break;
            case 9:
                if (this.k.containsKey(message.obj)) {
                    c.b((c) this.k.get(message.obj));
                    break;
                }
                break;
            case 10:
                if (this.k.containsKey(message.obj)) {
                    c.c((c) this.k.get(message.obj));
                    break;
                }
                break;
            case 11:
                if (this.k.containsKey(message.obj)) {
                    c.d((c) this.k.get(message.obj));
                    break;
                }
                break;
            case 12:
                pair = (Pair) message.obj;
                a(message.arg1, (ail.b) pair.first, (g) pair.second);
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }
}
