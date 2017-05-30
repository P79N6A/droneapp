package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ha<K, V> implements Iterator<Entry<K, V>> {
    private final Stack<hg<K, V>> a = new Stack();
    private final boolean b;

    ha(he<K, V> heVar, K k, Comparator<K> comparator, boolean z) {
        this.b = z;
        he heVar2 = heVar;
        while (!heVar2.c()) {
            int compare = k != null ? z ? comparator.compare(k, heVar2.d()) : comparator.compare(heVar2.d(), k) : 1;
            if (compare < 0) {
                heVar2 = z ? heVar2.f() : heVar2.g();
            } else if (compare == 0) {
                this.a.push((hg) heVar2);
                return;
            } else {
                this.a.push((hg) heVar2);
                heVar2 = z ? heVar2.g() : heVar2.f();
            }
        }
    }

    public Entry<K, V> a() {
        try {
            hg hgVar = (hg) this.a.pop();
            Entry simpleEntry = new SimpleEntry(hgVar.d(), hgVar.e());
            he f;
            if (this.b) {
                for (f = hgVar.f(); !f.c(); f = f.g()) {
                    this.a.push((hg) f);
                }
            } else {
                for (f = hgVar.g(); !f.c(); f = f.f()) {
                    this.a.push((hg) f);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.a.size() > 0;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
