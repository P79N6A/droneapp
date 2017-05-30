package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import java.util.List;

public final class b
  extends j
{
  public static final String a = "com.google";
  public static final String b = "com.google.work";
  public static final String c = "suppressProgressScreen";
  public static final String d = j.m;
  public static final String e = j.n;
  public static final int f = 1;
  public static final int g = 2;
  public static final int h = 3;
  public static final int i = 4;
  
  @TargetApi(23)
  public static Bundle a(Context paramContext, Account paramAccount)
  {
    return j.b(paramContext, paramAccount);
  }
  
  public static String a(Context paramContext, Account paramAccount, String paramString)
  {
    return j.b(paramContext, paramAccount, paramString);
  }
  
  public static String a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return b(paramContext, paramAccount, paramString, paramBundle).a();
  }
  
  public static String a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle, Intent paramIntent)
  {
    a(paramIntent);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putParcelable("callback_intent", paramIntent);
    localBundle.putBoolean("handle_notification", true);
    return g(paramContext, paramAccount, paramString, localBundle).a();
  }
  
  public static String a(Context paramContext, Account paramAccount, String paramString1, Bundle paramBundle1, String paramString2, Bundle paramBundle2)
  {
    com.google.android.gms.common.internal.d.a(paramString2, "Authority cannot be empty or null.");
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    paramBundle1 = paramBundle2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    }
    ContentResolver.validateSyncExtrasBundle(paramBundle1);
    localBundle.putString("authority", paramString2);
    localBundle.putBundle("sync_extras", paramBundle1);
    localBundle.putBoolean("handle_notification", true);
    return g(paramContext, paramAccount, paramString1, localBundle).a();
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return j.b(paramContext, paramString1, paramString2);
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, paramBundle);
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, Intent paramIntent)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, paramBundle, paramIntent);
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle1, String paramString3, Bundle paramBundle2)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, paramBundle1, paramString3, paramBundle2);
  }
  
  public static List<AccountChangeEvent> a(Context paramContext, int paramInt, String paramString)
  {
    return j.b(paramContext, paramInt, paramString);
  }
  
  @Deprecated
  @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
  public static void a(Context paramContext, String paramString)
  {
    j.d(paramContext, paramString);
  }
  
  public static TokenData b(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putBoolean("handle_notification", true);
    return g(paramContext, paramAccount, paramString, localBundle);
  }
  
  @Deprecated
  public static String b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    return j.c(paramContext, paramString1, paramString2, paramBundle);
  }
  
  public static void b(Context paramContext, String paramString)
  {
    j.e(paramContext, paramString);
  }
  
  public static String c(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return j.e(paramContext, paramAccount, paramString, paramBundle);
  }
  
  public static String c(Context paramContext, String paramString)
  {
    return j.f(paramContext, paramString);
  }
  
  public static TokenData d(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return j.f(paramContext, paramAccount, paramString, paramBundle);
  }
  
  private static TokenData g(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    try
    {
      paramAccount = d(paramContext, paramAccount, paramString, localBundle);
      com.google.android.gms.common.e.i(paramContext);
      return paramAccount;
    }
    catch (c paramAccount)
    {
      com.google.android.gms.common.e.a(paramAccount.a(), paramContext);
      Log.w("GoogleAuthUtil", "Error when getting token", paramAccount);
      throw new e("User intervention required. Notification has been pushed.");
    }
    catch (d paramAccount)
    {
      com.google.android.gms.common.e.i(paramContext);
      Log.w("GoogleAuthUtil", "Error when getting token", paramAccount);
      throw new e("User intervention required. Notification has been pushed.");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */