package org.a.a.o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class c {
    public static Charset a(String str) {
        Charset charset = null;
        if (str != null) {
            try {
                charset = Charset.forName(str);
            } catch (UnsupportedCharsetException e) {
            }
        }
        return charset;
    }

    public static Charset b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e) {
            throw new UnsupportedEncodingException(str);
        }
    }
}
