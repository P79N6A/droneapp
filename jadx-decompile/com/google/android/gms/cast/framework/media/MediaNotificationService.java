package com.google.android.gms.cast.framework.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public class MediaNotificationService extends Service {
    public static final String a = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
    private static final m b = new m("MediaNotificationService");
    private f c;

    public IBinder onBind(Intent intent) {
        try {
            return this.c.a(intent);
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onBind", f.class.getSimpleName());
            return null;
        }
    }

    public void onCreate() {
        this.c = afc.a((Service) this, c.a((Context) this).f(), f.a(null), c.a((Context) this).a().g());
        try {
            this.c.a();
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onCreate", f.class.getSimpleName());
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.c.b();
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onDestroy", f.class.getSimpleName());
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 1;
        try {
            i3 = this.c.a(intent, i, i2);
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onStartCommand", f.class.getSimpleName());
        }
        return i3;
    }
}
