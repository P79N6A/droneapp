package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

public abstract interface MenuItemHoverListener
{
  public abstract void onItemHoverEnter(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem);
  
  public abstract void onItemHoverExit(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/MenuItemHoverListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */