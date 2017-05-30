package com.android.volley;

import android.content.Intent;

public class a
  extends u
{
  private Intent b;
  
  public a() {}
  
  public a(Intent paramIntent)
  {
    this.b = paramIntent;
  }
  
  public a(j paramj)
  {
    super(paramj);
  }
  
  public a(String paramString)
  {
    super(paramString);
  }
  
  public a(String paramString, Exception paramException)
  {
    super(paramString, paramException);
  }
  
  public Intent a()
  {
    return this.b;
  }
  
  public String getMessage()
  {
    if (this.b != null) {
      return "User needs to (re)enter credentials.";
    }
    return super.getMessage();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */