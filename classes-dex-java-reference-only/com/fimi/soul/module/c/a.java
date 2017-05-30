package com.fimi.soul.module.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class a
{
  public static boolean a(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo();
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        if (paramContext[i].getState() == NetworkInfo.State.CONNECTED) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getType() == 0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */