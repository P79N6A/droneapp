package com.xiaomi.xmpush.thrift;

import com.google.android.gms.location.places.d;

public enum e {
    UploadSwitch(1),
    UploadFrequency(2),
    ScreenSizeCollectionSwitch(3),
    MacCollectionSwitch(4),
    IMSICollectionSwitch(5),
    AndroidVnCollectionSwitch(6),
    AndroidVcCollectionSwitch(7),
    AndroidIdCollectionSwitch(8),
    DeviceInfoCollectionFrequency(9),
    AppInstallListCollectionSwitch(10),
    AppInstallListCollectionFrequency(11),
    AppActiveListCollectionSwitch(12),
    AppActiveListCollectionFrequency(13),
    BluetoothCollectionSwitch(14),
    BluetoothCollectionFrequency(15),
    LocationCollectionSwitch(16),
    LocationCollectionFrequency(17),
    AccountCollectionSwitch(18),
    AccountCollectionFrequency(19),
    WifiCollectionSwitch(20),
    WifiCollectionFrequency(21),
    CellularCollectionSwitch(22),
    CellularCollectionFrequency(23),
    TopAppCollectionSwitch(24),
    TopAppCollectionFrequency(25),
    DataCollectionSwitch(26),
    OcVersionCheckFrequency(27),
    SyncInfoFrequency(28),
    UploadNotificationInfoFrequency(29),
    UploadNotificationInfoMaxNum(30),
    CollectionNotificationInfoBaseSwitch(31),
    CollectionNotificationInfoAppSwitch(32),
    CollectionNotificationInfoRemovedSwitch(33),
    ForegroundServiceSwitch(34),
    SyncMIIDFrequency(35),
    Upload4GSwitch(36),
    Upload4GFrequency(37),
    Upload3GSwitch(38),
    Upload3GFrequency(39),
    ShieldTypeConfig(40),
    UploadWIFIGeoLocFrequency(41),
    UploadNOWIFIGeoLocFrequency(42),
    CollectionDataPluginVersion(1001),
    CollectionPluginDownloadUrl(1002),
    CollectionPluginMd5(1003),
    CollectionPluginForceStop(d.aW);
    
    private final int U;

    private e(int i) {
        this.U = i;
    }

    public int a() {
        return this.U;
    }
}
