package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
public final class p
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 1000;
  public static final int d = 1001;
  public static final int e = 1002;
  
  public static int a(int paramInt)
  {
    if (((paramInt >= 0) && (paramInt <= 1)) || ((1000 <= paramInt) && (paramInt <= 1002))) {
      return paramInt;
    }
    return 1;
  }
  
  public static Status b(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return new Status(paramInt);
      paramInt = 13;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */