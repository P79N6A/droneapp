package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public interface Event extends Parcelable, f<Event> {
    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    String c();

    void c(CharArrayBuffer charArrayBuffer);

    String d();

    String e();

    Uri f();

    Player g();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    long h();

    String i();

    boolean j();
}
