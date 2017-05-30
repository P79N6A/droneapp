package com.b.a.b.a.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.a.a.f.c.l;

public class d<E> extends AbstractQueue<E> implements a<E>, Serializable {
    private static final long serialVersionUID = -387911632671998426L;
    transient d<E> a;
    transient d<E> b;
    final ReentrantLock c;
    private transient int d;
    private final int e;
    private final Condition f;
    private final Condition g;

    private abstract class a implements Iterator<E> {
        d<E> a;
        E b;
        final /* synthetic */ d c;
        private d<E> d;

        a(d dVar) {
            this.c = dVar;
            ReentrantLock reentrantLock = dVar.c;
            reentrantLock.lock();
            try {
                this.a = a();
                this.b = this.a == null ? null : this.a.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        private d<E> b(d<E> dVar) {
            while (true) {
                d<E> a = a(dVar);
                if (a == null) {
                    return null;
                }
                if (a.a != null) {
                    return a;
                }
                if (a == dVar) {
                    return a();
                }
                dVar = a;
            }
        }

        abstract d<E> a();

        abstract d<E> a(d<E> dVar);

        void b() {
            ReentrantLock reentrantLock = this.c.c;
            reentrantLock.lock();
            try {
                this.a = b(this.a);
                this.b = this.a == null ? null : this.a.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean hasNext() {
            return this.a != null;
        }

        public E next() {
            if (this.a == null) {
                throw new NoSuchElementException();
            }
            this.d = this.a;
            E e = this.b;
            b();
            return e;
        }

        public void remove() {
            d dVar = this.d;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            this.d = null;
            ReentrantLock reentrantLock = this.c.c;
            reentrantLock.lock();
            try {
                if (dVar.a != null) {
                    this.c.a(dVar);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
            }
        }
    }

    private class b extends a {
        final /* synthetic */ d d;

        private b(d dVar) {
            this.d = dVar;
            super(dVar);
        }

        d<E> a() {
            return this.d.b;
        }

        d<E> a(d<E> dVar) {
            return dVar.b;
        }
    }

    private class c extends a {
        final /* synthetic */ d d;

        private c(d dVar) {
            this.d = dVar;
            super(dVar);
        }

        d<E> a() {
            return this.d.a;
        }

        d<E> a(d<E> dVar) {
            return dVar.c;
        }
    }

    static final class d<E> {
        E a;
        d<E> b;
        d<E> c;

        d(E e) {
            this.a = e;
        }
    }

    public d() {
        this(Integer.MAX_VALUE);
    }

    public d(int i) {
        this.c = new ReentrantLock();
        this.f = this.c.newCondition();
        this.g = this.c.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.e = i;
    }

    public d(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (Object next : collection) {
                if (next == null) {
                    throw new NullPointerException();
                } else if (!c(new d(next))) {
                    throw new IllegalStateException("Deque full");
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private boolean b(d<E> dVar) {
        if (this.d >= this.e) {
            return false;
        }
        d dVar2 = this.a;
        dVar.c = dVar2;
        this.a = dVar;
        if (this.b == null) {
            this.b = dVar;
        } else {
            dVar2.b = dVar;
        }
        this.d++;
        this.f.signal();
        return true;
    }

    private boolean c(d<E> dVar) {
        if (this.d >= this.e) {
            return false;
        }
        d dVar2 = this.b;
        dVar.b = dVar2;
        this.b = dVar;
        if (this.a == null) {
            this.a = dVar;
        } else {
            dVar2.c = dVar;
        }
        this.d++;
        this.f.signal();
        return true;
    }

    private E m() {
        d dVar = this.a;
        if (dVar == null) {
            return null;
        }
        d dVar2 = dVar.c;
        E e = dVar.a;
        dVar.a = null;
        dVar.c = dVar;
        this.a = dVar2;
        if (dVar2 == null) {
            this.b = null;
        } else {
            dVar2.b = null;
        }
        this.d--;
        this.g.signal();
        return e;
    }

    private E n() {
        d dVar = this.b;
        if (dVar == null) {
            return null;
        }
        d dVar2 = dVar.b;
        E e = dVar.a;
        dVar.a = null;
        dVar.b = dVar;
        this.b = dVar2;
        if (dVar2 == null) {
            this.a = null;
        } else {
            dVar2.c = null;
        }
        this.d--;
        this.g.signal();
        return e;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = 0;
        this.a = null;
        this.b = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(readObject);
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (d dVar = this.a; dVar != null; dVar = dVar.c) {
                objectOutputStream.writeObject(dVar.a);
            }
            objectOutputStream.writeObject(null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public E a() {
        E m;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (true) {
            try {
                m = m();
                if (m != null) {
                    break;
                }
                this.f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        return m;
    }

    public E a(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lockInterruptibly();
        long j2 = toNanos;
        while (true) {
            try {
                E m = m();
                if (m != null) {
                    reentrantLock.unlock();
                    return m;
                } else if (j2 <= 0) {
                    break;
                } else {
                    j2 = this.f.awaitNanos(j2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return null;
    }

    void a(d<E> dVar) {
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        if (dVar2 == null) {
            m();
        } else if (dVar3 == null) {
            n();
        } else {
            dVar2.c = dVar3;
            dVar3.b = dVar2;
            dVar.a = null;
            this.d--;
            this.g.signal();
        }
    }

    public void a(E e) {
        if (!c((Object) e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    public boolean a(E e, long j, TimeUnit timeUnit) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lockInterruptibly();
        while (!b(dVar)) {
            try {
                if (toNanos <= 0) {
                    return false;
                }
                toNanos = this.g.awaitNanos(toNanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
        return true;
    }

    public boolean add(E e) {
        b((Object) e);
        return true;
    }

    public E b() {
        E n;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (true) {
            try {
                n = n();
                if (n != null) {
                    break;
                }
                this.f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        return n;
    }

    public E b(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lockInterruptibly();
        long j2 = toNanos;
        while (true) {
            try {
                E n = n();
                if (n != null) {
                    reentrantLock.unlock();
                    return n;
                } else if (j2 <= 0) {
                    break;
                } else {
                    j2 = this.f.awaitNanos(j2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return null;
    }

    public void b(E e) {
        if (!d(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    public boolean b(E e, long j, TimeUnit timeUnit) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lockInterruptibly();
        while (!c(dVar)) {
            try {
                if (toNanos <= 0) {
                    return false;
                }
                toNanos = this.g.awaitNanos(toNanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
        return true;
    }

    public E c() {
        E e = e();
        if (e != null) {
            return e;
        }
        throw new NoSuchElementException();
    }

    public boolean c(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            boolean b = b(dVar);
            return b;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void clear() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            d dVar = this.a;
            while (dVar != null) {
                dVar.a = null;
                d dVar2 = dVar.c;
                dVar.b = null;
                dVar.c = null;
                dVar = dVar2;
            }
            this.b = null;
            this.a = null;
            this.d = 0;
            this.g.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (d dVar = this.a; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E d() {
        E f = f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }

    public boolean d(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            boolean c = c(dVar);
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    public int drainTo(Collection<? super E> collection, int i) {
        if (collection == null) {
            throw new NullPointerException();
        } else if (collection == this) {
            throw new IllegalArgumentException();
        } else {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.d);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add(this.a.a);
                    m();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E e() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            E m = m();
            return m;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void e(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (!b(dVar)) {
            try {
                this.g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E element() {
        return g();
    }

    public E f() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            E n = n();
            return n;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void f(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        d dVar = new d(e);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (!c(dVar)) {
            try {
                this.g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E g() {
        E i = i();
        if (i != null) {
            return i;
        }
        throw new NoSuchElementException();
    }

    public boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (d dVar = this.a; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    a(dVar);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E h() {
        E j = j();
        if (j != null) {
            return j;
        }
        throw new NoSuchElementException();
    }

    public boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (d dVar = this.b; dVar != null; dVar = dVar.b) {
                if (obj.equals(dVar.a)) {
                    a(dVar);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E i() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            E e = this.a == null ? null : this.a.a;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public void i(E e) {
        a((Object) e);
    }

    public Iterator<E> iterator() {
        return new c();
    }

    public E j() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            E e = this.b == null ? null : this.b.a;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public E k() {
        return c();
    }

    public Iterator<E> l() {
        return new b();
    }

    public boolean offer(E e) {
        return d(e);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        return b(e, j, timeUnit);
    }

    public E peek() {
        return i();
    }

    public E poll() {
        return e();
    }

    public E poll(long j, TimeUnit timeUnit) {
        return a(j, timeUnit);
    }

    public void put(E e) {
        f(e);
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.e - this.d;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E remove() {
        return c();
    }

    public boolean remove(Object obj) {
        return g(obj);
    }

    public int size() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.d;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E take() {
        return a();
    }

    public Object[] toArray() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.d];
            int i = 0;
            d dVar = this.a;
            while (dVar != null) {
                int i2 = i + 1;
                objArr[i] = dVar.a;
                dVar = dVar.c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (tArr.length < this.d) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.d);
            }
            int i = 0;
            d dVar = this.a;
            while (dVar != null) {
                int i2 = i + 1;
                tArr[i] = dVar.a;
                dVar = dVar.c;
                i = i2;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            reentrantLock.unlock();
            return tArr;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            String str;
            d dVar = this.a;
            if (dVar == null) {
                str = "[]";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('[');
                d dVar2 = dVar;
                while (true) {
                    Object obj = dVar2.a;
                    if (obj == this) {
                        obj = "(this Collection)";
                    }
                    stringBuilder.append(obj);
                    dVar = dVar2.c;
                    if (dVar == null) {
                        break;
                    }
                    stringBuilder.append(',').append(l.c);
                    dVar2 = dVar;
                }
                str = stringBuilder.append(']').toString();
                reentrantLock.unlock();
            }
            return str;
        } finally {
            reentrantLock.unlock();
        }
    }
}
