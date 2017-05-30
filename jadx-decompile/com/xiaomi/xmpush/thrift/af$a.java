package com.xiaomi.xmpush.thrift;

import com.mi.live.openlivesdk.a;
import com.xiaomi.market.sdk.j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum af$a {
    DEBUG((short) 1, a.c),
    TARGET((short) 2, "target"),
    ID((short) 3, "id"),
    APP_ID((short) 4, "appId"),
    APP_VERSION((short) 5, "appVersion"),
    PACKAGE_NAME((short) 6, j.W),
    TOKEN((short) 7, Constants.EXTRA_KEY_TOKEN),
    DEVICE_ID((short) 8, j.as),
    ALIAS_NAME((short) 9, "aliasName"),
    SDK_VERSION((short) 10, "sdkVersion"),
    REG_ID((short) 11, "regId"),
    PUSH_SDK_VERSION_NAME((short) 12, "pushSdkVersionName"),
    PUSH_SDK_VERSION_CODE((short) 13, "pushSdkVersionCode"),
    APP_VERSION_CODE((short) 14, "appVersionCode"),
    ANDROID_ID((short) 15, "androidId"),
    IMEI((short) 16, "imei"),
    SERIAL((short) 17, "serial"),
    IMEI_MD5((short) 18, "imeiMd5"),
    SPACE_ID((short) 19, "spaceId"),
    REASON((short) 20, "reason"),
    CONNECTION_ATTRS((short) 100, "connectionAttrs"),
    CLEAN_OLD_REG_INFO((short) 101, "cleanOldRegInfo"),
    OLD_REG_ID((short) 102, "oldRegId");
    
    private static final Map<String, af$a> x = null;
    private final short y;
    private final String z;

    static {
        x = new HashMap();
        Iterator it = EnumSet.allOf(af$a.class).iterator();
        while (it.hasNext()) {
            af$a com_xiaomi_xmpush_thrift_af_a = (af$a) it.next();
            x.put(com_xiaomi_xmpush_thrift_af_a.a(), com_xiaomi_xmpush_thrift_af_a);
        }
    }

    private af$a(short s, String str) {
        this.y = s;
        this.z = str;
    }

    public String a() {
        return this.z;
    }
}
