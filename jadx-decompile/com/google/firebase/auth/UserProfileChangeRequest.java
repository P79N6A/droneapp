package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Creator<UserProfileChangeRequest> CREATOR = new x();
    public final int a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private Uri f;

    public static class a {
        private String a;
        private Uri b;
        private boolean c;
        private boolean d;

        public a a(@Nullable Uri uri) {
            if (uri == null) {
                this.d = true;
            } else {
                this.b = uri;
            }
            return this;
        }

        public a a(@Nullable String str) {
            if (str == null) {
                this.c = true;
            } else {
                this.a = str;
            }
            return this;
        }

        public UserProfileChangeRequest a() {
            return new UserProfileChangeRequest(1, this.a, this.b == null ? null : this.b.toString(), this.c, this.d);
        }
    }

    UserProfileChangeRequest(int i, String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Nullable
    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    @Nullable
    public Uri c() {
        return this.f;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
