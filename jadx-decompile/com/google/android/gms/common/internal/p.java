package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class p<T extends IInterface> {
    public static final String[] d = new String[]{"service_esmobile", "service_googleme"};
    private int a;
    final Handler b;
    protected AtomicInteger c;
    private long e;
    private long f;
    private int g;
    private long h;
    private final Context i;
    private final Looper j;
    private final y k;
    private final com.google.android.gms.common.j l;
    private final Object m;
    private final Object n;
    private ag o;
    private f p;
    private T q;
    private final ArrayList<e<?>> r;
    private h s;
    private int t;
    private final b u;
    private final c v;
    private final int w;
    private final String x;

    public interface b {
        void a(int i);

        void a(@Nullable Bundle bundle);
    }

    public interface c {
        void a(@NonNull ConnectionResult connectionResult);
    }

    protected abstract class e<TListener> {
        private TListener a;
        private boolean b = false;
        final /* synthetic */ p d;

        public e(p pVar, TListener tListener) {
            this.d = pVar;
            this.a = tListener;
        }

        protected abstract void a(TListener tListener);

        protected abstract void b();

        public void c() {
            synchronized (this) {
                Object obj = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    a(obj);
                } catch (RuntimeException e) {
                    b();
                    throw e;
                }
            }
            b();
            synchronized (this) {
                this.b = true;
            }
            d();
        }

        public void d() {
            e();
            synchronized (this.d.r) {
                this.d.r.remove(this);
            }
        }

        public void e() {
            synchronized (this) {
                this.a = null;
            }
        }
    }

    private abstract class a extends e<Boolean> {
        public final int a;
        public final Bundle b;
        final /* synthetic */ p c;

        @BinderThread
        protected a(p pVar, int i, Bundle bundle) {
            this.c = pVar;
            super(pVar, Boolean.valueOf(true));
            this.a = i;
            this.b = bundle;
        }

        protected abstract void a(ConnectionResult connectionResult);

        protected void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                this.c.b(1, null);
                return;
            }
            switch (this.a) {
                case 0:
                    if (!a()) {
                        this.c.b(1, null);
                        a(new ConnectionResult(8, null));
                        return;
                    }
                    return;
                case 10:
                    this.c.b(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    this.c.b(1, null);
                    if (this.b != null) {
                        pendingIntent = (PendingIntent) this.b.getParcelable("pendingIntent");
                    }
                    a(new ConnectionResult(this.a, pendingIntent));
                    return;
            }
        }

        protected /* synthetic */ void a(Object obj) {
            a((Boolean) obj);
        }

        protected abstract boolean a();

        protected void b() {
        }
    }

    final class d extends Handler {
        final /* synthetic */ p a;

        public d(p pVar, Looper looper) {
            this.a = pVar;
            super(looper);
        }

        private void a(Message message) {
            e eVar = (e) message.obj;
            eVar.b();
            eVar.d();
        }

        private boolean b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5;
        }

        public void handleMessage(Message message) {
            PendingIntent pendingIntent = null;
            if (this.a.c.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
            } else if ((message.what == 1 || message.what == 5) && !this.a.u()) {
                a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.a.p.a(connectionResult);
                this.a.a(connectionResult);
            } else if (message.what == 4) {
                this.a.b(4, null);
                if (this.a.u != null) {
                    this.a.u.a(message.arg2);
                }
                this.a.a(message.arg2);
                this.a.a(4, 1, null);
            } else if (message.what == 2 && !this.a.t()) {
                a(message);
            } else if (b(message)) {
                ((e) message.obj).c();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            }
        }
    }

    public interface f {
        void a(@NonNull ConnectionResult connectionResult);
    }

    public static final class g extends com.google.android.gms.common.internal.af.a {
        private p a;
        private final int b;

        public g(@NonNull p pVar, int i) {
            this.a = pVar;
            this.b = i;
        }

        private void a() {
            this.a = null;
        }

        @BinderThread
        public void a(int i, @Nullable Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @BinderThread
        public void a(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            d.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.a(i, iBinder, bundle, this.b);
            a();
        }
    }

    public final class h implements ServiceConnection {
        final /* synthetic */ p a;
        private final int b;

        public h(p pVar, int i) {
            this.a = pVar;
            this.b = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a((Object) iBinder, (Object) "Expecting a valid IBinder");
            synchronized (this.a.n) {
                this.a.o = com.google.android.gms.common.internal.ag.a.a(iBinder);
            }
            this.a.a(0, null, this.b);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.a.n) {
                this.a.o = null;
            }
            this.a.b.sendMessage(this.a.b.obtainMessage(4, this.b, 1));
        }
    }

    protected class i implements f {
        final /* synthetic */ p a;

        public i(p pVar) {
            this.a = pVar;
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.b()) {
                this.a.a(null, this.a.I());
            } else if (this.a.v != null) {
                this.a.v.a(connectionResult);
            }
        }
    }

    protected final class j extends a {
        public final IBinder e;
        final /* synthetic */ p f;

        @BinderThread
        public j(p pVar, int i, IBinder iBinder, Bundle bundle) {
            this.f = pVar;
            super(pVar, i, bundle);
            this.e = iBinder;
        }

        protected void a(ConnectionResult connectionResult) {
            if (this.f.v != null) {
                this.f.v.a(connectionResult);
            }
            this.f.a(connectionResult);
        }

        protected boolean a() {
            try {
                String interfaceDescriptor = this.e.getInterfaceDescriptor();
                if (this.f.b().equals(interfaceDescriptor)) {
                    IInterface b = this.f.b(this.e);
                    if (b == null || !this.f.a(2, 3, b)) {
                        return false;
                    }
                    Bundle g = this.f.g();
                    if (this.f.u != null) {
                        this.f.u.a(g);
                    }
                    return true;
                }
                String valueOf = String.valueOf(this.f.b());
                Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class k extends a {
        final /* synthetic */ p e;

        @BinderThread
        public k(p pVar, int i, @Nullable Bundle bundle) {
            this.e = pVar;
            super(pVar, i, bundle);
        }

        protected void a(ConnectionResult connectionResult) {
            this.e.p.a(connectionResult);
            this.e.a(connectionResult);
        }

        protected boolean a() {
            this.e.p.a(ConnectionResult.v);
            return true;
        }
    }

    protected p(Context context, Looper looper, int i, b bVar, c cVar, String str) {
        this(context, looper, y.a(context), com.google.android.gms.common.j.b(), i, (b) d.a((Object) bVar), (c) d.a((Object) cVar), str);
    }

    protected p(Context context, Looper looper, y yVar, com.google.android.gms.common.j jVar, int i, b bVar, c cVar, String str) {
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.c = new AtomicInteger(0);
        this.i = (Context) d.a((Object) context, (Object) "Context must not be null");
        this.j = (Looper) d.a((Object) looper, (Object) "Looper must not be null");
        this.k = (y) d.a((Object) yVar, (Object) "Supervisor must not be null");
        this.l = (com.google.android.gms.common.j) d.a((Object) jVar, (Object) "API availability must not be null");
        this.b = new d(this, looper);
        this.w = i;
        this.u = bVar;
        this.v = cVar;
        this.x = str;
    }

    private boolean a(int i, int i2, T t) {
        boolean z;
        synchronized (this.m) {
            if (this.t != i) {
                z = false;
            } else {
                b(i2, t);
                z = true;
            }
        }
        return z;
    }

    private void b(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        d.b(z);
        synchronized (this.m) {
            this.t = i;
            this.q = t;
            a(i, (IInterface) t);
            switch (i) {
                case 1:
                    i();
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    a((IInterface) t);
                    break;
            }
        }
    }

    private void h() {
        if (this.s != null) {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(y());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
            this.k.b(a(), y(), this.s, z());
            this.c.incrementAndGet();
        }
        this.s = new h(this, this.c.get());
        if (!this.k.a(a(), y(), this.s, z())) {
            valueOf = String.valueOf(a());
            valueOf2 = String.valueOf(y());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
            a(16, null, this.c.get());
        }
    }

    private void i() {
        if (this.s != null) {
            this.k.b(a(), y(), this.s, z());
            this.s = null;
        }
    }

    public void A() {
        int a = this.l.a(this.i);
        if (a != 0) {
            b(1, null);
            this.p = new i(this);
            this.b.sendMessage(this.b.obtainMessage(3, this.c.get(), a));
            return;
        }
        a(new i(this));
    }

    public final Context B() {
        return this.i;
    }

    public final Looper C() {
        return this.j;
    }

    public Account D() {
        return null;
    }

    public final Account E() {
        return D() != null ? D() : new Account("<<default account>>", "com.google");
    }

    protected final void F() {
        if (!t()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T G() {
        T t;
        synchronized (this.m) {
            if (this.t == 4) {
                throw new DeadObjectException();
            }
            F();
            d.a(this.q != null, (Object) "Client is connected but service is null");
            t = this.q;
        }
        return t;
    }

    public boolean H() {
        return false;
    }

    protected Set<Scope> I() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    protected abstract String a();

    @CallSuper
    protected void a(int i) {
        this.a = i;
        this.e = System.currentTimeMillis();
    }

    protected void a(int i, @Nullable Bundle bundle, int i2) {
        this.b.sendMessage(this.b.obtainMessage(5, i2, -1, new k(this, i, bundle)));
    }

    @BinderThread
    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.b.sendMessage(this.b.obtainMessage(1, i2, -1, new j(this, i, iBinder, bundle)));
    }

    void a(int i, T t) {
    }

    @CallSuper
    protected void a(@NonNull T t) {
        this.f = System.currentTimeMillis();
    }

    @CallSuper
    protected void a(ConnectionResult connectionResult) {
        this.g = connectionResult.c();
        this.h = System.currentTimeMillis();
    }

    @WorkerThread
    public void a(ac acVar, Set<Scope> set) {
        try {
            GetServiceRequest a = new GetServiceRequest(this.w).a(this.i.getPackageName()).a(c());
            if (set != null) {
                a.a((Collection) set);
            }
            if (v()) {
                a.a(E()).a(acVar);
            } else if (H()) {
                a.a(D());
            }
            synchronized (this.n) {
                if (this.o != null) {
                    this.o.a(new g(this, this.c.get()), a);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            b(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public void a(@NonNull f fVar) {
        this.p = (f) d.a((Object) fVar, (Object) "Connection progress callbacks cannot be null.");
        b(2, null);
    }

    public void a(f fVar, ConnectionResult connectionResult) {
        this.p = (f) d.a((Object) fVar, (Object) "Connection progress callbacks cannot be null.");
        this.b.sendMessage(this.b.obtainMessage(3, this.c.get(), connectionResult.c(), connectionResult.d()));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.m) {
            int i = this.t;
            IInterface iInterface = this.q;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.e > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.a) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.a));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.e;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.e)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.h > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(com.google.android.gms.common.api.f.b(this.g));
            append = printWriter.append(" lastFailedTime=");
            j = this.h;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.h)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    @Nullable
    protected abstract T b(IBinder iBinder);

    @NonNull
    protected abstract String b();

    public void b(int i) {
        this.b.sendMessage(this.b.obtainMessage(4, this.c.get(), i));
    }

    protected Bundle c() {
        return new Bundle();
    }

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public void f() {
        this.c.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int i = 0; i < size; i++) {
                ((e) this.r.get(i)).e();
            }
            this.r.clear();
        }
        synchronized (this.n) {
            this.o = null;
        }
        b(1, null);
    }

    public Bundle g() {
        return null;
    }

    public boolean h_() {
        return false;
    }

    public boolean t() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 3;
        }
        return z;
    }

    public boolean u() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 2;
        }
        return z;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return true;
    }

    @Nullable
    public IBinder x() {
        IBinder iBinder;
        synchronized (this.n) {
            if (this.o == null) {
                iBinder = null;
            } else {
                iBinder = this.o.asBinder();
            }
        }
        return iBinder;
    }

    protected String y() {
        return "com.google.android.gms";
    }

    @Nullable
    protected final String z() {
        return this.x == null ? this.i.getClass().getName() : this.x;
    }
}
