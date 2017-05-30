package com.fimi.soul.drone.c.a;

import android.util.Log;
import com.fimi.soul.drone.c.a.a.aa;
import com.fimi.soul.drone.c.a.a.ab;
import com.fimi.soul.drone.c.a.a.ac;
import com.fimi.soul.drone.c.a.a.ad;
import com.fimi.soul.drone.c.a.a.ae;
import com.fimi.soul.drone.c.a.a.af;
import com.fimi.soul.drone.c.a.a.ag;
import com.fimi.soul.drone.c.a.a.ah;
import com.fimi.soul.drone.c.a.a.ai;
import com.fimi.soul.drone.c.a.a.aj;
import com.fimi.soul.drone.c.a.a.ak;
import com.fimi.soul.drone.c.a.a.al;
import com.fimi.soul.drone.c.a.a.am;
import com.fimi.soul.drone.c.a.a.an;
import com.fimi.soul.drone.c.a.a.ao;
import com.fimi.soul.drone.c.a.a.ap;
import com.fimi.soul.drone.c.a.a.aq;
import com.fimi.soul.drone.c.a.a.ar;
import com.fimi.soul.drone.c.a.a.at;
import com.fimi.soul.drone.c.a.a.au;
import com.fimi.soul.drone.c.a.a.av;
import com.fimi.soul.drone.c.a.a.ax;
import com.fimi.soul.drone.c.a.a.ay;
import com.fimi.soul.drone.c.a.a.b;
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
import com.fimi.soul.drone.c.a.a.d;
import com.fimi.soul.drone.c.a.a.e;
import com.fimi.soul.drone.c.a.a.h;
import com.fimi.soul.drone.c.a.a.i;
import com.fimi.soul.drone.c.a.a.j;
import com.fimi.soul.drone.c.a.a.k;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.c.a.a.n;
import com.fimi.soul.drone.c.a.a.o;
import com.fimi.soul.drone.c.a.a.p;
import com.fimi.soul.drone.c.a.a.q;
import com.fimi.soul.drone.c.a.a.r;
import com.fimi.soul.drone.c.a.a.s;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.c.a.a.u;
import com.fimi.soul.drone.c.a.a.v;
import com.fimi.soul.drone.c.a.a.w;
import com.fimi.soul.drone.c.a.a.x;
import com.fimi.soul.drone.c.a.a.y;
import java.io.Serializable;

public class c implements Serializable {
    public static final int a = 254;
    private static final long serialVersionUID = 2095947771227815314L;
    public int b;
    public int c;
    public d d;
    public a e;

    public c() {
        this.d = new d();
    }

    public c(d dVar) {
        this.d = dVar;
    }

    public boolean a() {
        return this.d.b() >= 511 || this.d.b() == this.b;
    }

    public void b() {
        this.e = new a();
        this.e.a(this.b);
        this.e.a(this.c);
        this.d.c();
        for (int i = 0; i < this.d.b(); i++) {
            this.e.a(this.d.d());
        }
    }

    public void c() {
        this.e = new a();
        this.e.a(this.b + 1);
        this.e.a(this.c);
        this.d.c();
        for (int i = 0; i < this.d.b(); i++) {
            this.e.a(this.d.d());
        }
    }

    public byte[] d() {
        int i = 0;
        byte[] bArr = new byte[((this.b + 3) + 2)];
        bArr[0] = (byte) -2;
        bArr[1] = (byte) (this.b + 1);
        int i2 = 3;
        bArr[2] = (byte) this.c;
        while (i < this.d.b() - 1) {
            int i3 = i2 + 1;
            bArr[i2] = this.d.b.get(i);
            i++;
            i2 = i3;
        }
        c();
        i = i2 + 1;
        bArr[i2] = (byte) this.e.c();
        i2 = i + 1;
        bArr[i] = (byte) this.e.b();
        return bArr;
    }

    public byte[] e() {
        int i = 0;
        byte[] bArr = new byte[((this.b + 2) + 2)];
        bArr[0] = (byte) -2;
        bArr[1] = (byte) this.b;
        int i2 = 3;
        bArr[2] = (byte) this.c;
        while (i < this.d.b() - 1) {
            int i3 = i2 + 1;
            bArr[i2] = this.d.b.get(i);
            i++;
            i2 = i3;
        }
        b();
        i = i2 + 1;
        bArr[i2] = (byte) this.e.c();
        i2 = i + 1;
        bArr[i] = (byte) this.e.b();
        return bArr;
    }

    public b f() {
        b mVar;
        byte d;
        switch (this.c) {
            case 1:
                return new av(this);
            case 2:
                return new am(this);
            case 3:
                return new ar(this);
            case 4:
                return new ap(this);
            case 5:
                return new e(this);
            case 6:
                return new bd(this);
            case 7:
                return new w(this);
            case 9:
                return new n(this);
            case 10:
                return new ab(this);
            case 11:
                return new u(this);
            case 12:
                return new x(this);
            case 16:
                return new aj(this, 16);
            case 52:
                mVar = new m();
                mVar.a(this);
                return mVar;
            case 98:
                return new bf(this);
            case 99:
                return new bg(this);
            case 100:
                return new bh(this);
            case 102:
                return new d(this);
            case 105:
                return new bi(this);
            case 106:
                return new aa(this);
            case 108:
                mVar = new t();
                mVar.a(this);
                return mVar;
            case 113:
                return new aj(this, 113);
            case 122:
                return new q(this);
            case 128:
                return new at(this);
            case 129:
                return new au(this);
            case 130:
                return new ae(this);
            case 131:
                return new bb(this);
            case 132:
                return new be(this);
            case 133:
                return new p(this);
            case 134:
                this.d.c(1);
                d = this.d.d();
                return (d == (byte) 18 || d == (byte) 19) ? new ac(this) : new j(this);
            case 135:
                return new v(this);
            case 136:
                mVar = new k();
                mVar.a(this);
                return mVar;
            case 137:
                mVar = new l();
                mVar.a(this);
                return mVar;
            case 138:
                return new o(this);
            case 144:
                return new ak(this);
            case 145:
                return new ao(this);
            case 146:
                return new bc(this);
            case 147:
                return new an(this);
            case 148:
                return new ag(this);
            case 149:
                return new aq(this);
            case 150:
                return new ax(this);
            case 151:
                return new ah(this);
            case 152:
                return new b(this);
            case 153:
                this.d.c(1);
                d = this.d.d();
                return (this.b <= 5 || d != (byte) 4) ? (this.b <= 5 || d != (byte) 5) ? (this.b <= 5 || d != (byte) 7) ? new com.fimi.soul.drone.c.a.a.c(this) : new s(this) : new i(this) : new r(this);
            case 192:
                return new al(this);
            case 193:
                return new ai(this);
            case 197:
                return new ay(this);
            case 198:
                return new af(this);
            case 199:
                return new bm(this);
            case 200:
                return new bj(this);
            case 201:
                return new bo(this);
            case 202:
                return new br(this);
            case 203:
                return new bq(this);
            case 204:
                return new y(this);
            default:
                mVar = h.a(this.c, this);
                if (mVar != null) {
                    return mVar;
                }
                Log.d("MILink", "UNKNOW MESSAGE - " + this.c);
                return new ad(this);
        }
    }
}
