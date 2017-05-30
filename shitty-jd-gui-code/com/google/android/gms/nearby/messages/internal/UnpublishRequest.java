package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UnpublishRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<UnpublishRequest> CREATOR = new z();
  final int a;
  public final MessageWrapper b;
  public final k c;
  @Deprecated
  public final String d;
  @Deprecated
  public final String e;
  @Deprecated
  public final boolean f;
  @Deprecated
  public final ClientAppContext g;
  
  UnpublishRequest(int paramInt, MessageWrapper paramMessageWrapper, IBinder paramIBinder, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.a = paramInt;
    this.b = paramMessageWrapper;
    this.c = k.a.a(paramIBinder);
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramBoolean;
    this.g = ClientAppContext.a(paramClientAppContext, paramString2, paramString1, paramBoolean);
  }
  
  UnpublishRequest(MessageWrapper paramMessageWrapper, IBinder paramIBinder, ClientAppContext paramClientAppContext)
  {
    this(1, paramMessageWrapper, paramIBinder, null, null, false, paramClientAppContext);
  }
  
  IBinder a()
  {
    return this.c.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    z.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/UnpublishRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */