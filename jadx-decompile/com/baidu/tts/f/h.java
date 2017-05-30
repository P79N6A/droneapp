package com.baidu.tts.f;

public enum h {
    ZH("chinese", "ZH"),
    EN("english", "EN");
    
    private final String c;
    private final String d;

    private h(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public static h a(String str) {
        for (h hVar : values()) {
            if (hVar.a().equalsIgnoreCase(str)) {
                return hVar;
            }
        }
        return null;
    }

    public String a() {
        return this.d;
    }
}
