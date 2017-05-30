package com.google.android.gms.games.internal.a;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.games.c;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.b;
import com.google.android.gms.games.multiplayer.realtime.b.a;
import com.google.android.gms.games.multiplayer.realtime.d;
import com.google.android.gms.games.multiplayer.realtime.h;
import com.google.android.gms.internal.ail;
import java.util.List;

public final class k implements b {
    private static <L> ail<L> a(g gVar, L l) {
        return l == null ? null : gVar.a(l);
    }

    public int a(g gVar, a aVar, byte[] bArr, String str, String str2) {
        return c.a(gVar).a(a(gVar, (Object) aVar), bArr, str, str2);
    }

    public int a(g gVar, byte[] bArr, String str) {
        return c.a(gVar).a(bArr, str);
    }

    public int a(g gVar, byte[] bArr, String str, String str2) {
        return c.a(gVar).a(bArr, str, new String[]{str2});
    }

    public int a(g gVar, byte[] bArr, String str, List<String> list) {
        return c.a(gVar).a(bArr, str, (String[]) list.toArray(new String[list.size()]));
    }

    public Intent a(g gVar, int i, int i2) {
        return c.a(gVar).b(i, i2, true);
    }

    public Intent a(g gVar, int i, int i2, boolean z) {
        return c.a(gVar).b(i, i2, z);
    }

    public Intent a(g gVar, Room room, int i) {
        return c.a(gVar).a(room, i);
    }

    public void a(g gVar, d dVar) {
        com.google.android.gms.games.internal.d a = c.a(gVar, false);
        if (a != null) {
            a.a(gVar.a(dVar.a()), a(gVar, dVar.c()), a(gVar, dVar.d()), dVar);
        }
    }

    public void a(g gVar, h hVar, String str) {
        com.google.android.gms.games.internal.d a = c.a(gVar, false);
        if (a != null) {
            a.a(gVar.a(hVar), str);
        }
    }

    public void a(g gVar, String str) {
        com.google.android.gms.games.internal.d a = c.a(gVar, false);
        if (a != null) {
            a.c(str, 0);
        }
    }

    public void b(g gVar, d dVar) {
        com.google.android.gms.games.internal.d a = c.a(gVar, false);
        if (a != null) {
            a.b(gVar.a(dVar.a()), a(gVar, dVar.c()), a(gVar, dVar.d()), dVar);
        }
    }

    public void b(g gVar, String str) {
        com.google.android.gms.games.internal.d a = c.a(gVar, false);
        if (a != null) {
            a.b(str, 0);
        }
    }
}
