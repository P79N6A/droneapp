package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;

public interface Game extends Parcelable, f<Game> {
    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    String c();

    void c(CharArrayBuffer charArrayBuffer);

    String d();

    String e();

    String f();

    String g();

    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    String h();

    Uri i();

    Uri j();

    Uri k();

    boolean l();

    boolean m();

    boolean n();

    boolean o();

    String p();

    int q();

    int r();

    boolean s();

    boolean t();

    boolean u();

    String v();

    boolean w();
}
