package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class i
{
  public int a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return 5;
    }
    paramIntent = paramIntent.getExtras().get("RESPONSE_CODE");
    if (paramIntent == null)
    {
      abr.d("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((paramIntent instanceof Integer)) {
      return ((Integer)paramIntent).intValue();
    }
    if ((paramIntent instanceof Long)) {
      return (int)((Long)paramIntent).longValue();
    }
    paramIntent = String.valueOf(paramIntent.getClass().getName());
    if (paramIntent.length() != 0) {}
    for (paramIntent = "Unexpected type for intent response code. ".concat(paramIntent);; paramIntent = new String("Unexpected type for intent response code. "))
    {
      abr.d(paramIntent);
      return 5;
    }
  }
  
  public int a(Bundle paramBundle)
  {
    paramBundle = paramBundle.get("RESPONSE_CODE");
    if (paramBundle == null)
    {
      abr.d("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((paramBundle instanceof Integer)) {
      return ((Integer)paramBundle).intValue();
    }
    if ((paramBundle instanceof Long)) {
      return (int)((Long)paramBundle).longValue();
    }
    paramBundle = String.valueOf(paramBundle.getClass().getName());
    if (paramBundle.length() != 0) {}
    for (paramBundle = "Unexpected type for intent response code. ".concat(paramBundle);; paramBundle = new String("Unexpected type for intent response code. "))
    {
      abr.d(paramBundle);
      return 5;
    }
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).getString("developerPayload");
      return paramString;
    }
    catch (JSONException paramString)
    {
      abr.d("Fail to parse purchase data");
    }
    return null;
  }
  
  public void a(final Context paramContext)
  {
    ServiceConnection local1 = new ServiceConnection()
    {
      public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        boolean bool = false;
        paramAnonymousComponentName = new b(paramContext.getApplicationContext(), false);
        paramAnonymousComponentName.a(paramAnonymousIBinder);
        int i = paramAnonymousComponentName.a(3, paramContext.getPackageName(), "inapp");
        paramAnonymousIBinder = u.i();
        if (i == 0) {
          bool = true;
        }
        paramAnonymousIBinder.d(bool);
        paramContext.unbindService(this);
        paramAnonymousComponentName.a();
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName) {}
    };
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    paramContext.bindService(localIntent, local1, 1);
  }
  
  public void a(Context paramContext, boolean paramBoolean, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", paramBoolean);
    GInAppPurchaseManagerInfoParcel.a(localIntent, paramGInAppPurchaseManagerInfoParcel);
    u.e().a(paramContext, localIntent);
  }
  
  public String b(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
  }
  
  public String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).getString("purchaseToken");
      return paramString;
    }
    catch (JSONException paramString)
    {
      abr.d("Fail to parse purchase data");
    }
    return null;
  }
  
  public String c(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */