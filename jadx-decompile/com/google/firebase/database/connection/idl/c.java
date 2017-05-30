package com.google.firebase.database.connection.idl;

import android.content.Context;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hu;
import com.google.firebase.database.connection.idl.j.a;
import java.util.List;
import java.util.Map;

public class c implements hr {
    private final h a;

    class AnonymousClass2 extends a {
        final /* synthetic */ hu a;

        AnonymousClass2(hu huVar) {
            this.a = huVar;
        }

        public void a(String str, String str2) {
            this.a.a(str, str2);
        }
    }

    private c(h hVar) {
        this.a = hVar;
    }

    public static c a(Context context, ConnectionConfig connectionConfig, hn hnVar, hr.a aVar) {
        return new c(IPersistentConnectionImpl.loadDynamic(context, connectionConfig, hnVar.b(), hnVar.c(), aVar));
    }

    private static j a(hu huVar) {
        return new AnonymousClass2(huVar);
    }

    public void a() {
        try {
            this.a.initialize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, hu huVar) {
        try {
            this.a.onDisconnectCancel(list, a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Object obj, hu huVar) {
        try {
            this.a.put(list, f.a(obj), a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Object obj, String str, hu huVar) {
        try {
            this.a.compareAndPut(list, f.a(obj), str, a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Map<String, Object> map) {
        try {
            this.a.unlisten(list, f.a(map));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(List<String> list, Map<String, Object> map, final hq hqVar, Long l, hu huVar) {
        long longValue;
        g anonymousClass1 = new g.a(this) {
            final /* synthetic */ c b;

            public String a() {
                return hqVar.a();
            }

            public boolean b() {
                return hqVar.b();
            }

            public CompoundHashParcelable c() {
                return CompoundHashParcelable.a(hqVar.c());
            }
        };
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        longValue = -1;
        this.a.listen(list, f.a(map), anonymousClass1, longValue, a(huVar));
    }

    public void a(List<String> list, Map<String, Object> map, hu huVar) {
        try {
            this.a.merge(list, f.a(map), a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b() {
        try {
            this.a.shutdown();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b(List<String> list, Object obj, hu huVar) {
        try {
            this.a.onDisconnectPut(list, f.a(obj), a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void b(List<String> list, Map<String, Object> map, hu huVar) {
        try {
            this.a.onDisconnectMerge(list, f.a(map), a(huVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void c() {
        try {
            this.a.refreshAuthToken();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void c(String str) {
        try {
            this.a.refreshAuthToken2(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void d() {
        try {
            this.a.purgeOutstandingWrites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void d(String str) {
        try {
            this.a.interrupt(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void e(String str) {
        try {
            this.a.resume(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean f(String str) {
        try {
            return this.a.isInterrupted(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
