package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.f;

public class a
  extends f
{
  public static final int a = 3000;
  public static final int b = 3001;
  public static final int c = 3002;
  public static final int d = 3003;
  public static final int e = 3004;
  public static final int f = 3005;
  public static final int g = 3006;
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return f.b(paramInt);
    case 3000: 
      return "AUTH_API_INVALID_CREDENTIALS";
    case 3001: 
      return "AUTH_API_ACCESS_FORBIDDEN";
    case 3002: 
      return "AUTH_API_CLIENT_ERROR";
    case 3003: 
      return "AUTH_API_SERVER_ERROR";
    case 3004: 
      return "AUTH_TOKEN_ERROR";
    case 3005: 
      return "AUTH_URL_RESOLUTION";
    }
    return "AUTH_APP_CERT_ERROR";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */