package com.google.android.gms.internal;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.d;

public class afl extends Callback {
    private static final m a = new m("MediaRouterCallback");
    private final afi b;

    public afl(afi com_google_android_gms_internal_afi) {
        this.b = (afi) d.a(com_google_android_gms_internal_afi);
    }

    public void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
        try {
            this.b.a(routeInfo.getId(), routeInfo.getExtras());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", new Object[]{"onRouteAdded", afi.class.getSimpleName()});
        }
    }

    public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        try {
            this.b.b(routeInfo.getId(), routeInfo.getExtras());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", new Object[]{"onRouteChanged", afi.class.getSimpleName()});
        }
    }

    public void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
        try {
            this.b.c(routeInfo.getId(), routeInfo.getExtras());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", new Object[]{"onRouteRemoved", afi.class.getSimpleName()});
        }
    }

    public void onRouteSelected(MediaRouter mediaRouter, RouteInfo routeInfo) {
        try {
            this.b.d(routeInfo.getId(), routeInfo.getExtras());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", new Object[]{"onRouteSelected", afi.class.getSimpleName()});
        }
    }

    public void onRouteUnselected(MediaRouter mediaRouter, RouteInfo routeInfo) {
        try {
            this.b.e(routeInfo.getId(), routeInfo.getExtras());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", new Object[]{"onRouteUnselected", afi.class.getSimpleName()});
        }
    }
}
