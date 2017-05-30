package com.google.android.gms.common.api;

import com.google.android.gms.internal.ahn;
import java.util.ArrayList;
import java.util.List;

public final class b extends ahn<c> {
    private int a;
    private boolean b;
    private boolean c;
    private final i<?>[] d;
    private final Object e;

    public static final class a {
        private List<i<?>> a = new ArrayList();
        private g b;

        public a(g gVar) {
            this.b = gVar;
        }

        public b a() {
            return new b(this.a, this.b);
        }

        public <R extends m> d<R> a(i<R> iVar) {
            d<R> dVar = new d(this.a.size());
            this.a.add(iVar);
            return dVar;
        }
    }

    private b(List<i<?>> list, g gVar) {
        super(gVar);
        this.e = new Object();
        this.a = list.size();
        this.d = new i[this.a];
        if (list.isEmpty()) {
            b(new c(Status.a, this.d));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            i iVar = (i) list.get(i);
            this.d[i] = iVar;
            iVar.a(new com.google.android.gms.common.api.i.a(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(com.google.android.gms.common.api.Status r6) {
                    /*
                    r5 = this;
                    r0 = r5.a;
                    r1 = r0.e;
                    monitor-enter(r1);
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r0 = r0.e();	 Catch:{ all -> 0x0039 }
                    if (r0 == 0) goto L_0x0011;
                L_0x000f:
                    monitor-exit(r1);	 Catch:{ all -> 0x0039 }
                L_0x0010:
                    return;
                L_0x0011:
                    r0 = r6.g();	 Catch:{ all -> 0x0039 }
                    if (r0 == 0) goto L_0x003c;
                L_0x0017:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r2 = 1;
                    r0.c = r2;	 Catch:{ all -> 0x0039 }
                L_0x001d:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r0.a = r0.a - 1;	 Catch:{ all -> 0x0039 }
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r0 = r0.a;	 Catch:{ all -> 0x0039 }
                    if (r0 != 0) goto L_0x0037;
                L_0x002a:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r0 = r0.c;	 Catch:{ all -> 0x0039 }
                    if (r0 == 0) goto L_0x0049;
                L_0x0032:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    super.a();	 Catch:{ all -> 0x0039 }
                L_0x0037:
                    monitor-exit(r1);	 Catch:{ all -> 0x0039 }
                    goto L_0x0010;
                L_0x0039:
                    r0 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x0039 }
                    throw r0;
                L_0x003c:
                    r0 = r6.f();	 Catch:{ all -> 0x0039 }
                    if (r0 != 0) goto L_0x001d;
                L_0x0042:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r2 = 1;
                    r0.b = r2;	 Catch:{ all -> 0x0039 }
                    goto L_0x001d;
                L_0x0049:
                    r0 = r5.a;	 Catch:{ all -> 0x0039 }
                    r0 = r0.b;	 Catch:{ all -> 0x0039 }
                    if (r0 == 0) goto L_0x0069;
                L_0x0051:
                    r0 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x0039 }
                    r2 = 13;
                    r0.<init>(r2);	 Catch:{ all -> 0x0039 }
                L_0x0058:
                    r2 = r5.a;	 Catch:{ all -> 0x0039 }
                    r3 = new com.google.android.gms.common.api.c;	 Catch:{ all -> 0x0039 }
                    r4 = r5.a;	 Catch:{ all -> 0x0039 }
                    r4 = r4.d;	 Catch:{ all -> 0x0039 }
                    r3.<init>(r0, r4);	 Catch:{ all -> 0x0039 }
                    r2.b(r3);	 Catch:{ all -> 0x0039 }
                    goto L_0x0037;
                L_0x0069:
                    r0 = com.google.android.gms.common.api.Status.a;	 Catch:{ all -> 0x0039 }
                    goto L_0x0058;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.1.a(com.google.android.gms.common.api.Status):void");
                }
            });
        }
    }

    public c a(Status status) {
        return new c(status, this.d);
    }

    public void a() {
        super.a();
        for (i a : this.d) {
            a.a();
        }
    }

    public /* synthetic */ m b(Status status) {
        return a(status);
    }
}
