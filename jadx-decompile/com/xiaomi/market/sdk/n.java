package com.xiaomi.market.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;

public class n extends Handler {
    final /* synthetic */ m aR;

    public n(m mVar, Looper looper) {
        this.aR = mVar;
        super(looper);
    }

    private String e(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(b.a(new File(str)), str2)) {
            return null;
        }
        String absolutePath = m.e(this.aR).getAbsolutePath();
        if (m.d(this.aR) == null || TextUtils.isEmpty(m.d(this.aR).sourceDir)) {
            return null;
        }
        Patcher.a(m.d(this.aR).sourceDir, absolutePath, str);
        return absolutePath;
    }

    public void l() {
        post(new o(this));
    }

    public void m() {
        post(new p(this));
    }
}
