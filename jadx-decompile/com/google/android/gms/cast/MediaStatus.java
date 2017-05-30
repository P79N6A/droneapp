package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import com.google.firebase.a.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus extends AbstractSafeParcelable {
    public static final Creator<MediaStatus> CREATOR = new p();
    public static final long a = 1;
    public static final long b = 2;
    public static final long c = 4;
    public static final long d = 8;
    public static final long e = 16;
    public static final long f = 32;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    private long A;
    private int B;
    private double C;
    private int D;
    private int E;
    private long F;
    private double G;
    private boolean H;
    private long[] I;
    private int J;
    private int K;
    private JSONObject L;
    private boolean M;
    private final SparseArray<Integer> N;
    long u;
    String v;
    int w;
    final ArrayList<MediaQueueItem> x;
    private final int y;
    private MediaInfo z;

    MediaStatus(int i, MediaInfo mediaInfo, long j, int i2, double d, int i3, int i4, long j2, long j3, double d2, boolean z, long[] jArr, int i5, int i6, String str, int i7, List<MediaQueueItem> list, boolean z2) {
        this.x = new ArrayList();
        this.N = new SparseArray();
        this.y = i;
        this.z = mediaInfo;
        this.A = j;
        this.B = i2;
        this.C = d;
        this.D = i3;
        this.E = i4;
        this.F = j2;
        this.u = j3;
        this.G = d2;
        this.H = z;
        this.I = jArr;
        this.J = i5;
        this.K = i6;
        this.v = str;
        if (this.v != null) {
            try {
                this.L = new JSONObject(this.v);
            } catch (JSONException e) {
                this.L = null;
                this.v = null;
            }
        } else {
            this.L = null;
        }
        this.w = i7;
        if (!(list == null || list.isEmpty())) {
            a((MediaQueueItem[]) list.toArray(new MediaQueueItem[list.size()]));
        }
        this.M = z2;
    }

    public MediaStatus(JSONObject jSONObject) {
        this(1, null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, null, 0, 0, null, 0, null, false);
        a(jSONObject, 0);
    }

    private void a(MediaQueueItem[] mediaQueueItemArr) {
        this.x.clear();
        this.N.clear();
        for (int i = 0; i < mediaQueueItemArr.length; i++) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
            this.x.add(mediaQueueItem);
            this.N.put(mediaQueueItem.c(), Integer.valueOf(i));
        }
    }

    private boolean a(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        switch (i2) {
            case 1:
            case 3:
                return i3 == 0;
            case 2:
                return i4 != 2;
            default:
                return true;
        }
    }

    private boolean a(MediaStatus mediaStatus) {
        return this.L == null || mediaStatus.L == null || p.a(this.L, mediaStatus.L);
    }

    private void s() {
        this.w = 0;
        this.x.clear();
        this.N.clear();
    }

    int a() {
        return this.y;
    }

    public int a(JSONObject jSONObject, int i) {
        int i2;
        int i3;
        double d;
        long a;
        long[] jArr;
        int i4 = 2;
        int i5 = 1;
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.A) {
            this.A = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            i3 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : 0;
            if (i3 != this.D) {
                this.D = i3;
                i2 |= 2;
            }
            if (i3 == 1 && jSONObject.has("idleReason")) {
                string = jSONObject.getString("idleReason");
                if (!string.equals("CANCELLED")) {
                    i4 = string.equals("INTERRUPTED") ? 3 : string.equals("FINISHED") ? 1 : string.equals("ERROR") ? 4 : 0;
                }
                if (i4 != this.E) {
                    this.E = i4;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            d = jSONObject.getDouble("playbackRate");
            if (this.C != d) {
                this.C = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime") && (i & 2) == 0) {
            a = f.a(jSONObject.getDouble("currentTime"));
            if (a != this.F) {
                this.F = a;
                i2 |= 2;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            a = jSONObject.getLong("supportedMediaCommands");
            if (a != this.u) {
                this.u = a;
                i2 |= 2;
            }
        }
        if (jSONObject.has(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME) && (i & 1) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);
            d = jSONObject2.getDouble(b.q);
            if (d != this.G) {
                this.G = d;
                i2 |= 2;
            }
            boolean z = jSONObject2.getBoolean("muted");
            if (z != this.H) {
                this.H = z;
                i2 |= 2;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (i4 = 0; i4 < length; i4++) {
                jArr2[i4] = jSONArray.getLong(i4);
            }
            if (this.I != null && this.I.length == length) {
                for (i4 = 0; i4 < length; i4++) {
                    if (this.I[i4] != jArr2[i4]) {
                        break;
                    }
                }
                i5 = 0;
            }
            if (i5 != 0) {
                this.I = jArr2;
            }
            long[] jArr3 = jArr2;
            i3 = i5;
            jArr = jArr3;
        } else if (this.I != null) {
            i3 = 1;
            jArr = null;
        } else {
            jArr = null;
            i3 = 0;
        }
        if (i3 != 0) {
            this.I = jArr;
            i2 |= 2;
        }
        if (jSONObject.has("customData")) {
            this.L = jSONObject.getJSONObject("customData");
            this.v = null;
            i2 |= 2;
        }
        if (jSONObject.has("media")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("media");
            this.z = new MediaInfo(jSONObject3);
            i2 |= 2;
            if (jSONObject3.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject.has("currentItemId")) {
            i5 = jSONObject.getInt("currentItemId");
            if (this.B != i5) {
                this.B = i5;
                i2 |= 2;
            }
        }
        i5 = jSONObject.optInt("preloadedItemId", 0);
        if (this.K != i5) {
            this.K = i5;
            i2 |= 16;
        }
        i5 = jSONObject.optInt("loadingItemId", 0);
        if (this.J != i5) {
            this.J = i5;
            i2 |= 2;
        }
        if (!a(this.D, this.E, this.J, this.z == null ? -1 : this.z.c())) {
            return a(jSONObject) ? i2 | 8 : i2;
        } else {
            this.B = 0;
            this.J = 0;
            this.K = 0;
            if (this.x.isEmpty()) {
                return i2;
            }
            s();
            return i2 | 8;
        }
    }

    public MediaQueueItem a(int i) {
        return c(i);
    }

    public void a(boolean z) {
        this.M = z;
    }

    public boolean a(long j) {
        return (this.u & j) != 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean a(org.json.JSONObject r11) {
        /*
        r10 = this;
        r3 = 3;
        r0 = 2;
        r1 = 0;
        r2 = 1;
        r4 = "repeatMode";
        r4 = r11.has(r4);
        if (r4 == 0) goto L_0x00ef;
    L_0x000c:
        r4 = r10.w;
        r5 = "repeatMode";
        r6 = r11.getString(r5);
        r5 = -1;
        r7 = r6.hashCode();
        switch(r7) {
            case -1118317585: goto L_0x0073;
            case -962896020: goto L_0x0069;
            case 1645938909: goto L_0x005f;
            case 1645952171: goto L_0x0055;
            default: goto L_0x001c;
        };
    L_0x001c:
        switch(r5) {
            case 0: goto L_0x007d;
            case 1: goto L_0x007f;
            case 2: goto L_0x0020;
            case 3: goto L_0x0081;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r4;
    L_0x0020:
        r3 = r10.w;
        if (r3 == r0) goto L_0x00ef;
    L_0x0024:
        r10.w = r0;
        r0 = r2;
    L_0x0027:
        r3 = "items";
        r3 = r11.has(r3);
        if (r3 == 0) goto L_0x00ed;
    L_0x002f:
        r3 = "items";
        r4 = r11.getJSONArray(r3);
        r5 = r4.length();
        r6 = new android.util.SparseArray;
        r6.<init>();
        r3 = r1;
    L_0x003f:
        if (r3 >= r5) goto L_0x0083;
    L_0x0041:
        r7 = r4.getJSONObject(r3);
        r8 = "itemId";
        r7 = r7.getInt(r8);
        r7 = java.lang.Integer.valueOf(r7);
        r6.put(r3, r7);
        r3 = r3 + 1;
        goto L_0x003f;
    L_0x0055:
        r7 = "REPEAT_OFF";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x001c;
    L_0x005d:
        r5 = r1;
        goto L_0x001c;
    L_0x005f:
        r7 = "REPEAT_ALL";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x001c;
    L_0x0067:
        r5 = r2;
        goto L_0x001c;
    L_0x0069:
        r7 = "REPEAT_SINGLE";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x001c;
    L_0x0071:
        r5 = r0;
        goto L_0x001c;
    L_0x0073:
        r7 = "REPEAT_ALL_AND_SHUFFLE";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x001c;
    L_0x007b:
        r5 = r3;
        goto L_0x001c;
    L_0x007d:
        r0 = r1;
        goto L_0x0020;
    L_0x007f:
        r0 = r2;
        goto L_0x0020;
    L_0x0081:
        r0 = r3;
        goto L_0x0020;
    L_0x0083:
        r7 = new com.google.android.gms.cast.MediaQueueItem[r5];
        r3 = r1;
        r1 = r0;
    L_0x0087:
        if (r3 >= r5) goto L_0x00dd;
    L_0x0089:
        r0 = r6.get(r3);
        r0 = (java.lang.Integer) r0;
        r8 = r4.getJSONObject(r3);
        r9 = r0.intValue();
        r9 = r10.c(r9);
        if (r9 == 0) goto L_0x00b8;
    L_0x009d:
        r8 = r9.a(r8);
        r1 = r1 | r8;
        r7[r3] = r9;
        r0 = r0.intValue();
        r0 = r10.e(r0);
        r0 = r0.intValue();
        if (r3 == r0) goto L_0x00eb;
    L_0x00b2:
        r0 = r2;
    L_0x00b3:
        r1 = r3 + 1;
        r3 = r1;
        r1 = r0;
        goto L_0x0087;
    L_0x00b8:
        r0 = r0.intValue();
        r1 = r10.B;
        if (r0 != r1) goto L_0x00d4;
    L_0x00c0:
        r0 = new com.google.android.gms.cast.MediaQueueItem$a;
        r1 = r10.z;
        r0.<init>(r1);
        r0 = r0.b();
        r7[r3] = r0;
        r0 = r7[r3];
        r0.a(r8);
        r0 = r2;
        goto L_0x00b3;
    L_0x00d4:
        r0 = new com.google.android.gms.cast.MediaQueueItem;
        r0.<init>(r8);
        r7[r3] = r0;
        r0 = r2;
        goto L_0x00b3;
    L_0x00dd:
        r0 = r10.x;
        r0 = r0.size();
        if (r0 == r5) goto L_0x00e9;
    L_0x00e5:
        r10.a(r7);
    L_0x00e8:
        return r2;
    L_0x00e9:
        r2 = r1;
        goto L_0x00e5;
    L_0x00eb:
        r0 = r1;
        goto L_0x00b3;
    L_0x00ed:
        r2 = r0;
        goto L_0x00e8;
    L_0x00ef:
        r0 = r1;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.a(org.json.JSONObject):boolean");
    }

    public long b() {
        return this.A;
    }

    public MediaQueueItem b(int i) {
        return d(i);
    }

    public int c() {
        return this.D;
    }

    public MediaQueueItem c(int i) {
        Integer num = (Integer) this.N.get(i);
        return num == null ? null : (MediaQueueItem) this.x.get(num.intValue());
    }

    public int d() {
        return this.E;
    }

    public MediaQueueItem d(int i) {
        return (i < 0 || i >= this.x.size()) ? null : (MediaQueueItem) this.x.get(i);
    }

    public double e() {
        return this.C;
    }

    public Integer e(int i) {
        return (Integer) this.N.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.L == null) != (mediaStatus.L == null) ? false : this.A == mediaStatus.A && this.B == mediaStatus.B && this.C == mediaStatus.C && this.D == mediaStatus.D && this.E == mediaStatus.E && this.F == mediaStatus.F && this.G == mediaStatus.G && this.H == mediaStatus.H && this.J == mediaStatus.J && this.K == mediaStatus.K && this.w == mediaStatus.w && Arrays.equals(this.I, mediaStatus.I) && f.a(Long.valueOf(this.u), Long.valueOf(mediaStatus.u)) && f.a(this.x, mediaStatus.x) && f.a(this.z, mediaStatus.z) && a(mediaStatus) && this.M == mediaStatus.r();
    }

    public MediaInfo f() {
        return this.z;
    }

    public long g() {
        return this.F;
    }

    public double h() {
        return this.G;
    }

    public int hashCode() {
        return c.a(this.z, Long.valueOf(this.A), Integer.valueOf(this.B), Double.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Long.valueOf(this.F), Long.valueOf(this.u), Double.valueOf(this.G), Boolean.valueOf(this.H), Integer.valueOf(Arrays.hashCode(this.I)), Integer.valueOf(this.J), Integer.valueOf(this.K), this.L, Integer.valueOf(this.w), this.x, Boolean.valueOf(this.M));
    }

    public boolean i() {
        return this.H;
    }

    public long[] j() {
        return this.I;
    }

    public JSONObject k() {
        return this.L;
    }

    public int l() {
        return this.B;
    }

    public int m() {
        return this.J;
    }

    public int n() {
        return this.K;
    }

    public int o() {
        return this.w;
    }

    public List<MediaQueueItem> p() {
        return this.x;
    }

    public int q() {
        return this.x.size();
    }

    public boolean r() {
        return this.M;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.v = this.L == null ? null : this.L.toString();
        p.a(this, parcel, i);
    }
}
