package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.agz;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahe;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

public final class b {
    public static final g<aha> a = new g();
    public static final com.google.android.gms.common.api.a.b<aha, com.google.android.gms.common.api.a.a.b> b = new com.google.android.gms.common.api.a.b<aha, com.google.android.gms.common.api.a.a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public aha a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new aha(context, looper, sVar, bVar2, cVar);
        }
    };
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> c = new com.google.android.gms.common.api.a("ClearcutLogger.API", b, a);
    public static final c d = new agz();
    private final Context e;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final c n;
    private final e o;
    private final a p;
    private d q;
    private final b r;

    public class a {
        final /* synthetic */ b a;
        private int b;
        private String c;
        private String d;
        private String e;
        private int f;
        private final c g;
        private ArrayList<Integer> h;
        private ArrayList<String> i;
        private ArrayList<Integer> j;
        private ArrayList<byte[]> k;
        private boolean l;
        private final com.google.android.gms.internal.ri.d m;
        private boolean n;

        private a(b bVar, byte[] bArr) {
            this(bVar, bArr, null);
        }

        private a(b bVar, byte[] bArr, c cVar) {
            this.a = bVar;
            this.b = this.a.i;
            this.c = this.a.h;
            this.d = this.a.j;
            this.e = this.a.k;
            this.f = 0;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = true;
            this.m = new com.google.android.gms.internal.ri.d();
            this.n = false;
            this.d = bVar.j;
            this.e = bVar.k;
            this.m.a = bVar.o.a();
            this.m.b = bVar.o.b();
            this.m.v = (long) bVar.p.a(bVar.e);
            this.m.p = bVar.q.a(this.m.a);
            if (bArr != null) {
                this.m.k = bArr;
            }
            this.g = cVar;
        }

        public LogEventParcelable a() {
            return new LogEventParcelable(new PlayLoggerContext(this.a.f, this.a.g, this.b, this.c, this.d, this.e, this.a.l, this.f), this.m, this.g, null, b.d(null), b.e(null), b.d(null), b.f(null), this.l);
        }

        public a a(int i) {
            this.m.e = i;
            return this;
        }

        public i<Status> a(com.google.android.gms.common.api.g gVar) {
            if (this.n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.n = true;
            PlayLoggerContext playLoggerContext = a().b;
            return this.a.r.a(playLoggerContext.h, playLoggerContext.d) ? this.a.n.a(gVar, a()) : j.a(Status.a);
        }

        public a b(int i) {
            this.m.f = i;
            return this;
        }
    }

    public interface b {
        boolean a(String str, int i);
    }

    public interface c {
        byte[] a();
    }

    public static class d {
        public long a(long j) {
            return (long) (TimeZone.getDefault().getOffset(j) / 1000);
        }
    }

    public b(Context context, int i, String str, String str2, String str3, boolean z, c cVar, e eVar, d dVar, a aVar, b bVar) {
        this.i = -1;
        this.m = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.e = applicationContext;
        this.f = context.getPackageName();
        this.g = a(context);
        this.i = i;
        this.h = str;
        this.j = str2;
        this.k = str3;
        this.l = z;
        this.n = cVar;
        this.o = eVar;
        if (dVar == null) {
            dVar = new d();
        }
        this.q = dVar;
        this.p = aVar;
        this.m = 0;
        this.r = bVar;
        if (this.l) {
            com.google.android.gms.common.internal.d.b(this.j == null, "can't be anonymous with an upload account");
        }
    }

    public b(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, d, h.d(), null, a.a, new ahe(context));
    }

    private int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    private static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }

    private static String[] e(ArrayList<String> arrayList) {
        return arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
    }

    private static byte[][] f(ArrayList<byte[]> arrayList) {
        return arrayList == null ? null : (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public a a(byte[] bArr) {
        return new a(bArr);
    }
}
