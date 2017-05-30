package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class GetBuyFlowInitializationTokenRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new c();
  byte[] a;
  byte[] b;
  private final int c;
  
  GetBuyFlowInitializationTokenRequest()
  {
    this(1, null, null);
  }
  
  GetBuyFlowInitializationTokenRequest(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.c = paramInt;
    this.a = paramArrayOfByte1;
    this.b = paramArrayOfByte2;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/firstparty/GetBuyFlowInitializationTokenRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */