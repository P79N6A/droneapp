package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.internal.n;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

@SuppressLint({"MissingRemoteException"})
public class g implements com.google.android.gms.cast.a.e {
    public static final String a = n.g;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 2100;
    public static final int g = 2101;
    public static final int h = 2102;
    public static final int i = 2103;
    private final Object j;
    private final n k;
    private final f l;
    private c m;
    private d n;
    private b o;
    private e p;

    static abstract class g extends com.google.android.gms.cast.internal.b<a> {
        p h = new p(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public void a(long j) {
                this.a.b((m) (a) this.a.b(new Status(2103)));
            }

            public void a(long j, int i, Object obj) {
                this.a.b(new h(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }
        };

        g(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public a a(final Status status) {
            return new a(this) {
                final /* synthetic */ g b;

                public Status a() {
                    return status;
                }

                public JSONObject b() {
                    return null;
                }
            };
        }

        protected void a(com.google.android.gms.cast.internal.e eVar) {
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public interface a extends m {
        JSONObject b();
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();
    }

    public interface e {
        void a();
    }

    private class f implements o {
        final /* synthetic */ g a;
        private com.google.android.gms.common.api.g b;
        private long c = 0;

        private final class a implements com.google.android.gms.common.api.n<Status> {
            final /* synthetic */ f a;
            private final long b;

            a(f fVar, long j) {
                this.a = fVar;
                this.b = j;
            }

            public void a(@NonNull Status status) {
                if (!status.f()) {
                    this.a.a.k.a(this.b, status.i());
                }
            }

            public /* synthetic */ void a(@NonNull m mVar) {
                a((Status) mVar);
            }
        }

        public f(g gVar) {
            this.a = gVar;
        }

        public long a() {
            long j = this.c + 1;
            this.c = j;
            return j;
        }

        public void a(com.google.android.gms.common.api.g gVar) {
            this.b = gVar;
        }

        public void a(String str, String str2, long j, String str3) {
            if (this.b == null) {
                throw new IOException("No GoogleApiClient available");
            }
            a.l.a(this.b, str, str2).a(new a(this, j));
        }
    }

    private static final class h implements a {
        private final Status a;
        private final JSONObject b;

        h(Status status, JSONObject jSONObject) {
            this.a = status;
            this.b = jSONObject;
        }

        public Status a() {
            return this.a;
        }

        public JSONObject b() {
            return this.b;
        }
    }

    public g() {
        this(new n(null));
    }

    g(n nVar) {
        this.j = new Object();
        this.k = nVar;
        this.k.a(new com.google.android.gms.cast.internal.n.a(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.f();
            }

            public void b() {
                this.a.g();
            }

            public void c() {
                this.a.h();
            }

            public void d() {
                this.a.i();
            }
        });
        this.l = new f(this);
        this.k.a(this.l);
    }

    private int a(int i) {
        MediaStatus c = c();
        for (int i2 = 0; i2 < c.q(); i2++) {
            if (c.b(i2).c() == i) {
                return i2;
            }
        }
        return -1;
    }

    private void f() {
        if (this.p != null) {
            this.p.a();
        }
    }

    private void g() {
        if (this.o != null) {
            this.o.a();
        }
    }

    private void h() {
        if (this.n != null) {
            this.n.a();
        }
    }

    private void i() {
        if (this.m != null) {
            this.m.a();
        }
    }

    public long a() {
        long d;
        synchronized (this.j) {
            d = this.k.d();
        }
        return d;
    }

    public i<a> a(com.google.android.gms.common.api.g gVar) {
        return a(gVar, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, double d) {
        return a(gVar, d, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, double d, JSONObject jSONObject) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final double d2 = d;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, d2, jSONObject2);
                        this.d.l.a(null);
                    } catch (IllegalStateException e) {
                        try {
                            b((m) (a) b(new Status(2100)));
                            this.d.l.a(null);
                        } catch (Throwable th) {
                            this.d.l.a(null);
                        }
                    } catch (IllegalArgumentException e2) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    } catch (IOException e3) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, int i, int i2, JSONObject jSONObject) {
        final int i3 = i;
        final int i4 = i2;
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                int i = 0;
                synchronized (this.e.j) {
                    int a = this.e.a(i3);
                    if (a == -1) {
                        b((m) (a) b(new Status(0)));
                    } else if (i4 < 0) {
                        b((m) (a) b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[]{Integer.valueOf(i4)}))));
                    } else if (a == i4) {
                        b((m) (a) b(new Status(0)));
                    } else {
                        MediaQueueItem b = this.e.c().b(i4 > a ? i4 + 1 : i4);
                        if (b != null) {
                            i = b.c();
                        }
                        this.e.l.a(gVar2);
                        try {
                            this.e.k.a(this.h, new int[]{i3}, i, jSONObject2);
                        } catch (IOException e) {
                            b((m) (a) b(new Status(2100)));
                        } finally {
                            this.e.l.a(null);
                        }
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, int i, long j, JSONObject jSONObject) {
        final int i2 = i;
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.e.j) {
                    if (this.e.a(i2) == -1) {
                        b((m) (a) b(new Status(0)));
                        return;
                    }
                    this.e.l.a(gVar2);
                    try {
                        this.e.k.a(this.h, i2, j2, null, 0, null, jSONObject2);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                    } finally {
                        this.e.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, int i, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, 0, -1, null, 0, Integer.valueOf(i2), jSONObject2);
                        this.d.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    } catch (Throwable th) {
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, long j) {
        return a(gVar, j, 0, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, long j, int i) {
        return a(gVar, j, i, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, long j, int i, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final long j2 = j;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.e.j) {
                    this.e.l.a(gVar2);
                    try {
                        this.e.k.a(this.h, j2, i2, jSONObject2);
                        this.e.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.e.l.a(null);
                    } catch (Throwable th) {
                        this.e.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaInfo mediaInfo) {
        return a(gVar, mediaInfo, true, 0, null, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaInfo mediaInfo, boolean z) {
        return a(gVar, mediaInfo, z, 0, null, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaInfo mediaInfo, boolean z, long j) {
        return a(gVar, mediaInfo, z, j, null, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return a(gVar, mediaInfo, z, j, null, jSONObject);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final MediaInfo mediaInfo2 = mediaInfo;
        final boolean z2 = z;
        final long j2 = j;
        final long[] jArr2 = jArr;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g g;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.g.j) {
                    this.g.l.a(gVar2);
                    try {
                        this.g.k.a(this.h, mediaInfo2, z2, j2, jArr2, jSONObject2);
                        this.g.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.g.l.a(null);
                    } catch (Throwable th) {
                        this.g.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem mediaQueueItem, int i, long j, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final MediaQueueItem mediaQueueItem2 = mediaQueueItem;
        final int i2 = i;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g f;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.f.j) {
                    this.f.l.a(gVar2);
                    try {
                        this.f.k.a(this.h, new MediaQueueItem[]{mediaQueueItem2}, i2, 0, 0, j2, jSONObject2);
                        this.f.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.f.l.a(null);
                    } catch (Throwable th) {
                        this.f.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return a(gVar, mediaQueueItem, i, -1, jSONObject);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem mediaQueueItem, JSONObject jSONObject) {
        return a(gVar, new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    public i<a> a(final com.google.android.gms.common.api.g gVar, final TextTrackStyle textTrackStyle) {
        if (textTrackStyle != null) {
            return gVar.b(new g(this, gVar) {
                final /* synthetic */ g c;

                protected void a(com.google.android.gms.cast.internal.e eVar) {
                    synchronized (this.c.j) {
                        this.c.l.a(gVar);
                        try {
                            this.c.k.a(this.h, textTrackStyle);
                            this.c.l.a(null);
                        } catch (IOException e) {
                            b((m) (a) b(new Status(2100)));
                            this.c.l.a(null);
                        } catch (Throwable th) {
                            this.c.l.a(null);
                        }
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public i<a> a(final com.google.android.gms.common.api.g gVar, final JSONObject jSONObject) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.j) {
                    this.c.l.a(gVar);
                    try {
                        this.c.k.a(this.h, jSONObject);
                        this.c.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.c.l.a(null);
                    } catch (Throwable th) {
                        this.c.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, boolean z) {
        return a(gVar, z, null);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, boolean z, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final boolean z2 = z;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, z2, jSONObject2);
                        this.d.l.a(null);
                    } catch (IllegalStateException e) {
                        try {
                            b((m) (a) b(new Status(2100)));
                            this.d.l.a(null);
                        } catch (Throwable th) {
                            this.d.l.a(null);
                        }
                    } catch (IOException e2) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, int[] iArr, int i, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final int[] iArr2 = iArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.e.j) {
                    this.e.l.a(gVar2);
                    try {
                        this.e.k.a(this.h, iArr2, i2, jSONObject2);
                        this.e.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.e.l.a(null);
                    } catch (Throwable th) {
                        this.e.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, int[] iArr, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final int[] iArr2 = iArr;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, iArr2, jSONObject2);
                        this.d.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    } catch (Throwable th) {
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(final com.google.android.gms.common.api.g gVar, final long[] jArr) {
        if (jArr != null) {
            return gVar.b(new g(this, gVar) {
                final /* synthetic */ g c;

                protected void a(com.google.android.gms.cast.internal.e eVar) {
                    synchronized (this.c.j) {
                        this.c.l.a(gVar);
                        try {
                            this.c.k.a(this.h, jArr);
                            this.c.l.a(null);
                        } catch (IOException e) {
                            b((m) (a) b(new Status(2100)));
                            this.c.l.a(null);
                        } catch (Throwable th) {
                            this.c.l.a(null);
                        }
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g g;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.g.j) {
                    this.g.l.a(gVar2);
                    try {
                        this.g.k.a(this.h, mediaQueueItemArr2, i3, i4, j2, jSONObject2);
                        this.g.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.g.l.a(null);
                    } catch (Throwable th) {
                        this.g.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) {
        return a(gVar, mediaQueueItemArr, i, i2, -1, jSONObject);
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.e.j) {
                    this.e.l.a(gVar2);
                    try {
                        this.e.k.a(this.h, mediaQueueItemArr2, i2, 0, -1, -1, jSONObject2);
                        this.e.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.e.l.a(null);
                    } catch (Throwable th) {
                        this.e.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> a(com.google.android.gms.common.api.g gVar, MediaQueueItem[] mediaQueueItemArr, JSONObject jSONObject) {
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, 0, -1, mediaQueueItemArr2, 0, null, jSONObject2);
                        this.d.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.d.l.a(null);
                    } catch (Throwable th) {
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public void a(CastDevice castDevice, String str, String str2) {
        this.k.b(str2);
    }

    public void a(b bVar) {
        this.o = bVar;
    }

    public void a(c cVar) {
        this.m = cVar;
    }

    public void a(d dVar) {
        this.n = dVar;
    }

    public void a(e eVar) {
        this.p = eVar;
    }

    public long b() {
        long e;
        synchronized (this.j) {
            e = this.k.e();
        }
        return e;
    }

    public i<a> b(com.google.android.gms.common.api.g gVar) {
        return b(gVar, null);
    }

    public i<a> b(com.google.android.gms.common.api.g gVar, int i, JSONObject jSONObject) {
        final int i2 = i;
        final com.google.android.gms.common.api.g gVar2 = gVar;
        final JSONObject jSONObject2 = jSONObject;
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.j) {
                    if (this.d.a(i2) == -1) {
                        b((m) (a) b(new Status(0)));
                        return;
                    }
                    this.d.l.a(gVar2);
                    try {
                        this.d.k.a(this.h, new int[]{i2}, jSONObject2);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                    } finally {
                        this.d.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> b(final com.google.android.gms.common.api.g gVar, final JSONObject jSONObject) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.j) {
                    this.c.l.a(gVar);
                    try {
                        this.c.k.b(this.h, jSONObject);
                        this.c.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.c.l.a(null);
                    } catch (Throwable th) {
                        this.c.l.a(null);
                    }
                }
            }
        });
    }

    public MediaStatus c() {
        MediaStatus f;
        synchronized (this.j) {
            f = this.k.f();
        }
        return f;
    }

    public i<a> c(com.google.android.gms.common.api.g gVar) {
        return c(gVar, null);
    }

    public i<a> c(com.google.android.gms.common.api.g gVar, int i, JSONObject jSONObject) {
        return a(gVar, i, -1, jSONObject);
    }

    public i<a> c(final com.google.android.gms.common.api.g gVar, final JSONObject jSONObject) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.j) {
                    this.c.l.a(gVar);
                    try {
                        this.c.k.c(this.h, jSONObject);
                        this.c.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.c.l.a(null);
                    } catch (Throwable th) {
                        this.c.l.a(null);
                    }
                }
            }
        });
    }

    public MediaInfo d() {
        MediaInfo g;
        synchronized (this.j) {
            g = this.k.g();
        }
        return g;
    }

    public i<a> d(final com.google.android.gms.common.api.g gVar) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.j) {
                    this.b.l.a(gVar);
                    try {
                        this.b.k.a(this.h);
                        this.b.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.b.l.a(null);
                    } catch (Throwable th) {
                        this.b.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> d(final com.google.android.gms.common.api.g gVar, final JSONObject jSONObject) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.j) {
                    this.c.l.a(gVar);
                    try {
                        this.c.k.a(this.h, 0, -1, null, -1, null, jSONObject);
                        this.c.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.c.l.a(null);
                    } catch (Throwable th) {
                        this.c.l.a(null);
                    }
                }
            }
        });
    }

    public i<a> e(final com.google.android.gms.common.api.g gVar, final JSONObject jSONObject) {
        return gVar.b(new g(this, gVar) {
            final /* synthetic */ g c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.j) {
                    this.c.l.a(gVar);
                    try {
                        this.c.k.a(this.h, 0, -1, null, 1, null, jSONObject);
                        this.c.l.a(null);
                    } catch (IOException e) {
                        b((m) (a) b(new Status(2100)));
                        this.c.l.a(null);
                    } catch (Throwable th) {
                        this.c.l.a(null);
                    }
                }
            }
        });
    }

    public String e() {
        return this.k.b();
    }
}
