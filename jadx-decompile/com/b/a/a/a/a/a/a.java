package com.b.a.a.a.a.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.a.a.f.c.l;

final class a implements Closeable {
    private static final OutputStream B = new OutputStream() {
        public void write(int i) {
        }
    };
    static final String a = "journal";
    static final String b = "journal.tmp";
    static final String c = "journal.bkp";
    static final String d = "libcore.io.DiskLruCache";
    static final String e = "1";
    static final long f = -1;
    static final Pattern g = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final String i = "CLEAN";
    private static final String j = "DIRTY";
    private static final String k = "REMOVE";
    private static final String l = "READ";
    private final Callable<Void> A = new Callable<Void>(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public Void a() {
            synchronized (this.a) {
                if (this.a.w == null) {
                } else {
                    this.a.o();
                    this.a.p();
                    if (this.a.m()) {
                        this.a.l();
                        this.a.y = 0;
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    };
    final ThreadPoolExecutor h = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final File m;
    private final File n;
    private final File o;
    private final File p;
    private final int q;
    private long r;
    private int s;
    private final int t;
    private long u = 0;
    private int v = 0;
    private Writer w;
    private final LinkedHashMap<String, b> x = new LinkedHashMap(0, 0.75f, true);
    private int y;
    private long z = 0;

    public final class a {
        final /* synthetic */ a a;
        private final b b;
        private final boolean[] c;
        private boolean d;
        private boolean e;

        private class a extends FilterOutputStream {
            final /* synthetic */ a a;

            private a(a aVar, OutputStream outputStream) {
                this.a = aVar;
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    this.a.d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    this.a.d = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    this.a.d = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    this.a.d = true;
                }
            }
        }

        private a(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
            this.c = bVar.d ? null : new boolean[aVar.t];
        }

        public InputStream a(int i) {
            synchronized (this.a) {
                if (this.b.e != this) {
                    throw new IllegalStateException();
                } else if (this.b.d) {
                    try {
                        InputStream fileInputStream = new FileInputStream(this.b.a(i));
                        return fileInputStream;
                    } catch (FileNotFoundException e) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
        }

        public void a() {
            if (this.d) {
                this.a.a(this, false);
                this.a.c(this.b.b);
            } else {
                this.a.a(this, true);
            }
            this.e = true;
        }

        public void a(int i, String str) {
            Closeable outputStreamWriter;
            Throwable th;
            try {
                outputStreamWriter = new OutputStreamWriter(c(i), d.b);
                try {
                    outputStreamWriter.write(str);
                    d.a(outputStreamWriter);
                } catch (Throwable th2) {
                    th = th2;
                    d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = null;
                d.a(outputStreamWriter);
                throw th;
            }
        }

        public String b(int i) {
            InputStream a = a(i);
            return a != null ? a.b(a) : null;
        }

        public void b() {
            this.a.a(this, false);
        }

        public OutputStream c(int i) {
            OutputStream i2;
            synchronized (this.a) {
                File b;
                OutputStream fileOutputStream;
                if (this.b.e != this) {
                    throw new IllegalStateException();
                }
                if (!this.b.d) {
                    this.c[i] = true;
                }
                b = this.b.b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException e) {
                    this.a.m.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException e2) {
                        i2 = a.B;
                    }
                }
                i2 = new a(fileOutputStream);
            }
            return i2;
        }

        public void c() {
            if (!this.e) {
                try {
                    b();
                } catch (IOException e) {
                }
            }
        }
    }

    private final class b {
        final /* synthetic */ a a;
        private final String b;
        private final long[] c;
        private boolean d;
        private a e;
        private long f;

        private b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
            this.c = new long[aVar.t];
        }

        private void a(String[] strArr) {
            if (strArr.length != this.a.t) {
                throw b(strArr);
            }
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.c[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException e) {
                    throw b(strArr);
                }
            }
        }

        private IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File a(int i) {
            return new File(this.a.m, this.b + "." + i);
        }

        public String a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long append : this.c) {
                stringBuilder.append(l.c).append(append);
            }
            return stringBuilder.toString();
        }

        public File b(int i) {
            return new File(this.a.m, this.b + "." + i + ".tmp");
        }
    }

    public final class c implements Closeable {
        final /* synthetic */ a a;
        private final String b;
        private final long c;
        private File[] d;
        private final InputStream[] e;
        private final long[] f;

