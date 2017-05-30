package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HandleClientLifecycleEventRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<HandleClientLifecycleEventRequest> CREATOR = new h();
  public final int a;
  @Deprecated
  public final ClientAppContext b;
  public final int c;
  
  public HandleClientLifecycleEventRequest(int paramInt)
  {
    this(1, null, paramInt);
  }
  
  HandleClientLifecycleEventRequest(int paramInt1, ClientAppContext paramClientAppContext, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramClientAppContext;
    this.c = paramInt2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */