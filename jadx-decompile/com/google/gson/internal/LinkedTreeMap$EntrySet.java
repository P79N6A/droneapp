package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class LinkedTreeMap$EntrySet extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ LinkedTreeMap this$0;

    LinkedTreeMap$EntrySet(LinkedTreeMap linkedTreeMap) {
        this.this$0 = linkedTreeMap;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return (obj instanceof Entry) && this.this$0.findByEntry((Entry) obj) != null;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new LinkedTreeMap$LinkedTreeMapIterator<Entry<K, V>>() {
            {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap$EntrySet.this.this$0;
            }

            public Entry<K, V> next() {
                return nextNode();
            }
        };
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        LinkedTreeMap$Node findByEntry = this.this$0.findByEntry((Entry) obj);
        if (findByEntry == null) {
            return false;
        }
        this.this$0.removeInternal(findByEntry, true);
        return true;
    }

    public int size() {
        return this.this$0.size;
    }
}
