package com.baidu.tts.d;

import java.util.HashMap;
import java.util.Map;

public class a {
    private boolean a = false;
    private Map<String, Integer> b = new HashMap();

    public void a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
    }

    public void a(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        for (Integer intValue : this.b.values()) {
            if (intValue.intValue() != 7) {
                return false;
            }
        }
        return true;
    }
}
