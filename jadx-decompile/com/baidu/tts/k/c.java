package com.baidu.tts.k;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class c<A extends b<A, R>, R extends a> {
    private final ConcurrentMap<A, Future<R>> a = new ConcurrentHashMap();

    private A b(A a) {
        for (b bVar : this.a.keySet()) {
            if (a.compareTo(bVar) == 0) {
                return bVar;
            }
        }
        return null;
    }

    public R a(A a) {
        Future future;
        Future futureTask;
        b b = b(a);
        Future future2 = b != null ? (Future) this.a.get(b) : null;
        if (future2 != null) {
            LoggerProxy.d("Memorizer", "+ get f=" + future2);
            a aVar = (a) future2.get();
            LoggerProxy.d("Memorizer", "- get f=" + future2);
            if (!aVar.g()) {
                LoggerProxy.d("Memorizer", "arg invalid r=" + aVar);
                this.a.remove(b);
                future = null;
                if (future == null) {
                    futureTask = new FutureTask(a);
                    future = (Future) this.a.putIfAbsent(a, futureTask);
                    if (future == null) {
                        LoggerProxy.d("Memorizer", "+ run f=" + futureTask);
                        futureTask.run();
                        LoggerProxy.d("Memorizer", "- run f=" + futureTask);
                        return (a) futureTask.get();
                    }
                }
                futureTask = future;
                return (a) futureTask.get();
            }
        }
        future = future2;
        if (future == null) {
            futureTask = new FutureTask(a);
            future = (Future) this.a.putIfAbsent(a, futureTask);
            if (future == null) {
                LoggerProxy.d("Memorizer", "+ run f=" + futureTask);
                futureTask.run();
                LoggerProxy.d("Memorizer", "- run f=" + futureTask);
                return (a) futureTask.get();
            }
        }
        futureTask = future;
        try {
            return (a) futureTask.get();
        } catch (ExecutionException e) {
            this.a.remove(a, futureTask);
            throw ((Exception) e.getCause());
        } catch (Exception e2) {
            this.a.remove(a, futureTask);
            throw e2;
        }
    }

    public void a() {
        if (this.a != null) {
            this.a.clear();
        }
    }
}
