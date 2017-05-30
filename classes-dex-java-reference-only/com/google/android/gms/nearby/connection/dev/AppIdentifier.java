package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class AppIdentifier
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AppIdentifier> CREATOR = new b();
  private final int a;
  private final String b;
  
  AppIdentifier(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = d.a(paramString, "Missing application identifier value");
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/connection/dev/AppIdentifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */