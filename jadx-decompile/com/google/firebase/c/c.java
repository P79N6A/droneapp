package com.google.firebase.c;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.e;

public class c extends j<a> {
    private final Uri b;
    private long c;
    private i d;
    private nb e;
    private long f = -1;
    private String g = null;
    private volatile Exception h = null;
    private long i = 0;
    private int j;

    public class a extends b {
        final /* synthetic */ c a;
        private final long c;

        a(c cVar, Exception exception, long j) {
            this.a = cVar;
            super(cVar, exception);
            this.c = j;
        }

        public long a() {
            return this.c;
        }

        public long b() {
            return this.a.k();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Exception c() {
            return super.c();
        }

        @NonNull
        public /* bridge */ /* synthetic */ i d() {
            return super.d();
        }

        @NonNull
        public /* bridge */ /* synthetic */ j e() {
            return super.e();
        }
    }

    c(@NonNull i iVar, @NonNull Uri uri) {
        this.d = iVar;
        this.b = uri;
        this.e = new nb(this.d.f().f(), this.d.f().b());
    }

    private boolean a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    long k() {
        return this.f;
    }

    @NonNull
    i l() {
        return this.d;
    }

    protected void m() {
        p.a().c(D());
    }

    @NonNull
    a n() {
        return new a(this, g.a(this.h, this.j), this.c);
    }

    void o() {
        a(4, false);
        this.e.b();
        try {
            Object a;
            nk a2 = this.d.h().a(this.d.o(), this.i);
            this.e.a(a2, false);
            this.j = a2.g();
            this.h = a2.f() != null ? a2.f() : this.h;
            Object obj = (a(this.j) && this.h == null && v() == 4) ? 1 : null;
            if (obj != null) {
                this.f = (long) a2.i();
                a = a2.a(e.v);
                if (TextUtils.isEmpty(a) || this.g == null || this.g.equals(a)) {
                    this.g = a;
                    InputStream c = a2.c();
                    if (c != null) {
                        try {
                            String str;
                            String valueOf;
                            String str2;
                            OutputStream fileOutputStream;
                            File file = new File(this.b.getPath());
                            if (!file.exists()) {
                                if (this.i > 0) {
                                    String str3 = "FileDownloadTask";
                                    str = "The file downloading to has been deleted:";
                                    valueOf = String.valueOf(file.getAbsolutePath());
                                    Log.e(str3, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                    throw new IllegalStateException("expected a file to resume from.");
                                } else if (!file.createNewFile()) {
                                    str = "FileDownloadTask";
                                    str2 = "unable to create file:";
                                    valueOf = String.valueOf(file.getAbsolutePath());
                                    Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                }
                            }
                            if (this.i > 0) {
                                str = "FileDownloadTask";
                                str2 = "Resuming download file ";
                                valueOf = String.valueOf(file.getAbsolutePath());
                                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                fileOutputStream = new FileOutputStream(file, true);
                            } else {
                                fileOutputStream = new FileOutputStream(file);
                            }
                            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
                            do {
                                int read = c.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                this.c += (long) read;
                            } while (a(4, false));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            c.close();
                        } catch (Throwable e) {
                            Log.e("FileDownloadTask", "Exception occurred during file download", e);
                            this.h = e;
                        }
                    } else {
                        this.h = new IllegalStateException("Unable to open Firebase Storage stream.");
                    }
                } else {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.i = 0;
                    this.g = null;
                    a2.b();
                    m();
                    return;
                }
            }
            a2.b();
            a = (obj != null && this.h == null && v() == 4) ? 1 : null;
            if (a != null) {
                a(128, false);
                return;
            }
            File file2 = new File(this.b.getPath());
            if (file2.exists()) {
                this.i = file2.length();
            } else {
                this.i = 0;
            }
            if (v() == 8) {
                a(16, false);
                return;
            }
            if (!a(v() == 32 ? 256 : 64, false)) {
                Log.w("FileDownloadTask", "Unable to change download task to final state from " + v());
            }
        } catch (Throwable e2) {
            Log.e("FileDownloadTask", "Unable to create firebase storage network request.", e2);
            this.h = e2;
            a(64, false);
        }
    }

    protected void p() {
        this.e.a();
    }

    @NonNull
    /* synthetic */ a q() {
        return n();
    }
}
