package com.fimi.soul.module.flyplannermedia;

import java.util.ArrayList;
import java.util.List;

public class a<T> {
    private int a = 12;
    private int b = 0;
    private int c = 0;
    private List<List<T>> d = null;
    private a<T> e;

    public interface a<T> {
        boolean a(T t);
    }

    public a(List<T> list) {
        a((List) list);
    }

    public a(List<T> list, int i) {
        this.a = i;
        a((List) list);
    }

    private void a(List<T> list) {
        this.d = new ArrayList();
        int size = ((list.size() - 1) / this.a) + 1;
        for (int i = 0; i < size; i++) {
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3 = (this.a * i) + i2;
                if (i3 < list.size()) {
                    arrayList.add(list.get(i3));
                }
            }
            this.d.add(arrayList);
        }
    }

    public int a() {
        return this.a;
    }

    public void a(a<T> aVar) {
        this.e = aVar;
    }

    public boolean b() {
        if (this.e == null || this.c >= this.a || this.b >= this.d.size() || this.c >= ((List) this.d.get(this.b)).size()) {
            return false;
        }
        Object obj = ((List) this.d.get(this.b)).get(this.c);
        this.c++;
        this.e.a(obj);
        return true;
    }

    public void c() {
        this.b = 0;
        this.c = 0;
    }

    public boolean d() {
        if (this.b >= this.d.size() || this.c < ((List) this.d.get(this.b)).size()) {
            return false;
        }
        this.b++;
        this.c = 0;
        return true;
    }
}
