package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class dn {
    private final Context a;
    private final a b;
    private final ExecutorService c;

    interface a {
        InputStream a(String str);
    }

    class AnonymousClass1 implements a {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public InputStream a(String str) {
            return this.a.getAssets().open(str);
        }
    }

    public dn(Context context) {
        this(context, Executors.newSingleThreadExecutor(), new AnonymousClass1(context));
    }

    dn(Context context, ExecutorService executorService, a aVar) {
        this.a = context;
        this.c = executorService;
        this.b = aVar;
    }

    private byte[] a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o.a(inputStream, byteArrayOutputStream);
        } catch (IOException e) {
            aph.b("Failed to read the resource from disk");
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                aph.b("Error closing stream for reading resource from disk");
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private String c(String str) {
        String valueOf = String.valueOf("resource_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public long a(String str) {
        File b = b(str);
        return b.exists() ? b.lastModified() : 0;
    }

    public void a(final String str, final dh dhVar) {
        this.c.execute(new Runnable(this) {
            final /* synthetic */ dn c;

            public void run() {
                this.c.b(str, dhVar);
            }
        });
    }

    public void a(final String str, final String str2, final dh dhVar) {
        this.c.execute(new Runnable(this) {
            final /* synthetic */ dn d;

            public void run() {
                this.d.b(str, str2, dhVar);
            }
        });
    }

    public void a(final String str, final byte[] bArr) {
        this.c.execute(new Runnable(this) {
            final /* synthetic */ dn c;

            public void run() {
                this.c.b(str, bArr);
            }
        });
    }

    File b(String str) {
        return new File(this.a.getDir("google_tagmanager", 0), c(str));
    }

    void b(String str, dh dhVar) {
        aph.d("Starting to load a saved resource file from Disk.");
        try {
            InputStream fileInputStream = new FileInputStream(b(str));
            if (fileInputStream != null) {
                dhVar.a(a(fileInputStream));
            } else {
                dhVar.a(0, 1);
            }
        } catch (FileNotFoundException e) {
            String str2 = "Saved resource not found: ";
            String valueOf = String.valueOf(c(str));
            aph.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            dhVar.a(0, 1);
        }
    }

    void b(String str, String str2, dh dhVar) {
        aph.d("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            aph.d("Default asset file is not specified. Not proceeding with the loading");
            dhVar.a(0, 2);
            return;
        }
        try {
            InputStream a = this.b.a(str2);
            if (a != null) {
                dhVar.a(a(a));
            } else {
                dhVar.a(0, 2);
            }
        } catch (IOException e) {
            aph.a(new StringBuilder((String.valueOf(str).length() + 42) + String.valueOf(str2).length()).append("Default asset file not found. ").append(str).append(". Filename: ").append(str2).toString());
            dhVar.a(0, 2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b(java.lang.String r4, byte[] r5) {
        /*
        r3 = this;
        r0 = r3.b(r4);
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0036 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0036 }
        r1.write(r5);	 Catch:{ IOException -> 0x0044 }
        r1.close();	 Catch:{ IOException -> 0x003d }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x003d }
        r1 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x003d }
        r1 = r1.length();	 Catch:{ IOException -> 0x003d }
        r1 = r1 + 24;
        r0.<init>(r1);	 Catch:{ IOException -> 0x003d }
        r1 = "Resource ";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x003d }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x003d }
        r1 = " saved on Disk.";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x003d }
        r0 = r0.toString();	 Catch:{ IOException -> 0x003d }
        com.google.android.gms.internal.aph.d(r0);	 Catch:{ IOException -> 0x003d }
    L_0x0035:
        return;
    L_0x0036:
        r0 = move-exception;
        r0 = "Error opening resource file for writing";
        com.google.android.gms.internal.aph.a(r0);
        goto L_0x0035;
    L_0x003d:
        r0 = move-exception;
        r0 = "Error closing stream for writing resource to disk";
        com.google.android.gms.internal.aph.a(r0);
        goto L_0x0035;
    L_0x0044:
        r2 = move-exception;
        r2 = "Error writing resource to disk. Removing resource from disk";
        com.google.android.gms.internal.aph.a(r2);	 Catch:{ all -> 0x007e }
        r0.delete();	 Catch:{ all -> 0x007e }
        r1.close();	 Catch:{ IOException -> 0x0077 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0077 }
        r1 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0077 }
        r1 = r1.length();	 Catch:{ IOException -> 0x0077 }
        r1 = r1 + 24;
        r0.<init>(r1);	 Catch:{ IOException -> 0x0077 }
        r1 = "Resource ";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0077 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0077 }
        r1 = " saved on Disk.";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0077 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0077 }
        com.google.android.gms.internal.aph.d(r0);	 Catch:{ IOException -> 0x0077 }
        goto L_0x0035;
    L_0x0077:
        r0 = move-exception;
        r0 = "Error closing stream for writing resource to disk";
        com.google.android.gms.internal.aph.a(r0);
        goto L_0x0035;
    L_0x007e:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x00a9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a9 }
        r2 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x00a9 }
        r2 = r2.length();	 Catch:{ IOException -> 0x00a9 }
        r2 = r2 + 24;
        r1.<init>(r2);	 Catch:{ IOException -> 0x00a9 }
        r2 = "Resource ";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x00a9 }
        r1 = r1.append(r4);	 Catch:{ IOException -> 0x00a9 }
        r2 = " saved on Disk.";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x00a9 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00a9 }
        com.google.android.gms.internal.aph.d(r1);	 Catch:{ IOException -> 0x00a9 }
    L_0x00a8:
        throw r0;
    L_0x00a9:
        r1 = move-exception;
        r1 = "Error closing stream for writing resource to disk";
        com.google.android.gms.internal.aph.a(r1);
        goto L_0x00a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dn.b(java.lang.String, byte[]):void");
    }
}
