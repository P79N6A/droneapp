package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb
  extends Service
{
  MessengerCompat a = new MessengerCompat(new Handler(Looper.getMainLooper())
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      int i = MessengerCompat.a(paramAnonymousMessage);
      e.a(zzb.this);
      zzb.this.getPackageManager();
      if ((i != e.c) && (i != e.b))
      {
        int j = e.b;
        int k = e.c;
        Log.w("FirebaseInstanceId", 77 + "Message from unexpected caller " + i + " mine=" + j + " appid=" + k);
        return;
      }
      zzb.this.b((Intent)paramAnonymousMessage.obj);
    }
  });
  @VisibleForTesting
  final ExecutorService b = Executors.newSingleThreadExecutor();
  private final Object c = new Object();
  private int d;
  private int e = 0;
  
  private void d(Intent arg1)
  {
    if (??? != null) {
      WakefulBroadcastReceiver.completeWakefulIntent(???);
    }
    synchronized (this.c)
    {
      this.e -= 1;
      if (this.e == 0) {
        b(this.d);
      }
      return;
    }
  }
  
  public boolean a(Intent paramIntent)
  {
    return false;
  }
  
  public abstract void b(Intent paramIntent);
  
  boolean b(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  protected abstract Intent c(Intent paramIntent);
  
  public final IBinder onBind(Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.google.firebase.INSTANCE_ID_EVENT".equals(paramIntent.getAction()))) {
      return this.a.a();
    }
    return null;
  }
  
  public final int onStartCommand(final Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (this.c)
    {
      this.d = paramInt2;
      this.e += 1;
      ??? = c(paramIntent);
      if (??? == null)
      {
        d(paramIntent);
        return 2;
      }
    }
    if (a((Intent)???))
    {
      d(paramIntent);
      return 2;
    }
    this.b.execute(new Runnable()
    {
      public void run()
      {
        zzb.this.b(localObject);
        zzb.a(zzb.this, paramIntent);
      }
    });
    return 3;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */