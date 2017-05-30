package com.google.android.gms.games.multiplayer.realtime;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import java.util.List;

public interface b {
    public static final int a = -1;

    public interface a {
        void a(int i, int i2, String str);
    }

    int a(g gVar, a aVar, byte[] bArr, String str, String str2);

    int a(g gVar, byte[] bArr, String str);

    int a(g gVar, byte[] bArr, String str, String str2);

    int a(g gVar, byte[] bArr, String str, List<String> list);

    Intent a(g gVar, int i, int i2);

    Intent a(g gVar, int i, int i2, boolean z);

    Intent a(g gVar, Room room, int i);

    void a(g gVar, d dVar);

    void a(g gVar, h hVar, String str);

    void a(g gVar, String str);

    void b(g gVar, d dVar);

    void b(g gVar, String str);
}
