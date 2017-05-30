package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class n<T> extends i<T> {
    private T c;

    public n(b<T> bVar) {
        super(bVar);
    }

    public T next() {
        if (hasNext()) {
            this.b++;
            if (this.b == 0) {
                this.c = this.a.a(0);
                if (!(this.c instanceof j)) {
                    String valueOf = String.valueOf(this.c.getClass());
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 44).append("DataBuffer reference of type ").append(valueOf).append(" is not movable").toString());
                }
            }
            ((j) this.c).a(this.b);
            return this.c;
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }
}
