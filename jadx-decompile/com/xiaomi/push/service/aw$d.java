package com.xiaomi.push.service;

class aw$d implements Runnable {
    String a;
    final /* synthetic */ aw b;

    public aw$d(aw awVar, String str) {
        this.b = awVar;
        this.a = str;
    }

    public void run() {
        aw.a(this.b, this.a);
    }
}
