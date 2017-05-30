package com.fimi.soul.biz.update;

import android.content.Context;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.w;
import com.fimi.soul.drone.c.a.a.bn;
import com.fimi.soul.drone.d.g;
import com.fimi.soul.drone.d.o;
import com.fimi.soul.drone.d.r;
import com.fimi.soul.drone.d.s;
import com.fimi.soul.drone.d.t;
import com.fimi.soul.drone.h.an;
import com.fimi.soul.drone.h.aw;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.module.dronemanage.j;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class f extends c implements com.fimi.soul.drone.d.b {
    public static com.fimi.soul.drone.g.f A = null;
    private static int H = 0;
    private static int I = 0;
    private static bn Q = null;
    static i f = null;
    public static final int h = 300;
    public static final int i = -1;
    public static final String j = "firmware_info";
    public static int k = 0;
    public static final String l = "sp_upgrading";
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 10;
    public static final int p = 5;
    public static final int q = 9;
    public static final int r = 100;
    public static final int s = 10;
    public static boolean u = false;
    public static boolean v = false;
    public static boolean w = false;
    public static boolean x = false;
    static Queue<bn> z = new LinkedList();
    List<com.fimi.soul.drone.g.f> B = new ArrayList();
    com.fimi.soul.module.update.a.a C;
    int D;
    private Timer E = new Timer();
    private Context F;
    private com.fimi.soul.drone.a G;
    private FragmentManager J;
    private boolean K;
    private Timer L = new Timer();
    private long M;
    private boolean N;
    private c O;
    private int P;
    private int R;
    public b g;
    public int t = 1500;
    public d y;

    class a extends TimerTask {
        final /* synthetic */ f a;
        private com.fimi.soul.drone.c.a.c b;
        private com.fimi.soul.drone.a c;

        public a(f fVar, com.fimi.soul.drone.c.a.c cVar, com.fimi.soul.drone.a aVar) {
            this.a = fVar;
            this.b = cVar;
            this.c = aVar;
        }

        public void run() {
            f.p();
            this.c.T().a(this.b);
            if (f.H == 20) {
                if (this.a.E != null) {
                    this.a.E.cancel();
                }
                if (f.f != null) {
                    f.f.a(false, 0, 0, -1);
                }
            }
        }
    }

    public interface b {
        void a(int i);

        void a(boolean z);
    }

    public interface c {
        void a(List<UpdateVersonBean> list);
    }

    public f(Context context, com.fimi.soul.drone.a aVar) {
        this.F = context;
        this.G = aVar;
        aVar.a((com.fimi.soul.drone.d.b) this);
        this.y = (d) com.fimi.soul.biz.camera.b.a().d();
        this.C = com.fimi.soul.module.update.a.a.a();
    }

    private void a(byte b) {
        try {
            if (this.G.N().a() == Q.d) {
                if (A != null) {
                    A.e();
                }
                Message message = new Message();
                message.what = 5;
                message.arg1 = k;
                message.arg2 = 300;
                if (this.G.N().a() == I) {
                    this.D = this.G.N().a();
                    a().sendMessage(message);
                    v = false;
                    this.K = true;
                    if (this.E != null) {
                        this.E.cancel();
                    }
                    H = 1;
                    s.a.d = b;
                    this.E = new Timer();
                    this.E.schedule(new a(this, s.a.a(), this.G), 100, 1000);
                    return;
                }
                this.D = this.G.N().a();
                a().sendMessage(message);
                if (z.size() > 0) {
                    b();
                }
            }
        } catch (Exception e) {
            if (f != null) {
                f.a(false, 0, 0, -1);
            }
        }
    }

    public static void n() {
        try {
            final UpgradeResultInfo upgradeResultInfo = (UpgradeResultInfo) com.fimi.kernel.c.c().a("upgradeResultInfo", UpgradeResultInfo.class);
            if (com.fimi.kernel.c.a() != null && upgradeResultInfo != null) {
                new Thread(new Runnable() {
                    public void run() {
                        w.a(com.fimi.kernel.c.a()).a(new k(this) {
                            final /* synthetic */ AnonymousClass4 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                                if (planeMsg.isSuccess()) {
                                    com.fimi.kernel.c.c().a("upgradeResultInfo", (Object) "");
                                }
                            }
                        }, upgradeResultInfo);
                    }
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ int p() {
        int i = H;
        H = i + 1;
        return i;
    }

    private long r() {
        I = this.C.f().a();
        z = this.C.f().b();
        return (long) I;
    }

    private void s() {
        A = new com.fimi.soul.drone.g.f(this.t, new Runnable(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void run() {
                if (f.Q != null) {
                    this.a.G.T().a(f.Q.a());
                }
                this.a.R = this.a.R + 1;
                if (this.a.R >= 10) {
                    this.a.a().sendEmptyMessage(2);
                }
            }
        });
        if (!this.B.contains(A)) {
            this.B.add(A);
        }
    }

    public void a(int i) {
        this.C.b(i);
    }

    protected void a(Message message) {
        super.a(message);
        switch (message.what) {
            case 2:
                if (A != null) {
                    A.e();
                    A.f();
                }
                this.R = 0;
                f.a(false, 0, 0, -1);
                return;
            case 3:
                f.a(false, 0, 0, -1);
                return;
            case 5:
                if (f != null && message.arg2 == 300) {
                    if (com.fimi.kernel.c.c.a().b(l) == 5) {
                        f.a(false, (long) (this.D / 2), (long) I, k);
                        return;
                    } else {
                        f.a(false, (long) this.D, (long) I, k);
                        return;
                    }
                }
                return;
            case 10:
                f.a(false, 0, 0, -1);
                return;
            default:
                return;
        }
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    public void a(final c cVar) {
        if (com.fimi.kernel.c.a() != null) {
            w.a(com.fimi.kernel.c.a()).b(new k(this) {
                final /* synthetic */ f b;

                public void a(PlaneMsg planeMsg, File file) {
                    if (planeMsg.isSuccess()) {
                        cVar.a((List) planeMsg.getData());
                    }
                }
            });
        }
    }

    public void a(i iVar) {
        f = iVar;
    }

    public void a(FirmwareInfo firmwareInfo) {
        this.C.a(firmwareInfo.getSysId(), Integer.valueOf(firmwareInfo.getVersion()).intValue());
        this.C.a(firmwareInfo.getSysId()).b(Integer.valueOf(firmwareInfo.getVersion()).intValue());
    }

    public void a(FirmwareInfo firmwareInfo, int i) {
        k = i;
        this.t = 1500;
        this.N = false;
        com.fimi.kernel.c.c.a().a(l, firmwareInfo.getSysId());
        a(firmwareInfo.getSysId());
        b(firmwareInfo.getSysId());
    }

    public void b() {
        Q = (bn) z.poll();
        if (Q != null && f != null) {
            this.G.T().a(Q.a());
            if (!A.b()) {
                A.c();
            }
        }
    }

    public void b(int i) {
        try {
            if (((int) r()) > 0) {
                if (this.E != null) {
                    this.E.cancel();
                    this.E = null;
                }
                H = 1;
                x = false;
                this.L = new Timer();
                o.a.d = (byte) i;
                o.a.e = (byte) 1;
                this.G.T().a(o.a.a());
                this.L.schedule(new a(this, o.a.a(), this.G), 200, 2000);
                return;
            }
            Toast.makeText(this.F, this.F.getResources().getString(R.string.firmware_file_not_exist), 1).show();
        } catch (Exception e) {
            Exception exception = e;
            f.a(false, 0, 0, -1);
            exception.printStackTrace();
        }
    }

    public void b(UpdateVersonBean updateVersonBean, String str, i iVar) {
        a(updateVersonBean, str, iVar);
    }

    public boolean c() {
        return this.G != null ? this.G.ac() : false;
    }

    public void d() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String e(UpdateVersonBean updateVersonBean) {
        return d(updateVersonBean);
    }

    public void e() {
        if (this.E != null) {
            this.E.cancel();
            this.E = null;
        }
        if (this.L != null) {
            this.L.cancel();
            this.L = null;
        }
        if (A != null) {
            A.e();
            A = null;
        }
        f = null;
        k = 1;
        if (this.B != null && this.B.size() > 0) {
            for (com.fimi.soul.drone.g.f fVar : this.B) {
                if (fVar != null) {
                    fVar.e();
                    fVar.f();
                }
            }
        }
    }

    public void f() {
        if (A != null) {
            A.e();
        }
        A = null;
    }

    public void k() {
        g.a.d = (byte) 1;
        this.G.T().a(g.a.a());
    }

    public void l() {
        this.G.b((com.fimi.soul.drone.d.b) this);
    }

    public void m() {
        try {
            UpgradeResultInfo a = l.a(this.F);
            if (a != null) {
                com.fimi.kernel.c.c().a("upgradeResultInfo", (Object) a);
            }
            if (com.fimi.kernel.c.a() != null) {
                w.a(com.fimi.kernel.c.a()).a(new k(this) {
                    final /* synthetic */ f a;

                    {
                        this.a = r1;
                    }

                    public void a(PlaneMsg planeMsg, File file) {
                        if (planeMsg.isSuccess()) {
                            com.fimi.kernel.c.c().a("upgradeResultInfo", (Object) "");
                        }
                    }
                }, a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, com.fimi.soul.drone.a aVar2) {
        boolean z = false;
        byte b;
        switch (aVar) {
            case RELEASECHAIN:
                an Y = aVar2.Y();
                if (Y.d == 0) {
                    if (Y.c == 1 && !x) {
                        x = true;
                        H = 1;
                        if (this.L != null) {
                            this.L.cancel();
                        }
                        this.E = new Timer();
                        r.a.d = (byte) Y.b;
                        r.a.e = (byte) 0;
                        r.a.f = (byte) 1;
                        if (System.currentTimeMillis() - this.M > 800) {
                            aVar2.T().a(r.a.a());
                            this.E.schedule(new a(this, r.a.a(), aVar2), 200, 2000);
                        }
                    }
                    this.M = System.currentTimeMillis();
                    if (Y.c == 2 && f != null && !u) {
                        t.a.d = (byte) com.fimi.kernel.c.c.a().b(l);
                        t.a.e = (byte) 1;
                        u = true;
                        H = 1;
                        if (this.E != null) {
                            this.E.cancel();
                            this.E = new Timer();
                            this.E.schedule(new a(this, t.a.a(), aVar2), 100, 1000);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case OnRecivedCloudCameraCommandInfo:
                int a = aVar2.c.a();
                if (a == 51) {
                    this.y.i().setDvVersion(((i) aVar2.c).d() + "");
                    return;
                } else if (a == 50) {
                    com.fimi.soul.drone.h.g gVar = (com.fimi.soul.drone.h.g) aVar2.c;
                    switch (gVar.f()) {
                        case UPDATEPRO:
                            if (this.g != null) {
                                this.g.a(gVar.e());
                                if (gVar.e() == 100) {
                                    this.g.a(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        case UPDATEFAILE:
                            if (this.g != null) {
                                this.g.a(false);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            case UPDATEDRONEORDERREPORT:
                if (x) {
                    x = false;
                    H = 1;
                    if (this.E != null) {
                        this.E.cancel();
                    }
                    this.P = aVar2.O().a();
                    if (r.a.d == this.P) {
                        b = aVar2.O().b();
                        if (b == (byte) 0 || b == (byte) 4) {
                            this.R = 0;
                            if (A == null) {
                                s();
                                A.d();
                            }
                            b();
                            return;
                        }
                        f.a(false, 0, 0, -1);
                        return;
                    }
                    return;
                }
                return;
            case UPDATEDRONEREPORT:
                this.R = 0;
                b = aVar2.N().b();
                if (b == (byte) 0 || b == (byte) 4) {
                    this.t = 300;
                    a(aVar2.N().b);
                    return;
                }
                f.a(false, 0, 0, -1);
                return;
            case UPDATEDRONEFINISHREPORTCRC:
                aw R = aVar2.R();
                H = 0;
                if (this.E != null) {
                    this.E.cancel();
                    this.E = null;
                }
                if (R.b == (byte) 1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (f != null) {
                        if (this.K) {
                            if (com.fimi.kernel.c.c.a().b(l) == 5) {
                                this.N = true;
                                f.a(false, (long) (I / 2), (long) I, k);
                            } else {
                                f.a(true, (long) I, (long) I, k);
                            }
                            this.K = false;
                        }
                        int i;
                        while (i < 4) {
                            t.a(aVar2, 2, com.fimi.kernel.c.c.a().b(l));
                            d();
                            i++;
                        }
                        return;
                    }
                    return;
                }
                return;
            case UPDATEDRONEFINISHREPORT:
                a().sendEmptyMessage(9);
                j.b();
                u = false;
                H = 1;
                if (!v) {
                    v = true;
                    o.a.d = aVar2.Q().c;
                    o.a.e = (byte) 2;
                    if (this.E != null) {
                        this.E.cancel();
                    }
                    this.E = new Timer();
                    this.E.schedule(new a(this, o.a.a(), aVar2), 100, 1000);
                    return;
                }
                return;
            case PowerBatteryProgress:
                if (f != null && com.fimi.kernel.c.c.a().b(l) == 5 && this.N) {
                    i iVar = f;
                    if (aVar2.ar().a() == (byte) 100) {
                        z = true;
                    }
                    iVar.a(z, (long) ((aVar2.ar().a() / 2) + 50), 100, k);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
