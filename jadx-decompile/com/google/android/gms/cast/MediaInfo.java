package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MediaInfo> CREATOR = new m();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = -1;
    public static final long e = -1;
    String f;
    private final int g;
    private final String h;
    private int i;
    private String j;
    private MediaMetadata k;
    private long l;
    private List<MediaTrack> m;
    private TextTrackStyle n;
    private List<AdBreakInfo> o;
    private JSONObject p;

    public static class a {
        private final MediaInfo a;

        public a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.a = new MediaInfo(str);
        }

        public a a(int i) {
            this.a.a(i);
            return this;
        }

        public a a(long j) {
            this.a.a(j);
            return this;
        }

        public a a(MediaMetadata mediaMetadata) {
            this.a.a(mediaMetadata);
            return this;
        }

        public a a(TextTrackStyle textTrackStyle) {
            this.a.a(textTrackStyle);
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a a(List<MediaTrack> list) {
            this.a.a((List) list);
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.a.a(jSONObject);
            return this;
        }

        public MediaInfo a() {
            this.a.k();
            return this.a;
        }
    }

    MediaInfo(int i, String str, int i2, String str2, MediaMetadata mediaMetadata, long j, List<MediaTrack> list, TextTrackStyle textTrackStyle, String str3, List<AdBreakInfo> list2) {
        this.g = i;
        this.h = str;
        this.i = i2;
        this.j = str2;
        this.k = mediaMetadata;
        this.l = j;
        this.m = list;
        this.n = textTrackStyle;
        this.f = str3;
        if (this.f != null) {
            try {
                this.p = new JSONObject(this.f);
            } catch (JSONException e) {
                this.p = null;
                this.f = null;
            }
        } else {
            this.p = null;
        }
        this.o = list2;
    }

    MediaInfo(String str) {
        this(1, str, -1, null, null, -1, null, null, null, null);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
    }

    MediaInfo(JSONObject jSONObject) {
        this(1, jSONObject.getString("contentId"), -1, null, null, -1, null, null, null, null);
        String string = jSONObject.getString("streamType");
        if ("NONE".equals(string)) {
            this.i = 0;
        } else if ("BUFFERED".equals(string)) {
            this.i = 1;
        } else if ("LIVE".equals(string)) {
            this.i = 2;
        } else {
            this.i = -1;
        }
        this.j = jSONObject.getString("contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            this.k = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.k.a(jSONObject2);
        }
        this.l = -1;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!(Double.isNaN(optDouble) || Double.isInfinite(optDouble))) {
                this.l = f.a(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            this.m = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.m.add(new MediaTrack(jSONArray.getJSONObject(i)));
            }
        } else {
            this.m = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            jSONObject2 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.b(jSONObject2);
            this.n = textTrackStyle;
        } else {
            this.n = null;
        }
        this.p = jSONObject.optJSONObject("customData");
    }

    int a() {
        return this.g;
    }

    void a(int i) {
        if (i < -1 || i > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.i = i;
    }

    void a(long j) {
        if (j >= 0 || j == -1) {
            this.l = j;
            return;
        }
        throw new IllegalArgumentException("Invalid stream duration");
    }

    void a(MediaMetadata mediaMetadata) {
        this.k = mediaMetadata;
    }

    public void a(TextTrackStyle textTrackStyle) {
        this.n = textTrackStyle;
    }

    void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.j = str;
    }

    void a(List<MediaTrack> list) {
        this.m = list;
    }

    void a(JSONObject jSONObject) {
        this.p = jSONObject;
    }

    public String b() {
        return this.h;
    }

    public void b(List<AdBreakInfo> list) {
        this.o = list;
    }

    public int c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public MediaMetadata e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.p == null) != (mediaInfo.p == null)) {
            return false;
        }
        if (this.p != null && mediaInfo.p != null && !p.a(this.p, mediaInfo.p)) {
            return false;
        }
        if (!(f.a(this.h, mediaInfo.h) && this.i == mediaInfo.i && f.a(this.j, mediaInfo.j) && f.a(this.k, mediaInfo.k) && this.l == mediaInfo.l)) {
            z = false;
        }
        return z;
    }

    public long f() {
        return this.l;
    }

    public List<MediaTrack> g() {
        return this.m;
    }

    public TextTrackStyle h() {
        return this.n;
    }

    public int hashCode() {
        return c.a(this.h, Integer.valueOf(this.i), this.j, this.k, Long.valueOf(this.l), String.valueOf(this.p));
    }

    public JSONObject i() {
        return this.p;
    }

    public List<AdBreakInfo> j() {
        return this.o;
    }

    void k() {
        if (TextUtils.isEmpty(this.h)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else if (TextUtils.isEmpty(this.j)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else if (this.i == -1) {
            throw new IllegalArgumentException("a valid stream type must be specified");
        }
    }

    public JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj;
            jSONObject.put("contentId", this.h);
            switch (this.i) {
                case 1:
                    obj = "BUFFERED";
                    break;
                case 2:
                    obj = "LIVE";
                    break;
                default:
                    obj = "NONE";
                    break;
            }
            jSONObject.put("streamType", obj);
            if (this.j != null) {
                jSONObject.put("contentType", this.j);
            }
            if (this.k != null) {
                jSONObject.put("metadata", this.k.e());
            }
            if (this.l <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", f.a(this.l));
            }
            if (this.m != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack j : this.m) {
                    jSONArray.put(j.j());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.n != null) {
                jSONObject.put("textTrackStyle", this.n.n());
            }
            if (this.p != null) {
                jSONObject.put("customData", this.p);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f = this.p == null ? null : this.p.toString();
        m.a(this, parcel, i);
    }
}
