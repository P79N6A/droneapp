package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Creator<MediaQueueItem> CREATOR = new o();
    public static final int a = 0;
    public static final double b = Double.POSITIVE_INFINITY;
    String c;
    private final int d;
    private MediaInfo e;
    private int f;
    private boolean g;
    private double h;
    private double i;
    private double j;
    private long[] k;
    private JSONObject l;

    public static class a {
        private final MediaQueueItem a;

        public a(MediaInfo mediaInfo) {
            this.a = new MediaQueueItem(mediaInfo);
        }

        public a(MediaQueueItem mediaQueueItem) {
            this.a = new MediaQueueItem();
        }

        public a(JSONObject jSONObject) {
            this.a = new MediaQueueItem(jSONObject);
        }

        public a a() {
            this.a.a(0);
            return this;
        }

        public a a(double d) {
            this.a.a(d);
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.a.b(jSONObject);
            return this;
        }

        public a a(boolean z) {
            this.a.a(z);
            return this;
        }

        public a a(long[] jArr) {
            this.a.a(jArr);
            return this;
        }

        public a b(double d) {
            this.a.b(d);
            return this;
        }

        public MediaQueueItem b() {
            this.a.j();
            return this.a;
        }

        public a c(double d) {
            this.a.c(d);
            return this;
        }
    }

    MediaQueueItem(int i, MediaInfo mediaInfo, int i2, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.d = i;
        this.e = mediaInfo;
        this.f = i2;
        this.g = z;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = jArr;
        this.c = str;
        if (this.c != null) {
            try {
                this.l = new JSONObject(this.c);
                return;
            } catch (JSONException e) {
                this.l = null;
                this.c = null;
                return;
            }
        }
        this.l = null;
    }

    private MediaQueueItem(MediaInfo mediaInfo) {
        this(1, mediaInfo, 0, true, 0.0d, b, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    private MediaQueueItem(MediaQueueItem mediaQueueItem) {
        this(1, mediaQueueItem.b(), mediaQueueItem.c(), mediaQueueItem.d(), mediaQueueItem.e(), mediaQueueItem.f(), mediaQueueItem.g(), mediaQueueItem.h(), null);
        if (this.e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.l = mediaQueueItem.i();
    }

    MediaQueueItem(JSONObject jSONObject) {
        this(1, null, 0, true, 0.0d, b, 0.0d, null, null);
        a(jSONObject);
    }

    int a() {
        return this.d;
    }

    void a(double d) {
        if (Double.isNaN(d) || d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        this.h = d;
    }

    void a(int i) {
        this.f = i;
    }

    void a(boolean z) {
        this.g = z;
    }

    void a(long[] jArr) {
        this.k = jArr;
    }

    public boolean a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        double d;
        long[] jArr;
        if (jSONObject.has("media")) {
            this.e = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId")) {
            int i = jSONObject.getInt("itemId");
            if (this.f != i) {
                this.f = i;
                z = true;
            }
        }
        if (jSONObject.has("autoplay")) {
            z2 = jSONObject.getBoolean("autoplay");
            if (this.g != z2) {
                this.g = z2;
                z = true;
            }
        }
        if (jSONObject.has("startTime")) {
            d = jSONObject.getDouble("startTime");
            if (Math.abs(d - this.h) > 1.0E-7d) {
                this.h = d;
                z = true;
            }
        }
        if (jSONObject.has("playbackDuration")) {
            d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.i) > 1.0E-7d) {
                this.i = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            d = jSONObject.getDouble("preloadTime");
            if (Math.abs(d - this.j) > 1.0E-7d) {
                this.j = d;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            int i2;
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            if (this.k == null) {
                jArr = jArr2;
                z2 = true;
            } else if (this.k.length != length) {
                jArr = jArr2;
                z2 = true;
            } else {
                for (i2 = 0; i2 < length; i2++) {
                    if (this.k[i2] != jArr2[i2]) {
                        jArr = jArr2;
                        z2 = true;
                        break;
                    }
                }
                long[] jArr3 = jArr2;
                z2 = false;
                jArr = jArr3;
            }
        } else {
            z2 = false;
            jArr = null;
        }
        if (z2) {
            this.k = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.l = jSONObject.getJSONObject("customData");
        return true;
    }

    public MediaInfo b() {
        return this.e;
    }

    void b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        this.i = d;
    }

    void b(JSONObject jSONObject) {
        this.l = jSONObject;
    }

    public int c() {
        return this.f;
    }

    void c(double d) {
        if (Double.isNaN(d) || d < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        }
        this.j = d;
    }

    public boolean d() {
        return this.g;
    }

    public double e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        if ((this.l == null) != (mediaQueueItem.l == null)) {
            return false;
        }
        if (this.l != null && mediaQueueItem.l != null && !p.a(this.l, mediaQueueItem.l)) {
            return false;
        }
        if (!(f.a(this.e, mediaQueueItem.e) && this.f == mediaQueueItem.f && this.g == mediaQueueItem.g && this.h == mediaQueueItem.h && this.i == mediaQueueItem.i && this.j == mediaQueueItem.j && Arrays.equals(this.k, mediaQueueItem.k))) {
            z = false;
        }
        return z;
    }

    public double f() {
        return this.i;
    }

    public double g() {
        return this.j;
    }

    public long[] h() {
        return this.k;
    }

    public int hashCode() {
        return c.a(this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), Double.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), String.valueOf(this.l));
    }

    public JSONObject i() {
        return this.l;
    }

    void j() {
        if (this.e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (Double.isNaN(this.h) || this.h < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.i)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.j) || this.j < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.e.l());
            if (this.f != 0) {
                jSONObject.put("itemId", this.f);
            }
            jSONObject.put("autoplay", this.g);
            jSONObject.put("startTime", this.h);
            if (this.i != b) {
                jSONObject.put("playbackDuration", this.i);
            }
            jSONObject.put("preloadTime", this.j);
            if (this.k != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.k) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.l != null) {
                jSONObject.put("customData", this.l);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.c = this.l == null ? null : this.l.toString();
        o.a(this, parcel, i);
    }
}
