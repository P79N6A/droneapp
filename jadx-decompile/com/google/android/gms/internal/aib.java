package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class aib {
    private static final ExecutorService a = Executors.newFixedThreadPool(2, new ajm("GAC_Executor"));

    public static ExecutorService a() {
        return a;
    }
}
