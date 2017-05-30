package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.s;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
  extends l
{
  public static final String a = "GooglePlayServicesErrorDialog";
  @Deprecated
  public static final int b = l.e;
  @Deprecated
  public static final String c = "com.google.android.gms";
  public static final String d = "com.android.vending";
  
  @Deprecated
  public static int a(Context paramContext)
  {
    return l.e(paramContext);
  }
  
  @Deprecated
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return a(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i = paramInt1;
    if (a(paramActivity, paramInt1)) {
      i = 18;
    }
    return b.a().a(paramActivity, i, paramInt2, paramOnCancelListener);
  }
  
  @Deprecated
  public static PendingIntent a(int paramInt1, Context paramContext, int paramInt2)
  {
    return l.b(paramInt1, paramContext, paramInt2);
  }
  
  @Deprecated
  public static String a(int paramInt)
  {
    return l.d(paramInt);
  }
  
  @Deprecated
  public static void a(int paramInt, Context paramContext)
  {
    int i = paramInt;
    if (i.a(paramContext))
    {
      i = paramInt;
      if (paramInt == 2) {
        i = 42;
      }
    }
    if ((a(paramContext, i)) || (b(paramContext, i)))
    {
      o(paramContext);
      return;
    }
    c(i, paramContext);
  }
  
  static void a(int paramInt, Context paramContext, PendingIntent paramPendingIntent)
  {
    a(paramInt, paramContext, null, paramPendingIntent);
  }
  
  private static void a(int paramInt, Context paramContext, String paramString)
  {
    a(paramInt, paramContext, paramString, b.a().a(paramContext, paramInt, 0, "n"));
  }
  
  @TargetApi(20)
  private static void a(int paramInt, Context paramContext, String paramString, PendingIntent paramPendingIntent)
  {
    Object localObject = paramContext.getResources();
    String str2 = t.b(paramContext, paramInt);
    String str1 = t.d(paramContext, paramInt);
    if (i.a(paramContext))
    {
      d.a(s.e());
      paramPendingIntent = new Notification.Builder(paramContext).setSmallIcon(R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(String.valueOf(str2).length() + 1 + String.valueOf(str1).length() + str2 + " " + str1)).addAction(R.drawable.common_full_open_on_phone, ((Resources)localObject).getString(R.string.common_open_on_phone), paramPendingIntent).build();
      if (!f(paramInt)) {
        break label342;
      }
      k.set(false);
    }
    label342:
    for (paramInt = 10436;; paramInt = 39789)
    {
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      if (paramString == null) {
        break label349;
      }
      paramContext.notify(paramString, paramInt, paramPendingIntent);
      return;
      localObject = ((Resources)localObject).getString(R.string.common_google_play_services_notification_ticker);
      if (s.a())
      {
        paramPendingIntent = new Notification.Builder(paramContext).setSmallIcon(17301642).setContentTitle(str2).setContentText(str1).setContentIntent(paramPendingIntent).setTicker((CharSequence)localObject).setAutoCancel(true);
        if (s.i()) {
          paramPendingIntent.setLocalOnly(true);
        }
        if (s.e()) {
          paramPendingIntent.setStyle(new Notification.BigTextStyle().bigText(str1));
        }
        for (paramPendingIntent = paramPendingIntent.build();; paramPendingIntent = paramPendingIntent.getNotification())
        {
          if (Build.VERSION.SDK_INT == 19) {
            paramPendingIntent.extras.putBoolean("android.support.localOnly", true);
          }
          break;
        }
      }
      paramPendingIntent = new NotificationCompat.Builder(paramContext).setSmallIcon(17301642).setTicker((CharSequence)localObject).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(paramPendingIntent).setContentTitle(str2).setContentText(str1).build();
      break;
    }
    label349:
    paramContext.notify(paramInt, paramPendingIntent);
  }
  
  public static boolean a(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i = paramInt1;
    if (a(paramActivity, paramInt1)) {
      i = 18;
    }
    b localb = b.a();
    if (paramFragment == null) {
      return localb.b(paramActivity, i, paramInt2, paramOnCancelListener);
    }
    paramFragment = localb.a(paramActivity, i, u.a(paramFragment, b.a().a(paramActivity, i, "d"), paramInt2), paramOnCancelListener);
    if (paramFragment == null) {
      return false;
    }
    localb.a(paramActivity, paramFragment, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  @Deprecated
  public static boolean a(Context paramContext, int paramInt)
  {
    return l.d(paramContext, paramInt);
  }
  
  @Deprecated
  public static Intent b(int paramInt)
  {
    return l.e(paramInt);
  }
  
  @Deprecated
  public static String b(Context paramContext)
  {
    return l.j(paramContext);
  }
  
  @Deprecated
  public static boolean b(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return b(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static boolean b(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  @Deprecated
  public static boolean b(Context paramContext, int paramInt)
  {
    return l.e(paramContext, paramInt);
  }
  
  public static Resources c(Context paramContext)
  {
    return l.k(paramContext);
  }
  
  private static void c(int paramInt, Context paramContext)
  {
    a(paramInt, paramContext, null);
  }
  
  @Deprecated
  public static boolean c(int paramInt)
  {
    return l.g(paramInt);
  }
  
  public static Context d(Context paramContext)
  {
    return l.l(paramContext);
  }
  
  private static void o(Context paramContext)
  {
    paramContext = new a(paramContext);
    paramContext.sendMessageDelayed(paramContext.obtainMessage(1), 120000L);
  }
  
  private static class a
    extends Handler
  {
    private final Context a;
    
    a(Context paramContext) {}
    
    public void handleMessage(Message paramMessage)
    {
      int i;
      switch (paramMessage.what)
      {
      default: 
        i = paramMessage.what;
        Log.w("GooglePlayServicesUtil", 50 + "Don't know how to handle this message: " + i);
      }
      do
      {
        return;
        i = e.a(this.a);
      } while (!e.c(i));
      e.b(i, this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */