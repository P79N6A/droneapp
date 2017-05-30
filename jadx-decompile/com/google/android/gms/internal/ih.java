package com.google.android.gms.internal;

import com.google.android.gms.internal.hr.a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

enum ih implements il {
    INSTANCE;
    
    static ThreadFactory b;
    static final iw c = null;

    static {
        c = new iw() {
            public void a(Thread thread, String str) {
            }

            public void a(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }

            public void a(Thread thread, boolean z) {
            }
        };
    }

    public static boolean a() {
        return c() != null;
    }

    private static ThreadFactory c() {
        if (b == null) {
            try {
                Class cls = Class.forName("com.google.appengine.api.ThreadManager");
                if (cls != null) {
                    b = (ThreadFactory) cls.getMethod("backgroundThreadFactory", new Class[0]).invoke(null, new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                return null;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            }
        }
        return b;
    }

    public hr a(ic icVar, hn hnVar, hp hpVar, a aVar) {
        return new hs(icVar.i(), hpVar, aVar);
    }

    public hy a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public ig a(ic icVar) {
        return new ix(c(), c);
    }

    public jp a(ic icVar, String str) {
        return null;
    }

    public kt a(ic icVar, kt.a aVar, List<String> list) {
        return new kr(aVar, list);
    }

    public ip b(ic icVar) {
        final ks a = icVar.a("RunLoop");
        return new me(this) {
            final /* synthetic */ ih b;

            protected ThreadFactory a() {
                return ih.b;
            }

            public void a(Throwable th) {
                a.a(me.b(th), th);
            }

            protected iw b() {
                return ih.c;
            }
        };
    }

    public void b() {
        ls.a(b, new lr(this) {
            final /* synthetic */ ih a;

            {
                this.a = r1;
            }

            public void a(Thread thread, String str) {
                ih.c.a(thread, str);
            }
        });
    }

    public String c(ic icVar) {
        String str = "AppEngine";
        String property = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property).length() + 1) + String.valueOf(str).length()).append(property).append("/").append(str).toString();
    }
}
