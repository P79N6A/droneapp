package com.google.android.gms.internal;

public class ob extends RuntimeException {
    public ob(String str) {
        super(str);
    }

    public ob(String str, Throwable th) {
        super(str, th);
    }

    public ob(Throwable th) {
        super(th);
    }
}
