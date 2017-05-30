package com.fimi.soul.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.manager.u;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.droneconnection.connection.f.b;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.i;
import com.fimi.soul.utils.x;
import com.tencent.mm.sdk.platformtools.SystemProperty;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DroidPlannerApp extends ErrorReportApp implements b {
    static DroidPlannerApp e = null;
    private static HashMap i = new HashMap();
    public a a;
    public com.fimi.soul.drone.a.a b;
    public boolean c = true;
    public com.fimi.soul.drone.droneconnection.connection.service.a d;
    private v f = null;
    private List<Activity> g = new LinkedList();
    private List<Activity> h = new ArrayList();

    public static HashMap<String, String> c() {
        return i;
    }

    public static Context g() {
        return e;
    }

    private void h() {
        boolean equals = "1".equals(SystemProperty.getProperty("ro.kernel.qemu"));
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0 || Debug.isDebuggerConnected() || equals) {
            Process.killProcess(Process.myPid());
        }
    }

    private void i() {
        new u(g()).a();
    }

    private boolean j() {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        String packageName = getPackageName();
        int myPid = Process.myPid();
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        SharedPreferences a = v.a((Context) this).a();
        com.fimi.soul.biz.n.a a2 = com.fimi.soul.biz.n.a.a();
        if (a.getBoolean(c.bN, false)) {
            a2.a(false);
        } else {
            a2.a(true);
        }
    }

    public void a() {
        if (this.h != null && this.h.size() > 0) {
            for (Activity finish : this.h) {
                finish.finish();
            }
            this.h.clear();
        }
    }

    public void a(Activity activity) {
        this.h.add(activity);
    }

    public void a(com.fimi.soul.drone.c.a.b bVar) {
        this.b.a(bVar);
    }

    public void a(boolean z) {
        a aVar = this.a;
        boolean z2 = z || this.a.K().a() > (byte) 5;
        aVar.b(z2);
    }

    public void b() {
        if (this.g != null && this.g.size() > 0) {
            this.g.clear();
        }
    }

    public void b(Activity activity) {
        this.g.add(activity);
    }

    public void b(boolean z) {
        this.a.a(z);
        if (!z) {
            this.a.b(false);
            this.a.a(d.a.CLEANALLOBJ);
        }
    }

    public void d() {
        try {
            for (Activity activity : this.g) {
                if (activity != null) {
                    activity.finish();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void e() {
        this.a.a(d.a.CONNECTSUCESS);
    }

    public void f() {
        this.a.K().a((byte) 0);
        this.a.b(false);
        this.a.a(d.a.CLEANALLOBJ);
    }

    public void onCreate() {
        super.onCreate();
        i.a(this);
        e = this;
        this.d = new com.fimi.soul.drone.droneconnection.connection.service.a(this, this);
        NetUtil.a();
        this.f = v.a((Context) this);
        this.a = new a(this.d, this, new Handler());
        this.b = new com.fimi.soul.drone.a.a(this.a, g());
        if (j() && this.f.a().contains("isfirstloading")) {
            MiPushClient.registerPush(this, "2882303761517518920", a.r);
        }
        Logger.setLogger(this, new LoggerInterface(this) {
            final /* synthetic */ DroidPlannerApp a;

            {
                this.a = r1;
            }

            public void log(String str) {
                Log.d(a.d, str);
            }

            public void log(String str, Throwable th) {
                Log.d(a.d, str, th);
            }

            public void setTag(String str) {
            }
        });
        MiStatInterface.initialize(this, "2882303761517518920", a.r, "Xiao Mi");
        MiStatInterface.setUploadPolicy(3, 0);
        MiStatInterface.enableExceptionCatcher(false);
        i();
        com.fimi.soul.biz.camera.b.a(this);
        x.a();
        k();
    }

    public void onTerminate() {
        super.onTerminate();
        x.b();
    }
}
