package com.google.android.gms.auth;

import android.content.Intent;

public class d
  extends a
{
  private final Intent a;
  
  public d(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.a = paramIntent;
  }
  
  public Intent b()
  {
    if (this.a == null) {
      return null;
    }
    return new Intent(this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */