package com.xiaomi.infra.galaxy.fds.android.model;

public class ExpiresParam extends UserParam {
    private static final String EXPIRES = "expires";

    public ExpiresParam(long j) {
        this.params.put(EXPIRES, Long.toString(j));
    }
}
