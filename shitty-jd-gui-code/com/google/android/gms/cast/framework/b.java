package com.google.android.gms.cast.framework;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.MediaRouteActionProvider;
import android.support.v7.app.MediaRouteButton;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.d;
import java.util.Locale;

public final class b
{
  public static MenuItem a(Context paramContext, Menu paramMenu, int paramInt)
  {
    d.a(paramMenu);
    paramContext = c.a(paramContext);
    paramMenu = paramMenu.findItem(paramInt);
    if (paramMenu == null) {
      throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", new Object[] { Integer.valueOf(paramInt) }));
    }
    MediaRouteActionProvider localMediaRouteActionProvider = (MediaRouteActionProvider)MenuItemCompat.getActionProvider(paramMenu);
    if (localMediaRouteActionProvider == null) {
      throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", new Object[] { Integer.valueOf(paramInt) }));
    }
    localMediaRouteActionProvider.setRouteSelector(paramContext.c());
    return paramMenu;
  }
  
  public static void a(Context paramContext, MediaRouteButton paramMediaRouteButton)
  {
    paramMediaRouteButton.setRouteSelector(c.a(paramContext).c());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */