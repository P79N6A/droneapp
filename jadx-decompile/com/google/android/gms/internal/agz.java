package com.google.android.gms.internal;

import android.os.Process;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.util.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class agz implements com.google.android.gms.clearcut.c {
    private static final Object a = new Object();
    private static ScheduledExecutorService b;
    private static final e c = new e();
    private static final long d = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    private final com.google.android.gms.common.util.e e;
    private final a f;
    private final Object g;
    private long h;
    private final long i;
    private ScheduledFuture<?> j;
    private g k;
    private final Runnable l;

    public interface a {
    }

    public static class b implements a {
    }

    static abstract class c<R extends m> extends com.google.android.gms.internal.ahl.a<R, aha> {
        public c(g gVar) {
            super(com.google.android.gms.clearcut.b.c, gVar);
        }
    }

    static final class d extends c<Status> {
        private final LogEventParcelable a;

        d(LogEventParcelable logEventParcelable, g gVar) {
            super(gVar);
            this.a = logEventParcelable;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(aha com_google_android_gms_internal_aha) {
            ahc anonymousClass1 = new com.google.android.gms.internal.ahc.a(this) {
                final /* synthetic */ d a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    this.a.b(status);
                }
            };
            try {
                agz.b(this.a);
                com_google_android_gms_internal_aha.a(anonymousClass1, this.a);
            } catch (Throwable e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                c(new Status(10, "MessageProducer"));
            }
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            return this.a.equals(((d) obj).a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            return new StringBuilder(String.valueOf(valueOf).length() + 12).append("MethodImpl(").append(valueOf).append(")").toString();
        }
    }

    private static final class e {
        private int a;

        private e() {
            this.a = 0;
        }

        public synchronized void a() {
            this.a++;
        }

        public synchronized void b() {
            if (this.a == 0) {
                throw new RuntimeException("too many decrements");
            }
            this.a--;
            if (this.a == 0) {
                notifyAll();
            }
        }
    }

    public agz() {
        this(new h(), d, new b());
    }

    public agz(com.google.android.gms.common.util.e eVar, long j, a aVar) {
        this.g = new Object();
        this.h = 0;
        this.j = null;
        this.k = null;
        this.l = new Runnable(this) {
            final /* synthetic */ agz a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.g) {
                    if (0 <= this.a.e.b() && this.a.k != null) {
                        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                        this.a.k.g();
                        this.a.k = null;
                    }
                }
            }
        };
        this.e = eVar;
        this.i = j;
        this.f = aVar;
    }

    private i<Status> a(final g gVar, final c<Status> cVar) {
        b().execute(new Runnable(this) {
            final /* synthetic */ agz c;

            public void run() {
                gVar.a(cVar);
            }
        });
        return cVar;
    }

    private d b(g gVar, LogEventParcelable logEventParcelable) {
        c.a();
        d dVar = new d(logEventParcelable, gVar);
        dVar.a(new com.google.android.gms.common.api.i.a(this) {
            final /* synthetic */ agz a;

            {
                this.a = r1;
            }

            public void a(Status status) {
                agz.c.b();
            }
        });
        return dVar;
    }

    private ScheduledExecutorService b() {
        synchronized (a) {
            if (b == null) {
                b = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(this) {
                    final /* synthetic */ agz a;

                    {
                        this.a = r1;
                    }

                    public Thread newThread(final Runnable runnable) {
                        return new Thread(new Runnable(this) {
                            final /* synthetic */ AnonymousClass2 b;

                            public void run() {
                                Process.setThreadPriority(10);
                                runnable.run();
                            }
                        }, "ClearcutLoggerApiImpl");
                    }
                });
            }
        }
        return b;
    }

    private static void b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.j != null && logEventParcelable.i.k.length == 0) {
            logEventParcelable.i.k = logEventParcelable.j.a();
        }
        if (logEventParcelable.k != null && logEventParcelable.i.r.length == 0) {
            logEventParcelable.i.r = logEventParcelable.k.a();
        }
        logEventParcelable.c = rd.a(logEventParcelable.i);
    }

    public i<Status> a(g gVar, LogEventParcelable logEventParcelable) {
        return a(gVar, b(gVar, logEventParcelable));
    }
}
