package com.google.gson.internal;

import java.util.Map.Entry;

final class LinkedTreeMap$Node<K, V> implements Entry<K, V> {
    int height;
    final K key;
    LinkedTreeMap$Node<K, V> left;
    LinkedTreeMap$Node<K, V> next;
    LinkedTreeMap$Node<K, V> parent;
    LinkedTreeMap$Node<K, V> prev;
    LinkedTreeMap$Node<K, V> right;
    V value;

    LinkedTreeMap$Node() {
        this.key = null;
        this.prev = this;
        this.next = this;
    }

    LinkedTreeMap$Node(LinkedTreeMap$Node<K, V> linkedTreeMap$Node, K k, LinkedTreeMap$Node<K, V> linkedTreeMap$Node2, LinkedTreeMap$Node<K, V> linkedTreeMap$Node3) {
        this.parent = linkedTreeMap$Node;
        this.key = k;
        this.height = 1;
        this.next = linkedTreeMap$Node2;
        this.prev = linkedTreeMap$Node3;
        linkedTreeMap$Node3.next = this;
        linkedTreeMap$Node2.prev = this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.key == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!this.key.equals(entry.getKey())) {
            return false;
        }
        if (this.value == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!this.value.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public LinkedTreeMap$Node<K, V> first() {
        LinkedTreeMap$Node<K, V> linkedTreeMap$Node;
        for (LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = this.left; linkedTreeMap$Node2 != null; linkedTreeMap$Node2 = linkedTreeMap$Node2.left) {
            linkedTreeMap$Node = linkedTreeMap$Node2;
        }
        return linkedTreeMap$Node;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.key == null ? 0 : this.key.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public LinkedTreeMap$Node<K, V> last() {
        LinkedTreeMap$Node<K, V> linkedTreeMap$Node;
        for (LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = this.right; linkedTreeMap$Node2 != null; linkedTreeMap$Node2 = linkedTreeMap$Node2.right) {
            linkedTreeMap$Node = linkedTreeMap$Node2;
        }
        return linkedTreeMap$Node;
    }

    public V setValue(V v) {
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }
}
