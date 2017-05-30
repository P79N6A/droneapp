package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedTreeMap$LinkedTreeMapIterator<T> implements Iterator<T> {
    int expectedModCount;
    LinkedTreeMap$Node<K, V> lastReturned;
    LinkedTreeMap$Node<K, V> next;
    final /* synthetic */ LinkedTreeMap this$0;

    private LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap linkedTreeMap) {
        this.this$0 = linkedTreeMap;
        this.next = this.this$0.header.next;
        this.lastReturned = null;
        this.expectedModCount = this.this$0.modCount;
    }

    public final boolean hasNext() {
        return this.next != this.this$0.header;
    }

    final LinkedTreeMap$Node<K, V> nextNode() {
        LinkedTreeMap$Node<K, V> linkedTreeMap$Node = this.next;
        if (linkedTreeMap$Node == this.this$0.header) {
            throw new NoSuchElementException();
        } else if (this.this$0.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        } else {
            this.next = linkedTreeMap$Node.next;
            this.lastReturned = linkedTreeMap$Node;
            return linkedTreeMap$Node;
        }
    }

    public final void remove() {
        if (this.lastReturned == null) {
            throw new IllegalStateException();
        }
        this.this$0.removeInternal(this.lastReturned, true);
        this.lastReturned = null;
        this.expectedModCount = this.this$0.modCount;
    }
}
