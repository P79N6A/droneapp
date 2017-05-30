package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.TimeUnit;

@aaa
public class abz {
    private final Object a = new Object();
    private String b = "";
    private String c = "";
    private boolean d = false;

    private Uri a(Context context, String str, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        return buildUpon.build();
    }

    private void f(Context context, String str) {
        u.e().a(context, a(context, (String) uf.cE.c(), str));
    }

    public String a() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public String a(Context context) {
        String str;
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                this.b = u.e().b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.b)) {
                    this.b = u.e().c();
                    u.e().b(context, "debug_signals_id.txt", this.b);
                }
            }
            str = this.b;
        }
        return str;
    }

    public void a(Context context, String str) {
        if (c(context, str)) {
            b.a("Device is linked for in app preview.");
        } else {
            f(context, str);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        Builder buildUpon = a(context, (String) uf.cH.c(), str3).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        u.e().a(context, str, buildUpon.build().toString());
    }

    public void a(String str) {
        synchronized (this.a) {
            this.c = str;
        }
    }

    public void a(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public void b(Context context, String str) {
        if (d(context, str)) {
            b.a("Device is linked for debug signals.");
        } else {
            f(context, str);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    boolean c(Context context, String str) {
        Object e = e(context, a(context, (String) uf.cF.c(), str).toString());
        if (TextUtils.isEmpty(e)) {
            b.a("Not linked for in app preview.");
            return false;
        }
        a(e.trim());
        return true;
    }

    boolean d(Context context, String str) {
        Object e = e(context, a(context, (String) uf.cG.c(), str).toString());
        if (TextUtils.isEmpty(e)) {
            b.a("Not linked for debug signals.");
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(e.trim());
        a(parseBoolean);
        return parseBoolean;
    }

    protected String e(Context context, String str) {
        Throwable th;
        String str2;
        String valueOf;
        aco a = new acc(context).a(str, new 1(this, str));
        try {
            return (String) a.get((long) ((Integer) uf.cI.c()).intValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            th = e;
            str2 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            b.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            a.cancel(true);
        } catch (Throwable e2) {
            th = e2;
            str2 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            b.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            a.cancel(true);
        } catch (Throwable e22) {
            th = e22;
            String str3 = "Error retriving a response from: ";
            valueOf = String.valueOf(str);
            b.b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
        }
        return null;
    }
}
