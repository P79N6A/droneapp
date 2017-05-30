package com.fimi.soul.module.flyplannermedia;

import com.fimi.soul.entity.WifiDistanceFile;
import java.util.Comparator;

public class c implements Comparator<WifiDistanceFile> {
    public int a(WifiDistanceFile wifiDistanceFile, WifiDistanceFile wifiDistanceFile2) {
        return -wifiDistanceFile.getName().compareTo(wifiDistanceFile2.getName());
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((WifiDistanceFile) obj, (WifiDistanceFile) obj2);
    }
}
