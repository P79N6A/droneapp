package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Asset> CREATOR = new x();
    final int a;
    public ParcelFileDescriptor b;
    public Uri c;
    private byte[] d;
    private String e;

    Asset(int i, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = i;
        this.d = bArr;
        this.e = str;
        this.b = parcelFileDescriptor;
        this.c = uri;
    }

    public static Asset a(Uri uri) {
        if (uri != null) {
            return new Asset(1, null, null, null, uri);
        }
        throw new IllegalArgumentException("Asset uri cannot be null");
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(1, null, null, parcelFileDescriptor, null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    public static Asset a(String str) {
        if (str != null) {
            return new Asset(1, null, str, null, null);
        }
        throw new IllegalArgumentException("Asset digest cannot be null");
    }

    public static Asset a(byte[] bArr) {
        if (bArr != null) {
            return new Asset(1, bArr, null, null, null);
        }
        throw new IllegalArgumentException("Asset data cannot be null");
    }

    public byte[] a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public ParcelFileDescriptor c() {
        return this.b;
    }

    public Uri d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.d, asset.d) && c.a(this.e, asset.e) && c.a(this.b, asset.b) && c.a(this.c, asset.c);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.d, this.e, this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset[@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.e == null) {
            stringBuilder.append(", nodigest");
        } else {
            stringBuilder.append(", ");
            stringBuilder.append(this.e);
        }
        if (this.d != null) {
            stringBuilder.append(", size=");
            stringBuilder.append(this.d.length);
        }
        if (this.b != null) {
            stringBuilder.append(", fd=");
            stringBuilder.append(this.b);
        }
        if (this.c != null) {
            stringBuilder.append(", uri=");
            stringBuilder.append(this.c);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i | 1);
    }
}
