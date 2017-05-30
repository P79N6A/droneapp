package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class eo {
    public static final Integer a = Integer.valueOf(0);
    public static final Integer b = Integer.valueOf(1);
    private final Context c;
    private final ExecutorService d;

    public eo(Context context) {
        this(context, Executors.newSingleThreadExecutor());
    }

    eo(Context context, ExecutorService executorService) {
        this.c = context;
        this.d = executorService;
    }
}
