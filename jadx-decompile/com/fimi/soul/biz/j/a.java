package com.fimi.soul.biz.j;

import java.util.Observable;

public class a extends Observable {
    private boolean a;

    public void a(boolean z) {
        if ((!this.a) == z) {
            setChanged();
            notifyObservers();
        }
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}
