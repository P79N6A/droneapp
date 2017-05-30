package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.android.volley.g;
import com.android.volley.o;
import java.io.File;

public class t {
    private static final String a = "volley";

    public static o a(Context context) {
        return a(context, null);
    }

    public static o a(Context context, int i) {
        return a(context, null, i);
    }

    public static o a(Context context, i iVar) {
        return a(context, iVar, -1);
    }

    public static o a(Context context, i iVar, int i) {
        File file = new File(context.getCacheDir(), a);
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (NameNotFoundException e) {
        }
        if (iVar == null) {
            iVar = VERSION.SDK_INT >= 9 ? new j() : new g(AndroidHttpClient.newInstance(str));
        }
        g cVar = new c(iVar);
        o oVar = i <= -1 ? new o(new f(file), cVar) : new o(new f(file, i), cVar);
        oVar.a();
        return oVar;
    }
}