        private c(a aVar, String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.a = aVar;
            this.b = str;
            this.c = j;
            this.d = fileArr;
            this.e = inputStreamArr;
            this.f = jArr;
        }

        public a a() {
            return this.a.a(this.b, this.c);
        }

        public File a(int i) {
            return this.d[i];
        }

        public InputStream b(int i) {
            return this.e[i];
        }

        public String c(int i) {
            return a.b(b(i));
        }

        public void close() {
            for (Closeable a : this.e) {
                d.a(a);
            }
        }

        public long d(int i) {
            return this.f[i];
        }
    }

    private a(File file, int i, int i2, long j, int i3) {
        this.m = file;
        this.q = i;
        this.n = new File(file, a);
        this.o = new File(file, b);
        this.p = new File(file, c);
        this.t = i2;
        this.r = j;
        this.s = i3;
    }

    private synchronized a a(String str, long j) {
        a aVar;
        n();
        e(str);
        b bVar = (b) this.x.get(str);
        if (j == -1 || (bVar != null && bVar.f == j)) {
            b bVar2;
            if (bVar == null) {
                bVar = new b(str);
                this.x.put(str, bVar);
                bVar2 = bVar;
            } else if (bVar.e != null) {
                aVar = null;
            } else {
                bVar2 = bVar;
            }
            aVar = new a(bVar2);
            bVar2.e = aVar;
            this.w.write("DIRTY " + str + '\n');
            this.w.flush();
        } else {
            aVar = null;
        }
        return aVar;
    }

