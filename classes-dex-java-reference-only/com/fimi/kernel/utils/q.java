package com.fimi.kernel.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.List;

public class q
{
  public static ScanResult a(Context paramContext, String paramString)
  {
    Object localObject = (WifiManager)paramContext.getSystemService("wifi");
    if (!((WifiManager)localObject).startScan()) {
      a(paramContext, paramString);
    }
    localObject = ((WifiManager)localObject).getScanResults();
    if (localObject != null)
    {
      paramContext = null;
      int i = 0;
      for (;;)
      {
        if (i < ((List)localObject).size())
        {
          paramContext = (ScanResult)((List)localObject).get(i);
          if (!paramContext.BSSID.equals(paramString)) {}
        }
        else
        {
          return paramContext;
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramBoolean)
    {
      paramContext.setWifiEnabled(true);
      return;
    }
    paramContext.setWifiEnabled(false);
  }
  
  public static boolean a(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    return ((localConnectivityManager.getActiveNetworkInfo() != null) && (localConnectivityManager.getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED)) || (paramContext.getNetworkType() == 3);
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getType() == 1);
  }
  
  public static List<ScanResult> c(Context paramContext)
  {
    WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
    if (!localWifiManager.startScan())
    {
      c(paramContext);
      return null;
    }
    return localWifiManager.getScanResults();
  }
  
  public static WifiInfo d(Context paramContext)
  {
    return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */