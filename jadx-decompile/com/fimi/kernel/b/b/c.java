package com.fimi.kernel.b.b;

import android.content.Context;
import com.fimi.kernel.b.b.b.d;
import com.fimi.kernel.b.b.b.e;
import java.util.ArrayList;
import java.util.List;

public class c implements d {
    private static int c = 3;
    private static c d;
    private static List<b> e;
    List<String> a;
    private a b;
    private b f;
    private Context g;
    private String h;

    public interface a {
        void a(b bVar, int i);
    }

    public interface b {
        void a(List<b> list, boolean z, b bVar);
    }

    private c() {
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (d == null) {
                d = new c();
                d.g = context;
            }
            d.g = context;
            cVar = d;
        }
        return cVar;
    }

    private boolean b(b bVar) {
        bVar.a(bVar);
        String m = bVar.m();
        for (b m2 : e) {
            if (m2.m().equals(m)) {
                e.remove(bVar);
                if (this.f != null) {
                    this.f.a(e, false, bVar);
                }
                return true;
            }
        }
        return false;
    }

    public synchronized b a(Context context, String str) {
        b bVar;
        b bVar2 = null;
        synchronized (this) {
            if (str == null) {
                bVar = null;
            } else {
                if (e != null) {
                    int i = 0;
                    while (i < e.size()) {
                        if (((b) e.get(i)).b().equals(str) || ((b) e.get(i)).m().equals(str)) {
                            bVar = (b) e.get(i);
                            break;
                        }
                        i++;
                    }
                    bVar = null;
                    if (bVar == null) {
                        bVar2 = bVar;
                    }
                } else {
                    e = new ArrayList();
                }
                if (this.a == null || this.a.size() > 0) {
                    this.a = f.a(context).a();
                }
                if (this.a != null && this.a.size() > 0) {
                    for (String str2 : this.a) {
                        if (!str2.endsWith(str)) {
                            if (str2.equals(str)) {
                            }
                        }
                        bVar = f.a(context).a(context, str2, new com.fimi.kernel.b.b.f.a(this) {
                            final /* synthetic */ c a;

                            {
                                this.a = r1;
                            }

                            public void a(b bVar) {
                                if (bVar != null && this.a.b() < c.c) {
                                    bVar.c();
                                }
                            }
                        });
                    }
                }
                bVar = bVar2;
                if (bVar != null) {
                    e.add(bVar);
                    bVar.b((d) this);
                    if (this.f != null) {
                        this.f.a(e, true, bVar);
                    }
                }
            }
        }
        return bVar;
    }

    public void a() {
        if (e != null && e.size() == 0) {
            f.a(this.g).c();
        }
    }

    public void a(com.fimi.kernel.b.b.b.a aVar, b bVar) {
        if (aVar == com.fimi.kernel.b.b.b.a.Completed && !bVar.m().equals(this.h)) {
            this.h = bVar.m();
            int b = b();
            if (this.b != null) {
                this.b.a(bVar, b);
            }
            c();
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public synchronized void a(String str, String str2, long j, Boolean bool, String str3) {
        if (e == null) {
            e = new ArrayList();
        }
        for (int size = e.size() - 1; size >= 0; size--) {
            if (((b) e.get(size)).m().equals(str)) {
                ((b) e.get(size)).a((b) e.get(size));
                e.remove(size);
                f.a(this.g).d(str);
                break;
            }
        }
        b a = b.a(this.g, str, str2, j, bool, str3, new e(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(b bVar) {
                if (bVar != null) {
                    bVar.b(this.a);
                    if (this.a.b() < c.c) {
                        bVar.c();
                    }
                    if (this.a.f != null) {
                        this.a.f.a(c.e, true, bVar);
                    }
                }
            }
        });
        if (a != null) {
            e.add(a);
        }
    }

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        f.a(this.g).d(bVar.m());
        return b(bVar);
    }

    public synchronized int b() {
        int i;
        i = 0;
        for (b g : e) {
            i = g.g() == com.fimi.kernel.b.b.b.a.Downloading ? i + 1 : i;
        }
        return i;
    }

    public void c() {
        if (b() < c) {
            for (b bVar : e) {
                if (bVar.g() == com.fimi.kernel.b.b.b.a.Wait) {
                    bVar.c();
                    return;
                }
            }
        }
    }

    public void d() {
        if (e != null && e.size() > 0) {
            for (b bVar : e) {
                if (bVar.g() == com.fimi.kernel.b.b.b.a.Downloading || bVar.g() == com.fimi.kernel.b.b.b.a.Wait) {
                    bVar.e();
                }
            }
        }
    }

    public void e() {
        if (e != null && e.size() > 0) {
            for (b bVar : e) {
                if (bVar.g() == com.fimi.kernel.b.b.b.a.Pause) {
                    if (b() < c) {
                        bVar.c();
                    } else {
                        bVar.d();
                    }
                }
            }
        }
    }
}
