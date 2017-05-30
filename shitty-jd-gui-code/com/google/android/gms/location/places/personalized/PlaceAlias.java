package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class PlaceAlias
  extends AbstractSafeParcelable
{
  public static final d CREATOR = new d();
  public static final PlaceAlias a = new PlaceAlias(0, "Home");
  public static final PlaceAlias b = new PlaceAlias(0, "Work");
  final int c;
  private final String d;
  
  PlaceAlias(int paramInt, String paramString)
  {
    this.c = paramInt;
    this.d = paramString;
  }
  
  public String a()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof PlaceAlias)) {
      return false;
    }
    paramObject = (PlaceAlias)paramObject;
    return c.a(this.d, ((PlaceAlias)paramObject).d);
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.d });
  }
  
  public String toString()
  {
    return c.a(this).a("alias", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/places/personalized/PlaceAlias.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */