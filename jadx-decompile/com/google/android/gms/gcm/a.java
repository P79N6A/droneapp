package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static a d;
    private Context e;
    private final PendingIntent f = PendingIntent.getBroadcast(this.e, 0, new Intent(), 0);

    private a(Context context) {
        this.e = context;
    }

    private Intent a() {
        String b = c.b(this.e);
        int i = -1;
        if (b != null) {
            i = c.c(this.e);
        }
        if (b == null || i < c.a) {
            Log.e("GcmNetworkManager", "Google Play Services is not available, dropping GcmNetworkManager request. code=" + i);
            return null;
        }
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage(b);
        intent.putExtra("app", this.f);
        return intent;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (d == null) {
                d = new a(context.getApplicationContext());
            }
            aVar = d;
        }
        return aVar;
    }

    private void a(ComponentName componentName) {
        b(componentName.getClassName());
        Intent a = a();
        if (a != null) {
            a.putExtra("scheduler_action", "CANCEL_ALL");
            a.putExtra("component", componentName);
            this.e.sendBroadcast(a);
        }
    }

    static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    private void a(String str, ComponentName componentName) {
        a(str);
        b(componentName.getClassName());
        Intent a = a();
        if (a != null) {
            a.putExtra("scheduler_action", "CANCEL_TASK");
            a.putExtra("tag", str);
            a.putExtra("component", componentName);
            this.e.sendBroadcast(a);
        }
    }

    private void b(String str) {
        boolean z = true;
        d.a(str, "GcmTaskService must not be null.");
        Intent intent = new Intent(GcmTaskService.b);
        intent.setPackage(this.e.getPackageName());
        List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        boolean z2 = (queryIntentServices == null || queryIntentServices.size() == 0) ? false : true;
        d.b(z2, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo.name.equals(str)) {
                break;
            }
        }
        z = false;
        d.b(z, new StringBuilder(String.valueOf(str).length() + Opcodes.DNEG).append("The GcmTaskService class you provided ").append(str).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
    }

    public void a(Task task) {
        b(task.c());
        Intent a = a();
        if (a != null) {
            Bundle extras = a.getExtras();
            extras.putString("scheduler_action", "SCHEDULE_TASK");
            task.a(extras);
            a.putExtras(extras);
            this.e.sendBroadcast(a);
        }
    }

    public void a(Class<? extends GcmTaskService> cls) {
        b((Class) cls);
    }

    public void a(String str, Class<? extends GcmTaskService> cls) {
        b(str, cls);
    }

    public void b(Class<? extends Service> cls) {
        a(new ComponentName(this.e, cls));
    }

    public void b(String str, Class<? extends Service> cls) {
        a(str, new ComponentName(this.e, cls));
    }
}
