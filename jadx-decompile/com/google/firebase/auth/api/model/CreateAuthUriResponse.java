package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.List;

public class CreateAuthUriResponse extends AbstractSafeParcelable {
    public static final Creator<CreateAuthUriResponse> CREATOR = new a();
    @gc
    public final int a;
    @om(a = "authUri")
    private String b;
    @om(a = "registered")
    private boolean c;
    @om(a = "providerId")
    private String d;
    @om(a = "forExistingProvider")
    private boolean e;
    @om(a = "allProviders")
    private StringList f;

    public CreateAuthUriResponse() {
        this.a = 1;
        this.f = StringList.b();
    }

    CreateAuthUriResponse(int i, String str, boolean z, String str2, boolean z2, StringList stringList) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = stringList == null ? StringList.b() : StringList.a(stringList);
    }

    @Nullable
    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public StringList e() {
        return this.f;
    }

    @Nullable
    public List<String> f() {
        return this.f.a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
