package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal
  extends AbstractSafeParcelable
{
  public static final m CREATOR = new m();
  static final List<ClientIdentity> a = ;
  LocationRequest b;
  boolean c;
  List<ClientIdentity> d;
  @Nullable
  String e;
  boolean f;
  boolean g;
  private final int h;
  
  LocationRequestInternal(int paramInt, LocationRequest paramLocationRequest, boolean paramBoolean1, List<ClientIdentity> paramList, @Nullable String paramString, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.h = paramInt;
    this.b = paramLocationRequest;
    this.c = paramBoolean1;
    this.d = paramList;
    this.e = paramString;
    this.f = paramBoolean2;
    this.g = paramBoolean3;
  }
  
  @Deprecated
  public static LocationRequestInternal a(LocationRequest paramLocationRequest)
  {
    return a(null, paramLocationRequest);
  }
  
  public static LocationRequestInternal a(@Nullable String paramString, LocationRequest paramLocationRequest)
  {
    return new LocationRequestInternal(1, paramLocationRequest, true, a, paramString, false, false);
  }
  
  int a()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationRequestInternal)) {}
    do
    {
      return false;
      paramObject = (LocationRequestInternal)paramObject;
    } while ((!c.a(this.b, ((LocationRequestInternal)paramObject).b)) || (this.c != ((LocationRequestInternal)paramObject).c) || (this.f != ((LocationRequestInternal)paramObject).f) || (!c.a(this.d, ((LocationRequestInternal)paramObject).d)) || (this.g != ((LocationRequestInternal)paramObject).g));
    return true;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.toString());
    if (this.e != null) {
      localStringBuilder.append(" tag=").append(this.e);
    }
    localStringBuilder.append(" trigger=").append(this.c);
    localStringBuilder.append(" hideAppOps=").append(this.f);
    localStringBuilder.append(" clients=").append(this.d);
    localStringBuilder.append(" forceCoarseLocation=").append(this.g);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/internal/LocationRequestInternal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */