package com.google.android.gms.awareness;

import com.google.android.gms.common.api.f;

public class c
  extends f
{
  public static final int a = 7503;
  public static final int b = 7504;
  public static final int c = 7506;
  public static final int d = 7507;
  public static final int e = 7510;
  public static final int f = 7511;
  public static final int g = 7512;
  public static final int h = 7513;
  public static final int i = 7514;
  public static final int j = 7515;
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return f.b(paramInt);
    case 7500: 
      return "MISSING_MODULE_ID";
    case 7501: 
      return "EMPTY_CONTEXT_DATA_FILTER";
    case 7502: 
      return "EMPTY_TRANSITION_FILTER";
    case 7503: 
      return "ACL_ACCESS_DENIED";
    case 7504: 
      return "BAD_ACCOUNT";
    case -7500: 
      return "SUCCESS_INJECTED_ONLY";
    case -7501: 
      return "SUCCESS_WROTE_INJECTED";
    case 7505: 
      return "WRITE_FAILED";
    case 7506: 
      return "BLUETOOTH_OFF";
    case 7507: 
      return "INTERNAL_API_CLIENT_CONNECTION_FAILED";
    case 7508: 
      return "PLACES_API_CALL_FAILED";
    case 7509: 
      return "UNRESOLVED_PLACE_ALIAS";
    case 7510: 
      return "INCONSISTENT_ACCOUNT";
    case 7511: 
      return "INCONSISTENT_MODULE_ID";
    case 7512: 
      return "API_NOT_AVAILABLE";
    case 7513: 
      return "INCONSISTENT_UID";
    case 7514: 
      return "FENCE_NOT_AVAILABLE";
    }
    return "MAX_LIMIT_OF_FENCE_REGISTRATIONS_EXCEEDED";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */