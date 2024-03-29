package com.baidu.tts.client.model;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BasicHandler<T> {
    private FutureTask<T> a;

    public BasicHandler(FutureTask<T> futureTask) {
        this.a = futureTask;
    }

    public boolean cancel() {
        return this.a.cancel(true);
    }

    public T get() {
        T t = null;
        try {
            LoggerProxy.d("BasicHandler", "before get");
            t = this.a.get(l.DEFAULT.a(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LoggerProxy.d("BasicHandler", e.toString());
        } catch (ExecutionException e2) {
            LoggerProxy.d("BasicHandler", e2.getCause().toString());
        } catch (TimeoutException e3) {
            LoggerProxy.d("BasicHandler", e3.toString());
        }
        return t;
    }

    public void start() {
        new Thread(this.a).start();
    }
}
