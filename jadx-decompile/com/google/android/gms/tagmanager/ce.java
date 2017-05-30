package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.internal.el.a;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.en.c;
import com.google.android.gms.internal.en.g;
import com.google.android.gms.internal.gi.f;
import com.google.android.gms.internal.rc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class ce implements f {
    private final Context a;
    private final String b;
    private final ExecutorService c = Executors.newSingleThreadExecutor();
    private av<a> d;

    ce(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private c a(ByteArrayOutputStream byteArrayOutputStream) {
        c cVar = null;
        try {
            cVar = ap.a(byteArrayOutputStream.toString("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            aw.d("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
        } catch (JSONException e2) {
            aw.b("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
        }
        return cVar;
    }

    private c a(byte[] bArr) {
        try {
            c a = en.a(f.a(bArr));
            if (a == null) {
                return a;
            }
            aw.e("The container was successfully loaded from the resource (using binary file)");
            return a;
        } catch (rc e) {
            aw.a("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        } catch (g e2) {
            aw.b("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
    }

    private void c(a aVar) {
        if (aVar.b == null && aVar.c == null) {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        }
    }

    public c a(int i) {
        try {
            InputStream openRawResource = this.a.getResources().openRawResource(i);
            String valueOf = String.valueOf(this.a.getResources().getResourceName(i));
            aw.e(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(valueOf).append(")").toString());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                en.a(openRawResource, byteArrayOutputStream);
                c a = a(byteArrayOutputStream);
                if (a == null) {
                    return a(byteArrayOutputStream.toByteArray());
                }
                aw.e("The container was successfully loaded from the resource (using JSON file format)");
                return a;
            } catch (IOException e) {
                String valueOf2 = String.valueOf(this.a.getResources().getResourceName(i));
                aw.b(new StringBuilder(String.valueOf(valueOf2).length() + 67).append("Error reading the default container with resource ID ").append(i).append(" (").append(valueOf2).append(")").toString());
                return null;
            }
        } catch (NotFoundException e2) {
            aw.b("Failed to load the container. No default container resource found with the resource ID " + i);
            return null;
        }
    }

    public void a() {
        this.c.execute(new Runnable(this) {
            final /* synthetic */ ce a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c();
            }
        });
    }

    public void a(final a aVar) {
        this.c.execute(new Runnable(this) {
            final /* synthetic */ ce b;

            public void run() {
                this.b.b(aVar);
            }
        });
    }

    public void a(av<a> avVar) {
        this.d = avVar;
    }

    public synchronized void b() {
        this.c.shutdown();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean b(com.google.android.gms.internal.el.a r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.d();
        r2 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0016 }
        r2.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0016 }
        r3 = com.google.android.gms.internal.rd.a(r5);	 Catch:{ IOException -> 0x0024 }
        r2.write(r3);	 Catch:{ IOException -> 0x0024 }
        r2.close();	 Catch:{ IOException -> 0x001d }
    L_0x0014:
        r0 = 1;
    L_0x0015:
        return r0;
    L_0x0016:
        r1 = move-exception;
        r1 = "Error opening resource file for writing";
        com.google.android.gms.tagmanager.aw.a(r1);
        goto L_0x0015;
    L_0x001d:
        r0 = move-exception;
        r0 = "error closing stream for writing resource to disk";
        com.google.android.gms.tagmanager.aw.b(r0);
        goto L_0x0014;
    L_0x0024:
        r3 = move-exception;
        r3 = "Error writing resource to disk. Removing resource from disk.";
        com.google.android.gms.tagmanager.aw.b(r3);	 Catch:{ all -> 0x0038 }
        r1.delete();	 Catch:{ all -> 0x0038 }
        r2.close();	 Catch:{ IOException -> 0x0031 }
        goto L_0x0015;
    L_0x0031:
        r1 = move-exception;
        r1 = "error closing stream for writing resource to disk";
        com.google.android.gms.tagmanager.aw.b(r1);
        goto L_0x0015;
    L_0x0038:
        r0 = move-exception;
        r2.close();	 Catch:{ IOException -> 0x003d }
    L_0x003c:
        throw r0;
    L_0x003d:
        r1 = move-exception;
        r1 = "error closing stream for writing resource to disk";
        com.google.android.gms.tagmanager.aw.b(r1);
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.ce.b(com.google.android.gms.internal.el$a):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void c() {
        /*
        r3 = this;
        r0 = r3.d;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;
        r1 = "Callback must be set before execute";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        r0 = r3.d;
        r0.a();
        r0 = "Attempting to load resource from disk";
        com.google.android.gms.tagmanager.aw.e(r0);
        r0 = com.google.android.gms.tagmanager.bs.a();
        r0 = r0.b();
        r1 = com.google.android.gms.tagmanager.bs.a.CONTAINER;
        if (r0 == r1) goto L_0x002e;
    L_0x0022:
        r0 = com.google.android.gms.tagmanager.bs.a();
        r0 = r0.b();
        r1 = com.google.android.gms.tagmanager.bs.a.CONTAINER_DEBUG;
        if (r0 != r1) goto L_0x0046;
    L_0x002e:
        r0 = r3.b;
        r1 = com.google.android.gms.tagmanager.bs.a();
        r1 = r1.d();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0046;
    L_0x003e:
        r0 = r3.d;
        r1 = com.google.android.gms.tagmanager.av.a.NOT_AVAILABLE;
        r0.a(r1);
    L_0x0045:
        return;
    L_0x0046:
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0070 }
        r0 = r3.d();	 Catch:{ FileNotFoundException -> 0x0070 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0070 }
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r0.<init>();	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        com.google.android.gms.internal.en.a(r1, r0);	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r0 = com.google.android.gms.internal.el.a.a(r0);	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r3.c(r0);	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r2 = r3.d;	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r2.a(r0);	 Catch:{ IOException -> 0x0085, IllegalArgumentException -> 0x009d }
        r1.close();	 Catch:{ IOException -> 0x007e }
    L_0x006a:
        r0 = "The Disk resource was successfully read.";
        com.google.android.gms.tagmanager.aw.e(r0);
        goto L_0x0045;
    L_0x0070:
        r0 = move-exception;
        r0 = "Failed to find the resource in the disk";
        com.google.android.gms.tagmanager.aw.d(r0);
        r0 = r3.d;
        r1 = com.google.android.gms.tagmanager.av.a.NOT_AVAILABLE;
        r0.a(r1);
        goto L_0x0045;
    L_0x007e:
        r0 = move-exception;
        r0 = "Error closing stream for reading resource from disk";
        com.google.android.gms.tagmanager.aw.b(r0);
        goto L_0x006a;
    L_0x0085:
        r0 = move-exception;
        r0 = r3.d;	 Catch:{ all -> 0x00b5 }
        r2 = com.google.android.gms.tagmanager.av.a.IO_ERROR;	 Catch:{ all -> 0x00b5 }
        r0.a(r2);	 Catch:{ all -> 0x00b5 }
        r0 = "Failed to read the resource from disk";
        com.google.android.gms.tagmanager.aw.b(r0);	 Catch:{ all -> 0x00b5 }
        r1.close();	 Catch:{ IOException -> 0x0096 }
        goto L_0x006a;
    L_0x0096:
        r0 = move-exception;
        r0 = "Error closing stream for reading resource from disk";
        com.google.android.gms.tagmanager.aw.b(r0);
        goto L_0x006a;
    L_0x009d:
        r0 = move-exception;
        r0 = r3.d;	 Catch:{ all -> 0x00b5 }
        r2 = com.google.android.gms.tagmanager.av.a.IO_ERROR;	 Catch:{ all -> 0x00b5 }
        r0.a(r2);	 Catch:{ all -> 0x00b5 }
        r0 = "Failed to read the resource from disk. The resource is inconsistent";
        com.google.android.gms.tagmanager.aw.b(r0);	 Catch:{ all -> 0x00b5 }
        r1.close();	 Catch:{ IOException -> 0x00ae }
        goto L_0x006a;
    L_0x00ae:
        r0 = move-exception;
        r0 = "Error closing stream for reading resource from disk";
        com.google.android.gms.tagmanager.aw.b(r0);
        goto L_0x006a;
    L_0x00b5:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x00ba }
    L_0x00b9:
        throw r0;
    L_0x00ba:
        r1 = move-exception;
        r1 = "Error closing stream for reading resource from disk";
        com.google.android.gms.tagmanager.aw.b(r1);
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.ce.c():void");
    }

    File d() {
        String valueOf = String.valueOf("resource_");
        String valueOf2 = String.valueOf(this.b);
        return new File(this.a.getDir("google_tagmanager", 0), valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
