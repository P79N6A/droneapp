package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public interface e extends f<e> {
    public static final int a = -1;

    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    long c();

    void c(CharArrayBuffer charArrayBuffer);

    String d();

    String e();

    long f();

    long g();

    @KeepName
    @Deprecated
    String getScoreHolderHiResImageUrl();

    @KeepName
    @Deprecated
    String getScoreHolderIconImageUrl();

    String h();

    Uri i();

    Uri j();

    Player k();

    String l();
}
