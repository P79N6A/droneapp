package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class LinkedTreeMap$KeySet extends AbstractSet<K> {
    final /* synthetic */ LinkedTreeMap this$0;

    LinkedTreeMap$KeySet(LinkedTreeMap linkedTreeMap) {
        this.this$0 = linkedTreeMap;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Iterator<K> iterator() {
        return new LinkedTreeMap$LinkedTreeMapIterator<K>() {
            {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap$KeySet.this.this$0;
            }

            public K next() {
                return nextNode().key;
            }
        };
    }

    public boolean remove(Object obj) {
        return this.this$0.removeInternalByKey(obj) != null;
    }

    public int size() {
        return this.this$0.size;
    }
}
