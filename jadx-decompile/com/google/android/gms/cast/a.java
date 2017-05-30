package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import java.io.IOException;

public final class a {
    public static final int a = 65536;
    public static final int b = 128;
    public static final int c = -1;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = -1;
    public static final int g = 0;
    public static final int h = 1;
    public static final String i = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    static final com.google.android.gms.common.api.a.b<com.google.android.gms.cast.internal.e, c> j = new com.google.android.gms.common.api.a.b<com.google.android.gms.cast.internal.e, c>() {
        public com.google.android.gms.cast.internal.e a(Context context, Looper looper, s sVar, c cVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar2) {
            com.google.android.gms.common.internal.d.a((Object) cVar, (Object) "Setting the API options is required.");
            return new com.google.android.gms.cast.internal.e(context, looper, sVar, cVar.a, (long) cVar.c, cVar.b, bVar, cVar2);
        }
    };
    public static final com.google.android.gms.common.api.a<c> k = new com.google.android.gms.common.api.a("Cast.API", j, l.a);
    public static final b l = new a();

    public interface a extends m {
        ApplicationMetadata b();

        String c();

        String d();

        boolean e();
    }

    static abstract class f extends com.google.android.gms.cast.internal.b<a> {
        public f(g gVar) {
            super(gVar);
        }

        public a a(final Status status) {
            return new a(this) {
                final /* synthetic */ f b;

                public Status a() {
                    return status;
                }

                public ApplicationMetadata b() {
                    return null;
                }

                public String c() {
                    return null;
                }

                public String d() {
                    return null;
                }

                public boolean e() {
                    return false;
                }
            };
        }

        public void a(com.google.android.gms.cast.internal.e eVar) {
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public interface b {

        public static final class a implements b {
            public i<a> a(g gVar, final String str) {
                return gVar.b(new f(this, gVar) {
                    final /* synthetic */ a b;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a(str, false, (com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            public i<a> a(g gVar, final String str, final LaunchOptions launchOptions) {
                return gVar.b(new f(this, gVar) {
                    final /* synthetic */ a c;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a(str, launchOptions, (com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            public i<Status> a(g gVar, final String str, final String str2) {
                return gVar.b(new com.google.android.gms.cast.internal.i(this, gVar) {
                    final /* synthetic */ a c;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a(str, str2, (com.google.android.gms.internal.ahl.b) this);
                            return;
                        } catch (IllegalArgumentException e) {
                        } catch (IllegalStateException e2) {
                        }
                        a(2001);
                    }
                });
            }

            public i<a> a(g gVar, String str, String str2, JoinOptions joinOptions) {
                final String str3 = str;
                final String str4 = str2;
                final JoinOptions joinOptions2 = joinOptions;
                return gVar.b(new f(this, gVar) {
                    final /* synthetic */ a d;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a(str3, str4, joinOptions2, (com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Deprecated
            public i<a> a(g gVar, String str, boolean z) {
                return a(gVar, str, new com.google.android.gms.cast.LaunchOptions.a().a(z).a());
            }

            public void a(g gVar) {
                try {
                    ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).i();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void a(g gVar, double d) {
                try {
                    ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).a(d);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void a(g gVar, String str, e eVar) {
                try {
                    ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).a(str, eVar);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void a(g gVar, boolean z) {
                try {
                    ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).a(z);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public i<a> b(g gVar) {
                return a(gVar, null, null, null);
            }

            public i<a> b(g gVar, String str) {
                return a(gVar, str, null, null);
            }

            public i<a> b(g gVar, String str, String str2) {
                return a(gVar, str, str2, null);
            }

            public i<Status> c(g gVar) {
                return gVar.b(new com.google.android.gms.cast.internal.i(this, gVar) {
                    final /* synthetic */ a a;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a((com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            public i<Status> c(g gVar, final String str) {
                return gVar.b(new com.google.android.gms.cast.internal.i(this, gVar) {
                    final /* synthetic */ a b;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        if (TextUtils.isEmpty(str)) {
                            a(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            eVar.a(str, (com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            public i<Status> d(g gVar) {
                return gVar.b(new com.google.android.gms.cast.internal.i(this, gVar) {
                    final /* synthetic */ a a;

                    public void a(com.google.android.gms.cast.internal.e eVar) {
                        try {
                            eVar.a("", (com.google.android.gms.internal.ahl.b) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            public void d(g gVar, String str) {
                try {
                    ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).a(str);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public double e(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).j();
            }

            public boolean f(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).k();
            }

            public int g(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).l();
            }

            public int h(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).m();
            }

            public ApplicationMetadata i(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).n();
            }

            public String j(g gVar) {
                return ((com.google.android.gms.cast.internal.e) gVar.a(l.a)).o();
            }
        }

        i<a> a(g gVar, String str);

        i<a> a(g gVar, String str, LaunchOptions launchOptions);

        i<Status> a(g gVar, String str, String str2);

        @Deprecated
        i<a> a(g gVar, String str, boolean z);

        void a(g gVar);

        void a(g gVar, double d);

        void a(g gVar, String str, e eVar);

        void a(g gVar, boolean z);

        i<a> b(g gVar);

        i<a> b(g gVar, String str);

        i<a> b(g gVar, String str, String str2);

        i<Status> c(g gVar);

        i<Status> c(g gVar, String str);

        i<Status> d(g gVar);

        void d(g gVar, String str);

        double e(g gVar);

        boolean f(g gVar);

        int g(g gVar);

        int h(g gVar);

        ApplicationMetadata i(g gVar);

        String j(g gVar);
    }

    public static final class c implements com.google.android.gms.common.api.a.a.a {
        final CastDevice a;
        final d b;
        private final int c;

        public static final class a {
            CastDevice a;
            d b;
            private int c = 0;

            public a(CastDevice castDevice, d dVar) {
                com.google.android.gms.common.internal.d.a((Object) castDevice, (Object) "CastDevice parameter cannot be null");
                com.google.android.gms.common.internal.d.a((Object) dVar, (Object) "CastListener parameter cannot be null");
                this.a = castDevice;
                this.b = dVar;
            }

            public a a(boolean z) {
                if (z) {
                    this.c |= 1;
                } else {
                    this.c &= -2;
                }
                return this;
            }

            public c a() {
                return new c();
            }
        }

        private c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }

        @Deprecated
        public static a a(CastDevice castDevice, d dVar) {
            return new a(castDevice, dVar);
        }
    }

    public static class d {
        public void a() {
        }

        public void a(int i) {
        }

        public void a(ApplicationMetadata applicationMetadata) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public void c(int i) {
        }
    }

    public interface e {
        void a(CastDevice castDevice, String str, String str2);
    }

    private a() {
    }
}
