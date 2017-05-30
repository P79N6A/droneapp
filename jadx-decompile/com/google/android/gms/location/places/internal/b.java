package com.google.android.gms.location.places.internal;

import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.a;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity.SubstringEntity;
import java.util.Collections;
import java.util.List;

public class b extends t implements a {
    public b(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private String g() {
        return a("ap_description", "");
    }

    private String h() {
        return a("ap_primary_text", "");
    }

    private String i() {
        return a("ap_secondary_text", "");
    }

    private List<SubstringEntity> j() {
        return a("ap_matched_subscriptions", SubstringEntity.CREATOR, Collections.emptyList());
    }

    private List<SubstringEntity> k() {
        return a("ap_primary_text_matched", SubstringEntity.CREATOR, Collections.emptyList());
    }

    private List<SubstringEntity> l() {
        return a("ap_secondary_text_matched", SubstringEntity.CREATOR, Collections.emptyList());
    }

    public CharSequence a(@Nullable CharacterStyle characterStyle) {
        return c.a(g(), j(), characterStyle);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public CharSequence b(@Nullable CharacterStyle characterStyle) {
        return c.a(h(), k(), characterStyle);
    }

    public CharSequence c(@Nullable CharacterStyle characterStyle) {
        return c.a(i(), l(), characterStyle);
    }

    public String c() {
        return a("ap_place_id", null);
    }

    public List<Integer> d() {
        return a("ap_place_types", Collections.emptyList());
    }

    public a e() {
        return AutocompletePredictionEntity.a(c(), d(), f(), g(), j(), h(), k(), i(), l());
    }

    public int f() {
        return a("ap_personalization_type", 6);
    }
}
