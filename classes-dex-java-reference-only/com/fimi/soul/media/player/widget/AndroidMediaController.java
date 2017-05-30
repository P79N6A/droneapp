package com.fimi.soul.media.player.widget;

import android.app.ActionBar;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class AndroidMediaController
  extends FmMediaController
  implements IMediaController
{
  private ActionBar mActionBar;
  private ArrayList<View> mShowOnceArray = new ArrayList();
  
  public AndroidMediaController(Context paramContext)
  {
    super(paramContext);
    initView(paramContext);
  }
  
  public AndroidMediaController(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView(paramContext);
  }
  
  public AndroidMediaController(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    initView(paramContext);
  }
  
  private void initView(Context paramContext) {}
  
  public void hide()
  {
    super.hide();
    if (this.mActionBar != null) {
      this.mActionBar.hide();
    }
    Iterator localIterator = this.mShowOnceArray.iterator();
    while (localIterator.hasNext()) {
      ((View)localIterator.next()).setVisibility(8);
    }
  }
  
  public void setSupportActionBar(@Nullable ActionBar paramActionBar)
  {
    this.mActionBar = paramActionBar;
    if (isShowing())
    {
      paramActionBar.show();
      return;
    }
    paramActionBar.hide();
  }
  
  public void show()
  {
    super.show();
    if (this.mActionBar != null) {
      this.mActionBar.show();
    }
    Iterator localIterator = this.mShowOnceArray.iterator();
    while (localIterator.hasNext()) {
      ((View)localIterator.next()).setVisibility(0);
    }
  }
  
  public void showOnce(@NonNull View paramView)
  {
    this.mShowOnceArray.add(paramView);
    paramView.setVisibility(0);
    show();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/AndroidMediaController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */