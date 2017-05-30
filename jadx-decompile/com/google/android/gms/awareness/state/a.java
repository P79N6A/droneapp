package com.google.android.gms.awareness.state;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface a {
    public static final int a = 1;
    public static final int b = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int a();
}
