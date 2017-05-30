package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class r extends t implements d {
    private final String bx = a("place_id", "");

    public r(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private PlaceEntity s() {
        PlaceEntity a = new PlaceEntity$a().c(e().toString()).b(t()).a(c()).a(q()).a(h()).a(p()).b(g().toString()).d(k().toString()).a(m()).b(l()).a(d()).a(i()).a(j()).a(r()).a();
        a.a(f());
        return a;
    }

    private List<String> t() {
        return b("place_attributions", Collections.emptyList());
    }

    public /* synthetic */ Object a() {
        return o();
    }

    public String c() {
        return this.bx;
    }

    public List<Integer> d() {
        return a("place_types", Collections.emptyList());
    }

    public CharSequence e() {
        return a("place_address", "");
    }

    public Locale f() {
        Object a = a("place_locale_language", "");
        if (!TextUtils.isEmpty(a)) {
            return new Locale(a, a("place_locale_country", ""));
        }
        a = a("place_locale", "");
        return !TextUtils.isEmpty(a) ? new Locale(a) : Locale.getDefault();
    }

    public CharSequence g() {
        return a("place_name", "");
    }

    public LatLng h() {
        return (LatLng) a("place_lat_lng", LatLng.CREATOR);
    }

    public LatLngBounds i() {
        return (LatLngBounds) a("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri j() {
        String a = a("place_website_uri", null);
        return a == null ? null : Uri.parse(a);
    }

    public CharSequence k() {
        return a("place_phone_number", "");
    }

    public float l() {
        return a("place_rating", -1.0f);
    }

    public int m() {
        return a("place_price_level", -1);
    }

    public CharSequence n() {
        return c.a(t());
    }

    public d o() {
        return s();
    }

    public float p() {
        return a("place_level_number", 0.0f);
    }

    public boolean q() {
        return a("place_is_permanently_closed", false);
    }

    public long r() {
        return a("place_timestamp_secs", 0);
    }
}
