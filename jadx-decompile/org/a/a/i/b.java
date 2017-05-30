package org.a.a.i;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.a.a.e.a;

public final class b {
    public static CharsetDecoder a(a aVar) {
        if (aVar == null) {
            return null;
        }
        Charset c = aVar.c();
        CodingErrorAction d = aVar.d();
        CodingErrorAction e = aVar.e();
        if (c == null) {
            return null;
        }
        CharsetDecoder newDecoder = c.newDecoder();
        if (d == null) {
            d = CodingErrorAction.REPORT;
        }
        return newDecoder.onMalformedInput(d).onUnmappableCharacter(e != null ? e : CodingErrorAction.REPORT);
    }

    public static CharsetEncoder b(a aVar) {
        if (aVar == null) {
            return null;
        }
        Charset c = aVar.c();
        if (c == null) {
            return null;
        }
        CodingErrorAction d = aVar.d();
        CodingErrorAction e = aVar.e();
        CharsetEncoder newEncoder = c.newEncoder();
        if (d == null) {
            d = CodingErrorAction.REPORT;
        }
        return newEncoder.onMalformedInput(d).onUnmappableCharacter(e != null ? e : CodingErrorAction.REPORT);
    }
}
