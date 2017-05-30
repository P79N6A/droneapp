package com.google.android.gms.internal;

import java.util.Comparator;

public class hi<A extends Comparable<A>> implements Comparator<A> {
    private static hi a = new hi();

    private hi() {
    }

    public static <T extends Comparable<T>> hi<T> a(Class<T> cls) {
        return a;
    }

    public int a(A a, A a2) {
        return a.compareTo(a2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }
}
