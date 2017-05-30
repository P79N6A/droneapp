package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.pw;
import com.google.android.gms.internal.sw;

public class b {
    private final pw a;

    public b(pw pwVar) {
        this.a = (pw) d.a(pwVar);
    }

    public static b a() {
        return new b(a(2, 3000, 0));
    }

    public static b a(int i) {
        return new b(a(1, 0, i));
    }

    private static pw a(int i, long j, int i2) {
        pw pwVar = new pw();
        pwVar.a = i;
        pwVar.b = j;
        switch (i) {
            case 1:
            case 2:
            case 3:
                pwVar.c = i2;
                break;
            case 4:
            case 5:
            case 6:
                pwVar.d = i2;
                break;
            case 7:
            case 8:
            case 9:
                pwVar.e = i2;
                break;
            case 10:
            case 11:
            case 12:
                pwVar.f = i2;
                break;
            case 13:
            case 14:
            case 15:
                pwVar.g = i2;
                break;
            case 16:
            case 17:
            case 18:
                pwVar.h = i2;
                break;
            default:
                sw.a("AudioStateFenceStub", "Unknown trigger type=%s", Integer.valueOf(i));
                break;
        }
        return pwVar;
    }

    public static b b() {
        return new b(a(3, 3000, 0));
    }

    public pw c() {
        return this.a;
    }
}
