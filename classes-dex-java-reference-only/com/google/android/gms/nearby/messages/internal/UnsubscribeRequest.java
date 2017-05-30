package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UnsubscribeRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<UnsubscribeRequest> CREATOR = new aa();
  final int a;
  public final j b;
  public final k c;
  public final PendingIntent d;
  public final int e;
  @Deprecated
  public final String f;
  @Deprecated
  public final String g;
  @Deprecated
  public final boolean h;
  @Deprecated
  public final ClientAppContext i;
  
  UnsubscribeRequest(int paramInt1, IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.a = paramInt1;
    this.b = j.a.a(paramIBinder1);
    this.c = k.a.a(paramIBinder2);
    this.d = paramPendingIntent;
    this.e = paramInt2;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = ClientAppContext.a(paramClientAppContext, paramString2, paramString1, paramBoolean);
  }
  
  @VisibleForTesting
  public UnsubscribeRequest(IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt)
  {
    this(1, paramIBinder1, paramIBinder2, paramPendingIntent, paramInt, null, null, false, null);
  }
  
  IBinder a()
  {
    return this.c.asBinder();
  }
  
  IBinder b()
  {
    if (this.b == null) {
      return null;
    }
    return this.b.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/UnsubscribeRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */