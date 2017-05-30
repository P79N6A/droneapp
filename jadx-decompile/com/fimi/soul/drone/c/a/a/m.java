package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;
import org.codehaus.jackson.smile.SmileConstants;

public class m extends b implements Serializable {
    public static final byte b = (byte) 115;
    public static final byte c = (byte) 1;
    public static final byte d = (byte) 0;
    public static final byte e = (byte) 1;
    public static final byte f = (byte) 2;
    public byte g;
    public byte h;
    public byte i;
    public byte j;
    private final byte k;
    private byte l;

    public m() {
        this.k = SmileConstants.TOKEN_KEY_LONG_STRING;
        this.l = (byte) 0;
        this.a = 52;
    }

    public c a() {
        c cVar = new c();
        cVar.c = 52;
        cVar.b = 2;
        cVar.d.b((byte) 1);
        cVar.d.b((byte) 1);
        return cVar;
    }

    public void a(byte b) {
        switch (b) {
            case (byte) 0:
                this.l = (byte) 0;
                return;
            case (byte) 1:
                this.l = (byte) 1;
                return;
            case (byte) 2:
                this.l = (byte) 2;
                return;
            default:
                return;
        }
    }

    public void a(c cVar) {
        a(cVar.d);
    }

    public void a(d dVar) {
        dVar.c();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        this.j = dVar.d();
    }
}
