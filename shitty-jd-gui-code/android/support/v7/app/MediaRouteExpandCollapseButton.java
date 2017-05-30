package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.mediarouter.R.drawable;
import android.support.v7.mediarouter.R.string;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

class MediaRouteExpandCollapseButton
  extends ImageButton
{
  private final AnimationDrawable mCollapseAnimationDrawable;
  private final String mCollapseGroupDescription;
  private final AnimationDrawable mExpandAnimationDrawable;
  private final String mExpandGroupDescription;
  private boolean mIsGroupExpanded;
  private View.OnClickListener mListener;
  
  public MediaRouteExpandCollapseButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mExpandAnimationDrawable = ((AnimationDrawable)ContextCompat.getDrawable(paramContext, R.drawable.ic_expand));
    this.mCollapseAnimationDrawable = ((AnimationDrawable)ContextCompat.getDrawable(paramContext, R.drawable.ic_collapse));
    paramAttributeSet = new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(paramContext, paramInt), PorterDuff.Mode.SRC_IN);
    this.mExpandAnimationDrawable.setColorFilter(paramAttributeSet);
    this.mCollapseAnimationDrawable.setColorFilter(paramAttributeSet);
    this.mExpandGroupDescription = paramContext.getString(R.string.mr_controller_expand_group);
    this.mCollapseGroupDescription = paramContext.getString(R.string.mr_controller_collapse_group);
    setImageDrawable(this.mExpandAnimationDrawable.getFrame(0));
    setContentDescription(this.mExpandGroupDescription);
    super.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MediaRouteExpandCollapseButton localMediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
        boolean bool;
        if (!MediaRouteExpandCollapseButton.this.mIsGroupExpanded)
        {
          bool = true;
          MediaRouteExpandCollapseButton.access$002(localMediaRouteExpandCollapseButton, bool);
          if (!MediaRouteExpandCollapseButton.this.mIsGroupExpanded) {
            break label100;
          }
          MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.mExpandAnimationDrawable);
          MediaRouteExpandCollapseButton.this.mExpandAnimationDrawable.start();
          MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.mCollapseGroupDescription);
        }
        for (;;)
        {
          if (MediaRouteExpandCollapseButton.this.mListener != null) {
            MediaRouteExpandCollapseButton.this.mListener.onClick(paramAnonymousView);
          }
          return;
          bool = false;
          break;
          label100:
          MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.mCollapseAnimationDrawable);
          MediaRouteExpandCollapseButton.this.mCollapseAnimationDrawable.start();
          MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.mExpandGroupDescription);
        }
      }
    });
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mListener = paramOnClickListener;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteExpandCollapseButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */