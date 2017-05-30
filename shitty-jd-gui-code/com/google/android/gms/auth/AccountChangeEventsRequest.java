package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEventsRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new g();
  final int a;
  int b;
  @Deprecated
  String c;
  Account d;
  
  public AccountChangeEventsRequest()
  {
    this.a = 1;
  }
  
  AccountChangeEventsRequest(int paramInt1, int paramInt2, String paramString, Account paramAccount)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    if ((paramAccount == null) && (!TextUtils.isEmpty(paramString)))
    {
      this.d = new Account(paramString, "com.google");
      return;
    }
    this.d = paramAccount;
  }
  
  public AccountChangeEventsRequest a(int paramInt)
  {
    this.b = paramInt;
    return this;
  }
  
  public AccountChangeEventsRequest a(Account paramAccount)
  {
    this.d = paramAccount;
    return this;
  }
  
  @Deprecated
  public AccountChangeEventsRequest a(String paramString)
  {
    this.c = paramString;
    return this;
  }
  
  @Deprecated
  public String a()
  {
    return this.c;
  }
  
  public Account b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEventsRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */