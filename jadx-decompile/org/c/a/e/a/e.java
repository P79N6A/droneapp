package org.c.a.e.a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class e extends AssertionError {
    private static final long serialVersionUID = 1;

    public e(Throwable th, String str, Object... objArr) {
        super(String.format("%s(%s)", new Object[]{str, a(", ", objArr)}));
        initCause(th);
    }

    private static String a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Throwable th) {
            return "[toString failed]";
        }
    }

    public static String a(String str, Collection<Object> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            stringBuilder.append(a(it.next()));
            if (it.hasNext()) {
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }

    public static String a(String str, Object... objArr) {
        return a(str, Arrays.asList(objArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
