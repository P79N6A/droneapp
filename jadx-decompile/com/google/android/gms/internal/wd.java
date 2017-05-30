package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.tencent.tauth.AuthActivity;
import java.util.Map;

@aaa
public class wd implements vt {
    private final a a;

    public wd(a aVar) {
        this.a = aVar;
    }

    public static void a(acy com_google_android_gms_internal_acy, a aVar) {
        com_google_android_gms_internal_acy.l().a("/reward", new wd(aVar));
    }

    private void a(Map<String, String> map) {
        RewardItemParcel rewardItemParcel;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str = (String) map.get("type");
            if (!TextUtils.isEmpty(str)) {
                rewardItemParcel = new RewardItemParcel(str, parseInt);
                this.a.b(rewardItemParcel);
            }
        } catch (Throwable e) {
            b.d("Unable to parse reward amount.", e);
        }
        rewardItemParcel = null;
        this.a.b(rewardItemParcel);
    }

    private void b(Map<String, String> map) {
        this.a.J();
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(AuthActivity.ACTION_KEY);
        if ("grant".equals(str)) {
            a(map);
        } else if ("video_start".equals(str)) {
            b(map);
        }
    }
}
