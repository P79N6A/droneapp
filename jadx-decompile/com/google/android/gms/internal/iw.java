package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

public interface iw {
    public static final iw a = new iw() {
        public void a(Thread thread, String str) {
            thread.setName(str);
        }

        public void a(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        public void a(Thread thread, boolean z) {
            thread.setDaemon(z);
        }
    };

    void a(Thread thread, String str);

    void a(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler);

    void a(Thread thread, boolean z);
}
