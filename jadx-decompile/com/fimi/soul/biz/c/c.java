package com.fimi.soul.biz.c;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ak;
import com.fimi.soul.drone.h.as;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.dronemanage.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import java.util.List;
import java.util.Observable;

public class c extends Observable implements b {
    private static final int r = 11;
    private h a;
    private e b;
    private o c;
    private b d;
    private k e;
    private d f;
    private a g;
    private int h;
    private int i;
    private boolean j = true;
    private boolean k = true;
    private boolean l = true;
    private boolean m = true;
    private int n = 1000;
    private boolean o = true;
    private boolean p;
    private FragmentManager q;
    private Handler s = new Handler(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == this.a.n) {
                this.a.o = false;
            } else if (message.what == 11) {
                this.a.p = false;
            }
        }
    };

    public c(a aVar, com.google.android.gms.maps.c cVar, Context context, FragmentManager fragmentManager) {
        this.q = fragmentManager;
        this.g = aVar;
        aVar.a((b) this);
        this.a = h.a(aVar.d);
        this.b = new e(cVar, context, aVar);
        this.c = new o(cVar, context, aVar);
        this.e = new k(cVar, context, aVar);
        this.f = new d(cVar, context, aVar);
        this.d = new b(cVar, context, aVar);
    }

    private void e() {
        if (this.h == 4 && this.i == 1 && !this.p) {
            this.b.c();
            z.a(this.g.d, (int) R.string.excute_direction_com, 3000);
            com.fimi.kernel.d.b.b(this.g.d).a(this.g.d.getString(R.string.excute_direction_com));
            this.b.d();
        }
        this.h = this.i;
    }

    private void f() {
        if (this.h == 10 && this.i == 1 && !this.p) {
            z.a(this.g.d, (int) R.string.excute_takephoto_com, 3000);
            com.fimi.kernel.d.b.b(this.g.d).a(this.g.d.getString(R.string.excute_takephoto_com));
            h.a(this.g.d).a(0);
        }
        this.h = this.i;
    }

    private void g() {
        ag u = this.g.u();
        LatLng latLng = new LatLng(u.e(), u.d());
        if (this.a.a().get() == 1) {
            this.c.a(latLng);
        } else if (this.a.a().get() == 2) {
            this.b.a(latLng);
        } else if (this.a.a().get() == 3) {
            this.e.a(latLng);
        } else if (this.a.a().get() == 4) {
            this.d.b(latLng);
        }
    }

    private void h() {
        int e = this.g.v().e();
        if (this.h == 6 && this.i == 1) {
            this.c.c();
        } else if (this.h == 7 && this.i == 1 && this.g.ac()) {
            this.g.a(com.fimi.soul.drone.d.a.NOTIDRONEAIR);
        }
        this.h = this.i;
        if (this.i == 6) {
            g();
            if (!this.o) {
                this.c.a(e);
            }
        }
    }

    public void a() {
        FlyActionBean j = d.k().j();
        if (j != null) {
            switch (j.getModelType()) {
                case 1:
                    if (2 == j.getType()) {
                        this.c.a(j);
                        return;
                    }
                    d.k().m();
                    this.g.a(com.fimi.soul.drone.d.a.CLEARDATA);
                    return;
                case 2:
                    this.b.b();
                    return;
                case 3:
                    this.e.i();
                    return;
                default:
                    return;
            }
        }
    }

    public void a(LatLng latLng, int i) {
        if (d.k().d()) {
            g c = d.k().c();
            if (c != null) {
                c.i();
                FlyActionBean flyActionBean = (FlyActionBean) c.o();
                if (flyActionBean.getModelType() == 1) {
                    c.a(j.a(this.g.d, R.drawable.icon_fly_waypoint_blue, flyActionBean.getHeight(), false));
                }
                d.k().a(null);
                d.k().a(false);
            }
        } else if (this.a.a().get() == 1) {
            this.c.a(latLng, i);
        } else if (this.a.a().get() == 2) {
            this.b.a(latLng, i);
        } else if (this.a.a().get() != 3) {
        }
    }

    public void a(g gVar) {
        FlyActionSettingFragment flyActionSettingFragment = (FlyActionSettingFragment) this.q.findFragmentById(R.id.flyaction);
        FlyActionBean flyActionBean = gVar.o() instanceof FlyActionBean ? (FlyActionBean) gVar.o() : null;
        List<g> e = d.k().e();
        if (e != null && flyActionBean != null) {
            d.k().a(flyActionBean);
            for (g gVar2 : e) {
                FlyActionBean flyActionBean2 = (FlyActionBean) gVar2.o();
                if (gVar2.o() == null || !gVar2.o().equals(flyActionBean)) {
                    if (flyActionSettingFragment != null && flyActionSettingFragment.isVisible() && 2 == flyActionBean.getType() && flyActionBean2 != null) {
                        gVar2.a(j.a(this.g.d, R.drawable.icon_fly_waypoint_blue, flyActionBean2.getHeight(), false));
                        flyActionBean2.setDrawableRes(R.drawable.icon_fly_waypoint_blue);
                    }
                } else if (flyActionSettingFragment != null) {
                    if (flyActionSettingFragment.isVisible()) {
                        this.g.a(com.fimi.soul.drone.d.a.SHOWHEIGHTVIEW);
                        if (flyActionBean.getModelType() == 1) {
                            flyActionBean2.setDrawableRes(R.drawable.icon_fly_waypoint_red);
                            gVar.a(j.a(this.g.d, R.drawable.icon_fly_waypoint_red, flyActionBean2.getHeight(), true));
                            d.k().a(true);
                            d.k().a(flyActionBean2);
                            d.k().a(gVar2);
                        }
                    } else if (flyActionBean.getModelType() == 1) {
                        this.c.e();
                    } else if (flyActionBean.getModelType() == 2) {
                        gVar.a(this.g.d.getString(R.string.delete_marker));
                        gVar.h();
                    } else if (flyActionBean.getModelType() == 3) {
                        gVar.a(this.g.d.getString(R.string.delete_marker));
                        gVar.h();
                    }
                }
            }
        }
    }

    public void b() {
        if (this.a.a().get() == 1) {
            this.c.d();
        } else if (this.a.a().get() != 2 && this.a.a().get() == 3) {
        }
    }

    public void c() {
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = true;
        d.k().h().clear();
    }

    public void d() {
        this.g.a((b) this);
    }

    public void onDroneEvent(com.fimi.soul.drone.d.a aVar, a aVar2) {
        switch (aVar) {
            case CLEARTAKEPHOTO:
                this.d.c();
                return;
            case CREATEPOI:
                this.e.a();
                return;
            case CLEANALLOBJ:
                c();
                this.j = true;
                d.k().m();
                this.c.b();
                this.b.b();
                this.e.i();
                this.d.c();
                return;
            case SHOWINFORWINDOW:
                this.c.e();
                return;
            case RETURNASSIGNWAYPOINT:
                this.p = true;
                if (this.s.hasMessages(11)) {
                    this.s.removeMessages(11);
                    this.s.sendEmptyMessageDelayed(11, 2000);
                } else {
                    this.s.sendEmptyMessageDelayed(11, 2000);
                }
                as o = aVar2.o();
                if (o.e() == 51) {
                    List e = d.k().e();
                    if (e != null && e.size() == 0) {
                        LatLng latLng = new LatLng(o.h(), o.b());
                        d.k().a((int) o.h());
                        d.k().b(o.i());
                        this.b.a(latLng, R.drawable.img_fly_flag_blue);
                    }
                    this.b.a();
                }
                com.fimi.soul.biz.j.b.a(o.d());
                com.fimi.soul.module.b.d.a(aVar2).c(133);
                return;
            case RESHWAYPOINT:
                this.o = true;
                if (!this.s.hasMessages(this.n)) {
                    this.s.sendEmptyMessageDelayed(this.n, 3000);
                }
                this.c.a();
                return;
            case HEARDATA:
                this.i = aVar2.aj().e();
                return;
            case CLEARDATA:
            case CANCALFLYACTION:
                this.c.b();
                this.b.b();
                this.e.i();
                d.k().m();
                aVar2.a(com.fimi.soul.drone.d.a.CLEARPOIDATA);
                return;
            case ExecuteWaypoint:
                this.o = true;
                if (!this.s.hasMessages(this.n)) {
                    this.s.sendEmptyMessageDelayed(this.n, 3000);
                }
                this.c.a();
                return;
            case HEARDDAY:
                if (this.a.a().get() == 1) {
                    if (this.j && d.k().h().size() < 1 && this.i == 6) {
                        this.j = false;
                        aVar2.a(com.fimi.soul.drone.d.a.READWAYPOINT);
                        return;
                    }
                    h();
                    return;
                } else if (this.a.a().get() == 2) {
                    if (this.k && d.k().h().size() < 1 && this.i == 4) {
                        this.k = false;
                        aVar2.a(com.fimi.soul.drone.d.a.READFLYTO);
                        return;
                    }
                    if (this.i == 4) {
                        g();
                        this.b.f();
                    }
                    e();
                    return;
                } else if (this.a.a().get() == 3) {
                    if (this.l && d.k().h().size() < 1 && this.i == 5) {
                        this.l = false;
                        aVar2.a(com.fimi.soul.drone.d.a.READPOI);
                        return;
                    } else if (this.i == 5) {
                        g();
                        return;
                    } else {
                        return;
                    }
                } else if (this.a.a().get() != 4) {
                    this.h = 0;
                    return;
                } else if (this.m && this.d.g() && this.i == 10) {
                    this.m = false;
                    com.fimi.soul.module.b.d.a(aVar2).a((byte) 19, (byte) 0, (short) 0, (short) 0, (byte) 0, (short) 0, 0.0f, 0.0f);
                    return;
                } else {
                    if (this.i == 10) {
                        g();
                    }
                    f();
                    return;
                }
            case DRONEINFLOOR:
            case NOTIDRONEFLOOR:
                this.c.f();
                this.b.g();
                this.e.e();
                return;
            case NOTIDRONEAIR:
                this.c.g();
                this.b.h();
                this.e.f();
                return;
            case HIDEINFORWINDOW:
                this.c.h();
                return;
            case SHOWQUITDOUBLEINFRWINDOW:
                this.p = true;
                this.b.e();
                return;
            case DELETE_WAYPOINT:
                a();
                return;
            case RETURNINTERESTWAYPOIT:
                ak q = aVar2.q();
                if (q.j() == 22 && d.k().h().size() < 1 && this.i == 5) {
                    FlyActionBean flyActionBean = new FlyActionBean();
                    flyActionBean.setYaw_mode(q.b() / 10);
                    flyActionBean.setLatLng(new LatLng(q.h(), q.i()));
                    flyActionBean.setDrawableRes(R.drawable.img_fly_flag_blue);
                    flyActionBean.setCanclick(true);
                    flyActionBean.setType(1);
                    flyActionBean.setModelType(3);
                    flyActionBean.setStyleInfo(2);
                    flyActionBean.setStart_point_agle((short) ((int) (((double) q.d()) * 1.412d)));
                    flyActionBean.setSpeek(q.e() / 10);
                    flyActionBean.setRidus(q.f() / 10);
                    flyActionBean.setPara1(q.c());
                    flyActionBean.setHeight(((int) q.g()) / 10);
                    this.e.a(flyActionBean);
                } else {
                    this.e.g();
                }
                aVar2.a(com.fimi.soul.drone.d.a.CLOSECARMERPOI);
                return;
            case SHOWDOUBLEPOI:
                this.e.f();
                return;
            case TAKEPHOTOBACKDATA:
                com.fimi.soul.drone.h.a.a ap = aVar2.ap();
                if (ap.j() == (byte) 18) {
                    this.p = true;
                    if (this.s.hasMessages(11)) {
                        this.s.removeMessages(11);
                        this.s.sendEmptyMessageDelayed(11, 2000);
                        return;
                    }
                    this.s.sendEmptyMessageDelayed(11, 2000);
                    return;
                }
                this.d.a(new LatLng((double) ap.c(), (double) ap.e()));
                this.d.b();
                return;
            case QUITTAKEPHOTOFLY:
                this.p = true;
                return;
            case CLEARMARKERTAKEPHOTO:
                this.d.c();
                return;
            case ENTRYTAKEPHOTOMODEL:
                this.d.a();
                return;
            case CHANGETAKEPHOTOMARKERCOLOR:
                this.d.b();
                return;
            default:
                return;
        }
    }
}
