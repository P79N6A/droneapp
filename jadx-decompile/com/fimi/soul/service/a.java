package com.fimi.soul.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.fimi.soul.service.CameraSocketService.b;
import com.fimi.soul.service.CameraSocketService.c;
import com.fimi.soul.service.CameraSocketService.h;

public class a {
    private static CameraSocketService a = null;
    private static a b;
    private static h e;
    private boolean c = false;
    private Context d;
    private ServiceConnection f = new ServiceConnection(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.fimi.soul.base.a.a("onServiceConnected", CameraSocketService.class);
            a.a = ((c) iBinder).a();
            a.a.a(a.e);
            a.a.e();
            if (a.e != null) {
                a.e.a(1, true, "onServiceConnected");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            com.fimi.soul.base.a.a("onServiceDisconnected", CameraSocketService.class);
            a.a = null;
        }
    };

    public a(Context context) {
        this.d = context;
    }

    public static a a(Context context) {
        if (b == null) {
            b = new a(context);
        }
        if (a == null) {
            b.c();
        } else if (!a.g()) {
            a.e();
        }
        return b;
    }

    public void a() {
        if (a != null) {
            a.b();
        }
    }

    public void a(h hVar) {
        e = hVar;
        if (a != null) {
            a.a(e);
        }
    }

    public void a(String str, String str2) {
        a.a(str, str2);
    }

    public b b() {
        return a.c();
    }

    public synchronized void c() {
        if (!this.c) {
            this.c = true;
            Intent intent = new Intent();
            intent.setClass(this.d, CameraSocketService.class);
            this.d.getApplicationContext().bindService(intent, this.f, 1);
        }
    }

    public synchronized void d() {
        if (this.c) {
            this.c = false;
            new Intent().setClass(this.d, CameraSocketService.class);
            this.d.getApplicationContext().unbindService(this.f);
            a.d();
            a.onDestroy();
            a = null;
            b = null;
        }
    }

    public void e() {
        a.a();
    }

    public String f() {
        return a == null ? null : a.f();
    }

    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        if (a == null || !h()) {
            return null;
        }
        stringBuffer.append("rtsp://");
        stringBuffer.append(a.f());
        stringBuffer.append("/media/stream1");
        return stringBuffer.toString();
    }

    public boolean h() {
        return a == null ? false : a.g();
    }

    public void i() {
        if (a != null) {
            a.e();
        }
    }
}
