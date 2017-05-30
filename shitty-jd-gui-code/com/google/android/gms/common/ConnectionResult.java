package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConnectionResult
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ConnectionResult> CREATOR = new i();
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 5;
  public static final int g = 6;
  public static final int h = 7;
  public static final int i = 8;
  public static final int j = 9;
  public static final int k = 10;
  public static final int l = 11;
  public static final int m = 13;
  public static final int n = 14;
  public static final int o = 15;
  public static final int p = 16;
  public static final int q = 17;
  public static final int r = 18;
  public static final int s = 19;
  public static final int t = 20;
  @Deprecated
  public static final int u = 1500;
  public static final ConnectionResult v = new ConnectionResult(0);
  final int w;
  private final int x;
  private final PendingIntent y;
  private final String z;
  
  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.w = paramInt1;
    this.x = paramInt2;
    this.y = paramPendingIntent;
    this.z = paramString;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 31 + "UNKNOWN_ERROR_CODE(" + paramInt + ")";
    case 0: 
      return "SUCCESS";
    case 1: 
      return "SERVICE_MISSING";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 7: 
      return "NETWORK_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 9: 
      return "SERVICE_INVALID";
    case 10: 
      return "DEVELOPER_ERROR";
    case 11: 
      return "LICENSE_CHECK_FAILED";
    case 13: 
      return "CANCELED";
    case 14: 
      return "TIMEOUT";
    case 15: 
      return "INTERRUPTED";
    case 16: 
      return "API_UNAVAILABLE";
    case 17: 
      return "SIGN_IN_FAILED";
    case 18: 
      return "SERVICE_UPDATING";
    case 19: 
      return "SERVICE_MISSING_PERMISSION";
    case 20: 
      return "RESTRICTED_PROFILE";
    case 21: 
      return "API_VERSION_UPDATE_REQUIRED";
    case 42: 
      return "UPDATE_ANDROID_WEAR";
    case 1500: 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    case 99: 
      return "UNFINISHED";
    }
    return "UNKNOWN";
  }
  
  public void a(Activity paramActivity, int paramInt)
  {
    if (!a()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.y.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public boolean a()
  {
    return (this.x != 0) && (this.y != null);
  }
  
  public boolean b()
  {
    return this.x == 0;
  }
  
  public int c()
  {
    return this.x;
  }
  
  @Nullable
  public PendingIntent d()
  {
    return this.y;
  }
  
  @Nullable
  public String e()
  {
    return this.z;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult)) {
        return false;
      }
      paramObject = (ConnectionResult)paramObject;
    } while ((this.x == ((ConnectionResult)paramObject).x) && (c.a(this.y, ((ConnectionResult)paramObject).y)) && (c.a(this.z, ((ConnectionResult)paramObject).z)));
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.x), this.y, this.z });
  }
  
  public String toString()
  {
    return c.a(this).a("statusCode", a(this.x)).a("resolution", this.y).a("message", this.z).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/ConnectionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */