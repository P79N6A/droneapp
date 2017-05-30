package android.support.v7.app;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.OverlayListView.OverlayObject;
import android.support.v7.app.OverlayListView.OverlayObject.OnAnimationEndListener;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Palette.Builder;
import android.support.v7.graphics.Palette.Swatch;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.RouteGroup;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
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
import com.facebook.common.util.UriUtil;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class MediaRouteControllerDialog extends AlertDialog {
    private static final int BUTTON_DISCONNECT_RES_ID = 16908314;
    private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
    private static final int BUTTON_STOP_RES_ID = 16908313;
    private static final int CONNECTION_TIMEOUT_MILLIS = ((int) TimeUnit.SECONDS.toMillis(30));
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final String TAG = "MediaRouteCtrlDialog";
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
    private Interpolator mAccelerateDecelerateInterpolator;
    private final AccessibilityManager mAccessibilityManager;
    private Bitmap mArtIconBitmap;
    private Uri mArtIconUri;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    private Context mContext;
    private MediaControllerCallback mControllerCallback;
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
    private Runnable mGroupListFadeInAnimation;
    private int mGroupListFadeInDurationMs;
    private int mGroupListFadeOutDurationMs;
    private List<RouteInfo> mGroupMemberRoutes;
    private Set<RouteInfo> mGroupMemberRoutesAdded;
    private Set<RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
    private Set<RouteInfo> mGroupMemberRoutesRemoved;
    private Interpolator mInterpolator;
    private boolean mIsGroupExpanded;
    private boolean mIsGroupListAnimating;
    private boolean mIsGroupListAnimationPending;
    private Interpolator mLinearOutSlowInInterpolator;
    private MediaControllerCompat mMediaController;
    private LinearLayout mMediaMainControlLayout;
    private ImageButton mPlayPauseButton;
    private RelativeLayout mPlaybackControlLayout;
    private final RouteInfo mRoute;
    private RouteInfo mRouteInVolumeSliderTouched;
    private TextView mRouteNameTextView;
    private final MediaRouter mRouter;
    private PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    private VolumeChangeListener mVolumeChangeListener;
    private boolean mVolumeControlEnabled;
    private LinearLayout mVolumeControlLayout;
    private VolumeGroupAdapter mVolumeGroupAdapter;
    private OverlayListView mVolumeGroupList;
    private int mVolumeGroupListItemHeight;
    private int mVolumeGroupListItemIconSize;
    private int mVolumeGroupListMaxHeight;
    private final int mVolumeGroupListPaddingTop;
    private SeekBar mVolumeSlider;
    private Map<RouteInfo, SeekBar> mVolumeSliderMap;

    private final class ClickListener implements OnClickListener {
        private ClickListener() {
        }

        public void onClick(View view) {
            int i = 1;
            int id = view.getId();
            if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID || id == MediaRouteControllerDialog.BUTTON_DISCONNECT_RES_ID) {
                if (MediaRouteControllerDialog.this.mRoute.isSelected()) {
                    MediaRouter access$3000 = MediaRouteControllerDialog.this.mRouter;
                    if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID) {
                        i = 2;
                    }
                    access$3000.unselect(i);
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (id == R.id.mr_control_play_pause) {
                if (MediaRouteControllerDialog.this.mMediaController != null && MediaRouteControllerDialog.this.mState != null) {
                    if (MediaRouteControllerDialog.this.mState.getState() != 3) {
                        i = 0;
                    }
                    if (i != 0) {
                        MediaRouteControllerDialog.this.mMediaController.getTransportControls().pause();
                    } else {
                        MediaRouteControllerDialog.this.mMediaController.getTransportControls().play();
                    }
                    if (MediaRouteControllerDialog.this.mAccessibilityManager != null && MediaRouteControllerDialog.this.mAccessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(MediaRouteControllerDialog.this.mContext.getPackageName());
                        obtain.setClassName(getClass().getName());
                        obtain.getText().add(MediaRouteControllerDialog.this.mContext.getString(i != 0 ? R.string.mr_controller_pause : R.string.mr_controller_play));
                        MediaRouteControllerDialog.this.mAccessibilityManager.sendAccessibilityEvent(obtain);
                    }
                }
            } else if (id == R.id.mr_close) {
                MediaRouteControllerDialog.this.dismiss();
            }
        }
    }

    private class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        int mBackgroundColor;
        final Bitmap mIconBitmap;
        final Uri mIconUri;
        final /* synthetic */ MediaRouteControllerDialog this$0;

        FetchArtTask(MediaRouteControllerDialog mediaRouteControllerDialog) {
            Uri uri = null;
            this.this$0 = mediaRouteControllerDialog;
            this.mIconBitmap = mediaRouteControllerDialog.mDescription == null ? null : mediaRouteControllerDialog.mDescription.getIconBitmap();
            if (mediaRouteControllerDialog.mDescription != null) {
                uri = mediaRouteControllerDialog.mDescription.getIconUri();
            }
            this.mIconUri = uri;
        }

        private boolean isIconChanged() {
            return this.mIconBitmap != this.this$0.mArtIconBitmap ? true : this.mIconBitmap == null && !MediaRouteControllerDialog.uriEquals(this.mIconUri, this.this$0.mArtIconUri);
        }

        private InputStream openInputStreamByScheme(Uri uri) {
            InputStream openInputStream;
            String toLowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(toLowerCase) || "content".equals(toLowerCase) || UriUtil.LOCAL_FILE_SCHEME.equals(toLowerCase)) {
                openInputStream = this.this$0.mContext.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
                openConnection.setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
                openInputStream = openConnection.getInputStream();
            }
            return openInputStream == null ? null : new BufferedInputStream(openInputStream);
        }

        protected Bitmap doInBackground(Void... voidArr) {
            InputStream openInputStreamByScheme;
            Throwable e;
            Palette generate;
            Throwable th;
            int i = 0;
            Bitmap bitmap = null;
            if (this.mIconBitmap != null) {
                bitmap = this.mIconBitmap;
            } else if (this.mIconUri != null) {
                try {
                    openInputStreamByScheme = openInputStreamByScheme(this.mIconUri);
                    if (openInputStreamByScheme == null) {
                        try {
                            Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri);
                            if (openInputStreamByScheme != null) {
                                try {
                                    openInputStreamByScheme.close();
                                } catch (IOException e2) {
                                }
                            }
                            return bitmap;
                        } catch (IOException e3) {
                            e = e3;
                            try {
                                Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri, e);
                                if (openInputStreamByScheme != null) {
                                    try {
                                        openInputStreamByScheme.close();
                                    } catch (IOException e4) {
                                    }
                                }
                                generate = new Builder(bitmap).maximumColorCount(1).generate();
                                if (!generate.getSwatches().isEmpty()) {
                                    i = ((Swatch) generate.getSwatches().get(0)).getRgb();
                                }
                                this.mBackgroundColor = i;
                                return bitmap;
                            } catch (Throwable th2) {
                                th = th2;
                                if (openInputStreamByScheme != null) {
                                    try {
                                        openInputStreamByScheme.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(openInputStreamByScheme, null, options);
                    if (options.outWidth == 0 || options.outHeight == 0) {
                        if (openInputStreamByScheme != null) {
                            try {
                                openInputStreamByScheme.close();
                            } catch (IOException e6) {
                            }
                        }
                        return bitmap;
                    }
                    try {
                        openInputStreamByScheme.reset();
                    } catch (IOException e7) {
                        openInputStreamByScheme.close();
                        openInputStreamByScheme = openInputStreamByScheme(this.mIconUri);
                        if (openInputStreamByScheme == null) {
                            Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri);
                            if (openInputStreamByScheme != null) {
                                try {
                                    openInputStreamByScheme.close();
                                } catch (IOException e8) {
                                }
                            }
                            return bitmap;
                        }
                    }
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.this$0.getDesiredArtHeight(options.outWidth, options.outHeight)));
                    if (isCancelled()) {
                        if (openInputStreamByScheme != null) {
                            try {
                                openInputStreamByScheme.close();
                            } catch (IOException e9) {
                            }
                        }
                        return bitmap;
                    }
                    bitmap = BitmapFactory.decodeStream(openInputStreamByScheme, null, options);
                    if (openInputStreamByScheme != null) {
                        try {
                            openInputStreamByScheme.close();
                        } catch (IOException e10) {
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    openInputStreamByScheme = bitmap;
                    Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri, e);
                    if (openInputStreamByScheme != null) {
                        openInputStreamByScheme.close();
                    }
                    generate = new Builder(bitmap).maximumColorCount(1).generate();
                    if (generate.getSwatches().isEmpty()) {
                        i = ((Swatch) generate.getSwatches().get(0)).getRgb();
                    }
                    this.mBackgroundColor = i;
                    return bitmap;
                } catch (Throwable th3) {
                    th = th3;
                    openInputStreamByScheme = bitmap;
                    if (openInputStreamByScheme != null) {
                        openInputStreamByScheme.close();
                    }
                    throw th;
                }
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                generate = new Builder(bitmap).maximumColorCount(1).generate();
                if (generate.getSwatches().isEmpty()) {
                    i = ((Swatch) generate.getSwatches().get(0)).getRgb();
                }
                this.mBackgroundColor = i;
            }
            return bitmap;
        }

        protected void onCancelled() {
            this.this$0.mFetchArtTask = null;
        }

        protected void onPostExecute(Bitmap bitmap) {
            this.this$0.mFetchArtTask = null;
            if (this.this$0.mArtIconBitmap != this.mIconBitmap || this.this$0.mArtIconUri != this.mIconUri) {
                this.this$0.mArtIconBitmap = this.mIconBitmap;
                this.this$0.mArtIconUri = this.mIconUri;
                this.this$0.mArtView.setImageBitmap(bitmap);
                this.this$0.mArtView.setBackgroundColor(this.mBackgroundColor);
                this.this$0.updateLayoutHeight(true);
            }
        }

        protected void onPreExecute() {
            if (!isIconChanged()) {
                cancel(true);
            }
        }
    }

    private final class MediaControllerCallback extends Callback {
        private MediaControllerCallback() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaRouteControllerDialog.this.mDescription = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            MediaRouteControllerDialog.this.update(false);
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog.this.mState = playbackStateCompat;
            MediaRouteControllerDialog.this.update(false);
        }

        public void onSessionDestroyed() {
            if (MediaRouteControllerDialog.this.mMediaController != null) {
                MediaRouteControllerDialog.this.mMediaController.unregisterCallback(MediaRouteControllerDialog.this.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }
    }

    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(true);
        }

        public void onRouteUnselected(MediaRouter mediaRouter, RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(false);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            SeekBar seekBar = (SeekBar) MediaRouteControllerDialog.this.mVolumeSliderMap.get(routeInfo);
            int volume = routeInfo.getVolume();
            if (MediaRouteControllerDialog.DEBUG) {
                Log.d(MediaRouteControllerDialog.TAG, "onRouteVolumeChanged(), route.getVolume:" + volume);
            }
            if (seekBar != null && MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != routeInfo) {
                seekBar.setProgress(volume);
            }
        }
    }

    private class VolumeChangeListener implements OnSeekBarChangeListener {
        private final Runnable mStopTrackingTouch;

        private VolumeChangeListener() {
            this.mStopTrackingTouch = new Runnable() {
                public void run() {
                    if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
                        MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = null;
                    }
                }
            };
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                RouteInfo routeInfo = (RouteInfo) seekBar.getTag();
                if (MediaRouteControllerDialog.DEBUG) {
                    Log.d(MediaRouteControllerDialog.TAG, "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                routeInfo.requestSetVolume(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
                MediaRouteControllerDialog.this.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
            }
            MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = (RouteInfo) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 500);
        }
    }

    private class VolumeGroupAdapter extends ArrayAdapter<RouteInfo> {
        final float mDisabledAlpha;

        public VolumeGroupAdapter(Context context, List<RouteInfo> list) {
            super(context, 0, list);
            this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 0;
            if (view == null) {
                view = LayoutInflater.from(MediaRouteControllerDialog.this.mContext).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                MediaRouteControllerDialog.this.updateVolumeGroupItemHeight(view);
            }
            RouteInfo routeInfo = (RouteInfo) getItem(i);
            if (routeInfo != null) {
                boolean isEnabled = routeInfo.isEnabled();
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(isEnabled);
                textView.setText(routeInfo.getName());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                MediaRouterThemeHelper.setVolumeSliderColor(MediaRouteControllerDialog.this.mContext, mediaRouteVolumeSlider, MediaRouteControllerDialog.this.mVolumeGroupList);
                mediaRouteVolumeSlider.setTag(routeInfo);
                MediaRouteControllerDialog.this.mVolumeSliderMap.put(routeInfo, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!isEnabled);
                mediaRouteVolumeSlider.setEnabled(isEnabled);
                if (isEnabled) {
                    if (MediaRouteControllerDialog.this.isVolumeControlAvailable(routeInfo)) {
                        mediaRouteVolumeSlider.setMax(routeInfo.getVolumeMax());
                        mediaRouteVolumeSlider.setProgress(routeInfo.getVolume());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(MediaRouteControllerDialog.this.mVolumeChangeListener);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(isEnabled ? 255 : (int) (255.0f * this.mDisabledAlpha));
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
                if (MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.contains(routeInfo)) {
                    i2 = 4;
                }
                linearLayout.setVisibility(i2);
                if (MediaRouteControllerDialog.this.mGroupMemberRoutesAdded != null && MediaRouteControllerDialog.this.mGroupMemberRoutesAdded.contains(routeInfo)) {
                    Animation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteControllerDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context, i), i);
        this.mVolumeControlEnabled = true;
        this.mGroupListFadeInAnimation = new Runnable() {
            public void run() {
                MediaRouteControllerDialog.this.startGroupListFadeInAnimation();
            }
        };
        this.mContext = getContext();
        this.mControllerCallback = new MediaControllerCallback();
        this.mRouter = MediaRouter.getInstance(this.mContext);
        this.mCallback = new MediaRouterCallback();
        this.mRoute = this.mRouter.getSelectedRoute();
        setMediaSession(this.mRouter.getMediaSessionToken());
        this.mVolumeGroupListPaddingTop = this.mContext.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.mAccessibilityManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        if (VERSION.SDK_INT >= 21) {
            this.mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.mr_linear_out_slow_in);
            this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.mr_fast_out_slow_in);
        }
        this.mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    }

    private void animateGroupListItems(final Map<RouteInfo, Rect> map, final Map<RouteInfo, BitmapDrawable> map2) {
        this.mVolumeGroupList.setEnabled(false);
        this.mVolumeGroupList.requestLayout();
        this.mIsGroupListAnimating = true;
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.animateGroupListItemsInternal(map, map2);
            }
        });
    }

    private void animateGroupListItemsInternal(Map<RouteInfo, Rect> map, Map<RouteInfo, BitmapDrawable> map2) {
        if (this.mGroupMemberRoutesAdded != null && this.mGroupMemberRoutesRemoved != null) {
            int size = this.mGroupMemberRoutesAdded.size() - this.mGroupMemberRoutesRemoved.size();
            AnimationListener anonymousClass9 = new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                    MediaRouteControllerDialog.this.mVolumeGroupList.startAnimationAll();
                    MediaRouteControllerDialog.this.mVolumeGroupList.postDelayed(MediaRouteControllerDialog.this.mGroupListFadeInAnimation, (long) MediaRouteControllerDialog.this.mGroupListAnimationDurationMs);
                }
            };
            int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
            int i = 0;
            Object obj = null;
            while (i < this.mVolumeGroupList.getChildCount()) {
                Object obj2;
                View childAt = this.mVolumeGroupList.getChildAt(i);
                RouteInfo routeInfo = (RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
                Rect rect = (Rect) map.get(routeInfo);
                int top = childAt.getTop();
                int i2 = rect != null ? rect.top : (this.mVolumeGroupListItemHeight * size) + top;
                Animation animationSet = new AnimationSet(true);
                if (this.mGroupMemberRoutesAdded != null && this.mGroupMemberRoutesAdded.contains(routeInfo)) {
                    Animation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long) this.mGroupListFadeInDurationMs);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i2 - top), 0.0f);
                translateAnimation.setDuration((long) this.mGroupListAnimationDurationMs);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.mInterpolator);
                if (obj == null) {
                    obj2 = 1;
                    animationSet.setAnimationListener(anonymousClass9);
                } else {
                    obj2 = obj;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map.remove(routeInfo);
                map2.remove(routeInfo);
                i++;
                obj = obj2;
            }
            for (Entry entry : map2.entrySet()) {
                OverlayObject interpolator;
                final RouteInfo routeInfo2 = (RouteInfo) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(routeInfo2);
                if (this.mGroupMemberRoutesRemoved.contains(routeInfo2)) {
                    interpolator = new OverlayObject(bitmapDrawable, rect2).setAlphaAnimation(1.0f, 0.0f).setDuration((long) this.mGroupListFadeOutDurationMs).setInterpolator(this.mInterpolator);
                } else {
                    interpolator = new OverlayObject(bitmapDrawable, rect2).setTranslateYAnimation(this.mVolumeGroupListItemHeight * size).setDuration((long) this.mGroupListAnimationDurationMs).setInterpolator(this.mInterpolator).setAnimationEndListener(new OnAnimationEndListener() {
                        public void onAnimationEnd() {
                            MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.remove(routeInfo2);
                            MediaRouteControllerDialog.this.mVolumeGroupAdapter.notifyDataSetChanged();
                        }
                    });
                    this.mGroupMemberRoutesAnimatingWithBitmap.add(routeInfo2);
                }
                this.mVolumeGroupList.addOverlayObject(interpolator);
            }
        }
    }

    private void animateLayoutHeight(final View view, final int i) {
        final int layoutHeight = getLayoutHeight(view);
        Animation anonymousClass7 = new Animation() {
            protected void applyTransformation(float f, Transformation transformation) {
                MediaRouteControllerDialog.setLayoutHeight(view, layoutHeight - ((int) (((float) (layoutHeight - i)) * f)));
            }
        };
        anonymousClass7.setDuration((long) this.mGroupListAnimationDurationMs);
        if (VERSION.SDK_INT >= 21) {
            anonymousClass7.setInterpolator(this.mInterpolator);
        }
        view.startAnimation(anonymousClass7);
    }

    private boolean canShowPlaybackControlLayout() {
        return this.mCustomControlView == null && !(this.mDescription == null && this.mState == null);
    }

    private void fadeInAddedRoutes() {
        AnimationListener anonymousClass12 = new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                MediaRouteControllerDialog.this.finishAnimation(true);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            if (this.mGroupMemberRoutesAdded.contains((RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i))) {
                Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) this.mGroupListFadeInDurationMs);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(anonymousClass12);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private void finishAnimation(boolean z) {
        this.mGroupMemberRoutesAdded = null;
        this.mGroupMemberRoutesRemoved = null;
        this.mIsGroupListAnimating = false;
        if (this.mIsGroupListAnimationPending) {
            this.mIsGroupListAnimationPending = false;
            updateLayoutHeight(z);
        }
        this.mVolumeGroupList.setEnabled(true);
    }

    private int getDesiredArtHeight(int i, int i2) {
        return i >= i2 ? (int) (((((float) this.mDialogContentWidth) * ((float) i2)) / ((float) i)) + 0.5f) : (int) (((((float) this.mDialogContentWidth) * 9.0f) / 16.0f) + 0.5f);
    }

    private RouteGroup getGroup() {
        return this.mRoute instanceof RouteGroup ? (RouteGroup) this.mRoute : null;
    }

    private static int getLayoutHeight(View view) {
        return view.getLayoutParams().height;
    }

    private int getMainControllerHeight(boolean z) {
        if (!z && this.mVolumeControlLayout.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + (this.mMediaMainControlLayout.getPaddingTop() + this.mMediaMainControlLayout.getPaddingBottom());
        if (z) {
            paddingTop += this.mPlaybackControlLayout.getMeasuredHeight();
        }
        if (this.mVolumeControlLayout.getVisibility() == 0) {
            paddingTop += this.mVolumeControlLayout.getMeasuredHeight();
        }
        return (z && this.mVolumeControlLayout.getVisibility() == 0) ? paddingTop + this.mDividerView.getMeasuredHeight() : paddingTop;
    }

    private boolean isVolumeControlAvailable(RouteInfo routeInfo) {
        return this.mVolumeControlEnabled && routeInfo.getVolumeHandling() == 1;
    }

    private void loadInterpolator() {
        if (VERSION.SDK_INT >= 21) {
            this.mInterpolator = this.mIsGroupExpanded ? this.mLinearOutSlowInInterpolator : this.mFastOutSlowInInterpolator;
        } else {
            this.mInterpolator = this.mAccelerateDecelerateInterpolator;
        }
    }

    private void rebuildVolumeGroupList(boolean z) {
        List routes = getGroup() == null ? null : getGroup().getRoutes();
        if (routes == null) {
            this.mGroupMemberRoutes.clear();
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else if (MediaRouteDialogHelper.listUnorderedEquals(this.mGroupMemberRoutes, routes)) {
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else {
            Map itemBoundMap = z ? MediaRouteDialogHelper.getItemBoundMap(this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            Map itemBitmapMap = z ? MediaRouteDialogHelper.getItemBitmapMap(this.mContext, this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            this.mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(this.mGroupMemberRoutes, routes);
            this.mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(this.mGroupMemberRoutes, routes);
            this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
            this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
            this.mVolumeGroupAdapter.notifyDataSetChanged();
            if (z && this.mIsGroupExpanded && this.mGroupMemberRoutesAdded.size() + this.mGroupMemberRoutesRemoved.size() > 0) {
                animateGroupListItems(itemBoundMap, itemBitmapMap);
                return;
            }
            this.mGroupMemberRoutesAdded = null;
            this.mGroupMemberRoutesRemoved = null;
        }
    }

    private static void setLayoutHeight(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private void setMediaSession(Token token) {
        PlaybackStateCompat playbackStateCompat = null;
        if (this.mMediaController != null) {
            this.mMediaController.unregisterCallback(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            try {
                this.mMediaController = new MediaControllerCompat(this.mContext, token);
            } catch (Throwable e) {
                Log.e(TAG, "Error creating media controller in setMediaSession.", e);
            }
            if (this.mMediaController != null) {
                this.mMediaController.registerCallback(this.mControllerCallback);
            }
            MediaMetadataCompat metadata = this.mMediaController == null ? null : this.mMediaController.getMetadata();
            this.mDescription = metadata == null ? null : metadata.getDescription();
            if (this.mMediaController != null) {
                playbackStateCompat = this.mMediaController.getPlaybackState();
            }
            this.mState = playbackStateCompat;
            update(false);
        }
    }

    private void startGroupListFadeInAnimation() {
        clearGroupListAnimation(true);
        this.mVolumeGroupList.requestLayout();
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.startGroupListFadeInAnimationInternal();
            }
        });
    }

    private void startGroupListFadeInAnimationInternal() {
        if (this.mGroupMemberRoutesAdded == null || this.mGroupMemberRoutesAdded.size() == 0) {
            finishAnimation(true);
        } else {
            fadeInAddedRoutes();
        }
    }

    private void update(boolean z) {
        if (!this.mRoute.isSelected() || this.mRoute.isDefaultOrBluetooth()) {
            dismiss();
        } else if (this.mCreated) {
            this.mRouteNameTextView.setText(this.mRoute.getName());
            this.mDisconnectButton.setVisibility(this.mRoute.canDisconnect() ? 0 : 8);
            if (this.mCustomControlView == null) {
                if (this.mFetchArtTask != null) {
                    this.mFetchArtTask.cancel(true);
                }
                this.mFetchArtTask = new FetchArtTask(this);
                this.mFetchArtTask.execute(new Void[0]);
            }
            updateVolumeControlLayout();
            updatePlaybackControlLayout();
            updateLayoutHeight(z);
        }
    }

    private void updateLayoutHeight(final boolean z) {
        this.mDefaultControlLayout.requestLayout();
        this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (MediaRouteControllerDialog.this.mIsGroupListAnimating) {
                    MediaRouteControllerDialog.this.mIsGroupListAnimationPending = true;
                } else {
                    MediaRouteControllerDialog.this.updateLayoutHeightInternal(z);
                }
            }
        });
    }

    private void updateLayoutHeightInternal(boolean z) {
        int desiredArtHeight;
        int mainControllerHeight;
        int size;
        Rect rect;
        int height;
        int mainControllerHeight2;
        boolean z2 = true;
        int layoutHeight = getLayoutHeight(this.mMediaMainControlLayout);
        setLayoutHeight(this.mMediaMainControlLayout, -1);
        updateMediaControlVisibility(canShowPlaybackControlLayout());
        View decorView = getWindow().getDecorView();
        decorView.measure(MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        setLayoutHeight(this.mMediaMainControlLayout, layoutHeight);
        if (this.mCustomControlView == null && (this.mArtView.getDrawable() instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) this.mArtView.getDrawable()).getBitmap();
            if (bitmap != null) {
                desiredArtHeight = getDesiredArtHeight(bitmap.getWidth(), bitmap.getHeight());
                this.mArtView.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ScaleType.FIT_XY : ScaleType.FIT_CENTER);
                layoutHeight = desiredArtHeight;
                mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
                size = this.mGroupMemberRoutes.size();
                desiredArtHeight = getGroup() != null ? 0 : this.mVolumeGroupListItemHeight * getGroup().getRoutes().size();
                if (size > 0) {
                    desiredArtHeight += this.mVolumeGroupListPaddingTop;
                }
                desiredArtHeight = Math.min(desiredArtHeight, this.mVolumeGroupListMaxHeight);
                if (!this.mIsGroupExpanded) {
                    desiredArtHeight = 0;
                }
                size = Math.max(layoutHeight, desiredArtHeight) + mainControllerHeight;
                rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
                if (this.mCustomControlView == null || layoutHeight <= 0 || size > height) {
                    if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
                        this.mArtView.setVisibility(8);
                    }
                    layoutHeight = desiredArtHeight + mainControllerHeight;
                    size = 0;
                } else {
                    this.mArtView.setVisibility(0);
                    setLayoutHeight(this.mArtView, layoutHeight);
                    int i = size;
                    size = layoutHeight;
                    layoutHeight = i;
                }
                if (canShowPlaybackControlLayout() || r0 > height) {
                    this.mPlaybackControlLayout.setVisibility(8);
                } else {
                    this.mPlaybackControlLayout.setVisibility(0);
                }
                updateMediaControlVisibility(this.mPlaybackControlLayout.getVisibility() != 0);
                if (this.mPlaybackControlLayout.getVisibility() != 0) {
                    z2 = false;
                }
                mainControllerHeight2 = getMainControllerHeight(z2);
                layoutHeight = Math.max(size, desiredArtHeight) + mainControllerHeight2;
                if (layoutHeight > height) {
                    desiredArtHeight -= layoutHeight - height;
                    layoutHeight = height;
                }
                this.mMediaMainControlLayout.clearAnimation();
                this.mVolumeGroupList.clearAnimation();
                this.mDefaultControlLayout.clearAnimation();
                if (z) {
                    setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
                    setLayoutHeight(this.mVolumeGroupList, desiredArtHeight);
                    setLayoutHeight(this.mDefaultControlLayout, layoutHeight);
                } else {
                    animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
                    animateLayoutHeight(this.mVolumeGroupList, desiredArtHeight);
                    animateLayoutHeight(this.mDefaultControlLayout, layoutHeight);
                }
                setLayoutHeight(this.mExpandableAreaLayout, rect.height());
                rebuildVolumeGroupList(z);
            }
        }
        layoutHeight = 0;
        mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
        size = this.mGroupMemberRoutes.size();
        if (getGroup() != null) {
        }
        if (size > 0) {
            desiredArtHeight += this.mVolumeGroupListPaddingTop;
        }
        desiredArtHeight = Math.min(desiredArtHeight, this.mVolumeGroupListMaxHeight);
        if (this.mIsGroupExpanded) {
            desiredArtHeight = 0;
        }
        size = Math.max(layoutHeight, desiredArtHeight) + mainControllerHeight;
        rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
        if (this.mCustomControlView == null) {
        }
        if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
            this.mArtView.setVisibility(8);
        }
        layoutHeight = desiredArtHeight + mainControllerHeight;
        size = 0;
        if (canShowPlaybackControlLayout()) {
        }
        this.mPlaybackControlLayout.setVisibility(8);
        if (this.mPlaybackControlLayout.getVisibility() != 0) {
        }
        updateMediaControlVisibility(this.mPlaybackControlLayout.getVisibility() != 0);
        if (this.mPlaybackControlLayout.getVisibility() != 0) {
            z2 = false;
        }
        mainControllerHeight2 = getMainControllerHeight(z2);
        layoutHeight = Math.max(size, desiredArtHeight) + mainControllerHeight2;
        if (layoutHeight > height) {
            desiredArtHeight -= layoutHeight - height;
            layoutHeight = height;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (z) {
            setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            setLayoutHeight(this.mVolumeGroupList, desiredArtHeight);
            setLayoutHeight(this.mDefaultControlLayout, layoutHeight);
        } else {
            animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            animateLayoutHeight(this.mVolumeGroupList, desiredArtHeight);
            animateLayoutHeight(this.mDefaultControlLayout, layoutHeight);
        }
        setLayoutHeight(this.mExpandableAreaLayout, rect.height());
        rebuildVolumeGroupList(z);
    }

    private void updateMediaControlVisibility(boolean z) {
        int i = 8;
        View view = this.mDividerView;
        int i2 = (this.mVolumeControlLayout.getVisibility() == 0 && z) ? 0 : 8;
        view.setVisibility(i2);
        LinearLayout linearLayout = this.mMediaMainControlLayout;
        if (this.mVolumeControlLayout.getVisibility() != 8 || z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    private void updatePlaybackControlLayout() {
        CharSequence charSequence = null;
        int i = 1;
        if (canShowPlaybackControlLayout()) {
            int i2;
            int i3;
            CharSequence title = this.mDescription == null ? null : this.mDescription.getTitle();
            int i4 = !TextUtils.isEmpty(title) ? 1 : 0;
            if (this.mDescription != null) {
                charSequence = this.mDescription.getSubtitle();
            }
            int i5 = !TextUtils.isEmpty(charSequence) ? 1 : 0;
            if (this.mRoute.getPresentationDisplayId() != -1) {
                this.mTitleView.setText(R.string.mr_controller_casting_screen);
                i2 = 0;
                i3 = 1;
            } else if (this.mState == null || this.mState.getState() == 0) {
                this.mTitleView.setText(R.string.mr_controller_no_media_selected);
                i2 = 0;
                i3 = 1;
            } else if (i4 == 0 && i5 == 0) {
                this.mTitleView.setText(R.string.mr_controller_no_info_available);
                i2 = 0;
                i3 = 1;
            } else {
                if (i4 != 0) {
                    this.mTitleView.setText(title);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i5 != 0) {
                    this.mSubtitleView.setText(charSequence);
                    i3 = i2;
                    i2 = 1;
                } else {
                    i3 = i2;
                    i2 = 0;
                }
            }
            this.mTitleView.setVisibility(i3 != 0 ? 0 : 8);
            this.mSubtitleView.setVisibility(i2 != 0 ? 0 : 8);
            if (this.mState != null) {
                i2 = (this.mState.getState() == 6 || this.mState.getState() == 3) ? 1 : 0;
                i3 = (this.mState.getActions() & 516) != 0 ? 1 : 0;
                if ((this.mState.getActions() & 514) == 0) {
                    i = 0;
                }
                if (i2 != 0 && r3 != 0) {
                    this.mPlayPauseButton.setVisibility(0);
                    this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, R.attr.mediaRoutePauseDrawable));
                    this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(R.string.mr_controller_pause));
                } else if (i2 != 0 || i3 == 0) {
                    this.mPlayPauseButton.setVisibility(8);
                } else {
                    this.mPlayPauseButton.setVisibility(0);
                    this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, R.attr.mediaRoutePlayDrawable));
                    this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(R.string.mr_controller_play));
                }
            }
        }
    }

    private void updateVolumeControlLayout() {
        int i = 8;
        if (!isVolumeControlAvailable(this.mRoute)) {
            this.mVolumeControlLayout.setVisibility(8);
        } else if (this.mVolumeControlLayout.getVisibility() == 8) {
            this.mVolumeControlLayout.setVisibility(0);
            this.mVolumeSlider.setMax(this.mRoute.getVolumeMax());
            this.mVolumeSlider.setProgress(this.mRoute.getVolume());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.mGroupExpandCollapseButton;
            if (getGroup() != null) {
                i = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i);
        }
    }

    private void updateVolumeGroupItemHeight(View view) {
        setLayoutHeight((LinearLayout) view.findViewById(R.id.volume_item_container), this.mVolumeGroupListItemHeight);
        View findViewById = view.findViewById(R.id.mr_volume_item_icon);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = this.mVolumeGroupListItemIconSize;
        layoutParams.height = this.mVolumeGroupListItemIconSize;
        findViewById.setLayoutParams(layoutParams);
    }

    private static boolean uriEquals(Uri uri, Uri uri2) {
        return (uri == null || !uri.equals(uri2)) ? uri == null && uri2 == null : true;
    }

    void clearGroupListAnimation(boolean z) {
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            RouteInfo routeInfo = (RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
            if (!z || this.mGroupMemberRoutesAdded == null || !this.mGroupMemberRoutesAdded.contains(routeInfo)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                Animation animationSet = new AnimationSet(true);
                Animation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.mVolumeGroupList.stopAnimationAll();
        if (!z) {
            finishAnimation(false);
        }
    }

    public View getMediaControlView() {
        return this.mCustomControlView;
    }

    public Token getMediaSession() {
        return this.mMediaController == null ? null : this.mMediaController.getSessionToken();
    }

    public RouteInfo getRoute() {
        return this.mRoute;
    }

    public boolean isVolumeControlEnabled() {
        return this.mVolumeControlEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(AsyncImageView.a);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(BUTTON_NEUTRAL_RES_ID).setVisibility(8);
        OnClickListener clickListener = new ClickListener();
        this.mExpandableAreaLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.mExpandableAreaLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MediaRouteControllerDialog.this.dismiss();
            }
        });
        this.mDialogAreaLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.mDialogAreaLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
            }
        });
        int buttonTextColor = MediaRouterThemeHelper.getButtonTextColor(this.mContext);
        this.mDisconnectButton = (Button) findViewById(BUTTON_DISCONNECT_RES_ID);
        this.mDisconnectButton.setText(R.string.mr_controller_disconnect);
        this.mDisconnectButton.setTextColor(buttonTextColor);
        this.mDisconnectButton.setOnClickListener(clickListener);
        this.mStopCastingButton = (Button) findViewById(BUTTON_STOP_RES_ID);
        this.mStopCastingButton.setText(R.string.mr_controller_stop);
        this.mStopCastingButton.setTextColor(buttonTextColor);
        this.mStopCastingButton.setOnClickListener(clickListener);
        this.mRouteNameTextView = (TextView) findViewById(R.id.mr_name);
        this.mCloseButton = (ImageButton) findViewById(R.id.mr_close);
        this.mCloseButton.setOnClickListener(clickListener);
        this.mCustomControlLayout = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.mDefaultControlLayout = (FrameLayout) findViewById(R.id.mr_default_control);
        OnClickListener anonymousClass4 = new OnClickListener() {
            public void onClick(View view) {
                if (MediaRouteControllerDialog.this.mMediaController != null) {
                    PendingIntent sessionActivity = MediaRouteControllerDialog.this.mMediaController.getSessionActivity();
                    if (sessionActivity != null) {
                        try {
                            sessionActivity.send();
                            MediaRouteControllerDialog.this.dismiss();
                        } catch (CanceledException e) {
                            Log.e(MediaRouteControllerDialog.TAG, sessionActivity + " was not sent, it had been canceled.");
                        }
                    }
                }
            }
        };
        this.mArtView = (ImageView) findViewById(R.id.mr_art);
        this.mArtView.setOnClickListener(anonymousClass4);
        findViewById(R.id.mr_control_title_container).setOnClickListener(anonymousClass4);
        this.mMediaMainControlLayout = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.mDividerView = findViewById(R.id.mr_control_divider);
        this.mPlaybackControlLayout = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.mTitleView = (TextView) findViewById(R.id.mr_control_title);
        this.mSubtitleView = (TextView) findViewById(R.id.mr_control_subtitle);
        this.mPlayPauseButton = (ImageButton) findViewById(R.id.mr_control_play_pause);
        this.mPlayPauseButton.setOnClickListener(clickListener);
        this.mVolumeControlLayout = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.mVolumeControlLayout.setVisibility(8);
        this.mVolumeSlider = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.mVolumeSlider.setTag(this.mRoute);
        this.mVolumeChangeListener = new VolumeChangeListener();
        this.mVolumeSlider.setOnSeekBarChangeListener(this.mVolumeChangeListener);
        this.mVolumeGroupList = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.mGroupMemberRoutes = new ArrayList();
        this.mVolumeGroupAdapter = new VolumeGroupAdapter(this.mContext, this.mGroupMemberRoutes);
        this.mVolumeGroupList.setAdapter(this.mVolumeGroupAdapter);
        this.mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
        MediaRouterThemeHelper.setMediaControlsBackgroundColor(this.mContext, this.mMediaMainControlLayout, this.mVolumeGroupList, getGroup() != null);
        MediaRouterThemeHelper.setVolumeSliderColor(this.mContext, (MediaRouteVolumeSlider) this.mVolumeSlider, this.mMediaMainControlLayout);
        this.mVolumeSliderMap = new HashMap();
        this.mVolumeSliderMap.put(this.mRoute, this.mVolumeSlider);
        this.mGroupExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.mGroupExpandCollapseButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MediaRouteControllerDialog.this.mIsGroupExpanded = !MediaRouteControllerDialog.this.mIsGroupExpanded;
                if (MediaRouteControllerDialog.this.mIsGroupExpanded) {
                    MediaRouteControllerDialog.this.mVolumeGroupList.setVisibility(0);
                }
                MediaRouteControllerDialog.this.loadInterpolator();
                MediaRouteControllerDialog.this.updateLayoutHeight(true);
            }
        });
        loadInterpolator();
        this.mGroupListAnimationDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.mGroupListFadeInDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.mGroupListFadeOutDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.mCustomControlView = onCreateMediaControlView(bundle);
        if (this.mCustomControlView != null) {
            this.mCustomControlLayout.addView(this.mCustomControlView);
            this.mCustomControlLayout.setVisibility(0);
        }
        this.mCreated = true;
        updateLayout();
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    public void onDetachedFromWindow() {
        this.mRouter.removeCallback(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        this.mRoute.requestUpdateVolume(i == 25 ? -1 : 1);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return (i == 25 || i == 24) ? true : super.onKeyUp(i, keyEvent);
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.mVolumeControlEnabled != z) {
            this.mVolumeControlEnabled = z;
            if (this.mCreated) {
                updateVolumeControlLayout();
                updateLayoutHeight(false);
            }
        }
    }

    void updateLayout() {
        int dialogWidth = MediaRouteDialogHelper.getDialogWidth(this.mContext);
        getWindow().setLayout(dialogWidth, -2);
        View decorView = getWindow().getDecorView();
        this.mDialogContentWidth = (dialogWidth - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.mContext.getResources();
        this.mVolumeGroupListItemIconSize = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.mVolumeGroupListItemHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.mVolumeGroupListMaxHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        update(false);
    }
}
