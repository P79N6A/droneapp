package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.clearcut.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.c;
import com.google.android.gms.common.j;
import com.google.android.gms.internal.df.d;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class rw {
    protected static final Object d = new Object();
    private static final String g = rw.class.getSimpleName();
    private static j s = null;
    protected Context a;
    protected Context b;
    protected boolean c = false;
    protected boolean e = false;
    protected boolean f = false;
    private ExecutorService h;
    private DexClassLoader i;
    private rq j;
    private byte[] k;
    private volatile a l = null;
    private volatile boolean m = false;
    private Future n = null;
    private volatile df.a o = null;
    private Future p = null;
    private np q;
    private g r = null;
    private Map<Pair<String, String>, sp> t;

    private rw(Context context) {
        this.a = context;
        this.b = context.getApplicationContext();
        this.t = new HashMap();
    }

    public static rw a(Context context, String str, String str2, boolean z) {
        rw rwVar = new rw(context);
        try {
            if (rwVar.a(str, str2, z)) {
                return rwVar;
            }
        } catch (rs e) {
        }
        return null;
    }

    @NonNull
    private File a(String str, File file, String str2) {
        File file2 = new File(String.format("%s/%s.jar", new Object[]{file, str2}));
        if (!file2.exists()) {
            byte[] a = this.j.a(this.k, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(a, 0, a.length);
            fileOutputStream.close();
        }
        return file2;
    }

    private void a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(g, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private void a(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    try {
                        fileInputStream = new FileInputStream(file3);
                        try {
                            if (fileInputStream.read(bArr) <= 0) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                    }
                                }
                                a(file3);
                                return;
                            }
                            rd dVar = new d();
                            dVar.d = VERSION.SDK.getBytes();
                            dVar.c = str.getBytes();
                            bArr = this.j.a(this.k, bArr).getBytes();
                            dVar.a = bArr;
                            dVar.b = ln.a(bArr);
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] a = rd.a(dVar);
                                fileOutputStream.write(a, 0, a.length);
                                fileOutputStream.close();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e2) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e3) {
                                    }
                                }
                                a(file3);
                            } catch (IOException e4) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                a(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                a(file3);
                            } catch (rq.a e8) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                a(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream2 = fileOutputStream;
                                th = th3;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                a(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (rq.a e13) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            a(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (rq.a e16) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        a(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        a(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private void a(boolean z) {
        this.m = z;
        if (z) {
            this.n = this.h.submit(new Runnable(this) {
                final /* synthetic */ rw a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.r();
                }
            });
        }
    }

    private boolean a(String str) {
        File file;
        String b;
        File a;
        try {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                cacheDir = this.a.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new rs();
                }
            }
            file = cacheDir;
            b = rr.b();
            a = a(str, file, b);
            b(file, b);
            this.i = new DexClassLoader(a.getAbsolutePath(), file.getAbsolutePath(), null, this.a.getClassLoader());
            a(a);
            a(file, b);
            b(String.format("%s/%s.dex", new Object[]{file, b}));
            return true;
        } catch (Throwable e) {
            throw new rs(e);
        } catch (Throwable e2) {
            throw new rs(e2);
        } catch (Throwable e22) {
            throw new rs(e22);
        } catch (Throwable e222) {
            throw new rs(e222);
        } catch (Throwable th) {
            a(a);
            a(file, b);
            b(String.format("%s/%s.dex", new Object[]{file, b}));
        }
    }

    private boolean a(String str, String str2, boolean z) {
        this.h = Executors.newCachedThreadPool();
        a(z);
        t();
        m();
        this.j = new rq(null);
        try {
            this.k = this.j.a(str);
            boolean a = a(str2);
            this.q = new np(this);
            return a;
        } catch (Throwable e) {
            throw new rs(e);
        }
    }

    private void b(String str) {
        a(new File(str));
    }

    private boolean b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                a(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    Log.d(g, "Cannot read the cache data.");
                    a(file2);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    return false;
                }
                d a = d.a(bArr);
                if (str.equals(new String(a.c)) && Arrays.equals(a.b, ln.a(a.a)) && Arrays.equals(a.d, VERSION.SDK.getBytes())) {
                    bArr = this.j.a(this.k, new String(a.a));
                    file3.createNewFile();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    try {
                        fileOutputStream3.write(bArr, 0, bArr.length);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                        if (fileOutputStream3 == null) {
                            return true;
                        }
                        try {
                            fileOutputStream3.close();
                            return true;
                        } catch (IOException e3) {
                            return true;
                        }
                    } catch (IOException e4) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (rq.a e8) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                a(file2);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e11) {
                    }
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (rq.a e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (rq.a e17) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private void r() {
        try {
            if (this.l == null && this.b != null) {
                a aVar = new a(this.b);
                aVar.a();
                this.l = aVar;
            }
        } catch (c e) {
            this.l = null;
        } catch (IOException e2) {
            this.l = null;
        } catch (com.google.android.gms.common.d e3) {
            this.l = null;
        }
    }

    private void s() {
        if (this.e) {
            try {
                this.o = com.google.android.gms.gass.internal.a.a(this.a, this.a.getPackageName(), Integer.toString(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode));
            } catch (NameNotFoundException e) {
            }
        }
    }

    private void t() {
        boolean z = true;
        s = j.b();
        this.c = s.c(this.a) > 0;
        if (s.a(this.a) != 0) {
            z = false;
        }
        this.e = z;
        if (this.a.getApplicationContext() != null) {
            this.r = new g.a(this.a).a(b.c).c();
        }
        uf.a(this.a);
    }

    public Context a() {
        return this.a;
    }

    public Method a(String str, String str2) {
        sp spVar = (sp) this.t.get(new Pair(str, str2));
        return spVar == null ? null : spVar.a();
    }

    public boolean a(String str, String str2, List<Class> list) {
        if (this.t.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.t.put(new Pair(str, str2), new sp(this, str, str2, list));
        return true;
    }

    public Context b() {
        return this.b;
    }

    public ExecutorService c() {
        return this.h;
    }

    public DexClassLoader d() {
        return this.i;
    }

    public rq e() {
        return this.j;
    }

    public byte[] f() {
        return this.k;
    }

    public g g() {
        return this.r;
    }

    public boolean h() {
        return this.c;
    }

    public boolean i() {
        return this.f;
    }

    public np j() {
        return this.q;
    }

    public df.a k() {
        return this.o;
    }

    public Future l() {
        return this.p;
    }

    void m() {
        if (((Boolean) uf.bu.c()).booleanValue()) {
            this.p = this.h.submit(new Runnable(this) {
                final /* synthetic */ rw a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.s();
                }
            });
        }
    }

    public a n() {
        if (!this.m) {
            return null;
        }
        if (this.l != null) {
            return this.l;
        }
        if (this.n != null) {
            try {
                this.n.get(2000, TimeUnit.MILLISECONDS);
                this.n = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.n.cancel(true);
            }
        }
        return this.l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
        r2 = this;
        r1 = d;
        monitor-enter(r1);
        r0 = r2.f;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.e;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r2.r;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r2.r;	 Catch:{ all -> 0x001b }
        r0.e();	 Catch:{ all -> 0x001b }
        r0 = 1;
        r2.f = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        r0 = 0;
        r2.f = r0;	 Catch:{ all -> 0x001b }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rw.o():void");
    }

    public void p() {
        synchronized (d) {
            if (this.f && this.r != null) {
                this.r.g();
                this.f = false;
            }
        }
    }

    public int q() {
        np j = j();
        return j != null ? j.a() : Integer.MIN_VALUE;
    }
}
