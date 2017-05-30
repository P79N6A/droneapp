package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.List;

public interface Quest extends Parcelable, f<Quest> {
    @KeepName
    public static final int[] QUEST_STATE_ALL = new int[]{1, 2, 3, 4, 6, 5};
    @KeepName
    public static final String[] QUEST_STATE_NON_TERMINAL = new String[]{Integer.toString(1), Integer.toString(2), Integer.toString(3)};
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final long g = -1;

    void a(CharArrayBuffer charArrayBuffer);

    void b(CharArrayBuffer charArrayBuffer);

    String c();

    String d();

    String e();

    Uri f();

    Uri g();

    @KeepName
    @Deprecated
    String getBannerImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    Milestone h();

    List<Milestone> i();

    Game j();

    int k();

    int l();

    long m();

    long n();

    long o();

    long p();

    long q();

    boolean r();
}
