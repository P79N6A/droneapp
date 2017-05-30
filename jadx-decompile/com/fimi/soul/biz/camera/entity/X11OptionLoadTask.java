package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.d;

public class X11OptionLoadTask extends X11Task {
    public X11OptionLoadTask(d dVar) {
        super(dVar);
    }

    protected void doNext() {
        getContext().r().a(getCurrentKey());
    }
}
