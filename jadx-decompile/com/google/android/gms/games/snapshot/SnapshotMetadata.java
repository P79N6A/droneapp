package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

public interface SnapshotMetadata extends Parcelable, f<SnapshotMetadata> {
    public static final long a = -1;
    public static final long b = -1;

    void a(CharArrayBuffer charArrayBuffer);

    Game c();

    Player d();

    String e();

    Uri f();

    float g();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    String h();

    String i();

    String j();

    long k();

    long l();

    boolean m();

    long n();

    String o();
}
