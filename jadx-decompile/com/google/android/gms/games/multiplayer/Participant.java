package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public interface Participant extends Parcelable, f<Participant> {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;

    void a(CharArrayBuffer charArrayBuffer);

    int c();

    String d();

    int e();

    boolean f();

    String g();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    Uri h();

    Uri i();

    String j();

    Player k();

    ParticipantResult l();
}
