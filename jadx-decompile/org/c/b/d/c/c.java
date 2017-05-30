package org.c.b.d.c;

import java.lang.Thread.State;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.c.f.a.f;
import org.c.f.a.j;
import org.c.f.a.l;

public class c extends j {
    private final j a;
    private final TimeUnit b;
    private final long c;
    private final boolean d;
    private volatile ThreadGroup e;

    private c(a aVar, j jVar) {
        this.e = null;
        this.a = jVar;
        this.c = a.a(aVar);
        this.b = a.b(aVar);
        this.d = a.c(aVar);
    }

    @Deprecated
    public c(j jVar, long j) {
        this(b().a(j, TimeUnit.MILLISECONDS), jVar);
    }

    private Exception a(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread c = this.d ? c(thread) : null;
        Exception lVar = new l(this.c, this.b);
        if (stackTrace != null) {
            lVar.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (c == null) {
            return lVar;
        }
        new Exception("Appears to be stuck in thread " + c.getName()).setStackTrace(b(c));
        return new f(Arrays.asList(new Throwable[]{lVar, new Exception("Appears to be stuck in thread " + c.getName())}));
    }

    private Throwable a(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            return this.c > 0 ? (Throwable) futureTask.get(this.c, this.b) : (Throwable) futureTask.get();
        } catch (Throwable e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException e3) {
            return a(thread);
        }
    }

    private Thread[] a(ThreadGroup threadGroup) {
        int max = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[max];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < max) {
                return a(threadArr, enumerate);
            }
            max += 100;
            i++;
        } while (i < 5);
        return null;
    }

    private Thread[] a(Thread[] threadArr, int i) {
        int min = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[min];
        for (int i2 = 0; i2 < min; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    public static a b() {
        return new a(null);
    }

    private StackTraceElement[] b(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException e) {
            return new StackTraceElement[0];
        }
    }

    private Thread c(Thread thread) {
        if (this.e == null) {
            return null;
        }
        Thread[] a = a(this.e);
        if (a == null) {
            return null;
        }
        int length = a.length;
        int i = 0;
        Thread thread2 = null;
        long j = 0;
        while (i < length) {
            Thread thread3;
            Thread thread4 = a[i];
            if (thread4.getState() == State.RUNNABLE) {
                long d = d(thread4);
                if (thread2 == null || d > r0) {
                    j = d;
                    thread3 = thread4;
                    i++;
                    thread2 = thread3;
                }
            }
            thread3 = thread2;
            i++;
            thread2 = thread3;
        }
        if (thread2 == thread) {
            thread2 = null;
        }
        return thread2;
    }

    private long d(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (threadMXBean.isThreadCpuTimeSupported()) {
            try {
                return threadMXBean.getThreadCpuTime(thread.getId());
            } catch (UnsupportedOperationException e) {
            }
        }
        return 0;
    }

    public void a() {
        Object bVar = new b(this, null);
        FutureTask futureTask = new FutureTask(bVar);
        this.e = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.e, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        bVar.b();
        Throwable a = a(futureTask, thread);
        if (a != null) {
            throw a;
        }
    }
}
