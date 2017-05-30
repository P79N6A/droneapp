package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public interface Achievement extends Parcelable, f<Achievement> {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;

    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    String c();

    void c(CharArrayBuffer charArrayBuffer);

    int d();

    void d(CharArrayBuffer charArrayBuffer);

    String e();

    String f();

    Uri g();

    @KeepName
    @Deprecated
    String getRevealedImageUrl();

    @KeepName
    @Deprecated
    String getUnlockedImageUrl();

    Uri h();

    int i();

    String j();

    Player k();

    int l();

    int m();

    String n();

    long o();

    long p();
}
