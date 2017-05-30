package com.google.android.gms.awareness.state;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface b {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 1;
    public static final int l = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    float a(int i);

    float b(int i);

    float c(int i);

    int e();

    int[] f();
}
