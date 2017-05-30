package com.xiaomi.push.service;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.market.sdk.j;
import com.xiaomi.network.HostManager.HttpGet;
import com.xiaomi.smack.util.d;
import com.xiaomi.stats.h;
import java.net.URL;

class an$a implements HttpGet {
    an$a() {
    }

    public String a(String str) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("sdkver", String.valueOf(26));
        buildUpon.appendQueryParameter("osver", String.valueOf(VERSION.SDK_INT));
        buildUpon.appendQueryParameter(j.ac, d.a(Build.MODEL + ":" + VERSION.INCREMENTAL));
        buildUpon.appendQueryParameter("mi", String.valueOf(com.xiaomi.channel.commonutils.android.j.c()));
        String builder = buildUpon.toString();
        b.c("fetch bucket from : " + builder);
        URL url = new URL(builder);
        int port = url.getPort() == -1 ? 80 : url.getPort();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String a = com.xiaomi.channel.commonutils.network.d.a(com.xiaomi.channel.commonutils.android.j.a(), url);
            h.a(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - currentTimeMillis), null);
            return a;
        } catch (Exception e) {
            h.a(url.getHost() + ":" + port, -1, e);
            throw e;
        }
    }
}
