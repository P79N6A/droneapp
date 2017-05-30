package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.common.l;
import com.google.android.gms.internal.afb;
import com.google.android.gms.internal.ajl;
import com.google.android.gms.internal.sr;
import com.google.android.gms.internal.sr.a;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class j
{
  private static final ComponentName a;
  private static final ComponentName b;
  private static final ajl c;
  public static final String j = "com.google";
  public static final String k = "com.google.work";
  public static final String l = "suppressProgressScreen";
  public static final String m;
  public static final String n;
  public static final int o = 1;
  public static final int p = 2;
  public static final int q = 3;
  public static final int r = 4;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      m = "callerUid";
      if (Build.VERSION.SDK_INT < 14) {
        break label73;
      }
    }
    label73:
    for (;;)
    {
      n = "androidPackageName";
      a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
      b = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
      c = i.a(new String[] { "GoogleAuthUtil" });
      return;
      break;
    }
  }
  
  /* Error */
  private static <T> T a(Context paramContext, ComponentName paramComponentName, a<T> parama)
  {
    // Byte code:
    //   0: new 93	com/google/android/gms/common/h
    //   3: dup
    //   4: invokespecial 94	com/google/android/gms/common/h:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: invokestatic 99	com/google/android/gms/common/internal/y:a	(Landroid/content/Context;)Lcom/google/android/gms/common/internal/y;
    //   12: astore 4
    //   14: aload 4
    //   16: aload_1
    //   17: aload_3
    //   18: ldc 75
    //   20: invokevirtual 102	com/google/android/gms/common/internal/y:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   23: ifeq +70 -> 93
    //   26: aload_2
    //   27: aload_3
    //   28: invokevirtual 105	com/google/android/gms/common/h:a	()Landroid/os/IBinder;
    //   31: invokeinterface 108 2 0
    //   36: astore_0
    //   37: aload 4
    //   39: aload_1
    //   40: aload_3
    //   41: ldc 75
    //   43: invokevirtual 111	com/google/android/gms/common/internal/y:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   46: aload_0
    //   47: areturn
    //   48: astore_0
    //   49: getstatic 82	com/google/android/gms/auth/j:c	Lcom/google/android/gms/internal/ajl;
    //   52: ldc 75
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: ldc 113
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: aload_0
    //   66: aastore
    //   67: invokevirtual 118	com/google/android/gms/internal/ajl:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: new 120	java/io/IOException
    //   73: dup
    //   74: ldc 113
    //   76: aload_0
    //   77: invokespecial 123	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: athrow
    //   81: astore_0
    //   82: aload 4
    //   84: aload_1
    //   85: aload_3
    //   86: ldc 75
    //   88: invokevirtual 111	com/google/android/gms/common/internal/y:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   91: aload_0
    //   92: athrow
    //   93: new 120	java/io/IOException
    //   96: dup
    //   97: ldc 125
    //   99: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   102: athrow
    //   103: astore_0
    //   104: goto -55 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   0	107	1	paramComponentName	ComponentName
    //   0	107	2	parama	a<T>
    //   7	79	3	localh	com.google.android.gms.common.h
    //   12	71	4	localy	com.google.android.gms.common.internal.y
    // Exception table:
    //   from	to	target	type
    //   26	37	48	java/lang/InterruptedException
    //   26	37	81	finally
    //   49	81	81	finally
    //   26	37	103	android/os/RemoteException
  }
  
  private static void a(Context paramContext)
  {
    try
    {
      l.f(paramContext.getApplicationContext());
      return;
    }
    catch (com.google.android.gms.common.d paramContext)
    {
      throw new c(paramContext.a(), paramContext.getMessage(), paramContext.b());
    }
    catch (com.google.android.gms.common.c paramContext)
    {
      throw new a(paramContext.getMessage());
    }
  }
  
  static void a(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IllegalArgumentException("Callback cannot be null.");
    }
    paramIntent = paramIntent.toUri(1);
    try
    {
      Intent.parseUri(paramIntent, 1);
      return;
    }
    catch (URISyntaxException paramIntent)
    {
      throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
    }
  }
  
  @TargetApi(23)
  public static Bundle b(Context paramContext, Account paramAccount)
  {
    com.google.android.gms.common.internal.d.a(paramContext);
    com.google.android.gms.common.internal.d.a(paramAccount, "Account cannot be null.");
    a(paramContext);
    paramAccount = new a()
    {
      public Bundle a(IBinder paramAnonymousIBinder)
      {
        return (Bundle)j.a(sr.a.a(paramAnonymousIBinder).a(j.this));
      }
    };
    return (Bundle)a(paramContext, a, paramAccount);
  }
  
  private static <T> T b(T paramT)
  {
    if (paramT == null)
    {
      c.c("GoogleAuthUtil", new Object[] { "Binder call returned null." });
      throw new IOException("Service unavailable.");
    }
    return paramT;
  }
  
  public static String b(Context paramContext, Account paramAccount, String paramString)
  {
    return e(paramContext, paramAccount, paramString, new Bundle());
  }
  
  @Deprecated
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    return b(paramContext, new Account(paramString1, "com.google"), paramString2);
  }
  
  public static List<AccountChangeEvent> b(Context paramContext, final int paramInt, String paramString)
  {
    com.google.android.gms.common.internal.d.a(paramString, "accountName must be provided");
    com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
    a(paramContext);
    paramString = new a()
    {
      public List<AccountChangeEvent> a(IBinder paramAnonymousIBinder)
      {
        return ((AccountChangeEventsResponse)j.a(sr.a.a(paramAnonymousIBinder).a(new AccountChangeEventsRequest().a(j.this).a(paramInt)))).a();
      }
    };
    return (List)a(paramContext, a, paramString);
  }
  
  @Deprecated
  public static String c(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    return e(paramContext, new Account(paramString1, "com.google"), paramString2, paramBundle);
  }
  
  @Deprecated
  @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
  public static void d(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  public static String e(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return f(paramContext, paramAccount, paramString, paramBundle).a();
  }
  
  public static void e(Context paramContext, String paramString)
  {
    com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
    a(paramContext);
    final Bundle localBundle = new Bundle();
    String str = paramContext.getApplicationInfo().packageName;
    localBundle.putString("clientPackageName", str);
    if (!localBundle.containsKey(n)) {
      localBundle.putString(n, str);
    }
    paramString = new a()
    {
      public Void a(IBinder paramAnonymousIBinder)
      {
        paramAnonymousIBinder = (Bundle)j.a(sr.a.a(paramAnonymousIBinder).a(j.this, localBundle));
        String str = paramAnonymousIBinder.getString("Error");
        if (!paramAnonymousIBinder.getBoolean("booleanResult")) {
          throw new a(str);
        }
        return null;
      }
    };
    a(paramContext, a, paramString);
  }
  
  public static TokenData f(Context paramContext, Account paramAccount, final String paramString, final Bundle paramBundle)
  {
    com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
    com.google.android.gms.common.internal.d.a(paramString, "Scope cannot be empty or null.");
    com.google.android.gms.common.internal.d.a(paramAccount, "Account cannot be null.");
    a(paramContext);
    if (paramBundle == null) {}
    for (paramBundle = new Bundle();; paramBundle = new Bundle(paramBundle))
    {
      String str = paramContext.getApplicationInfo().packageName;
      paramBundle.putString("clientPackageName", str);
      if (TextUtils.isEmpty(paramBundle.getString(n))) {
        paramBundle.putString(n, str);
      }
      paramBundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
      paramAccount = new a()
      {
        public TokenData a(IBinder paramAnonymousIBinder)
        {
          Object localObject1 = (Bundle)j.a(sr.a.a(paramAnonymousIBinder).a(j.this, paramString, paramBundle));
          paramAnonymousIBinder = TokenData.a((Bundle)localObject1, "tokenDetails");
          if (paramAnonymousIBinder != null) {
            return paramAnonymousIBinder;
          }
          paramAnonymousIBinder = ((Bundle)localObject1).getString("Error");
          localObject1 = (Intent)((Bundle)localObject1).getParcelable("userRecoveryIntent");
          Object localObject2 = afb.a(paramAnonymousIBinder);
          if (afb.a((afb)localObject2))
          {
            ajl localajl = j.a();
            localObject2 = String.valueOf(localObject2);
            localajl.c("GoogleAuthUtil", new Object[] { String.valueOf(localObject2).length() + 31 + "isUserRecoverableError status: " + (String)localObject2 });
            throw new d(paramAnonymousIBinder, (Intent)localObject1);
          }
          if (afb.b((afb)localObject2)) {
            throw new IOException(paramAnonymousIBinder);
          }
          throw new a(paramAnonymousIBinder);
        }
      };
      return (TokenData)a(paramContext, a, paramAccount);
    }
  }
  
  public static String f(Context paramContext, String paramString)
  {
    com.google.android.gms.common.internal.d.a(paramString, "accountName must be provided");
    com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
    a(paramContext);
    return c(paramContext, paramString, "^^_account_id_^^", new Bundle());
  }
  
  private static abstract interface a<T>
  {
    public abstract T b(IBinder paramIBinder);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */