package org.a.a.c.b;

import java.nio.charset.Charset;
import java.util.List;
import org.a.a.a.c;
import org.a.a.h.e;
import org.a.a.h.j;
import org.apache.http.NameValuePair;

@c
public class h extends j {
    public h(Iterable<? extends NameValuePair> iterable) {
        this((Iterable) iterable, null);
    }

    public h(Iterable<? extends NameValuePair> iterable, Charset charset) {
        super(org.a.a.c.f.j.a((Iterable) iterable, charset != null ? charset : Charset.forName("ISO-8859-1")), e.a(org.a.a.c.f.j.a, charset));
    }

    public h(List<? extends NameValuePair> list) {
        this((Iterable) list, (Charset) null);
    }

    public h(List<? extends NameValuePair> list, String str) {
        super(org.a.a.c.f.j.a((List) list, str != null ? str : Charset.forName("ISO-8859-1").name()), e.a(org.a.a.c.f.j.a, str));
    }
}
