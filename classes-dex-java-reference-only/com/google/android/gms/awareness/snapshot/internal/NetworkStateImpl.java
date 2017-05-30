package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NetworkStateImpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<NetworkStateImpl> CREATOR = new e();
  private final int a;
  private final int b;
  private final int c;
  
  NetworkStateImpl(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 37 + "unknown connection state: " + paramInt;
    case 1: 
      return "DISCONNECTED";
    case 2: 
      return "ON_WIFI";
    }
    return "ON_CELLULAR";
  }
  
  public static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 32 + "unknown meter state: " + paramInt;
    case 1: 
      return "METERED";
    }
    return "UNMETERED";
  }
  
  public int a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.a;
  }
  
  int c()
  {
    return this.c;
  }
  
  public String toString()
  {
    String str1 = String.valueOf(a(this.b));
    String str2 = String.valueOf(b(this.c));
    return String.valueOf(str1).length() + 41 + String.valueOf(str2).length() + "ConnectionState = " + str1 + " NetworkMeteredState = " + str2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/NetworkStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */