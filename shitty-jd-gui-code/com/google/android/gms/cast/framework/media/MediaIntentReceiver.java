package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.k;

public class MediaIntentReceiver
  extends BroadcastReceiver
{
  public static final String a = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
  public static final String b = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
  public static final String c = "com.google.android.gms.cast.framework.action.SKIP_PREV";
  public static final String d = "com.google.android.gms.cast.framework.action.FORWARD";
  public static final String e = "com.google.android.gms.cast.framework.action.REWIND";
  public static final String f = "com.google.android.gms.cast.framework.action.STOP_CASTING";
  public static final String g = "com.google.android.gms.cast.framework.action.DISCONNECT";
  public static final String h = "googlecast-extra_skip_step_ms";
  
  private void a(d paramd)
  {
    paramd = b(paramd);
    if (paramd == null) {
      return;
    }
    paramd.s();
  }
  
  private void a(d paramd, long paramLong)
  {
    if (paramLong == 0L) {}
    do
    {
      return;
      paramd = b(paramd);
    } while ((paramd == null) || (paramd.k()) || (paramd.u()));
    paramd.a(paramd.e() + paramLong);
  }
  
  private c b(d paramd)
  {
    if ((paramd == null) || (!paramd.o())) {
      return null;
    }
    return paramd.a();
  }
  
  protected void a(j paramj)
  {
    if ((paramj instanceof d)) {
      a((d)paramj);
    }
  }
  
  protected void a(j paramj, long paramLong)
  {
    if ((paramj instanceof d)) {
      a((d)paramj, paramLong);
    }
  }
  
  protected void a(j paramj, Intent paramIntent)
  {
    if ((!(paramj instanceof d)) || (!paramIntent.hasExtra("android.intent.extra.KEY_EVENT"))) {}
    do
    {
      return;
      paramIntent = (KeyEvent)paramIntent.getExtras().get("android.intent.extra.KEY_EVENT");
    } while ((paramIntent == null) || (paramIntent.getAction() != 0) || (paramIntent.getKeyCode() != 85));
    a((d)paramj);
  }
  
  protected void a(String paramString, Intent paramIntent) {}
  
  protected void b(j paramj)
  {
    if ((paramj instanceof d))
    {
      paramj = b((d)paramj);
      if ((paramj != null) && (!paramj.u())) {}
    }
    else
    {
      return;
    }
    paramj.e(null);
  }
  
  protected void b(j paramj, long paramLong)
  {
    if ((paramj instanceof d)) {
      a((d)paramj, -paramLong);
    }
  }
  
  protected void c(j paramj)
  {
    if ((paramj instanceof d))
    {
      paramj = b((d)paramj);
      if ((paramj != null) && (!paramj.u())) {}
    }
    else
    {
      return;
    }
    paramj.d(null);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if (str == null) {
      return;
    }
    paramContext = com.google.android.gms.cast.framework.c.a(paramContext).b();
    int i = -1;
    switch (str.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        a(str, paramIntent);
        return;
        if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"))
        {
          i = 0;
          continue;
          if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT"))
          {
            i = 1;
            continue;
            if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV"))
            {
              i = 2;
              continue;
              if (str.equals("com.google.android.gms.cast.framework.action.FORWARD"))
              {
                i = 3;
                continue;
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND"))
                {
                  i = 4;
                  continue;
                  if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING"))
                  {
                    i = 5;
                    continue;
                    if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT"))
                    {
                      i = 6;
                      continue;
                      if (str.equals("android.intent.action.MEDIA_BUTTON")) {
                        i = 7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    a(paramContext.a());
    return;
    b(paramContext.a());
    return;
    c(paramContext.a());
    return;
    long l = paramIntent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
    a(paramContext.a(), l);
    return;
    l = paramIntent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
    b(paramContext.a(), l);
    return;
    paramContext.a(true);
    return;
    paramContext.a(false);
    return;
    a(paramContext.a(), paramIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/MediaIntentReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */