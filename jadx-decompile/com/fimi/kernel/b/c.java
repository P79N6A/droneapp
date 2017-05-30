package com.fimi.kernel.b;

import com.fimi.kernel.b.a.b;
import com.fimi.kernel.b.b.e;

public final class c {
    public static b a(d dVar) {
        switch (dVar) {
            case Ftp:
                return b.b();
            case Volley:
                return new com.fimi.kernel.b.e.b();
            case Socket:
                return new com.fimi.kernel.b.d.c();
            case Http:
                return new e();
            default:
                return null;
        }
    }
}
