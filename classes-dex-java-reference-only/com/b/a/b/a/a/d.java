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

public class d<E>
  extends AbstractQueue<E>
  implements a<E>, Serializable
{
  private static final long serialVersionUID = -387911632671998426L;
  transient d<E> a;
  transient d<E> b;
  final ReentrantLock c = new ReentrantLock();
  private transient int d;
  private final int e;
  private final Condition f = this.c.newCondition();
  private final Condition g = this.c.newCondition();
  
  public d()
  {
    this(Integer.MAX_VALUE);
  }
  
  public d(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException();
    }
    this.e = paramInt;
  }
  
  public d(Collection<? extends E> paramCollection)
  {
    this(Integer.MAX_VALUE);
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    Object localObject;
    do
    {
      try
      {
        paramCollection = paramCollection.iterator();
        if (!paramCollection.hasNext()) {
          break;
        }
        localObject = paramCollection.next();
        if (localObject == null) {
          throw new NullPointerException();
        }
      }
      finally
      {
        localReentrantLock.unlock();
      }
    } while (c(new d(localObject)));
    throw new IllegalStateException("Deque full");
    localReentrantLock.unlock();
  }
  
  private boolean b(d<E> paramd)
  {
    if (this.d >= this.e) {
      return false;
    }
    d locald = this.a;
    paramd.c = locald;
    this.a = paramd;
    if (this.b == null) {
      this.b = paramd;
    }
    for (;;)
    {
      this.d += 1;
      this.f.signal();
      return true;
      locald.b = paramd;
    }
  }
  
  private boolean c(d<E> paramd)
  {
    if (this.d >= this.e) {
      return false;
    }
    d locald = this.b;
    paramd.b = locald;
    this.b = paramd;
    if (this.a == null) {
      this.a = paramd;
    }
    for (;;)
    {
      this.d += 1;
      this.f.signal();
      return true;
      locald.c = paramd;
    }
  }
  
  private E m()
  {
    d locald1 = this.a;
    if (locald1 == null) {
      return null;
    }
    d locald2 = locald1.c;
    Object localObject = locald1.a;
    locald1.a = null;
    locald1.c = locald1;
    this.a = locald2;
    if (locald2 == null) {
      this.b = null;
    }
    for (;;)
    {
      this.d -= 1;
      this.g.signal();
      return (E)localObject;
      locald2.b = null;
    }
  }
  
  private E n()
  {
    d locald1 = this.b;
    if (locald1 == null) {
      return null;
    }
    d locald2 = locald1.b;
    Object localObject = locald1.a;
    locald1.a = null;
    locald1.b = locald1;
    this.b = locald2;
    if (locald2 == null) {
      this.a = null;
    }
    for (;;)
    {
      this.d -= 1;
      this.g.signal();
      return (E)localObject;
      locald2.c = null;
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.d = 0;
    this.a = null;
    this.b = null;
    for (;;)
    {
      Object localObject = paramObjectInputStream.readObject();
      if (localObject == null) {
        return;
      }
      add(localObject);
    }
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      paramObjectOutputStream.defaultWriteObject();
      for (d locald = this.a; locald != null; locald = locald.c) {
        paramObjectOutputStream.writeObject(locald.a);
      }
      paramObjectOutputStream.writeObject(null);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E a()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = m();
        if (localObject != null) {
          break;
        }
        this.f.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  public E a(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = m();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.f.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  void a(d<E> paramd)
  {
    d locald1 = paramd.b;
    d locald2 = paramd.c;
    if (locald1 == null)
    {
      m();
      return;
    }
    if (locald2 == null)
    {
      n();
      return;
    }
    locald1.c = locald2;
    locald2.b = locald1;
    paramd.a = null;
    this.d -= 1;
    this.g.signal();
  }
  
  public void a(E paramE)
  {
    if (!c(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public boolean a(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new d(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = b(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.g.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public boolean add(E paramE)
  {
    b(paramE);
    return true;
  }
  
  public E b()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = n();
        if (localObject != null) {
          break;
        }
        this.f.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  public E b(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = n();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.f.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public void b(E paramE)
  {
    if (!d(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public boolean b(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new d(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = c(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.g.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public E c()
  {
    Object localObject = e();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean c(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    d locald = new d(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = b(locald);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public void clear()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      d locald;
      for (Object localObject1 = this.a; localObject1 != null; localObject1 = locald)
      {
        ((d)localObject1).a = null;
        locald = ((d)localObject1).c;
        ((d)localObject1).b = null;
        ((d)localObject1).c = null;
      }
      this.b = null;
      this.a = null;
      this.d = 0;
      this.g.signalAll();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public boolean contains(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (d locald = this.a; locald != null; locald = locald.c)
      {
        boolean bool = paramObject.equals(locald.a);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E d()
  {
    Object localObject = f();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean d(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    d locald = new d(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = c(locald);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public int drainTo(Collection<? super E> paramCollection)
  {
    return drainTo(paramCollection, Integer.MAX_VALUE);
  }
  
  public int drainTo(Collection<? super E> paramCollection, int paramInt)
  {
    if (paramCollection == null) {
      throw new NullPointerException();
    }
    if (paramCollection == this) {
      throw new IllegalArgumentException();
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = Math.min(paramInt, this.d);
      paramInt = 0;
      while (paramInt < i)
      {
        paramCollection.add(this.a.a);
        m();
        paramInt += 1;
      }
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E e()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = m();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public void e(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 84	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 85	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 22	com/b/a/b/a/a/d$d
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 91	com/b/a/b/a/a/d$d:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 49	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 66	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 175	com/b/a/b/a/a/d:b	(Lcom/b/a/b/a/a/d$d;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 57	com/b/a/b/a/a/d:g	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 151 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	d
    //   0	62	1	paramE	E
    //   20	12	2	locald	d
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public E element()
  {
    return (E)g();
  }
  
  public E f()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = n();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public void f(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 84	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 85	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 22	com/b/a/b/a/a/d$d
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 91	com/b/a/b/a/a/d$d:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 49	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 66	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 94	com/b/a/b/a/a/d:c	(Lcom/b/a/b/a/a/d$d;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 57	com/b/a/b/a/a/d:g	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 151 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	d
    //   0	62	1	paramE	E
    //   20	12	2	locald	d
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public E g()
  {
    Object localObject = i();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean g(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (d locald = this.a; locald != null; locald = locald.c) {
        if (paramObject.equals(locald.a))
        {
          a(locald);
          return true;
        }
      }
      return false;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E h()
  {
    Object localObject = j();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean h(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (d locald = this.b; locald != null; locald = locald.b) {
        if (paramObject.equals(locald.a))
        {
          a(locald);
          return true;
        }
      }
      return false;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public E i()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 66	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 107	com/b/a/b/a/a/d:a	Lcom/b/a/b/a/a/d$d;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 107	com/b/a/b/a/a/d:a	Lcom/b/a/b/a/a/d$d;
    //   30: getfield 122	com/b/a/b/a/a/d$d:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	d
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public void i(E paramE)
  {
    a(paramE);
  }
  
  public Iterator<E> iterator()
  {
    return new c(null);
  }
  
  /* Error */
  public E j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 66	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 111	com/b/a/b/a/a/d:b	Lcom/b/a/b/a/a/d$d;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 111	com/b/a/b/a/a/d:b	Lcom/b/a/b/a/a/d$d;
    //   30: getfield 122	com/b/a/b/a/a/d$d:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	d
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public E k()
  {
    return (E)c();
  }
  
  public Iterator<E> l()
  {
    return new b(null);
  }
  
  public boolean offer(E paramE)
  {
    return d(paramE);
  }
  
  public boolean offer(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    return b(paramE, paramLong, paramTimeUnit);
  }
  
  public E peek()
  {
    return (E)i();
  }
  
  public E poll()
  {
    return (E)e();
  }
  
  public E poll(long paramLong, TimeUnit paramTimeUnit)
  {
    return (E)a(paramLong, paramTimeUnit);
  }
  
  public void put(E paramE)
  {
    f(paramE);
  }
  
  public int remainingCapacity()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.e;
      int j = this.d;
      return i - j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E remove()
  {
    return (E)c();
  }
  
  public boolean remove(Object paramObject)
  {
    return g(paramObject);
  }
  
  public int size()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E take()
  {
    return (E)a();
  }
  
  public Object[] toArray()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object[] arrayOfObject = new Object[this.d];
      int i = 0;
      d locald = this.a;
      while (locald != null)
      {
        arrayOfObject[i] = locald.a;
        locald = locald.c;
        i += 1;
      }
      return arrayOfObject;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    Object localObject = paramArrayOfT;
    try
    {
      if (paramArrayOfT.length < this.d) {
        localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.d);
      }
      int i = 0;
      paramArrayOfT = this.a;
      while (paramArrayOfT != null)
      {
        localObject[i] = paramArrayOfT.a;
        paramArrayOfT = paramArrayOfT.c;
        i += 1;
      }
      if (localObject.length > i) {
        localObject[i] = null;
      }
      return (T[])localObject;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 66	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   11: aload_0
    //   12: getfield 107	com/b/a/b/a/a/d:a	Lcom/b/a/b/a/a/d$d;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: aload 4
    //   22: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   25: ldc_w 279
    //   28: areturn
    //   29: new 281	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 282	java/lang/StringBuilder:<init>	()V
    //   36: astore 5
    //   38: aload 5
    //   40: bipush 91
    //   42: invokevirtual 286	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_1
    //   47: getfield 122	com/b/a/b/a/a/d$d:a	Ljava/lang/Object;
    //   50: astore_3
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: aload_0
    //   55: if_acmpne +7 -> 62
    //   58: ldc_w 288
    //   61: astore_2
    //   62: aload 5
    //   64: aload_2
    //   65: invokevirtual 291	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_1
    //   70: getfield 109	com/b/a/b/a/a/d$d:c	Lcom/b/a/b/a/a/d$d;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnonnull +21 -> 96
    //   78: aload 5
    //   80: bipush 93
    //   82: invokevirtual 286	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   85: invokevirtual 293	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: astore_1
    //   89: aload 4
    //   91: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   94: aload_1
    //   95: areturn
    //   96: aload 5
    //   98: bipush 44
    //   100: invokevirtual 286	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   103: bipush 32
    //   105: invokevirtual 286	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: goto -63 -> 46
    //   112: astore_1
    //   113: aload 4
    //   115: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	d
    //   15	80	1	localObject1	Object
    //   112	7	1	localObject2	Object
    //   52	13	2	localObject3	Object
    //   50	4	3	localObject4	Object
    //   4	110	4	localReentrantLock	ReentrantLock
    //   36	61	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   11	16	112	finally
    //   29	46	112	finally
    //   46	51	112	finally
    //   62	74	112	finally
    //   78	89	112	finally
    //   96	109	112	finally
  }
  
  private abstract class a
    implements Iterator<E>
  {
    d.d<E> a;
    E b;
    private d.d<E> d;
    
    /* Error */
    a()
    {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: putfield 22	com/b/a/b/a/a/d$a:c	Lcom/b/a/b/a/a/d;
      //   5: aload_0
      //   6: invokespecial 25	java/lang/Object:<init>	()V
      //   9: aload_1
      //   10: getfield 28	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
      //   13: astore_2
      //   14: aload_2
      //   15: invokevirtual 33	java/util/concurrent/locks/ReentrantLock:lock	()V
      //   18: aload_0
      //   19: aload_0
      //   20: invokevirtual 36	com/b/a/b/a/a/d$a:a	()Lcom/b/a/b/a/a/d$d;
      //   23: putfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   26: aload_0
      //   27: getfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   30: ifnonnull +15 -> 45
      //   33: aconst_null
      //   34: astore_1
      //   35: aload_0
      //   36: aload_1
      //   37: putfield 40	com/b/a/b/a/a/d$a:b	Ljava/lang/Object;
      //   40: aload_2
      //   41: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   44: return
      //   45: aload_0
      //   46: getfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   49: getfield 47	com/b/a/b/a/a/d$d:a	Ljava/lang/Object;
      //   52: astore_1
      //   53: goto -18 -> 35
      //   56: astore_1
      //   57: aload_2
      //   58: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   61: aload_1
      //   62: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	63	0	this	a
      //   0	63	1	this$1	d
      //   13	45	2	localReentrantLock	ReentrantLock
      // Exception table:
      //   from	to	target	type
      //   18	33	56	finally
      //   35	40	56	finally
      //   45	53	56	finally
    }
    
    private d.d<E> b(d.d<E> paramd)
    {
      for (;;)
      {
        d.d locald = a(paramd);
        Object localObject;
        if (locald == null) {
          localObject = null;
        }
        do
        {
          return (d.d<E>)localObject;
          localObject = locald;
        } while (locald.a != null);
        if (locald == paramd) {
          return a();
        }
        paramd = locald;
      }
    }
    
    abstract d.d<E> a();
    
    abstract d.d<E> a(d.d<E> paramd);
    
    /* Error */
    void b()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 22	com/b/a/b/a/a/d$a:c	Lcom/b/a/b/a/a/d;
      //   4: getfield 28	com/b/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
      //   7: astore_2
      //   8: aload_2
      //   9: invokevirtual 33	java/util/concurrent/locks/ReentrantLock:lock	()V
      //   12: aload_0
      //   13: aload_0
      //   14: aload_0
      //   15: getfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   18: invokespecial 55	com/b/a/b/a/a/d$a:b	(Lcom/b/a/b/a/a/d$d;)Lcom/b/a/b/a/a/d$d;
      //   21: putfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   24: aload_0
      //   25: getfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   28: ifnonnull +15 -> 43
      //   31: aconst_null
      //   32: astore_1
      //   33: aload_0
      //   34: aload_1
      //   35: putfield 40	com/b/a/b/a/a/d$a:b	Ljava/lang/Object;
      //   38: aload_2
      //   39: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   42: return
      //   43: aload_0
      //   44: getfield 38	com/b/a/b/a/a/d$a:a	Lcom/b/a/b/a/a/d$d;
      //   47: getfield 47	com/b/a/b/a/a/d$d:a	Ljava/lang/Object;
      //   50: astore_1
      //   51: goto -18 -> 33
      //   54: astore_1
      //   55: aload_2
      //   56: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   59: aload_1
      //   60: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	61	0	this	a
      //   32	19	1	localObject1	Object
      //   54	6	1	localObject2	Object
      //   7	49	2	localReentrantLock	ReentrantLock
      // Exception table:
      //   from	to	target	type
      //   12	31	54	finally
      //   33	38	54	finally
      //   43	51	54	finally
    }
    
    public boolean hasNext()
    {
      return this.a != null;
    }
    
    public E next()
    {
      if (this.a == null) {
        throw new NoSuchElementException();
      }
      this.d = this.a;
      Object localObject = this.b;
      b();
      return (E)localObject;
    }
    
    public void remove()
    {
      d.d locald = this.d;
      if (locald == null) {
        throw new IllegalStateException();
      }
      this.d = null;
      ReentrantLock localReentrantLock = d.this.c;
      localReentrantLock.lock();
      try
      {
        if (locald.a != null) {
          d.this.a(locald);
        }
        return;
      }
      finally
      {
        localReentrantLock.unlock();
      }
    }
  }
  
  private class b
    extends d<E>.a
  {
    private b()
    {
      super();
    }
    
    d.d<E> a()
    {
      return d.this.b;
    }
    
    d.d<E> a(d.d<E> paramd)
    {
      return paramd.b;
    }
  }
  
  private class c
    extends d<E>.a
  {
    private c()
    {
      super();
    }
    
    d.d<E> a()
    {
      return d.this.a;
    }
    
    d.d<E> a(d.d<E> paramd)
    {
      return paramd.c;
    }
  }
  
  static final class d<E>
  {
    E a;
    d<E> b;
    d<E> c;
    
    d(E paramE)
    {
      this.a = paramE;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */