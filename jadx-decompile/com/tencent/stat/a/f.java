package com.tencent.stat.a;

import com.google.android.gms.location.places.d;

public enum f {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(1000),
    ADDITION(1001),
    MONITOR_STAT(1002),
    MTA_GAME_USER(1003),
    NETWORK_MONITOR(d.aW);
    
    private int i;

    private f(int i) {
        this.i = i;
    }

    public int a() {
        return this.i;
    }
}