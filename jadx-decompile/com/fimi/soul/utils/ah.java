package com.fimi.soul.utils;

import android.annotation.SuppressLint;
import java.util.LinkedList;

public class ah {
    private LinkedList a = new LinkedList();
    private int b = 10;

    @SuppressLint({"NewApi"})
    public Object a() {
        return this.a.peekFirst();
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(Object obj) {
        if (this.b <= 0) {
            this.a.removeFirst();
        }
        this.a.addLast(obj);
        this.b--;
    }

    public void a(LinkedList linkedList) {
        this.a = linkedList;
    }

    public void b() {
        this.a.removeFirst();
    }

    public int c() {
        return this.a.size();
    }

    public LinkedList d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }
}
