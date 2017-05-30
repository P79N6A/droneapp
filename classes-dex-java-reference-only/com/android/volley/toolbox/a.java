package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class a
  implements b
{
  private final AccountManager a;
  private final Account b;
  private final String c;
  private final boolean d;
  
  a(AccountManager paramAccountManager, Account paramAccount, String paramString, boolean paramBoolean)
  {
    this.a = paramAccountManager;
    this.b = paramAccount;
    this.c = paramString;
    this.d = paramBoolean;
  }
  
  public a(Context paramContext, Account paramAccount, String paramString)
  {
    this(paramContext, paramAccount, paramString, false);
  }
  
  public a(Context paramContext, Account paramAccount, String paramString, boolean paramBoolean)
  {
    this(AccountManager.get(paramContext), paramAccount, paramString, paramBoolean);
  }
  
  public Account a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    this.a.invalidateAuthToken(this.b.type, paramString);
  }
  
  public String b()
  {
    Object localObject2 = null;
    AccountManagerFuture localAccountManagerFuture = this.a.getAuthToken(this.b, this.c, this.d, null, null);
    Bundle localBundle;
    try
    {
      localBundle = (Bundle)localAccountManagerFuture.getResult();
      Object localObject1 = localObject2;
      if (!localAccountManagerFuture.isDone()) {
        break label105;
      }
      localObject1 = localObject2;
      if (localAccountManagerFuture.isCancelled()) {
        break label105;
      }
      if (localBundle.containsKey("intent")) {
        throw new com.android.volley.a((Intent)localBundle.getParcelable("intent"));
      }
    }
    catch (Exception localException)
    {
      throw new com.android.volley.a("Error while retrieving auth token", localException);
    }
    String str = localBundle.getString("authtoken");
    label105:
    if (str == null) {
      throw new com.android.volley.a("Got null auth token for type: " + this.c);
    }
    return str;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */