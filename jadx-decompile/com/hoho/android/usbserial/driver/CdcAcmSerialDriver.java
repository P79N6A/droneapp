package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.util.Log;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class CdcAcmSerialDriver extends CommonUsbSerialDriver {
    private static final int GET_LINE_CODING = 33;
    private static final int SEND_BREAK = 35;
    private static final int SET_CONTROL_LINE_STATE = 34;
    private static final int SET_LINE_CODING = 32;
    private static final int USB_RECIP_INTERFACE = 1;
    private static final int USB_RT_ACM = 33;
    private final String TAG = CdcAcmSerialDriver.class.getSimpleName();
    private UsbEndpoint mControlEndpoint;
    private UsbInterface mControlInterface;
    private UsbInterface mDataInterface;
    private boolean mDtr = false;
    private UsbEndpoint mReadEndpoint;
    private boolean mRts = false;
    private UsbEndpoint mWriteEndpoint;

    public CdcAcmSerialDriver(UsbDevice usbDevice, UsbDeviceConnection usbDeviceConnection) {
        super(usbDevice, usbDeviceConnection);
    }

    public static Map<Integer, int[]> getSupportedDevices() {
        Map<Integer, int[]> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_ARDUINO), new int[]{1, 67, 16, 66, 59, 68, 63, 68, UsbId.ARDUINO_LEONARDO});
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_VAN_OOIJEN_TECH), new int[]{1155});
        linkedHashMap.put(Integer.valueOf(1003), new int[]{8260});
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_LEAFLABS), new int[]{4});
        return linkedHashMap;
    }

    private int sendAcmControlMessage(int i, int i2, byte[] bArr) {
        return this.mConnection.controlTransfer(33, i, i2, 0, bArr, bArr != null ? bArr.length : 0, 5000);
    }

    private void setDtrRts() {
        int i = 0;
        int i2 = this.mRts ? 2 : 0;
        if (this.mDtr) {
            i = 1;
        }
        sendAcmControlMessage(34, i2 | i, null);
    }

    public void close() {
        this.mConnection.close();
    }

    public boolean getCD() {
        return false;
    }

    public boolean getCTS() {
        return false;
    }

    public boolean getDSR() {
        return false;
    }

    public boolean getDTR() {
        return this.mDtr;
    }

    public boolean getRI() {
        return false;
    }

    public boolean getRTS() {
        return this.mRts;
    }

    public void open() {
        Log.d(this.TAG, "claiming interfaces, count=" + this.mDevice.getInterfaceCount());
        Log.d(this.TAG, "Claiming control interface.");
        this.mControlInterface = this.mDevice.getInterface(0);
        Log.d(this.TAG, "Control iface=" + this.mControlInterface);
        if (this.mConnection.claimInterface(this.mControlInterface, true)) {
            this.mControlEndpoint = this.mControlInterface.getEndpoint(0);
            Log.d(this.TAG, "Control endpoint direction: " + this.mControlEndpoint.getDirection());
            Log.d(this.TAG, "Claiming data interface.");
            this.mDataInterface = this.mDevice.getInterface(1);
            Log.d(this.TAG, "data iface=" + this.mDataInterface);
            if (this.mConnection.claimInterface(this.mDataInterface, true)) {
                this.mReadEndpoint = this.mDataInterface.getEndpoint(1);
                Log.d(this.TAG, "Read endpoint direction: " + this.mReadEndpoint.getDirection());
                this.mWriteEndpoint = this.mDataInterface.getEndpoint(0);
                Log.d(this.TAG, "Write endpoint direction: " + this.mWriteEndpoint.getDirection());
                return;
            }
            throw new IOException("Could not claim data interface.");
        }
        throw new IOException("Could not claim control interface.");
    }

    public /* bridge */ /* synthetic */ boolean purgeHwBuffers(boolean z, boolean z2) {
        return super.purgeHwBuffers(z, z2);
    }

    public int read(byte[] bArr, int i) {
        synchronized (this.mReadBufferLock) {
            int bulkTransfer = this.mConnection.bulkTransfer(this.mReadEndpoint, this.mReadBuffer, Math.min(bArr.length, this.mReadBuffer.length), i);
            if (bulkTransfer < 0) {
                return 0;
            }
            System.arraycopy(this.mReadBuffer, 0, bArr, 0, bulkTransfer);
            return bulkTransfer;
        }
    }

    public void setDTR(boolean z) {
        this.mDtr = z;
        setDtrRts();
    }

    public void setParameters(int i, int i2, int i3, int i4) {
        byte b;
        byte b2;
        switch (i3) {
            case 1:
                b = (byte) 0;
                break;
            case 2:
                b = (byte) 2;
                break;
            case 3:
                b = (byte) 1;
                break;
            default:
                throw new IllegalArgumentException("Bad value for stopBits: " + i3);
        }
        switch (i4) {
            case 0:
                b2 = (byte) 0;
                break;
            case 1:
                b2 = (byte) 1;
                break;
            case 2:
                b2 = (byte) 2;
                break;
            case 3:
                b2 = (byte) 3;
                break;
            case 4:
                b2 = (byte) 4;
                break;
            default:
                throw new IllegalArgumentException("Bad value for parity: " + i4);
        }
        sendAcmControlMessage(32, 0, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), b, b2, (byte) i2});
    }

    public void setRTS(boolean z) {
        this.mRts = z;
        setDtrRts();
    }

    public int write(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < bArr.length) {
            synchronized (this.mWriteBufferLock) {
                byte[] bArr2;
                int min = Math.min(bArr.length - i2, this.mWriteBuffer.length);
                if (i2 == 0) {
                    bArr2 = bArr;
                } else {
                    System.arraycopy(bArr, i2, this.mWriteBuffer, 0, min);
                    bArr2 = this.mWriteBuffer;
                }
                int bulkTransfer = this.mConnection.bulkTransfer(this.mWriteEndpoint, bArr2, min, i);
            }
            if (bulkTransfer <= 0) {
                throw new IOException("Error writing " + min + " bytes at offset " + i2 + " length=" + bArr.length);
            }
            Log.d(this.TAG, "Wrote amt=" + bulkTransfer + " attempted=" + min);
            i2 += bulkTransfer;
        }
        return i2;
    }
}
