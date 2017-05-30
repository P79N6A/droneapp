package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import java.util.Collections;
import java.util.List;

enum UsbSerialProber$1 extends UsbSerialProber {
    UsbSerialProber$1(String str, int i) {
        super(str, i, null);
    }

    public List<UsbSerialDriver> probe(UsbManager usbManager, UsbDevice usbDevice) {
        if (!UsbSerialProber.access$3(usbDevice, FtdiSerialDriver.getSupportedDevices())) {
            return Collections.emptyList();
        }
        UsbDeviceConnection openDevice = usbManager.openDevice(usbDevice);
        return openDevice == null ? Collections.emptyList() : Collections.singletonList(new FtdiSerialDriver(usbDevice, openDevice));
    }
}
