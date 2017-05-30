package com.google.android.gms.cast.framework;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.MediaRouteActionProvider;
import android.support.v7.app.MediaRouteButton;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.d;
import java.util.Locale;

public final class b {
    private b() {
    }

    public static MenuItem a(Context context, Menu menu, int i) {
        d.a((Object) menu);
        c a = c.a(context);
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", new Object[]{Integer.valueOf(i)}));
        }
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) MenuItemCompat.getActionProvider(findItem);
        if (mediaRouteActionProvider == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", new Object[]{Integer.valueOf(i)}));
        }
        mediaRouteActionProvider.setRouteSelector(a.c());
        return findItem;
    }

    public static void a(Context context, MediaRouteButton mediaRouteButton) {
        mediaRouteButton.setRouteSelector(c.a(context).c());
    }
}
