package org.b;

import java.util.Arrays;
import java.util.Iterator;
import org.b.b.d;

public abstract class a implements g {
    private <T> g a(String str, String str2, String str3, Iterator<T> it) {
        return b(str, str2, str3, new d(it));
    }

    private String b(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    private g b(String str, String str2, String str3, Iterator<? extends m> it) {
        Object obj = null;
        b(str);
        while (it.hasNext()) {
            if (obj != null) {
                b(str2);
            }
            a((m) it.next());
            obj = 1;
        }
        b(str3);
        return this;
    }

    private void b(char c) {
        switch (c) {
            case '\t':
                b("\\t");
                return;
            case '\n':
                b("\\n");
                return;
            case '\r':
                b("\\r");
                return;
            case '\"':
                b("\\\"");
                return;
            default:
                a(c);
                return;
        }
    }

    private void c(String str) {
        a((char) l.e);
        for (int i = 0; i < str.length(); i++) {
            b(str.charAt(i));
        }
        a((char) l.e);
    }

    public g a(Object obj) {
        if (obj == null) {
            b("null");
        } else if (obj instanceof String) {
            c((String) obj);
        } else if (obj instanceof Character) {
            a((char) l.e);
            b(((Character) obj).charValue());
            a((char) l.e);
        } else if (obj instanceof Short) {
            a('<');
            b(b(obj));
            b("s>");
        } else if (obj instanceof Long) {
            a('<');
            b(b(obj));
            b("L>");
        } else if (obj instanceof Float) {
            a('<');
            b(b(obj));
            b("F>");
        } else if (obj.getClass().isArray()) {
            a("[", ", ", "]", new org.b.b.a(obj));
        } else {
            a('<');
            b(b(obj));
            a('>');
        }
        return this;
    }

    public g a(String str) {
        b(str);
        return this;
    }

    public <T> g a(String str, String str2, String str3, Iterable<T> iterable) {
        return a(str, str2, str3, iterable.iterator());
    }

    public <T> g a(String str, String str2, String str3, T... tArr) {
        return a(str, str2, str3, Arrays.asList(tArr));
    }

    public g a(m mVar) {
        mVar.a(this);
        return this;
    }

    protected abstract void a(char c);

    public g b(String str, String str2, String str3, Iterable<? extends m> iterable) {
        return b(str, str2, str3, iterable.iterator());
    }

    protected void b(String str) {
        for (int i = 0; i < str.length(); i++) {
            a(str.charAt(i));
        }
    }
}
