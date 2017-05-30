package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class z<T> {
    private final Map<T, as<T>> a = new HashMap();

    private static class a<T> extends b<Status> {
        private WeakReference<Map<T, as<T>>> a;
        private WeakReference<T> b;

        a(Map<T, as<T>> map, T t, com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
            this.a = new WeakReference(map);
            this.b = new WeakReference(t);
        }

        public void a(Status status) {
            Map map = (Map) this.a.get();
            Object obj = this.b.get();
            if (!(status.a().f() || map == null || obj == null)) {
                synchronized (map) {
                    as asVar = (as) map.remove(obj);
                    if (asVar != null) {
                        asVar.a();
                    }
                }
            }
            a(status);
        }
    }

    private static class b<T> extends b<Status> {
        private WeakReference<Map<T, as<T>>> a;
        private WeakReference<T> b;

        b(Map<T, as<T>> map, T t, com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
            this.a = new WeakReference(map);
            this.b = new WeakReference(t);
        }

        public void a(Status status) {
            Map map = (Map) this.a.get();
            Object obj = this.b.get();
            if (!(status.a().i() != 4002 || map == null || obj == null)) {
                synchronized (map) {
                    as asVar = (as) map.remove(obj);
                    if (asVar != null) {
                        asVar.a();
                    }
                }
            }
            a(status);
        }
    }

    z() {
    }

    public void a(IBinder iBinder) {
        synchronized (this.a) {
            y a = com.google.android.gms.wearable.internal.y.a.a(iBinder);
            w oVar = new o();
            for (Entry entry : this.a.entrySet()) {
                as asVar = (as) entry.getValue();
                try {
                    a.a(oVar, new AddListenerRequest(asVar));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(asVar);
                        Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("onPostInitHandler: added: ").append(valueOf).append("/").append(valueOf2).toString());
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(asVar);
                    Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf3).length() + 32) + String.valueOf(valueOf4).length()).append("onPostInitHandler: Didn't add: ").append(valueOf3).append("/").append(valueOf4).toString());
                }
            }
        }
    }

    public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, T t) {
        synchronized (this.a) {
            as asVar = (as) this.a.remove(t);
            if (asVar == null) {
                bVar.a(new Status(4002));
                return;
            }
            asVar.a();
            ((y) arVar.G()).a(new b(this.a, t, bVar), new RemoveListenerRequest(asVar));
        }
    }

    public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, T t, as<T> asVar) {
        synchronized (this.a) {
            if (this.a.get(t) != null) {
                bVar.a(new Status(4001));
                return;
            }
            this.a.put(t, asVar);
            try {
                ((y) arVar.G()).a(new a(this.a, t, bVar), new AddListenerRequest(asVar));
            } catch (RemoteException e) {
                this.a.remove(t);
                throw e;
            }
        }
    }
}
