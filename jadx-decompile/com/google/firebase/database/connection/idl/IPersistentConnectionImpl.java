package com.google.firebase.database.connection.idl;

import android.content.Context;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.akb;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.kq;
import com.google.firebase.database.connection.idl.h.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@DynamiteApi
public class IPersistentConnectionImpl extends a {
    private hr a;

    class AnonymousClass2 implements hu {
        final /* synthetic */ j a;

        AnonymousClass2(j jVar) {
            this.a = jVar;
        }

        public void a(String str, String str2) {
            try {
                this.a.a(str, str2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass3 extends i.a {
        final /* synthetic */ hr.a a;

        AnonymousClass3(hr.a aVar) {
            this.a = aVar;
        }

        public void a() {
            this.a.a();
        }

        public void a(e eVar) {
            this.a.a((Map) f.a(eVar));
        }

        public void a(List<String> list, e eVar, boolean z, long j) {
            this.a.a(list, f.a(eVar), z, IPersistentConnectionImpl.b(j));
        }

        public void a(List<String> list, List<RangeParcelable> list2, e eVar, long j) {
            List list3 = (List) f.a(eVar);
            List arrayList = new ArrayList(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(RangeParcelable.a((RangeParcelable) list2.get(i), list3.get(i)));
            }
            this.a.a(list, arrayList, IPersistentConnectionImpl.b(j));
        }

        public void a(boolean z) {
            this.a.a(z);
        }

        public void b() {
            this.a.b();
        }
    }

    class AnonymousClass4 implements hr.a {
        final /* synthetic */ i a;

        AnonymousClass4(i iVar) {
            this.a = iVar;
        }

        public void a() {
            try {
                this.a.a();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(List<String> list, Object obj, boolean z, Long l) {
            try {
                this.a.a((List) list, f.a(obj), z, IPersistentConnectionImpl.b(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(List<String> list, List<ht> list2, Long l) {
            List arrayList = new ArrayList(list2.size());
            List arrayList2 = new ArrayList(list2.size());
            for (ht htVar : list2) {
                arrayList.add(RangeParcelable.a(htVar));
                arrayList2.add(htVar.c());
            }
            try {
                this.a.a((List) list, arrayList, f.a(arrayList2), IPersistentConnectionImpl.b(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(Map<String, Object> map) {
            try {
                this.a.a(f.a(map));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(boolean z) {
            try {
                this.a.a(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void b() {
            try {
                this.a.b();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass5 extends e.a {
        final /* synthetic */ hm a;

        AnonymousClass5(hm hmVar) {
            this.a = hmVar;
        }

        public void a(boolean z, final f fVar) {
            this.a.a(z, new hm.a(this) {
                final /* synthetic */ AnonymousClass5 b;

                public void a(String str) {
                    try {
                        fVar.a(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public void b(String str) {
                    try {
                        fVar.b(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    class AnonymousClass6 implements hm {
        final /* synthetic */ e a;

        AnonymousClass6(e eVar) {
            this.a = eVar;
        }

        public void a(boolean z, final hm.a aVar) {
            try {
                this.a.a(z, new f.a(this) {
                    final /* synthetic */ AnonymousClass6 b;

                    public void a(String str) {
                        aVar.a(str);
                    }

                    public void b(String str) {
                        aVar.b(str);
                    }
                });
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static hm a(e eVar) {
        return new AnonymousClass6(eVar);
    }

    private static hr.a a(i iVar) {
        return new AnonymousClass4(iVar);
    }

    private static hu a(j jVar) {
        return new AnonymousClass2(jVar);
    }

    private static e a(hm hmVar) {
        return new AnonymousClass5(hmVar);
    }

    private static i a(hr.a aVar) {
        return new AnonymousClass3(aVar);
    }

    private static long b(Long l) {
        if (l == null) {
            return -1;
        }
        if (l.longValue() != -1) {
            return l.longValue();
        }
        throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
    }

    private static Long b(long j) {
        return j == -1 ? null : Long.valueOf(j);
    }

    public static h loadDynamic(Context context, ConnectionConfig connectionConfig, hm hmVar, ScheduledExecutorService scheduledExecutorService, hr.a aVar) {
        try {
            h asInterface = a.asInterface(akb.a(context, akb.d, ModuleDescriptor.MODULE_ID).a("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(connectionConfig, a(hmVar), f.a(scheduledExecutorService), a(aVar));
            return asInterface;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public void compareAndPut(List<String> list, e eVar, String str, j jVar) {
        this.a.a(list, f.a(eVar), str, a(jVar));
    }

    public void initialize() {
        this.a.a();
    }

    public void interrupt(String str) {
        this.a.d(str);
    }

    public boolean isInterrupted(String str) {
        return this.a.f(str);
    }

    public void listen(List<String> list, e eVar, final g gVar, long j, j jVar) {
        Long b = b(j);
        List<String> list2 = list;
        this.a.a(list2, (Map) f.a(eVar), new hq(this) {
            final /* synthetic */ IPersistentConnectionImpl b;

            public String a() {
                try {
                    return gVar.a();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public boolean b() {
                try {
                    return gVar.b();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public hk c() {
                try {
                    return CompoundHashParcelable.a(gVar.c());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }, b, a(jVar));
    }

    public void merge(List<String> list, e eVar, j jVar) {
        this.a.a((List) list, (Map) f.a(eVar), a(jVar));
    }

    public void onDisconnectCancel(List<String> list, j jVar) {
        this.a.a((List) list, a(jVar));
    }

    public void onDisconnectMerge(List<String> list, e eVar, j jVar) {
        this.a.b((List) list, (Map) f.a(eVar), a(jVar));
    }

    public void onDisconnectPut(List<String> list, e eVar, j jVar) {
        this.a.b((List) list, f.a(eVar), a(jVar));
    }

    public void purgeOutstandingWrites() {
        this.a.d();
    }

    public void put(List<String> list, e eVar, j jVar) {
        this.a.a((List) list, f.a(eVar), a(jVar));
    }

    public void refreshAuthToken() {
        this.a.c();
    }

    public void refreshAuthToken2(String str) {
        this.a.c(str);
    }

    public void resume(String str) {
        this.a.e(str);
    }

    public void setup(ConnectionConfig connectionConfig, e eVar, e eVar2, i iVar) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f.a(eVar2);
        this.a = new hs(new hn(new kq(connectionConfig.a(), connectionConfig.b()), a(eVar), scheduledExecutorService, connectionConfig.e, connectionConfig.f, connectionConfig.g), HostInfoParcelable.a(connectionConfig.b), a(iVar));
    }

    public void shutdown() {
        this.a.b();
    }

    public void unlisten(List<String> list, e eVar) {
        this.a.a((List) list, (Map) f.a(eVar));
    }
}
