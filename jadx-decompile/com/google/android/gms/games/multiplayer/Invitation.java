package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;

public interface Invitation extends Parcelable, f<Invitation>, j {
    public static final int a = 0;
    public static final int b = 1;

    Game e();

    String f();

    Participant g();

    long h();

    int i();

    int j();

    int k();
}
