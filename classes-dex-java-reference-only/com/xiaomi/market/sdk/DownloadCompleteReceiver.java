package com.xiaomi.market.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class DownloadCompleteReceiver
  extends BroadcastReceiver
{
  private static final String TAG = "MarketSDKDownloadReceiver";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    long l;
    if ("android.intent.action.DOWNLOAD_COMPLETE".equals(paramIntent.getAction()))
    {
      l = paramIntent.getLongExtra("extra_download_id", -1L);
      Log.d("MarketSDKDownloadReceiver", "on sdk download complete : id = " + l);
      if (l != -1L) {}
    }
    else
    {
      return;
    }
    m.i(paramContext).a(l);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/market/sdk/DownloadCompleteReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */