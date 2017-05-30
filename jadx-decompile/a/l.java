package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class l<TResult> {
    public static final ExecutorService a = h.a();
    public static final Executor b = b.b();
    private static final Executor c = h.b();
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private TResult g;
    private Exception h;
    private List<j<TResult, Void>> i = new ArrayList();

    public class a {
        final /* synthetic */ l a;

        private a(l lVar) {
            this.a = lVar;
        }

        public l<TResult> a() {
            return this.a;
        }

        public boolean a(Exception exception) {
            boolean z = true;
            synchronized (this.a.d) {
                if (this.a.e) {
                    z = false;
                } else {
                    this.a.e = true;
                    this.a.h = exception;
                    this.a.d.notifyAll();
                    this.a.k();
                }
            }
            return z;
        }

        public boolean a(TResult tResult) {
            boolean z = true;
            synchronized (this.a.d) {
                if (this.a.e) {
                    z = false;
                } else {
                    this.a.e = true;
                    this.a.g = tResult;
                    this.a.d.notifyAll();
                    this.a.k();
                }
            }
            return z;
        }

        public void b(Exception exception) {
            if (!a(exception)) {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            }
        }

        public void b(TResult tResult) {
            if (!a((Object) tResult)) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        }

        public boolean b() {
            boolean z = true;
            synchronized (this.a.d) {
                if (this.a.e) {
                    z = false;
                } else {
                    this.a.e = true;
                    this.a.f = true;
                    this.a.d.notifyAll();
                    this.a.k();
                }
            }
            return z;
        }

        public void c() {
            if (!b()) {
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
        }
    }

    private l() {
    }

    public static <TResult> a a() {
        l lVar = new l();
        lVar.getClass();
        return new a();
    }

    public static <TResult> l<TResult> a(Exception exception) {
        a a = a();
        a.b(exception);
        return a.a();
    }

    public static <TResult> l<TResult> a(TResult tResult) {
        a a = a();
        a.b((Object) tResult);
        return a.a();
    }

    public static l<Void> a(Collection<? extends l<?>> collection) {
        if (collection.size() == 0) {
            return a(null);
        }
        final a a = a();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (l a2 : collection) {
            a2.a(new j<Object, Void>() {
                public Void a(l<Object> lVar) {
                    if (lVar.d()) {
                        synchronized (obj) {
                            arrayList.add(lVar.f());
                        }
                    }
                    if (lVar.c()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                a.b((Exception) arrayList.get(0));
                            } else {
                                a.b(new a(String.format("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList.size())}), (Throwable[]) arrayList.toArray(new Throwable[arrayList.size()])));
                            }
                        } else if (atomicBoolean.get()) {
                            a.c();
                        } else {
                            a.b(null);
                        }
                    }
                    return null;
                }

                public /* synthetic */ Object then(l lVar) {
                    return a(lVar);
                }
            });
        }
        return a.a();
    }

    public static <TResult> l<TResult> a(Callable<TResult> callable) {
        return a((Callable) callable, a);
    }

    public static <TResult> l<TResult> a(final Callable<TResult> callable, Executor executor) {
        final a a = a();
        executor.execute(new Runnable() {
            public void run() {
                try {
                    a.b(callable.call());
                } catch (Exception e) {
                    a.b(e);
                }
            }
        });
        return a.a();
    }

    public static <TResult> l<TResult> b(Callable<TResult> callable) {
        return a((Callable) callable, c);
    }

    private static <TContinuationResult, TResult> void c(final a aVar, final j<TResult, TContinuationResult> jVar, final l<TResult> lVar, Executor executor) {
        executor.execute(new Runnable() {
            public void run() {
                try {
                    aVar.b(jVar.then(lVar));
                } catch (Exception e) {
                    aVar.b(e);
                }
            }
        });
    }

    private static <TContinuationResult, TResult> void d(final a aVar, final j<TResult, l<TContinuationResult>> jVar, final l<TResult> lVar, Executor executor) {
        executor.execute(new Runnable() {
            public void run() {
                try {
                    l lVar = (l) jVar.then(lVar);
                    if (lVar == null) {
                        aVar.b(null);
                    } else {
                        lVar.a(new j<TContinuationResult, Void>(this) {
                            final /* synthetic */ AnonymousClass2 a;

                            {
                                this.a = r1;
                            }

                            public Void a(l<TContinuationResult> lVar) {
                                if (lVar.c()) {
                                    aVar.c();
                                } else if (lVar.d()) {
                                    aVar.b(lVar.f());
                                } else {
                                    aVar.b(lVar.e());
                                }
                                return null;
                            }

                            public /* synthetic */ Object then(l lVar) {
                                return a(lVar);
                            }
                        });
                    }
                } catch (Exception e) {
                    aVar.b(e);
                }
            }
        });
    }

    public static <TResult> l<TResult> h() {
        a a = a();
        a.c();
        return a.a();
    }

    private void k() {
        synchronized (this.d) {
            for (j then : this.i) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.i = null;
        }
    }

    public <TContinuationResult> l<TContinuationResult> a(j<TResult, TContinuationResult> jVar) {
        return a((j) jVar, c);
    }

    public <TContinuationResult> l<TContinuationResult> a(final j<TResult, TContinuationResult> jVar, final Executor executor) {
        final a a = a();
        synchronized (this.d) {
            boolean b = b();
            if (!b) {
                this.i.add(new j<TResult, Void>(this) {
                    final /* synthetic */ l d;

                    public Void a(l<TResult> lVar) {
                        l.c(a, jVar, lVar, executor);
                        return null;
                    }

                    public /* synthetic */ Object then(l lVar) {
                        return a(lVar);
                    }
                });
            }
        }
        if (b) {
            c(a, jVar, this, executor);
        }
        return a.a();
    }

    public l<Void> a(Callable<Boolean> callable, j<Void, l<Void>> jVar) {
        return a(callable, jVar, c);
    }

    public l<Void> a(Callable<Boolean> callable, j<Void, l<Void>> jVar, Executor executor) {
        final i iVar = new i();
        final Callable<Boolean> callable2 = callable;
        final j<Void, l<Void>> jVar2 = jVar;
        final Executor executor2 = executor;
        iVar.a(new j<Void, l<Void>>(this) {
            final /* synthetic */ l e;

            public l<Void> a(l<Void> lVar) {
                return ((Boolean) callable2.call()).booleanValue() ? l.a(null).d(jVar2, executor2).d((j) iVar.a(), executor2) : l.a(null);
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        });
        return j().b((j) iVar.a(), executor);
    }

    public <TContinuationResult> l<TContinuationResult> b(j<TResult, l<TContinuationResult>> jVar) {
        return b((j) jVar, c);
    }

    public <TContinuationResult> l<TContinuationResult> b(final j<TResult, l<TContinuationResult>> jVar, final Executor executor) {
        final a a = a();
        synchronized (this.d) {
            boolean b = b();
            if (!b) {
                this.i.add(new j<TResult, Void>(this) {
                    final /* synthetic */ l d;

                    public Void a(l<TResult> lVar) {
                        l.d(a, jVar, lVar, executor);
                        return null;
                    }

                    public /* synthetic */ Object then(l lVar) {
                        return a(lVar);
                    }
                });
            }
        }
        if (b) {
            d(a, jVar, this, executor);
        }
        return a.a();
    }

    public boolean b() {
        boolean z;
        synchronized (this.d) {
            z = this.e;
        }
        return z;
    }

    public <TContinuationResult> l<TContinuationResult> c(j<TResult, TContinuationResult> jVar) {
        return c(jVar, c);
    }

    public <TContinuationResult> l<TContinuationResult> c(final j<TResult, TContinuationResult> jVar, Executor executor) {
        return b(new j<TResult, l<TContinuationResult>>(this) {
            final /* synthetic */ l b;

            public l<TContinuationResult> a(l<TResult> lVar) {
                return lVar.d() ? l.a(lVar.f()) : lVar.c() ? l.h() : lVar.a(jVar);
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        }, executor);
    }

    public boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }

    public <TContinuationResult> l<TContinuationResult> d(j<TResult, l<TContinuationResult>> jVar) {
        return d(jVar, c);
    }

    public <TContinuationResult> l<TContinuationResult> d(final j<TResult, l<TContinuationResult>> jVar, Executor executor) {
        return b(new j<TResult, l<TContinuationResult>>(this) {
            final /* synthetic */ l b;

            public l<TContinuationResult> a(l<TResult> lVar) {
                return lVar.d() ? l.a(lVar.f()) : lVar.c() ? l.h() : lVar.b(jVar);
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        }, executor);
    }

    public boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.h != null;
        }
        return z;
    }

    public TResult e() {
        TResult tResult;
        synchronized (this.d) {
            tResult = this.g;
        }
        return tResult;
    }

    public Exception f() {
        Exception exception;
        synchronized (this.d) {
            exception = this.h;
        }
        return exception;
    }

    public void g() {
        synchronized (this.d) {
            if (!b()) {
                this.d.wait();
            }
        }
    }

    public <TOut> l<TOut> i() {
        return this;
    }

    public l<Void> j() {
        return b(new j<TResult, l<Void>>(this) {
            final /* synthetic */ l a;

            {
                this.a = r1;
            }

            public l<Void> a(l<TResult> lVar) {
                return lVar.c() ? l.h() : lVar.d() ? l.a(lVar.f()) : l.a(null);
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        });
    }
}
