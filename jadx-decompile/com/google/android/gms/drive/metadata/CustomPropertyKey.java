package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class CustomPropertyKey extends AbstractSafeParcelable {
    public static final Creator<CustomPropertyKey> CREATOR = new h();
    public static final int a = 0;
    public static final int b = 1;
    private static final Pattern f = Pattern.compile("[\\w.!@$%^&*()/-]+");
    final int c;
    final String d;
    final int e;

    CustomPropertyKey(int i, String str, int i2) {
        boolean z = true;
        d.a(str, "key");
        d.b(f.matcher(str).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        if (!(i2 == 0 || i2 == 1)) {
            z = false;
        }
        d.b(z, "visibility must be either PUBLIC or PRIVATE");
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public CustomPropertyKey(String str, int i) {
        this(1, str, i);
    }

    public static CustomPropertyKey a(JSONObject jSONObject) {
        return new CustomPropertyKey(jSONObject.getString("key"), jSONObject.getInt("visibility"));
    }

    public String a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", a());
        jSONObject.put("visibility", b());
        return jSONObject;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomPropertyKey)) {
            return false;
        }
        CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
        if (!(customPropertyKey.a().equals(this.d) && customPropertyKey.b() == this.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.d;
        return new StringBuilder(String.valueOf(str).length() + 11).append(str).append(this.e).toString().hashCode();
    }

    public String toString() {
        String str = this.d;
        return new StringBuilder(String.valueOf(str).length() + 31).append("CustomPropertyKey(").append(str).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(this.e).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
