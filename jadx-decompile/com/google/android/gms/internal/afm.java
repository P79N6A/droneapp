package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import com.google.android.gms.internal.afh.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class afm extends a {
    private final MediaRouter a;
    private final Map<MediaRouteSelector, Set<Callback>> b = new HashMap();

    public afm(MediaRouter mediaRouter) {
        this.a = mediaRouter;
    }

    public int a() {
        return 9683208;
    }

    public void a(Bundle bundle) {
        for (Callback removeCallback : (Set) this.b.get(MediaRouteSelector.fromBundle(bundle))) {
            this.a.removeCallback(removeCallback);
        }
    }

    public void a(Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        for (Callback addCallback : (Set) this.b.get(fromBundle)) {
            this.a.addCallback(fromBundle, addCallback, i);
        }
    }

    public void a(Bundle bundle, afi com_google_android_gms_internal_afi) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (!this.b.containsKey(fromBundle)) {
            this.b.put(fromBundle, new HashSet());
        }
        ((Set) this.b.get(fromBundle)).add(new afl(com_google_android_gms_internal_afi));
    }

    public void a(MediaSessionCompat mediaSessionCompat) {
        this.a.setMediaSessionCompat(mediaSessionCompat);
    }

    public void a(String str) {
        for (RouteInfo routeInfo : this.a.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                this.a.selectRoute(routeInfo);
                return;
            }
        }
    }

    public Bundle b(String str) {
        for (RouteInfo routeInfo : this.a.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                return routeInfo.getExtras();
            }
        }
        return null;
    }

    public void b() {
        this.a.selectRoute(this.a.getDefaultRoute());
    }

    public boolean b(Bundle bundle, int i) {
        return this.a.isRouteAvailable(MediaRouteSelector.fromBundle(bundle), i);
    }

    public boolean c() {
        return this.a.getSelectedRoute().getId().equals(this.a.getDefaultRoute().getId());
    }

    public String d() {
        return this.a.getSelectedRoute().getId();
    }
}
