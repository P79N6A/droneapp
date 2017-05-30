package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceStatus
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<DeviceStatus> CREATOR = new g();
  private final int a;
  private double b;
  private boolean c;
  private int d;
  private ApplicationMetadata e;
  private int f;
  
  public DeviceStatus()
  {
    this(3, NaN.0D, false, -1, null, -1);
  }
  
  DeviceStatus(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, ApplicationMetadata paramApplicationMetadata, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramDouble;
    this.c = paramBoolean;
    this.d = paramInt2;
    this.e = paramApplicationMetadata;
    this.f = paramInt3;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof DeviceStatus)) {
        return false;
      }
      paramObject = (DeviceStatus)paramObject;
    } while ((this.b == ((DeviceStatus)paramObject).b) && (this.c == ((DeviceStatus)paramObject).c) && (this.d == ((DeviceStatus)paramObject).d) && (f.a(this.e, ((DeviceStatus)paramObject).e)) && (this.f == ((DeviceStatus)paramObject).f));
    return false;
  }
  
  public ApplicationMetadata f()
  {
    return this.e;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/DeviceStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */