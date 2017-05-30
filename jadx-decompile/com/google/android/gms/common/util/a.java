package com.google.android.gms.common.util;

import android.support.v4.util.ArrayMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

public class a<E> extends AbstractSet<E> {
    private final ArrayMap<E, E> a;

    public a() {
        this.a = new ArrayMap();
    }

    public a(int i) {
        this.a = new ArrayMap(i);
    }

    public a(Collection<E> collection) {
        this(collection.size());
        addAll(collection);
    }

    public boolean a(a<? extends E> aVar) {
        int size = size();
        this.a.putAll(aVar.a);
        return size() > size;
    }

    public boolean add(E e) {
        if (this.a.containsKey(e)) {
            return false;
        }
        this.a.put(e, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return collection instanceof a ? a((a) collection) : super.addAll(collection);
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public Iterator<E> iterator() {
        return this.a.keySet().iterator();
    }

    public boolean remove(Object obj) {
        if (!this.a.containsKey(obj)) {
            return false;
        }
        this.a.remove(obj);
        return true;
    }

    public int size() {
        return this.a.size();
    }
}
