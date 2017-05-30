package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;

@aaa
public class a
{
  public boolean a(Context paramContext, Intent paramIntent, p paramp)
  {
    try
    {
      String str = String.valueOf(paramIntent.toURI());
      if (str.length() != 0) {}
      for (str = "Launching an intent: ".concat(str);; str = new String("Launching an intent: "))
      {
        abr.e(str);
        u.e().a(paramContext, paramIntent);
        if (paramp == null) {
          break;
        }
        paramp.m();
        break;
      }
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      abr.d(paramContext.getMessage());
      return false;
    }
  }
  
  public boolean a(Context paramContext, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, p paramp)
  {
    if (paramAdLauncherIntentInfoParcel == null)
    {
      abr.d("No intent data for launcher overlay.");
      return false;
    }
    if (paramAdLauncherIntentInfoParcel.i != null) {
      return a(paramContext, paramAdLauncherIntentInfoParcel.i, paramp);
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.c))
    {
      abr.d("Open GMSG did not contain a URL.");
      return false;
    }
    String[] arrayOfString;
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.d))
    {
      localIntent.setDataAndType(Uri.parse(paramAdLauncherIntentInfoParcel.c), paramAdLauncherIntentInfoParcel.d);
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.e)) {
        localIntent.setPackage(paramAdLauncherIntentInfoParcel.e);
      }
      if (TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.f)) {
        break label210;
      }
      arrayOfString = paramAdLauncherIntentInfoParcel.f.split("/", 2);
      if (arrayOfString.length >= 2) {
        break label196;
      }
      paramContext = String.valueOf(paramAdLauncherIntentInfoParcel.f);
      if (paramContext.length() == 0) {
        break label183;
      }
    }
    label183:
    for (paramContext = "Could not parse component name from open GMSG: ".concat(paramContext);; paramContext = new String("Could not parse component name from open GMSG: "))
    {
      abr.d(paramContext);
      return false;
      localIntent.setData(Uri.parse(paramAdLauncherIntentInfoParcel.c));
      break;
    }
    label196:
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    label210:
    paramAdLauncherIntentInfoParcel = paramAdLauncherIntentInfoParcel.g;
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel)) {}
    try
    {
      i = Integer.parseInt(paramAdLauncherIntentInfoParcel);
      localIntent.addFlags(i);
      return a(paramContext, localIntent, paramp);
    }
    catch (NumberFormatException paramAdLauncherIntentInfoParcel)
    {
      for (;;)
      {
        abr.d("Could not parse intent flags.");
        int i = 0;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */