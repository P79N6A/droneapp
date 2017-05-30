package android.support.v7.view.menu;

import android.widget.ListView;

public abstract interface ShowableListMenu
{
  public abstract void dismiss();
  
  public abstract ListView getListView();
  
  public abstract boolean isShowing();
  
  public abstract void show();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/ShowableListMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */