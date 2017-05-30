package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.ProviderInfo;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.styleable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Toast;

public class MediaRouteButton
  extends View
{
  private static final int[] CHECKABLE_STATE_SET = { 16842911 };
  private static final int[] CHECKED_STATE_SET = { 16842912 };
  private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
  private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
  private static final String TAG = "MediaRouteButton";
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback;
  private boolean mCheatSheetEnabled;
  private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
  private boolean mIsConnecting;
  private int mMinHeight;
  private int mMinWidth;
  private boolean mRemoteActive;
  private Drawable mRemoteIndicator;
  private final MediaRouter mRouter;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  
  public MediaRouteButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.mediaRouteButtonStyle);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(MediaRouterThemeHelper.createThemedContext(paramContext, paramInt), paramAttributeSet, paramInt);
    paramContext = getContext();
    this.mRouter = MediaRouter.getInstance(paramContext);
    this.mCallback = new MediaRouterCallback(null);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MediaRouteButton, paramInt, 0);
    setRemoteIndicatorDrawable(paramContext.getDrawable(R.styleable.MediaRouteButton_externalRouteEnabledDrawable));
    this.mMinWidth = paramContext.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minWidth, 0);
    this.mMinHeight = paramContext.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minHeight, 0);
    paramContext.recycle();
    setClickable(true);
    setLongClickable(true);
  }
  
  private Activity getActivity()
  {
    for (Context localContext = getContext(); (localContext instanceof ContextWrapper); localContext = ((ContextWrapper)localContext).getBaseContext()) {
      if ((localContext instanceof Activity)) {
        return (Activity)localContext;
      }
    }
    return null;
  }
  
  private FragmentManager getFragmentManager()
  {
    Activity localActivity = getActivity();
    if ((localActivity instanceof FragmentActivity)) {
      return ((FragmentActivity)localActivity).getSupportFragmentManager();
    }
    return null;
  }
  
  private void refreshRoute()
  {
    int i = 0;
    int j = 1;
    Object localObject;
    boolean bool1;
    boolean bool2;
    if (this.mAttachedToWindow)
    {
      localObject = this.mRouter.getSelectedRoute();
      if ((((MediaRouter.RouteInfo)localObject).isDefaultOrBluetooth()) || (!((MediaRouter.RouteInfo)localObject).matchesSelector(this.mSelector))) {
        break label136;
      }
      bool1 = true;
      if ((!bool1) || (!((MediaRouter.RouteInfo)localObject).isConnecting())) {
        break label141;
      }
      bool2 = true;
      label57:
      if (this.mRemoteActive != bool1)
      {
        this.mRemoteActive = bool1;
        i = 1;
      }
      if (this.mIsConnecting == bool2) {
        break label147;
      }
      this.mIsConnecting = bool2;
      i = j;
    }
    label136:
    label141:
    label147:
    for (;;)
    {
      if (i != 0)
      {
        refreshDrawableState();
        if ((this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable))
        {
          localObject = (AnimationDrawable)this.mRemoteIndicator.getCurrent();
          if (!((AnimationDrawable)localObject).isRunning()) {
            ((AnimationDrawable)localObject).start();
          }
        }
      }
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label57;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.mRemoteIndicator != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.mRemoteIndicator.setState(arrayOfInt);
      invalidate();
    }
  }
  
  @NonNull
  public MediaRouteDialogFactory getDialogFactory()
  {
    return this.mDialogFactory;
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return this.mSelector;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (getBackground() != null) {
      DrawableCompat.jumpToCurrentState(getBackground());
    }
    if (this.mRemoteIndicator != null) {
      DrawableCompat.jumpToCurrentState(this.mRemoteIndicator);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mAttachedToWindow = true;
    if (!this.mSelector.isEmpty()) {
      this.mRouter.addCallback(this.mSelector, this.mCallback);
    }
    refreshRoute();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.mIsConnecting) {
      mergeDrawableStates(arrayOfInt, CHECKABLE_STATE_SET);
    }
    while (!this.mRemoteActive) {
      return arrayOfInt;
    }
    mergeDrawableStates(arrayOfInt, CHECKED_STATE_SET);
    return arrayOfInt;
  }
  
  public void onDetachedFromWindow()
  {
    this.mAttachedToWindow = false;
    if (!this.mSelector.isEmpty()) {
      this.mRouter.removeCallback(this.mCallback);
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.mRemoteIndicator != null)
    {
      int i1 = getPaddingLeft();
      int i2 = getWidth();
      int i3 = getPaddingRight();
      int k = getPaddingTop();
      int m = getHeight();
      int n = getPaddingBottom();
      int i = this.mRemoteIndicator.getIntrinsicWidth();
      int j = this.mRemoteIndicator.getIntrinsicHeight();
      i1 += (i2 - i3 - i1 - i) / 2;
      k = (m - n - k - j) / 2 + k;
      this.mRemoteIndicator.setBounds(i1, k, i1 + i, k + j);
      this.mRemoteIndicator.draw(paramCanvas);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 0;
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt2);
    int n = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = this.mMinWidth;
    if (this.mRemoteIndicator != null)
    {
      paramInt1 = this.mRemoteIndicator.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight();
      paramInt2 = Math.max(paramInt2, paramInt1);
      int i1 = this.mMinHeight;
      paramInt1 = k;
      if (this.mRemoteIndicator != null) {
        paramInt1 = this.mRemoteIndicator.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
      }
      k = Math.max(i1, paramInt1);
      switch (n)
      {
      default: 
        paramInt1 = paramInt2;
        switch (m)
        {
        default: 
          label134:
          paramInt2 = k;
        }
        break;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = 0;
      break;
      paramInt1 = j;
      break label134;
      paramInt1 = Math.min(j, paramInt2);
      break label134;
      paramInt2 = i;
      continue;
      paramInt2 = Math.min(i, k);
    }
  }
  
  public boolean performClick()
  {
    boolean bool1 = false;
    boolean bool2 = super.performClick();
    if (!bool2) {
      playSoundEffect(0);
    }
    if ((showDialog()) || (bool2)) {
      bool1 = true;
    }
    return bool1;
  }
  
  public boolean performLongClick()
  {
    if (super.performLongClick()) {
      return true;
    }
    if (!this.mCheatSheetEnabled) {
      return false;
    }
    Object localObject = getContentDescription();
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i = getWidth();
    int j = getHeight();
    int k = arrayOfInt[1];
    int m = j / 2;
    int n = localContext.getResources().getDisplayMetrics().widthPixels;
    localObject = Toast.makeText(localContext, (CharSequence)localObject, 0);
    if (k + m < localRect.height()) {
      ((Toast)localObject).setGravity(8388661, n - arrayOfInt[0] - i / 2, j);
    }
    for (;;)
    {
      ((Toast)localObject).show();
      performHapticFeedback(0);
      return true;
      ((Toast)localObject).setGravity(81, 0, j);
    }
  }
  
  void setCheatSheetEnabled(boolean paramBoolean)
  {
    this.mCheatSheetEnabled = paramBoolean;
  }
  
  public void setDialogFactory(@NonNull MediaRouteDialogFactory paramMediaRouteDialogFactory)
  {
    if (paramMediaRouteDialogFactory == null) {
      throw new IllegalArgumentException("factory must not be null");
    }
    this.mDialogFactory = paramMediaRouteDialogFactory;
  }
  
  public void setRemoteIndicatorDrawable(Drawable paramDrawable)
  {
    if (this.mRemoteIndicator != null)
    {
      this.mRemoteIndicator.setCallback(null);
      unscheduleDrawable(this.mRemoteIndicator);
    }
    this.mRemoteIndicator = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable.setState(getDrawableState());
      if (getVisibility() != 0) {
        break label67;
      }
    }
    label67:
    for (boolean bool = true;; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      refreshDrawableState();
      return;
    }
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (!this.mSelector.equals(paramMediaRouteSelector))
    {
      if (this.mAttachedToWindow)
      {
        if (!this.mSelector.isEmpty()) {
          this.mRouter.removeCallback(this.mCallback);
        }
        if (!paramMediaRouteSelector.isEmpty()) {
          this.mRouter.addCallback(paramMediaRouteSelector, this.mCallback);
        }
      }
      this.mSelector = paramMediaRouteSelector;
      refreshRoute();
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    Drawable localDrawable;
    if (this.mRemoteIndicator != null)
    {
      localDrawable = this.mRemoteIndicator;
      if (getVisibility() != 0) {
        break label34;
      }
    }
    label34:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      return;
    }
  }
  
  public boolean showDialog()
  {
    if (!this.mAttachedToWindow) {
      return false;
    }
    FragmentManager localFragmentManager = getFragmentManager();
    if (localFragmentManager == null) {
      throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }
    Object localObject = this.mRouter.getSelectedRoute();
    if ((((MediaRouter.RouteInfo)localObject).isDefaultOrBluetooth()) || (!((MediaRouter.RouteInfo)localObject).matchesSelector(this.mSelector)))
    {
      if (localFragmentManager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
      {
        Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
        return false;
      }
      localObject = this.mDialogFactory.onCreateChooserDialogFragment();
      ((MediaRouteChooserDialogFragment)localObject).setRouteSelector(this.mSelector);
      ((MediaRouteChooserDialogFragment)localObject).show(localFragmentManager, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
    }
    for (;;)
    {
      return true;
      if (localFragmentManager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
      {
        Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
        return false;
      }
      this.mDialogFactory.onCreateControllerDialogFragment().show(localFragmentManager, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.mRemoteIndicator);
  }
  
  private final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    private MediaRouterCallback() {}
    
    public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteButton.this.refreshRoute();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */