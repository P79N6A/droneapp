package com.fimi.soul.biz.j;

import android.content.Context;
import android.os.Handler;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.entity.DroneModelBean;
import com.fimi.soul.module.droneFragment.i;
import com.fimi.soul.utils.ak;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

public class c implements b {
    private DroneModelBean a;
    private d b;
    private a c;
    private int d;
    private int e = 20;
    private int f = 20;
    private int g = 100;
    private ak h;
    private boolean i = true;
    private WeakReference<Context> j;
    private e k;
    private Handler l = new Handler();
    private Runnable m = new Runnable(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.b();
        }
    };
    private h n;
    private boolean o;
    private Observer p = new Observer(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void update(Observable observable, Object obj) {
            this.a.a();
            switch (this.a.e) {
                case 1:
                case 2:
                    if (this.a.a.getCurrentFlightModel() == 7 && this.a.e != 2) {
                        this.a.b.a(R.string.comtohome);
                        this.a.k.a(this.a.c.d.getString(R.string.comtohome));
                        this.a.c.a(d.a.NOTIDRONEFLOOR);
                        return;
                    } else if (this.a.a.getCurrentFlightModel() == 3) {
                        this.a.b.a(R.string.comalding);
                        this.a.k.a(this.a.c.d.getString(R.string.comalding));
                        this.a.c.a(d.a.NOTIDRONEFLOOR);
                        return;
                    } else {
                        this.a.b.a(R.string.comtakeoff);
                        this.a.k.a(this.a.c.d.getString(R.string.comtakeoff));
                        return;
                    }
                default:
                    return;
            }
        }
    };
    private int q;

    public c(d dVar, a aVar, Context context) {
        this.b = dVar;
        this.a = new DroneModelBean(aVar);
        this.a.addObserver(this.p);
        this.c = aVar;
        this.j = new WeakReference(context);
        this.k = new e(aVar);
        this.n = h.a(context);
    }

    private void a(int i) {
        this.b.a(i);
    }

    private void b(int i) {
        this.b.b(i);
    }

    private void e() {
        if (this.c.aj().g().judgeNoAction()) {
            h();
            i();
        }
    }

    private void f() {
        if (!this.c.aj().g().isEnterModel() || this.c.g().k() || this.f == 0) {
            if (this.q != 0) {
                this.q = 0;
            }
            this.b.a(0, 4);
            return;
        }
        this.q++;
        if (this.q > 3) {
            this.b.a(R.string.exit, 0);
            this.q = 0;
        }
    }

    private void g() {
        if (this.c.ac() || this.c.af()) {
            if (this.e == 2 && !this.c.ac() && this.d == 1) {
                a((int) R.string.lightstreamfly);
                b((int) R.drawable.normal_icon);
            } else if (this.e == 1 && !this.c.ac() && this.d == 1) {
                a((int) R.string.gpsfly);
                this.o = false;
                b((int) R.drawable.normal_icon);
            } else if (this.e == 0 && !this.c.ac() && this.d == 1) {
                a((int) R.string.attibase);
                b((int) R.drawable.normal_icon);
            } else if (this.e == 2 && this.c.ac() && this.d == 1) {
                a((int) R.string.lightstreamfling);
                b((int) R.drawable.normal_icon);
            } else if (this.e == 1 && this.c.ac() && this.d == 1) {
                a((int) R.string.gpsfling);
                b((int) R.drawable.normal_icon);
                j();
            } else if (this.e == 0 && this.c.ac() && this.d == 1) {
                a((int) R.string.attfling);
                b((int) R.drawable.normal_icon);
            } else if (this.d == 7) {
                a((int) R.string.tohome);
                b((int) R.drawable.sailround_icon);
                if (this.c.g().k()) {
                    e();
                }
            } else if (this.d == 8) {
                e();
                a((int) R.string.returntohome);
                b((int) R.drawable.sailround_icon);
                if (this.i && this.h == null) {
                    this.i = false;
                    this.k.a(this.c.d.getResources().getString(R.string.returntohome));
                    this.h = new ak((Context) this.j.get(), new ak.a(this) {
                        final /* synthetic */ c a;

                        {
                            this.a = r1;
                        }

                        public void a() {
                            if (this.a.h != null) {
                                this.a.h.dismiss();
                                this.a.h = null;
                            }
                        }
                    }, 3);
                    this.h.setCancelable(true);
                    this.h.show();
                }
            } else if (this.d == 3) {
                a((int) R.string.landing);
                b((int) R.drawable.landing_icon);
                e();
            } else if (this.d == 9) {
                e();
                a((int) R.string.lowlanding);
                b((int) R.drawable.landing_icon);
            } else if (this.d == 2) {
                a((int) R.string.take_off);
                b((int) R.drawable.takeoff_icon);
            } else if (this.d == 4) {
                this.o = true;
                if (this.f == 4) {
                    a((int) R.string.stopflyto);
                    b((int) R.drawable.destination_icon);
                } else if (this.f == 2) {
                    a((int) R.string.flyto);
                    b((int) R.drawable.destination_icon);
                }
            } else if (this.d == 5) {
                if (this.f == 4) {
                    a((int) R.string.stop_poi_fly);
                    b((int) R.drawable.detouringpoint_icon);
                } else if (this.f == 2) {
                    a((int) R.string.interestFly);
                    b((int) R.drawable.detouringpoint_icon);
                }
            } else if (this.d == 6) {
                this.o = true;
                if (this.f == 4) {
                    a((int) R.string.stopwaypoint);
                    b((int) R.drawable.icon_fly_airline);
                } else if (this.f == 2) {
                    a((int) R.string.execuwaypoint);
                    b((int) R.drawable.icon_fly_airline);
                }
            } else if (this.d != 10) {
                a((int) R.string.condrone);
                b((int) R.drawable.normal_icon);
            } else if (this.f == 4) {
                a((int) R.string.stoptake_photo);
                b((int) R.mipmap.icon_fly_mode_selfie);
            } else if (this.f == 2) {
                a((int) R.string.take_photo_fly);
                b((int) R.mipmap.icon_fly_mode_selfie);
            }
        } else if (this.c.al().j() && this.c.aj().a() == (byte) 0) {
            a((int) R.string.attibase);
            b((int) R.drawable.normal_icon);
        } else {
            a((int) R.string.self_error_result);
            b((int) R.drawable.notnormal_icon);
        }
    }

    private void h() {
        this.c.a(d.a.CLOSEFLYACTIONFRAGMENT);
    }

    private void i() {
        this.o = false;
        this.c.a(d.a.NOTIDRONEFLOOR);
    }

    private void j() {
        if (!this.o) {
            this.o = true;
            this.c.a(d.a.NOTIDRONEAIR);
        }
    }

    public void a() {
        i.a(false);
        this.l.postDelayed(this.m, 5000);
    }

    public void b() {
        i.a(true);
    }

    public void c() {
        if (this.k != null) {
            this.k.a();
        }
        this.c.b((b) this);
    }

    public void d() {
        if (this.k != null) {
            this.k.b();
        }
        this.c.a((b) this);
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        if (aVar2.U() && aVar2.T().a()) {
            switch (aVar) {
                case SENDHOVERWAYPOINT:
                    com.fimi.soul.module.calibcompass.a.a().a("147");
                    return;
                case RETAKEUP:
                    com.fimi.soul.module.calibcompass.a.a().a("146");
                    return;
                case RELANDING:
                    com.fimi.soul.module.calibcompass.a.a().a("145");
                    aVar2.a(d.a.NOTIDRONEFLOOR);
                    return;
                case REHOME:
                    com.fimi.soul.module.calibcompass.a.a().a("144");
                    aVar2.a(d.a.NOTIDRONEFLOOR);
                    return;
                case NEWFRONEMODEL:
                    this.d = aVar2.aj().e();
                    this.e = aVar2.aj().d();
                    this.f = aVar2.aj().f();
                    this.a.setFlightModel(this.d, this.e);
                    f();
                    if (this.d != 8) {
                        this.i = true;
                    }
                    if (i.d().get()) {
                        g();
                    }
                    if (this.g == 5 && this.d != 5) {
                        this.k.a(aVar2.d.getString(R.string.poi_point_com));
                    }
                    if (this.g != 10 && this.d == 10) {
                        aVar2.a(d.a.ENTRYTAKEPHOTOMODEL);
                    }
                    this.g = this.d;
                    return;
                default:
                    return;
            }
        }
    }
}
