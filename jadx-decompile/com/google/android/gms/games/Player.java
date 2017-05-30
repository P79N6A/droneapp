package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

public interface Player extends Parcelable, f<Player> {
    public static final long a = -1;
    public static final long b = -1;

    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    String c();

    String d();

    String e();

    String f();

    boolean g();

    @KeepName
    @Deprecated
    String getBannerImageLandscapeUrl();

    @KeepName
    @Deprecated
    String getBannerImagePortraitUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    boolean h();

    Uri i();

    boolean j();

    Uri k();

    long l();

    long m();

    @Deprecated
    int n();

    boolean o();

    String p();

    PlayerLevelInfo q();

    MostRecentGameInfo r();

    Uri s();

    Uri t();

    int u();

    long v();

    boolean w();
}
