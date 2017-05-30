package com.xiaomi.xmpush.thrift;

import com.tencent.tauth.AuthActivity;
import com.xiaomi.market.sdk.j;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum ab$a {
    ACTION((short) 1, AuthActivity.ACTION_KEY),
    ENCRYPT_ACTION((short) 2, "encryptAction"),
    IS_REQUEST((short) 3, "isRequest"),
    PUSH_ACTION((short) 4, "pushAction"),
    APPID((short) 5, "appid"),
    PACKAGE_NAME((short) 6, j.W),
    TARGET((short) 7, "target"),
    META_INFO((short) 8, "metaInfo");
    
    private static final Map<String, ab$a> i = null;
    private final short j;
    private final String k;

    static {
        i = new HashMap();
        Iterator it = EnumSet.allOf(ab$a.class).iterator();
        while (it.hasNext()) {
            ab$a com_xiaomi_xmpush_thrift_ab_a = (ab$a) it.next();
            i.put(com_xiaomi_xmpush_thrift_ab_a.a(), com_xiaomi_xmpush_thrift_ab_a);
        }
    }

    private ab$a(short s, String str) {
        this.j = s;
        this.k = str;
    }

    public String a() {
        return this.k;
    }
}
