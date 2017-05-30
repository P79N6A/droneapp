package com.google.firebase.c;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.tts.loopj.RequestParams;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nj;
import com.google.android.gms.internal.nk;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends j<a> {
    private final i b;
    private final Uri c;
    private final byte[] d;
    private final byte[] e;
    private final long f;
    private final AtomicLong g;
    private nb h;
    private InputStream i;
    private volatile h j;
    private volatile Uri k;
    private volatile Exception l;
    private volatile Exception m;
    private volatile int n;
    private volatile String o;

    public class a extends b {
        final /* synthetic */ l a;
        private final long c;
        private final Uri d;
        private final h e;

        a(l lVar, Exception exception, long j, Uri uri, h hVar) {
            this.a = lVar;
            super(lVar, exception);
            this.c = j;
            this.d = uri;
            this.e = hVar;
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

        @Nullable
        public Uri f() {
            return this.d;
        }

        @Nullable
        public h g() {
            return this.e;
        }

        @Nullable
        public Uri h() {
            h g = g();
            return g != null ? g.l() : null;
        }
    }

    l(i iVar, h hVar, Uri uri, Uri uri2) {
        long statSize;
        long j;
        Throwable th;
        InputStream openInputStream;
        Exception exception;
        String str;
        String str2;
        String valueOf;
        long j2;
        InputStream inputStream;
        String str3;
        String str4;
        long j3 = -1;
        this.e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.g = new AtomicLong(0);
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0;
        d.a(iVar);
        d.a(uri);
        this.d = null;
        this.b = iVar;
        this.j = hVar;
        this.c = uri;
        this.h = new nb(this.b.g(), this.b.f().c());
        ContentResolver contentResolver = this.b.f().f().a().getContentResolver();
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(this.c, "r");
            if (openFileDescriptor != null) {
                statSize = openFileDescriptor.getStatSize();
                try {
                    openFileDescriptor.close();
                } catch (Throwable e) {
                    Throwable th2 = e;
                    j = statSize;
                    th = th2;
                    try {
                        Log.w("UploadTask", "NullPointerException during file size calculation.", th);
                        openInputStream = contentResolver.openInputStream(this.c);
                        if (openInputStream == null) {
                            try {
                            } catch (Exception e2) {
                                exception = e2;
                                str = "UploadTask";
                                str2 = "could not locate file for uploading:";
                                valueOf = String.valueOf(this.c.toString());
                                Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                                this.l = exception;
                                j2 = j3;
                                inputStream = openInputStream;
                                statSize = j2;
                                this.f = statSize;
                                this.i = inputStream;
                                this.k = uri2;
                            }
                        }
                        j2 = j3;
                        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
                        statSize = j2;
                    } catch (Exception e22) {
                        j3 = j;
                        openInputStream = null;
                        exception = e22;
                        str = "UploadTask";
                        str2 = "could not locate file for uploading:";
                        valueOf = String.valueOf(this.c.toString());
                        if (valueOf.length() == 0) {
                        }
                        Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        this.l = exception;
                        j2 = j3;
                        inputStream = openInputStream;
                        statSize = j2;
                        this.f = statSize;
                        this.i = inputStream;
                        this.k = uri2;
                    }
                    this.f = statSize;
                    this.i = inputStream;
                    this.k = uri2;
                } catch (IOException e3) {
                    j3 = statSize;
                    try {
                        str3 = "UploadTask";
                        str4 = "could not retrieve file size for upload ";
                        valueOf = String.valueOf(this.c.toString());
                        Log.w(str3, valueOf.length() == 0 ? str4.concat(valueOf) : new String(str4));
                        openInputStream = contentResolver.openInputStream(this.c);
                        j2 = j3;
                        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
                        statSize = j2;
                    } catch (Exception e222) {
                        exception = e222;
                        openInputStream = null;
                        str = "UploadTask";
                        str2 = "could not locate file for uploading:";
                        valueOf = String.valueOf(this.c.toString());
                        if (valueOf.length() == 0) {
                        }
                        Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        this.l = exception;
                        j2 = j3;
                        inputStream = openInputStream;
                        statSize = j2;
                        this.f = statSize;
                        this.i = inputStream;
                        this.k = uri2;
                    }
                    this.f = statSize;
                    this.i = inputStream;
                    this.k = uri2;
                } catch (Exception e4) {
                    exception = e4;
                    j3 = statSize;
                    openInputStream = null;
                    str = "UploadTask";
                    str2 = "could not locate file for uploading:";
                    valueOf = String.valueOf(this.c.toString());
                    if (valueOf.length() == 0) {
                    }
                    Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                    this.l = exception;
                    j2 = j3;
                    inputStream = openInputStream;
                    statSize = j2;
                    this.f = statSize;
                    this.i = inputStream;
                    this.k = uri2;
                }
            }
            statSize = -1;
            j3 = statSize;
        } catch (NullPointerException e5) {
            th = e5;
            j = -1;
            Log.w("UploadTask", "NullPointerException during file size calculation.", th);
            openInputStream = contentResolver.openInputStream(this.c);
            if (openInputStream == null) {
            }
            j2 = j3;
            inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
            statSize = j2;
            this.f = statSize;
            this.i = inputStream;
            this.k = uri2;
        } catch (IOException e6) {
            str3 = "UploadTask";
            str4 = "could not retrieve file size for upload ";
            valueOf = String.valueOf(this.c.toString());
            if (valueOf.length() == 0) {
            }
            Log.w(str3, valueOf.length() == 0 ? str4.concat(valueOf) : new String(str4));
            openInputStream = contentResolver.openInputStream(this.c);
            if (openInputStream == null) {
            }
            j2 = j3;
            inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
            statSize = j2;
            this.f = statSize;
            this.i = inputStream;
            this.k = uri2;
        }
        openInputStream = contentResolver.openInputStream(this.c);
        if (openInputStream == null) {
        }
        j2 = j3;
        inputStream = openInputStream == null ? new BufferedInputStream(openInputStream) : openInputStream;
        statSize = j2;
        this.f = statSize;
        this.i = inputStream;
        this.k = uri2;
    }

    l(i iVar, h hVar, InputStream inputStream) {
        this.e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.g = new AtomicLong(0);
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0;
        d.a(iVar);
        d.a(inputStream);
        this.f = -1;
        this.d = null;
        this.b = iVar;
        this.j = hVar;
        this.i = new BufferedInputStream(inputStream, AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        this.c = null;
        this.h = new nb(this.b.g(), this.b.f().c());
    }

    l(i iVar, h hVar, byte[] bArr) {
        this.e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.g = new AtomicLong(0);
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0;
        d.a(iVar);
        d.a(bArr);
        this.d = bArr;
        this.f = (long) this.d.length;
        this.b = iVar;
        this.j = hVar;
        this.c = null;
        this.i = new BufferedInputStream(new ByteArrayInputStream(this.d), AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        this.h = new nb(this.b.g(), this.b.f().c());
    }

    private void E() {
        Throwable e;
        JSONObject jSONObject = null;
        if (this.j != null) {
            String a = this.j.a();
        } else {
            CharSequence charSequence = null;
        }
        if (this.c != null && TextUtils.isEmpty(r0)) {
            a = this.b.f().f().a().getContentResolver().getType(this.c);
        }
        if (TextUtils.isEmpty(a)) {
            a = RequestParams.APPLICATION_OCTET_STREAM;
        }
        try {
            nj h = this.b.h();
            Uri o = this.b.o();
            if (this.j != null) {
                jSONObject = this.j.s();
            }
            nk a2 = h.a(o, jSONObject, a);
            if (b(a2)) {
                Object a3 = a2.a("X-Goog-Upload-URL");
                if (!TextUtils.isEmpty(a3)) {
                    this.k = Uri.parse(a3);
                }
            }
        } catch (JSONException e2) {
            e = e2;
            Log.e("UploadTask", "Unable to create a network request from metadata", e);
            this.l = e;
        } catch (RemoteException e3) {
            e = e3;
            Log.e("UploadTask", "Unable to create a network request from metadata", e);
            this.l = e;
        }
    }

    private boolean F() {
        if (v() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.l = new InterruptedException();
            a(64, false);
            return false;
        } else if (v() == 32) {
            a(256, false);
            return false;
        } else if (v() == 8) {
            a(16, false);
            return false;
        } else if (!G()) {
            return false;
        } else {
            if (this.k == null) {
                if (this.l == null) {
                    this.l = new IllegalStateException("Unable to obtain an upload URL.");
                }
                a(64, false);
                return false;
            } else if (this.l != null) {
                a(64, false);
                return false;
            } else {
                boolean z = this.m != null || this.n < 200 || this.n >= 300;
                if (!z || a(true)) {
                    return true;
                }
                if (!G()) {
                    return false;
                }
                a(64, false);
                return false;
            }
        }
    }

    private boolean G() {
        if (!"final".equals(this.o)) {
            return true;
        }
        if (this.l == null) {
            this.l = new IOException("The server has terminated the upload session");
        }
        a(64, false);
        return false;
    }

    private void H() {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        this.i.mark(this.e.length + 1);
        try {
            int read = this.i.read(this.e);
            try {
                nk a = this.b.h().a(this.b.o(), this.k.toString(), this.e, this.g.get(), read, ((long) read) != 262144);
                if (a(a)) {
                    if (read != -1) {
                        this.g.getAndAdd((long) read);
                    }
                    if (((long) read) != 262144) {
                        try {
                            this.j = new com.google.firebase.c.h.a(a.d(), this.b).a();
                            a(4, false);
                            a(128, false);
                            return;
                        } catch (JSONException e2) {
                            e = e2;
                            str = "UploadTask";
                            str2 = "Unable to parse resulting metadata from upload:";
                            valueOf = String.valueOf(a.e());
                            Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                            this.l = e;
                            return;
                        } catch (RemoteException e3) {
                            e = e3;
                            str = "UploadTask";
                            str2 = "Unable to parse resulting metadata from upload:";
                            valueOf = String.valueOf(a.e());
                            if (valueOf.length() == 0) {
                            }
                            Log.e(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                            this.l = e;
                            return;
                        }
                    }
                    return;
                }
                try {
                    this.i.reset();
                } catch (Throwable e4) {
                    Log.w("UploadTask", "Unable to reset the stream for error recovery.", e4);
                    this.l = e4;
                }
            } catch (Throwable e42) {
                Log.e("UploadTask", "Unable to create chunk upload request", e42);
                this.l = e42;
            }
        } catch (Throwable e422) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e422);
            this.l = e422;
        }
    }

    private boolean a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    private boolean a(nk nkVar) {
        nkVar.a(ng.a(this.b.g()), this.b.g().a());
        return c(nkVar);
    }

    private boolean a(boolean z) {
        try {
            nk b = this.b.h().b(this.b.o(), this.k.toString());
            if ("final".equals(this.o)) {
                return false;
            }
            if (z) {
                if (!b(b)) {
                    return false;
                }
            } else if (!a(b)) {
                return false;
            }
            if ("final".equals(b.a("X-Goog-Upload-Status"))) {
                this.l = new IOException("The server has terminated the upload session");
                return false;
            }
            Object a = b.a("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(a) ? Long.parseLong(a) : 0;
            long j = this.g.get();
            if (j > parseLong) {
                this.l = new IOException("Unexpected error. The server lost a chunk update.");
                return false;
            }
            if (j < parseLong) {
                try {
                    if (this.i.skip(parseLong - j) != parseLong - j) {
                        this.l = new IOException("Unexpected end of stream encountered.");
                        return false;
                    } else if (!this.g.compareAndSet(j, parseLong)) {
                        Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                        this.l = new IllegalStateException("uploaded bytes changed unexpectedly.");
                        return false;
                    }
                } catch (Throwable e) {
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                    this.l = e;
                    return false;
                }
            }
            return true;
        } catch (Throwable e2) {
            Log.e("UploadTask", "Unable to recover status during resumable upload", e2);
            this.l = e2;
            return false;
        }
    }

    private boolean b(nk nkVar) {
        this.h.a(nkVar);
        return c(nkVar);
    }

    private boolean c(nk nkVar) {
        int g = nkVar.g();
        if (this.h.a(g)) {
            g = -2;
        }
        this.n = g;
        this.m = nkVar.f();
        this.o = nkVar.a("X-Goog-Upload-Status");
        return a(this.n) && this.m == null;
    }

    long k() {
        return this.f;
    }

    i l() {
        return this.b;
    }

    protected void m() {
        p.a().b(D());
    }

    @NonNull
    a n() {
        return new a(this, g.a(this.l != null ? this.l : this.m, this.n), this.g.get(), this.k, this.j);
    }

    void o() {
        this.h.b();
        if (this.b.a() == null) {
            this.l = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.l != null) {
            a(64, false);
            return;
        }
        if (this.k == null) {
            E();
        } else {
            a(false);
        }
        while (F()) {
            a(4, false);
            H();
        }
    }

    protected void p() {
        nk a;
        this.h.a();
        try {
            a = this.b.h().a(this.b.o(), this.k.toString());
        } catch (Throwable e) {
            Log.e("UploadTask", "Unable to create chunk upload request", e);
            a = null;
        }
        if (a != null) {
            p.a().a(new Runnable(this) {
                final /* synthetic */ l b;

                public void run() {
                    a.a(ng.a(this.b.b.g()), this.b.b.g().a());
                }
            });
        }
        this.l = g.a(Status.e);
        super.p();
    }

    @NonNull
    /* synthetic */ a q() {
        return n();
    }

    protected void s() {
        this.l = null;
        this.m = null;
        this.n = 0;
        this.o = null;
    }
}
