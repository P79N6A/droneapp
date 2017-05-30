package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.i;

public final class h {
    public static g a(int i, c cVar) {
        a iVar;
        switch (i) {
            case 49:
                iVar = new i();
                break;
            case 50:
                iVar = new g();
                break;
            case 51:
                iVar = new i();
                break;
            default:
                iVar = null;
                break;
        }
        if (iVar == null) {
            return null;
        }
        iVar.a(i);
        g gVar = new g(iVar);
        gVar.a = i;
        gVar.a(cVar.d);
        return gVar;
    }

    public static c a(int i, int i2, d dVar) {
        c cVar = new c(dVar);
        cVar.b = i;
        cVar.c = i2;
        return cVar;
    }

    public static c a(int i, byte[] bArr) {
        c cVar = new c(a(bArr));
        cVar.b = bArr.length;
        cVar.c = i;
        return cVar;
    }

    public static d a(byte[] bArr) {
        d dVar = new d();
        for (byte b : bArr) {
            dVar.b(b);
        }
        return dVar;
    }
}
