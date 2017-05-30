package com.fimi.kernel.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class z
{
  public static final int a = 0;
  public static int b = 1;
  public static int c = 0;
  private static Context d = null;
  private static Toast e;
  private static Handler f = null;
  private static Runnable g = new Runnable()
  {
    public void run()
    {
      z.a().cancel();
    }
  };
  private static Handler h = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      z.a(z.b(), paramAnonymousMessage.getData().getString("TEXT"), 1000);
    }
  };
  
  public static void a(Context paramContext, int paramInt)
  {
    d = paramContext;
    Toast.makeText(paramContext, "" + paramContext.getResources().getText(paramInt), 0).show();
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2)
  {
    a(paramContext, paramContext.getResources().getString(paramInt1), paramInt2);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    d = paramContext;
    if (!n.b(paramString)) {
      Toast.makeText(paramContext, paramString, 0).show();
    }
  }
  
  public static void a(Context paramContext, String paramString, int paramInt)
  {
    if (paramContext == null) {
      return;
    }
    f = new Handler(paramContext.getMainLooper());
    f.removeCallbacks(g);
    if (e != null)
    {
      e.setText(paramString);
      if (1 != paramInt) {
        break label94;
      }
      f.postDelayed(g, 3500L);
    }
    for (;;)
    {
      e.show();
      return;
      if (paramInt == 0)
      {
        e = Toast.makeText(paramContext, paramString, 0);
        break;
      }
      e = Toast.makeText(paramContext, paramString, 1);
      break;
      label94:
      if (paramInt == 0) {
        f.postDelayed(g, 2000L);
      } else {
        f.postDelayed(g, paramInt);
      }
    }
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    d = paramContext;
    Message localMessage = h.obtainMessage(0);
    Bundle localBundle = new Bundle();
    if ((paramContext == null) || (localBundle == null)) {
      return;
    }
    localBundle.putString("TEXT", paramContext.getResources().getString(paramInt));
    localMessage.setData(localBundle);
    h.sendMessage(localMessage);
  }
  
  public static void b(Context paramContext, String paramString)
  {
    d = paramContext;
    paramContext = h.obtainMessage(0);
    Bundle localBundle = new Bundle();
    localBundle.putString("TEXT", paramString);
    paramContext.setData(localBundle);
    h.sendMessage(paramContext);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */