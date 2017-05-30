package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.f;
import java.util.List;

public interface a extends f<a> {
    CharSequence a(@Nullable CharacterStyle characterStyle);

    CharSequence b(@Nullable CharacterStyle characterStyle);

    CharSequence c(@Nullable CharacterStyle characterStyle);

    @Nullable
    String c();

    @Nullable
    List<Integer> d();
}
