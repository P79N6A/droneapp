package com.baidu.tts.f;

import com.fimi.soul.utils.m;

public enum c {
    BV_16K("16K", "0"),
    AMR_6K6("6K6", "0"),
    AMR_8K85("16K", "1"),
    AMR_12K65("16K", "2"),
    AMR_14K25("16K", "3"),
    AMR_15K85("16K", "4"),
    AMR_18K25("16K", "5"),
    AMR_19K85("16K", "6"),
    AMR_23K05("16K", m.l),
    AMR_23K85("16K", m.m),
    OPUS_8K("16K", "0"),
    OPUS_16K("16K", "1"),
    OPUS_18K("16K", "2"),
    OPUS_20K("16K", "3"),
    OPUS_24K("16K", "4"),
    OPUS_32K("16K", "5"),
    MP3_8K("16K", "0"),
    MP3_11K("16K", "1"),
    MP3_16K("16K", "2"),
    MP3_24K("16K", "3"),
    MP3_32K("16K", "4");
    
    private final String v;
    private final String w;

    private c(String str, String str2) {
        this.v = str;
        this.w = str2;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (cVar.a().equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public String a() {
        return this.w;
    }
}
