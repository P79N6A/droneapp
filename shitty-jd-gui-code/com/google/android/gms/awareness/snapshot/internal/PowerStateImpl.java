package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PowerStateImpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PowerStateImpl> CREATOR = new h();
  private final int a;
  private final int b;
  private final double c;
  
  PowerStateImpl(int paramInt1, int paramInt2, double paramDouble)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramDouble;
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 36 + "unknown plugged in state=" + paramInt;
    case 1: 
      return "POWER_DISCONNECTED";
    case 2: 
      return "POWER_CONNECTED_USB";
    case 3: 
      return "POWER_CONNECTED_AC";
    }
    return "POWER_CONNECTED_WIRELESS";
  }
  
  public int a()
  {
    return this.b;
  }
  
  public double b()
  {
    return this.c;
  }
  
  int c()
  {
    return this.a;
  }
  
  public String toString()
  {
    String str = String.valueOf(a(this.b));
    double d = this.c;
    return String.valueOf(str).length() + 69 + "PowerConnectionState = " + str + " Battery Percentage = " + d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/PowerStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */