package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ajp;

public class m {
    private static m a;
    private final Context b;

    private m(Context context) {
        this.b = context.getApplicationContext();
    }

    public static m a(Context context) {
        d.a((Object) context);
        synchronized (m.class) {
            if (a == null) {
                k.a(context);
                a = new m(context);
            }
        }
        return a;
    }

    private boolean b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        a bVar = new b(packageInfo.signatures[0].toByteArray());
        for (ae equals : z ? k.a() : k.b()) {
            if (bVar.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    a a(PackageInfo packageInfo, a... aVarArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        b bVar = new b(packageInfo.signatures[0].toByteArray());
        while (i < aVarArr.length) {
            if (aVarArr[i].equals(bVar)) {
                return aVarArr[i];
            }
            i++;
        }
        return null;
    }

    public boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            a a;
            if (z) {
                a = a(packageInfo, d.a);
            } else {
                a = a(packageInfo, d.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (l.h(this.b)) {
            return b(packageInfo, true);
        }
        boolean b = b(packageInfo, false);
        if (b || !b(packageInfo, true)) {
            return b;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return b;
    }

    public boolean a(PackageManager packageManager, String str) {
        try {
            return a(packageManager, ajp.b(this.b).b(str, 64));
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public boolean b(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (!a(packageInfo, true)) {
            return false;
        }
        if (l.h(this.b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }
}
