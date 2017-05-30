package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AdBreakInfo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AdBreakInfo> CREATOR = new h();
  private final int a;
  private final long b;
  
  AdBreakInfo(int paramInt, long paramLong)
  {
    this.a = paramInt;
    this.b = paramLong;
  }
  
  int a()
  {
    return this.a;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private long a = 0L;
    
    public a(long paramLong)
    {
      this.a = paramLong;
    }
    
    public AdBreakInfo a()
    {
      return new AdBreakInfo(1, this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/AdBreakInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */