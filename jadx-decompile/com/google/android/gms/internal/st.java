package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;

public interface st {

    public interface a {
        public static final a a = new a() {
            public Handler a(Looper looper) {
                return new Handler(looper);
            }
        };

        Handler a(Looper looper);
    }
}
