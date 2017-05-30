package com.google.android.gms.internal;

import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import java.util.Map;

class adc$1 implements vt {
    final /* synthetic */ adc a;

    adc$1(adc com_google_android_gms_internal_adc) {
        this.a = com_google_android_gms_internal_adc;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        if (map != null) {
            String str = (String) map.get(FimiMediaMeta.IJKM_KEY_HEIGHT);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (adc.a(this.a)) {
                        if (adc.b(this.a) != parseInt) {
                            adc.a(this.a, parseInt);
                            this.a.requestLayout();
                        }
                    }
                } catch (Throwable e) {
                    abr.d("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
