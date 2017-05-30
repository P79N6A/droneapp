package com.fimi.soul.drone.droneconnection.connection.c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.fimi.kernel.utils.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class b extends com.fimi.soul.drone.droneconnection.connection.a {
    private static final String i = b.class.getSimpleName();
    private static final int j = 1027;
    protected int h = 256000;
    private a k;

    static abstract class a {
        protected final int e;
        protected final Context f;

        protected a(Context context, int i) {
            this.f = context;
            this.e = i;
        }

        protected abstract int a(byte[] bArr);

        protected abstract void a();

        protected abstract void b();

        protected abstract void b(byte[] bArr);
    }

    public b(Context context) {
        super(context);
    }

    private static boolean a(Context context) {
        HashMap deviceList = ((UsbManager) context.getSystemService("usb")).getDeviceList();
        if (deviceList == null || deviceList.isEmpty()) {
            return false;
        }
        for (Entry value : deviceList.entrySet()) {
            if (((UsbDevice) value.getValue()).getVendorId() == 1027) {
                return true;
            }
        }
        return false;
    }

    protected int a(byte[] bArr) {
        if (this.k != null) {
            return this.k.a(bArr);
        }
        throw new IOException("Uninitialized usb connection.");
    }

    protected void a() {
        if (this.k != null) {
            this.k.b();
        }
    }

    protected void b() {
        if (this.k != null) {
            try {
                this.k.a();
                Log.d(i, "Reusing previous usb connection.");
                return;
            } catch (Throwable e) {
                Log.e(i, "Previous usb connection is not usable.", e);
                this.k = null;
            }
        }
        if (this.k == null) {
            a aVar = new a(this.a, this.h);
            aVar.a();
            this.k = aVar;
            Log.d(i, "Using open-source usb connection.");
        }
    }

    protected void d(final byte[] bArr) {
        x.b(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                if (this.b.k != null) {
                    this.b.k.b(bArr);
                }
            }
        });
    }

    public int j() {
        return 1;
    }

    public String toString() {
        return this.k == null ? i : this.k.toString();
    }
}
