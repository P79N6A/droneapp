package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;

@aaa
public class e implements a {
    private final a a;

    public e(a aVar) {
        this.a = aVar;
    }

    public String a() {
        String str = null;
        if (this.a != null) {
            try {
                str = this.a.a();
            } catch (Throwable e) {
                b.d("Could not forward getType to RewardItem", e);
            }
        }
        return str;
    }

    public int b() {
        int i = 0;
        if (this.a != null) {
            try {
                i = this.a.b();
            } catch (Throwable e) {
                b.d("Could not forward getAmount to RewardItem", e);
            }
        }
        return i;
    }
}
