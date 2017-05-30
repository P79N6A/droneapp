package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.o;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class ds implements Runnable {
    private final Context a;
    private final dh b;
    private final dr c;
    private final dl d;
    private final do e;

    public ds(Context context, dl dlVar, dh dhVar) {
        this(context, dlVar, dhVar, new dr(), new do());
    }

    ds(Context context, dl dlVar, dh dhVar, dr drVar, do doVar) {
        this.a = (Context) d.a(context);
        this.b = (dh) d.a(dhVar);
        this.d = dlVar;
        this.c = drVar;
        this.e = doVar;
    }

    public ds(Context context, dl dlVar, dh dhVar, String str) {
        this(context, dlVar, dhVar, new dr(), new do());
        this.e.a(str);
    }

    void a() {
        String str;
        if (b()) {
            String a;
            String valueOf;
            aph.d("Starting to load resource from Network.");
            dq a2 = this.c.a();
            InputStream inputStream = null;
            try {
                a = this.e.a(this.d.a());
                str = "Loading resource from ";
                valueOf = String.valueOf(a);
                aph.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                inputStream = a2.a(a);
            } catch (FileNotFoundException e) {
                valueOf = "NetworkLoader: No data was retrieved from the given url: ";
                String valueOf2 = String.valueOf(a);
                aph.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                this.b.a(2, 0);
                a2.a();
                return;
            } catch (du e2) {
                str = "NetworkLoader: Error when loading resource for url: ";
                valueOf = String.valueOf(a);
                aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.b.a(3, 0);
            } catch (Throwable e3) {
                valueOf = String.valueOf(e3.getMessage());
                aph.a(new StringBuilder((String.valueOf(a).length() + 54) + String.valueOf(valueOf).length()).append("NetworkLoader: Error when loading resource from url: ").append(a).append(" ").append(valueOf).toString(), e3);
                this.b.a(1, 0);
                a2.a();
                return;
            } catch (Throwable th) {
                a2.a();
            }
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                o.a(inputStream, byteArrayOutputStream);
                this.b.a(byteArrayOutputStream.toByteArray());
                a2.a();
                return;
            } catch (Throwable e32) {
                valueOf = String.valueOf(e32.getMessage());
                aph.a(new StringBuilder((String.valueOf(a).length() + 66) + String.valueOf(valueOf).length()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(a).append(" ").append(valueOf).toString(), e32);
                this.b.a(2, 0);
                a2.a();
                return;
            }
        }
        this.b.a(0, 0);
    }

    boolean a(String str) {
        return this.a.getPackageManager().checkPermission(str, this.a.getPackageName()) == 0;
    }

    boolean b() {
        if (!a("android.permission.INTERNET")) {
            aph.a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else if (a("android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            aph.b("No network connectivity - Offline");
            return false;
        } else {
            aph.a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
    }

    public void run() {
        a();
    }
}
