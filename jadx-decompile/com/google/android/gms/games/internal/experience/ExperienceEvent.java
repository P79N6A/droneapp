package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;

public interface ExperienceEvent extends Parcelable, f<ExperienceEvent> {
    String c();

    Game d();

    String e();

    String f();

    Uri g();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    long h();

    long i();

    long j();

    int k();

    int l();
}
