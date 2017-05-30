package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.List;

public interface GameRequest extends Parcelable, f<GameRequest> {
    @KeepName
    public static final int TYPE_ALL = 65535;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 0;
    public static final int f = 1;

    boolean a(String str);

    String e();

    Game f();

    Player g();

    int g_(String str);

    byte[] i();

    int j();

    long k();

    long l();

    int m();

    List<Player> o();
}
