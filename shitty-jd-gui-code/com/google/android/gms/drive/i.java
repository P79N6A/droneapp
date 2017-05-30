package com.google.android.gms.drive;

import com.google.android.gms.common.api.f;

public final class i
  extends f
{
  @Deprecated
  public static final int a = 1500;
  public static final int b = 1502;
  public static final int c = 1507;
  public static final int d = 1508;
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return f.b(paramInt);
    case 1501: 
      return "DRIVE_RESOURCE_ALREADY_EXISTS";
    case 1502: 
      return "DRIVE_RESOURCE_NOT_AVAILABLE";
    case 1503: 
      return "DRIVE_RESOURCE_FORBIDDEN";
    case 1504: 
      return "DRIVE_REALTIME_CONCURRENT_CREATION";
    case 1505: 
      return "DRIVE_REALTIME_INVALID_COMPOUND_OP";
    case 1506: 
      return "DRIVE_FULL_SYNC_REQUIRED";
    case 1507: 
      return "DRIVE_RATE_LIMIT_EXCEEDED";
    case 1508: 
      return "DRIVE_CONTENTS_TOO_LARGE";
    case 1509: 
      return "DRIVE_RESOURCE_PERMISSION_FORBIDDEN";
    case 1510: 
      return "DRIVE_INAPPLICABLE_OPERATION";
    case 1511: 
      return "DRIVE_INSUFFICIENT_SCOPES";
    }
    return "DRIVE_REALTIME_TOKEN_REFRESH_REQUIRED";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/drive/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */