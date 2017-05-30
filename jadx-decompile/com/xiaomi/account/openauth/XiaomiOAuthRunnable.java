package com.xiaomi.account.openauth;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class XiaomiOAuthRunnable<V> implements Runnable {
    private static ExecutorService sTaskExecutor = Executors.newCachedThreadPool();
    protected XiaomiOAuthFutureImpl<V> mFuture = new XiaomiOAuthFutureImpl();

    XiaomiOAuthRunnable() {
    }

    protected abstract void doRun();

    public final void run() {
        doRun();
    }

    XiaomiOAuthFutureImpl<V> start() {
        sTaskExecutor.execute(this);
        return this.mFuture;
    }
}
