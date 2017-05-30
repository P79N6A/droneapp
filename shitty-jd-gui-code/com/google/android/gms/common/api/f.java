package com.google.android.gms.common.api;

import android.support.annotation.NonNull;

public class f
{
  public static final int k = -1;
  public static final int l = 0;
  @Deprecated
  public static final int m = 2;
  @Deprecated
  public static final int n = 3;
  public static final int o = 4;
  public static final int p = 5;
  public static final int q = 6;
  public static final int r = 7;
  public static final int s = 8;
  public static final int t = 10;
  public static final int u = 13;
  public static final int v = 14;
  public static final int w = 15;
  public static final int x = 16;
  public static final int y = 17;
  public static final int z = 18;
  
  @NonNull
  public static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 9: 
    case 11: 
    case 12: 
    default: 
      return 32 + "unknown status code: " + paramInt;
    case -1: 
      return "SUCCESS_CACHE";
    case 0: 
      return "SUCCESS";
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
    case 10: 
      return "DEVELOPER_ERROR";
    case 13: 
      return "ERROR";
    case 14: 
      return "INTERRUPTED";
    case 15: 
      return "TIMEOUT";
    case 16: 
      return "CANCELED";
    case 17: 
      return "API_NOT_CONNECTED";
    }
    return "DEAD_CLIENT";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */