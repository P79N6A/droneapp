package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.d;

public class X11StorageTask extends X11Task {
    public X11StorageTask(d dVar) {
        super(dVar);
    }

    protected void doNext() {
        getContext().r().c(getCurrentKey());
    }
}
