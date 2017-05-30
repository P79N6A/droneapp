package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.agt;
import com.google.firebase.a.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata extends AbstractSafeParcelable {
    public static final String A = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    private static final String[] B = new String[]{null, "String", "int", "double", "ISO-8601 date String"};
    private static final a C = new a().a(h, "creationDateTime", 4).a(i, "releaseDate", 4).a(j, "originalAirdate", 4).a(k, "title", 1).a(l, "subtitle", 1).a(m, "artist", 1).a(n, "albumArtist", 1).a(o, "albumName", 1).a(p, "composer", 1).a(q, "discNumber", 2).a(r, "trackNumber", 2).a(s, "season", 2).a(t, "episode", 2).a(u, "seriesTitle", 1).a(v, "studio", 1).a(w, FimiMediaMeta.IJKM_KEY_WIDTH, 2).a(x, FimiMediaMeta.IJKM_KEY_HEIGHT, 2).a(y, b.p, 1).a(z, "latitude", 3).a(A, "longitude", 3);
    public static final Creator<MediaMetadata> CREATOR = new n();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 100;
    public static final String h = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String i = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String j = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String k = "com.google.android.gms.cast.metadata.TITLE";
    public static final String l = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String m = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String n = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String o = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String p = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String q = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String r = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String s = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String t = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String u = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String v = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String w = "com.google.android.gms.cast.metadata.WIDTH";
    public static final String x = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String y = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String z = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    private final int D;
    private final List<WebImage> E;
    private int F;
    final Bundle g;

    private static class a {
        private final Map<String, String> a = new HashMap();
        private final Map<String, String> b = new HashMap();
        private final Map<String, Integer> c = new HashMap();

        public a a(String str, String str2, int i) {
            this.a.put(str, str2);
            this.b.put(str2, str);
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        public String a(String str) {
            return (String) this.a.get(str);
        }

        public String b(String str) {
            return (String) this.b.get(str);
        }

        public int c(String str) {
            Integer num = (Integer) this.c.get(str);
            return num != null ? num.intValue() : 0;
        }
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i) {
        this(1, new ArrayList(), new Bundle(), i);
    }

    MediaMetadata(int i, List<WebImage> list, Bundle bundle, int i2) {
        this.D = i;
        this.E = list;
        this.g = bundle;
        this.F = i2;
    }

    private void a(JSONObject jSONObject, String... strArr) {
        try {
            for (String str : strArr) {
                if (this.g.containsKey(str)) {
                    switch (C.c(str)) {
                        case 1:
                        case 4:
                            jSONObject.put(C.a(str), this.g.getString(str));
                            break;
                        case 2:
                            jSONObject.put(C.a(str), this.g.getInt(str));
                            break;
                        case 3:
                            jSONObject.put(C.a(str), this.g.getDouble(str));
                            break;
                        default:
                            break;
                    }
                }
            }
            for (String str2 : this.g.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.g.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException e) {
        }
    }

    private boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int c = C.c(str);
        if (c != i && c != 0) {
            String valueOf = String.valueOf(B[i]);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Value for ").append(str).append(" must be a ").append(valueOf).toString());
        }
    }

    private void b(JSONObject jSONObject, String... strArr) {
        Set hashSet = new HashSet(Arrays.asList(strArr));
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (!"metadataType".equals(str)) {
                    String b = C.b(str);
                    if (b == null) {
                        Object obj = jSONObject.get(str);
                        if (obj instanceof String) {
                            this.g.putString(str, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.g.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.g.putDouble(str, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(b)) {
                        try {
                            Object obj2 = jSONObject.get(str);
                            if (obj2 != null) {
                                switch (C.c(b)) {
                                    case 1:
                                        if (!(obj2 instanceof String)) {
                                            break;
                                        }
                                        this.g.putString(b, (String) obj2);
                                        break;
                                    case 2:
                                        if (!(obj2 instanceof Integer)) {
                                            break;
                                        }
                                        this.g.putInt(b, ((Integer) obj2).intValue());
                                        break;
                                    case 3:
                                        if (!(obj2 instanceof Double)) {
                                            break;
                                        }
                                        this.g.putDouble(b, ((Double) obj2).doubleValue());
                                        break;
                                    case 4:
                                        if ((obj2 instanceof String) && agt.a((String) obj2) != null) {
                                            this.g.putString(b, (String) obj2);
                                            break;
                                        }
                                    default:
                                        break;
                                }
                            }
                        } catch (JSONException e) {
                        }
                    }
                }
            }
        } catch (JSONException e2) {
        }
    }

    int a() {
        return this.D;
    }

    public void a(WebImage webImage) {
        this.E.add(webImage);
    }

    public void a(String str, double d) {
        b(str, 3);
        this.g.putDouble(str, d);
    }

    public void a(String str, int i) {
        b(str, 2);
        this.g.putInt(str, i);
    }

    public void a(String str, String str2) {
        b(str, 1);
        this.g.putString(str, str2);
    }

    public void a(String str, Calendar calendar) {
        b(str, 4);
        this.g.putString(str, agt.a(calendar));
    }

    public void a(JSONObject jSONObject) {
        c();
        this.F = 0;
        try {
            this.F = jSONObject.getInt("metadataType");
        } catch (JSONException e) {
        }
        agt.a(this.E, jSONObject);
        switch (this.F) {
            case 0:
                b(jSONObject, k, m, l, i);
                return;
            case 1:
                b(jSONObject, k, v, l, i);
                return;
            case 2:
                b(jSONObject, k, u, s, t, j);
                return;
            case 3:
                b(jSONObject, k, o, m, n, p, r, q, i);
                return;
            case 4:
                b(jSONObject, k, m, y, z, A, w, x, h);
                return;
            default:
                b(jSONObject, new String[0]);
                return;
        }
    }

    public boolean a(String str) {
        return this.g.containsKey(str);
    }

    public int b() {
        return this.F;
    }

    public String b(String str) {
        b(str, 1);
        return this.g.getString(str);
    }

    public int c(String str) {
        b(str, 2);
        return this.g.getInt(str);
    }

    public void c() {
        this.g.clear();
        this.E.clear();
    }

    public double d(String str) {
        b(str, 3);
        return this.g.getDouble(str);
    }

    public Set<String> d() {
        return this.g.keySet();
    }

    public Calendar e(String str) {
        b(str, 4);
        String string = this.g.getString(str);
        return string != null ? agt.a(string) : null;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.F);
        } catch (JSONException e) {
        }
        agt.a(jSONObject, this.E);
        switch (this.F) {
            case 0:
                a(jSONObject, k, m, l, i);
                break;
            case 1:
                a(jSONObject, k, v, l, i);
                break;
            case 2:
                a(jSONObject, k, u, s, t, j);
                break;
            case 3:
                a(jSONObject, k, m, o, n, p, r, q, i);
                break;
            case 4:
                a(jSONObject, k, m, y, z, A, w, x, h);
                break;
            default:
                a(jSONObject, new String[0]);
                break;
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return a(this.g, mediaMetadata.g) && this.E.equals(mediaMetadata.E);
    }

    public String f(String str) {
        b(str, 4);
        return this.g.getString(str);
    }

    public List<WebImage> f() {
        return this.E;
    }

    public boolean g() {
        return (this.E == null || this.E.isEmpty()) ? false : true;
    }

    public void h() {
        this.E.clear();
    }

    public int hashCode() {
        int i = 17;
        for (String str : this.g.keySet()) {
            i *= 31;
            i = this.g.get(str).hashCode() + i;
        }
        return (i * 31) + this.E.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
