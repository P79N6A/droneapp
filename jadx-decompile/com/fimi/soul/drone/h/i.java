package com.fimi.soul.drone.h;

import com.fimi.soul.drone.c.a.d;

public class i extends a {
    private boolean a = false;
    private boolean b = false;
    private b c = b.Set;
    private a d = a.None;
    private int e = 0;
    private int f = 0;

    public enum a {
        None,
        StartRecord,
        StopRecrod,
        QuicklyShot,
        StopQuicklyShot,
        NormalShot
    }

    public enum b {
        Set,
        Get
    }

    private a a(byte b) {
        return b == (byte) 1 ? a.StartRecord : b == (byte) 2 ? a.StopRecrod : b == (byte) 6 ? a.QuicklyShot : b == (byte) 9 ? a.StopQuicklyShot : b == (byte) 5 ? a.NormalShot : a.None;
    }

    private b b(byte b) {
        return b == (byte) 1 ? b.Set : b == (byte) 2 ? b.Get : b.Set;
    }

    public void a(d dVar) {
        dVar.c();
        byte d = dVar.d();
        byte d2 = dVar.d();
        if (a() == 51) {
            this.e = (d2 * 100) + dVar.d();
            this.f = dVar.d();
        }
        a(a(d));
        a(b(d2));
        if (dVar.d() == (byte) 1) {
            b(true);
        }
        if (dVar.d() == (byte) 1) {
            a(true);
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public int b() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public void b(boolean z) {
        this.a = z;
    }

    public b c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public a e() {
        return this.d;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        return this.a;
    }

    public String toString() {
        return "CloudCamraActionVariable{isFormatSDCard=" + this.a + ", isResetFactory=" + this.b + ", cameraRequestType=" + this.c + ", cameraActionType=" + this.d + '}';
    }
}
