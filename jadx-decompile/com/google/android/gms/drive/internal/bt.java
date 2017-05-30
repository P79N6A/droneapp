package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.y;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.DriveEventService;
import com.google.android.gms.drive.events.a;
import com.google.android.gms.drive.events.e;
import com.google.android.gms.drive.events.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bt extends w<n> {
    final b a;
    final Map<DriveId, Map<a, f>> e = new HashMap();
    final Map<e, f> f = new HashMap();
    final Map<DriveId, Map<k, f>> g = new HashMap();
    final Map<DriveId, Map<k, f>> h = new HashMap();
    private final String i;
    private final Bundle j;
    private final boolean k;
    private volatile DriveId l;
    private volatile DriveId m;
    private volatile boolean n = false;

    public bt(Context context, Looper looper, s sVar, b bVar, c cVar, Bundle bundle) {
        super(context, looper, 11, sVar, bVar, cVar);
        this.i = sVar.h();
        this.a = bVar;
        this.j = bundle;
        Intent intent = new Intent(DriveEventService.a);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        String valueOf;
        switch (queryIntentServices.size()) {
            case 0:
                this.k = false;
                return;
            case 1:
                ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                if (serviceInfo.exported) {
                    this.k = true;
                    return;
                } else {
                    valueOf = String.valueOf(serviceInfo.name);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Drive event service ").append(valueOf).append(" must be exported in AndroidManifest.xml").toString());
                }
            default:
                valueOf = String.valueOf(intent.getAction());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 72).append("AndroidManifest.xml can only define one service that handles the ").append(valueOf).append(" action").toString());
        }
    }

    private i<Status> a(g gVar, final int i, final DriveId driveId) {
        d.b(com.google.android.gms.drive.events.i.a(i, driveId));
        d.a(t(), "Client must be connected");
        return gVar.b(new bs.a(this, gVar) {
            final /* synthetic */ bt c;

            protected void a(bt btVar) {
                btVar.i().a(new RemoveEventListenerRequest(driveId, i), null, null, new at(this));
            }
        });
    }

    private i<Status> a(g gVar, final AddEventListenerRequest addEventListenerRequest) {
        d.b(com.google.android.gms.drive.events.i.a(addEventListenerRequest.b(), addEventListenerRequest.a()));
        d.a(t(), "Client must be connected");
        if (this.k) {
            return gVar.b(new bs.a(this, gVar) {
                final /* synthetic */ bt b;

                protected void a(bt btVar) {
                    btVar.i().a(addEventListenerRequest, null, null, new at(this));
                }
            });
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
    }

    private i<Status> a(g gVar, final AddEventListenerRequest addEventListenerRequest, final f fVar) {
        return gVar.b(new bs.a(this, gVar) {
            final /* synthetic */ bt c;

            protected void a(bt btVar) {
                btVar.i().a(addEventListenerRequest, fVar, null, new at(this));
            }
        });
    }

    private i<Status> a(g gVar, final RemoveEventListenerRequest removeEventListenerRequest, final f fVar) {
        return gVar.b(new bs.a(this, gVar) {
            final /* synthetic */ bt c;

            protected void a(bt btVar) {
                btVar.i().a(removeEventListenerRequest, fVar, null, new at(this));
            }
        });
    }

    public boolean H() {
        return true;
    }

    i<Status> a(g gVar, DriveId driveId) {
        return a(gVar, new AddEventListenerRequest(1, driveId));
    }

    i<Status> a(g gVar, DriveId driveId, a aVar) {
        i<Status> jVar;
        d.b(com.google.android.gms.drive.events.i.a(1, driveId));
        d.a(aVar, "listener");
        d.a(t(), "Client must be connected");
        synchronized (this.e) {
            Map map;
            Map map2 = (Map) this.e.get(driveId);
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                this.e.put(driveId, hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            f fVar = (f) map.get(aVar);
            if (fVar == null) {
                fVar = new f(C(), B(), 1, aVar);
                map.put(aVar, fVar);
            } else if (fVar.b(1)) {
                jVar = new j(gVar, Status.a);
            }
            fVar.a(1);
            jVar = a(gVar, new AddEventListenerRequest(1, driveId), fVar);
        }
        return jVar;
    }

    i<Status> a(g gVar, final List<String> list) {
        boolean z = true;
        d.b(list != null);
        if (list.isEmpty()) {
            z = false;
        }
        d.b(z);
        d.a(t(), "Client must be connected");
        return gVar.b(new bs.a(this, gVar) {
            final /* synthetic */ bt b;

            protected void a(bt btVar) {
                btVar.i().a(new CancelPendingActionsRequest(list), new at(this));
            }
        });
    }

    protected n a(IBinder iBinder) {
        return n.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.l = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.m = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.n = true;
        }
        super.a(i, iBinder, bundle, i2);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    i<Status> b(g gVar, DriveId driveId) {
        return a(gVar, 1, driveId);
    }

    i<Status> b(g gVar, DriveId driveId, a aVar) {
        i<Status> jVar;
        d.b(com.google.android.gms.drive.events.i.a(1, driveId));
        d.a(t(), "Client must be connected");
        d.a(aVar, "listener");
        synchronized (this.e) {
            Map map = (Map) this.e.get(driveId);
            if (map == null) {
                jVar = new j(gVar, Status.a);
            } else {
                f fVar = (f) map.remove(aVar);
                if (fVar == null) {
                    jVar = new j(gVar, Status.a);
                } else {
                    if (map.isEmpty()) {
                        this.e.remove(driveId);
                    }
                    jVar = a(gVar, new RemoveEventListenerRequest(driveId, 1), fVar);
                }
            }
        }
        return jVar;
    }

    protected String b() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    protected Bundle c() {
        String packageName = B().getPackageName();
        d.a(packageName);
        d.a(!J().f().isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.i)) {
            bundle.putString("proxy_package_name", this.i);
        }
        bundle.putAll(this.j);
        return bundle;
    }

    public void f() {
        if (t()) {
            try {
                ((n) G()).a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.f();
        synchronized (this.e) {
            this.e.clear();
        }
        synchronized (this.f) {
            this.f.clear();
        }
        synchronized (this.g) {
            this.g.clear();
        }
        synchronized (this.h) {
            this.h.clear();
        }
    }

    boolean h() {
        return y.a(B(), Process.myUid());
    }

    public n i() {
        return (n) G();
    }

    public DriveId j() {
        return this.l;
    }

    public DriveId k() {
        return this.m;
    }

    public boolean l() {
        return this.n;
    }

    public boolean m() {
        return this.k;
    }

    public boolean v() {
        return (B().getPackageName().equals(this.i) && h()) ? false : true;
    }
}
