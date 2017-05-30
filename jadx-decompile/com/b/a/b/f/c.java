package com.b.a.b.f;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.b.a.b.d;

public class c implements OnScrollListener {
    private d a;
    private final boolean b;
    private final boolean c;
    private final OnScrollListener d;

    public c(d dVar, boolean z, boolean z2) {
        this(dVar, z, z2, null);
    }

    public c(d dVar, boolean z, boolean z2, OnScrollListener onScrollListener) {
        this.a = dVar;
        this.b = z;
        this.c = z2;
        this.d = onScrollListener;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.d != null) {
            this.d.onScroll(absListView, i, i2, i3);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 0:
                this.a.j();
                break;
            case 1:
                if (this.b) {
                    this.a.i();
                    break;
                }
                break;
            case 2:
                if (this.c) {
                    this.a.i();
                    break;
                }
                break;
        }
        if (this.d != null) {
            this.d.onScrollStateChanged(absListView, i);
        }
    }
}
