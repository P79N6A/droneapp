package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;

@aaa
public class uv
  extends a.a
{
  private final uu a;
  private final Drawable b;
  private final Uri c;
  private final double d;
  
  public uv(uu paramuu)
  {
    this.a = paramuu;
    try
    {
      paramuu = this.a.a();
      if (paramuu == null) {
        break label83;
      }
      paramuu = (Drawable)f.a(paramuu);
    }
    catch (RemoteException paramuu)
    {
      try
      {
        paramuu = this.a.b();
        this.c = paramuu;
        double d1 = 1.0D;
        try
        {
          double d2 = this.a.c();
          d1 = d2;
        }
        catch (RemoteException paramuu)
        {
          for (;;)
          {
            b.b("Failed to get scale.", paramuu);
          }
        }
        this.d = d1;
        return;
        paramuu = paramuu;
        b.b("Failed to get drawable.", paramuu);
        paramuu = null;
      }
      catch (RemoteException paramuu)
      {
        for (;;)
        {
          b.b("Failed to get uri.", paramuu);
          paramuu = (uu)localObject;
        }
      }
    }
    this.b = paramuu;
  }
  
  public Drawable a()
  {
    return this.b;
  }
  
  public Uri b()
  {
    return this.c;
  }
  
  public double c()
  {
    return this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */