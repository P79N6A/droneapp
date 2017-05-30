package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.util.Log;
import com.google.android.gms.location.places.d;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProlificSerialDriver extends CommonUsbSerialDriver {
    private static final int CONTROL_DTR = 1;
    private static final int CONTROL_RTS = 2;
    private static final int DEVICE_TYPE_0 = 1;
    private static final int DEVICE_TYPE_1 = 2;
    private static final int DEVICE_TYPE_HX = 0;
    private static final int FLUSH_RX_REQUEST = 8;
    private static final int FLUSH_TX_REQUEST = 9;
    private static final int INTERRUPT_ENDPOINT = 129;
    private static final int PROLIFIC_CTRL_OUT_REQTYPE = 33;
    private static final int PROLIFIC_VENDOR_IN_REQTYPE = 192;
    private static final int PROLIFIC_VENDOR_OUT_REQTYPE = 64;
    private static final int PROLIFIC_VENDOR_READ_REQUEST = 1;
    private static final int PROLIFIC_VENDOR_WRITE_REQUEST = 1;
    private static final int READ_ENDPOINT = 131;
    private static final int SET_CONTROL_REQUEST = 34;
    private static final int SET_LINE_REQUEST = 32;
    private static final int STATUS_BUFFER_SIZE = 10;
    private static final int STATUS_BYTE_IDX = 8;
    private static final int STATUS_FLAG_CD = 1;
    private static final int STATUS_FLAG_CTS = 128;
    private static final int STATUS_FLAG_DSR = 2;
    private static final int STATUS_FLAG_RI = 8;
    private static final int USB_READ_TIMEOUT_MILLIS = 1000;
    private static final int USB_RECIP_INTERFACE = 1;
    private static final int USB_WRITE_TIMEOUT_MILLIS = 5000;
    private static final int WRITE_ENDPOINT = 2;
    private final String TAG = ProlificSerialDriver.class.getSimpleName();
    private int mBaudRate = -1;
    private int mControlLinesValue = 0;
    private int mDataBits = -1;
    private int mDeviceType = 0;
    private UsbEndpoint mInterruptEndpoint;
    private int mParity = -1;
    private UsbEndpoint mReadEndpoint;
    private IOException mReadStatusException = null;
    private volatile Thread mReadStatusThread = null;
    private final Object mReadStatusThreadLock = new Object();
    private int mStatus = 0;
    private int mStopBits = -1;
    boolean mStopReadStatusThread = false;
    private UsbEndpoint mWriteEndpoint;

    public ProlificSerialDriver(UsbDevice usbDevice, UsbDeviceConnection usbDeviceConnection) {
        super(usbDevice, usbDeviceConnection);
    }

    private final void ctrlOut(int i, int i2, int i3, byte[] bArr) {
        outControlTransfer(33, i, i2, i3, bArr);
    }

    private void doBlackMagic() {
        vendorIn(33924, 0, 1);
        vendorOut(d.bu, 0, null);
        vendorIn(33924, 0, 1);
        vendorIn(33667, 0, 1);
        vendorIn(33924, 0, 1);
        vendorOut(d.bu, 1, null);
        vendorIn(33924, 0, 1);
        vendorIn(33667, 0, 1);
        vendorOut(0, 1, null);
        vendorOut(1, 0, null);
        vendorOut(2, this.mDeviceType == 0 ? 68 : 36, null);
    }

    private final int getStatus() {
        if (this.mReadStatusThread == null && this.mReadStatusException == null) {
            synchronized (this.mReadStatusThreadLock) {
                if (this.mReadStatusThread == null) {
                    byte[] bArr = new byte[10];
                    if (this.mConnection.bulkTransfer(this.mInterruptEndpoint, bArr, 10, 100) != 10) {
                        Log.w(this.TAG, "Could not read initial CTS / DSR / CD / RI status");
                    } else {
                        this.mStatus = bArr[8] & 255;
                    }
                    this.mReadStatusThread = new Thread(new Runnable() {
                        public void run() {
                            ProlificSerialDriver.this.readStatusThreadFunction();
                        }
                    });
                    this.mReadStatusThread.setDaemon(true);
                    this.mReadStatusThread.start();
                }
            }
        }
        IOException iOException = this.mReadStatusException;
        if (this.mReadStatusException == null) {
            return this.mStatus;
        }
        this.mReadStatusException = null;
        throw iOException;
    }

    public static Map<Integer, int[]> getSupportedDevices() {
        Map<Integer, int[]> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_PROLIFIC), new int[]{8963});
        return linkedHashMap;
    }

    private final byte[] inControlTransfer(int i, int i2, int i3, int i4, int i5) {
        byte[] bArr = new byte[i5];
        if (this.mConnection.controlTransfer(i, i2, i3, i4, bArr, i5, 1000) == i5) {
            return bArr;
        }
        throw new IOException(String.format("ControlTransfer with value 0x%x failed: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.mConnection.controlTransfer(i, i2, i3, i4, bArr, i5, 1000))}));
    }

    private final void outControlTransfer(int i, int i2, int i3, int i4, byte[] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        if (this.mConnection.controlTransfer(i, i2, i3, i4, bArr, length, 5000) != length) {
            throw new IOException(String.format("ControlTransfer with value 0x%x failed: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.mConnection.controlTransfer(i, i2, i3, i4, bArr, length, 5000))}));
        }
    }

    private final void readStatusThreadFunction() {
        while (!this.mStopReadStatusThread) {
            try {
                byte[] bArr = new byte[10];
                int bulkTransfer = this.mConnection.bulkTransfer(this.mInterruptEndpoint, bArr, 10, 500);
                if (bulkTransfer > 0) {
                    if (bulkTransfer == 10) {
                        this.mStatus = bArr[8] & 255;
                    } else {
                        throw new IOException(String.format("Invalid CTS / DSR / CD / RI status buffer received, expected %d bytes, but received %d", new Object[]{Integer.valueOf(10), Integer.valueOf(bulkTransfer)}));
                    }
                }
            } catch (IOException e) {
                this.mReadStatusException = e;
                return;
            }
        }
    }

    private void resetDevice() {
        purgeHwBuffers(true, true);
    }

    private void setControlLines(int i) {
        ctrlOut(34, i, 0, null);
        this.mControlLinesValue = i;
    }

    private final boolean testStatusFlag(int i) {
        return (getStatus() & i) == i;
    }

    private final byte[] vendorIn(int i, int i2, int i3) {
        return inControlTransfer(192, 1, i, i2, i3);
    }

    private final void vendorOut(int i, int i2, byte[] bArr) {
        outControlTransfer(64, 1, i, i2, bArr);
    }

    public void close() {
        try {
            this.mStopReadStatusThread = true;
            synchronized (this.mReadStatusThreadLock) {
                if (this.mReadStatusThread != null) {
                    try {
                        this.mReadStatusThread.join();
                    } catch (Throwable e) {
                        Log.w(this.TAG, "An error occured while waiting for status read thread", e);
                    }
                }
            }
            resetDevice();
        } finally {
            this.mConnection.releaseInterface(this.mDevice.getInterface(0));
        }
    }

    public boolean getCD() {
        return testStatusFlag(1);
    }

    public boolean getCTS() {
        return testStatusFlag(128);
    }

    public boolean getDSR() {
        return testStatusFlag(2);
    }

    public boolean getDTR() {
        return (this.mControlLinesValue & 1) == 1;
    }

    public boolean getRI() {
        return testStatusFlag(8);
    }

    public boolean getRTS() {
        return (this.mControlLinesValue & 2) == 2;
    }

    public void open() {
        int i = 0;
        UsbInterface usbInterface = this.mDevice.getInterface(0);
        if (this.mConnection.claimInterface(usbInterface, true)) {
            while (i < usbInterface.getEndpointCount()) {
                try {
                    UsbEndpoint endpoint = usbInterface.getEndpoint(i);
                    switch (endpoint.getAddress()) {
                        case 2:
                            this.mWriteEndpoint = endpoint;
                            break;
                        case 129:
                            this.mInterruptEndpoint = endpoint;
                            break;
                        case 131:
                            this.mReadEndpoint = endpoint;
                            break;
                        default:
                            break;
                    }
                    i++;
                } catch (NoSuchMethodException e) {
                    Log.w(this.TAG, "Method UsbDeviceConnection.getRawDescriptors, required for PL2303 subtype detection, not available! Assuming that it is a HX device");
                    this.mDeviceType = 0;
                } catch (Throwable e2) {
                    Log.e(this.TAG, "An unexpected exception occured while trying to detect PL2303 subtype", e2);
                } catch (Throwable th) {
                    try {
                        this.mConnection.releaseInterface(usbInterface);
                    } catch (Exception e3) {
                    }
                }
            }
            if (this.mDevice.getDeviceClass() == 2) {
                this.mDeviceType = 1;
            } else if (((byte[]) this.mConnection.getClass().getMethod("getRawDescriptors", new Class[0]).invoke(this.mConnection, new Object[0]))[7] == (byte) 64) {
                this.mDeviceType = 0;
            } else if (this.mDevice.getDeviceClass() == 0 || this.mDevice.getDeviceClass() == 255) {
                this.mDeviceType = 2;
            } else {
                Log.w(this.TAG, "Could not detect PL2303 subtype, Assuming that it is a HX device");
                this.mDeviceType = 0;
            }
            setControlLines(this.mControlLinesValue);
            resetDevice();
            doBlackMagic();
            return;
        }
        throw new IOException("Error claiming Prolific interface 0");
    }

    public boolean purgeHwBuffers(boolean z, boolean z2) {
        if (z) {
            vendorOut(8, 0, null);
        }
        if (z2) {
            vendorOut(9, 0, null);
        }
        return true;
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
        setControlLines(z ? this.mControlLinesValue | 1 : this.mControlLinesValue & -2);
    }

    public void setParameters(int i, int i2, int i3, int i4) {
        if (this.mBaudRate != i || this.mDataBits != i2 || this.mStopBits != i3 || this.mParity != i4) {
            byte[] bArr = new byte[7];
            bArr[0] = (byte) (i & 255);
            bArr[1] = (byte) ((i >> 8) & 255);
            bArr[2] = (byte) ((i >> 16) & 255);
            bArr[3] = (byte) ((i >> 24) & 255);
            switch (i3) {
                case 1:
                    bArr[4] = (byte) 0;
                    break;
                case 2:
                    bArr[4] = (byte) 2;
                    break;
                case 3:
                    bArr[4] = (byte) 1;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown stopBits value: " + i3);
            }
            switch (i4) {
                case 0:
                    bArr[5] = (byte) 0;
                    break;
                case 1:
                    bArr[5] = (byte) 1;
                    break;
                case 2:
                    bArr[5] = (byte) 2;
                    break;
                case 3:
                    bArr[5] = (byte) 3;
                    break;
                case 4:
                    bArr[5] = (byte) 4;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown parity value: " + i4);
            }
            bArr[6] = (byte) i2;
            ctrlOut(32, 0, 0, bArr);
            resetDevice();
            this.mBaudRate = i;
            this.mDataBits = i2;
            this.mStopBits = i3;
            this.mParity = i4;
        }
    }

    public void setRTS(boolean z) {
        setControlLines(z ? this.mControlLinesValue | 2 : this.mControlLinesValue & -3);
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
            i2 += bulkTransfer;
        }
        return i2;
    }
}
