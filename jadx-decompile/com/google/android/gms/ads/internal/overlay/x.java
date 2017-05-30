package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acb;
import com.google.android.gms.internal.acb.a;
import com.google.android.gms.internal.acb.b;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uj;
import com.google.android.gms.internal.ul;
import com.google.android.gms.internal.un;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.TimeUnit;

@aaa
public class x {
    private final Context a;
    private final String b;
    private final VersionInfoParcel c;
    @Nullable
    private final ul d;
    @Nullable
    private final un e;
    private final acb f = new b().a("min_1", Double.MIN_VALUE, 1.0d).a("1_5", 1.0d, 5.0d).a("5_10", 5.0d, 10.0d).a("10_20", 10.0d, 20.0d).a("20_30", 20.0d, 30.0d).a("30_max", 30.0d, Double.MAX_VALUE).a();
    private final long[] g;
    private final String[] h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private i n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public x(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable un unVar, @Nullable ul ulVar) {
        this.a = context;
        this.c = versionInfoParcel;
        this.b = str;
        this.e = unVar;
        this.d = ulVar;
        String str2 = (String) uf.z.c();
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, Constants.ACCEPT_TIME_SEPARATOR_SP);
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    private void c(i iVar) {
        long longValue = ((Long) uf.A.c()).longValue();
        long currentPosition = (long) iVar.getCurrentPosition();
        int i = 0;
        while (i < this.h.length) {
            if (this.h[i] == null && longValue > Math.abs(currentPosition - this.g[i])) {
                this.h[i] = a((TextureView) iVar);
                return;
            }
            i++;
        }
    }

    private void e() {
        if (this.k && !this.l) {
            uj.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long c = u.k().c();
        if (this.m && this.p && this.q != -1) {
            this.f.a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.q)));
        }
        this.p = this.m;
        this.q = c;
    }

    @TargetApi(14)
    String a(TextureView textureView) {
        Bitmap bitmap = textureView.getBitmap(8, 8);
        long j = 0;
        long j2 = 63;
        int i = 0;
        while (i < 8) {
            long j3 = j;
            j = j2;
            for (int i2 = 0; i2 < 8; i2++) {
                int pixel = bitmap.getPixel(i2, i);
                j3 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) j);
                j--;
            }
            i++;
            j2 = j;
            j = j3;
        }
        return String.format("%016X", new Object[]{Long.valueOf(j)});
    }

    public void a() {
        if (this.i && !this.j) {
            uj.a(this.e, this.d, "vfr2");
            this.j = true;
        }
    }

    public void a(i iVar) {
        uj.a(this.e, this.d, "vpc2");
        this.i = true;
        if (this.e != null) {
            this.e.a("vpn", iVar.a());
        }
        this.n = iVar;
    }

    public void b() {
        if (((Boolean) uf.y.c()).booleanValue() && !this.o) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString(SocialConstants.TYPE_REQUEST, this.b);
            bundle.putString("player", this.n.a());
            for (a aVar : this.f.a()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(aVar.a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(aVar.e));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(aVar.a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(aVar.d));
            }
            for (int i = 0; i < this.g.length; i++) {
                valueOf2 = this.h[i];
                if (valueOf2 != null) {
                    String valueOf3 = String.valueOf("fh_");
                    valueOf = String.valueOf(Long.valueOf(this.g[i]));
                    bundle.putString(new StringBuilder((String.valueOf(valueOf3).length() + 0) + String.valueOf(valueOf).length()).append(valueOf3).append(valueOf).toString(), valueOf2);
                }
            }
            u.e().a(this.a, this.c.b, "gmob-apps", bundle, true);
            this.o = true;
        }
    }

    public void b(i iVar) {
        e();
        c(iVar);
    }

    public void c() {
        this.m = true;
        if (this.j && !this.k) {
            uj.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }

    public void d() {
        this.m = false;
    }
}
