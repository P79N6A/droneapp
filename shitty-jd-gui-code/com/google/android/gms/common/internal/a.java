package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.l;

public class a
  extends ac.a
{
  int a;
  
  public static Account a(ac paramac)
  {
    Account localAccount = null;
    long l;
    if (paramac != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramac.a();
      return localAccount;
    }
    catch (RemoteException paramac)
    {
      Log.w("AccountAccessor", "Remote account accessor probably died");
      return null;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a) {
      return null;
    }
    if (l.c(null, i))
    {
      this.a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    throw new NullPointerException();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */