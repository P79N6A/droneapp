package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gi.j;
import com.google.android.gms.tagmanager.av.a;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

class cc implements Runnable {
    private final Context a;
    private final er b;
    private final String c;
    private final String d;
    private av<j> e;
    private volatile dq f;
    private volatile String g;
    private volatile String h;

    cc(Context context, String str, er erVar, dq dqVar) {
        this.a = context;
        this.b = erVar;
        this.c = str;
        this.f = dqVar;
        String valueOf = String.valueOf("/r?id=");
        String valueOf2 = String.valueOf(str);
        this.d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.g = this.d;
        this.h = null;
    }

    public cc(Context context, String str, dq dqVar) {
        this(context, str, new er(), dqVar);
    }

    private boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        aw.e("...no network connectivity");
        return false;
    }

    private void c() {
        String valueOf;
        if (b()) {
            String str;
            String str2;
            aw.e("Start loading resource from network ...");
            String a = a();
            eq a2 = this.b.a();
            InputStream inputStream = null;
            try {
                inputStream = a2.a(a);
            } catch (FileNotFoundException e) {
                str = this.c;
                aw.b(new StringBuilder((String.valueOf(a).length() + 79) + String.valueOf(str).length()).append("No data is retrieved from the given url: ").append(a).append(". Make sure container_id: ").append(str).append(" is correct.").toString());
                this.e.a(a.SERVER_ERROR);
                a2.a();
                return;
            } catch (es e2) {
                str2 = "Error when loading resource for url: ";
                valueOf = String.valueOf(a);
                aw.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                this.e.a(a.SERVER_UNAVAILABLE_ERROR);
            } catch (Throwable e3) {
                valueOf = String.valueOf(e3.getMessage());
                aw.b(new StringBuilder((String.valueOf(a).length() + 40) + String.valueOf(valueOf).length()).append("Error when loading resources from url: ").append(a).append(" ").append(valueOf).toString(), e3);
                this.e.a(a.IO_ERROR);
                a2.a();
                return;
            } catch (Throwable th) {
                a2.a();
            }
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                en.a(inputStream, byteArrayOutputStream);
                Object a3 = j.a(byteArrayOutputStream.toByteArray());
                str = String.valueOf(a3);
                aw.e(new StringBuilder(String.valueOf(str).length() + 43).append("Successfully loaded supplemented resource: ").append(str).toString());
                if (a3.b == null && a3.a.length == 0) {
                    str2 = "No change for container: ";
                    str = String.valueOf(this.c);
                    aw.e(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
                this.e.a(a3);
                a2.a();
                aw.e("Load resource from network finished.");
                return;
            } catch (Throwable e32) {
                valueOf = String.valueOf(e32.getMessage());
                aw.b(new StringBuilder((String.valueOf(a).length() + 51) + String.valueOf(valueOf).length()).append("Error when parsing downloaded resources from url: ").append(a).append(" ").append(valueOf).toString(), e32);
                this.e.a(a.SERVER_ERROR);
                a2.a();
                return;
            }
        }
        this.e.a(a.NOT_AVAILABLE);
    }

    String a() {
        String valueOf = String.valueOf(this.f.a());
        String str = this.g;
        String valueOf2 = String.valueOf("&v=a65833898");
        valueOf = new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        if (!(this.h == null || this.h.trim().equals(""))) {
            valueOf = String.valueOf(valueOf);
            str = String.valueOf("&pv=");
            valueOf2 = this.h;
            valueOf = new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        }
        if (!bs.a().b().equals(a.CONTAINER_DEBUG)) {
            return valueOf;
        }
        str = String.valueOf(valueOf);
        valueOf = String.valueOf("&gtm_debug=x");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    void a(av<j> avVar) {
        this.e = avVar;
    }

    void a(String str) {
        if (str == null) {
            this.g = this.d;
            return;
        }
        String str2 = "Setting CTFE URL path: ";
        String valueOf = String.valueOf(str);
        aw.d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.g = str;
    }

    void b(String str) {
        String str2 = "Setting previous container version: ";
        String valueOf = String.valueOf(str);
        aw.d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.h = str;
    }

    public void run() {
        if (this.e == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.e.a();
        c();
    }
}
