package com.fimi.soul.module.droneTrack.a;

import com.fimi.kernel.utils.r;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.h.c;
import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.module.droneTrack.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class e {
    private static final String c = c.a().b();
    int a = 0;
    LinkedHashMap<Integer, List<Object>> b;
    private volatile String d;
    private List<Object> e = new ArrayList();
    private volatile Object f;
    private boolean g;

    public Object a(int i, f fVar) {
        switch (i) {
            case 2:
                y yVar = new y();
                yVar.a(fVar.a(), (double) fVar.a(), (double) fVar.a(), (double) fVar.a(), (double) fVar.a(), (double) fVar.b(), (double) fVar.b(), (double) fVar.b(), (double) fVar.a(), (double) fVar.a(), (double) fVar.b(), (double) fVar.b(), (double) fVar.a(), (double) fVar.a());
                return yVar;
            case 3:
                ag agVar = new ag();
                agVar.a((double) fVar.b(), fVar.a(), fVar.f(), fVar.f(), (double) fVar.g(), (double) fVar.f(), fVar.a());
                return agVar;
            case 4:
                z zVar = new z();
                zVar.a((double) fVar.f(), (double) fVar.f(), (double) fVar.g(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a());
                return zVar;
            case 5:
                d dVar = new d();
                dVar.a(fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.b(), fVar.b(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a());
                return dVar;
            case 7:
                b bVar = new b();
                bVar.a(fVar.a(), fVar.b(), fVar.f(), fVar.f(), fVar.a(), fVar.b(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a());
                return bVar;
            case 9:
                q qVar = new q();
                qVar.a(fVar.c(), fVar.c());
                return qVar;
            case 11:
                com.fimi.soul.drone.h.a.e eVar = new com.fimi.soul.drone.h.a.e();
                eVar.a(fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a());
                return eVar;
            case 98:
                com.fimi.soul.drone.h.c cVar = new com.fimi.soul.drone.h.c();
                cVar.a(fVar.a(), fVar.a(), fVar.a());
                b.a().a(cVar);
                return cVar;
            case 99:
                ao aoVar = new ao();
                aoVar.a(fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a(), fVar.a());
                return aoVar;
            case 105:
                ad adVar = new ad();
                adVar.a(fVar.a());
                adVar.h(fVar.b());
                adVar.g(fVar.b());
                adVar.f(fVar.b());
                adVar.e(fVar.b());
                adVar.d(fVar.b());
                adVar.c(fVar.b());
                adVar.b(fVar.b());
                adVar.a(fVar.b());
                return adVar;
            case 198:
                com.fimi.soul.drone.h.e eVar2 = new com.fimi.soul.drone.h.e();
                eVar2.a(fVar.b(), fVar.b(), fVar.b(), fVar.b(), fVar.b());
                b.a().a(eVar2);
                return eVar2;
            default:
                return null;
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(final String[] strArr) {
        x.b(new Runnable(this) {
            final /* synthetic */ e b;

            public void run() {
                int i = 0;
                this.b.a(false);
                this.b.b = new LinkedHashMap();
                int length = strArr.length;
                while (i < length) {
                    String a = r.a(strArr[i], e.c);
                    try {
                        String replace = a.substring(a.indexOf("fe"), a.length()).replace(" ", "");
                        int parseInt = Integer.parseInt(replace.substring(4, 6), 16);
                        char[] toCharArray = replace.substring(6, replace.length() - 4).toCharArray();
                        a = a.substring(0, a.indexOf("fe") - 8);
                        f fVar = new f(toCharArray);
                        if (this.b.d == null) {
                            this.b.d = a;
                        }
                        this.b.f = this.b.a(parseInt, fVar);
                        if (!a.equals(this.b.d)) {
                            e eVar = this.b;
                            eVar.a++;
                            this.b.d = a;
                            List arrayList = new ArrayList();
                            arrayList.addAll(this.b.e);
                            this.b.b.put(Integer.valueOf(this.b.a), arrayList);
                            this.b.e.clear();
                            if (this.b.f != null) {
                                this.b.e.add(this.b.f);
                            }
                        } else if (this.b.f != null) {
                            if (this.b.f instanceof com.fimi.soul.drone.h.a.e) {
                                this.b.e.add(this.b.f);
                            } else {
                                this.b.e.add(this.b.f);
                            }
                        }
                    } catch (Exception e) {
                    }
                    i++;
                }
                this.b.a(true);
            }
        });
    }

    public boolean a() {
        return this.g;
    }

    public LinkedHashMap<Integer, List<Object>> b() {
        return this.b;
    }
}
