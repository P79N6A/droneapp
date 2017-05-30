package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

public class a extends t {
    public static boolean a;
    private com.google.android.gms.ads.a.a.a b;
    private final m c;
    private String d;
    private boolean e = false;
    private Object f = new Object();

    a(v vVar) {
        super(vVar);
        this.c = new m(vVar.d());
    }

    private static String a(String str) {
        if (p.d("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, p.d("MD5").digest(str.getBytes()))});
    }

    private boolean a(com.google.android.gms.ads.a.a.a aVar, com.google.android.gms.ads.a.a.a aVar2) {
        Object obj = null;
        CharSequence a = aVar2 == null ? null : aVar2.a();
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        String b = x().b();
        synchronized (this.f) {
            String valueOf;
            String valueOf2;
            if (!this.e) {
                this.d = e();
                this.e = true;
            } else if (TextUtils.isEmpty(this.d)) {
                if (aVar != null) {
                    obj = aVar.a();
                }
                if (obj == null) {
                    valueOf = String.valueOf(a);
                    String valueOf3 = String.valueOf(b);
                    boolean b2 = b(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
                    return b2;
                }
                valueOf2 = String.valueOf(obj);
                valueOf = String.valueOf(b);
                this.d = a(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
            }
            valueOf2 = String.valueOf(a);
            valueOf = String.valueOf(b);
            obj = a(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
            if (TextUtils.isEmpty(obj)) {
                return false;
            } else if (obj.equals(this.d)) {
                return true;
            } else {
                if (TextUtils.isEmpty(this.d)) {
                    valueOf = b;
                } else {
                    q("Resetting the client id because Advertising Id changed.");
                    obj = x().c();
                    a("New client Id", obj);
                }
                String valueOf4 = String.valueOf(a);
                valueOf3 = String.valueOf(obj);
                b2 = b(valueOf3.length() != 0 ? valueOf4.concat(valueOf3) : new String(valueOf4));
                return b2;
            }
        }
    }

    private boolean b(String str) {
        try {
            String a = a(str);
            q("Storing hashed adid.");
            FileOutputStream openFileOutput = o().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.d = a;
            return true;
        } catch (IOException e) {
            e("Error creating hash file", e);
            return false;
        }
    }

    private synchronized com.google.android.gms.ads.a.a.a f() {
        if (this.c.a(1000)) {
            this.c.a();
            com.google.android.gms.ads.a.a.a d = d();
            if (a(this.b, d)) {
                this.b = d;
            } else {
                u("Failed to reset client id on adid change. Not using adid");
                this.b = new com.google.android.gms.ads.a.a.a("", false);
            }
        }
        return this.b;
    }

    protected void a() {
    }

    public boolean b() {
        D();
        com.google.android.gms.ads.a.a.a f = f();
        return (f == null || f.b()) ? false : true;
    }

    public String c() {
        D();
        com.google.android.gms.ads.a.a.a f = f();
        CharSequence a = f != null ? f.a() : null;
        return TextUtils.isEmpty(a) ? null : a;
    }

    protected com.google.android.gms.ads.a.a.a d() {
        com.google.android.gms.ads.a.a.a aVar = null;
        try {
            aVar = com.google.android.gms.ads.a.a.b(o());
        } catch (IllegalStateException e) {
            t("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        } catch (Throwable th) {
            if (!a) {
                a = true;
                d("Error getting advertiser id", th);
            }
        }
        return aVar;
    }

    protected String e() {
        Object obj;
        String str = null;
        try {
            FileInputStream openFileInput = o().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                t("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                o().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                q("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    return str2;
                } catch (FileNotFoundException e) {
                    return str2;
                } catch (IOException e2) {
                    IOException iOException = e2;
                    str = str2;
                    IOException iOException2 = iOException;
                    d("Error reading Hash file, deleting it", obj);
                    o().deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
            return null;
        } catch (IOException e4) {
            obj = e4;
            d("Error reading Hash file, deleting it", obj);
            o().deleteFile("gaClientIdData");
            return str;
        }
    }
}
