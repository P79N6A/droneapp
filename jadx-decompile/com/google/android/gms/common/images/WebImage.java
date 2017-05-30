package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new c();
    private final int a;
    private final Uri b;
    private final int c;
    private final int d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }

    public WebImage(Uri uri) {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(JSONObject jSONObject) {
        this(a(jSONObject), jSONObject.optInt(FimiMediaMeta.IJKM_KEY_WIDTH, 0), jSONObject.optInt(FimiMediaMeta.IJKM_KEY_HEIGHT, 0));
    }

    private static Uri a(JSONObject jSONObject) {
        Uri uri = null;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException e) {
            }
        }
        return uri;
    }

    int a() {
        return this.a;
    }

    public Uri b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.b.toString());
            jSONObject.put(FimiMediaMeta.IJKM_KEY_WIDTH, this.c);
            jSONObject.put(FimiMediaMeta.IJKM_KEY_HEIGHT, this.d);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return c.a(this.b, webImage.b) && this.c == webImage.c && this.d == webImage.d;
    }

    public int hashCode() {
        return c.a(this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), this.b.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
