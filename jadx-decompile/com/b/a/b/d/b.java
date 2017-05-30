package com.b.a.b.d;

import com.facebook.common.util.UriUtil;
import java.io.InputStream;
import java.util.Locale;

public interface b {

    public enum a {
        HTTP(UriUtil.HTTP_SCHEME),
        HTTPS(UriUtil.HTTPS_SCHEME),
        FILE(UriUtil.LOCAL_FILE_SCHEME),
        CONTENT("content"),
        ASSETS("assets"),
        DRAWABLE("drawable"),
        UNKNOWN("");
        
        private String h;
        private String i;

        private a(String str) {
            this.h = str;
            this.i = str + "://";
        }

        public static a a(String str) {
            if (str != null) {
                for (a aVar : values()) {
                    if (aVar.d(str)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        private boolean d(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.i);
        }

        public String b(String str) {
            return this.i + str;
        }

        public String c(String str) {
            if (d(str)) {
                return str.substring(this.i.length());
            }
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[]{str, this.h}));
        }
    }

    InputStream a(String str, Object obj);
}
