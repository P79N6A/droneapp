package org.b.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class d<T> extends b<T> {
    private static final Pattern d = Pattern.compile("%([0-9]+)");
    private final String a;
    private final k<T> b;
    private final Object[] c;

    public d(String str, k<T> kVar, Object[] objArr) {
        this.a = str;
        this.b = kVar;
        this.c = (Object[]) objArr.clone();
    }

    @i
    public static <T> k<T> a(String str, k<T> kVar, Object... objArr) {
        return new d(str, kVar, objArr);
    }

    public void a(Object obj, g gVar) {
        this.b.a(obj, gVar);
    }

    public void a(g gVar) {
        Matcher matcher = d.matcher(this.a);
        int i = 0;
        while (matcher.find()) {
            gVar.a(this.a.substring(i, matcher.start()));
            gVar.a(this.c[Integer.parseInt(matcher.group(1))]);
            i = matcher.end();
        }
        if (i < this.a.length()) {
            gVar.a(this.a.substring(i));
        }
    }

    public boolean a(Object obj) {
        return this.b.a(obj);
    }
}
