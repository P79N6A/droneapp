package com.baidu.tts.f;

import java.net.InetAddress;

public enum o {
    TTS_SERVER("http://tts.baidu.com/text2audio") {
        public String b() {
            String a = o.a("tts.baidu.com");
            return a != null ? "http://" + a + "/text2audio" : null;
        }
    },
    MODEL_SERVER("http://tts.baidu.com/bos/story.php?") {
        public String b() {
            return null;
        }
    },
    STATISTICS_SERVER("http://upl.baidu.com/ttsdlstats.php") {
        public String b() {
            return null;
        }
    };
    
    private final String d;

    private o(String str) {
        this.d = str;
    }

    public static String a(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String a() {
        return this.d;
    }

    public abstract String b();
}
