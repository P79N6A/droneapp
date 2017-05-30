package com.b.a.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.b.a.a.a.a;
import com.b.a.a.a.a.a.a.c;
import com.b.a.c.d;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class b implements a {
    public static final int a = 32768;
    public static final CompressFormat b = CompressFormat.PNG;
    public static final int c = 100;
    private static final String i = " argument must be not null";
    private static final String j = " argument must be positive number";
    protected a d;
    protected final com.b.a.a.a.b.a e;
    protected int f;
    protected CompressFormat g;
    protected int h;
    private File k;

    public b(File file, com.b.a.a.a.b.a aVar, long j) {
        this(file, null, aVar, j, 0);
    }

    public b(File file, File file2, com.b.a.a.a.b.a aVar, long j, int i) {
        this.f = 32768;
        this.g = b;
        this.h = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (j < 0) {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        } else if (i < 0) {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        } else if (aVar == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        } else {
            long j2 = j == 0 ? Long.MAX_VALUE : j;
            int i2 = i == 0 ? Integer.MAX_VALUE : i;
            this.k = file2;
            this.e = aVar;
            a(file, file2, j2, i2);
        }
    }

    private void a(File file, File file2, long j, int i) {
        try {
            this.d = a.a(file, 1, 1, j, i);
        } catch (Throwable e) {
            d.a(e);
            if (file2 != null) {
                a(file2, null, j, i);
            }
            if (this.d == null) {
                throw e;
            }
        }
    }

    private String c(String str) {
        return this.e.a(str);
    }

    public File a() {
        return this.d.a();
    }

    public File a(String str) {
        Throwable e;
        Throwable th;
        File file = null;
        c a;
        try {
            a = this.d.a(c(str));
            if (a != null) {
                try {
                    file = a.a(0);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        d.a(e);
                        if (a != null) {
                            a.close();
                        }
                        return file;
                    } catch (Throwable th2) {
                        th = th2;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (IOException e3) {
            e = e3;
            a = file;
            d.a(e);
            if (a != null) {
                a.close();
            }
            return file;
        } catch (Throwable e4) {
            a = file;
            th = e4;
            if (a != null) {
                a.close();
            }
            throw th;
        }
        return file;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(CompressFormat compressFormat) {
        this.g = compressFormat;
    }

    public boolean a(String str, Bitmap bitmap) {
        boolean z = false;
        a.a b = this.d.b(c(str));
        if (b != null) {
            Closeable bufferedOutputStream = new BufferedOutputStream(b.c(0), this.f);
            try {
                z = bitmap.compress(this.g, this.h, bufferedOutputStream);
                if (z) {
                    b.a();
                } else {
                    b.b();
                }
            } finally {
                com.b.a.c.c.a(bufferedOutputStream);
            }
        }
        return z;
    }

    public boolean a(String str, InputStream inputStream, com.b.a.c.c.a aVar) {
        boolean z = false;
        a.a b = this.d.b(c(str));
        if (b != null) {
            Closeable bufferedOutputStream = new BufferedOutputStream(b.c(0), this.f);
            try {
                z = com.b.a.c.c.a(inputStream, bufferedOutputStream, aVar, this.f);
                com.b.a.c.c.a(bufferedOutputStream);
                if (z) {
                    b.a();
                } else {
                    b.b();
                }
            } catch (Throwable th) {
                com.b.a.c.c.a(bufferedOutputStream);
                b.b();
            }
        }
        return z;
    }

    public void b() {
        try {
            this.d.close();
        } catch (Throwable e) {
            d.a(e);
        }
        this.d = null;
    }

    public void b(int i) {
        this.h = i;
    }

    public boolean b(String str) {
        try {
            return this.d.c(c(str));
        } catch (Throwable e) {
            d.a(e);
            return false;
        }
    }

    public void c() {
        try {
            this.d.h();
        } catch (Throwable e) {
            d.a(e);
        }
        try {
            a(this.d.a(), this.k, this.d.b(), this.d.c());
        } catch (Throwable e2) {
            d.a(e2);
        }
    }
}
