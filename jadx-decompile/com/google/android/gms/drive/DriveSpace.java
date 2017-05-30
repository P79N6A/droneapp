package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Set;
import java.util.regex.Pattern;

public class DriveSpace extends AbstractSafeParcelable {
    public static final Creator<DriveSpace> CREATOR = new v();
    public static final DriveSpace a = new DriveSpace("DRIVE");
    public static final DriveSpace b = new DriveSpace("APP_DATA_FOLDER");
    public static final DriveSpace c = new DriveSpace("PHOTOS");
    public static final Set<DriveSpace> d = f.a(a, b, c);
    public static final String e = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, d.toArray());
    private static final Pattern g = Pattern.compile("[A-Z0-9_]*");
    final int f;
    private final String h;

    DriveSpace(int i, String str) {
        this.f = i;
        this.h = (String) d.a(str);
    }

    private DriveSpace(String str) {
        this(1, str);
    }

    public String a() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return (obj == null || obj.getClass() != DriveSpace.class) ? false : this.h.equals(((DriveSpace) obj).h);
    }

    public int hashCode() {
        return 1247068382 ^ this.h.hashCode();
    }

    public String toString() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
