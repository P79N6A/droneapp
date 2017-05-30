package com.xiaomi.push.service;

import com.xiaomi.push.service.aw.b;

public class aw$a implements Runnable {
    b a;
    String b;
    final /* synthetic */ aw c;

    public aw$a(aw awVar) {
        this.c = awVar;
    }

    public void run() {
        aw.b(this.c).put(this.b, this.a);
        aw.a(this.c, "Add uploader, provider is " + this.b);
    }
}
