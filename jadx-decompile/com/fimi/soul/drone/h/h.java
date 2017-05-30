package com.fimi.soul.drone.h;

public class h extends a {
    private boolean a = true;
    private d b = d.Mid;
    private f c = f.DateTime;
    private e d = e._1280x720_120p_16vs9;
    private a e = a._13M_4128X3096_4vs3;
    private c f = c.Normal;
    private b g = b.DateTime;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;
    private int k = 0;
    private short l = (short) 0;
    private short m = (short) 0;

    public enum a {
        _16M_4068x3456_4vs3,
        _13M_4128X3096_4vs3,
        _8M_3264X2448_4vs3,
        _5M_2560X1920_4vs3
    }

    public enum b {
        Date,
        Time,
        DateTime
    }

    public enum c {
        Normal,
        TimeLapse,
        BurstShot
    }

    public enum d {
        High,
        Mid,
        Low
    }

    public enum e {
        _1920x1080_60p_16vs9,
        _1920x1080_30p_16vs9,
        _1920x1080_48p_16vs9,
        _1920x1080_24p_16vs9,
        _1280x960_60p_4vs3,
        _1280x960_48p_4vs3,
        _1280x720_60p_16vs9,
        _1280x720_48p_16vs9,
        _1280x720_120p_16vs9,
        _848x480_240p_16vs9
    }

    public enum f {
        Date,
        Time,
        DateTime
    }

    private d a(byte b) {
        return b == (byte) 1 ? d.High : b == (byte) 2 ? d.Mid : b == (byte) 3 ? d.Low : d.Mid;
    }

    private f b(byte b) {
        if (b == (byte) 1) {
            return f.Date;
        }
        if (b == (byte) 2) {
            return f.Time;
        }
        if (b == (byte) 3) {
            return f.DateTime;
        }
        f fVar = this.c;
        return f.Date;
    }

    private e c(byte b) {
        return b == (byte) 1 ? e._1920x1080_60p_16vs9 : b == (byte) 2 ? e._1920x1080_30p_16vs9 : b == (byte) 3 ? e._1920x1080_48p_16vs9 : b == (byte) 4 ? e._1920x1080_24p_16vs9 : b == (byte) 5 ? e._1280x960_60p_4vs3 : b == (byte) 6 ? e._1280x960_48p_4vs3 : b == (byte) 7 ? e._1280x720_60p_16vs9 : b == (byte) 8 ? e._1280x720_48p_16vs9 : b == (byte) 9 ? e._1280x720_120p_16vs9 : b == (byte) 10 ? e._848x480_240p_16vs9 : e._1280x720_120p_16vs9;
    }

    private a d(byte b) {
        return b == (byte) 1 ? a._16M_4068x3456_4vs3 : b == (byte) 2 ? a._13M_4128X3096_4vs3 : b == (byte) 3 ? a._8M_3264X2448_4vs3 : b == (byte) 4 ? a._5M_2560X1920_4vs3 : a._16M_4068x3456_4vs3;
    }

    private c e(byte b) {
        return b == (byte) 1 ? c.Normal : b == (byte) 2 ? c.TimeLapse : b == (byte) 3 ? c.BurstShot : c.Normal;
    }

    private b f(byte b) {
        return b == (byte) 1 ? b.Date : b == (byte) 2 ? b.Time : b == (byte) 3 ? b.DateTime : b.DateTime;
    }

    private byte g(byte b) {
        return (byte) (b & 63);
    }

    private byte h(byte b) {
        return (byte) ((b & 192) >>> 6);
    }

    public void a(com.fimi.soul.drone.c.a.d dVar) {
        dVar.c();
        a(a(dVar.d()));
        a(b(dVar.d()));
        a(c(dVar.d()));
        a(d(dVar.d()));
        a(e(dVar.d()));
        a(f(dVar.d()));
        if (dVar.d() == (byte) 2) {
            c(true);
        } else {
            c(false);
        }
        if (dVar.d() == (byte) 2) {
            b(true);
        } else {
            b(false);
        }
        if (dVar.d() == (byte) 2) {
            c(true);
        } else {
            c(false);
        }
        if (a() == 51) {
            this.k = dVar.f();
            this.l = dVar.e();
            this.m = dVar.e();
        }
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public void a(d dVar) {
        this.b = dVar;
    }

    public void a(e eVar) {
        this.d = eVar;
    }

    public void a(f fVar) {
        this.c = fVar;
    }

    public void a(short s) {
        this.l = s;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public a b() {
        return this.e;
    }

    public void b(int i) {
        this.k = i;
    }

    public void b(short s) {
        this.m = s;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public b c() {
        return this.g;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }

    public boolean f() {
        return this.j;
    }

    public e g() {
        return this.d;
    }

    public boolean h() {
        return this.a;
    }

    public f i() {
        return this.c;
    }

    public d j() {
        return this.b;
    }

    public c k() {
        return this.f;
    }

    public int l() {
        return this.k;
    }

    public short m() {
        return this.l;
    }

    public short n() {
        return this.m;
    }

    public String toString() {
        return "CloudCameraVariable{isLenAC=" + this.a + ", videoQualityType=" + this.b + ", videoTimeStampType=" + this.c + ", videoResolutionType=" + this.d + ", imageResolutionType=" + this.e + ", shotModeType=" + this.f + ", photoTimeStampType=" + this.g + ", enableAutoLowLight=" + this.h + ", enableRecycleRecord=" + this.i + ", enableAutoAC=" + this.j + ", cameraTime=" + this.k + ", cameraTotalStorage=" + this.l + ", cameraRemainStorage=" + this.m + '}';
    }
}
