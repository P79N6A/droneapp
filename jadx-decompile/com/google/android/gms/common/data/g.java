package com.google.android.gms.common.data;

import java.util.ArrayList;

public final class g {
    public static <T, E extends f<T>> ArrayList<T> a(Iterable<E> iterable) {
        ArrayList<T> arrayList = new ArrayList();
        for (E a : iterable) {
            arrayList.add(a.a());
        }
        return arrayList;
    }

    public static <T, E extends f<T>> ArrayList<T> a(ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((f) arrayList.get(i)).a());
        }
        return arrayList2;
    }

    public static <T, E extends f<T>> ArrayList<T> a(E[] eArr) {
        ArrayList<T> arrayList = new ArrayList(eArr.length);
        for (f a : eArr) {
            arrayList.add(a.a());
        }
        return arrayList;
    }
}
