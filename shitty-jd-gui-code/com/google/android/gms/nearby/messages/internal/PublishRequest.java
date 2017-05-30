package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

public final class PublishRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PublishRequest> CREATOR = new w();
  final int a;
  public final MessageWrapper b;
  public final Strategy c;
  public final k d;
  @Deprecated
  public final String e;
  @Deprecated
  public final String f;
  @Deprecated
  public final boolean g;
  public final m h;
  @Deprecated
  public final boolean i;
  @Deprecated
  public final ClientAppContext j;
  
  PublishRequest(int paramInt, MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, String paramString1, String paramString2, boolean paramBoolean1, IBinder paramIBinder2, boolean paramBoolean2, ClientAppContext paramClientAppContext)
  {
    this.a = paramInt;
    this.b = paramMessageWrapper;
    this.c = paramStrategy;
    this.d = k.a.a(paramIBinder1);
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramBoolean1;
    if (paramIBinder2 == null) {}
    for (paramMessageWrapper = null;; paramMessageWrapper = m.a.a(paramIBinder2))
    {
      this.h = paramMessageWrapper;
      this.i = paramBoolean2;
      this.j = ClientAppContext.a(paramClientAppContext, paramString2, paramString1, paramBoolean2);
      return;
    }
  }
  
  PublishRequest(MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this(2, paramMessageWrapper, paramStrategy, paramIBinder1, null, null, false, paramIBinder2, false, null);
  }
  
  IBinder a()
  {
    return this.d.asBinder();
  }
  
  IBinder b()
  {
    if (this.h == null) {
      return null;
    }
    return this.h.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/PublishRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */