package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.j;
import java.util.ArrayList;

public interface Room extends Parcelable, f<Room>, j {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;

    int a(String str);

    void a(CharArrayBuffer charArrayBuffer);

    String b_(String str);

    String c();

    Participant c_(String str);

    String d();

    long e();

    int f();

    String g();

    int h();

    Bundle i();

    int j();

    ArrayList<String> k();
}
