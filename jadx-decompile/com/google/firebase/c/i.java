package com.google.firebase.c;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.c;
import com.google.android.gms.g.f;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.nc;
import com.google.android.gms.internal.nj;
import com.google.firebase.c.k.a;
import com.google.firebase.c.k.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

public class i {
    static final /* synthetic */ boolean a = (!i.class.desiredAssertionStatus());
    private final Uri b;
    private final d c;

    i(@NonNull Uri uri, @NonNull d dVar) {
        boolean z = true;
        d.b(uri != null, "storageUri cannot be null");
        if (dVar == null) {
            z = false;
        }
        d.b(z, "FirebaseApp cannot be null");
        this.b = uri;
        this.c = dVar;
    }

    @NonNull
    public f<byte[]> a(final long j) {
        final g gVar = new g();
        k kVar = new k(this);
        j jVar = (j) ((j) kVar.a(new a(this) {
            final /* synthetic */ i c;

            public void a(b bVar, InputStream inputStream) {
                int i = 0;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        i += read;
                        if (((long) i) > j) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    gVar.a(byteArrayOutputStream.toByteArray());
                } finally {
                    inputStream.close();
                }
            }
        }).a(new com.google.android.gms.g.d<b>(this) {
            final /* synthetic */ i b;

            public void a(b bVar) {
                if (!gVar.a().a()) {
                    Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
                    gVar.a(g.a(Status.c));
                }
            }

            public /* synthetic */ void a(Object obj) {
                a((b) obj);
            }
        })).a(new c(this) {
            static final /* synthetic */ boolean a = (!i.class.desiredAssertionStatus());
            final /* synthetic */ i c;

            public void a(@NonNull Exception exception) {
                Exception a = g.a(exception, 0);
                if (a || a != null) {
                    gVar.a(a);
                    return;
                }
                throw new AssertionError();
            }
        });
        kVar.r();
        return gVar.a();
    }

    @NonNull
    public f<h> a(@NonNull h hVar) {
        d.a(hVar);
        g gVar = new g();
        p.a().a(new r(this, gVar, hVar));
        return gVar.a();
    }

    @NonNull
    public c a(@NonNull File file) {
        return b(Uri.fromFile(file));
    }

    @Nullable
    public i a() {
        String path = this.b.getPath();
        if (path == null || path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new i(this.b.buildUpon().path(lastIndexOf == -1 ? "/" : path.substring(0, lastIndexOf)).build(), this.c);
    }

    @NonNull
    public i a(@NonNull String str) {
        d.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        String c = nc.c(str);
        try {
            return new i(this.b.buildUpon().appendEncodedPath(nc.a(c)).build(), this.c);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "StorageReference";
            String str3 = "Unable to create a valid default Uri. ";
            String valueOf = String.valueOf(c);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            throw new IllegalArgumentException("childName");
        }
    }

    @NonNull
    public k a(@NonNull a aVar) {
        k kVar = new k(this);
        kVar.a(aVar);
        kVar.r();
        return kVar;
    }

    @NonNull
    public l a(@NonNull Uri uri) {
        d.b(uri != null, "uri cannot be null");
        l lVar = new l(this, null, uri, null);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull Uri uri, @NonNull h hVar) {
        boolean z = true;
        d.b(uri != null, "uri cannot be null");
        if (hVar == null) {
            z = false;
        }
        d.b(z, "metadata cannot be null");
        l lVar = new l(this, hVar, uri, null);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull Uri uri, @Nullable h hVar, @Nullable Uri uri2) {
        boolean z = true;
        d.b(uri != null, "uri cannot be null");
        if (hVar == null) {
            z = false;
        }
        d.b(z, "metadata cannot be null");
        l lVar = new l(this, hVar, uri, uri2);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull InputStream inputStream) {
        d.b(inputStream != null, "stream cannot be null");
        l lVar = new l(this, null, inputStream);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull InputStream inputStream, @NonNull h hVar) {
        boolean z = true;
        d.b(inputStream != null, "stream cannot be null");
        if (hVar == null) {
            z = false;
        }
        d.b(z, "metadata cannot be null");
        l lVar = new l(this, hVar, inputStream);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull byte[] bArr) {
        d.b(bArr != null, "bytes cannot be null");
        l lVar = new l(this, null, bArr);
        lVar.r();
        return lVar;
    }

    @NonNull
    public l a(@NonNull byte[] bArr, @NonNull h hVar) {
        boolean z = true;
        d.b(bArr != null, "bytes cannot be null");
        if (hVar == null) {
            z = false;
        }
        d.b(z, "metadata cannot be null");
        l lVar = new l(this, hVar, bArr);
        lVar.r();
        return lVar;
    }

    @NonNull
    public c b(@NonNull Uri uri) {
        c cVar = new c(this, uri);
        cVar.r();
        return cVar;
    }

    @NonNull
    public i b() {
        return new i(this.b.buildUpon().path("").build(), this.c);
    }

    @NonNull
    public String c() {
        String path = this.b.getPath();
        if (a || path != null) {
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } else {
            throw new AssertionError();
        }
    }

    @NonNull
    public String d() {
        String path = this.b.getPath();
        if (a || path != null) {
            return path;
        }
        throw new AssertionError();
    }

    @NonNull
    public String e() {
        return this.b.getAuthority();
    }

    public boolean equals(Object obj) {
        return !(obj instanceof i) ? false : ((i) obj).toString().equals(toString());
    }

    @NonNull
    public d f() {
        return this.c;
    }

    @NonNull
    com.google.firebase.b g() {
        return f().f();
    }

    @NonNull
    nj h() {
        return nj.a(g());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NonNull
    public List<l> i() {
        return o.a().a(this);
    }

    @NonNull
    public List<c> j() {
        return o.a().b(this);
    }

    @NonNull
    public f<h> k() {
        g gVar = new g();
        p.a().a(new n(this, gVar));
        return gVar.a();
    }

    @NonNull
    public f<Uri> l() {
        final g gVar = new g();
        f k = k();
        k.a(new com.google.android.gms.g.d<h>(this) {
            final /* synthetic */ i b;

            public void a(h hVar) {
                gVar.a(hVar.l());
            }

            public /* synthetic */ void a(Object obj) {
                a((h) obj);
            }
        });
        k.a(new c(this) {
            final /* synthetic */ i b;

            public void a(@NonNull Exception exception) {
                gVar.a(exception);
            }
        });
        return gVar.a();
    }

    @NonNull
    public k m() {
        k kVar = new k(this);
        kVar.r();
        return kVar;
    }

    public f<Void> n() {
        g gVar = new g();
        p.a().a(new m(this, gVar));
        return gVar.a();
    }

    @NonNull
    Uri o() {
        return this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b.getAuthority());
        String valueOf2 = String.valueOf(this.b.getPath());
        return new StringBuilder((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length()).append("gs://").append(valueOf).append(valueOf2).toString();
    }
}
