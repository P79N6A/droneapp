package com.fimi.soul.drone.droneconnection.connection.c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.hoho.android.usbserial.driver.CdcAcmSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class a
  extends b.a
{
  private static final String g = a.class.getSimpleName();
  private static UsbSerialDriver h = null;
  protected Context a;
  UsbInterface[] b = null;
  UsbEndpoint[][] c = (UsbEndpoint[][])Array.newInstance(UsbEndpoint.class, new int[] { 20, 20 });
  UsbDeviceConnection d;
  private UsbDevice i = null;
  
  protected a(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.a = paramContext;
  }
  
  protected int a(byte[] paramArrayOfByte)
  {
    try
    {
      int j = h.read(paramArrayOfByte, 200);
      int k = j;
      if (j == 0) {
        k = -1;
      }
      return k;
    }
    catch (NullPointerException paramArrayOfByte)
    {
      String str = "Error Reading: " + paramArrayOfByte.getMessage() + "\nAssuming inaccessible USB device.  Closing connection.";
      Log.e(g, str, paramArrayOfByte);
      throw new IOException(str, paramArrayOfByte);
    }
  }
  
  protected void a()
  {
    UsbManager localUsbManager = (UsbManager)this.f.getSystemService("usb");
    h = UsbSerialProber.findFirstDevice(localUsbManager);
    if (h == null)
    {
      if (localUsbManager != null)
      {
        Iterator localIterator = localUsbManager.getDeviceList().values().iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          this.i = ((UsbDevice)localIterator.next());
        } while ((this.i.getVendorId() != 1155) || (this.i.getProductId() != 22336));
      }
      if ((this.i != null) && (this.i.getVendorId() == 1155) && (this.i.getProductId() == 22336))
      {
        this.b = new UsbInterface[this.i.getInterfaceCount()];
        int j = 0;
        while (j < this.i.getInterfaceCount())
        {
          this.b[j] = this.i.getInterface(j);
          int k = 0;
          while (k < this.b[j].getEndpointCount())
          {
            this.c[j][k] = this.b[j].getEndpoint(k);
            k += 1;
          }
          j += 1;
        }
        this.d = localUsbManager.openDevice(this.i);
      }
      if (this.d != null) {
        h = new CdcAcmSerialDriver(this.i, this.d);
      }
      if (h != null) {
        a(h);
      }
      return;
    }
    a(h);
  }
  
  public void a(UsbSerialDriver paramUsbSerialDriver)
  {
    try
    {
      paramUsbSerialDriver.open();
      paramUsbSerialDriver.setParameters(this.e, 8, 1, 0);
      return;
    }
    catch (IOException localIOException)
    {
      if (paramUsbSerialDriver != null) {
        paramUsbSerialDriver.close();
      }
      throw new IOException();
    }
  }
  
  protected void b()
  {
    if (h != null) {}
    try
    {
      h.close();
      h = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  protected void b(byte[] paramArrayOfByte)
  {
    if (h != null) {}
    try
    {
      h.write(paramArrayOfByte, 500);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      Log.e("USB", "Error Sending: " + paramArrayOfByte.getMessage(), paramArrayOfByte);
    }
  }
  
  public String toString()
  {
    return g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */