package com.fimi.soul.drone.droneconnection.connection.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.e;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class MiLinkService extends Service {
    private static final String a = MiLinkService.class.getSimpleName();
    private final a b = new a(this);
    private com.fimi.soul.drone.droneconnection.connection.a c;

    public static class a extends Binder {
        private final WeakReference<MiLinkService> a;

        a(MiLinkService miLinkService) {
            this.a = new WeakReference(miLinkService);
        }

        public int a() {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            return miLinkService == null ? 0 : miLinkService.c.i();
        }

        public void a(c cVar) {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null && miLinkService.c != null && miLinkService.c.i() != 0) {
                miLinkService.c.b(cVar);
            }
        }

        public void a(String str) {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null && miLinkService.c != null) {
                miLinkService.c.a(str);
            }
        }

        public void a(String str, e eVar) {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null && miLinkService.c != null) {
                miLinkService.c.a(str, eVar);
            }
        }

        public void a(boolean z) {
            if (((MiLinkService) this.a.get()).c != null) {
                ((MiLinkService) this.a.get()).c.a(z);
            }
        }

        public void a(byte[] bArr) {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null && miLinkService.c != null && miLinkService.c.i() != 0) {
                miLinkService.c.c(bArr);
            }
        }

        public void b() {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null) {
                miLinkService.a();
            }
        }

        public void b(boolean z) {
            if (((MiLinkService) this.a.get()).c != null) {
                ((MiLinkService) this.a.get()).c.b(z);
            }
        }

        public void c() {
            MiLinkService miLinkService = (MiLinkService) this.a.get();
            if (miLinkService != null) {
                miLinkService.stopSelf();
                miLinkService.b();
            }
        }

        public boolean d() {
            return ((MiLinkService) this.a.get()).c != null ? ((MiLinkService) this.a.get()).c.c() : false;
        }
    }

    private void a() {
        com.fimi.soul.drone.droneconnection.connection.g.a valueOf = com.fimi.soul.drone.droneconnection.connection.g.a.valueOf(com.fimi.soul.drone.droneconnection.connection.a.a.a());
        if (this.c == null || this.c.j() != valueOf.a()) {
            this.c = valueOf.a(this);
        }
        if (this.c != null) {
            try {
                this.c.e();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.c.i() != 2) {
            this.c.g();
        }
    }

    private void b() {
        Log.d(a, "Pre disconnect");
        if (this.c != null && this.c.i() != 0) {
            this.c.h();
        }
    }

    public IBinder onBind(Intent intent) {
        return this.b;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        b();
    }
}
