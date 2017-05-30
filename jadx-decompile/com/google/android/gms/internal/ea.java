package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class ea<T> {
    protected Map<String, ea<?>> a;

    private static class a implements Iterator<ea<?>> {
        private a() {
        }

        public ea<?> a() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<ea<?>> a() {
        return new a();
    }

    public void a(String str, ea<?> eaVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, eaVar);
    }

    public boolean a(String str) {
        return this.a != null && this.a.containsKey(str);
    }

    public ea<?> b(String str) {
        return this.a != null ? (ea) this.a.get(str) : ee.e;
    }

    public abstract T b();

    protected Iterator<ea<?>> c() {
        if (this.a == null) {
            return new a();
        }
        final Iterator it = this.a.keySet().iterator();
        return new Iterator<ea<?>>(this) {
            final /* synthetic */ ea b;

            public ea<?> a() {
                return new ej((String) it.next());
            }

            public boolean hasNext() {
                return it.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    public boolean c(String str) {
        return false;
    }

    public aqe d(String str) {
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 56).append("Attempting to access Native Method ").append(str).append(" on unsupported type.").toString());
    }

    public abstract String toString();
}
