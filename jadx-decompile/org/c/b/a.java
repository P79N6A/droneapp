package org.c.b;

import java.util.ArrayList;
import java.util.List;

public class a extends AssertionError {
    private static final long serialVersionUID = 1;
    private final List<Integer> a = new ArrayList();
    private final String b;

    public a(String str, AssertionError assertionError, int i) {
        this.b = str;
        initCause(assertionError);
        a(i);
    }

    public void a(int i) {
        this.a.add(0, Integer.valueOf(i));
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b != null) {
            stringBuilder.append(this.b);
        }
        stringBuilder.append("arrays first differed at element ");
        for (Integer intValue : this.a) {
            int intValue2 = intValue.intValue();
            stringBuilder.append("[");
            stringBuilder.append(intValue2);
            stringBuilder.append("]");
        }
        stringBuilder.append("; ");
        stringBuilder.append(getCause().getMessage());
        return stringBuilder.toString();
    }

    public String toString() {
        return getMessage();
    }
}
