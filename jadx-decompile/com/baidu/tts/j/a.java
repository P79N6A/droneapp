package com.baidu.tts.j;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class a implements b {
    protected final Lock d = new ReentrantLock();
    protected final Condition e = this.d.newCondition();

    public interface a {
        void a();
    }

    public synchronized void A() {
        h();
    }

    public void B() {
        Thread.currentThread().interrupt();
    }

    public boolean C() {
        try {
            a(null);
        } catch (InterruptedException e) {
            B();
        }
        return !n();
    }

    public void a(a aVar) {
        while (m()) {
            b(aVar);
        }
    }

    public synchronized TtsError b() {
        return g();
    }

    public void b(a aVar) {
        try {
            this.d.lock();
            if (aVar != null) {
                aVar.a();
            }
            LoggerProxy.d("ASafeLife", "before await");
            this.e.await();
            LoggerProxy.d("ASafeLife", "after await");
        } finally {
            this.d.unlock();
        }
    }

    public synchronized void c() {
        i();
        try {
            this.d.lock();
            this.e.signalAll();
            this.d.unlock();
        } catch (Exception e) {
            e.printStackTrace();
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
        }
    }

    public synchronized void d() {
        j();
    }

    public synchronized void e() {
        k();
    }

    public synchronized void f() {
        l();
    }

    protected abstract TtsError g();

    protected abstract void h();

    protected abstract void i();

    protected abstract void j();

    protected abstract void k();

    protected abstract void l();

    public abstract boolean m();

    public abstract boolean n();
}
