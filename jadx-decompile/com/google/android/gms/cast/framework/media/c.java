package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.n;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class c implements com.google.android.gms.cast.a.e {
    public static final String a = n.g;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 2100;
    public static final int g = 2103;
    private final Object h = new Object();
    private final Handler i = new Handler(Looper.getMainLooper());
    private final n j;
    private final e k = new e(this);
    private final com.google.android.gms.cast.a.b l;
    private com.google.android.gms.common.api.g m;
    private final List<a> n = new CopyOnWriteArrayList();
    private final Map<d, h> o = new ConcurrentHashMap();
    private final Map<Long, h> p = new ConcurrentHashMap();
    private c q;

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    static abstract class f extends com.google.android.gms.cast.internal.b<b> {
        p g = new p(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(long j) {
                this.a.b((m) (b) this.a.b(new Status(2103)));
            }

            public void a(long j, int i, Object obj) {
                this.a.b(new g(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }
        };

        f(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public b a(final Status status) {
            return new b(this) {
                final /* synthetic */ f b;

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

    public interface b extends m {
        JSONObject b();
    }

    public interface c {
        boolean a(MediaStatus mediaStatus);

        List<AdBreakInfo> b(MediaStatus mediaStatus);
    }

    public interface d {
        void a(long j, long j2);
    }

    private class e implements o {
        final /* synthetic */ c a;
        private com.google.android.gms.common.api.g b;
        private long c = 0;

        private final class a implements com.google.android.gms.common.api.n<Status> {
            final /* synthetic */ e a;
            private final long b;

            a(e eVar, long j) {
                this.a = eVar;
                this.b = j;
            }

            public void a(@NonNull Status status) {
                if (!status.f()) {
                    this.a.a.j.a(this.b, status.i());
                }
            }

            public /* synthetic */ void a(@NonNull m mVar) {
                a((Status) mVar);
            }
        }

        public e(c cVar) {
            this.a = cVar;
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
            for (a e : this.a.n) {
                e.e();
            }
            this.a.l.a(this.b, str, str2).a(new a(this, j));
        }
    }

    private static final class g implements b {
        private final Status a;
        private final JSONObject b;

        g(Status status, JSONObject jSONObject) {
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

    private class h {
        final /* synthetic */ c a;
        private final Set<d> b = new HashSet();
        private final long c;
        private final Runnable d;
        private boolean e;

        public h(final c cVar, long j) {
            this.a = cVar;
            this.c = j;
            this.d = new TimerTask(this) {
                final /* synthetic */ h b;

                public void run() {
                    this.b.a.a(this.b.b);
                    this.b.a.i.postDelayed(this, this.b.c);
                }
            };
        }

        public long a() {
            return this.c;
        }

        public void a(d dVar) {
            this.b.add(dVar);
        }

        public void b(d dVar) {
            this.b.remove(dVar);
        }

        public boolean b() {
            return !this.b.isEmpty();
        }

        public void c() {
            this.a.i.removeCallbacks(this.d);
            this.e = true;
            this.a.i.postDelayed(this.d, this.c);
        }

        public void d() {
            this.a.i.removeCallbacks(this.d);
            this.e = false;
        }

        public boolean e() {
            return this.e;
        }
    }

    public c(@NonNull n nVar, @NonNull com.google.android.gms.cast.a.b bVar) {
        this.l = bVar;
        this.j = (n) com.google.android.gms.common.internal.d.a((Object) nVar);
        this.j.a(new com.google.android.gms.cast.internal.n.a(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            private void e() {
                if (this.a.q != null) {
                    MediaStatus g = this.a.g();
                    if (g != null) {
                        g.a(this.a.q.a(g));
                        List b = this.a.q.b(g);
                        MediaInfo h = this.a.h();
                        if (h != null) {
                            h.b(b);
                        }
                    }
                }
            }

            public void a() {
                e();
                this.a.x();
                for (a a : this.a.n) {
                    a.a();
                }
            }

            public void b() {
                e();
                for (a b : this.a.n) {
                    b.b();
                }
            }

            public void c() {
                for (a c : this.a.n) {
                    c.c();
                }
            }

            public void d() {
                for (a d : this.a.n) {
                    d.d();
                }
            }
        });
        this.j.a(this.k);
    }

    private int a(int i) {
        MediaStatus g = g();
        for (int i2 = 0; i2 < g.q(); i2++) {
            if (g.b(i2).c() == i) {
                return i2;
            }
        }
        return -1;
    }

    private f a(f fVar) {
        try {
            this.m.b((com.google.android.gms.internal.ahl.a) fVar);
        } catch (IllegalStateException e) {
            fVar.b((m) (b) fVar.b(new Status(2100)));
        } catch (Throwable th) {
        }
        return fVar;
    }

    private void a(Set<d> set) {
        if (!n() && !m()) {
            Set<d> hashSet = new HashSet(set);
            if (l()) {
                for (d a : hashSet) {
                    a.a(e(), f());
                }
            } else if (o()) {
                MediaQueueItem q = q();
                if (q != null && q.b() != null) {
                    for (d a2 : hashSet) {
                        a2.a(0, q.b().f());
                    }
                }
            } else {
                for (d a22 : hashSet) {
                    a22.a(0, 0);
                }
            }
        }
    }

    private void w() {
        if (this.m == null) {
            throw new IllegalStateException("No connection");
        }
    }

    private void x() {
        for (h hVar : this.p.values()) {
            if (t() && !hVar.e()) {
                hVar.c();
            } else if (!t() && hVar.e()) {
                hVar.d();
            }
            if (hVar.e() && (n() || m() || o())) {
                a(hVar.b);
            }
        }
    }

    public i<b> a() {
        return a(null);
    }

    public i<b> a(double d) {
        return a(d, null);
    }

    public i<b> a(double d, JSONObject jSONObject) {
        w();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        final double d2 = d;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    try {
                        this.c.j.a(this.g, d2, jSONObject2);
                    } catch (IllegalStateException e) {
                        b((m) (b) b(new Status(2100)));
                    } catch (IllegalArgumentException e2) {
                        b((m) (b) b(new Status(2100)));
                    } catch (IOException e3) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(int i, int i2, JSONObject jSONObject) {
        w();
        final int i3 = i;
        final int i4 = i2;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                int i = 0;
                synchronized (this.d.h) {
                    int a = this.d.a(i3);
                    if (a == -1) {
                        b((m) (b) b(new Status(0)));
                    } else if (i4 < 0) {
                        b((m) (b) b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[]{Integer.valueOf(i4)}))));
                    } else if (a == i4) {
                        b((m) (b) b(new Status(0)));
                    } else {
                        MediaQueueItem b = this.d.g().b(i4 > a ? i4 + 1 : i4);
                        if (b != null) {
                            i = b.c();
                        }
                        try {
                            this.d.j.a(this.g, new int[]{i3}, i, jSONObject2);
                        } catch (IOException e) {
                            b((m) (b) b(new Status(2100)));
                        }
                    }
                }
            }
        });
    }

    public i<b> a(int i, long j, JSONObject jSONObject) {
        w();
        final int i2 = i;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.h) {
                    if (this.d.a(i2) == -1) {
                        b((m) (b) b(new Status(0)));
                        return;
                    }
                    try {
                        this.d.j.a(this.g, i2, j2, null, 0, null, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(final int i, final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    try {
                        this.c.j.a(this.g, 0, -1, null, 0, Integer.valueOf(i), jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(long j) {
        return a(j, 0, null);
    }

    public i<b> a(long j, int i) {
        return a(j, i, null);
    }

    public i<b> a(long j, int i, JSONObject jSONObject) {
        w();
        final long j2 = j;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.h) {
                    try {
                        this.d.j.a(this.g, j2, i2, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(MediaInfo mediaInfo) {
        return a(mediaInfo, true, 0, null, null);
    }

    public i<b> a(MediaInfo mediaInfo, boolean z) {
        return a(mediaInfo, z, 0, null, null);
    }

    public i<b> a(MediaInfo mediaInfo, boolean z, long j) {
        return a(mediaInfo, z, j, null, null);
    }

    public i<b> a(MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return a(mediaInfo, z, j, null, jSONObject);
    }

    public i<b> a(MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        w();
        final MediaInfo mediaInfo2 = mediaInfo;
        final boolean z2 = z;
        final long j2 = j;
        final long[] jArr2 = jArr;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c f;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.f.h) {
                    try {
                        this.f.j.a(this.g, mediaInfo2, z2, j2, jArr2, jSONObject2);
                    } catch (IllegalStateException e) {
                        b((m) (b) b(new Status(2100)));
                    } catch (IOException e2) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(MediaQueueItem mediaQueueItem, int i, long j, JSONObject jSONObject) {
        w();
        final MediaQueueItem mediaQueueItem2 = mediaQueueItem;
        final int i2 = i;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c e;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.e.h) {
                    try {
                        this.e.j.a(this.g, new MediaQueueItem[]{mediaQueueItem2}, i2, 0, 0, j2, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return a(mediaQueueItem, i, -1, jSONObject);
    }

    public i<b> a(MediaQueueItem mediaQueueItem, JSONObject jSONObject) {
        return a(new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    public i<b> a(final TextTrackStyle textTrackStyle) {
        w();
        if (textTrackStyle != null) {
            return a(new f(this, this.m) {
                final /* synthetic */ c b;

                protected void a(com.google.android.gms.cast.internal.e eVar) {
                    synchronized (this.b.h) {
                        try {
                            this.b.j.a(this.g, textTrackStyle);
                        } catch (IOException e) {
                            b((m) (b) b(new Status(2100)));
                        }
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public i<b> a(final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.h) {
                    try {
                        this.b.j.a(this.g, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(boolean z) {
        return a(z, null);
    }

    public i<b> a(final boolean z, final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    try {
                        this.c.j.a(this.g, z, jSONObject);
                    } catch (IllegalStateException e) {
                        b((m) (b) b(new Status(2100)));
                    } catch (IOException e2) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(int[] iArr, int i, JSONObject jSONObject) {
        w();
        final int[] iArr2 = iArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.h) {
                    try {
                        this.d.j.a(this.g, iArr2, i2, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(final int[] iArr, final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    try {
                        this.c.j.a(this.g, iArr, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(final long[] jArr) {
        w();
        if (jArr != null) {
            return a(new f(this, this.m) {
                final /* synthetic */ c b;

                protected void a(com.google.android.gms.cast.internal.e eVar) {
                    synchronized (this.b.h) {
                        try {
                            this.b.j.a(this.g, jArr);
                        } catch (IOException e) {
                            b((m) (b) b(new Status(2100)));
                        }
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public i<b> a(MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        w();
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c f;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.f.h) {
                    try {
                        this.f.j.a(this.g, mediaQueueItemArr2, i3, i4, j2, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) {
        return a(mediaQueueItemArr, i, i2, -1, jSONObject);
    }

    public i<b> a(MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        w();
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return a(new f(this, this.m) {
            final /* synthetic */ c d;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.d.h) {
                    try {
                        this.d.j.a(this.g, mediaQueueItemArr2, i2, 0, -1, -1, jSONObject2);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> a(final MediaQueueItem[] mediaQueueItemArr, final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    try {
                        this.c.j.a(this.g, 0, -1, mediaQueueItemArr, 0, null, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public void a(CastDevice castDevice, String str, String str2) {
        this.j.b(str2);
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.n.add(aVar);
        }
    }

    public void a(c cVar) {
        this.q = cVar;
    }

    public void a(d dVar) {
        h hVar = (h) this.o.remove(dVar);
        if (hVar != null) {
            hVar.b(dVar);
            if (!hVar.b()) {
                this.p.remove(Long.valueOf(hVar.a()));
                hVar.d();
            }
        }
    }

    public void a(com.google.android.gms.common.api.g gVar) {
        if (this.m != gVar) {
            if (this.m != null) {
                this.j.a();
                this.l.d(this.m, v());
                this.k.a(null);
            }
            this.m = gVar;
            if (this.m != null) {
                this.l.a(this.m, v(), (com.google.android.gms.cast.a.e) this);
                this.k.a(this.m);
            }
        }
    }

    public boolean a(d dVar, long j) {
        if (dVar == null || this.o.containsKey(dVar)) {
            return false;
        }
        h hVar = (h) this.p.get(Long.valueOf(j));
        if (hVar == null) {
            hVar = new h(this, j);
            this.p.put(Long.valueOf(j), hVar);
        }
        hVar.a(dVar);
        this.o.put(dVar, hVar);
        if (t()) {
            hVar.c();
        }
        return true;
    }

    public i<b> b() {
        return b(null);
    }

    public i<b> b(final int i, final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c c;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.c.h) {
                    if (this.c.a(i) == -1) {
                        b((m) (b) b(new Status(0)));
                        return;
                    }
                    try {
                        this.c.j.a(this.g, new int[]{i}, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> b(final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.h) {
                    try {
                        this.b.j.b(this.g, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.n.remove(aVar);
        }
    }

    public i<b> c() {
        return c(null);
    }

    public i<b> c(int i, JSONObject jSONObject) {
        return a(i, -1, jSONObject);
    }

    public i<b> c(final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.h) {
                    try {
                        this.b.j.c(this.g, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> d() {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c a;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.a.h) {
                    try {
                        this.a.j.a(this.g);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public i<b> d(final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.h) {
                    try {
                        this.b.j.a(this.g, 0, -1, null, -1, null, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public long e() {
        long d;
        synchronized (this.h) {
            d = this.j.d();
        }
        return d;
    }

    public i<b> e(final JSONObject jSONObject) {
        w();
        return a(new f(this, this.m) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.cast.internal.e eVar) {
                synchronized (this.b.h) {
                    try {
                        this.b.j.a(this.g, 0, -1, null, 1, null, jSONObject);
                    } catch (IOException e) {
                        b((m) (b) b(new Status(2100)));
                    }
                }
            }
        });
    }

    public long f() {
        long e;
        synchronized (this.h) {
            e = this.j.e();
        }
        return e;
    }

    public MediaStatus g() {
        MediaStatus f;
        synchronized (this.h) {
            f = this.j.f();
        }
        return f;
    }

    public MediaInfo h() {
        MediaInfo g;
        synchronized (this.h) {
            g = this.j.g();
        }
        return g;
    }

    public int i() {
        int c;
        synchronized (this.h) {
            MediaStatus g = g();
            c = g != null ? g.c() : 1;
        }
        return c;
    }

    public int j() {
        int d;
        synchronized (this.h) {
            MediaStatus g = g();
            d = g != null ? g.d() : 0;
        }
        return d;
    }

    public boolean k() {
        MediaInfo h = h();
        return h != null && h.c() == 2;
    }

    public boolean l() {
        MediaStatus g = g();
        return g != null && g.c() == 2;
    }

    public boolean m() {
        MediaStatus g = g();
        return g != null && (g.c() == 3 || (k() && j() == 2));
    }

    public boolean n() {
        MediaStatus g = g();
        return g != null && g.c() == 4;
    }

    public boolean o() {
        MediaStatus g = g();
        return (g == null || g.m() == 0) ? false : true;
    }

    public MediaQueueItem p() {
        MediaStatus g = g();
        return g == null ? null : g.a(g.l());
    }

    public MediaQueueItem q() {
        MediaStatus g = g();
        return g == null ? null : g.a(g.m());
    }

    public MediaQueueItem r() {
        MediaStatus g = g();
        return g == null ? null : g.a(g.n());
    }

    public void s() {
        int i = i();
        if (i == 4 || i == 2) {
            a();
        } else {
            c();
        }
    }

    public boolean t() {
        return n() || l() || m() || o();
    }

    public boolean u() {
        MediaStatus g = g();
        return g != null && g.r();
    }

    public String v() {
        return this.j.b();
    }
}
