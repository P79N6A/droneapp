package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.a.g;
import com.google.android.gms.internal.agv;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class l {
    public static final g<e> a = new g();
    public static final g<agv> b = new g();
    public static final g<Object> c = new g();
    public static final g<Object> d = new g();
    public static final Charset e;
    public static final String f = f.b("com.google.cast.multizone");

    static {
        Charset charset = null;
        try {
            charset = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException e) {
        } catch (UnsupportedCharsetException e2) {
        }
        e = charset;
    }
}
