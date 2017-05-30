package com.google.firebase.c;

import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class o {
    private static final o a = new o();
    private final Map<String, WeakReference<j>> b = new HashMap();
    private final Object c = new Object();

    o() {
    }

    static o a() {
        return a;
    }

    public List<l> a(@NonNull i iVar) {
        List<l> unmodifiableList;
        synchronized (this.c) {
            List arrayList = new ArrayList();
            String iVar2 = iVar.toString();
            for (Entry entry : this.b.entrySet()) {
                if (((String) entry.getKey()).startsWith(iVar2)) {
                    j jVar = (j) ((WeakReference) entry.getValue()).get();
                    if (jVar instanceof l) {
                        arrayList.add((l) jVar);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public void a(j jVar) {
        synchronized (this.c) {
            this.b.put(jVar.l().toString(), new WeakReference(jVar));
        }
    }

    public List<c> b(@NonNull i iVar) {
        List<c> unmodifiableList;
        synchronized (this.c) {
            List arrayList = new ArrayList();
            String iVar2 = iVar.toString();
            for (Entry entry : this.b.entrySet()) {
                if (((String) entry.getKey()).startsWith(iVar2)) {
                    j jVar = (j) ((WeakReference) entry.getValue()).get();
                    if (jVar instanceof c) {
                        arrayList.add((c) jVar);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public void b(j jVar) {
        synchronized (this.c) {
            String iVar = jVar.l().toString();
            WeakReference weakReference = (WeakReference) this.b.get(iVar);
            j jVar2 = weakReference != null ? (j) weakReference.get() : null;
            if (jVar2 == null || jVar2 == jVar) {
                this.b.remove(iVar);
            }
        }
    }
}
