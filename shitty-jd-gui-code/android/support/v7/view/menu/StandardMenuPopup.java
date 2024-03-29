package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.layout;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class StandardMenuPopup
  extends MenuPopup
  implements MenuPresenter, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private final MenuAdapter mAdapter;
  private View mAnchorView;
  private int mContentWidth;
  private final Context mContext;
  private int mDropDownGravity = 0;
  private final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((StandardMenuPopup.this.isShowing()) && (!StandardMenuPopup.this.mPopup.isModal()))
      {
        View localView = StandardMenuPopup.this.mShownAnchorView;
        if ((localView == null) || (!localView.isShown())) {
          StandardMenuPopup.this.dismiss();
        }
      }
      else
      {
        return;
      }
      StandardMenuPopup.this.mPopup.show();
    }
  };
  private boolean mHasContentWidth;
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  private final MenuPopupWindow mPopup;
  private final int mPopupMaxWidth;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private boolean mShowTitle;
  private View mShownAnchorView;
  private ViewTreeObserver mTreeObserver;
  private boolean mWasDismissed;
  
  public StandardMenuPopup(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mMenu = paramMenuBuilder;
    this.mOverflowOnly = paramBoolean;
    this.mAdapter = new MenuAdapter(paramMenuBuilder, LayoutInflater.from(paramContext), this.mOverflowOnly);
    this.mPopupStyleAttr = paramInt1;
    this.mPopupStyleRes = paramInt2;
    Resources localResources = paramContext.getResources();
    this.mPopupMaxWidth = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    this.mAnchorView = paramView;
    this.mPopup = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
    paramMenuBuilder.addMenuPresenter(this, paramContext);
  }
  
  private boolean tryShow()
  {
    if (isShowing()) {
      return true;
    }
    if ((this.mWasDismissed) || (this.mAnchorView == null)) {
      return false;
    }
    this.mShownAnchorView = this.mAnchorView;
    this.mPopup.setOnDismissListener(this);
    this.mPopup.setOnItemClickListener(this);
    this.mPopup.setModal(true);
    Object localObject = this.mShownAnchorView;
    if (this.mTreeObserver == null) {}
    for (int i = 1;; i = 0)
    {
      this.mTreeObserver = ((View)localObject).getViewTreeObserver();
      if (i != 0) {
        this.mTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
      }
      this.mPopup.setAnchorView((View)localObject);
      this.mPopup.setDropDownGravity(this.mDropDownGravity);
      if (!this.mHasContentWidth)
      {
        this.mContentWidth = measureIndividualMenuWidth(this.mAdapter, null, this.mContext, this.mPopupMaxWidth);
        this.mHasContentWidth = true;
      }
      this.mPopup.setContentWidth(this.mContentWidth);
      this.mPopup.setInputMethodMode(2);
      this.mPopup.setEpicenterBounds(getEpicenterBounds());
      this.mPopup.show();
      localObject = this.mPopup.getListView();
      ((ListView)localObject).setOnKeyListener(this);
      if ((this.mShowTitle) && (this.mMenu.getHeaderTitle() != null))
      {
        FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(this.mContext).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)localObject, false);
        TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
        if (localTextView != null) {
          localTextView.setText(this.mMenu.getHeaderTitle());
        }
        localFrameLayout.setEnabled(false);
        ((ListView)localObject).addHeaderView(localFrameLayout, null, false);
      }
      this.mPopup.setAdapter(this.mAdapter);
      this.mPopup.show();
      return true;
    }
  }
  
  public void addMenu(MenuBuilder paramMenuBuilder) {}
  
  public void dismiss()
  {
    if (isShowing()) {
      this.mPopup.dismiss();
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListView getListView()
  {
    return this.mPopup.getListView();
  }
  
  public boolean isShowing()
  {
    return (!this.mWasDismissed) && (this.mPopup.isShowing());
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (paramMenuBuilder != this.mMenu) {}
    do
    {
      return;
      dismiss();
    } while (this.mPresenterCallback == null);
    this.mPresenterCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
  }
  
  public void onDismiss()
  {
    this.mWasDismissed = true;
    this.mMenu.close();
    if (this.mTreeObserver != null)
    {
      if (!this.mTreeObserver.isAlive()) {
        this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
      }
      this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
      this.mTreeObserver = null;
    }
    if (this.mOnDismissListener != null) {
      this.mOnDismissListener.onDismiss();
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    if (paramSubMenuBuilder.hasVisibleItems())
    {
      MenuPopupHelper localMenuPopupHelper = new MenuPopupHelper(this.mContext, paramSubMenuBuilder, this.mShownAnchorView, this.mOverflowOnly, this.mPopupStyleAttr, this.mPopupStyleRes);
      localMenuPopupHelper.setPresenterCallback(this.mPresenterCallback);
      localMenuPopupHelper.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(paramSubMenuBuilder));
      localMenuPopupHelper.setOnDismissListener(this.mOnDismissListener);
      this.mOnDismissListener = null;
      this.mMenu.close(false);
      if (localMenuPopupHelper.tryShow(this.mPopup.getHorizontalOffset(), this.mPopup.getVerticalOffset()))
      {
        if (this.mPresenterCallback != null) {
          this.mPresenterCallback.onOpenSubMenu(paramSubMenuBuilder);
        }
        return true;
      }
    }
    return false;
  }
  
  public void setAnchorView(View paramView)
  {
    this.mAnchorView = paramView;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mAdapter.setForceShowIcon(paramBoolean);
  }
  
  public void setGravity(int paramInt)
  {
    this.mDropDownGravity = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    this.mPopup.setHorizontalOffset(paramInt);
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public void setShowTitle(boolean paramBoolean)
  {
    this.mShowTitle = paramBoolean;
  }
  
  public void setVerticalOffset(int paramInt)
  {
    this.mPopup.setVerticalOffset(paramInt);
  }
  
  public void show()
  {
    if (!tryShow()) {
      throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    this.mHasContentWidth = false;
    if (this.mAdapter != null) {
      this.mAdapter.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/StandardMenuPopup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */