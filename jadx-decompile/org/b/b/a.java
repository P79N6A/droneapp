package org.b.b;

import java.lang.reflect.Array;
import java.util.Iterator;

public class a implements Iterator<Object> {
    private final Object a;
    private int b = 0;

    public a(Object obj) {
        if (obj.getClass().isArray()) {
            this.a = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    public boolean hasNext() {
        return this.b < Array.getLength(this.a);
    }

    public Object next() {
        Object obj = this.a;
        int i = this.b;
        this.b = i + 1;
        return Array.get(obj, i);
    }

    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
