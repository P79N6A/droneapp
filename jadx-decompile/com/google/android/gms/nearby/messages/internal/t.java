package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.e;
import com.google.android.gms.nearby.messages.f;
import com.google.android.gms.nearby.messages.k;
import com.google.android.gms.nearby.messages.l;
import com.google.android.gms.nearby.messages.n;
import java.util.List;

public class t implements f {
    public static final g<s> a = new g();
    public static final b<s, com.google.android.gms.nearby.messages.g> b = new b<s, com.google.android.gms.nearby.messages.g>() {
        public int a() {
            return Integer.MAX_VALUE;
        }

        public s a(Context context, Looper looper, s sVar, com.google.android.gms.nearby.messages.g gVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return new s(context, looper, bVar, cVar, sVar, gVar);
        }
    };

    static abstract class a extends com.google.android.gms.internal.ahl.a<Status, s> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(com.google.android.gms.nearby.a.e, gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static List<Update> a(Intent intent) {
        return p.a(intent, "com.google.android.gms.nearby.messages.UPDATES");
    }

    static void a(Iterable<Update> iterable, e eVar) {
        for (Update update : iterable) {
            if (update.a(1)) {
                eVar.a(update.c);
            }
            if (update.a(2)) {
                eVar.b(update.c);
            }
            if (update.a(4)) {
                eVar.a(update.c, update.d);
            }
            if (update.a(8)) {
                eVar.a(update.c, update.e);
            }
        }
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t a;

            protected void a(s sVar) {
                sVar.a((ahl.b) this);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, PendingIntent pendingIntent) {
        return a(gVar, pendingIntent, n.a);
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, final PendingIntent pendingIntent, final n nVar) {
        d.a(pendingIntent);
        d.a(nVar);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t c;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, pendingIntent, nVar);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, Message message) {
        return a(gVar, message, k.a);
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, final Message message, final k kVar) {
        d.a(message);
        d.a(kVar);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t c;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, MessageWrapper.a(message), kVar);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, e eVar) {
        return a(gVar, eVar, n.a);
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, e eVar, n nVar) {
        d.a(eVar);
        d.a(nVar);
        final ail a = ((s) gVar.a(a)).a(gVar, eVar);
        final e eVar2 = eVar;
        final n nVar2 = nVar;
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t d;

            protected void a(s sVar) {
                sVar.a(this, a, eVar2, nVar2, null);
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, final l lVar) {
        d.a(lVar);
        final ail a = ((s) gVar.a(a)).a(gVar, lVar);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t c;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, a, lVar);
            }
        });
    }

    public void a(Intent intent, e eVar) {
        a(a(intent), eVar);
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final PendingIntent pendingIntent) {
        d.a(pendingIntent);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t b;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, pendingIntent);
            }
        });
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final Message message) {
        d.a(message);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t b;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, MessageWrapper.a(message));
            }
        });
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final e eVar) {
        d.a(eVar);
        final ail a = ((s) gVar.a(a)).a(gVar, eVar);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t c;

            protected void a(s sVar) {
                sVar.a((ahl.b) this, a, eVar);
            }
        });
    }

    public i<Status> b(com.google.android.gms.common.api.g gVar, final l lVar) {
        final ail a = ((s) gVar.a(a)).a(gVar, lVar);
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ t c;

            protected void a(s sVar) {
                sVar.b(this, a, lVar);
            }
        });
    }
}
