package com.fimi.soul.drone.droneconnection.connection.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fimi.soul.drone.g.c;

public class a
  extends com.fimi.soul.drone.droneconnection.connection.a
{
  private final b h;
  
  public a(Context paramContext)
  {
    super(paramContext);
    this.h = new b()
    {
      protected int a()
      {
        return Integer.parseInt(this.a.getString("pref_connection_port", "1234"));
      }
      
      protected String b()
      {
        return this.a.getString("pref_connection_serviceip", c.b());
      }
    };
  }
  
  protected int a(byte[] paramArrayOfByte)
  {
    return this.h.b(paramArrayOfByte);
  }
  
  protected void a()
  {
    this.h.e();
  }
  
  protected void b()
  {
    this.h.d();
  }
  
  protected void d(byte[] paramArrayOfByte)
  {
    this.h.d(paramArrayOfByte);
  }
  
  public int j()
  {
    return this.h.j();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */