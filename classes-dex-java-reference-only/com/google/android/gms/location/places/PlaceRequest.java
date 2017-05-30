package com.google.android.gms.location.places;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PlaceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PlaceRequest> CREATOR = new x();
  final int a;
  private final PlaceFilter b;
  private final long c;
  private final int d;
  private final long e;
  private final boolean f;
  private final boolean g;
  
  public PlaceRequest(int paramInt1, PlaceFilter paramPlaceFilter, long paramLong1, int paramInt2, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramPlaceFilter;
    this.c = paramLong1;
    this.d = paramInt2;
    this.e = paramLong2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  @Deprecated
  public PlaceFilter a()
  {
    return this.b;
  }
  
  public long b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public long d()
  {
    return this.e;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceRequest)) {
        return false;
      }
      paramObject = (PlaceRequest)paramObject;
    } while ((c.a(this.b, ((PlaceRequest)paramObject).b)) && (this.c == ((PlaceRequest)paramObject).c) && (this.d == ((PlaceRequest)paramObject).d) && (this.e == ((PlaceRequest)paramObject).e) && (this.f == ((PlaceRequest)paramObject).f));
    return false;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f) });
  }
  
  @SuppressLint({"DefaultLocale"})
  public String toString()
  {
    return c.a(this).a("filter", this.b).a("interval", Long.valueOf(this.c)).a("priority", Integer.valueOf(this.d)).a("expireAt", Long.valueOf(this.e)).a("receiveFailures", Boolean.valueOf(this.f)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/places/PlaceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */