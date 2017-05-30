package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import com.google.firebase.iid.zzb;
import java.util.Iterator;
import java.util.Set;

public class FirebaseMessagingService
  extends zzb
{
  static void a(Bundle paramBundle)
  {
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      if ((str != null) && (str.startsWith("google.c."))) {
        paramBundle.remove();
      }
    }
  }
  
  static boolean b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return false;
    }
    return "1".equals(paramBundle.getString("google.c.a.e"));
  }
  
  private void d(Intent paramIntent)
  {
    PendingIntent localPendingIntent = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
    if (localPendingIntent != null) {}
    try
    {
      localPendingIntent.send();
      if (b(paramIntent.getExtras())) {
        d.b(this, paramIntent);
      }
      return;
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Notification pending intent canceled");
      }
    }
  }
  
  private void e(Intent paramIntent)
  {
    String str2 = paramIntent.getStringExtra("message_type");
    String str1 = str2;
    if (str2 == null) {
      str1 = "gcm";
    }
    int i = -1;
    switch (str1.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        paramIntent = String.valueOf(str1);
        if (paramIntent.length() == 0) {}
        break;
      }
      break;
    }
    for (paramIntent = "Received message with unknown type: ".concat(paramIntent);; paramIntent = new String("Received message with unknown type: "))
    {
      Log.w("FirebaseMessaging", paramIntent);
      return;
      if (!str1.equals("gcm")) {
        break;
      }
      i = 0;
      break;
      if (!str1.equals("deleted_messages")) {
        break;
      }
      i = 1;
      break;
      if (!str1.equals("send_event")) {
        break;
      }
      i = 2;
      break;
      if (!str1.equals("send_error")) {
        break;
      }
      i = 3;
      break;
      if (b(paramIntent.getExtras())) {
        d.a(this, paramIntent);
      }
      f(paramIntent);
      return;
      a();
      return;
      a(paramIntent.getStringExtra("google.message_id"));
      return;
      a(g(paramIntent), new b(paramIntent.getStringExtra("error")));
      return;
    }
  }
  
  private void f(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    localBundle.remove("android.support.content.wakelockid");
    if (c.a(localBundle))
    {
      if (!c.b(this))
      {
        c.a(this).b(localBundle);
        return;
      }
      if (b(localBundle)) {
        d.d(this, paramIntent);
      }
    }
    a(new RemoteMessage(localBundle));
  }
  
  private String g(Intent paramIntent)
  {
    String str2 = paramIntent.getStringExtra("google.message_id");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramIntent.getStringExtra("message_id");
    }
    return str1;
  }
  
  @WorkerThread
  public void a() {}
  
  @WorkerThread
  public void a(RemoteMessage paramRemoteMessage) {}
  
  @WorkerThread
  public void a(String paramString) {}
  
  @WorkerThread
  public void a(String paramString, Exception paramException) {}
  
  public boolean a(Intent paramIntent)
  {
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction()))
    {
      d(paramIntent);
      return true;
    }
    return false;
  }
  
  public void b(Intent paramIntent)
  {
    String str2 = paramIntent.getAction();
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    int i;
    switch (str1.hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label50:
        paramIntent = String.valueOf(paramIntent.getAction());
        if (paramIntent.length() == 0) {}
        break;
      }
      break;
    }
    for (paramIntent = "Unknown intent action: ".concat(paramIntent);; paramIntent = new String("Unknown intent action: "))
    {
      Log.d("FirebaseMessaging", paramIntent);
      do
      {
        return;
        if (!str1.equals("com.google.android.c2dm.intent.RECEIVE")) {
          break;
        }
        i = 0;
        break label50;
        if (!str1.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
          break;
        }
        i = 1;
        break label50;
        e(paramIntent);
        return;
      } while (!b(paramIntent.getExtras()));
      d.c(this, paramIntent);
      return;
    }
  }
  
  protected Intent c(Intent paramIntent)
  {
    return FirebaseInstanceIdInternalReceiver.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/messaging/FirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */