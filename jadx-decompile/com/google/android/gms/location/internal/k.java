package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.l;
import com.google.android.gms.location.w;
import com.google.android.gms.location.x;
import java.util.HashMap;
import java.util.Map;

public class k {
    private final p<i> a;
    private final Context b;
    private ContentProviderClient c = null;
    private boolean d = false;
    private Map<l, c> e = new HashMap();
    private Map<com.google.android.gms.location.k, a> f = new HashMap();

    private static class a extends com.google.android.gms.location.w.a {
        private Handler a;

        a(final com.google.android.gms.location.k kVar, Looper looper) {
            if (looper == null) {
                looper = Looper.myLooper();
                d.a(looper != null, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.a = new Handler(this, looper) {
                final /* synthetic */ a b;

                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 0:
                            kVar.a((LocationResult) message.obj);
                            return;
                        case 1:
                            kVar.a((LocationAvailability) message.obj);
                            return;
                        default:
                            return;
                    }
                }
            };
        }

        private synchronized void a(int i, Object obj) {
            if (this.a == null) {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
            } else {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.obj = obj;
                this.a.sendMessage(obtain);
            }
        }

        public synchronized void a() {
            this.a = null;
        }

        public void a(LocationAvailability locationAvailability) {
            a(1, locationAvailability);
        }

        public void a(LocationResult locationResult) {
            a(0, locationResult);
        }
    }

    private static class b extends Handler {
        private final l a;

        public b(l lVar) {
            this.a = lVar;
        }

        public b(l lVar, Looper looper) {
            super(looper);
            this.a = lVar;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.b(new Location((Location) message.obj));
                    return;
                default:
                    Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                    return;
            }
        }
    }

    private static class c extends com.google.android.gms.location.x.a {
        private Handler a;

        c(l lVar, Looper looper) {
            if (looper == null) {
                d.a(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.a = looper == null ? new b(lVar) : new b(lVar, looper);
        }

        public synchronized void a() {
            this.a = null;
        }

        public synchronized void a(Location location) {
            if (this.a == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            } else {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = location;
                this.a.sendMessage(obtain);
            }
        }
    }

    public k(Context context, p<i> pVar) {
        this.b = context;
        this.a = pVar;
    }

    private a a(com.google.android.gms.location.k kVar, Looper looper) {
        a aVar;
        synchronized (this.f) {
            aVar = (a) this.f.get(kVar);
            if (aVar == null) {
                aVar = new a(kVar, looper);
            }
            this.f.put(kVar, aVar);
        }
        return aVar;
    }

    private c a(l lVar, Looper looper) {
        c cVar;
        synchronized (this.e) {
            cVar = (c) this.e.get(lVar);
            if (cVar == null) {
                cVar = new c(lVar, looper);
            }
            this.e.put(lVar, cVar);
        }
        return cVar;
    }

    public Location a() {
        this.a.a();
        try {
            return ((i) this.a.c()).b(this.b.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void a(PendingIntent pendingIntent, g gVar) {
        this.a.a();
        ((i) this.a.c()).a(LocationRequestUpdateData.a(pendingIntent, gVar));
    }

    public void a(Location location) {
        this.a.a();
        ((i) this.a.c()).a(location);
    }

    public void a(LocationRequest locationRequest, PendingIntent pendingIntent, g gVar) {
        this.a.a();
        ((i) this.a.c()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationRequest), pendingIntent, gVar));
    }

    public void a(LocationRequest locationRequest, l lVar, Looper looper, g gVar) {
        this.a.a();
        ((i) this.a.c()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationRequest), a(lVar, looper), gVar));
    }

    public void a(LocationRequestInternal locationRequestInternal, com.google.android.gms.location.k kVar, Looper looper, g gVar) {
        this.a.a();
        ((i) this.a.c()).a(LocationRequestUpdateData.a(locationRequestInternal, a(kVar, looper), gVar));
    }

    public void a(g gVar) {
        this.a.a();
        ((i) this.a.c()).a(gVar);
    }

    public void a(com.google.android.gms.location.k kVar, g gVar) {
        this.a.a();
        d.a(kVar, "Invalid null callback");
        synchronized (this.f) {
            w wVar = (a) this.f.remove(kVar);
            if (wVar != null) {
                wVar.a();
                ((i) this.a.c()).a(LocationRequestUpdateData.a(wVar, gVar));
            }
        }
    }

    public void a(l lVar, g gVar) {
        this.a.a();
        d.a(lVar, "Invalid null listener");
        synchronized (this.e) {
            x xVar = (c) this.e.remove(lVar);
            if (xVar != null) {
                xVar.a();
                ((i) this.a.c()).a(LocationRequestUpdateData.a(xVar, gVar));
            }
        }
    }

    public void a(boolean z) {
        this.a.a();
        ((i) this.a.c()).a(z);
        this.d = z;
    }

    public LocationAvailability b() {
        this.a.a();
        try {
            return ((i) this.a.c()).c(this.b.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void c() {
        try {
            synchronized (this.e) {
                for (x xVar : this.e.values()) {
                    if (xVar != null) {
                        ((i) this.a.c()).a(LocationRequestUpdateData.a(xVar, null));
                    }
                }
                this.e.clear();
            }
            synchronized (this.f) {
                for (w wVar : this.f.values()) {
                    if (wVar != null) {
                        ((i) this.a.c()).a(LocationRequestUpdateData.a(wVar, null));
                    }
                }
                this.f.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void d() {
        if (this.d) {
            try {
                a(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
