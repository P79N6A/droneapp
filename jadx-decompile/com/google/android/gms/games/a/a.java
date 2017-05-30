package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public interface a extends f<a> {
    public static final int a = 0;
    public static final int b = 1;

    void a(CharArrayBuffer charArrayBuffer);

    String c();

    String d();

    Uri e();

    int f();

    ArrayList<j> g();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    Game h();
}
