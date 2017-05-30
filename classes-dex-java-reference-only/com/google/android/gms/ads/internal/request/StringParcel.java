package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class StringParcel
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<StringParcel> CREATOR = new o();
  final int a;
  String b;
  
  StringParcel(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public StringParcel(String paramString)
  {
    this.a = 1;
    this.b = paramString;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/StringParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */