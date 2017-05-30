package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
public class GetConfigResponse
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetConfigResponse> CREATOR = new p();
  public final int a;
  public final int b;
  public final ConnectionConfiguration c;
  
  GetConfigResponse(int paramInt1, int paramInt2, ConnectionConfiguration paramConnectionConfiguration)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramConnectionConfiguration;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wearable/internal/GetConfigResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */