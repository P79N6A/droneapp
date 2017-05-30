package com.fimi.soul.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public abstract class NetworkStateReceiver
  extends BroadcastReceiver
{
  public static final String a = "android.net.conn.CONNECTIVITY_CHANGE";
  
  private boolean a(NetworkInfo.State paramState)
  {
    return (paramState != null) && (NetworkInfo.State.CONNECTED == paramState);
  }
  
  public abstract void a(a parama, Context paramContext);
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      paramIntent = ((ConnectivityManager)localObject).getNetworkInfo(1).getState();
      if (((ConnectivityManager)localObject).getNetworkInfo(0) != null) {}
    }
    else
    {
      return;
    }
    Object localObject = ((ConnectivityManager)localObject).getNetworkInfo(0).getState();
    if (a(paramIntent))
    {
      a(a.a, paramContext);
      return;
    }
    if (a((NetworkInfo.State)localObject))
    {
      a(a.b, paramContext);
      return;
    }
    a(a.c, paramContext);
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/receiver/NetworkStateReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */