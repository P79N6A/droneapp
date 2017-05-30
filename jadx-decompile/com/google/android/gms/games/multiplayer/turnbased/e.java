package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.turnbased.d.a;

public final class e extends d {
    private final int a;
    private final String[] b;
    private final Bundle c;
    private final int d;

    e(a aVar) {
        this.a = aVar.a;
        this.d = aVar.d;
        this.c = aVar.c;
        this.b = (String[]) aVar.b.toArray(new String[aVar.b.size()]);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    public String[] c() {
        return this.b;
    }

    public Bundle d() {
        return this.c;
    }
}
