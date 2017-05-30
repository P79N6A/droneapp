package com.fimi.soul.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.fimi.soul.biz.manager.q;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.l;
import java.io.File;

public class UpdateApkService
  extends Service
{
  private static final int e = 8888;
  private static boolean h = false;
  Handler a = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 1)
      {
        Toast.makeText(UpdateApkService.this, 2131362160, 0).show();
        paramAnonymousMessage = new Intent("android.intent.action.VIEW");
        paramAnonymousMessage.setFlags(268435456);
        paramAnonymousMessage.setDataAndType(Uri.fromFile(new File(j.i(), "temp_update.apk")), "application/vnd.android.package-archive");
        UpdateApkService.this.startActivity(paramAnonymousMessage);
      }
      for (;;)
      {
        UpdateApkService.b(UpdateApkService.this).cancel(8888);
        UpdateApkService.a(false);
        UpdateApkService.this.stopSelf();
        return;
        if (paramAnonymousMessage.what == 2)
        {
          UpdateApkService.a(UpdateApkService.this).contentView.setProgressBar(2131690606, 100, Integer.parseInt(paramAnonymousMessage.obj.toString()), false);
          UpdateApkService.a(UpdateApkService.this).contentView.setTextViewText(2131690604, paramAnonymousMessage.obj.toString() + "%");
          UpdateApkService.this.a();
          return;
        }
        Toast.makeText(UpdateApkService.this, 2131362154, 0).show();
      }
    }
  };
  private q b;
  private NotificationManager c;
  private Notification d;
  private final int f = 1;
  private final int g = 2;
  
  public void a()
  {
    this.c.notify(8888, this.d);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.b = q.a(this);
    this.c = ((NotificationManager)getSystemService("notification"));
    PendingIntent localPendingIntent = PendingIntent.getActivity(this, 0, new Intent(), 0);
    this.d = new Notification();
    this.d.icon = 2130838024;
    this.d.tickerText = (getString(2131362157) + getString(2131361971));
    this.d.contentIntent = localPendingIntent;
    this.d.contentView = new RemoteViews(getPackageName(), 2130968797);
    this.d.contentView.setProgressBar(2131690606, 100, 0, false);
    this.d.contentView.setTextViewText(2131690605, getString(2131362157) + " " + getString(2131361971));
    this.d.contentView.setTextViewText(2131690604, "0%");
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if ((paramIntent != null) && (paramIntent.getStringExtra("down_url") != null))
    {
      a();
      if (h) {
        break label58;
      }
      new Thread(new l(paramIntent.getStringExtra("down_url"), this.a)).start();
    }
    for (;;)
    {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
      label58:
      Toast.makeText(this, 2131361970, 0).show();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/UpdateApkService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */