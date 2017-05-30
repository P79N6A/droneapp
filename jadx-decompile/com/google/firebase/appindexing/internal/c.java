package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.g.f;
import com.google.android.gms.g.g;
import com.google.android.gms.g.i;
import com.google.android.gms.internal.aif;
import com.google.android.gms.internal.aiv;
import com.google.firebase.appindexing.d;
import java.util.concurrent.Executor;

public final class c extends com.google.firebase.appindexing.b {
    private c c;

    private static abstract class b extends aiv<b, Status> {
        private g<Status> a;

        private b() {
        }

        protected aif a() {
            return new com.google.android.gms.internal.aif.a(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    this.a.a.a((Object) status);
                }
            };
        }

        protected /* synthetic */ void a(com.google.android.gms.common.api.a.c cVar, g gVar) {
            a((b) cVar, gVar);
        }

        protected final void a(b bVar, g<Status> gVar) {
            this.a = gVar;
            a((f) bVar.G());
        }

        protected abstract void a(f fVar);
    }

    private static class a extends u<com.google.android.gms.common.api.a.a.b> {
        public a(Context context) {
            super(context, b.a, null, Looper.getMainLooper());
        }
    }

    static class c implements com.google.android.gms.g.b<Void>, Executor {
        public static int a = 10;
        public static long b = 250;
        public static double c = 1.5d;
        public static double d = 0.25d;
        @NonNull
        private final u<?> e;
        @NonNull
        private final Handler f;
        @Nullable
        private f<Void> g = null;

        public c(@NonNull u<?> uVar) {
            this.e = uVar;
            this.f = new Handler(uVar.h());
        }

        static long a(int i) {
            return (long) ((((double) b) * Math.pow(c, (double) i)) * ((((Math.random() * 2.0d) - 1.0d) * d) + 1.0d));
        }

        private void a(@NonNull final b bVar, @NonNull final g<Void> gVar, final int i) {
            this.e.b(bVar).a((Executor) this, new com.google.android.gms.g.b<Status>(this) {
                final /* synthetic */ c d;

                public void a(@NonNull f<Status> fVar) {
                    if (i < c.a && c.c(fVar)) {
                        Runnable anonymousClass1 = new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                this.a.d.a(bVar, gVar, i + 1);
                            }
                        };
                        long a = c.a(i);
                        if (this.d.f.postDelayed(anonymousClass1, a)) {
                            g.a("Task will be retried in " + a + " ms");
                            return;
                        }
                        g.a("Failed to schedule retry -- failing immediately!");
                    }
                    if (fVar.b()) {
                        Status status = (Status) fVar.c();
                        if (status.f()) {
                            gVar.a(null);
                            return;
                        } else {
                            gVar.a(k.a(status, "Indexing error, please try again."));
                            return;
                        }
                    }
                    gVar.a(fVar.d());
                }
            });
        }

        private static boolean c(@NonNull f<Status> fVar) {
            return fVar.b() ? d.a(((Status) fVar.c()).i()) : false;
        }

        public f<Void> a(@NonNull final b bVar) {
            final g gVar = new g();
            f<Void> a = gVar.a();
            synchronized (this) {
                f fVar = this.g;
                this.g = a;
            }
            a.a((Executor) this, (com.google.android.gms.g.b) this);
            if (fVar == null) {
                a(bVar, gVar, 0);
            } else {
                fVar.a((Executor) this, new com.google.android.gms.g.b<Void>(this) {
                    final /* synthetic */ c c;

                    public void a(@NonNull f<Void> fVar) {
                        this.c.a(bVar, gVar, 0);
                    }
                });
            }
            return a;
        }

        public synchronized void a(@NonNull f<Void> fVar) {
            if (fVar == this.g) {
                this.g = null;
            }
        }

        public void execute(Runnable runnable) {
            this.f.post(runnable);
        }
    }

    public c(@NonNull Context context) {
        this(context, new a(context));
    }

    c(@NonNull Context context, @NonNull u<com.google.android.gms.common.api.a.a.b> uVar) {
        this.c = new c(uVar);
    }

    public f<Void> a(com.google.firebase.appindexing.g... gVarArr) {
        if (gVarArr == null) {
            return i.a(new NullPointerException("Indexables cannot be null."));
        }
        final Object obj = new Thing[gVarArr.length];
        try {
            System.arraycopy(gVarArr, 0, obj, 0, gVarArr.length);
            return this.c.a(new b(this) {
                final /* synthetic */ c b;

                protected void a(f fVar) {
                    fVar.a(a(), obj);
                }
            });
        } catch (ArrayStoreException e) {
            return i.a(new d("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public f<Void> a(final String... strArr) {
        return this.c.a(new b(this) {
            final /* synthetic */ c b;

            protected void a(f fVar) {
                fVar.a(a(), strArr);
            }
        });
    }

    public f<Void> b() {
        return this.c.a(new b(this) {
            final /* synthetic */ c a;

            {
                this.a = r2;
            }

            protected void a(f fVar) {
                fVar.a(a());
            }
        });
    }
}
