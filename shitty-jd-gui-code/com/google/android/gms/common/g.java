package com.google.android.gms.common;

import android.content.Intent;

public class g
  extends Exception
{
  private final Intent a;
  
  public g(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.a = paramIntent;
  }
  
  public Intent b()
  {
    return new Intent(this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */