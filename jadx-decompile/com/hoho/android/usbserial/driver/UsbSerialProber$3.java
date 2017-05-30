package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import java.util.Collections;
import java.util.List;

enum UsbSerialProber$3 extends UsbSerialProber {
    UsbSerialProber$3(String str, int i) {
        super(str, i, null);
    }

    public List<UsbSerialDriver> probe(UsbManager usbManager, UsbDevice usbDevice) {
        if (!UsbSerialProber.access$3(usbDevice, Cp2102SerialDriver.getSupportedDevices())) {
            return Collections.emptyList();
        }
        UsbDeviceConnection openDevice = usbManager.openDevice(usbDevice);
        return openDevice == null ? Collections.emptyList() : Collections.singletonList(new Cp2102SerialDriver(usbDevice, openDevice));
    }
}
