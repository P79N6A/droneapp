package com.fimi.soul.drone.a;

import android.content.Context;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.c.a.a.aa;
import com.fimi.soul.drone.c.a.a.ab;
import com.fimi.soul.drone.c.a.a.ac;
import com.fimi.soul.drone.c.a.a.af;
import com.fimi.soul.drone.c.a.a.ag;
import com.fimi.soul.drone.c.a.a.ai;
import com.fimi.soul.drone.c.a.a.aj;
import com.fimi.soul.drone.c.a.a.ak;
import com.fimi.soul.drone.c.a.a.am;
import com.fimi.soul.drone.c.a.a.an;
import com.fimi.soul.drone.c.a.a.ao;
import com.fimi.soul.drone.c.a.a.ap;
import com.fimi.soul.drone.c.a.a.ar;
import com.fimi.soul.drone.c.a.a.at;
import com.fimi.soul.drone.c.a.a.au;
import com.fimi.soul.drone.c.a.a.av;
import com.fimi.soul.drone.c.a.a.bb;
import com.fimi.soul.drone.c.a.a.bc;
import com.fimi.soul.drone.c.a.a.bd;
import com.fimi.soul.drone.c.a.a.be;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.bg;
import com.fimi.soul.drone.c.a.a.bh;
import com.fimi.soul.drone.c.a.a.bi;
import com.fimi.soul.drone.c.a.a.bj;
import com.fimi.soul.drone.c.a.a.bm;
import com.fimi.soul.drone.c.a.a.bo;
import com.fimi.soul.drone.c.a.a.bq;
import com.fimi.soul.drone.c.a.a.br;
import com.fimi.soul.drone.c.a.a.e;
import com.fimi.soul.drone.c.a.a.f;
import com.fimi.soul.drone.c.a.a.i;
import com.fimi.soul.drone.c.a.a.j;
import com.fimi.soul.drone.c.a.a.k;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.c.a.a.n;
import com.fimi.soul.drone.c.a.a.q;
import com.fimi.soul.drone.c.a.a.r;
import com.fimi.soul.drone.c.a.a.s;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.c.a.a.v;
import com.fimi.soul.drone.c.a.a.w;
import com.fimi.soul.drone.c.a.a.x;
import com.fimi.soul.drone.c.a.a.y;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.d.u;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ae;
import com.fimi.soul.drone.h.o;
import com.fimi.soul.drone.h.p;
import com.fimi.soul.entity.SavreDroneInFoBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.service.b;
import com.fimi.soul.utils.m;
import com.tencent.connect.common.Constants;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    private static final int g = 1;
    private com.fimi.soul.drone.a a;
    private Context b;
    private SavreDroneInFoBean c;
    private b d;
    private com.fimi.soul.module.dronemanage.b e;
    private boolean f;
    private long h = 0;
    private ConcurrentHashMap<String, c> i;

    public a(com.fimi.soul.drone.a aVar, Context context) {
        this.a = aVar;
        this.b = context;
        this.c = new SavreDroneInFoBean();
        this.i = this.c.getHashMap();
        this.d = b.a();
        this.e = com.fimi.soul.module.dronemanage.b.a();
    }

    public void a(com.fimi.soul.drone.c.a.b bVar) {
        o d;
        switch (bVar.a) {
            case 1:
                av avVar = (av) bVar;
                this.a.t().a((double) avVar.d, (double) avVar.e, (double) avVar.f, (double) avVar.g, (double) avVar.h);
                break;
            case 2:
                this.a.b(true);
                am amVar = (am) bVar;
                this.i.put("2", amVar.d);
                this.a.r().a((double) amVar.h, (double) amVar.f, (double) amVar.j, (double) amVar.k, (double) amVar.l, (double) amVar.i, (double) amVar.g, amVar.e, amVar.m, (int) amVar.n, amVar.q, amVar.r, (double) amVar.o, (double) amVar.p);
                if (((amVar.r & 240) >> 4) == 1) {
                    this.a.T().b(true);
                    this.a.c(true);
                    this.f = true;
                } else {
                    this.a.c(false);
                    this.a.T().b(false);
                    if (this.f) {
                        this.a.a(com.fimi.soul.drone.d.a.DRONEINFLOOR);
                    }
                    h.a(this.a.d).a(0);
                    this.f = false;
                }
                if ((amVar.r & 15) == 1) {
                    this.a.d(true);
                } else {
                    this.a.d(false);
                }
                u.a(this.a);
                this.a.a(com.fimi.soul.drone.d.a.FLY_INSKY);
                break;
            case 3:
                ar arVar = (ar) bVar;
                this.i.put("3", arVar.k);
                this.a.u().a((double) arVar.d, arVar.e, arVar.f, arVar.g, (double) arVar.h, (double) arVar.i, arVar.j);
                break;
            case 4:
                ap apVar = (ap) bVar;
                this.i.put("4", apVar.i);
                this.a.v().a((double) apVar.d, (double) apVar.e, (double) apVar.f, apVar.g, apVar.h, apVar.j);
                break;
            case 5:
                e eVar = (e) bVar;
                this.i.put("5", eVar.r);
                this.a.w().a(eVar.d, eVar.e, eVar.f, eVar.g, eVar.h, eVar.i, eVar.j, eVar.k, eVar.l, eVar.n, eVar.o, eVar.p, eVar.q);
                break;
            case 6:
                bd bdVar = (bd) bVar;
                this.a.s().a((double) bdVar.d, (double) bdVar.e, (double) bdVar.f, (double) bdVar.g, (double) bdVar.h, bdVar.i, (double) bdVar.j);
                break;
            case 7:
                w wVar = (w) bVar;
                this.a.h().a(wVar.d, wVar.e, wVar.f, wVar.g, wVar.h, wVar.i, wVar.j, wVar.k, wVar.l, wVar.m, wVar.n);
                break;
            case 9:
                n nVar = (n) bVar;
                this.i.put(m.n, nVar.b);
                this.a.ad().a(nVar.b(), nVar.c());
                break;
            case 10:
                this.a.b(((ab) bVar).h);
                break;
            case 11:
                com.fimi.soul.drone.c.a.a.u uVar = (com.fimi.soul.drone.c.a.a.u) bVar;
                this.a.aj().a(uVar.d, uVar.e, uVar.f, uVar.g, uVar.h, uVar.i, uVar.j);
                break;
            case 12:
                x xVar = (x) bVar;
                this.a.ar().a(xVar.d, xVar.f, xVar.e);
                break;
            case 16:
                aj ajVar = (aj) bVar;
                this.i.put(Constants.VIA_REPORT_TYPE_START_WAP, ajVar.e);
                this.a.S().a(ajVar.b().b());
                this.a.a(com.fimi.soul.drone.d.a.GIMBAL_POSITION);
                break;
            case 38:
                s sVar = (s) bVar;
                this.a.y().a(sVar.g, sVar.h, sVar.f);
                break;
            case 39:
                d.a(this.a).c(153);
                i iVar = (i) bVar;
                this.a.z().a(iVar.f, iVar.g, iVar.h, iVar.i, iVar.j, iVar.k);
                break;
            case 40:
                d.a(this.a).c(153);
                r rVar = (r) bVar;
                this.a.x().a(rVar.f, rVar.g, rVar.h, rVar.i, rVar.j, rVar.k);
                break;
            case 52:
                com.fimi.soul.drone.c.a.a.m mVar = (com.fimi.soul.drone.c.a.a.m) bVar;
                p f = this.a.f();
                f.a((byte) mVar.a);
                f.b(mVar.g);
                f.c(mVar.h);
                f.d(mVar.i);
                f.e(mVar.j);
                this.a.a(com.fimi.soul.drone.d.a.EV_VALUE);
                break;
            case 98:
                bf bfVar = (bf) bVar;
                if (bfVar.d == (byte) 114) {
                    com.fimi.soul.biz.h.a.a().b().put(Integer.valueOf(98), bfVar.g);
                    com.fimi.soul.drone.droneconnection.connection.c.a().a(bfVar.g);
                }
                this.a.L().a(bfVar.d, bfVar.e, bfVar.f);
                break;
            case 99:
                bg bgVar = (bg) bVar;
                this.a.K().a(bgVar.d, bgVar.e, bgVar.f, bgVar.g, bgVar.h, bgVar.i);
                break;
            case 100:
                bh bhVar = (bh) bVar;
                this.i.put(com.fimi.soul.module.setting.i.b, bhVar.o);
                this.a.M().a(bhVar.d, bhVar.e, bhVar.f, bhVar.g, bhVar.h, bhVar.i, bhVar.j, bhVar.k, bhVar.l, bhVar.m, bhVar.n);
                break;
            case 102:
                com.fimi.soul.drone.c.a.a.d dVar = (com.fimi.soul.drone.c.a.a.d) bVar;
                this.a.X().a(dVar.d, dVar.e, dVar.f, dVar.g);
                break;
            case 105:
                bi biVar = (bi) bVar;
                ad g = this.a.g();
                g.a(biVar.d);
                g.h(biVar.e);
                g.g(biVar.f);
                g.f(biVar.g);
                g.e(biVar.h);
                g.d(biVar.i);
                g.c(biVar.j);
                g.b(biVar.k);
                g.a(biVar.l);
                g.b(biVar.m);
                if (System.currentTimeMillis() - this.h >= 1000) {
                    this.a.a(com.fimi.soul.drone.d.a.Remotecontrol);
                    this.h = System.currentTimeMillis();
                }
                this.a.a(com.fimi.soul.drone.d.a.NEWREMOTEMODEL);
                break;
            case 106:
                this.a.Z().a(((aa) bVar).d);
                break;
            case 108:
                t tVar = (t) bVar;
                ae e = this.a.e();
                e.a(tVar.k);
                e.b(tVar.l);
                e.c(tVar.m);
                e.d(tVar.n);
                e.e(tVar.o);
                this.a.a(com.fimi.soul.drone.d.a.PAIR_CODE);
                break;
            case 113:
                this.a.a(com.fimi.soul.drone.d.a.REGIMBAL_ONEKEY);
                break;
            case 122:
                q qVar = (q) bVar;
                this.a.ak().a(qVar.d, qVar.e, qVar.f, qVar.g);
                break;
            case 128:
                at atVar = (at) bVar;
                break;
            case 129:
                d.a(this.a).c(129);
                au auVar = (au) bVar;
                com.fimi.soul.biz.j.b.a(auVar.n);
                this.a.q().a((double) auVar.d, auVar.e, auVar.f, auVar.g, (double) auVar.h, auVar.i, auVar.j, auVar.k, auVar.l, auVar.m, auVar.n);
                break;
            case 130:
                com.fimi.soul.drone.c.a.a.ae aeVar = (com.fimi.soul.drone.c.a.a.ae) bVar;
                this.a.m().a(aeVar.d, aeVar.e, aeVar.f, (double) aeVar.g, (double) aeVar.h, (double) aeVar.i, (double) aeVar.j, aeVar.k);
                break;
            case 131:
                com.fimi.soul.module.calibcompass.a.a().a("131");
                bb bbVar = (bb) bVar;
                this.a.l().a(bbVar.d, bbVar.e, bbVar.f, (double) bbVar.g, (double) bbVar.h, (double) bbVar.i, (double) bbVar.k, (double) bbVar.l, bbVar.j);
                break;
            case 132:
                be beVar = (be) bVar;
                break;
            case 133:
                com.fimi.soul.drone.c.a.a.p pVar = (com.fimi.soul.drone.c.a.a.p) bVar;
                this.a.o().a((double) pVar.d, pVar.f, pVar.g, (double) pVar.h, pVar.i, (double) pVar.j, (double) pVar.k, (double) pVar.l, pVar.e);
                break;
            case 134:
                j jVar = (j) bVar;
                this.a.p().a(jVar.d, jVar.e, jVar.f, jVar.g);
                break;
            case 135:
                v vVar = (v) bVar;
                if (vVar.j.b != 8) {
                    this.a.al().b(vVar.j);
                    if (this.a.al().h != (byte) 1 || this.a.al().g != (byte) 0) {
                        if (this.a.al().h == (byte) 1) {
                            this.a.al().a(false);
                            break;
                        }
                    }
                    this.a.al().a(true);
                    break;
                }
                this.a.al().a(vVar.j);
                if (this.a.al().g != (byte) 0) {
                    this.a.al().a(false);
                    break;
                } else {
                    this.a.al().a(true);
                    break;
                }
                break;
            case 136:
                k kVar = (k) bVar;
                d = this.a.d();
                d.a(kVar.f());
                d.d(kVar.l());
                d.e(kVar.m());
                d.f(kVar.n());
                this.a.a(com.fimi.soul.drone.d.a.DYNAMIC_RESULT);
                break;
            case 137:
                l lVar = (l) bVar;
                d = this.a.d();
                d.a(lVar.b());
                d.f(lVar.c());
                this.a.a(com.fimi.soul.drone.d.a.DYNAMIC_RESULT);
                break;
            case 138:
                com.fimi.soul.drone.c.a.a.o oVar = (com.fimi.soul.drone.c.a.a.o) bVar;
                break;
            case 144:
                ak akVar = (ak) bVar;
                this.a.a(com.fimi.soul.drone.d.a.REHOME);
                com.fimi.soul.biz.j.b.a(akVar.e);
                break;
            case 145:
                ao aoVar = (ao) bVar;
                this.a.a(com.fimi.soul.drone.d.a.RELANDING);
                com.fimi.soul.biz.j.b.a(aoVar.e);
                break;
            case 146:
                this.e.a(((bc) bVar).e, this.b);
                this.a.a(com.fimi.soul.drone.d.a.RETAKEUP);
                break;
            case 147:
                an anVar = (an) bVar;
                this.a.J().a(anVar.d, anVar.e);
                d.a(this.a).c(147);
                com.fimi.soul.biz.j.b.a(anVar.f);
                break;
            case 148:
                d.a(this.a).c(148);
                this.a.a(com.fimi.soul.drone.d.a.CLOSEOUTTIMEPROBAR);
                ag agVar = (ag) bVar;
                com.fimi.soul.biz.j.b.a(agVar.e);
                this.a.F().a(agVar.d, agVar.e);
                break;
            case 152:
                com.fimi.soul.drone.c.a.a.b bVar2 = (com.fimi.soul.drone.c.a.a.b) bVar;
                this.a.a(com.fimi.soul.drone.d.a.RECEIVEFOLLOWME);
                this.a.n().a((double) bVar2.d, bVar2.e, bVar2.f);
                break;
            case 153:
                com.fimi.soul.drone.c.a.a.c cVar = (com.fimi.soul.drone.c.a.a.c) bVar;
                this.a.i().a(cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                break;
            case 193:
                ai aiVar = (ai) bVar;
                this.a.j().a(aiVar.d, aiVar.f, aiVar.g, aiVar.e, aiVar.h, aiVar.i, aiVar.j, aiVar.k);
                break;
            case 198:
                af afVar = (af) bVar;
                com.fimi.soul.biz.h.a.a().b().put(Integer.valueOf(198), afVar.i);
                com.fimi.soul.drone.droneconnection.connection.c.a().a(afVar.i);
                this.a.D().a(afVar.d, afVar.e, afVar.g, afVar.h, afVar.f);
                break;
            case 199:
                bm bmVar = (bm) bVar;
                this.a.O().a(bmVar.d, bmVar.e);
                break;
            case 200:
                bj bjVar = (bj) bVar;
                this.a.P().a(bjVar.d, bjVar.e, bjVar.f);
                break;
            case 201:
                bo boVar = (bo) bVar;
                this.a.N().a(boVar.d, boVar.e, boVar.f);
                break;
            case 202:
                br brVar = (br) bVar;
                this.a.Q().a(brVar.d, brVar.e);
                break;
            case 203:
                bq bqVar = (bq) bVar;
                this.a.R().a(bqVar.d, bqVar.e);
                break;
            case 204:
                y yVar = (y) bVar;
                this.a.Y().a(yVar.d, yVar.e, yVar.f);
                break;
            case 291:
                d.a(this.a).c(134);
                ac acVar = (ac) bVar;
                com.fimi.soul.biz.j.b.a(acVar.m);
                this.a.ap().a(acVar.d, acVar.e, acVar.f, acVar.g, acVar.h, (short) acVar.i, acVar.j, acVar.k, acVar.l, acVar.m);
                break;
        }
        f.a(bVar, this.a);
    }
}
