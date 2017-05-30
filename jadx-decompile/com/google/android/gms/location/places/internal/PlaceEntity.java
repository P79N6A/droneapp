package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, d {
    public static final l CREATOR = new l();
    @Deprecated
    private final PlaceLocalization bA;
    private final LatLng bB;
    private final float bC;
    private final LatLngBounds bD;
    private final String bE;
    private final Uri bF;
    private final boolean bG;
    private final float bH;
    private final int bI;
    private final long bJ;
    private final List<Integer> bK;
    private final List<Integer> bL;
    private final String bM;
    private final String bN;
    private final String bO;
    private final String bP;
    private final List<String> bQ;
    private final Map<Integer, String> bR;
    private final TimeZone bS;
    private Locale bT;
    final int bx;
    private final String by;
    private final Bundle bz;

    PlaceEntity(int i, String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i2, long j, PlaceLocalization placeLocalization) {
        List emptyList;
        this.bx = i;
        this.by = str;
        this.bL = Collections.unmodifiableList(list);
        this.bK = list2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.bz = bundle;
        this.bM = str2;
        this.bN = str3;
        this.bO = str4;
        this.bP = str5;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        }
        this.bQ = emptyList;
        this.bB = latLng;
        this.bC = f;
        this.bD = latLngBounds;
        if (str6 == null) {
            str6 = "UTC";
        }
        this.bE = str6;
        this.bF = uri;
        this.bG = z;
        this.bH = f2;
        this.bI = i2;
        this.bJ = j;
        this.bR = Collections.unmodifiableMap(new HashMap());
        this.bS = null;
        this.bT = null;
        this.bA = placeLocalization;
    }

    public d A() {
        return this;
    }

    public /* synthetic */ Object a() {
        return A();
    }

    public void a(Locale locale) {
        this.bT = locale;
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.by;
    }

    public List<Integer> d() {
        return this.bL;
    }

    public /* synthetic */ CharSequence e() {
        return q();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.by.equals(placeEntity.by) && c.a(this.bT, placeEntity.bT) && this.bJ == placeEntity.bJ;
    }

    public Locale f() {
        return this.bT;
    }

    public /* synthetic */ CharSequence g() {
        return p();
    }

    public LatLng h() {
        return this.bB;
    }

    public int hashCode() {
        return c.a(this.by, this.bT, Long.valueOf(this.bJ));
    }

    public LatLngBounds i() {
        return this.bD;
    }

    public Uri j() {
        return this.bF;
    }

    public /* synthetic */ CharSequence k() {
        return s();
    }

    public float l() {
        return this.bH;
    }

    public int m() {
        return this.bI;
    }

    public CharSequence n() {
        return c.a(this.bQ);
    }

    public List<Integer> o() {
        return this.bK;
    }

    public String p() {
        return this.bM;
    }

    public String q() {
        return this.bN;
    }

    public float r() {
        return this.bC;
    }

    public String s() {
        return this.bO;
    }

    public String t() {
        return this.bP;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return c.a((Object) this).a("id", this.by).a("placeTypes", this.bL).a("locale", this.bT).a(User.FN_NAME, this.bM).a("address", this.bN).a("phoneNumber", this.bO).a("latlng", this.bB).a("viewport", this.bD).a("websiteUri", this.bF).a("isPermanentlyClosed", Boolean.valueOf(this.bG)).a("priceLevel", Integer.valueOf(this.bI)).a("timestampSecs", Long.valueOf(this.bJ)).toString();
    }

    public List<String> u() {
        return this.bQ;
    }

    public boolean v() {
        return this.bG;
    }

    public long w() {
        return this.bJ;
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }

    public Bundle x() {
        return this.bz;
    }

    public String y() {
        return this.bE;
    }

    @Deprecated
    public PlaceLocalization z() {
        return this.bA;
    }
}
