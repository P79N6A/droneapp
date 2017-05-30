package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MediaTrack> CREATOR = new q();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = -1;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    String l;
    private final int m;
    private long n;
    private int o;
    private String p;
    private String q;
    private String r;
    private String s;
    private int t;
    private JSONObject u;

    public static class a {
        private final MediaTrack a;

        public a(long j, int i) {
            this.a = new MediaTrack(j, i);
        }

        public a a(int i) {
            this.a.a(i);
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a a(Locale locale) {
            this.a.d(f.a(locale));
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.a.a(jSONObject);
            return this;
        }

        public MediaTrack a() {
            return this.a;
        }

        public a b(String str) {
            this.a.b(str);
            return this;
        }

        public a c(String str) {
            this.a.c(str);
            return this;
        }

        public a d(String str) {
            this.a.d(str);
            return this;
        }
    }

    MediaTrack(int i, long j, int i2, String str, String str2, String str3, String str4, int i3, String str5) {
        this.m = i;
        this.n = j;
        this.o = i2;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.t = i3;
        this.l = str5;
        if (this.l != null) {
            try {
                this.u = new JSONObject(this.l);
                return;
            } catch (JSONException e) {
                this.u = null;
                this.l = null;
                return;
            }
        }
        this.u = null;
    }

    MediaTrack(long j, int i) {
        this(1, 0, 0, null, null, null, null, -1, null);
        this.n = j;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("invalid type " + i);
        }
        this.o = i;
    }

    MediaTrack(JSONObject jSONObject) {
        this(1, 0, 0, null, null, null, null, -1, null);
        b(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        this.n = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.o = 1;
        } else if ("AUDIO".equals(string)) {
            this.o = 2;
        } else if ("VIDEO".equals(string)) {
            this.o = 3;
        } else {
            String str = "invalid type: ";
            string = String.valueOf(string);
            throw new JSONException(string.length() != 0 ? str.concat(string) : new String(str));
        }
        this.p = jSONObject.optString("trackContentId", null);
        this.q = jSONObject.optString("trackContentType", null);
        this.r = jSONObject.optString(User.FN_NAME, null);
        this.s = jSONObject.optString("language", null);
        if (jSONObject.has("subtype")) {
            string = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string)) {
                this.t = 1;
            } else if ("CAPTIONS".equals(string)) {
                this.t = 2;
            } else if ("DESCRIPTIONS".equals(string)) {
                this.t = 3;
            } else if ("CHAPTERS".equals(string)) {
                this.t = 4;
            } else if ("METADATA".equals(string)) {
                this.t = 5;
            } else {
                str = "invalid subtype: ";
                string = String.valueOf(string);
                throw new JSONException(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
        this.t = 0;
        this.u = jSONObject.optJSONObject("customData");
    }

    int a() {
        return this.m;
    }

    void a(int i) {
        if (i <= -1 || i > 5) {
            throw new IllegalArgumentException("invalid subtype " + i);
        } else if (i == 0 || this.o == 1) {
            this.t = i;
        } else {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
    }

    public void a(String str) {
        this.p = str;
    }

    void a(JSONObject jSONObject) {
        this.u = jSONObject;
    }

    public long b() {
        return this.n;
    }

    public void b(String str) {
        this.q = str;
    }

    public int c() {
        return this.o;
    }

    void c(String str) {
        this.r = str;
    }

    public String d() {
        return this.p;
    }

    void d(String str) {
        this.s = str;
    }

    public String e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.u == null) != (mediaTrack.u == null)) {
            return false;
        }
        if (this.u != null && mediaTrack.u != null && !p.a(this.u, mediaTrack.u)) {
            return false;
        }
        if (!(this.n == mediaTrack.n && this.o == mediaTrack.o && f.a(this.p, mediaTrack.p) && f.a(this.q, mediaTrack.q) && f.a(this.r, mediaTrack.r) && f.a(this.s, mediaTrack.s) && this.t == mediaTrack.t)) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.r;
    }

    public String g() {
        return this.s;
    }

    public int h() {
        return this.t;
    }

    public int hashCode() {
        return c.a(Long.valueOf(this.n), Integer.valueOf(this.o), this.p, this.q, this.r, this.s, Integer.valueOf(this.t), this.u);
    }

    public JSONObject i() {
        return this.u;
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.n);
            switch (this.o) {
                case 1:
                    jSONObject.put("type", "TEXT");
                    break;
                case 2:
                    jSONObject.put("type", "AUDIO");
                    break;
                case 3:
                    jSONObject.put("type", "VIDEO");
                    break;
            }
            if (this.p != null) {
                jSONObject.put("trackContentId", this.p);
            }
            if (this.q != null) {
                jSONObject.put("trackContentType", this.q);
            }
            if (this.r != null) {
                jSONObject.put(User.FN_NAME, this.r);
            }
            if (!TextUtils.isEmpty(this.s)) {
                jSONObject.put("language", this.s);
            }
            switch (this.t) {
                case 1:
                    jSONObject.put("subtype", "SUBTITLES");
                    break;
                case 2:
                    jSONObject.put("subtype", "CAPTIONS");
                    break;
                case 3:
                    jSONObject.put("subtype", "DESCRIPTIONS");
                    break;
                case 4:
                    jSONObject.put("subtype", "CHAPTERS");
                    break;
                case 5:
                    jSONObject.put("subtype", "METADATA");
                    break;
            }
            if (this.u != null) {
                jSONObject.put("customData", this.u);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.l = this.u == null ? null : this.u.toString();
        q.a(this, parcel, i);
    }
}
