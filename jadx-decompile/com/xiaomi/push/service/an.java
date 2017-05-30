package com.xiaomi.push.service;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.network.Fallback;
import com.xiaomi.network.HostFilter;
import com.xiaomi.network.HostManager;
import com.xiaomi.network.HostManager.HostManagerFactory;
import com.xiaomi.network.HostManager.HttpGet;
import com.xiaomi.push.protobuf.b.b;
import com.xiaomi.push.service.at.a;
import java.util.ArrayList;
import java.util.Iterator;

public class an extends a implements HostManagerFactory {
    private XMPushService a;
    private long b;

    an(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        a anVar = new an(xMPushService);
        at.a().a(anVar);
        synchronized (HostManager.class) {
            HostManager.setHostManagerFactory(anVar);
            HostManager.init(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    public HostManager a(Context context, HostFilter hostFilter, HttpGet httpGet, String str) {
        return new b(context, hostFilter, httpGet, str);
    }

    public void a(com.xiaomi.push.protobuf.a.a aVar) {
    }

    public void a(b bVar) {
        if (bVar.e() && bVar.d() && System.currentTimeMillis() - this.b > Util.MILLSECONDS_OF_HOUR) {
            com.xiaomi.channel.commonutils.logger.b.a("fetch bucket :" + bVar.d());
            this.b = System.currentTimeMillis();
            HostManager instance = HostManager.getInstance();
            instance.clear();
            instance.refreshFallbacks();
            com.xiaomi.smack.a h = this.a.h();
            if (h != null) {
                Fallback fallbacksByHost = instance.getFallbacksByHost(h.c().e());
                if (fallbacksByHost != null) {
                    boolean z;
                    ArrayList d = fallbacksByHost.d();
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals(h.d())) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z && !d.isEmpty()) {
                        com.xiaomi.channel.commonutils.logger.b.a("bucket changed, force reconnect");
                        this.a.a(0, null);
                        this.a.a(false);
                    }
                }
            }
        }
    }
}
