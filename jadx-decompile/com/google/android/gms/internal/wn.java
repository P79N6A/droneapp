package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.l;
import java.util.LinkedList;
import java.util.List;

@aaa
class wn {
    private final List<a> a = new LinkedList();

    wn() {
    }

    void a(l lVar) {
        lVar.a(new 1(this));
        lVar.a(new 2(this));
        lVar.a(new 3(this));
        lVar.a(new 4(this));
        lVar.a(new 5(this));
        lVar.a(new 6(this));
    }

    void a(wo woVar) {
        Handler handler = abv.a;
        for (a 7 : this.a) {
            handler.post(new 7(this, 7, woVar));
        }
        this.a.clear();
    }
}
