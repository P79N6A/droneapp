package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Creator<AddPlaceRequest> CREATOR = new o();
    final int a;
    private final String b;
    private final LatLng c;
    private final String d;
    private final List<Integer> e;
    private final String f;
    private final Uri g;

    AddPlaceRequest(int i, String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        boolean z = false;
        this.a = i;
        this.b = d.a(str);
        this.c = (LatLng) d.a(latLng);
        this.d = d.a(str2);
        this.e = new ArrayList((Collection) d.a(list));
        d.b(!this.e.isEmpty(), "At least one place type should be provided.");
        if (!(TextUtils.isEmpty(str3) && uri == null)) {
            z = true;
        }
        d.b(z, "One of phone number or URI should be provided.");
        this.f = str3;
        this.g = uri;
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, Uri uri) {
        this(str, latLng, str2, list, null, (Uri) d.a(uri));
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3) {
        this(str, latLng, str2, list, d.a(str3), null);
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        this(0, str, latLng, str2, list, str3, uri);
    }

    public String a() {
        return this.b;
    }

    public LatLng b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public List<Integer> d() {
        return this.e;
    }

    @Nullable
    public String e() {
        return this.f;
    }

    @Nullable
    public Uri f() {
        return this.g;
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.b).a("latLng", this.c).a("address", this.d).a("placeTypes", this.e).a("phoneNumer", this.f).a("websiteUri", this.g).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
