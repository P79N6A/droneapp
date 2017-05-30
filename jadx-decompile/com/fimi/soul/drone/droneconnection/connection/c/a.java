package com.fimi.soul.drone.droneconnection.connection.c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.hoho.android.usbserial.driver.CdcAcmSerialDriver;
import com.hoho.android.usbserial.driver.UsbId;
import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import java.io.IOException;
import java.lang.reflect.Array;

class a extends a {
    private static final String g = a.class.getSimpleName();
    private static UsbSerialDriver h = null;
    protected Context a;
    UsbInterface[] b = null;
    UsbEndpoint[][] c = ((UsbEndpoint[][]) Array.newInstance(UsbEndpoint.class, new int[]{20, 20}));
    UsbDeviceConnection d;
    private UsbDevice i = null;

    protected a(Context context, int i) {
        super(context, i);
        this.a = context;
    }

    protected int a(byte[] bArr) {
        try {
            int read = h.read(bArr, 200);
            return read == 0 ? -1 : read;
        } catch (Throwable e) {
            String str = "Error Reading: " + e.getMessage() + "\nAssuming inaccessible USB device.  Closing connection.";
            Log.e(g, str, e);
            throw new IOException(str, e);
        }
    }

    protected void a() {
        UsbManager usbManager = (UsbManager) this.f.getSystemService("usb");
        h = UsbSerialProber.findFirstDevice(usbManager);
        if (h == null) {
            if (usbManager != null) {
                for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                    this.i = usbDevice;
                    if (this.i.getVendorId() == UsbId.VAN_OOIJEN_TECH_TEENSYDUINO_SERIAL && this.i.getProductId() == 22336) {
                        break;
                    }
                }
            }
            if (this.i != null && this.i.getVendorId() == UsbId.VAN_OOIJEN_TECH_TEENSYDUINO_SERIAL && this.i.getProductId() == 22336) {
                this.b = new UsbInterface[this.i.getInterfaceCount()];
                for (int i = 0; i < this.i.getInterfaceCount(); i++) {
                    this.b[i] = this.i.getInterface(i);
                    for (int i2 = 0; i2 < this.b[i].getEndpointCount(); i2++) {
                        this.c[i][i2] = this.b[i].getEndpoint(i2);
                    }
                }
                this.d = usbManager.openDevice(this.i);
            }
            if (this.d != null) {
                h = new CdcAcmSerialDriver(this.i, this.d);
            }
            if (h != null) {
                a(h);
                return;
            }
            return;
        }
        a(h);
    }

    public void a(UsbSerialDriver usbSerialDriver) {
        try {
            usbSerialDriver.open();
            usbSerialDriver.setParameters(this.e, 8, 1, 0);
        } catch (IOException e) {
            if (usbSerialDriver != null) {
                usbSerialDriver.close();
            }
            throw new IOException();
        }
    }

    protected void b() {
        if (h != null) {
            try {
                h.close();
            } catch (IOException e) {
            }
            h = null;
        }
    }

    protected void b(byte[] bArr) {
        if (h != null) {
            try {
                h.write(bArr, 500);
            } catch (Throwable e) {
                Log.e("USB", "Error Sending: " + e.getMessage(), e);
            }
        }
    }

    public String toString() {
        return g;
    }
}
