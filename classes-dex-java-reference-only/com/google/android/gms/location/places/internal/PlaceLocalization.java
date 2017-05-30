package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public final class PlaceLocalization
  extends AbstractSafeParcelable
{
  public static final o CREATOR = new o();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final List<String> f;
  
  public PlaceLocalization(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, List<String> paramList)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramList;
  }
  
  public static PlaceLocalization a(String paramString1, String paramString2, String paramString3, String paramString4, List<String> paramList)
  {
    return new PlaceLocalization(0, paramString1, paramString2, paramString3, paramString4, paramList);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceLocalization)) {
        return false;
      }
      paramObject = (PlaceLocalization)paramObject;
    } while ((c.a(this.b, ((PlaceLocalization)paramObject).b)) && (c.a(this.c, ((PlaceLocalization)paramObject).c)) && (c.a(this.d, ((PlaceLocalization)paramObject).d)) && (c.a(this.e, ((PlaceLocalization)paramObject).e)) && (c.a(this.f, ((PlaceLocalization)paramObject).f)));
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.b, this.c, this.d, this.e });
  }
  
  public String toString()
  {
    return c.a(this).a("name", this.b).a("address", this.c).a("internationalPhoneNumber", this.d).a("regularOpenHours", this.e).a("attributions", this.f).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o localo = CREATOR;
    o.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/location/places/internal/PlaceLocalization.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */