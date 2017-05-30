package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class f implements com.android.volley.b {
    private static final int e = 5242880;
    private static final float f = 0.9f;
    private static final int g = 538247942;
    private final Map<String, a> a;
    private long b;
    private final File c;
    private final int d;

    static class a {
        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public Map<String, String> h;

        private a() {
        }

        public a(String str, com.android.volley.b.a aVar) {
            this.b = str;
            this.a = (long) aVar.a.length;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
        }

        public static a a(InputStream inputStream) {
            a aVar = new a();
            if (f.a(inputStream) != f.g) {
                throw new IOException();
            }
            aVar.b = f.c(inputStream);
            aVar.c = f.c(inputStream);
            if (aVar.c.equals("")) {
                aVar.c = null;
            }
            aVar.d = f.b(inputStream);
            aVar.e = f.b(inputStream);
            aVar.f = f.b(inputStream);
            aVar.g = f.b(inputStream);
            aVar.h = f.d(inputStream);
            return aVar;
        }

        public com.android.volley.b.a a(byte[] bArr) {
            com.android.volley.b.a aVar = new com.android.volley.b.a();
            aVar.a = bArr;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            aVar.g = this.h;
            return aVar;
        }

        public boolean a(OutputStream outputStream) {
            try {
                f.a(outputStream, (int) f.g);
                f.a(outputStream, this.b);
                f.a(outputStream, this.c == null ? "" : this.c);
                f.a(outputStream, this.d);
                f.a(outputStream, this.e);
                f.a(outputStream, this.f);
                f.a(outputStream, this.g);
                f.a(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                v.b("%s", e.toString());
                return false;
            }
        }
    }

    private static class b extends FilterInputStream {
        private int a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.a += read;
            }
            return read;
        }
    }

    public f(File file) {
        this(file, e);
    }

    public f(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = file;
        this.d = i;
    }

    static int a(InputStream inputStream) {
        return (((0 | (e(inputStream) << 0)) | (e(inputStream) << 8)) | (e(inputStream) << 16)) | (e(inputStream) << 24);
    }

    private void a(int i) {
        if (this.b + ((long) i) >= ((long) this.d)) {
            int i2;
            if (v.b) {
                v.a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.a.entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                a aVar = (a) ((Entry) it.next()).getValue();
                if (c(aVar.b).delete()) {
                    this.b -= aVar.a;
                } else {
                    v.b("Could not delete cache entry for key=%s, filename=%s", aVar.b, d(aVar.b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.b + ((long) i))) < ((float) this.d) * f) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
            if (v.b) {
                v.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void a(String str, a aVar) {
        if (this.a.containsKey(str)) {
            a aVar2 = (a) this.a.get(str);
            this.b = (aVar.a - aVar2.a) + this.b;
        } else {
            this.b += aVar.a;
        }
        this.a.put(str, aVar);
    }

    static void a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                a(outputStream, (String) entry.getKey());
                a(outputStream, (String) entry.getValue());
            }
            return;
        }
        a(outputStream, 0);
    }

    private static byte[] a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    static long b(InputStream inputStream) {
        return (((((((0 | ((((long) e(inputStream)) & 255) << null)) | ((((long) e(inputStream)) & 255) << 8)) | ((((long) e(inputStream)) & 255) << 16)) | ((((long) e(inputStream)) & 255) << 24)) | ((((long) e(inputStream)) & 255) << 32)) | ((((long) e(inputStream)) & 255) << 40)) | ((((long) e(inputStream)) & 255) << 48)) | ((((long) e(inputStream)) & 255) << 56);
    }

    static String c(InputStream inputStream) {
        return new String(a(inputStream, (int) b(inputStream)), "UTF-8");
    }

    private String d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    static Map<String, String> d(InputStream inputStream) {
        int a = a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private void e(String str) {
        a aVar = (a) this.a.get(str);
        if (aVar != null) {
            this.b -= aVar.a;
            this.a.remove(str);
        }
    }

    public synchronized com.android.volley.b.a a(String str) {
        com.android.volley.b.a aVar;
        IOException e;
        Throwable th;
        NegativeArraySizeException e2;
        a aVar2 = (a) this.a.get(str);
        if (aVar2 == null) {
            aVar = null;
        } else {
            File c = c(str);
            b bVar;
            try {
                bVar = new b(new BufferedInputStream(new FileInputStream(c)));
                try {
                    a.a((InputStream) bVar);
                    aVar = aVar2.a(a((InputStream) bVar, (int) (c.length() - ((long) bVar.a))));
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e3) {
                            aVar = null;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    try {
                        v.b("%s: %s", c.getAbsolutePath(), e.toString());
                        b(str);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e5) {
                                aVar = null;
                            }
                        }
                        aVar = null;
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e6) {
                                aVar = null;
                            }
                        }
                        throw th;
                    }
                } catch (NegativeArraySizeException e7) {
                    e2 = e7;
                    v.b("%s: %s", c.getAbsolutePath(), e2.toString());
                    b(str);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e8) {
                            aVar = null;
                        }
                    }
                    aVar = null;
                    return aVar;
                }
            } catch (IOException e9) {
                e = e9;
                bVar = null;
                v.b("%s: %s", c.getAbsolutePath(), e.toString());
                b(str);
                if (bVar != null) {
                    bVar.close();
                }
                aVar = null;
                return aVar;
            } catch (NegativeArraySizeException e10) {
                e2 = e10;
                bVar = null;
                v.b("%s: %s", c.getAbsolutePath(), e2.toString());
                b(str);
                if (bVar != null) {
                    bVar.close();
                }
                aVar = null;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        }
        return aVar;
    }

    public synchronized void a() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.c.exists()) {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            a a = a.a((InputStream) bufferedInputStream);
                            a.a = file.length();
                            a(a.b, a);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e) {
                                }
                            }
                        } catch (IOException e2) {
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th3;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        bufferedInputStream = null;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        } else if (!this.c.mkdirs()) {
            v.c("Unable to create cache dir %s", this.c.getAbsolutePath());
        }
        return;
        if (bufferedInputStream2 != null) {
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
            }
        }
        throw th;
        throw th;
    }

    public synchronized void a(String str, com.android.volley.b.a aVar) {
        a(aVar.a.length);
        File c = c(str);
        try {
            OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c));
            a aVar2 = new a(str, aVar);
            if (aVar2.a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.a);
                bufferedOutputStream.close();
                a(str, aVar2);
            } else {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", c.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException e) {
            if (!c.delete()) {
                v.b("Could not clean up file %s", c.getAbsolutePath());
            }
        }
    }

    public synchronized void a(String str, boolean z) {
        com.android.volley.b.a a = a(str);
        if (a != null) {
            a.f = 0;
            if (z) {
                a.e = 0;
            }
            a(str, a);
        }
    }

    public synchronized void b() {
        synchronized (this) {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            this.a.clear();
            this.b = 0;
            v.b("Cache cleared.", new Object[0]);
        }
    }

    public synchronized void b(String str) {
        boolean delete = c(str).delete();
        e(str);
        if (!delete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    public File c(String str) {
        return new File(this.c, d(str));
    }
}
