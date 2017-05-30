package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.g;
import com.google.android.gms.common.util.h;
import com.google.firebase.a.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends c {
    public static final String g = f.b("com.google.cast.media");
    private long h;
    private MediaStatus i;
    private final List<q> j = new ArrayList();
    private a k;
    private final q l = new q(this.b, 86400000);
    private final q m = new q(this.b, 86400000);
    private final q n = new q(this.b, 86400000);
    private final q o = new q(this.b, 86400000);
    private final q p = new q(this.b, 86400000);
    private final q q = new q(this.b, 86400000);
    private final q r = new q(this.b, 86400000);
    private final q s = new q(this.b, 86400000);
    private final q t = new q(this.b, 86400000);
    private final q u = new q(this.b, 86400000);
    private final q v = new q(this.b, 86400000);
    private final q w = new q(this.b, 86400000);
    private final q x = new q(this.b, 86400000);
    private final q y = new q(this.b, 86400000);

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public n(String str) {
        super(g, h.d(), "MediaControlChannel", str, 1000);
        this.j.add(this.l);
        this.j.add(this.m);
        this.j.add(this.n);
        this.j.add(this.o);
        this.j.add(this.p);
        this.j.add(this.q);
        this.j.add(this.r);
        this.j.add(this.s);
        this.j.add(this.t);
        this.j.add(this.u);
        this.j.add(this.v);
        this.j.add(this.w);
        this.j.add(this.x);
        this.j.add(this.y);
        m();
    }

    private void a(long j, JSONObject jSONObject) {
        int i = 1;
        boolean a = this.l.a(j);
        int i2 = (!this.p.b() || this.p.a(j)) ? 0 : 1;
        if ((!this.q.b() || this.q.a(j)) && (!this.r.b() || this.r.a(j))) {
            i = 0;
        }
        i2 = i2 != 0 ? 2 : 0;
        if (i != 0) {
            i2 |= 1;
        }
        if (a || this.i == null) {
            this.i = new MediaStatus(jSONObject);
            this.h = this.b.b();
            i2 = 31;
        } else {
            i2 = this.i.a(jSONObject, i2);
        }
        if ((i2 & 1) != 0) {
            this.h = this.b.b();
            i();
        }
        if ((i2 & 2) != 0) {
            this.h = this.b.b();
            i();
        }
        if ((i2 & 4) != 0) {
            j();
        }
        if ((i2 & 8) != 0) {
            k();
        }
        if ((i2 & 16) != 0) {
            l();
        }
        for (q a2 : this.j) {
            a2.a(j, 0);
        }
    }

    private void i() {
        if (this.k != null) {
            this.k.a();
        }
    }

    private void j() {
        if (this.k != null) {
            this.k.b();
        }
    }

    private void k() {
        if (this.k != null) {
            this.k.c();
        }
    }

    private void l() {
        if (this.k != null) {
            this.k.d();
        }
    }

    private void m() {
        this.h = 0;
        this.i = null;
        for (q a : this.j) {
            a.a();
        }
    }

    public long a(p pVar) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.s.a(c, pVar);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "GET_STATUS");
            if (this.i != null) {
                jSONObject.put("mediaSessionId", this.i.b());
            }
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, null);
        return c;
    }

    public long a(p pVar, double d, JSONObject jSONObject) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.q.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", h());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(b.q, d);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Integer num, JSONObject jSONObject) {
        if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long c = c();
            this.w.a(c, pVar);
            a(true);
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", h());
                if (i != 0) {
                    jSONObject2.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("jump", i2);
                }
                if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                        jSONArray.put(i3, mediaQueueItemArr[i3].k());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            jSONObject2.put("repeatMode", "REPEAT_OFF");
                            break;
                        case 1:
                            jSONObject2.put("repeatMode", "REPEAT_ALL");
                            break;
                        case 2:
                            jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                            break;
                        case 3:
                            jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                            break;
                    }
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", f.a(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            a(jSONObject2.toString(), c, null);
            return c;
        }
        throw new IllegalArgumentException("playPosition cannot be negative: " + j);
    }

    public long a(p pVar, long j, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.p.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", h());
            jSONObject2.put("currentTime", f.a(j));
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.l.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.l());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", f.a(j));
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject2.put("activeTrackIds", jSONArray);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, TextTrackStyle textTrackStyle) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.u.a(c, pVar);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.n());
            }
            jSONObject.put("mediaSessionId", h());
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, null);
        return c;
    }

    public long a(p pVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.m.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.r.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", h());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, int[] iArr, int i, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.y.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", h());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, int[] iArr, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.x.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", h());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iArr.length; i++) {
                jSONArray.put(i, iArr[i]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long a(p pVar, long[] jArr) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.t.a(c, pVar);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", h());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, null);
        return c;
    }

    public long a(p pVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, int i3, long j, JSONObject jSONObject) {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        } else if (i2 != 0 && i3 != -1) {
            throw new IllegalArgumentException("can not set both currentItemId and currentItemIndexInItemsToInsert");
        } else if (i3 != -1 && (i3 < 0 || i3 >= mediaQueueItemArr.length)) {
            throw new IllegalArgumentException(String.format("currentItemIndexInItemsToInsert %d out of range [0, %d).", new Object[]{Integer.valueOf(i3), Integer.valueOf(mediaQueueItemArr.length)}));
        } else if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long c = c();
            this.v.a(c, pVar);
            a(true);
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put("type", "QUEUE_INSERT");
                jSONObject2.put("mediaSessionId", h());
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                    jSONArray.put(i4, mediaQueueItemArr[i4].k());
                }
                jSONObject2.put("items", jSONArray);
                if (i != 0) {
                    jSONObject2.put("insertBefore", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("currentItemId", i2);
                }
                if (i3 != -1) {
                    jSONObject2.put("currentItemIndex", i3);
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", f.a(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            a(jSONObject2.toString(), c, null);
            return c;
        } else {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
    }

    public long a(p pVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        } else if (i < 0 || i >= mediaQueueItemArr.length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i);
        } else if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long c = c();
            this.l.a(c, pVar);
            a(true);
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put("type", "QUEUE_LOAD");
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].k());
                }
                jSONObject2.put("items", jSONArray);
                switch (i2) {
                    case 0:
                        jSONObject2.put("repeatMode", "REPEAT_OFF");
                        break;
                    case 1:
                        jSONObject2.put("repeatMode", "REPEAT_ALL");
                        break;
                    case 2:
                        jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    case 3:
                        jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid repeat mode: " + i2);
                }
                jSONObject2.put("startIndex", i);
                if (j != -1) {
                    jSONObject2.put("currentTime", f.a(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            a(jSONObject2.toString(), c, null);
            return c;
        } else {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
    }

    public void a() {
        super.a();
        m();
    }

    public void a(long j, int i) {
        for (q a : this.j) {
            a.a(j, i);
        }
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    protected boolean a(long j) {
        boolean z;
        for (q b : this.j) {
            b.b(j, g.h);
        }
        synchronized (q.a) {
            for (q b2 : this.j) {
                if (b2.b()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public long b(p pVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.o.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public final void b(String str) {
        this.f.b("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray("status");
                if (jSONArray.length() > 0) {
                    a(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.i = null;
                i();
                j();
                k();
                l();
                this.s.a(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.f.d("received unexpected error: Invalid Player State.", new Object[0]);
                r1 = jSONObject.optJSONObject("customData");
                for (q a : this.j) {
                    a.a(optLong, 2100, r1);
                }
            } else if (string.equals("LOAD_FAILED")) {
                this.l.a(optLong, 2100, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.l.a(optLong, g.g, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.f.d("received unexpected error: Invalid Request.", new Object[0]);
                r1 = jSONObject.optJSONObject("customData");
                for (q a2 : this.j) {
                    a2.a(optLong, 2100, r1);
                }
            }
        } catch (JSONException e) {
            this.f.d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public long c(p pVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.n.a(c, pVar);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, null);
        return c;
    }

    public long d() {
        MediaInfo g = g();
        if (g == null || this.h == 0) {
            return 0;
        }
        double e = this.i.e();
        long g2 = this.i.g();
        int c = this.i.c();
        if (e == 0.0d || c != 2) {
            return g2;
        }
        long b = this.b.b() - this.h;
        long j = b < 0 ? 0 : b;
        if (j == 0) {
            return g2;
        }
        b = g.f();
        g2 += (long) (((double) j) * e);
        if (b <= 0 || g2 <= b) {
            b = g2 < 0 ? 0 : g2;
        }
        return b;
    }

    public long e() {
        MediaInfo g = g();
        return g != null ? g.f() : 0;
    }

    public MediaStatus f() {
        return this.i;
    }

    public MediaInfo g() {
        return this.i == null ? null : this.i.f();
    }

    public long h() {
        if (this.i != null) {
            return this.i.b();
        }
        throw new IllegalStateException("No current media session");
    }
}
