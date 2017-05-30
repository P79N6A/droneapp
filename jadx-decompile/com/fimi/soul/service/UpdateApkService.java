package com.fimi.soul.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.manager.q;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.l;
import com.google.android.gms.drive.e;
import java.io.File;

public class UpdateApkService extends Service {
    private static final int e = 8888;
    private static boolean h = false;
    Handler a = new Handler(this) {
        final /* synthetic */ UpdateApkService a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Toast.makeText(this.a, R.string.down_success, 0).show();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(e.a_);
                intent.setDataAndType(Uri.fromFile(new File(j.i(), a.D)), "application/vnd.android.package-archive");
                this.a.startActivity(intent);
            } else if (message.what == 2) {
                this.a.d.contentView.setProgressBar(R.id.download_bar, 100, Integer.parseInt(message.obj.toString()), false);
                this.a.d.contentView.setTextViewText(R.id.text_download_process, message.obj.toString() + "%");
                this.a.a();
                return;
            } else {
                Toast.makeText(this.a, R.string.down_fail, 0).show();
            }
            this.a.c.cancel(UpdateApkService.e);
            UpdateApkService.h = false;
            this.a.stopSelf();
        }
    };
    private q b;
    private NotificationManager c;
    private Notification d;
    private final int f = 1;
    private final int g = 2;

    public void a() {
        this.c.notify(e, this.d);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.b = q.a((Context) this);
        this.c = (NotificationManager) getSystemService("notification");
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(), 0);
        this.d = new Notification();
        this.d.icon = R.drawable.ic_launcher;
        this.d.tickerText = getString(R.string.down_ing) + getString(R.string.app_name);
        this.d.contentIntent = activity;
        this.d.contentView = new RemoteViews(getPackageName(), R.layout.up_notification);
        this.d.contentView.setProgressBar(R.id.download_bar, 100, 0, false);
        this.d.contentView.setTextViewText(R.id.text_download_title, getString(R.string.down_ing) + " " + getString(R.string.app_name));
        this.d.contentView.setTextViewText(R.id.text_download_process, "0%");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!(intent == null || intent.getStringExtra("down_url") == null)) {
            a();
            if (h) {
                Toast.makeText(this, R.string.apk_downing, 0).show();
            } else {
                new Thread(new l(intent.getStringExtra("down_url"), this.a)).start();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
