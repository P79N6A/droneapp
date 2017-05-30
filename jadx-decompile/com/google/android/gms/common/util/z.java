package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.internal.ajp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class z {
    private static final Method a = a();
    private static final Method b = b();
    private static final Method c = c();
    private static final Method d = d();
    private static final Method e = e();

    public static int a(WorkSource workSource) {
        if (c != null) {
            try {
                return ((Integer) c.invoke(workSource, new Object[0])).intValue();
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    public static WorkSource a(int i, String str) {
        WorkSource workSource = new WorkSource();
        a(workSource, i, str);
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (context == null || context.getPackageManager() == null) {
            return null;
        }
        String str2;
        String str3;
        String valueOf;
        try {
            ApplicationInfo a = ajp.b(context).a(str, 0);
            if (a != null) {
                return a(a.uid, str);
            }
            str2 = "WorkSourceUtil";
            str3 = "Could not get applicationInfo from package: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        } catch (NameNotFoundException e) {
            str2 = "WorkSourceUtil";
            str3 = "Could not find package: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
    }

    public static String a(WorkSource workSource, int i) {
        if (e != null) {
            try {
                return (String) e.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    private static Method a() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod(b.c, new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    public static void a(WorkSource workSource, int i, String str) {
        if (b != null) {
            if (str == null) {
                str = "";
            }
            try {
                b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Throwable e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (a != null) {
            try {
                a.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || ajp.b(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static Method b() {
        Method method = null;
        if (s.g()) {
            try {
                method = WorkSource.class.getMethod(b.c, new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
            }
        }
        return method;
    }

    public static List<String> b(WorkSource workSource) {
        int i = 0;
        int a = workSource == null ? 0 : a(workSource);
        if (a == 0) {
            return Collections.EMPTY_LIST;
        }
        List<String> arrayList = new ArrayList();
        while (i < a) {
            String a2 = a(workSource, i);
            if (!w.a(a2)) {
                arrayList.add(a2);
            }
            i++;
        }
        return arrayList;
    }

    private static Method c() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e) {
        }
        return method;
    }

    private static Method d() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    private static Method e() {
        Method method = null;
        if (s.g()) {
            try {
                method = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception e) {
            }
        }
        return method;
    }
}
