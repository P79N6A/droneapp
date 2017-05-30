package android.support.v7.app;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaControllerCompat.TransportControls;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteGroup;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.dimen;
import android.support.v7.mediarouter.R.id;
import android.support.v7.mediarouter.R.integer;
import android.support.v7.mediarouter.R.interpolator;
import android.support.v7.mediarouter.R.layout;
import android.support.v7.mediarouter.R.string;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MediaRouteControllerDialog
  extends AlertDialog
{
  private static final int BUTTON_DISCONNECT_RES_ID = 16908314;
  private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
  private static final int BUTTON_STOP_RES_ID = 16908313;
  private static final int CONNECTION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(30L);
  private static final boolean DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
  private static final String TAG = "MediaRouteCtrlDialog";
  private static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
  private Interpolator mAccelerateDecelerateInterpolator;
  private final AccessibilityManager mAccessibilityManager;
  private Bitmap mArtIconBitmap;
  private Uri mArtIconUri;
  private ImageView mArtView;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback = new MediaRouterCallback(null);
  private ImageButton mCloseButton;
  private Context mContext = getContext();
  private MediaControllerCallback mControllerCallback = new MediaControllerCallback(null);
  private boolean mCreated;
  private FrameLayout mCustomControlLayout;
  private View mCustomControlView;
  private FrameLayout mDefaultControlLayout;
  private MediaDescriptionCompat mDescription;
  private LinearLayout mDialogAreaLayout;
  private int mDialogContentWidth;
  private Button mDisconnectButton;
  private View mDividerView;
  private FrameLayout mExpandableAreaLayout;
  private Interpolator mFastOutSlowInInterpolator;
  private FetchArtTask mFetchArtTask;
  private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
  private int mGroupListAnimationDurationMs;
  private Runnable mGroupListFadeInAnimation = new Runnable()
  {
    public void run()
    {
      MediaRouteControllerDialog.this.startGroupListFadeInAnimation();
    }
  };
  private int mGroupListFadeInDurationMs;
  private int mGroupListFadeOutDurationMs;
  private List<MediaRouter.RouteInfo> mGroupMemberRoutes;
  private Set<MediaRouter.RouteInfo> mGroupMemberRoutesAdded;
  private Set<MediaRouter.RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
  private Set<MediaRouter.RouteInfo> mGroupMemberRoutesRemoved;
  private Interpolator mInterpolator;
  private boolean mIsGroupExpanded;
  private boolean mIsGroupListAnimating;
  private boolean mIsGroupListAnimationPending;
  private Interpolator mLinearOutSlowInInterpolator;
  private MediaControllerCompat mMediaController;
  private LinearLayout mMediaMainControlLayout;
  private ImageButton mPlayPauseButton;
  private RelativeLayout mPlaybackControlLayout;
  private final MediaRouter.RouteInfo mRoute = this.mRouter.getSelectedRoute();
  private MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
  private TextView mRouteNameTextView;
  private final MediaRouter mRouter = MediaRouter.getInstance(this.mContext);
  private PlaybackStateCompat mState;
  private Button mStopCastingButton;
  private TextView mSubtitleView;
  private TextView mTitleView;
  private VolumeChangeListener mVolumeChangeListener;
  private boolean mVolumeControlEnabled = true;
  private LinearLayout mVolumeControlLayout;
  private VolumeGroupAdapter mVolumeGroupAdapter;
  private OverlayListView mVolumeGroupList;
  private int mVolumeGroupListItemHeight;
  private int mVolumeGroupListItemIconSize;
  private int mVolumeGroupListMaxHeight;
  private final int mVolumeGroupListPaddingTop;
  private SeekBar mVolumeSlider;
  private Map<MediaRouter.RouteInfo, SeekBar> mVolumeSliderMap;
  
  public MediaRouteControllerDialog(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteControllerDialog(Context paramContext, int paramInt)
  {
    super(MediaRouterThemeHelper.createThemedContext(paramContext, paramInt), paramInt);
    setMediaSession(this.mRouter.getMediaSessionToken());
    this.mVolumeGroupListPaddingTop = this.mContext.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
    this.mAccessibilityManager = ((AccessibilityManager)this.mContext.getSystemService("accessibility"));
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(paramContext, R.interpolator.mr_linear_out_slow_in);
      this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(paramContext, R.interpolator.mr_fast_out_slow_in);
    }
    this.mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
  }
  
  private void animateGroupListItems(final Map<MediaRouter.RouteInfo, Rect> paramMap, final Map<MediaRouter.RouteInfo, BitmapDrawable> paramMap1)
  {
    this.mVolumeGroupList.setEnabled(false);
    this.mVolumeGroupList.requestLayout();
    this.mIsGroupListAnimating = true;
    this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MediaRouteControllerDialog.this.animateGroupListItemsInternal(paramMap, paramMap1);
      }
    });
  }
  
  private void animateGroupListItemsInternal(Map<MediaRouter.RouteInfo, Rect> paramMap, Map<MediaRouter.RouteInfo, BitmapDrawable> paramMap1)
  {
    if ((this.mGroupMemberRoutesAdded == null) || (this.mGroupMemberRoutesRemoved == null)) {
      return;
    }
    int i1 = this.mGroupMemberRoutesAdded.size() - this.mGroupMemberRoutesRemoved.size();
    Object localObject1 = new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation) {}
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation)
      {
        MediaRouteControllerDialog.this.mVolumeGroupList.startAnimationAll();
        MediaRouteControllerDialog.this.mVolumeGroupList.postDelayed(MediaRouteControllerDialog.this.mGroupListFadeInAnimation, MediaRouteControllerDialog.this.mGroupListAnimationDurationMs);
      }
    };
    int i2 = this.mVolumeGroupList.getFirstVisiblePosition();
    int k = 0;
    int i = 0;
    label60:
    final Object localObject2;
    Object localObject3;
    Object localObject4;
    int n;
    int j;
    if (k < this.mVolumeGroupList.getChildCount())
    {
      localObject2 = this.mVolumeGroupList.getChildAt(k);
      localObject3 = (MediaRouter.RouteInfo)this.mVolumeGroupAdapter.getItem(i2 + k);
      localObject4 = (Rect)paramMap.get(localObject3);
      n = ((View)localObject2).getTop();
      if (localObject4 != null)
      {
        j = ((Rect)localObject4).top;
        label132:
        localObject4 = new AnimationSet(true);
        int m = j;
        if (this.mGroupMemberRoutesAdded != null)
        {
          m = j;
          if (this.mGroupMemberRoutesAdded.contains(localObject3))
          {
            localObject5 = new AlphaAnimation(0.0F, 0.0F);
            ((Animation)localObject5).setDuration(this.mGroupListFadeInDurationMs);
            ((AnimationSet)localObject4).addAnimation((Animation)localObject5);
            m = n;
          }
        }
        Object localObject5 = new TranslateAnimation(0.0F, 0.0F, m - n, 0.0F);
        ((Animation)localObject5).setDuration(this.mGroupListAnimationDurationMs);
        ((AnimationSet)localObject4).addAnimation((Animation)localObject5);
        ((AnimationSet)localObject4).setFillAfter(true);
        ((AnimationSet)localObject4).setFillEnabled(true);
        ((AnimationSet)localObject4).setInterpolator(this.mInterpolator);
        if (i != 0) {
          break label516;
        }
        i = 1;
        ((AnimationSet)localObject4).setAnimationListener((Animation.AnimationListener)localObject1);
      }
    }
    label339:
    label450:
    label516:
    for (;;)
    {
      ((View)localObject2).clearAnimation();
      ((View)localObject2).startAnimation((Animation)localObject4);
      paramMap.remove(localObject3);
      paramMap1.remove(localObject3);
      k += 1;
      break label60;
      j = this.mVolumeGroupListItemHeight * i1 + n;
      break label132;
      localObject1 = paramMap1.entrySet().iterator();
      if (((Iterator)localObject1).hasNext())
      {
        paramMap1 = (Map.Entry)((Iterator)localObject1).next();
        localObject2 = (MediaRouter.RouteInfo)paramMap1.getKey();
        paramMap1 = (BitmapDrawable)paramMap1.getValue();
        localObject3 = (Rect)paramMap.get(localObject2);
        if (!this.mGroupMemberRoutesRemoved.contains(localObject2)) {
          break label450;
        }
        paramMap1 = new OverlayListView.OverlayObject(paramMap1, (Rect)localObject3).setAlphaAnimation(1.0F, 0.0F).setDuration(this.mGroupListFadeOutDurationMs).setInterpolator(this.mInterpolator);
      }
      for (;;)
      {
        this.mVolumeGroupList.addOverlayObject(paramMap1);
        break label339;
        break;
        i = this.mVolumeGroupListItemHeight;
        paramMap1 = new OverlayListView.OverlayObject(paramMap1, (Rect)localObject3).setTranslateYAnimation(i * i1).setDuration(this.mGroupListAnimationDurationMs).setInterpolator(this.mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener()
        {
          public void onAnimationEnd()
          {
            MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.remove(localObject2);
            MediaRouteControllerDialog.this.mVolumeGroupAdapter.notifyDataSetChanged();
          }
        });
        this.mGroupMemberRoutesAnimatingWithBitmap.add(localObject2);
      }
    }
  }
  
  private void animateLayoutHeight(final View paramView, final int paramInt)
  {
    Animation local7 = new Animation()
    {
      protected void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        int i = this.val$startValue;
        int j = (int)((this.val$startValue - paramInt) * paramAnonymousFloat);
        MediaRouteControllerDialog.setLayoutHeight(paramView, i - j);
      }
    };
    local7.setDuration(this.mGroupListAnimationDurationMs);
    if (Build.VERSION.SDK_INT >= 21) {
      local7.setInterpolator(this.mInterpolator);
    }
    paramView.startAnimation(local7);
  }
  
  private boolean canShowPlaybackControlLayout()
  {
    return (this.mCustomControlView == null) && ((this.mDescription != null) || (this.mState != null));
  }
  
  private void fadeInAddedRoutes()
  {
    Animation.AnimationListener local12 = new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        MediaRouteControllerDialog.this.finishAnimation(true);
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    };
    int m = this.mVolumeGroupList.getFirstVisiblePosition();
    int k = 0;
    int j;
    for (int i = 0; k < this.mVolumeGroupList.getChildCount(); i = j)
    {
      View localView = this.mVolumeGroupList.getChildAt(k);
      Object localObject = (MediaRouter.RouteInfo)this.mVolumeGroupAdapter.getItem(m + k);
      j = i;
      if (this.mGroupMemberRoutesAdded.contains(localObject))
      {
        localObject = new AlphaAnimation(0.0F, 1.0F);
        ((Animation)localObject).setDuration(this.mGroupListFadeInDurationMs);
        ((Animation)localObject).setFillEnabled(true);
        ((Animation)localObject).setFillAfter(true);
        j = i;
        if (i == 0)
        {
          ((Animation)localObject).setAnimationListener(local12);
          j = 1;
        }
        localView.clearAnimation();
        localView.startAnimation((Animation)localObject);
      }
      k += 1;
    }
  }
  
  private void finishAnimation(boolean paramBoolean)
  {
    this.mGroupMemberRoutesAdded = null;
    this.mGroupMemberRoutesRemoved = null;
    this.mIsGroupListAnimating = false;
    if (this.mIsGroupListAnimationPending)
    {
      this.mIsGroupListAnimationPending = false;
      updateLayoutHeight(paramBoolean);
    }
    this.mVolumeGroupList.setEnabled(true);
  }
  
  private int getDesiredArtHeight(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramInt2) {
      return (int)(this.mDialogContentWidth * paramInt2 / paramInt1 + 0.5F);
    }
    return (int)(this.mDialogContentWidth * 9.0F / 16.0F + 0.5F);
  }
  
  private MediaRouter.RouteGroup getGroup()
  {
    if ((this.mRoute instanceof MediaRouter.RouteGroup)) {
      return (MediaRouter.RouteGroup)this.mRoute;
    }
    return null;
  }
  
  private static int getLayoutHeight(View paramView)
  {
    return paramView.getLayoutParams().height;
  }
  
  private int getMainControllerHeight(boolean paramBoolean)
  {
    int i = 0;
    if ((paramBoolean) || (this.mVolumeControlLayout.getVisibility() == 0))
    {
      int j = 0 + (this.mMediaMainControlLayout.getPaddingTop() + this.mMediaMainControlLayout.getPaddingBottom());
      i = j;
      if (paramBoolean) {
        i = j + this.mPlaybackControlLayout.getMeasuredHeight();
      }
      j = i;
      if (this.mVolumeControlLayout.getVisibility() == 0) {
        j = i + this.mVolumeControlLayout.getMeasuredHeight();
      }
      i = j;
      if (paramBoolean)
      {
        i = j;
        if (this.mVolumeControlLayout.getVisibility() == 0) {
          i = j + this.mDividerView.getMeasuredHeight();
        }
      }
    }
    return i;
  }
  
  private boolean isVolumeControlAvailable(MediaRouter.RouteInfo paramRouteInfo)
  {
    return (this.mVolumeControlEnabled) && (paramRouteInfo.getVolumeHandling() == 1);
  }
  
  private void loadInterpolator()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if (this.mIsGroupExpanded) {}
      for (Interpolator localInterpolator = this.mLinearOutSlowInInterpolator;; localInterpolator = this.mFastOutSlowInInterpolator)
      {
        this.mInterpolator = localInterpolator;
        return;
      }
    }
    this.mInterpolator = this.mAccelerateDecelerateInterpolator;
  }
  
  private void rebuildVolumeGroupList(boolean paramBoolean)
  {
    if (getGroup() == null) {}
    for (List localList = null; localList == null; localList = getGroup().getRoutes())
    {
      this.mGroupMemberRoutes.clear();
      this.mVolumeGroupAdapter.notifyDataSetChanged();
      return;
    }
    if (MediaRouteDialogHelper.listUnorderedEquals(this.mGroupMemberRoutes, localList))
    {
      this.mVolumeGroupAdapter.notifyDataSetChanged();
      return;
    }
    HashMap localHashMap1;
    if (paramBoolean)
    {
      localHashMap1 = MediaRouteDialogHelper.getItemBoundMap(this.mVolumeGroupList, this.mVolumeGroupAdapter);
      if (!paramBoolean) {
        break label203;
      }
    }
    label203:
    for (HashMap localHashMap2 = MediaRouteDialogHelper.getItemBitmapMap(this.mContext, this.mVolumeGroupList, this.mVolumeGroupAdapter);; localHashMap2 = null)
    {
      this.mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(this.mGroupMemberRoutes, localList);
      this.mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(this.mGroupMemberRoutes, localList);
      this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
      this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
      this.mVolumeGroupAdapter.notifyDataSetChanged();
      if ((!paramBoolean) || (!this.mIsGroupExpanded) || (this.mGroupMemberRoutesAdded.size() + this.mGroupMemberRoutesRemoved.size() <= 0)) {
        break label209;
      }
      animateGroupListItems(localHashMap1, localHashMap2);
      return;
      localHashMap1 = null;
      break;
    }
    label209:
    this.mGroupMemberRoutesAdded = null;
    this.mGroupMemberRoutesRemoved = null;
  }
  
  private static void setLayoutHeight(View paramView, int paramInt)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = paramInt;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  private void setMediaSession(MediaSessionCompat.Token paramToken)
  {
    Object localObject = null;
    if (this.mMediaController != null)
    {
      this.mMediaController.unregisterCallback(this.mControllerCallback);
      this.mMediaController = null;
    }
    if (paramToken == null) {}
    while (!this.mAttachedToWindow) {
      return;
    }
    try
    {
      this.mMediaController = new MediaControllerCompat(this.mContext, paramToken);
      if (this.mMediaController != null) {
        this.mMediaController.registerCallback(this.mControllerCallback);
      }
      if (this.mMediaController == null)
      {
        paramToken = null;
        if (paramToken != null) {
          break label136;
        }
        paramToken = null;
        this.mDescription = paramToken;
        if (this.mMediaController != null) {
          break label144;
        }
        paramToken = (MediaSessionCompat.Token)localObject;
        this.mState = paramToken;
        update(false);
      }
    }
    catch (RemoteException paramToken)
    {
      for (;;)
      {
        Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", paramToken);
        continue;
        paramToken = this.mMediaController.getMetadata();
        continue;
        label136:
        paramToken = paramToken.getDescription();
        continue;
        label144:
        paramToken = this.mMediaController.getPlaybackState();
      }
    }
  }
  
  private void startGroupListFadeInAnimation()
  {
    clearGroupListAnimation(true);
    this.mVolumeGroupList.requestLayout();
    this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MediaRouteControllerDialog.this.startGroupListFadeInAnimationInternal();
      }
    });
  }
  
  private void startGroupListFadeInAnimationInternal()
  {
    if ((this.mGroupMemberRoutesAdded != null) && (this.mGroupMemberRoutesAdded.size() != 0))
    {
      fadeInAddedRoutes();
      return;
    }
    finishAnimation(true);
  }
  
  private void update(boolean paramBoolean)
  {
    if ((!this.mRoute.isSelected()) || (this.mRoute.isDefaultOrBluetooth())) {
      dismiss();
    }
    while (!this.mCreated) {
      return;
    }
    this.mRouteNameTextView.setText(this.mRoute.getName());
    Button localButton = this.mDisconnectButton;
    if (this.mRoute.canDisconnect()) {}
    for (int i = 0;; i = 8)
    {
      localButton.setVisibility(i);
      if (this.mCustomControlView == null)
      {
        if (this.mFetchArtTask != null) {
          this.mFetchArtTask.cancel(true);
        }
        this.mFetchArtTask = new FetchArtTask();
        this.mFetchArtTask.execute(new Void[0]);
      }
      updateVolumeControlLayout();
      updatePlaybackControlLayout();
      updateLayoutHeight(paramBoolean);
      return;
    }
  }
  
  private void updateLayoutHeight(final boolean paramBoolean)
  {
    this.mDefaultControlLayout.requestLayout();
    this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        MediaRouteControllerDialog.this.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (MediaRouteControllerDialog.this.mIsGroupListAnimating)
        {
          MediaRouteControllerDialog.access$1202(MediaRouteControllerDialog.this, true);
          return;
        }
        MediaRouteControllerDialog.this.updateLayoutHeightInternal(paramBoolean);
      }
    });
  }
  
  private void updateLayoutHeightInternal(boolean paramBoolean)
  {
    boolean bool2 = true;
    int i = getLayoutHeight(this.mMediaMainControlLayout);
    setLayoutHeight(this.mMediaMainControlLayout, -1);
    updateMediaControlVisibility(canShowPlaybackControlLayout());
    View localView = getWindow().getDecorView();
    localView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
    setLayoutHeight(this.mMediaMainControlLayout, i);
    Object localObject;
    int j;
    if ((this.mCustomControlView == null) && ((this.mArtView.getDrawable() instanceof BitmapDrawable)))
    {
      localObject = ((BitmapDrawable)this.mArtView.getDrawable()).getBitmap();
      if (localObject != null)
      {
        j = getDesiredArtHeight(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        ImageView localImageView = this.mArtView;
        if (((Bitmap)localObject).getWidth() >= ((Bitmap)localObject).getHeight())
        {
          localObject = ImageView.ScaleType.FIT_XY;
          localImageView.setScaleType((ImageView.ScaleType)localObject);
        }
      }
    }
    for (;;)
    {
      int n = getMainControllerHeight(canShowPlaybackControlLayout());
      int m = this.mGroupMemberRoutes.size();
      label182:
      int k;
      label215:
      int i1;
      label306:
      label328:
      boolean bool1;
      if (getGroup() == null)
      {
        i = 0;
        k = i;
        if (m > 0) {
          k = i + this.mVolumeGroupListPaddingTop;
        }
        i = Math.min(k, this.mVolumeGroupListMaxHeight);
        if (!this.mIsGroupExpanded) {
          break label505;
        }
        k = Math.max(j, i) + n;
        localObject = new Rect();
        localView.getWindowVisibleDisplayFrame((Rect)localObject);
        m = this.mDialogAreaLayout.getMeasuredHeight();
        i1 = this.mDefaultControlLayout.getMeasuredHeight();
        m = ((Rect)localObject).height() - (m - i1);
        if ((this.mCustomControlView != null) || (j <= 0) || (k > m)) {
          break label510;
        }
        this.mArtView.setVisibility(0);
        setLayoutHeight(this.mArtView, j);
        if ((!canShowPlaybackControlLayout()) || (k > m)) {
          break label555;
        }
        this.mPlaybackControlLayout.setVisibility(0);
        if (this.mPlaybackControlLayout.getVisibility() != 0) {
          break label567;
        }
        bool1 = true;
        label341:
        updateMediaControlVisibility(bool1);
        if (this.mPlaybackControlLayout.getVisibility() != 0) {
          break label573;
        }
        bool1 = bool2;
        label361:
        i1 = getMainControllerHeight(bool1);
        n = Math.max(j, i) + i1;
        k = n;
        j = i;
        if (n > m)
        {
          j = i - (n - m);
          k = m;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (!paramBoolean) {
          break label579;
        }
        animateLayoutHeight(this.mMediaMainControlLayout, i1);
        animateLayoutHeight(this.mVolumeGroupList, j);
        animateLayoutHeight(this.mDefaultControlLayout, k);
      }
      for (;;)
      {
        setLayoutHeight(this.mExpandableAreaLayout, ((Rect)localObject).height());
        rebuildVolumeGroupList(paramBoolean);
        return;
        localObject = ImageView.ScaleType.FIT_CENTER;
        break;
        i = this.mVolumeGroupListItemHeight * getGroup().getRoutes().size();
        break label182;
        label505:
        i = 0;
        break label215;
        label510:
        if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
          this.mArtView.setVisibility(8);
        }
        k = i + n;
        j = 0;
        break label306;
        label555:
        this.mPlaybackControlLayout.setVisibility(8);
        break label328;
        label567:
        bool1 = false;
        break label341;
        label573:
        bool1 = false;
        break label361;
        label579:
        setLayoutHeight(this.mMediaMainControlLayout, i1);
        setLayoutHeight(this.mVolumeGroupList, j);
        setLayoutHeight(this.mDefaultControlLayout, k);
      }
      j = 0;
    }
  }
  
  private void updateMediaControlVisibility(boolean paramBoolean)
  {
    int j = 8;
    Object localObject = this.mDividerView;
    if ((this.mVolumeControlLayout.getVisibility() == 0) && (paramBoolean))
    {
      i = 0;
      ((View)localObject).setVisibility(i);
      localObject = this.mMediaMainControlLayout;
      if ((this.mVolumeControlLayout.getVisibility() != 8) || (paramBoolean)) {
        break label68;
      }
    }
    label68:
    for (int i = j;; i = 0)
    {
      ((LinearLayout)localObject).setVisibility(i);
      return;
      i = 8;
      break;
    }
  }
  
  private void updatePlaybackControlLayout()
  {
    CharSequence localCharSequence = null;
    int k = 1;
    Object localObject;
    label32:
    label39:
    int j;
    if (canShowPlaybackControlLayout())
    {
      if (this.mDescription != null) {
        break label230;
      }
      localObject = null;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break label242;
      }
      i = 1;
      if (this.mDescription != null) {
        break label247;
      }
      if (TextUtils.isEmpty(localCharSequence)) {
        break label259;
      }
      j = 1;
      label49:
      if (this.mRoute.getPresentationDisplayId() == -1) {
        break label264;
      }
      this.mTitleView.setText(R.string.mr_controller_casting_screen);
      i = 0;
      j = 1;
    }
    for (;;)
    {
      localObject = this.mTitleView;
      if (j == 0) {
        break label358;
      }
      j = 0;
      label86:
      ((TextView)localObject).setVisibility(j);
      localObject = this.mSubtitleView;
      if (i == 0) {
        break label364;
      }
      i = 0;
      label104:
      ((TextView)localObject).setVisibility(i);
      if (this.mState != null)
      {
        if ((this.mState.getState() != 6) && (this.mState.getState() != 3)) {
          break label370;
        }
        i = 1;
        label142:
        if ((this.mState.getActions() & 0x204) == 0L) {
          break label375;
        }
        j = 1;
        label160:
        if ((this.mState.getActions() & 0x202) == 0L) {
          break label380;
        }
        label176:
        if ((i == 0) || (k == 0)) {
          break label385;
        }
        this.mPlayPauseButton.setVisibility(0);
        this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, R.attr.mediaRoutePauseDrawable));
        this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(R.string.mr_controller_pause));
      }
      return;
      label230:
      localObject = this.mDescription.getTitle();
      break;
      label242:
      i = 0;
      break label32;
      label247:
      localCharSequence = this.mDescription.getSubtitle();
      break label39;
      label259:
      j = 0;
      break label49;
      label264:
      if ((this.mState == null) || (this.mState.getState() == 0))
      {
        this.mTitleView.setText(R.string.mr_controller_no_media_selected);
        i = 0;
        j = 1;
      }
      else
      {
        if ((i != 0) || (j != 0)) {
          break label323;
        }
        this.mTitleView.setText(R.string.mr_controller_no_info_available);
        i = 0;
        j = 1;
      }
    }
    label323:
    if (i != 0) {
      this.mTitleView.setText((CharSequence)localObject);
    }
    for (int i = 1;; i = 0)
    {
      if (j != 0)
      {
        this.mSubtitleView.setText(localCharSequence);
        j = i;
        i = 1;
        break;
        label358:
        j = 8;
        break label86;
        label364:
        i = 8;
        break label104;
        label370:
        i = 0;
        break label142;
        label375:
        j = 0;
        break label160;
        label380:
        k = 0;
        break label176;
        label385:
        if ((i == 0) && (j != 0))
        {
          this.mPlayPauseButton.setVisibility(0);
          this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, R.attr.mediaRoutePlayDrawable));
          this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(R.string.mr_controller_play));
          return;
        }
        this.mPlayPauseButton.setVisibility(8);
        return;
      }
      j = i;
      i = 0;
      break;
    }
  }
  
  private void updateVolumeControlLayout()
  {
    int i = 8;
    if (isVolumeControlAvailable(this.mRoute))
    {
      MediaRouteExpandCollapseButton localMediaRouteExpandCollapseButton;
      if (this.mVolumeControlLayout.getVisibility() == 8)
      {
        this.mVolumeControlLayout.setVisibility(0);
        this.mVolumeSlider.setMax(this.mRoute.getVolumeMax());
        this.mVolumeSlider.setProgress(this.mRoute.getVolume());
        localMediaRouteExpandCollapseButton = this.mGroupExpandCollapseButton;
        if (getGroup() != null) {
          break label80;
        }
      }
      for (;;)
      {
        localMediaRouteExpandCollapseButton.setVisibility(i);
        return;
        label80:
        i = 0;
      }
    }
    this.mVolumeControlLayout.setVisibility(8);
  }
  
  private void updateVolumeGroupItemHeight(View paramView)
  {
    setLayoutHeight((LinearLayout)paramView.findViewById(R.id.volume_item_container), this.mVolumeGroupListItemHeight);
    paramView = paramView.findViewById(R.id.mr_volume_item_icon);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.width = this.mVolumeGroupListItemIconSize;
    localLayoutParams.height = this.mVolumeGroupListItemIconSize;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  private static boolean uriEquals(Uri paramUri1, Uri paramUri2)
  {
    if ((paramUri1 != null) && (paramUri1.equals(paramUri2))) {}
    while ((paramUri1 == null) && (paramUri2 == null)) {
      return true;
    }
    return false;
  }
  
  void clearGroupListAnimation(boolean paramBoolean)
  {
    int j = this.mVolumeGroupList.getFirstVisiblePosition();
    int i = 0;
    if (i < this.mVolumeGroupList.getChildCount())
    {
      View localView = this.mVolumeGroupList.getChildAt(i);
      Object localObject = (MediaRouter.RouteInfo)this.mVolumeGroupAdapter.getItem(j + i);
      if ((paramBoolean) && (this.mGroupMemberRoutesAdded != null) && (this.mGroupMemberRoutesAdded.contains(localObject))) {}
      for (;;)
      {
        i += 1;
        break;
        ((LinearLayout)localView.findViewById(R.id.volume_item_container)).setVisibility(0);
        localObject = new AnimationSet(true);
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 1.0F);
        localAlphaAnimation.setDuration(0L);
        ((AnimationSet)localObject).addAnimation(localAlphaAnimation);
        new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F).setDuration(0L);
        ((AnimationSet)localObject).setFillAfter(true);
        ((AnimationSet)localObject).setFillEnabled(true);
        localView.clearAnimation();
        localView.startAnimation((Animation)localObject);
      }
    }
    this.mVolumeGroupList.stopAnimationAll();
    if (!paramBoolean) {
      finishAnimation(false);
    }
  }
  
  public View getMediaControlView()
  {
    return this.mCustomControlView;
  }
  
  public MediaSessionCompat.Token getMediaSession()
  {
    if (this.mMediaController == null) {
      return null;
    }
    return this.mMediaController.getSessionToken();
  }
  
  public MediaRouter.RouteInfo getRoute()
  {
    return this.mRoute;
  }
  
  public boolean isVolumeControlEnabled()
  {
    return this.mVolumeControlEnabled;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mAttachedToWindow = true;
    this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
    setMediaSession(this.mRouter.getMediaSessionToken());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(17170445);
    setContentView(R.layout.mr_controller_material_dialog_b);
    findViewById(16908315).setVisibility(8);
    Object localObject1 = new ClickListener(null);
    this.mExpandableAreaLayout = ((FrameLayout)findViewById(R.id.mr_expandable_area));
    this.mExpandableAreaLayout.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MediaRouteControllerDialog.this.dismiss();
      }
    });
    this.mDialogAreaLayout = ((LinearLayout)findViewById(R.id.mr_dialog_area));
    this.mDialogAreaLayout.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView) {}
    });
    int i = MediaRouterThemeHelper.getButtonTextColor(this.mContext);
    this.mDisconnectButton = ((Button)findViewById(16908314));
    this.mDisconnectButton.setText(R.string.mr_controller_disconnect);
    this.mDisconnectButton.setTextColor(i);
    this.mDisconnectButton.setOnClickListener((View.OnClickListener)localObject1);
    this.mStopCastingButton = ((Button)findViewById(16908313));
    this.mStopCastingButton.setText(R.string.mr_controller_stop);
    this.mStopCastingButton.setTextColor(i);
    this.mStopCastingButton.setOnClickListener((View.OnClickListener)localObject1);
    this.mRouteNameTextView = ((TextView)findViewById(R.id.mr_name));
    this.mCloseButton = ((ImageButton)findViewById(R.id.mr_close));
    this.mCloseButton.setOnClickListener((View.OnClickListener)localObject1);
    this.mCustomControlLayout = ((FrameLayout)findViewById(R.id.mr_custom_control));
    this.mDefaultControlLayout = ((FrameLayout)findViewById(R.id.mr_default_control));
    Object localObject2 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (MediaRouteControllerDialog.this.mMediaController != null)
        {
          paramAnonymousView = MediaRouteControllerDialog.this.mMediaController.getSessionActivity();
          if (paramAnonymousView == null) {}
        }
        try
        {
          paramAnonymousView.send();
          MediaRouteControllerDialog.this.dismiss();
          return;
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          Log.e("MediaRouteCtrlDialog", paramAnonymousView + " was not sent, it had been canceled.");
        }
      }
    };
    this.mArtView = ((ImageView)findViewById(R.id.mr_art));
    this.mArtView.setOnClickListener((View.OnClickListener)localObject2);
    findViewById(R.id.mr_control_title_container).setOnClickListener((View.OnClickListener)localObject2);
    this.mMediaMainControlLayout = ((LinearLayout)findViewById(R.id.mr_media_main_control));
    this.mDividerView = findViewById(R.id.mr_control_divider);
    this.mPlaybackControlLayout = ((RelativeLayout)findViewById(R.id.mr_playback_control));
    this.mTitleView = ((TextView)findViewById(R.id.mr_control_title));
    this.mSubtitleView = ((TextView)findViewById(R.id.mr_control_subtitle));
    this.mPlayPauseButton = ((ImageButton)findViewById(R.id.mr_control_play_pause));
    this.mPlayPauseButton.setOnClickListener((View.OnClickListener)localObject1);
    this.mVolumeControlLayout = ((LinearLayout)findViewById(R.id.mr_volume_control));
    this.mVolumeControlLayout.setVisibility(8);
    this.mVolumeSlider = ((SeekBar)findViewById(R.id.mr_volume_slider));
    this.mVolumeSlider.setTag(this.mRoute);
    this.mVolumeChangeListener = new VolumeChangeListener(null);
    this.mVolumeSlider.setOnSeekBarChangeListener(this.mVolumeChangeListener);
    this.mVolumeGroupList = ((OverlayListView)findViewById(R.id.mr_volume_group_list));
    this.mGroupMemberRoutes = new ArrayList();
    this.mVolumeGroupAdapter = new VolumeGroupAdapter(this.mContext, this.mGroupMemberRoutes);
    this.mVolumeGroupList.setAdapter(this.mVolumeGroupAdapter);
    this.mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
    localObject1 = this.mContext;
    localObject2 = this.mMediaMainControlLayout;
    OverlayListView localOverlayListView = this.mVolumeGroupList;
    if (getGroup() != null) {}
    for (boolean bool = true;; bool = false)
    {
      MediaRouterThemeHelper.setMediaControlsBackgroundColor((Context)localObject1, (View)localObject2, localOverlayListView, bool);
      MediaRouterThemeHelper.setVolumeSliderColor(this.mContext, (MediaRouteVolumeSlider)this.mVolumeSlider, this.mMediaMainControlLayout);
      this.mVolumeSliderMap = new HashMap();
      this.mVolumeSliderMap.put(this.mRoute, this.mVolumeSlider);
      this.mGroupExpandCollapseButton = ((MediaRouteExpandCollapseButton)findViewById(R.id.mr_group_expand_collapse));
      this.mGroupExpandCollapseButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = MediaRouteControllerDialog.this;
          if (!MediaRouteControllerDialog.this.mIsGroupExpanded) {}
          for (boolean bool = true;; bool = false)
          {
            MediaRouteControllerDialog.access$602(paramAnonymousView, bool);
            if (MediaRouteControllerDialog.this.mIsGroupExpanded) {
              MediaRouteControllerDialog.this.mVolumeGroupList.setVisibility(0);
            }
            MediaRouteControllerDialog.this.loadInterpolator();
            MediaRouteControllerDialog.this.updateLayoutHeight(true);
            return;
          }
        }
      });
      loadInterpolator();
      this.mGroupListAnimationDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
      this.mGroupListFadeInDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
      this.mGroupListFadeOutDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
      this.mCustomControlView = onCreateMediaControlView(paramBundle);
      if (this.mCustomControlView != null)
      {
        this.mCustomControlLayout.addView(this.mCustomControlView);
        this.mCustomControlLayout.setVisibility(0);
      }
      this.mCreated = true;
      updateLayout();
      return;
    }
  }
  
  public View onCreateMediaControlView(Bundle paramBundle)
  {
    return null;
  }
  
  public void onDetachedFromWindow()
  {
    this.mRouter.removeCallback(this.mCallback);
    setMediaSession(null);
    this.mAttachedToWindow = false;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) || (paramInt == 24))
    {
      paramKeyEvent = this.mRoute;
      if (paramInt == 25) {}
      for (paramInt = -1;; paramInt = 1)
      {
        paramKeyEvent.requestUpdateVolume(paramInt);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) || (paramInt == 24)) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void setVolumeControlEnabled(boolean paramBoolean)
  {
    if (this.mVolumeControlEnabled != paramBoolean)
    {
      this.mVolumeControlEnabled = paramBoolean;
      if (this.mCreated)
      {
        updateVolumeControlLayout();
        updateLayoutHeight(false);
      }
    }
  }
  
  void updateLayout()
  {
    int i = MediaRouteDialogHelper.getDialogWidth(this.mContext);
    getWindow().setLayout(i, -2);
    Object localObject = getWindow().getDecorView();
    this.mDialogContentWidth = (i - ((View)localObject).getPaddingLeft() - ((View)localObject).getPaddingRight());
    localObject = this.mContext.getResources();
    this.mVolumeGroupListItemIconSize = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
    this.mVolumeGroupListItemHeight = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
    this.mVolumeGroupListMaxHeight = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
    this.mArtIconBitmap = null;
    this.mArtIconUri = null;
    update(false);
  }
  
  private final class ClickListener
    implements View.OnClickListener
  {
    private ClickListener() {}
    
    public void onClick(View paramView)
    {
      int j = 1;
      int i = 1;
      int k = paramView.getId();
      if ((k == 16908313) || (k == 16908314))
      {
        if (MediaRouteControllerDialog.this.mRoute.isSelected())
        {
          paramView = MediaRouteControllerDialog.this.mRouter;
          if (k == 16908313) {
            i = 2;
          }
          paramView.unselect(i);
        }
        MediaRouteControllerDialog.this.dismiss();
      }
      label111:
      label128:
      label229:
      label243:
      label245:
      do
      {
        do
        {
          return;
          if (k != R.id.mr_control_play_pause) {
            break;
          }
        } while ((MediaRouteControllerDialog.this.mMediaController == null) || (MediaRouteControllerDialog.this.mState == null));
        if (MediaRouteControllerDialog.this.mState.getState() == 3)
        {
          i = j;
          if (i == 0) {
            break label229;
          }
          MediaRouteControllerDialog.this.mMediaController.getTransportControls().pause();
          if ((MediaRouteControllerDialog.this.mAccessibilityManager == null) || (!MediaRouteControllerDialog.this.mAccessibilityManager.isEnabled())) {
            break label243;
          }
          paramView = AccessibilityEvent.obtain(16384);
          paramView.setPackageName(MediaRouteControllerDialog.this.mContext.getPackageName());
          paramView.setClassName(getClass().getName());
          if (i == 0) {
            break label245;
          }
        }
        for (i = R.string.mr_controller_pause;; i = R.string.mr_controller_play)
        {
          paramView.getText().add(MediaRouteControllerDialog.this.mContext.getString(i));
          MediaRouteControllerDialog.this.mAccessibilityManager.sendAccessibilityEvent(paramView);
          return;
          i = 0;
          break label111;
          MediaRouteControllerDialog.this.mMediaController.getTransportControls().play();
          break label128;
          break;
        }
      } while (k != R.id.mr_close);
      MediaRouteControllerDialog.this.dismiss();
    }
  }
  
  private class FetchArtTask
    extends AsyncTask<Void, Void, Bitmap>
  {
    int mBackgroundColor;
    final Bitmap mIconBitmap;
    final Uri mIconUri;
    
    FetchArtTask()
    {
      Bitmap localBitmap;
      if (MediaRouteControllerDialog.this.mDescription == null)
      {
        localBitmap = null;
        this.mIconBitmap = localBitmap;
        if (MediaRouteControllerDialog.this.mDescription != null) {
          break label51;
        }
      }
      label51:
      for (this$1 = (MediaRouteControllerDialog)localObject;; this$1 = MediaRouteControllerDialog.this.mDescription.getIconUri())
      {
        this.mIconUri = MediaRouteControllerDialog.this;
        return;
        localBitmap = MediaRouteControllerDialog.this.mDescription.getIconBitmap();
        break;
      }
    }
    
    private boolean isIconChanged()
    {
      if (this.mIconBitmap != MediaRouteControllerDialog.this.mArtIconBitmap) {}
      while ((this.mIconBitmap == null) && (!MediaRouteControllerDialog.uriEquals(this.mIconUri, MediaRouteControllerDialog.this.mArtIconUri))) {
        return true;
      }
      return false;
    }
    
    private InputStream openInputStreamByScheme(Uri paramUri)
    {
      String str = paramUri.getScheme().toLowerCase();
      if (("android.resource".equals(str)) || ("content".equals(str)) || ("file".equals(str))) {}
      for (paramUri = MediaRouteControllerDialog.this.mContext.getContentResolver().openInputStream(paramUri); paramUri == null; paramUri = paramUri.getInputStream())
      {
        return null;
        paramUri = new URL(paramUri.toString()).openConnection();
        paramUri.setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
        paramUri.setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
      }
      return new BufferedInputStream(paramUri);
    }
    
    /* Error */
    protected Bitmap doInBackground(Void... paramVarArgs)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aconst_null
      //   3: astore 8
      //   5: aload_0
      //   6: getfield 29	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
      //   9: ifnull +60 -> 69
      //   12: aload_0
      //   13: getfield 29	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
      //   16: astore_1
      //   17: aload_1
      //   18: ifnull +49 -> 67
      //   21: aload_1
      //   22: invokevirtual 137	android/graphics/Bitmap:getWidth	()I
      //   25: aload_1
      //   26: invokevirtual 140	android/graphics/Bitmap:getHeight	()I
      //   29: if_icmpge +38 -> 67
      //   32: new 142	android/support/v7/graphics/Palette$Builder
      //   35: dup
      //   36: aload_1
      //   37: invokespecial 145	android/support/v7/graphics/Palette$Builder:<init>	(Landroid/graphics/Bitmap;)V
      //   40: iconst_1
      //   41: invokevirtual 149	android/support/v7/graphics/Palette$Builder:maximumColorCount	(I)Landroid/support/v7/graphics/Palette$Builder;
      //   44: invokevirtual 153	android/support/v7/graphics/Palette$Builder:generate	()Landroid/support/v7/graphics/Palette;
      //   47: astore 5
      //   49: aload 5
      //   51: invokevirtual 159	android/support/v7/graphics/Palette:getSwatches	()Ljava/util/List;
      //   54: invokeinterface 164 1 0
      //   59: ifeq +485 -> 544
      //   62: aload_0
      //   63: iload_2
      //   64: putfield 166	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mBackgroundColor	I
      //   67: aload_1
      //   68: areturn
      //   69: aload 8
      //   71: astore_1
      //   72: aload_0
      //   73: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   76: ifnull -59 -> 17
      //   79: aload_0
      //   80: aload_0
      //   81: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   84: invokespecial 168	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   87: astore 6
      //   89: aload 6
      //   91: ifnonnull +50 -> 141
      //   94: aload 6
      //   96: astore_1
      //   97: aload 6
      //   99: astore 5
      //   101: ldc -86
      //   103: new 172	java/lang/StringBuilder
      //   106: dup
      //   107: invokespecial 173	java/lang/StringBuilder:<init>	()V
      //   110: ldc -81
      //   112: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   115: aload_0
      //   116: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   119: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   122: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   125: invokestatic 189	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   128: pop
      //   129: aload 6
      //   131: ifnull +8 -> 139
      //   134: aload 6
      //   136: invokevirtual 194	java/io/InputStream:close	()V
      //   139: aconst_null
      //   140: areturn
      //   141: aload 6
      //   143: astore_1
      //   144: aload 6
      //   146: astore 5
      //   148: new 196	android/graphics/BitmapFactory$Options
      //   151: dup
      //   152: invokespecial 197	android/graphics/BitmapFactory$Options:<init>	()V
      //   155: astore 9
      //   157: aload 6
      //   159: astore_1
      //   160: aload 6
      //   162: astore 5
      //   164: aload 9
      //   166: iconst_1
      //   167: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   170: aload 6
      //   172: astore_1
      //   173: aload 6
      //   175: astore 5
      //   177: aload 6
      //   179: aconst_null
      //   180: aload 9
      //   182: invokestatic 207	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   185: pop
      //   186: aload 6
      //   188: astore_1
      //   189: aload 6
      //   191: astore 5
      //   193: aload 9
      //   195: getfield 210	android/graphics/BitmapFactory$Options:outWidth	I
      //   198: ifeq +20 -> 218
      //   201: aload 6
      //   203: astore_1
      //   204: aload 6
      //   206: astore 5
      //   208: aload 9
      //   210: getfield 213	android/graphics/BitmapFactory$Options:outHeight	I
      //   213: istore_3
      //   214: iload_3
      //   215: ifne +15 -> 230
      //   218: aload 6
      //   220: ifnull +8 -> 228
      //   223: aload 6
      //   225: invokevirtual 194	java/io/InputStream:close	()V
      //   228: aconst_null
      //   229: areturn
      //   230: aload 6
      //   232: astore_1
      //   233: aload 6
      //   235: invokevirtual 216	java/io/InputStream:reset	()V
      //   238: aload 6
      //   240: astore_1
      //   241: aload 6
      //   243: astore 5
      //   245: aload 9
      //   247: iconst_0
      //   248: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   251: aload 6
      //   253: astore_1
      //   254: aload 6
      //   256: astore 5
      //   258: aload_0
      //   259: getfield 20	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:this$0	Landroid/support/v7/app/MediaRouteControllerDialog;
      //   262: aload 9
      //   264: getfield 210	android/graphics/BitmapFactory$Options:outWidth	I
      //   267: aload 9
      //   269: getfield 213	android/graphics/BitmapFactory$Options:outHeight	I
      //   272: invokestatic 220	android/support/v7/app/MediaRouteControllerDialog:access$3800	(Landroid/support/v7/app/MediaRouteControllerDialog;II)I
      //   275: istore_3
      //   276: aload 6
      //   278: astore_1
      //   279: aload 6
      //   281: astore 5
      //   283: aload 9
      //   285: iconst_1
      //   286: aload 9
      //   288: getfield 213	android/graphics/BitmapFactory$Options:outHeight	I
      //   291: iload_3
      //   292: idiv
      //   293: invokestatic 226	java/lang/Integer:highestOneBit	(I)I
      //   296: invokestatic 232	java/lang/Math:max	(II)I
      //   299: putfield 235	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   302: aload 6
      //   304: astore_1
      //   305: aload 6
      //   307: astore 5
      //   309: aload_0
      //   310: invokevirtual 238	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:isCancelled	()Z
      //   313: istore 4
      //   315: iload 4
      //   317: ifeq +101 -> 418
      //   320: aload 6
      //   322: ifnull +8 -> 330
      //   325: aload 6
      //   327: invokevirtual 194	java/io/InputStream:close	()V
      //   330: aconst_null
      //   331: areturn
      //   332: astore_1
      //   333: aload 6
      //   335: astore_1
      //   336: aload 6
      //   338: astore 5
      //   340: aload 6
      //   342: invokevirtual 194	java/io/InputStream:close	()V
      //   345: aload 6
      //   347: astore_1
      //   348: aload 6
      //   350: astore 5
      //   352: aload_0
      //   353: aload_0
      //   354: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   357: invokespecial 168	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   360: astore 7
      //   362: aload 7
      //   364: astore 6
      //   366: aload 7
      //   368: ifnonnull -130 -> 238
      //   371: aload 7
      //   373: astore_1
      //   374: aload 7
      //   376: astore 5
      //   378: ldc -86
      //   380: new 172	java/lang/StringBuilder
      //   383: dup
      //   384: invokespecial 173	java/lang/StringBuilder:<init>	()V
      //   387: ldc -81
      //   389: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   392: aload_0
      //   393: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   396: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   399: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   402: invokestatic 189	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   405: pop
      //   406: aload 7
      //   408: ifnull +8 -> 416
      //   411: aload 7
      //   413: invokevirtual 194	java/io/InputStream:close	()V
      //   416: aconst_null
      //   417: areturn
      //   418: aload 6
      //   420: astore_1
      //   421: aload 6
      //   423: astore 5
      //   425: aload 6
      //   427: aconst_null
      //   428: aload 9
      //   430: invokestatic 207	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   433: astore 7
      //   435: aload 7
      //   437: astore 5
      //   439: aload 5
      //   441: astore_1
      //   442: aload 6
      //   444: ifnull -427 -> 17
      //   447: aload 6
      //   449: invokevirtual 194	java/io/InputStream:close	()V
      //   452: aload 5
      //   454: astore_1
      //   455: goto -438 -> 17
      //   458: astore_1
      //   459: aload 5
      //   461: astore_1
      //   462: goto -445 -> 17
      //   465: astore 6
      //   467: aconst_null
      //   468: astore 5
      //   470: aload 5
      //   472: astore_1
      //   473: ldc -86
      //   475: new 172	java/lang/StringBuilder
      //   478: dup
      //   479: invokespecial 173	java/lang/StringBuilder:<init>	()V
      //   482: ldc -81
      //   484: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   487: aload_0
      //   488: getfield 31	android/support/v7/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   491: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   494: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   497: aload 6
      //   499: invokestatic 241	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   502: pop
      //   503: aload 8
      //   505: astore_1
      //   506: aload 5
      //   508: ifnull -491 -> 17
      //   511: aload 5
      //   513: invokevirtual 194	java/io/InputStream:close	()V
      //   516: aload 8
      //   518: astore_1
      //   519: goto -502 -> 17
      //   522: astore_1
      //   523: aload 8
      //   525: astore_1
      //   526: goto -509 -> 17
      //   529: astore 5
      //   531: aconst_null
      //   532: astore_1
      //   533: aload_1
      //   534: ifnull +7 -> 541
      //   537: aload_1
      //   538: invokevirtual 194	java/io/InputStream:close	()V
      //   541: aload 5
      //   543: athrow
      //   544: aload 5
      //   546: invokevirtual 159	android/support/v7/graphics/Palette:getSwatches	()Ljava/util/List;
      //   549: iconst_0
      //   550: invokeinterface 245 2 0
      //   555: checkcast 247	android/support/v7/graphics/Palette$Swatch
      //   558: invokevirtual 250	android/support/v7/graphics/Palette$Swatch:getRgb	()I
      //   561: istore_2
      //   562: goto -500 -> 62
      //   565: astore_1
      //   566: goto -427 -> 139
      //   569: astore_1
      //   570: goto -342 -> 228
      //   573: astore_1
      //   574: goto -158 -> 416
      //   577: astore_1
      //   578: goto -248 -> 330
      //   581: astore_1
      //   582: goto -41 -> 541
      //   585: astore 5
      //   587: goto -54 -> 533
      //   590: astore 6
      //   592: goto -122 -> 470
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	595	0	this	FetchArtTask
      //   0	595	1	paramVarArgs	Void[]
      //   1	561	2	i	int
      //   213	80	3	j	int
      //   313	3	4	bool	boolean
      //   47	465	5	localObject1	Object
      //   529	16	5	localObject2	Object
      //   585	1	5	localObject3	Object
      //   87	361	6	localObject4	Object
      //   465	33	6	localIOException1	java.io.IOException
      //   590	1	6	localIOException2	java.io.IOException
      //   360	76	7	localObject5	Object
      //   3	521	8	localObject6	Object
      //   155	274	9	localOptions	android.graphics.BitmapFactory.Options
      // Exception table:
      //   from	to	target	type
      //   233	238	332	java/io/IOException
      //   447	452	458	java/io/IOException
      //   79	89	465	java/io/IOException
      //   511	516	522	java/io/IOException
      //   79	89	529	finally
      //   134	139	565	java/io/IOException
      //   223	228	569	java/io/IOException
      //   411	416	573	java/io/IOException
      //   325	330	577	java/io/IOException
      //   537	541	581	java/io/IOException
      //   101	129	585	finally
      //   148	157	585	finally
      //   164	170	585	finally
      //   177	186	585	finally
      //   193	201	585	finally
      //   208	214	585	finally
      //   233	238	585	finally
      //   245	251	585	finally
      //   258	276	585	finally
      //   283	302	585	finally
      //   309	315	585	finally
      //   340	345	585	finally
      //   352	362	585	finally
      //   378	406	585	finally
      //   425	435	585	finally
      //   473	503	585	finally
      //   101	129	590	java/io/IOException
      //   148	157	590	java/io/IOException
      //   164	170	590	java/io/IOException
      //   177	186	590	java/io/IOException
      //   193	201	590	java/io/IOException
      //   208	214	590	java/io/IOException
      //   245	251	590	java/io/IOException
      //   258	276	590	java/io/IOException
      //   283	302	590	java/io/IOException
      //   309	315	590	java/io/IOException
      //   340	345	590	java/io/IOException
      //   352	362	590	java/io/IOException
      //   378	406	590	java/io/IOException
      //   425	435	590	java/io/IOException
    }
    
    protected void onCancelled()
    {
      MediaRouteControllerDialog.access$3902(MediaRouteControllerDialog.this, null);
    }
    
    protected void onPostExecute(Bitmap paramBitmap)
    {
      MediaRouteControllerDialog.access$3902(MediaRouteControllerDialog.this, null);
      if ((MediaRouteControllerDialog.this.mArtIconBitmap != this.mIconBitmap) || (MediaRouteControllerDialog.this.mArtIconUri != this.mIconUri))
      {
        MediaRouteControllerDialog.access$4002(MediaRouteControllerDialog.this, this.mIconBitmap);
        MediaRouteControllerDialog.access$4102(MediaRouteControllerDialog.this, this.mIconUri);
        MediaRouteControllerDialog.this.mArtView.setImageBitmap(paramBitmap);
        MediaRouteControllerDialog.this.mArtView.setBackgroundColor(this.mBackgroundColor);
        MediaRouteControllerDialog.this.updateLayoutHeight(true);
      }
    }
    
    protected void onPreExecute()
    {
      if (!isIconChanged()) {
        cancel(true);
      }
    }
  }
  
  private final class MediaControllerCallback
    extends MediaControllerCompat.Callback
  {
    private MediaControllerCallback() {}
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      if (paramMediaMetadataCompat == null) {}
      for (paramMediaMetadataCompat = null;; paramMediaMetadataCompat = paramMediaMetadataCompat.getDescription())
      {
        MediaRouteControllerDialog.access$2802(localMediaRouteControllerDialog, paramMediaMetadataCompat);
        MediaRouteControllerDialog.this.update(false);
        return;
      }
    }
    
    public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
    {
      MediaRouteControllerDialog.access$2702(MediaRouteControllerDialog.this, paramPlaybackStateCompat);
      MediaRouteControllerDialog.this.update(false);
    }
    
    public void onSessionDestroyed()
    {
      if (MediaRouteControllerDialog.this.mMediaController != null)
      {
        MediaRouteControllerDialog.this.mMediaController.unregisterCallback(MediaRouteControllerDialog.this.mControllerCallback);
        MediaRouteControllerDialog.access$402(MediaRouteControllerDialog.this, null);
      }
    }
  }
  
  private final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    private MediaRouterCallback() {}
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteControllerDialog.this.update(true);
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteControllerDialog.this.update(false);
    }
    
    public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      paramMediaRouter = (SeekBar)MediaRouteControllerDialog.this.mVolumeSliderMap.get(paramRouteInfo);
      int i = paramRouteInfo.getVolume();
      if (MediaRouteControllerDialog.DEBUG) {
        Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + i);
      }
      if ((paramMediaRouter != null) && (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != paramRouteInfo)) {
        paramMediaRouter.setProgress(i);
      }
    }
  }
  
  private class VolumeChangeListener
    implements SeekBar.OnSeekBarChangeListener
  {
    private final Runnable mStopTrackingTouch = new Runnable()
    {
      public void run()
      {
        if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
          MediaRouteControllerDialog.access$2502(MediaRouteControllerDialog.this, null);
        }
      }
    };
    
    private VolumeChangeListener() {}
    
    public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        paramSeekBar = (MediaRouter.RouteInfo)paramSeekBar.getTag();
        if (MediaRouteControllerDialog.DEBUG) {
          Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + paramInt + ")");
        }
        paramSeekBar.requestSetVolume(paramInt);
      }
    }
    
    public void onStartTrackingTouch(SeekBar paramSeekBar)
    {
      if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
        MediaRouteControllerDialog.this.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
      }
      MediaRouteControllerDialog.access$2502(MediaRouteControllerDialog.this, (MediaRouter.RouteInfo)paramSeekBar.getTag());
    }
    
    public void onStopTrackingTouch(SeekBar paramSeekBar)
    {
      MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 500L);
    }
  }
  
  private class VolumeGroupAdapter
    extends ArrayAdapter<MediaRouter.RouteInfo>
  {
    final float mDisabledAlpha;
    
    public VolumeGroupAdapter(List<MediaRouter.RouteInfo> paramList)
    {
      super(0, localList);
      this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(paramList);
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 0;
      Object localObject;
      boolean bool1;
      if (paramView == null)
      {
        paramView = LayoutInflater.from(MediaRouteControllerDialog.this.mContext).inflate(R.layout.mr_controller_volume_item, paramViewGroup, false);
        paramViewGroup = (MediaRouter.RouteInfo)getItem(paramInt);
        if (paramViewGroup != null)
        {
          boolean bool2 = paramViewGroup.isEnabled();
          localObject = (TextView)paramView.findViewById(R.id.mr_name);
          ((TextView)localObject).setEnabled(bool2);
          ((TextView)localObject).setText(paramViewGroup.getName());
          localObject = (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_volume_slider);
          MediaRouterThemeHelper.setVolumeSliderColor(MediaRouteControllerDialog.this.mContext, (MediaRouteVolumeSlider)localObject, MediaRouteControllerDialog.this.mVolumeGroupList);
          ((MediaRouteVolumeSlider)localObject).setTag(paramViewGroup);
          MediaRouteControllerDialog.this.mVolumeSliderMap.put(paramViewGroup, localObject);
          if (bool2) {
            break label333;
          }
          bool1 = true;
          label134:
          ((MediaRouteVolumeSlider)localObject).setHideThumb(bool1);
          ((MediaRouteVolumeSlider)localObject).setEnabled(bool2);
          if (bool2)
          {
            if (!MediaRouteControllerDialog.this.isVolumeControlAvailable(paramViewGroup)) {
              break label339;
            }
            ((MediaRouteVolumeSlider)localObject).setMax(paramViewGroup.getVolumeMax());
            ((MediaRouteVolumeSlider)localObject).setProgress(paramViewGroup.getVolume());
            ((MediaRouteVolumeSlider)localObject).setOnSeekBarChangeListener(MediaRouteControllerDialog.this.mVolumeChangeListener);
          }
          label194:
          localObject = (ImageView)paramView.findViewById(R.id.mr_volume_item_icon);
          if (!bool2) {
            break label362;
          }
        }
      }
      label333:
      label339:
      label362:
      for (paramInt = 255;; paramInt = (int)(255.0F * this.mDisabledAlpha))
      {
        ((ImageView)localObject).setAlpha(paramInt);
        localObject = (LinearLayout)paramView.findViewById(R.id.volume_item_container);
        paramInt = i;
        if (MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.contains(paramViewGroup)) {
          paramInt = 4;
        }
        ((LinearLayout)localObject).setVisibility(paramInt);
        if ((MediaRouteControllerDialog.this.mGroupMemberRoutesAdded != null) && (MediaRouteControllerDialog.this.mGroupMemberRoutesAdded.contains(paramViewGroup)))
        {
          paramViewGroup = new AlphaAnimation(0.0F, 0.0F);
          paramViewGroup.setDuration(0L);
          paramViewGroup.setFillEnabled(true);
          paramViewGroup.setFillAfter(true);
          paramView.clearAnimation();
          paramView.startAnimation(paramViewGroup);
        }
        return paramView;
        MediaRouteControllerDialog.this.updateVolumeGroupItemHeight(paramView);
        break;
        bool1 = false;
        break label134;
        ((MediaRouteVolumeSlider)localObject).setMax(100);
        ((MediaRouteVolumeSlider)localObject).setProgress(100);
        ((MediaRouteVolumeSlider)localObject).setEnabled(false);
        break label194;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteControllerDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */