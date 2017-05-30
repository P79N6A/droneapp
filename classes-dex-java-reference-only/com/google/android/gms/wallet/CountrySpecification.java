package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class CountrySpecification
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CountrySpecification> CREATOR = new h();
  String a;
  private final int b;
  
  CountrySpecification(int paramInt, String paramString)
  {
    this.b = paramInt;
    this.a = paramString;
  }
  
  public CountrySpecification(String paramString)
  {
    this.b = 1;
    this.a = paramString;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/CountrySpecification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */