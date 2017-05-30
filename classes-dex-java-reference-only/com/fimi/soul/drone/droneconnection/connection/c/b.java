package com.fimi.soul.drone.droneconnection.connection.c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.fimi.kernel.utils.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class b
  extends com.fimi.soul.drone.droneconnection.connection.a
{
  private static final String i = b.class.getSimpleName();
  private static final int j = 1027;
  protected int h = 256000;
  private a k;
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  private static boolean a(Context paramContext)
  {
    paramContext = ((UsbManager)paramContext.getSystemService("usb")).getDeviceList();
    if ((paramContext == null) || (paramContext.isEmpty())) {
      return false;
    }
    paramContext = paramContext.entrySet().iterator();
    while (paramContext.hasNext()) {
      if (((UsbDevice)((Map.Entry)paramContext.next()).getValue()).getVendorId() == 1027) {
        return true;
      }
    }
    return false;
  }
  
  protected int a(byte[] paramArrayOfByte)
  {
    if (this.k == null) {
      throw new IOException("Uninitialized usb connection.");
    }
    return this.k.a(paramArrayOfByte);
  }
  
  protected void a()
  {
    if (this.k != null) {
      this.k.b();
    }
  }
  
  protected void b()
  {
    if (this.k != null) {}
    while (this.k != null) {
      try
      {
        this.k.a();
        Log.d(i, "Reusing previous usb connection.");
        return;
      }
      catch (IOException localIOException)
      {
        Log.e(i, "Previous usb connection is not usable.", localIOException);
        this.k = null;
      }
    }
    a locala = new a(this.a, this.h);
    locala.a();
    this.k = locala;
    Log.d(i, "Using open-source usb connection.");
  }
  
  protected void d(final byte[] paramArrayOfByte)
  {
    x.b(new Runnable()
    {
      public void run()
      {
        if (b.a(b.this) == null) {
          return;
        }
        b.a(b.this).b(paramArrayOfByte);
      }
    });
  }
  
  public int j()
  {
    return 1;
  }
  
  public String toString()
  {
    if (this.k == null) {
      return i;
    }
    return this.k.toString();
  }
  
  static abstract class a
  {
    protected final int e;
    protected final Context f;
    
    protected a(Context paramContext, int paramInt)
    {
      this.f = paramContext;
      this.e = paramInt;
    }
    
    protected abstract int a(byte[] paramArrayOfByte);
    
    protected abstract void a();
    
    protected abstract void b();
    
    protected abstract void b(byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */