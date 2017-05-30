package com.google.android.gms.wallet;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public abstract interface c
{
  @Deprecated
  public abstract i<e> a(g paramg);
  
  public abstract i<e> a(g paramg, IsReadyToPayRequest paramIsReadyToPayRequest);
  
  @Deprecated
  public abstract void a(g paramg, int paramInt);
  
  public abstract void a(g paramg, FullWalletRequest paramFullWalletRequest, int paramInt);
  
  public abstract void a(g paramg, MaskedWalletRequest paramMaskedWalletRequest, int paramInt);
  
  @Deprecated
  public abstract void a(g paramg, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest);
  
  public abstract void a(g paramg, String paramString1, String paramString2, int paramInt);
  
  @Deprecated
  public abstract void b(g paramg, int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */