package org.a.a.i.b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.a.a.a.c;

@c
public class ad extends AbstractList<Object> {
    private final Set<URI> a = new HashSet();
    private final List<URI> b = new ArrayList();

    public URI a(int i) {
        return (URI) this.b.get(i);
    }

    public List<URI> a() {
        return new ArrayList(this.b);
    }

    public boolean a(URI uri) {
        return this.a.contains(uri);
    }

    public void add(int i, Object obj) {
        this.b.add(i, (URI) obj);
        this.a.add((URI) obj);
    }

    public URI b(int i) {
        URI uri = (URI) this.b.remove(i);
        this.a.remove(uri);
        if (this.b.size() != this.a.size()) {
            this.a.addAll(this.b);
        }
        return uri;
    }

    public void b(URI uri) {
        this.a.add(uri);
        this.b.add(uri);
    }

    public boolean c(URI uri) {
        boolean remove = this.a.remove(uri);
        if (remove) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((URI) it.next()).equals(uri)) {
                    it.remove();
                }
            }
        }
        return remove;
    }

    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public /* synthetic */ Object get(int i) {
        return a(i);
    }

    public /* synthetic */ Object remove(int i) {
        return b(i);
    }

    public Object set(int i, Object obj) {
        URI uri = (URI) this.b.set(i, (URI) obj);
        this.a.remove(uri);
        this.a.add((URI) obj);
        if (this.b.size() != this.a.size()) {
            this.a.addAll(this.b);
        }
        return uri;
    }

    public int size() {
        return this.b.size();
    }
}
