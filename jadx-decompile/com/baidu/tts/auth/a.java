package com.baidu.tts.auth;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.f.m;
import com.baidu.tts.f.n;
import com.baidu.tts.k.c;
import com.baidu.tts.m.j;
import com.baidu.tts.tools.StringTool;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class a {
    private static volatile a a = null;
    private c<c, com.baidu.tts.auth.c.a> b = new c();
    private c<b, com.baidu.tts.auth.b.a> c = new c();

    private class a implements Callable<com.baidu.tts.auth.b.a> {
        final /* synthetic */ a a;
        private com.baidu.tts.b.a.b.e.b b;

        public a(a aVar, com.baidu.tts.b.a.b.e.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public com.baidu.tts.auth.b.a a() {
            com.baidu.tts.auth.b.a aVar = new com.baidu.tts.auth.b.a();
            com.baidu.tts.h.b.a g = com.baidu.tts.h.b.b.a().g();
            if (g == null) {
                aVar.a(com.baidu.tts.h.a.c.a().b(n.APP_RESOURCE_IS_NULL));
                return aVar;
            }
            String g2 = this.b.g();
            String f = this.b.f();
            if (StringTool.isEmpty(f)) {
                f = g.b();
            }
            LoggerProxy.d("AuthClient", "appCode=" + g2);
            LoggerProxy.d("AuthClient", "licenseFilePath=" + f);
            com.baidu.tts.k.b bVar = new b();
            bVar.a(g2);
            bVar.b(f);
            return (com.baidu.tts.auth.b.a) this.a.c.a(bVar);
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    private class b implements Callable<com.baidu.tts.auth.c.a> {
        final /* synthetic */ a a;
        private com.baidu.tts.b.a.b.f.b b;

        public b(a aVar, com.baidu.tts.b.a.b.f.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public com.baidu.tts.auth.c.a a() {
            String d = this.b.d();
            String a = this.b.a();
            String b = this.b.b();
            LoggerProxy.d("AuthClient", "pid=" + d);
            LoggerProxy.d("AuthClient", "ak=" + a);
            LoggerProxy.d("AuthClient", "sk=" + b);
            com.baidu.tts.k.b cVar = new c();
            cVar.a(d);
            cVar.b(a);
            cVar.c(b);
            return (com.baidu.tts.auth.c.a) this.a.b.a(cVar);
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private <T> T a(Callable<T> callable, long j) {
        return a((Callable) callable).get(j, TimeUnit.MILLISECONDS);
    }

    private <T> FutureTask<T> a(Callable<T> callable) {
        Object futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        return futureTask;
    }

    public AuthInfo a(m mVar, j jVar) {
        com.baidu.tts.m.b a = jVar.a();
        AuthInfo authInfo = new AuthInfo();
        authInfo.setTtsEnum(mVar);
        switch (mVar) {
            case ONLINE:
                authInfo.setOnlineResult(a(a.a()));
                return authInfo;
            case OFFLINE:
                authInfo.setOfflineResult(a(a.b()));
                return authInfo;
            case MIX:
                return a(a);
            default:
                return authInfo;
        }
    }

    public AuthInfo a(final com.baidu.tts.m.b bVar) {
        com.baidu.tts.auth.b.a aVar;
        LoggerProxy.d("AuthClient", "enter authMix");
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        FutureTask futureTask = new FutureTask(new Callable<com.baidu.tts.auth.c.a>(this) {
            final /* synthetic */ a c;

            public com.baidu.tts.auth.c.a a() {
                try {
                    com.baidu.tts.auth.c.a a = this.c.a(bVar.a());
                    return a;
                } finally {
                    countDownLatch.countDown();
                }
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
        FutureTask futureTask2 = new FutureTask(new Callable<com.baidu.tts.auth.b.a>(this) {
            final /* synthetic */ a c;

            public com.baidu.tts.auth.b.a a() {
                try {
                    com.baidu.tts.auth.b.a a = this.c.a(bVar.b());
                    return a;
                } finally {
                    countDownLatch.countDown();
                }
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
        new Thread(futureTask).start();
        new Thread(futureTask2).start();
        try {
            LoggerProxy.d("AuthClient", "+ await");
            countDownLatch.await();
            LoggerProxy.d("AuthClient", "- await");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            futureTask2.cancel(true);
        }
        com.baidu.tts.auth.c.a aVar2 = new com.baidu.tts.auth.c.a();
        LoggerProxy.d("AuthClient", "+ mix online get onlineResult=" + aVar2);
        try {
            aVar2 = (com.baidu.tts.auth.c.a) futureTask.get();
        } catch (Throwable e2) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            aVar2.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_INTERRUPTED_EXCEPTION, e2));
        } catch (ExecutionException e3) {
            aVar2.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_EXECUTION_EXCEPTION, e3.getCause()));
        } catch (Throwable e22) {
            aVar2.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_CANCELLATION_EXCEPTION, e22));
        }
        LoggerProxy.d("AuthClient", "- online get");
        com.baidu.tts.auth.b.a aVar3 = new com.baidu.tts.auth.b.a();
        LoggerProxy.d("AuthClient", "+ mix offline get offlineResult=" + aVar3);
        try {
            aVar = (com.baidu.tts.auth.b.a) futureTask2.get();
        } catch (Throwable e222) {
            Thread.currentThread().interrupt();
            futureTask2.cancel(true);
            aVar3.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_INTERRUPTED_EXCEPTION, e222));
            aVar = aVar3;
        } catch (ExecutionException e32) {
            aVar3.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_EXECUTION_EXCEPTION, e32.getCause()));
            aVar = aVar3;
        } catch (Throwable e2222) {
            aVar3.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_CANCELLATION_EXCEPTION, e2222));
            aVar = aVar3;
        }
        LoggerProxy.d("AuthClient", "- offline get");
        AuthInfo authInfo = new AuthInfo();
        authInfo.setTtsEnum(m.MIX);
        authInfo.setOnlineResult(aVar2);
        authInfo.setOfflineResult(aVar);
        LoggerProxy.d("AuthClient", "end authMix");
        return authInfo;
    }

    public com.baidu.tts.auth.b.a a(com.baidu.tts.b.a.b.e.b bVar) {
        com.baidu.tts.auth.b.a aVar = new com.baidu.tts.auth.b.a();
        try {
            return (com.baidu.tts.auth.b.a) a(new a(this, bVar), l.DEFAULT.a());
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            aVar.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_INTERRUPTED_EXCEPTION, e));
            return aVar;
        } catch (ExecutionException e2) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_EXECUTION_EXCEPTION, e2.getCause()));
            return aVar;
        } catch (Throwable e3) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_TIMEOUT_EXCEPTION, e3));
            return aVar;
        } catch (Throwable e32) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.OFFLINE_AUTH_CANCELLATION_EXCEPTION, e32));
            return aVar;
        }
    }

    public com.baidu.tts.auth.c.a a(com.baidu.tts.b.a.b.f.b bVar) {
        com.baidu.tts.auth.c.a aVar = new com.baidu.tts.auth.c.a();
        try {
            return (com.baidu.tts.auth.c.a) a(new b(this, bVar), l.DEFAULT.a());
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            aVar.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_INTERRUPTED_EXCEPTION, e));
            return aVar;
        } catch (ExecutionException e2) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_EXECUTION_EXCEPTION, e2.getCause()));
            return aVar;
        } catch (Throwable e3) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_TIMEOUT_EXCEPTION, e3));
            return aVar;
        } catch (Throwable e32) {
            aVar.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_AUTH_CANCELLATION_EXCEPTION, e32));
            return aVar;
        }
    }

    public void b() {
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a();
        }
    }
}
