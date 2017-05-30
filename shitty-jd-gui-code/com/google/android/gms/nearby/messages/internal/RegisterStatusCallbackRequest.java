package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class RegisterStatusCallbackRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<RegisterStatusCallbackRequest> CREATOR = new x();
  final int a;
  public final k b;
  public final n c;
  public boolean d;
  @Deprecated
  public String e;
  @Deprecated
  public final ClientAppContext f;
  
  RegisterStatusCallbackRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, boolean paramBoolean, String paramString, ClientAppContext paramClientAppContext)
  {
    this.a = paramInt;
    this.b = k.a.a(paramIBinder1);
    this.c = n.a.a(paramIBinder2);
    this.d = paramBoolean;
    this.e = paramString;
    this.f = ClientAppContext.a(paramClientAppContext, null, paramString, false);
  }
  
  RegisterStatusCallbackRequest(IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this(1, paramIBinder1, paramIBinder2, false, null, null);
  }
  
  IBinder a()
  {
    return this.b.asBinder();
  }
  
  IBinder b()
  {
    return this.c.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */