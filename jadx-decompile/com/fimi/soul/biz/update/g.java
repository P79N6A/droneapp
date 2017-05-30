package com.fimi.soul.biz.update;

import com.fimi.soul.entity.FirmwareInfo;
import java.util.Comparator;

public class g implements Comparator {
    public int compare(Object obj, Object obj2) {
        return ((FirmwareInfo) obj).getSort() > ((FirmwareInfo) obj2).getSort() ? 1 : -1;
    }
}
