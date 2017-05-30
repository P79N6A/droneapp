package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class GetPermissionStatusRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetPermissionStatusRequest> CREATOR = new g();
  final int a;
  public final k b;
  @Deprecated
  public final String c;
  @Deprecated
  public final ClientAppContext d;
  
  GetPermissionStatusRequest(int paramInt, IBinder paramIBinder, String paramString, ClientAppContext paramClientAppContext)
  {
    this.a = paramInt;
    this.b = k.a.a(paramIBinder);
    this.c = paramString;
    this.d = ClientAppContext.a(paramClientAppContext, null, paramString, false);
  }
  
  GetPermissionStatusRequest(IBinder paramIBinder)
  {
    this(1, paramIBinder, null, null);
  }
  
  IBinder a()
  {
    return this.b.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */