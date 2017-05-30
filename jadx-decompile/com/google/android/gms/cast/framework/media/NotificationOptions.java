package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.R;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NotificationOptions extends AbstractSafeParcelable {
    public static final Creator<NotificationOptions> CREATOR = new g();
    public static final long a = 10000;
    public static final long b = 30000;
    private static final List<String> c = Arrays.asList(new String[]{MediaIntentReceiver.a, MediaIntentReceiver.f});
    private static final int[] d = new int[]{0, 1};
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int e;
    private final List<String> f;
    private final int[] g;
    private final long h;
    private final String i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public static final class a {
        private String a;
        private List<String> b = NotificationOptions.c;
        private int[] c = NotificationOptions.d;
        private long d = NotificationOptions.a;

        public a a(long j) {
            d.b(j > 0, "skipStepMs must be positive.");
            this.d = j;
            return this;
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(List<String> list, int[] iArr) {
            if (list == null && iArr != null) {
                throw new IllegalArgumentException("When setting actions to null, you must also set compatActionIndices to null.");
            } else if (list == null || iArr != null) {
                if (list == null || iArr == null) {
                    this.b = NotificationOptions.c;
                    this.c = NotificationOptions.d;
                } else {
                    int size = list.size();
                    if (iArr.length > size) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", new Object[]{Integer.valueOf(iArr.length), Integer.valueOf(size)}));
                    }
                    for (int i : iArr) {
                        if (i < 0 || i >= size) {
                            throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                        }
                    }
                    this.b = new ArrayList(list);
                    this.c = Arrays.copyOf(iArr, iArr.length);
                }
                return this;
            } else {
                throw new IllegalArgumentException("When setting compatActionIndices to null, you must also set actions to null.");
            }
        }

        public NotificationOptions a() {
            return new NotificationOptions(1, this.b, this.c, this.d, this.a, R.drawable.cast_ic_notification_small_icon, R.drawable.cast_ic_notification_stop_live_stream, R.drawable.cast_ic_notification_pause, R.drawable.cast_ic_notification_play, R.drawable.cast_ic_notification_skip_next, R.drawable.cast_ic_notification_skip_prev, R.drawable.cast_ic_notification_forward, R.drawable.cast_ic_notification_forward10, R.drawable.cast_ic_notification_forward30, R.drawable.cast_ic_notification_rewind, R.drawable.cast_ic_notification_rewind10, R.drawable.cast_ic_notification_rewind30, R.drawable.cast_ic_notification_disconnect, R.dimen.cast_notification_image_size, R.string.cast_casting_to_device, R.string.cast_stop_live_stream, R.string.cast_pause, R.string.cast_play, R.string.cast_skip_next, R.string.cast_skip_prev, R.string.cast_forward, R.string.cast_forward_10, R.string.cast_forward_30, R.string.cast_rewind, R.string.cast_rewind_10, R.string.cast_rewind_30, R.string.cast_disconnect);
        }
    }

    public NotificationOptions(int i, List<String> list, int[] iArr, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28) {
        this.e = i;
        if (list != null) {
            this.f = new ArrayList(list);
        } else {
            this.f = null;
        }
        if (iArr != null) {
            this.g = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.g = null;
        }
        this.h = j;
        this.i = str;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = i7;
        this.p = i8;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = i12;
        this.u = i13;
        this.v = i14;
        this.w = i15;
        this.x = i16;
        this.y = i17;
        this.z = i18;
        this.A = i19;
        this.B = i20;
        this.C = i21;
        this.D = i22;
        this.E = i23;
        this.F = i24;
        this.G = i25;
        this.H = i26;
        this.I = i27;
        this.J = i28;
    }

    public int A() {
        return this.E;
    }

    public int B() {
        return this.F;
    }

    public int C() {
        return this.G;
    }

    public int D() {
        return this.H;
    }

    public int E() {
        return this.I;
    }

    public int F() {
        return this.J;
    }

    int a() {
        return this.e;
    }

    public List<String> b() {
        return this.f;
    }

    public int[] c() {
        return Arrays.copyOf(this.g, this.g.length);
    }

    public long d() {
        return this.h;
    }

    public String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationOptions)) {
            return false;
        }
        NotificationOptions notificationOptions = (NotificationOptions) obj;
        return f.a(this.f, notificationOptions.f) && Arrays.equals(this.g, notificationOptions.g) && this.h == notificationOptions.h && f.a(this.i, notificationOptions.i);
    }

    public int f() {
        return this.j;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    public int hashCode() {
        return c.a(this.f, Integer.valueOf(Arrays.hashCode(this.g)), Long.valueOf(this.h), this.i);
    }

    public int i() {
        return this.m;
    }

    public int j() {
        return this.n;
    }

    public int k() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    public int m() {
        return this.q;
    }

    public int n() {
        return this.r;
    }

    public int o() {
        return this.s;
    }

    public int p() {
        return this.t;
    }

    public int q() {
        return this.u;
    }

    public int r() {
        return this.v;
    }

    public int s() {
        return this.w;
    }

    public int t() {
        return this.x;
    }

    public String toString() {
        return String.format(Locale.ROOT, "NotificationOptions(actions=%s, compatActionIndices=%s, skipStepMs=%s, targetActivityClassName=%s)", new Object[]{this.f, Arrays.toString(this.g), Long.valueOf(this.h), this.i});
    }

    public int u() {
        return this.y;
    }

    public int v() {
        return this.z;
    }

    public int w() {
        return this.A;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }

    public int x() {
        return this.B;
    }

    public int y() {
        return this.C;
    }

    public int z() {
        return this.D;
    }
}
