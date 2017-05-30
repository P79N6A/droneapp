package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StockProfileImageEntity extends AbstractSafeParcelable implements StockProfileImage {
    public static final e CREATOR = new e();
    private final int a;
    private final String b;
    private final Uri c;

    StockProfileImageEntity(int i, String str, Uri uri) {
        this.a = i;
        this.b = str;
        this.c = uri;
    }

    public StockProfileImageEntity(StockProfileImage stockProfileImage) {
        this(1, stockProfileImage.c(), stockProfileImage.d());
    }

    public StockProfileImageEntity(String str, Uri uri) {
        this(1, str, uri);
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public Uri d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return c.a(this.b, stockProfileImage.c()) && c.a(this.c, stockProfileImage.d());
    }

    public StockProfileImage f() {
        return this;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("ImageId", this.b).a("ImageUri", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
