package com.baidu.tts.f;

public enum b {
    BV("0") {
    },
    AMR("1") {
    },
    OPUS("2") {
    };
    
    private final String d;

    private b(String str) {
        this.d = str;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.a().equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public String a() {
        return this.d;
    }
}