    public static a a(File file, int i, int i2, long j, int i3) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            File file2 = new File(file, c);
            if (file2.exists()) {
                File file3 = new File(file, a);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            a aVar = new a(file, i, i2, j, i3);
            if (aVar.n.exists()) {
                try {
                    aVar.j();
                    aVar.k();
                    aVar.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.n, true), d.a));
                    return aVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.h();
                }
            }
            file.mkdirs();
            aVar = new a(file, i, i2, j, i3);
            aVar.l();
            return aVar;
        }
    }

    private synchronized void a(a aVar, boolean z) {
        int i = 0;
        synchronized (this) {
            b a = aVar.b;
            if (a.e != aVar) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!a.d) {
                    int i2 = 0;
                    while (i2 < this.t) {
                        if (!aVar.c[i2]) {
                            aVar.b();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!a.b(i2).exists()) {
                            aVar.b();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            while (i < this.t) {
                File b = a.b(i);
                if (!z) {
                    a(b);
                } else if (b.exists()) {
                    File a2 = a.a(i);
                    b.renameTo(a2);
                    long j = a.c[i];
                    long length = a2.length();
                    a.c[i] = length;
                    this.u = (this.u - j) + length;
                    this.v++;
                }
                i++;
            }
            this.y++;
            a.e = null;
            if ((a.d | z) != 0) {
                a.d = true;
                this.w.write("CLEAN " + a.b + a.a() + '\n');
                if (z) {
                    long j2 = this.z;
                    this.z = 1 + j2;
                    a.f = j2;
                }
            } else {
                this.x.remove(a.b);
                this.w.write("REMOVE " + a.b + '\n');
            }
            this.w.flush();
            if (this.u > this.r || this.v > this.s || m()) {
                this.h.submit(this.A);
            }
        }
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static String b(InputStream inputStream) {
        return d.a(new InputStreamReader(inputStream, d.b));
    }

    private void d(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2;
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            String substring = str.substring(i);
            if (indexOf == k.length() && str.startsWith(k)) {
                this.x.remove(substring);
                return;
            }
            str2 = substring;
        } else {
            str2 = str.substring(i, indexOf2);
        }
        b bVar = (b) this.x.get(str2);
        if (bVar == null) {
            bVar = new b(str2);
            this.x.put(str2, bVar);
        }
        if (indexOf2 != -1 && indexOf == i.length() && str.startsWith(i)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            bVar.d = true;
            bVar.e = null;
            bVar.a(split);
        } else if (indexOf2 == -1 && indexOf == j.length() && str.startsWith(j)) {
            bVar.e = new a(bVar);
        } else if (indexOf2 != -1 || indexOf != l.length() || !str.startsWith(l)) {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void e(String str) {
        if (!g.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    private void j() {
        Closeable cVar = new c(new FileInputStream(this.n), d.a);
        int i;
        try {
            String a = cVar.a();
            String a2 = cVar.a();
            String a3 = cVar.a();
            String a4 = cVar.a();
            String a5 = cVar.a();
            if (d.equals(a) && "1".equals(a2) && Integer.toString(this.q).equals(a3) && Integer.toString(this.t).equals(a4) && "".equals(a5)) {
                i = 0;
                while (true) {
                    d(cVar.a());
                    i++;
                }
            } else {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
        } catch (EOFException e) {
            this.y = i - this.x.size();
            d.a(cVar);
        } catch (Throwable th) {
            d.a(cVar);
        }
    }

    private void k() {
        a(this.o);
        Iterator it = this.x.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i;
            if (bVar.e == null) {
                for (i = 0; i < this.t; i++) {
                    this.u += bVar.c[i];
                    this.v++;
                }
            } else {
                bVar.e = null;
                for (i = 0; i < this.t; i++) {
                    a(bVar.a(i));
                    a(bVar.b(i));
                }
                it.remove();
            }
        }
    }

    private synchronized void l() {
        if (this.w != null) {
            this.w.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.o), d.a));
        try {
            bufferedWriter.write(d);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.q));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.t));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.x.values()) {
                if (bVar.e != null) {
                    bufferedWriter.write("DIRTY " + bVar.b + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.b + bVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.n.exists()) {
                a(this.n, this.p, true);
            }
            a(this.o, this.n, false);
            this.p.delete();
            this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.n, true), d.a));
        } catch (Throwable th) {
            bufferedWriter.close();
        }
    }

    private boolean m() {
        return this.y >= 2000 && this.y >= this.x.size();
    }

    private void n() {
        if (this.w == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void o() {
        while (this.u > this.r) {
            c((String) ((Entry) this.x.entrySet().iterator().next()).getKey());
        }
    }

    private void p() {
        while (this.v > this.s) {
            c((String) ((Entry) this.x.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized c a(String str) {
        int i;
        c cVar = null;
        synchronized (this) {
            n();
            e(str);
            b bVar = (b) this.x.get(str);
            if (bVar != null) {
                if (bVar.d) {
                    File[] fileArr = new File[this.t];
                    InputStream[] inputStreamArr = new InputStream[this.t];
                    int i2 = 0;
                    while (i2 < this.t) {
                        try {
                            File a = bVar.a(i2);
                            fileArr[i2] = a;
                            inputStreamArr[i2] = new FileInputStream(a);
                            i2++;
                        } catch (FileNotFoundException e) {
                            i = 0;
                            while (i < this.t && inputStreamArr[i] != null) {
                                d.a(inputStreamArr[i]);
                                i++;
                            }
                        }
                    }
                    this.y++;
                    this.w.append("READ " + str + '\n');
                    if (m()) {
                        this.h.submit(this.A);
                    }
                    cVar = new c(str, bVar.f, fileArr, inputStreamArr, bVar.c);
                }
            }
        }
        return cVar;
    }

    public File a() {
        return this.m;
    }

    public synchronized void a(long j) {
        this.r = j;
        this.h.submit(this.A);
    }

    public synchronized long b() {
        return this.r;
    }

    public a b(String str) {
        return a(str, -1);
    }

    public synchronized int c() {
        return this.s;
    }

    public synchronized boolean c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            n();
            e(str);
            b bVar = (b) this.x.get(str);
            if (bVar == null || bVar.e != null) {
                z = false;
            } else {
                while (i < this.t) {
                    File a = bVar.a(i);
                    if (!a.exists() || a.delete()) {
                        this.u -= bVar.c[i];
                        this.v--;
                        bVar.c[i] = 0;
                        i++;
                    } else {
                        throw new IOException("failed to delete " + a);
                    }
                }
                this.y++;
                this.w.append("REMOVE " + str + '\n');
                this.x.remove(str);
                if (m()) {
                    this.h.submit(this.A);
                }
                z = true;
            }
        }
        return z;
    }

    public synchronized void close() {
        if (this.w != null) {
            Iterator it = new ArrayList(this.x.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.e != null) {
                    bVar.e.b();
                }
            }
            o();
            p();
            this.w.close();
            this.w = null;
        }
    }

    public synchronized long d() {
        return this.u;
    }

    public synchronized long e() {
        return (long) this.v;
    }

    public synchronized boolean f() {
        return this.w == null;
    }

    public synchronized void g() {
        n();
        o();
        p();
        this.w.flush();
    }

    public void h() {
        close();
        d.a(this.m);
    }
}
