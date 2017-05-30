package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.j;

@Deprecated
public final class aie
{
  private static Object a = new Object();
  private static aie b;
  private final String c;
  private final String d;
  private final Status e;
  private final String f;
  private final String g;
  private final String h;
  private final boolean i;
  private final boolean j;
  
  aie(Context paramContext)
  {
    Object localObject = paramContext.getResources();
    int k = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(R.string.common_google_play_services_unknown_issue));
    if (k != 0) {
      if (((Resources)localObject).getInteger(k) != 0)
      {
        bool1 = true;
        if (bool1) {
          break label172;
        }
      }
    }
    label52:
    for (this.j = bool2;; this.j = false)
    {
      this.i = bool1;
      j localj = new j(paramContext);
      this.f = localj.a("firebase_database_url");
      this.h = localj.a("google_storage_bucket");
      this.g = localj.a("gcm_defaultSenderId");
      this.d = localj.a("google_api_key");
      localObject = b.a(paramContext);
      paramContext = (Context)localObject;
      if (localObject == null) {
        paramContext = localj.a("google_app_id");
      }
      if (!TextUtils.isEmpty(paramContext)) {
        break label186;
      }
      this.e = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
      this.c = null;
      return;
      bool1 = false;
      break;
      label172:
      bool2 = false;
      break label52;
    }
    label186:
    this.c = paramContext;
    this.e = Status.a;
  }
  
  aie(String paramString, boolean paramBoolean)
  {
    this(paramString, paramBoolean, null, null, null);
  }
  
  aie(String paramString1, boolean paramBoolean, String paramString2, String paramString3, String paramString4)
  {
    this.c = paramString1;
    this.d = null;
    this.e = Status.a;
    this.i = paramBoolean;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.j = paramBoolean;
      this.f = paramString2;
      this.g = paramString4;
      this.h = paramString3;
      return;
    }
  }
  
  public static Status a(Context paramContext)
  {
    d.a(paramContext, "Context must not be null.");
    synchronized (a)
    {
      if (b == null) {
        b = new aie(paramContext);
      }
      paramContext = b.e;
      return paramContext;
    }
  }
  
  public static Status a(Context arg0, String paramString, boolean paramBoolean)
  {
    d.a(???, "Context must not be null.");
    d.a(paramString, "App ID must be nonempty.");
    synchronized (a)
    {
      if (b != null)
      {
        paramString = b.a(paramString);
        return paramString;
      }
      b = new aie(paramString, paramBoolean);
      paramString = b.e;
      return paramString;
    }
  }
  
  public static String a()
  {
    return b("getGoogleAppId").c;
  }
  
  private static aie b(String paramString)
  {
    synchronized (a)
    {
      if (b == null) {
        throw new IllegalStateException(String.valueOf(paramString).length() + 34 + "Initialize must be called before " + paramString + ".");
      }
    }
    paramString = b;
    return paramString;
  }
  
  public static boolean b()
  {
    return b("isMeasurementExplicitlyDisabled").j;
  }
  
  Status a(String paramString)
  {
    if ((this.c != null) && (!this.c.equals(paramString)))
    {
      paramString = this.c;
      return new Status(10, String.valueOf(paramString).length() + 97 + "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + paramString + "'.");
    }
    return Status.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */