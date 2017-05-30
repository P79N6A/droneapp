package com.google.firebase.b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.ajr;
import com.google.android.gms.internal.mt;
import com.google.android.gms.internal.mu;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.mx;
import com.google.android.gms.internal.my;
import com.google.android.gms.internal.mz.b;
import com.google.android.gms.internal.mz.c;
import com.google.android.gms.internal.mz.d;
import com.google.android.gms.internal.mz.e;
import com.google.android.gms.internal.mz.f;
import com.google.android.gms.internal.qv;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a {
    public static final String a = "";
    public static final long b = 0;
    public static final double c = 0.0d;
    public static final boolean d = false;
    public static final byte[] e = new byte[0];
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = -1;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    private static a m;
    private mv n;
    private mv o;
    private mv p;
    private my q;
    private final Context r;
    private final ReadWriteLock s;

    static class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    a(Context context) {
        this(context, null, null, null, null);
    }

    private a(Context context, mv mvVar, mv mvVar2, mv mvVar3, my myVar) {
        this.s = new ReentrantReadWriteLock(true);
        this.r = context;
        if (myVar != null) {
            this.q = myVar;
        } else {
            this.q = new my();
        }
        this.q.a(b(this.r));
        if (mvVar != null) {
            this.n = mvVar;
        }
        if (mvVar2 != null) {
            this.o = mvVar2;
        }
        if (mvVar3 != null) {
            this.p = mvVar3;
        }
    }

    private static long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private static mv a(com.google.android.gms.internal.mz.a aVar) {
        if (aVar == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (d dVar : aVar.a) {
            String str = dVar.a;
            Map hashMap2 = new HashMap();
            for (b bVar : dVar.b) {
                hashMap2.put(bVar.a, bVar.b);
            }
            hashMap.put(str, hashMap2);
        }
        return new mv(hashMap, aVar.b);
    }

    private static my a(c cVar) {
        if (cVar == null) {
            return null;
        }
        my myVar = new my();
        myVar.a(cVar.a);
        myVar.a(cVar.b);
        return myVar;
    }

    public static a a() {
        if (m != null) {
            return m;
        }
        com.google.firebase.b d = com.google.firebase.b.d();
        if (d != null) {
            return a(d.a());
        }
        throw new IllegalStateException("FirebaseApp has not been initialized.");
    }

    public static a a(Context context) {
        if (m == null) {
            e c = c(context);
            if (c == null) {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                }
                m = new a(context);
            } else {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                }
                mv a = a(c.a);
                mv a2 = a(c.b);
                mv a3 = a(c.c);
                my a4 = a(c.d);
                if (a4 != null) {
                    a4.a(a(c.e));
                }
                m = new a(context, a, a2, a3, a4);
            }
        }
        return m;
    }

    private static Map<String, mt> a(f[] fVarArr) {
        Map hashMap = new HashMap();
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                hashMap.put(fVar.c, new mt(fVar.a, fVar.b));
            }
        }
        return hashMap;
    }

    private void a(Map<String, Object> map, String str, boolean z) {
        if (str != null) {
            Object obj = (map == null || map.isEmpty()) ? 1 : null;
            Map hashMap = new HashMap();
            if (obj == null) {
                for (String str2 : map.keySet()) {
                    Object obj2 = map.get(str2);
                    if (obj2 instanceof String) {
                        hashMap.put(str2, ((String) obj2).getBytes(mx.a));
                    } else if (obj2 instanceof Long) {
                        hashMap.put(str2, ((Long) obj2).toString().getBytes(mx.a));
                    } else if (obj2 instanceof Integer) {
                        hashMap.put(str2, ((Integer) obj2).toString().getBytes(mx.a));
                    } else if (obj2 instanceof Double) {
                        hashMap.put(str2, ((Double) obj2).toString().getBytes(mx.a));
                    } else if (obj2 instanceof Float) {
                        hashMap.put(str2, ((Float) obj2).toString().getBytes(mx.a));
                    } else if (obj2 instanceof byte[]) {
                        hashMap.put(str2, (byte[]) obj2);
                    } else if (obj2 instanceof Boolean) {
                        hashMap.put(str2, ((Boolean) obj2).toString().getBytes(mx.a));
                    } else {
                        throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                    }
                }
            }
            this.s.writeLock().lock();
            if (obj != null) {
                try {
                    if (this.p == null || !this.p.a(str)) {
                        this.s.writeLock().unlock();
                        return;
                    } else {
                        this.p.a(null, str);
                        this.p.a(System.currentTimeMillis());
                    }
                } catch (Throwable th) {
                    this.s.writeLock().unlock();
                }
            } else {
                if (this.p == null) {
                    this.p = new mv(new HashMap(), System.currentTimeMillis());
                }
                this.p.a(hashMap, str);
                this.p.a(System.currentTimeMillis());
            }
            if (z) {
                this.q.a(str);
            }
            f();
            this.s.writeLock().unlock();
        }
    }

    private static byte[] a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private long b(Context context) {
        long j = 0;
        try {
            return this.r.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("FirebaseRemoteConfig", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Package [").append(valueOf).append("] was not found!").toString());
            return j;
        }
    }

    private static e c(Context context) {
        Throwable e;
        FileInputStream fileInputStream;
        if (context == null) {
            return null;
        }
        FileInputStream openFileInput;
        try {
            openFileInput = context.openFileInput("persisted_config");
            try {
                qv a = qv.a(a((InputStream) openFileInput));
                e eVar = new e();
                e eVar2 = (e) eVar.b(a);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (Throwable e2) {
                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e2);
                    }
                }
                return eVar;
            } catch (FileNotFoundException e3) {
                e2 = e3;
                fileInputStream = openFileInput;
                try {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e2);
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable e22) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e22);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    e22 = th;
                    openFileInput = fileInputStream;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable e4) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e4);
                        }
                    }
                    throw e22;
                }
            } catch (IOException e5) {
                e22 = e5;
                try {
                    Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e22);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable e222) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e222);
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    e222 = th2;
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    throw e222;
                }
            }
        } catch (FileNotFoundException e6) {
            e222 = e6;
            fileInputStream = null;
            if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e222);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (IOException e7) {
            e222 = e7;
            openFileInput = null;
            Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e222);
            if (openFileInput != null) {
                openFileInput.close();
            }
            return null;
        } catch (Throwable th3) {
            e222 = th3;
            openFileInput = null;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw e222;
        }
    }

    private void f() {
        this.s.readLock().lock();
        try {
            Runnable muVar = new mu(this.r, this.n, this.o, this.p, this.q);
            if (VERSION.SDK_INT >= 11) {
                AsyncTask.SERIAL_EXECUTOR.execute(muVar);
            } else {
                new a().execute(muVar);
            }
            this.s.readLock().unlock();
        } catch (Throwable th) {
            this.s.readLock().unlock();
        }
    }

    public long a(String str) {
        return a(str, "configns:firebase");
    }

    public long a(String str, String str2) {
        long j = 0;
        if (str2 != null) {
            this.s.readLock().lock();
            try {
                if (this.o != null && this.o.a(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.o.b(str, str2), mx.a)).longValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.p != null && this.p.a(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.p.b(str, str2), mx.a)).longValue();
                        this.s.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.s.readLock().unlock();
            } finally {
                this.s.readLock().unlock();
            }
        }
        return j;
    }

    public com.google.android.gms.g.f<Void> a(long j) {
        final g gVar = new g();
        this.s.readLock().lock();
        try {
            com.google.android.gms.internal.ajr.a.a aVar = new com.google.android.gms.internal.ajr.a.a();
            aVar.a(j);
            if (this.q.b()) {
                aVar.a("_rcn_developer", "true");
            }
            aVar.a(d());
            new com.google.android.gms.config.internal.d(this.r).a(aVar.a()).a(new n<ajr.b>(this) {
                final /* synthetic */ a b;

                public /* synthetic */ void a(@NonNull m mVar) {
                    a((ajr.b) mVar);
                }

                public void a(@NonNull ajr.b bVar) {
                    this.b.a(gVar, bVar);
                }
            });
            return gVar.a();
        } finally {
            this.s.readLock().unlock();
        }
    }

    public void a(int i) {
        a(i, "configns:firebase");
    }

    public void a(int i, String str) {
        if (str != null) {
            this.s.readLock().lock();
            try {
                if (!(this.q == null || this.q.c() == null || this.q.c().get(str) == null)) {
                    mt mtVar = (mt) this.q.c().get(str);
                    if (i == mtVar.a() && this.q.d() == mtVar.b()) {
                        if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                            Log.d("FirebaseRemoteConfig", "Skipped setting defaults from resource file as this resource file was already applied.");
                        }
                        this.s.readLock().unlock();
                        return;
                    }
                }
                this.s.readLock().unlock();
                Map hashMap = new HashMap();
                try {
                    XmlResourceParser xml = this.r.getResources().getXml(i);
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            obj2 = xml.getName();
                        } else if (eventType == 3) {
                            if (!(!"entry".equals(xml.getName()) || obj == null || obj3 == null)) {
                                hashMap.put(obj, obj3);
                                obj3 = null;
                                obj = null;
                            }
                            obj2 = null;
                        } else if (eventType == 4) {
                            if ("key".equals(obj2)) {
                                obj = xml.getText();
                            } else if ("value".equals(obj2)) {
                                obj3 = xml.getText();
                            }
                        }
                    }
                    this.q.a(str, new mt(i, this.q.d()));
                    a(hashMap, str, false);
                } catch (Throwable e) {
                    Log.e("FirebaseRemoteConfig", "Caught exception while parsing XML resource. Skipping setDefaults.", e);
                }
            } catch (Throwable th) {
                this.s.readLock().unlock();
            }
        } else if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
            Log.d("FirebaseRemoteConfig", "namespace cannot be null for setDefaults.");
        }
    }

    @VisibleForTesting
    void a(g<Void> gVar, ajr.b bVar) {
        if (bVar == null || bVar.a() == null) {
            this.q.a(1);
            gVar.a(new c());
            f();
            return;
        }
        int i = bVar.a().i();
        this.s.writeLock().lock();
        Map c;
        Map hashMap;
        Map hashMap2;
        switch (i) {
            case -6508:
            case -6506:
                this.q.a(-1);
                if (!(this.n == null || this.n.b())) {
                    c = bVar.c();
                    hashMap = new HashMap();
                    for (String str : c.keySet()) {
                        hashMap2 = new HashMap();
                        for (String str2 : (Set) c.get(str)) {
                            hashMap2.put(str2, bVar.a(str2, null, str));
                        }
                        hashMap.put(str, hashMap2);
                    }
                    this.n = new mv(hashMap, this.n.c());
                }
                gVar.a(null);
                f();
                break;
            case -6505:
                c = bVar.c();
                hashMap = new HashMap();
                for (String str3 : c.keySet()) {
                    hashMap2 = new HashMap();
                    for (String str22 : (Set) c.get(str3)) {
                        hashMap2.put(str22, bVar.a(str22, null, str3));
                    }
                    hashMap.put(str3, hashMap2);
                }
                this.n = new mv(hashMap, System.currentTimeMillis());
                this.q.a(-1);
                gVar.a(null);
                f();
                break;
            case com.google.android.gms.games.f.F /*6500*/:
            case com.google.android.gms.games.f.G /*6501*/:
            case com.google.android.gms.games.f.I /*6503*/:
            case com.google.android.gms.games.f.J /*6504*/:
                this.q.a(1);
                gVar.a(new c());
                f();
                break;
            case com.google.android.gms.games.f.H /*6502*/:
            case com.google.android.gms.games.f.M /*6507*/:
                this.q.a(2);
                gVar.a(new d(bVar.b()));
                f();
                break;
            default:
                try {
                    if (bVar.a().f()) {
                        Log.w("FirebaseRemoteConfig", "Unknown (successful) status code: " + i);
                    }
                    this.q.a(1);
                    gVar.a(new c());
                    f();
                    break;
                } catch (Throwable th) {
                    this.s.writeLock().unlock();
                }
        }
        this.s.writeLock().unlock();
    }

    public void a(f fVar) {
        this.s.writeLock().lock();
        try {
            boolean b = this.q.b();
            boolean a = fVar == null ? false : fVar.a();
            this.q.a(a);
            if (b != a) {
                f();
            }
            this.s.writeLock().unlock();
        } catch (Throwable th) {
            this.s.writeLock().unlock();
        }
    }

    public void a(Map<String, Object> map) {
        a((Map) map, "configns:firebase");
    }

    public void a(Map<String, Object> map, String str) {
        a(map, str, true);
    }

    public boolean b() {
        this.s.writeLock().lock();
        try {
            if (this.n == null) {
                return false;
            }
            if (this.o == null || this.o.c() < this.n.c()) {
                long c = this.n.c();
                this.o = this.n;
                this.o.a(System.currentTimeMillis());
                this.n = new mv(null, c);
                f();
                this.s.writeLock().unlock();
                return true;
            }
            this.s.writeLock().unlock();
            return false;
        } finally {
            this.s.writeLock().unlock();
        }
    }

    public byte[] b(String str) {
        return b(str, "configns:firebase");
    }

    public byte[] b(String str, String str2) {
        if (str2 == null) {
            return e;
        }
        this.s.readLock().lock();
        byte[] bArr;
        if (this.o == null || !this.o.a(str, str2)) {
            try {
                if (this.p == null || !this.p.a(str, str2)) {
                    bArr = e;
                    this.s.readLock().unlock();
                    return bArr;
                }
                bArr = this.p.b(str, str2);
                this.s.readLock().unlock();
                return bArr;
            } finally {
                this.s.readLock().unlock();
            }
        } else {
            bArr = this.o.b(str, str2);
            return bArr;
        }
    }

    public e c() {
        e mwVar = new mw();
        this.s.readLock().lock();
        try {
            mwVar.a(this.n == null ? -1 : this.n.c());
            mwVar.a(this.q.a());
            mwVar.a(new com.google.firebase.b.f.a().a(this.q.b()).a());
            return mwVar;
        } finally {
            this.s.readLock().unlock();
        }
    }

    public String c(String str) {
        return c(str, "configns:firebase");
    }

    public String c(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        this.s.readLock().lock();
        String str3;
        if (this.o == null || !this.o.a(str, str2)) {
            try {
                if (this.p == null || !this.p.a(str, str2)) {
                    str3 = "";
                    this.s.readLock().unlock();
                    return str3;
                }
                str3 = new String(this.p.b(str, str2), mx.a);
                this.s.readLock().unlock();
                return str3;
            } finally {
                this.s.readLock().unlock();
            }
        } else {
            str3 = new String(this.o.b(str, str2), mx.a);
            return str3;
        }
    }

    int d() {
        return 10200;
    }

    public boolean d(String str) {
        return d(str, "configns:firebase");
    }

    public boolean d(String str, String str2) {
        Lock lock = true;
        if (str2 == null) {
            return false;
        }
        this.s.readLock().lock();
        try {
            CharSequence str3;
            if (this.o != null && this.o.a(str, str2)) {
                str3 = new String(this.o.b(str, str2), mx.a);
                if (mx.b.matcher(str3).matches()) {
                    return lock;
                }
                if (mx.c.matcher(str3).matches()) {
                    this.s.readLock().unlock();
                    return false;
                }
            }
            if (this.p != null && this.p.a(str, str2)) {
                str3 = new String(this.p.b(str, str2), mx.a);
                if (mx.b.matcher(str3).matches()) {
                    this.s.readLock().unlock();
                    return true;
                } else if (mx.c.matcher(str3).matches()) {
                    this.s.readLock().unlock();
                    return false;
                }
            }
            this.s.readLock().unlock();
            return false;
        } finally {
            lock = this.s.readLock();
            lock.unlock();
        }
    }

    public double e(String str) {
        return e(str, "configns:firebase");
    }

    public double e(String str, String str2) {
        double d = 0.0d;
        if (str2 != null) {
            this.s.readLock().lock();
            try {
                if (this.o != null && this.o.a(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.o.b(str, str2), mx.a)).doubleValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.p != null && this.p.a(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.p.b(str, str2), mx.a)).doubleValue();
                        this.s.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.s.readLock().unlock();
            } finally {
                this.s.readLock().unlock();
            }
        }
        return d;
    }

    public com.google.android.gms.g.f<Void> e() {
        return a(43200);
    }

    public g f(String str) {
        return f(str, "configns:firebase");
    }

    public g f(String str, String str2) {
        if (str2 == null) {
            return new mx(e, 0);
        }
        this.s.readLock().lock();
        g mxVar;
        if (this.o == null || !this.o.a(str, str2)) {
            try {
                if (this.p == null || !this.p.a(str, str2)) {
                    mxVar = new mx(e, 0);
                    this.s.readLock().unlock();
                    return mxVar;
                }
                mxVar = new mx(this.p.b(str, str2), 1);
                this.s.readLock().unlock();
                return mxVar;
            } finally {
                this.s.readLock().unlock();
            }
        } else {
            mxVar = new mx(this.o.b(str, str2), 2);
            return mxVar;
        }
    }

    public Set<String> g(String str) {
        return g(str, "configns:firebase");
    }

    public Set<String> g(String str, String str2) {
        this.s.readLock().lock();
        try {
            Set<String> treeSet;
            if (this.o == null) {
                treeSet = new TreeSet();
            } else {
                treeSet = this.o.c(str, str2);
                this.s.readLock().unlock();
            }
            return treeSet;
        } finally {
            this.s.readLock().unlock();
        }
    }
}
