package com.fimi.kernel.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class y {

    static class a implements Callable<Boolean> {
        private String a;

        public a(String str) {
            this.a = str;
        }

        public Boolean a() {
            for (int i = 0; i < 999999999; i++) {
                if (i == 999999997) {
                    System.out.println(this.a);
                }
                if (Thread.interrupted()) {
                    return Boolean.valueOf(false);
                }
            }
            System.out.println("继续执行..........");
            return Boolean.valueOf(true);
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public static Boolean a(Callable<Boolean> callable, int i) {
        Boolean bool;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Boolean valueOf = Boolean.valueOf(false);
        Future submit = newSingleThreadExecutor.submit(callable);
        try {
            bool = (Boolean) submit.get((long) (i * 1000), TimeUnit.MILLISECONDS);
            try {
                System.out.println(bool);
                newSingleThreadExecutor.shutdown();
            } catch (InterruptedException e) {
                try {
                    submit.cancel(true);
                    newSingleThreadExecutor.shutdown();
                } catch (Throwable th) {
                    newSingleThreadExecutor.shutdown();
                    return bool;
                }
                return bool;
            } catch (ExecutionException e2) {
                submit.cancel(true);
                newSingleThreadExecutor.shutdown();
                return bool;
            } catch (TimeoutException e3) {
                submit.cancel(true);
                newSingleThreadExecutor.shutdown();
                return bool;
            }
        } catch (InterruptedException e4) {
            bool = valueOf;
            submit.cancel(true);
            newSingleThreadExecutor.shutdown();
            return bool;
        } catch (ExecutionException e5) {
            bool = valueOf;
            submit.cancel(true);
            newSingleThreadExecutor.shutdown();
            return bool;
        } catch (TimeoutException e6) {
            bool = valueOf;
            submit.cancel(true);
            newSingleThreadExecutor.shutdown();
            return bool;
        } catch (Throwable th2) {
            bool = valueOf;
            newSingleThreadExecutor.shutdown();
            return bool;
        }
        return bool;
    }

    public static void a(String[] strArr) {
        a(new a("传递的参数"), 2);
    }
}
