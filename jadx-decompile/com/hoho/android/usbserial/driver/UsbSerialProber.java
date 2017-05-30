package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum UsbSerialProber {
    ;

    @Deprecated
    public static UsbSerialDriver acquire(UsbManager usbManager) {
        return findFirstDevice(usbManager);
    }

    @Deprecated
    public static UsbSerialDriver acquire(UsbManager usbManager, UsbDevice usbDevice) {
        List probeSingleDevice = probeSingleDevice(usbManager, usbDevice);
        return !probeSingleDevice.isEmpty() ? (UsbSerialDriver) probeSingleDevice.get(0) : null;
    }

    public static List<UsbSerialDriver> findAllDevices(UsbManager usbManager) {
        List<UsbSerialDriver> arrayList = new ArrayList();
        for (UsbDevice probeSingleDevice : usbManager.getDeviceList().values()) {
            arrayList.addAll(probeSingleDevice(usbManager, probeSingleDevice));
        }
        return arrayList;
    }

    public static UsbSerialDriver findFirstDevice(UsbManager usbManager) {
        for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
            for (UsbSerialProber probe : values()) {
                List probe2 = probe.probe(usbManager, usbDevice);
                if (!probe2.isEmpty()) {
                    return (UsbSerialDriver) probe2.get(0);
                }
            }
        }
        return null;
    }

    public static List<UsbSerialDriver> probeSingleDevice(UsbManager usbManager, UsbDevice usbDevice) {
        List<UsbSerialDriver> arrayList = new ArrayList();
        for (UsbSerialProber probe : values()) {
            arrayList.addAll(probe.probe(usbManager, usbDevice));
        }
        return arrayList;
    }

    private static boolean testIfSupported(UsbDevice usbDevice, Map<Integer, int[]> map) {
        int[] iArr = (int[]) map.get(Integer.valueOf(usbDevice.getVendorId()));
        if (iArr == null) {
            return false;
        }
        int productId = usbDevice.getProductId();
        for (int i : iArr) {
            if (productId == i) {
                return true;
            }
        }
        return false;
    }

    protected abstract List<UsbSerialDriver> probe(UsbManager usbManager, UsbDevice usbDevice);
}
