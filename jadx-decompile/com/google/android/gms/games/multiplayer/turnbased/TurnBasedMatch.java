package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.j;
import java.util.ArrayList;

public interface TurnBasedMatch extends Parcelable, f<TurnBasedMatch>, j {
    @KeepName
    public static final int[] MATCH_TURN_STATUS_ALL = new int[]{0, 1, 2, 3};
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;

    int a(String str);

    void a(CharArrayBuffer charArrayBuffer);

    Game c();

    String d();

    String e();

    String e_(String str);

    long f();

    Participant f_(String str);

    int g();

    int h();

    String i();

    int j();

    String k();

    long l();

    String n();

    byte[] o();

    int p();

    boolean q();

    String r();

    byte[] s();

    int t();

    Bundle u();

    int v();

    boolean w();

    ArrayList<String> x();

    String y();

    Participant z();
}
