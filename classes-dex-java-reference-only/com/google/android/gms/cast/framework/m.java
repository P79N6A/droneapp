package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.c.e;
import com.google.android.gms.common.internal.d;

public abstract class m
{
  private final Context a;
  private final String b;
  private final a c = new a(null);
  
  protected m(Context paramContext, String paramString)
  {
    this.a = ((Context)d.a(paramContext)).getApplicationContext();
    this.b = d.a(paramString);
  }
  
  public final Context a()
  {
    return this.a;
  }
  
  public abstract j a(String paramString);
  
  public final String b()
  {
    return this.b;
  }
  
  public abstract boolean c();
  
  public IBinder d()
  {
    return this.c;
  }
  
  private class a
    extends ac.a
  {
    private a() {}
    
    public int a()
    {
      return 9683208;
    }
    
    public e a(String paramString)
    {
      paramString = m.this.a(paramString);
      if (paramString == null) {
        return null;
      }
      return paramString.u();
    }
    
    public boolean b()
    {
      return m.this.c();
    }
    
    public String c()
    {
      return m.this.b();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */