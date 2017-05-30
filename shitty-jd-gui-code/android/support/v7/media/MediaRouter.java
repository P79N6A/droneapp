package android.support.v7.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.hardware.display.DisplayManagerCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class MediaRouter
{
  public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
  public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
  public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
  public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
  public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
  public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
  private static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
  private static final String TAG = "MediaRouter";
  public static final int UNSELECT_REASON_DISCONNECTED = 1;
  public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
  public static final int UNSELECT_REASON_STOPPED = 2;
  public static final int UNSELECT_REASON_UNKNOWN = 0;
  static GlobalMediaRouter sGlobal;
  final ArrayList<CallbackRecord> mCallbackRecords = new ArrayList();
  final Context mContext;
  
  MediaRouter(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  static void checkCallingThread()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }
  }
  
  static <T> boolean equal(T paramT1, T paramT2)
  {
    return (paramT1 == paramT2) || ((paramT1 != null) && (paramT2 != null) && (paramT1.equals(paramT2)));
  }
  
  private int findCallbackRecord(Callback paramCallback)
  {
    int j = this.mCallbackRecords.size();
    int i = 0;
    while (i < j)
    {
      if (((CallbackRecord)this.mCallbackRecords.get(i)).mCallback == paramCallback) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public static MediaRouter getInstance(@NonNull Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    checkCallingThread();
    if (sGlobal == null)
    {
      sGlobal = new GlobalMediaRouter(paramContext.getApplicationContext());
      sGlobal.start();
    }
    return sGlobal.getRouter(paramContext);
  }
  
  public void addCallback(MediaRouteSelector paramMediaRouteSelector, Callback paramCallback)
  {
    addCallback(paramMediaRouteSelector, paramCallback, 0);
  }
  
  public void addCallback(@NonNull MediaRouteSelector paramMediaRouteSelector, @NonNull Callback paramCallback, int paramInt)
  {
    int j = 1;
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (paramCallback == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "addCallback: selector=" + paramMediaRouteSelector + ", callback=" + paramCallback + ", flags=" + Integer.toHexString(paramInt));
    }
    int i = findCallbackRecord(paramCallback);
    if (i < 0)
    {
      paramCallback = new CallbackRecord(this, paramCallback);
      this.mCallbackRecords.add(paramCallback);
      i = 0;
      if (((paramCallback.mFlags ^ 0xFFFFFFFF) & paramInt) != 0)
      {
        paramCallback.mFlags |= paramInt;
        i = 1;
      }
      if (paramCallback.mSelector.contains(paramMediaRouteSelector)) {
        break label207;
      }
      paramCallback.mSelector = new MediaRouteSelector.Builder(paramCallback.mSelector).addSelector(paramMediaRouteSelector).build();
    }
    label207:
    for (paramInt = j;; paramInt = i)
    {
      if (paramInt != 0) {
        sGlobal.updateDiscoveryRequest();
      }
      return;
      paramCallback = (CallbackRecord)this.mCallbackRecords.get(i);
      break;
    }
  }
  
  public void addProvider(@NonNull MediaRouteProvider paramMediaRouteProvider)
  {
    if (paramMediaRouteProvider == null) {
      throw new IllegalArgumentException("providerInstance must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "addProvider: " + paramMediaRouteProvider);
    }
    sGlobal.addProvider(paramMediaRouteProvider);
  }
  
  public void addRemoteControlClient(@NonNull Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("remoteControlClient must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "addRemoteControlClient: " + paramObject);
    }
    sGlobal.addRemoteControlClient(paramObject);
  }
  
  @NonNull
  public RouteInfo getDefaultRoute()
  {
    checkCallingThread();
    return sGlobal.getDefaultRoute();
  }
  
  public MediaSessionCompat.Token getMediaSessionToken()
  {
    return sGlobal.getMediaSessionToken();
  }
  
  public List<ProviderInfo> getProviders()
  {
    checkCallingThread();
    return sGlobal.getProviders();
  }
  
  public List<RouteInfo> getRoutes()
  {
    checkCallingThread();
    return sGlobal.getRoutes();
  }
  
  @NonNull
  public RouteInfo getSelectedRoute()
  {
    checkCallingThread();
    return sGlobal.getSelectedRoute();
  }
  
  public boolean isRouteAvailable(@NonNull MediaRouteSelector paramMediaRouteSelector, int paramInt)
  {
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    checkCallingThread();
    return sGlobal.isRouteAvailable(paramMediaRouteSelector, paramInt);
  }
  
  public void removeCallback(@NonNull Callback paramCallback)
  {
    if (paramCallback == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "removeCallback: callback=" + paramCallback);
    }
    int i = findCallbackRecord(paramCallback);
    if (i >= 0)
    {
      this.mCallbackRecords.remove(i);
      sGlobal.updateDiscoveryRequest();
    }
  }
  
  public void removeProvider(@NonNull MediaRouteProvider paramMediaRouteProvider)
  {
    if (paramMediaRouteProvider == null) {
      throw new IllegalArgumentException("providerInstance must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "removeProvider: " + paramMediaRouteProvider);
    }
    sGlobal.removeProvider(paramMediaRouteProvider);
  }
  
  public void removeRemoteControlClient(@NonNull Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("remoteControlClient must not be null");
    }
    if (DEBUG) {
      Log.d("MediaRouter", "removeRemoteControlClient: " + paramObject);
    }
    sGlobal.removeRemoteControlClient(paramObject);
  }
  
  public void selectRoute(@NonNull RouteInfo paramRouteInfo)
  {
    if (paramRouteInfo == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "selectRoute: " + paramRouteInfo);
    }
    sGlobal.selectRoute(paramRouteInfo);
  }
  
  public void setMediaSession(Object paramObject)
  {
    if (DEBUG) {
      Log.d("MediaRouter", "addMediaSession: " + paramObject);
    }
    sGlobal.setMediaSession(paramObject);
  }
  
  public void setMediaSessionCompat(MediaSessionCompat paramMediaSessionCompat)
  {
    if (DEBUG) {
      Log.d("MediaRouter", "addMediaSessionCompat: " + paramMediaSessionCompat);
    }
    sGlobal.setMediaSessionCompat(paramMediaSessionCompat);
  }
  
  public void unselect(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3)) {
      throw new IllegalArgumentException("Unsupported reason to unselect route");
    }
    checkCallingThread();
    RouteInfo localRouteInfo = sGlobal.chooseFallbackRoute();
    if (sGlobal.getSelectedRoute() != localRouteInfo)
    {
      sGlobal.selectRoute(localRouteInfo, paramInt);
      return;
    }
    sGlobal.selectRoute(sGlobal.getDefaultRoute(), paramInt);
  }
  
  @NonNull
  public RouteInfo updateSelectedRoute(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    checkCallingThread();
    if (DEBUG) {
      Log.d("MediaRouter", "updateSelectedRoute: " + paramMediaRouteSelector);
    }
    RouteInfo localRouteInfo2 = sGlobal.getSelectedRoute();
    RouteInfo localRouteInfo1 = localRouteInfo2;
    if (!localRouteInfo2.isDefaultOrBluetooth())
    {
      localRouteInfo1 = localRouteInfo2;
      if (!localRouteInfo2.matchesSelector(paramMediaRouteSelector))
      {
        localRouteInfo1 = sGlobal.chooseFallbackRoute();
        sGlobal.selectRoute(localRouteInfo1);
      }
    }
    return localRouteInfo1;
  }
  
  public static abstract class Callback
  {
    public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo) {}
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      onRouteUnselected(paramMediaRouter, paramRouteInfo);
    }
    
    public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {}
  }
  
  private static final class CallbackRecord
  {
    public final MediaRouter.Callback mCallback;
    public int mFlags;
    public final MediaRouter mRouter;
    public MediaRouteSelector mSelector;
    
    public CallbackRecord(MediaRouter paramMediaRouter, MediaRouter.Callback paramCallback)
    {
      this.mRouter = paramMediaRouter;
      this.mCallback = paramCallback;
      this.mSelector = MediaRouteSelector.EMPTY;
    }
    
    public boolean filterRouteEvent(MediaRouter.RouteInfo paramRouteInfo)
    {
      return ((this.mFlags & 0x2) != 0) || (paramRouteInfo.matchesSelector(this.mSelector));
    }
  }
  
  public static abstract class ControlRequestCallback
  {
    public void onError(String paramString, Bundle paramBundle) {}
    
    public void onResult(Bundle paramBundle) {}
  }
  
  private static final class GlobalMediaRouter
    implements RegisteredMediaRouteProviderWatcher.Callback, SystemMediaRouteProvider.SyncCallback
  {
    private final Context mApplicationContext;
    private final CallbackHandler mCallbackHandler = new CallbackHandler(null);
    private MediaSessionCompat mCompatSession;
    private MediaRouter.RouteInfo mDefaultRoute;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private final DisplayManagerCompat mDisplayManager;
    private Map<String, MediaRouteProvider.RouteController> mGroupMemberControllers;
    private final boolean mLowRam;
    private MediaSessionRecord mMediaSession;
    private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
    private final ProviderCallback mProviderCallback = new ProviderCallback(null);
    private final ArrayList<MediaRouter.ProviderInfo> mProviders = new ArrayList();
    private MediaSessionCompat mRccMediaSession;
    private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
    private final ArrayList<RemoteControlClientRecord> mRemoteControlClients = new ArrayList();
    private final ArrayList<WeakReference<MediaRouter>> mRouters = new ArrayList();
    private final ArrayList<MediaRouter.RouteInfo> mRoutes = new ArrayList();
    private MediaRouter.RouteInfo mSelectedRoute;
    private MediaRouteProvider.RouteController mSelectedRouteController;
    private MediaSessionCompat.OnActiveChangeListener mSessionActiveListener = new MediaSessionCompat.OnActiveChangeListener()
    {
      public void onActiveChanged()
      {
        if (MediaRouter.GlobalMediaRouter.this.mRccMediaSession != null)
        {
          if (MediaRouter.GlobalMediaRouter.this.mRccMediaSession.isActive()) {
            MediaRouter.GlobalMediaRouter.this.addRemoteControlClient(MediaRouter.GlobalMediaRouter.this.mRccMediaSession.getRemoteControlClient());
          }
        }
        else {
          return;
        }
        MediaRouter.GlobalMediaRouter.this.removeRemoteControlClient(MediaRouter.GlobalMediaRouter.this.mRccMediaSession.getRemoteControlClient());
      }
    };
    private final SystemMediaRouteProvider mSystemProvider;
    private final Map<Pair<String, String>, String> mUniqueIdMap = new HashMap();
    
    GlobalMediaRouter(Context paramContext)
    {
      this.mApplicationContext = paramContext;
      this.mDisplayManager = DisplayManagerCompat.getInstance(paramContext);
      this.mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager)paramContext.getSystemService("activity"));
      this.mSystemProvider = SystemMediaRouteProvider.obtain(paramContext, this);
      addProvider(this.mSystemProvider);
    }
    
    private String assignRouteUniqueId(MediaRouter.ProviderInfo paramProviderInfo, String paramString)
    {
      paramProviderInfo = paramProviderInfo.getComponentName().flattenToShortString();
      String str1 = paramProviderInfo + ":" + paramString;
      if (findRouteByUniqueId(str1) < 0)
      {
        this.mUniqueIdMap.put(new Pair(paramProviderInfo, paramString), str1);
        return str1;
      }
      Log.w("MediaRouter", "Either " + paramString + " isn't unique in " + paramProviderInfo + " or we're trying to assign a unique ID for an already added route");
      int i = 2;
      for (;;)
      {
        String str2 = String.format(Locale.US, "%s_%d", new Object[] { str1, Integer.valueOf(i) });
        if (findRouteByUniqueId(str2) < 0)
        {
          this.mUniqueIdMap.put(new Pair(paramProviderInfo, paramString), str2);
          return str2;
        }
        i += 1;
      }
    }
    
    private int findProviderInfo(MediaRouteProvider paramMediaRouteProvider)
    {
      int j = this.mProviders.size();
      int i = 0;
      while (i < j)
      {
        if (MediaRouter.ProviderInfo.access$800((MediaRouter.ProviderInfo)this.mProviders.get(i)) == paramMediaRouteProvider) {
          return i;
        }
        i += 1;
      }
      return -1;
    }
    
    private int findRemoteControlClientRecord(Object paramObject)
    {
      int j = this.mRemoteControlClients.size();
      int i = 0;
      while (i < j)
      {
        if (((RemoteControlClientRecord)this.mRemoteControlClients.get(i)).getRemoteControlClient() == paramObject) {
          return i;
        }
        i += 1;
      }
      return -1;
    }
    
    private int findRouteByUniqueId(String paramString)
    {
      int j = this.mRoutes.size();
      int i = 0;
      while (i < j)
      {
        if (MediaRouter.RouteInfo.access$500((MediaRouter.RouteInfo)this.mRoutes.get(i)).equals(paramString)) {
          return i;
        }
        i += 1;
      }
      return -1;
    }
    
    private String getUniqueId(MediaRouter.ProviderInfo paramProviderInfo, String paramString)
    {
      paramProviderInfo = paramProviderInfo.getComponentName().flattenToShortString();
      return (String)this.mUniqueIdMap.get(new Pair(paramProviderInfo, paramString));
    }
    
    private boolean isRouteSelectable(MediaRouter.RouteInfo paramRouteInfo)
    {
      return (paramRouteInfo.mDescriptor != null) && (MediaRouter.RouteInfo.access$600(paramRouteInfo));
    }
    
    private boolean isSystemDefaultRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      return (paramRouteInfo.getProviderInstance() == this.mSystemProvider) && (MediaRouter.RouteInfo.access$100(paramRouteInfo).equals("DEFAULT_ROUTE"));
    }
    
    private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      return (paramRouteInfo.getProviderInstance() == this.mSystemProvider) && (paramRouteInfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO")) && (!paramRouteInfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO"));
    }
    
    private void setSelectedRouteInternal(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if (this.mSelectedRoute != paramRouteInfo)
      {
        Object localObject;
        MediaRouteProvider.RouteController localRouteController;
        if (this.mSelectedRoute != null)
        {
          if (MediaRouter.DEBUG) {
            Log.d("MediaRouter", "Route unselected: " + this.mSelectedRoute + " reason: " + paramInt);
          }
          this.mCallbackHandler.post(263, this.mSelectedRoute, paramInt);
          if (this.mSelectedRouteController != null)
          {
            this.mSelectedRouteController.onUnselect(paramInt);
            this.mSelectedRouteController.onRelease();
            this.mSelectedRouteController = null;
          }
          if (this.mGroupMemberControllers != null)
          {
            localObject = this.mGroupMemberControllers.values().iterator();
            while (((Iterator)localObject).hasNext())
            {
              localRouteController = (MediaRouteProvider.RouteController)((Iterator)localObject).next();
              localRouteController.onUnselect(paramInt);
              localRouteController.onRelease();
            }
            this.mGroupMemberControllers = null;
          }
        }
        this.mSelectedRoute = paramRouteInfo;
        if (this.mSelectedRoute != null)
        {
          this.mSelectedRouteController = paramRouteInfo.getProviderInstance().onCreateRouteController(MediaRouter.RouteInfo.access$100(paramRouteInfo));
          if (this.mSelectedRouteController != null) {
            this.mSelectedRouteController.onSelect();
          }
          if (MediaRouter.DEBUG) {
            Log.d("MediaRouter", "Route selected: " + this.mSelectedRoute);
          }
          this.mCallbackHandler.post(262, this.mSelectedRoute);
          if ((this.mSelectedRoute instanceof MediaRouter.RouteGroup))
          {
            this.mGroupMemberControllers = new HashMap();
            paramRouteInfo = ((MediaRouter.RouteGroup)this.mSelectedRoute).getRoutes().iterator();
            while (paramRouteInfo.hasNext())
            {
              localObject = (MediaRouter.RouteInfo)paramRouteInfo.next();
              localRouteController = ((MediaRouter.RouteInfo)localObject).getProviderInstance().onCreateRouteController(MediaRouter.RouteInfo.access$100((MediaRouter.RouteInfo)localObject));
              localRouteController.onSelect();
              this.mGroupMemberControllers.put(MediaRouter.RouteInfo.access$100((MediaRouter.RouteInfo)localObject), localRouteController);
            }
          }
        }
        updatePlaybackInfoFromSelectedRoute();
      }
    }
    
    private void updatePlaybackInfoFromSelectedRoute()
    {
      if (this.mSelectedRoute != null)
      {
        this.mPlaybackInfo.volume = this.mSelectedRoute.getVolume();
        this.mPlaybackInfo.volumeMax = this.mSelectedRoute.getVolumeMax();
        this.mPlaybackInfo.volumeHandling = this.mSelectedRoute.getVolumeHandling();
        this.mPlaybackInfo.playbackStream = this.mSelectedRoute.getPlaybackStream();
        this.mPlaybackInfo.playbackType = this.mSelectedRoute.getPlaybackType();
        int j = this.mRemoteControlClients.size();
        i = 0;
        while (i < j)
        {
          ((RemoteControlClientRecord)this.mRemoteControlClients.get(i)).updatePlaybackInfo();
          i += 1;
        }
        if (this.mMediaSession != null)
        {
          if (this.mSelectedRoute == getDefaultRoute()) {
            this.mMediaSession.clearVolumeHandling();
          }
        }
        else {
          return;
        }
        if (this.mPlaybackInfo.volumeHandling != 1) {
          break label190;
        }
      }
      label190:
      for (int i = 2;; i = 0)
      {
        this.mMediaSession.configureVolume(i, this.mPlaybackInfo.volumeMax, this.mPlaybackInfo.volume);
        return;
        if (this.mMediaSession == null) {
          break;
        }
        this.mMediaSession.clearVolumeHandling();
        return;
      }
    }
    
    private void updateProviderContents(MediaRouter.ProviderInfo paramProviderInfo, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      int k;
      int i;
      boolean bool3;
      boolean bool1;
      boolean bool2;
      int j;
      Object localObject2;
      Object localObject3;
      Object localObject1;
      MediaRouteDescriptor localMediaRouteDescriptor;
      int n;
      Object localObject4;
      if (paramProviderInfo.updateDescriptor(paramMediaRouteProviderDescriptor))
      {
        k = 0;
        i = 0;
        bool3 = false;
        bool1 = false;
        bool2 = bool3;
        j = k;
        if (paramMediaRouteProviderDescriptor != null) {
          if (paramMediaRouteProviderDescriptor.isValid())
          {
            localObject2 = paramMediaRouteProviderDescriptor.getRoutes();
            int m = ((List)localObject2).size();
            localObject3 = new ArrayList();
            localObject1 = new ArrayList();
            k = 0;
            if (k < m)
            {
              localMediaRouteDescriptor = (MediaRouteDescriptor)((List)localObject2).get(k);
              paramMediaRouteProviderDescriptor = localMediaRouteDescriptor.getId();
              n = paramProviderInfo.findRouteByDescriptorId(paramMediaRouteProviderDescriptor);
              if (n < 0)
              {
                localObject4 = assignRouteUniqueId(paramProviderInfo, paramMediaRouteProviderDescriptor);
                if (localMediaRouteDescriptor.getGroupMemberIds() != null)
                {
                  j = 1;
                  label132:
                  if (j == 0) {
                    break label211;
                  }
                  paramMediaRouteProviderDescriptor = new MediaRouter.RouteGroup(paramProviderInfo, paramMediaRouteProviderDescriptor, (String)localObject4);
                  label149:
                  MediaRouter.ProviderInfo.access$900(paramProviderInfo).add(i, paramMediaRouteProviderDescriptor);
                  this.mRoutes.add(paramMediaRouteProviderDescriptor);
                  if (j == 0) {
                    break label226;
                  }
                  ((List)localObject3).add(new Pair(paramMediaRouteProviderDescriptor, localMediaRouteDescriptor));
                  label192:
                  i += 1;
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        k += 1;
        break;
        j = 0;
        break label132;
        label211:
        paramMediaRouteProviderDescriptor = new MediaRouter.RouteInfo(paramProviderInfo, paramMediaRouteProviderDescriptor, (String)localObject4);
        break label149;
        label226:
        paramMediaRouteProviderDescriptor.maybeUpdateDescriptor(localMediaRouteDescriptor);
        if (MediaRouter.DEBUG) {
          Log.d("MediaRouter", "Route added: " + paramMediaRouteProviderDescriptor);
        }
        this.mCallbackHandler.post(257, paramMediaRouteProviderDescriptor);
        break label192;
        if (n < i)
        {
          Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + localMediaRouteDescriptor);
        }
        else
        {
          paramMediaRouteProviderDescriptor = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$900(paramProviderInfo).get(n);
          localObject4 = MediaRouter.ProviderInfo.access$900(paramProviderInfo);
          j = i + 1;
          Collections.swap((List)localObject4, n, i);
          if ((paramMediaRouteProviderDescriptor instanceof MediaRouter.RouteGroup))
          {
            ((List)localObject1).add(new Pair(paramMediaRouteProviderDescriptor, localMediaRouteDescriptor));
            i = j;
          }
          else if ((updateRouteDescriptorAndNotify(paramMediaRouteProviderDescriptor, localMediaRouteDescriptor) != 0) && (paramMediaRouteProviderDescriptor == this.mSelectedRoute))
          {
            bool1 = true;
            i = j;
            continue;
            paramMediaRouteProviderDescriptor = ((List)localObject3).iterator();
            while (paramMediaRouteProviderDescriptor.hasNext())
            {
              localObject2 = (Pair)paramMediaRouteProviderDescriptor.next();
              localObject3 = (MediaRouter.RouteInfo)((Pair)localObject2).first;
              ((MediaRouter.RouteInfo)localObject3).maybeUpdateDescriptor((MediaRouteDescriptor)((Pair)localObject2).second);
              if (MediaRouter.DEBUG) {
                Log.d("MediaRouter", "Route added: " + localObject3);
              }
              this.mCallbackHandler.post(257, localObject3);
            }
            paramMediaRouteProviderDescriptor = ((List)localObject1).iterator();
            for (;;)
            {
              bool2 = bool1;
              j = i;
              if (!paramMediaRouteProviderDescriptor.hasNext()) {
                break;
              }
              localObject1 = (Pair)paramMediaRouteProviderDescriptor.next();
              localObject2 = (MediaRouter.RouteInfo)((Pair)localObject1).first;
              if ((updateRouteDescriptorAndNotify((MediaRouter.RouteInfo)localObject2, (MediaRouteDescriptor)((Pair)localObject1).second) != 0) && (localObject2 == this.mSelectedRoute)) {
                bool1 = true;
              }
            }
            Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + paramMediaRouteProviderDescriptor);
            j = k;
            bool2 = bool3;
            i = MediaRouter.ProviderInfo.access$900(paramProviderInfo).size() - 1;
            while (i >= j)
            {
              paramMediaRouteProviderDescriptor = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$900(paramProviderInfo).get(i);
              paramMediaRouteProviderDescriptor.maybeUpdateDescriptor(null);
              this.mRoutes.remove(paramMediaRouteProviderDescriptor);
              i -= 1;
            }
            updateSelectedRouteIfNeeded(bool2);
            i = MediaRouter.ProviderInfo.access$900(paramProviderInfo).size() - 1;
            while (i >= j)
            {
              paramMediaRouteProviderDescriptor = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$900(paramProviderInfo).remove(i);
              if (MediaRouter.DEBUG) {
                Log.d("MediaRouter", "Route removed: " + paramMediaRouteProviderDescriptor);
              }
              this.mCallbackHandler.post(258, paramMediaRouteProviderDescriptor);
              i -= 1;
            }
            if (MediaRouter.DEBUG) {
              Log.d("MediaRouter", "Provider changed: " + paramProviderInfo);
            }
            this.mCallbackHandler.post(515, paramProviderInfo);
          }
          else
          {
            i = j;
          }
        }
      }
    }
    
    private void updateProviderDescriptor(MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      int i = findProviderInfo(paramMediaRouteProvider);
      if (i >= 0) {
        updateProviderContents((MediaRouter.ProviderInfo)this.mProviders.get(i), paramMediaRouteProviderDescriptor);
      }
    }
    
    private int updateRouteDescriptorAndNotify(MediaRouter.RouteInfo paramRouteInfo, MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int i = paramRouteInfo.maybeUpdateDescriptor(paramMediaRouteDescriptor);
      if (i != 0)
      {
        if ((i & 0x1) != 0)
        {
          if (MediaRouter.DEBUG) {
            Log.d("MediaRouter", "Route changed: " + paramRouteInfo);
          }
          this.mCallbackHandler.post(259, paramRouteInfo);
        }
        if ((i & 0x2) != 0)
        {
          if (MediaRouter.DEBUG) {
            Log.d("MediaRouter", "Route volume changed: " + paramRouteInfo);
          }
          this.mCallbackHandler.post(260, paramRouteInfo);
        }
        if ((i & 0x4) != 0)
        {
          if (MediaRouter.DEBUG) {
            Log.d("MediaRouter", "Route presentation display changed: " + paramRouteInfo);
          }
          this.mCallbackHandler.post(261, paramRouteInfo);
        }
      }
      return i;
    }
    
    private void updateSelectedRouteIfNeeded(boolean paramBoolean)
    {
      if ((this.mDefaultRoute != null) && (!isRouteSelectable(this.mDefaultRoute)))
      {
        Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.mDefaultRoute);
        this.mDefaultRoute = null;
      }
      if ((this.mDefaultRoute == null) && (!this.mRoutes.isEmpty()))
      {
        Iterator localIterator = this.mRoutes.iterator();
        while (localIterator.hasNext())
        {
          MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
          if ((isSystemDefaultRoute(localRouteInfo)) && (isRouteSelectable(localRouteInfo)))
          {
            this.mDefaultRoute = localRouteInfo;
            Log.i("MediaRouter", "Found default route: " + this.mDefaultRoute);
          }
        }
      }
      if ((this.mSelectedRoute != null) && (!isRouteSelectable(this.mSelectedRoute)))
      {
        Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.mSelectedRoute);
        setSelectedRouteInternal(null, 0);
      }
      if (this.mSelectedRoute == null) {
        setSelectedRouteInternal(chooseFallbackRoute(), 0);
      }
      while (!paramBoolean) {
        return;
      }
      updatePlaybackInfoFromSelectedRoute();
    }
    
    public void addProvider(MediaRouteProvider paramMediaRouteProvider)
    {
      if (findProviderInfo(paramMediaRouteProvider) < 0)
      {
        MediaRouter.ProviderInfo localProviderInfo = new MediaRouter.ProviderInfo(paramMediaRouteProvider);
        this.mProviders.add(localProviderInfo);
        if (MediaRouter.DEBUG) {
          Log.d("MediaRouter", "Provider added: " + localProviderInfo);
        }
        this.mCallbackHandler.post(513, localProviderInfo);
        updateProviderContents(localProviderInfo, paramMediaRouteProvider.getDescriptor());
        paramMediaRouteProvider.setCallback(this.mProviderCallback);
        paramMediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
      }
    }
    
    public void addRemoteControlClient(Object paramObject)
    {
      if (findRemoteControlClientRecord(paramObject) < 0)
      {
        paramObject = new RemoteControlClientRecord(paramObject);
        this.mRemoteControlClients.add(paramObject);
      }
    }
    
    MediaRouter.RouteInfo chooseFallbackRoute()
    {
      Iterator localIterator = this.mRoutes.iterator();
      while (localIterator.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        if ((localRouteInfo != this.mDefaultRoute) && (isSystemLiveAudioOnlyRoute(localRouteInfo)) && (isRouteSelectable(localRouteInfo))) {
          return localRouteInfo;
        }
      }
      return this.mDefaultRoute;
    }
    
    public ContentResolver getContentResolver()
    {
      return this.mApplicationContext.getContentResolver();
    }
    
    public MediaRouter.RouteInfo getDefaultRoute()
    {
      if (this.mDefaultRoute == null) {
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
      }
      return this.mDefaultRoute;
    }
    
    public Display getDisplay(int paramInt)
    {
      return this.mDisplayManager.getDisplay(paramInt);
    }
    
    public MediaSessionCompat.Token getMediaSessionToken()
    {
      if (this.mMediaSession != null) {
        return this.mMediaSession.getToken();
      }
      if (this.mCompatSession != null) {
        return this.mCompatSession.getSessionToken();
      }
      return null;
    }
    
    public Context getProviderContext(String paramString)
    {
      if (paramString.equals("android")) {
        return this.mApplicationContext;
      }
      try
      {
        paramString = this.mApplicationContext.createPackageContext(paramString, 4);
        return paramString;
      }
      catch (PackageManager.NameNotFoundException paramString) {}
      return null;
    }
    
    public List<MediaRouter.ProviderInfo> getProviders()
    {
      return this.mProviders;
    }
    
    public MediaRouter.RouteInfo getRoute(String paramString)
    {
      Iterator localIterator = this.mRoutes.iterator();
      while (localIterator.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        if (MediaRouter.RouteInfo.access$500(localRouteInfo).equals(paramString)) {
          return localRouteInfo;
        }
      }
      return null;
    }
    
    public MediaRouter getRouter(Context paramContext)
    {
      int i = this.mRouters.size();
      for (;;)
      {
        i -= 1;
        if (i >= 0)
        {
          MediaRouter localMediaRouter = (MediaRouter)((WeakReference)this.mRouters.get(i)).get();
          if (localMediaRouter == null) {
            this.mRouters.remove(i);
          } else if (localMediaRouter.mContext == paramContext) {
            return localMediaRouter;
          }
        }
        else
        {
          paramContext = new MediaRouter(paramContext);
          this.mRouters.add(new WeakReference(paramContext));
          return paramContext;
        }
      }
    }
    
    public List<MediaRouter.RouteInfo> getRoutes()
    {
      return this.mRoutes;
    }
    
    public MediaRouter.RouteInfo getSelectedRoute()
    {
      if (this.mSelectedRoute == null) {
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
      }
      return this.mSelectedRoute;
    }
    
    public MediaRouter.RouteInfo getSystemRouteByDescriptorId(String paramString)
    {
      int i = findProviderInfo(this.mSystemProvider);
      if (i >= 0)
      {
        MediaRouter.ProviderInfo localProviderInfo = (MediaRouter.ProviderInfo)this.mProviders.get(i);
        i = localProviderInfo.findRouteByDescriptorId(paramString);
        if (i >= 0) {
          return (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$900(localProviderInfo).get(i);
        }
      }
      return null;
    }
    
    public boolean isRouteAvailable(MediaRouteSelector paramMediaRouteSelector, int paramInt)
    {
      if (paramMediaRouteSelector.isEmpty()) {
        return false;
      }
      if (((paramInt & 0x2) == 0) && (this.mLowRam)) {
        return true;
      }
      int j = this.mRoutes.size();
      int i = 0;
      if (i < j)
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)this.mRoutes.get(i);
        if (((paramInt & 0x1) != 0) && (localRouteInfo.isDefaultOrBluetooth())) {}
        while (!localRouteInfo.matchesSelector(paramMediaRouteSelector))
        {
          i += 1;
          break;
        }
        return true;
      }
      return false;
    }
    
    public void removeProvider(MediaRouteProvider paramMediaRouteProvider)
    {
      int i = findProviderInfo(paramMediaRouteProvider);
      if (i >= 0)
      {
        paramMediaRouteProvider.setCallback(null);
        paramMediaRouteProvider.setDiscoveryRequest(null);
        paramMediaRouteProvider = (MediaRouter.ProviderInfo)this.mProviders.get(i);
        updateProviderContents(paramMediaRouteProvider, null);
        if (MediaRouter.DEBUG) {
          Log.d("MediaRouter", "Provider removed: " + paramMediaRouteProvider);
        }
        this.mCallbackHandler.post(514, paramMediaRouteProvider);
        this.mProviders.remove(i);
      }
    }
    
    public void removeRemoteControlClient(Object paramObject)
    {
      int i = findRemoteControlClientRecord(paramObject);
      if (i >= 0) {
        ((RemoteControlClientRecord)this.mRemoteControlClients.remove(i)).disconnect();
      }
    }
    
    public void requestSetVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if ((paramRouteInfo == this.mSelectedRoute) && (this.mSelectedRouteController != null)) {
        this.mSelectedRouteController.onSetVolume(paramInt);
      }
      do
      {
        do
        {
          return;
        } while (this.mGroupMemberControllers == null);
        paramRouteInfo = (MediaRouteProvider.RouteController)this.mGroupMemberControllers.get(MediaRouter.RouteInfo.access$100(paramRouteInfo));
      } while (paramRouteInfo == null);
      paramRouteInfo.onSetVolume(paramInt);
    }
    
    public void requestUpdateVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if ((paramRouteInfo == this.mSelectedRoute) && (this.mSelectedRouteController != null)) {
        this.mSelectedRouteController.onUpdateVolume(paramInt);
      }
    }
    
    public void selectRoute(MediaRouter.RouteInfo paramRouteInfo)
    {
      selectRoute(paramRouteInfo, 3);
    }
    
    public void selectRoute(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      if (!this.mRoutes.contains(paramRouteInfo))
      {
        Log.w("MediaRouter", "Ignoring attempt to select removed route: " + paramRouteInfo);
        return;
      }
      if (!MediaRouter.RouteInfo.access$600(paramRouteInfo))
      {
        Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + paramRouteInfo);
        return;
      }
      setSelectedRouteInternal(paramRouteInfo, paramInt);
    }
    
    public void sendControlRequest(MediaRouter.RouteInfo paramRouteInfo, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      if ((paramRouteInfo == this.mSelectedRoute) && (this.mSelectedRouteController != null) && (this.mSelectedRouteController.onControlRequest(paramIntent, paramControlRequestCallback))) {}
      while (paramControlRequestCallback == null) {
        return;
      }
      paramControlRequestCallback.onError(null, null);
    }
    
    public void setMediaSession(Object paramObject)
    {
      if (this.mMediaSession != null) {
        this.mMediaSession.clearVolumeHandling();
      }
      if (paramObject == null)
      {
        this.mMediaSession = null;
        return;
      }
      this.mMediaSession = new MediaSessionRecord(paramObject);
      updatePlaybackInfoFromSelectedRoute();
    }
    
    public void setMediaSessionCompat(MediaSessionCompat paramMediaSessionCompat)
    {
      this.mCompatSession = paramMediaSessionCompat;
      if (Build.VERSION.SDK_INT >= 21) {
        if (paramMediaSessionCompat != null)
        {
          paramMediaSessionCompat = paramMediaSessionCompat.getMediaSession();
          setMediaSession(paramMediaSessionCompat);
        }
      }
      do
      {
        do
        {
          do
          {
            return;
            paramMediaSessionCompat = null;
            break;
          } while (Build.VERSION.SDK_INT < 14);
          if (this.mRccMediaSession != null)
          {
            removeRemoteControlClient(this.mRccMediaSession.getRemoteControlClient());
            this.mRccMediaSession.removeOnActiveChangeListener(this.mSessionActiveListener);
          }
          this.mRccMediaSession = paramMediaSessionCompat;
        } while (paramMediaSessionCompat == null);
        paramMediaSessionCompat.addOnActiveChangeListener(this.mSessionActiveListener);
      } while (!paramMediaSessionCompat.isActive());
      addRemoteControlClient(paramMediaSessionCompat.getRemoteControlClient());
    }
    
    public void start()
    {
      this.mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(this.mApplicationContext, this);
      this.mRegisteredProviderWatcher.start();
    }
    
    public void updateDiscoveryRequest()
    {
      Object localObject = new MediaRouteSelector.Builder();
      int k = this.mRouters.size();
      boolean bool1 = false;
      MediaRouter localMediaRouter;
      int j;
      boolean bool2;
      for (int i = 0;; i = j)
      {
        int m = k - 1;
        if (m < 0) {
          break label194;
        }
        localMediaRouter = (MediaRouter)((WeakReference)this.mRouters.get(m)).get();
        if (localMediaRouter != null) {
          break;
        }
        this.mRouters.remove(m);
        j = i;
        bool2 = bool1;
        k = m;
        bool1 = bool2;
      }
      int n = localMediaRouter.mCallbackRecords.size();
      k = 0;
      for (;;)
      {
        bool2 = bool1;
        j = i;
        if (k >= n) {
          break;
        }
        MediaRouter.CallbackRecord localCallbackRecord = (MediaRouter.CallbackRecord)localMediaRouter.mCallbackRecords.get(k);
        ((MediaRouteSelector.Builder)localObject).addSelector(localCallbackRecord.mSelector);
        if ((localCallbackRecord.mFlags & 0x1) != 0)
        {
          bool1 = true;
          i = 1;
        }
        j = i;
        if ((localCallbackRecord.mFlags & 0x4) != 0)
        {
          j = i;
          if (!this.mLowRam) {
            j = 1;
          }
        }
        i = j;
        if ((localCallbackRecord.mFlags & 0x8) != 0) {
          i = 1;
        }
        k += 1;
      }
      label194:
      if (i != 0)
      {
        localObject = ((MediaRouteSelector.Builder)localObject).build();
        if ((this.mDiscoveryRequest == null) || (!this.mDiscoveryRequest.getSelector().equals(localObject)) || (this.mDiscoveryRequest.isActiveScan() != bool1)) {
          break label248;
        }
      }
      label248:
      do
      {
        return;
        localObject = MediaRouteSelector.EMPTY;
        break;
        if ((!((MediaRouteSelector)localObject).isEmpty()) || (bool1)) {
          break label376;
        }
      } while (this.mDiscoveryRequest == null);
      label376:
      for (this.mDiscoveryRequest = null;; this.mDiscoveryRequest = new MediaRouteDiscoveryRequest((MediaRouteSelector)localObject, bool1))
      {
        if (MediaRouter.DEBUG) {
          Log.d("MediaRouter", "Updated discovery request: " + this.mDiscoveryRequest);
        }
        if ((i != 0) && (!bool1) && (this.mLowRam)) {
          Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
        }
        j = this.mProviders.size();
        i = 0;
        while (i < j)
        {
          MediaRouter.ProviderInfo.access$800((MediaRouter.ProviderInfo)this.mProviders.get(i)).setDiscoveryRequest(this.mDiscoveryRequest);
          i += 1;
        }
        break;
      }
    }
    
    private final class CallbackHandler
      extends Handler
    {
      public static final int MSG_PROVIDER_ADDED = 513;
      public static final int MSG_PROVIDER_CHANGED = 515;
      public static final int MSG_PROVIDER_REMOVED = 514;
      public static final int MSG_ROUTE_ADDED = 257;
      public static final int MSG_ROUTE_CHANGED = 259;
      public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
      public static final int MSG_ROUTE_REMOVED = 258;
      public static final int MSG_ROUTE_SELECTED = 262;
      public static final int MSG_ROUTE_UNSELECTED = 263;
      public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
      private static final int MSG_TYPE_MASK = 65280;
      private static final int MSG_TYPE_PROVIDER = 512;
      private static final int MSG_TYPE_ROUTE = 256;
      private final ArrayList<MediaRouter.CallbackRecord> mTempCallbackRecords = new ArrayList();
      
      private CallbackHandler() {}
      
      private void invokeCallback(MediaRouter.CallbackRecord paramCallbackRecord, int paramInt1, Object paramObject, int paramInt2)
      {
        MediaRouter localMediaRouter = paramCallbackRecord.mRouter;
        MediaRouter.Callback localCallback = paramCallbackRecord.mCallback;
        switch (0xFF00 & paramInt1)
        {
        default: 
        case 256: 
          do
          {
            return;
            paramObject = (MediaRouter.RouteInfo)paramObject;
          } while (!paramCallbackRecord.filterRouteEvent((MediaRouter.RouteInfo)paramObject));
          switch (paramInt1)
          {
          default: 
            return;
          case 257: 
            localCallback.onRouteAdded(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          case 258: 
            localCallback.onRouteRemoved(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          case 259: 
            localCallback.onRouteChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          case 260: 
            localCallback.onRouteVolumeChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          case 261: 
            localCallback.onRoutePresentationDisplayChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          case 262: 
            localCallback.onRouteSelected(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
            return;
          }
          localCallback.onRouteUnselected(localMediaRouter, (MediaRouter.RouteInfo)paramObject, paramInt2);
          return;
        }
        paramCallbackRecord = (MediaRouter.ProviderInfo)paramObject;
        switch (paramInt1)
        {
        default: 
          return;
        case 513: 
          localCallback.onProviderAdded(localMediaRouter, paramCallbackRecord);
          return;
        case 514: 
          localCallback.onProviderRemoved(localMediaRouter, paramCallbackRecord);
          return;
        }
        localCallback.onProviderChanged(localMediaRouter, paramCallbackRecord);
      }
      
      private void syncWithSystemProvider(int paramInt, Object paramObject)
      {
        switch (paramInt)
        {
        case 260: 
        case 261: 
        default: 
          return;
        case 257: 
          MediaRouter.GlobalMediaRouter.this.mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
          return;
        case 258: 
          MediaRouter.GlobalMediaRouter.this.mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)paramObject);
          return;
        case 259: 
          MediaRouter.GlobalMediaRouter.this.mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)paramObject);
          return;
        }
        MediaRouter.GlobalMediaRouter.this.mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
      }
      
      public void handleMessage(Message paramMessage)
      {
        int j = paramMessage.what;
        Object localObject = paramMessage.obj;
        int k = paramMessage.arg1;
        syncWithSystemProvider(j, localObject);
        for (;;)
        {
          try
          {
            i = MediaRouter.GlobalMediaRouter.this.mRouters.size();
            i -= 1;
            if (i >= 0)
            {
              paramMessage = (MediaRouter)((WeakReference)MediaRouter.GlobalMediaRouter.this.mRouters.get(i)).get();
              if (paramMessage == null) {
                MediaRouter.GlobalMediaRouter.this.mRouters.remove(i);
              } else {
                this.mTempCallbackRecords.addAll(paramMessage.mCallbackRecords);
              }
            }
          }
          finally
          {
            this.mTempCallbackRecords.clear();
          }
          int m = this.mTempCallbackRecords.size();
          int i = 0;
          while (i < m)
          {
            invokeCallback((MediaRouter.CallbackRecord)this.mTempCallbackRecords.get(i), j, localObject, k);
            i += 1;
          }
          this.mTempCallbackRecords.clear();
          return;
        }
      }
      
      public void post(int paramInt, Object paramObject)
      {
        obtainMessage(paramInt, paramObject).sendToTarget();
      }
      
      public void post(int paramInt1, Object paramObject, int paramInt2)
      {
        paramObject = obtainMessage(paramInt1, paramObject);
        ((Message)paramObject).arg1 = paramInt2;
        ((Message)paramObject).sendToTarget();
      }
    }
    
    private final class MediaSessionRecord
    {
      private int mControlType;
      private int mMaxVolume;
      private final MediaSessionCompat mMsCompat;
      private VolumeProviderCompat mVpCompat;
      
      public MediaSessionRecord(Object paramObject)
      {
        this.mMsCompat = MediaSessionCompat.obtain(MediaRouter.GlobalMediaRouter.this.mApplicationContext, paramObject);
      }
      
      public void clearVolumeHandling()
      {
        this.mMsCompat.setPlaybackToLocal(MediaRouter.GlobalMediaRouter.this.mPlaybackInfo.playbackStream);
        this.mVpCompat = null;
      }
      
      public void configureVolume(int paramInt1, int paramInt2, int paramInt3)
      {
        if ((this.mVpCompat != null) && (paramInt1 == this.mControlType) && (paramInt2 == this.mMaxVolume))
        {
          this.mVpCompat.setCurrentVolume(paramInt3);
          return;
        }
        this.mVpCompat = new VolumeProviderCompat(paramInt1, paramInt2, paramInt3)
        {
          public void onAdjustVolume(final int paramAnonymousInt)
          {
            MediaRouter.GlobalMediaRouter.this.mCallbackHandler.post(new Runnable()
            {
              public void run()
              {
                if (MediaRouter.GlobalMediaRouter.this.mSelectedRoute != null) {
                  MediaRouter.GlobalMediaRouter.this.mSelectedRoute.requestUpdateVolume(paramAnonymousInt);
                }
              }
            });
          }
          
          public void onSetVolumeTo(final int paramAnonymousInt)
          {
            MediaRouter.GlobalMediaRouter.this.mCallbackHandler.post(new Runnable()
            {
              public void run()
              {
                if (MediaRouter.GlobalMediaRouter.this.mSelectedRoute != null) {
                  MediaRouter.GlobalMediaRouter.this.mSelectedRoute.requestSetVolume(paramAnonymousInt);
                }
              }
            });
          }
        };
        this.mMsCompat.setPlaybackToRemote(this.mVpCompat);
      }
      
      public MediaSessionCompat.Token getToken()
      {
        return this.mMsCompat.getSessionToken();
      }
    }
    
    private final class ProviderCallback
      extends MediaRouteProvider.Callback
    {
      private ProviderCallback() {}
      
      public void onDescriptorChanged(MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
      {
        MediaRouter.GlobalMediaRouter.this.updateProviderDescriptor(paramMediaRouteProvider, paramMediaRouteProviderDescriptor);
      }
    }
    
    private final class RemoteControlClientRecord
      implements RemoteControlClientCompat.VolumeCallback
    {
      private boolean mDisconnected;
      private final RemoteControlClientCompat mRccCompat;
      
      public RemoteControlClientRecord(Object paramObject)
      {
        this.mRccCompat = RemoteControlClientCompat.obtain(MediaRouter.GlobalMediaRouter.this.mApplicationContext, paramObject);
        this.mRccCompat.setVolumeCallback(this);
        updatePlaybackInfo();
      }
      
      public void disconnect()
      {
        this.mDisconnected = true;
        this.mRccCompat.setVolumeCallback(null);
      }
      
      public Object getRemoteControlClient()
      {
        return this.mRccCompat.getRemoteControlClient();
      }
      
      public void onVolumeSetRequest(int paramInt)
      {
        if ((!this.mDisconnected) && (MediaRouter.GlobalMediaRouter.this.mSelectedRoute != null)) {
          MediaRouter.GlobalMediaRouter.this.mSelectedRoute.requestSetVolume(paramInt);
        }
      }
      
      public void onVolumeUpdateRequest(int paramInt)
      {
        if ((!this.mDisconnected) && (MediaRouter.GlobalMediaRouter.this.mSelectedRoute != null)) {
          MediaRouter.GlobalMediaRouter.this.mSelectedRoute.requestUpdateVolume(paramInt);
        }
      }
      
      public void updatePlaybackInfo()
      {
        this.mRccCompat.setPlaybackInfo(MediaRouter.GlobalMediaRouter.this.mPlaybackInfo);
      }
    }
  }
  
  public static final class ProviderInfo
  {
    private MediaRouteProviderDescriptor mDescriptor;
    private final MediaRouteProvider.ProviderMetadata mMetadata;
    private final MediaRouteProvider mProviderInstance;
    private Resources mResources;
    private boolean mResourcesNotAvailable;
    private final List<MediaRouter.RouteInfo> mRoutes = new ArrayList();
    
    ProviderInfo(MediaRouteProvider paramMediaRouteProvider)
    {
      this.mProviderInstance = paramMediaRouteProvider;
      this.mMetadata = paramMediaRouteProvider.getMetadata();
    }
    
    int findRouteByDescriptorId(String paramString)
    {
      int j = this.mRoutes.size();
      int i = 0;
      while (i < j)
      {
        if (MediaRouter.RouteInfo.access$100((MediaRouter.RouteInfo)this.mRoutes.get(i)).equals(paramString)) {
          return i;
        }
        i += 1;
      }
      return -1;
    }
    
    public ComponentName getComponentName()
    {
      return this.mMetadata.getComponentName();
    }
    
    public String getPackageName()
    {
      return this.mMetadata.getPackageName();
    }
    
    public MediaRouteProvider getProviderInstance()
    {
      MediaRouter.checkCallingThread();
      return this.mProviderInstance;
    }
    
    Resources getResources()
    {
      String str;
      if ((this.mResources == null) && (!this.mResourcesNotAvailable))
      {
        str = getPackageName();
        Context localContext = MediaRouter.sGlobal.getProviderContext(str);
        if (localContext == null) {
          break label44;
        }
        this.mResources = localContext.getResources();
      }
      for (;;)
      {
        return this.mResources;
        label44:
        Log.w("MediaRouter", "Unable to obtain resources for route provider package: " + str);
        this.mResourcesNotAvailable = true;
      }
    }
    
    public List<MediaRouter.RouteInfo> getRoutes()
    {
      MediaRouter.checkCallingThread();
      return this.mRoutes;
    }
    
    public String toString()
    {
      return "MediaRouter.RouteProviderInfo{ packageName=" + getPackageName() + " }";
    }
    
    boolean updateDescriptor(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
    {
      if (this.mDescriptor != paramMediaRouteProviderDescriptor)
      {
        this.mDescriptor = paramMediaRouteProviderDescriptor;
        return true;
      }
      return false;
    }
  }
  
  public static class RouteGroup
    extends MediaRouter.RouteInfo
  {
    private List<MediaRouter.RouteInfo> mRoutes = new ArrayList();
    
    RouteGroup(MediaRouter.ProviderInfo paramProviderInfo, String paramString1, String paramString2)
    {
      super(paramString1, paramString2);
    }
    
    public MediaRouter.RouteInfo getRouteAt(int paramInt)
    {
      return (MediaRouter.RouteInfo)this.mRoutes.get(paramInt);
    }
    
    public int getRouteCount()
    {
      return this.mRoutes.size();
    }
    
    public List<MediaRouter.RouteInfo> getRoutes()
    {
      return this.mRoutes;
    }
    
    int maybeUpdateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int k = 1;
      int i;
      if (this.mDescriptor != paramMediaRouteDescriptor)
      {
        this.mDescriptor = paramMediaRouteDescriptor;
        if (paramMediaRouteDescriptor != null)
        {
          Object localObject1 = paramMediaRouteDescriptor.getGroupMemberIds();
          ArrayList localArrayList = new ArrayList();
          if (((List)localObject1).size() != this.mRoutes.size()) {}
          for (i = 1;; i = 0)
          {
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              Object localObject2 = (String)((Iterator)localObject1).next();
              localObject2 = MediaRouter.sGlobal.getUniqueId(getProvider(), (String)localObject2);
              localObject2 = MediaRouter.sGlobal.getRoute((String)localObject2);
              if (localObject2 == null) {
                break label188;
              }
              localArrayList.add(localObject2);
              if ((i != 0) || (this.mRoutes.contains(localObject2))) {
                break label188;
              }
              i = 1;
            }
          }
          j = i;
          if (i != 0) {
            this.mRoutes = localArrayList;
          }
        }
      }
      for (int j = i;; j = 0)
      {
        if (j != 0) {}
        for (i = k;; i = 0) {
          return super.updateDescriptor(paramMediaRouteDescriptor) | i;
        }
        label188:
        break;
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(super.toString());
      localStringBuilder.append('[');
      int j = this.mRoutes.size();
      int i = 0;
      while (i < j)
      {
        if (i > 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(this.mRoutes.get(i));
        i += 1;
      }
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
  
  public static class RouteInfo
  {
    static final int CHANGE_GENERAL = 1;
    static final int CHANGE_PRESENTATION_DISPLAY = 4;
    static final int CHANGE_VOLUME = 2;
    public static final int CONNECTION_STATE_CONNECTED = 2;
    public static final int CONNECTION_STATE_CONNECTING = 1;
    public static final int CONNECTION_STATE_DISCONNECTED = 0;
    public static final int DEVICE_TYPE_BLUETOOTH = 3;
    public static final int DEVICE_TYPE_SPEAKER = 2;
    public static final int DEVICE_TYPE_TV = 1;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
    static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
    private boolean mCanDisconnect;
    private boolean mConnecting;
    private int mConnectionState;
    private final ArrayList<IntentFilter> mControlFilters = new ArrayList();
    private String mDescription;
    MediaRouteDescriptor mDescriptor;
    private final String mDescriptorId;
    private int mDeviceType;
    private boolean mEnabled;
    private Bundle mExtras;
    private Uri mIconUri;
    private String mName;
    private int mPlaybackStream;
    private int mPlaybackType;
    private Display mPresentationDisplay;
    private int mPresentationDisplayId = -1;
    private final MediaRouter.ProviderInfo mProvider;
    private IntentSender mSettingsIntent;
    private final String mUniqueId;
    private int mVolume;
    private int mVolumeHandling;
    private int mVolumeMax;
    
    RouteInfo(MediaRouter.ProviderInfo paramProviderInfo, String paramString1, String paramString2)
    {
      this.mProvider = paramProviderInfo;
      this.mDescriptorId = paramString1;
      this.mUniqueId = paramString2;
    }
    
    private static boolean isSystemMediaRouteProvider(RouteInfo paramRouteInfo)
    {
      return TextUtils.equals(paramRouteInfo.getProviderInstance().getMetadata().getPackageName(), "android");
    }
    
    public boolean canDisconnect()
    {
      return this.mCanDisconnect;
    }
    
    public int getConnectionState()
    {
      return this.mConnectionState;
    }
    
    public List<IntentFilter> getControlFilters()
    {
      return this.mControlFilters;
    }
    
    @Nullable
    public String getDescription()
    {
      return this.mDescription;
    }
    
    String getDescriptorId()
    {
      return this.mDescriptorId;
    }
    
    public int getDeviceType()
    {
      return this.mDeviceType;
    }
    
    @Nullable
    public Bundle getExtras()
    {
      return this.mExtras;
    }
    
    public Uri getIconUri()
    {
      return this.mIconUri;
    }
    
    @NonNull
    public String getId()
    {
      return this.mUniqueId;
    }
    
    public String getName()
    {
      return this.mName;
    }
    
    public int getPlaybackStream()
    {
      return this.mPlaybackStream;
    }
    
    public int getPlaybackType()
    {
      return this.mPlaybackType;
    }
    
    @Nullable
    public Display getPresentationDisplay()
    {
      
      if ((this.mPresentationDisplayId >= 0) && (this.mPresentationDisplay == null)) {
        this.mPresentationDisplay = MediaRouter.sGlobal.getDisplay(this.mPresentationDisplayId);
      }
      return this.mPresentationDisplay;
    }
    
    public int getPresentationDisplayId()
    {
      return this.mPresentationDisplayId;
    }
    
    public MediaRouter.ProviderInfo getProvider()
    {
      return this.mProvider;
    }
    
    public MediaRouteProvider getProviderInstance()
    {
      return this.mProvider.getProviderInstance();
    }
    
    @Nullable
    public IntentSender getSettingsIntent()
    {
      return this.mSettingsIntent;
    }
    
    public int getVolume()
    {
      return this.mVolume;
    }
    
    public int getVolumeHandling()
    {
      return this.mVolumeHandling;
    }
    
    public int getVolumeMax()
    {
      return this.mVolumeMax;
    }
    
    public boolean isConnecting()
    {
      return this.mConnecting;
    }
    
    public boolean isDefault()
    {
      MediaRouter.checkCallingThread();
      return MediaRouter.sGlobal.getDefaultRoute() == this;
    }
    
    public boolean isDefaultOrBluetooth()
    {
      if ((isDefault()) || (this.mDeviceType == 3)) {}
      while ((isSystemMediaRouteProvider(this)) && (supportsControlCategory("android.media.intent.category.LIVE_AUDIO")) && (!supportsControlCategory("android.media.intent.category.LIVE_VIDEO"))) {
        return true;
      }
      return false;
    }
    
    public boolean isEnabled()
    {
      return this.mEnabled;
    }
    
    public boolean isSelected()
    {
      MediaRouter.checkCallingThread();
      return MediaRouter.sGlobal.getSelectedRoute() == this;
    }
    
    public boolean matchesSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
    {
      if (paramMediaRouteSelector == null) {
        throw new IllegalArgumentException("selector must not be null");
      }
      MediaRouter.checkCallingThread();
      return paramMediaRouteSelector.matchesControlFilters(this.mControlFilters);
    }
    
    int maybeUpdateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int i = 0;
      if (this.mDescriptor != paramMediaRouteDescriptor) {
        i = updateDescriptor(paramMediaRouteDescriptor);
      }
      return i;
    }
    
    public void requestSetVolume(int paramInt)
    {
      MediaRouter.checkCallingThread();
      MediaRouter.sGlobal.requestSetVolume(this, Math.min(this.mVolumeMax, Math.max(0, paramInt)));
    }
    
    public void requestUpdateVolume(int paramInt)
    {
      
      if (paramInt != 0) {
        MediaRouter.sGlobal.requestUpdateVolume(this, paramInt);
      }
    }
    
    public void select()
    {
      MediaRouter.checkCallingThread();
      MediaRouter.sGlobal.selectRoute(this);
    }
    
    public void sendControlRequest(@NonNull Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      if (paramIntent == null) {
        throw new IllegalArgumentException("intent must not be null");
      }
      MediaRouter.checkCallingThread();
      MediaRouter.sGlobal.sendControlRequest(this, paramIntent, paramControlRequestCallback);
    }
    
    public boolean supportsControlAction(@NonNull String paramString1, @NonNull String paramString2)
    {
      if (paramString1 == null) {
        throw new IllegalArgumentException("category must not be null");
      }
      if (paramString2 == null) {
        throw new IllegalArgumentException("action must not be null");
      }
      MediaRouter.checkCallingThread();
      int j = this.mControlFilters.size();
      int i = 0;
      while (i < j)
      {
        IntentFilter localIntentFilter = (IntentFilter)this.mControlFilters.get(i);
        if ((localIntentFilter.hasCategory(paramString1)) && (localIntentFilter.hasAction(paramString2))) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    
    public boolean supportsControlCategory(@NonNull String paramString)
    {
      if (paramString == null) {
        throw new IllegalArgumentException("category must not be null");
      }
      MediaRouter.checkCallingThread();
      int j = this.mControlFilters.size();
      int i = 0;
      while (i < j)
      {
        if (((IntentFilter)this.mControlFilters.get(i)).hasCategory(paramString)) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    
    public boolean supportsControlRequest(@NonNull Intent paramIntent)
    {
      if (paramIntent == null) {
        throw new IllegalArgumentException("intent must not be null");
      }
      MediaRouter.checkCallingThread();
      ContentResolver localContentResolver = MediaRouter.sGlobal.getContentResolver();
      int j = this.mControlFilters.size();
      int i = 0;
      while (i < j)
      {
        if (((IntentFilter)this.mControlFilters.get(i)).match(localContentResolver, paramIntent, true, "MediaRouter") >= 0) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    
    public String toString()
    {
      return "MediaRouter.RouteInfo{ uniqueId=" + this.mUniqueId + ", name=" + this.mName + ", description=" + this.mDescription + ", iconUri=" + this.mIconUri + ", enabled=" + this.mEnabled + ", connecting=" + this.mConnecting + ", connectionState=" + this.mConnectionState + ", canDisconnect=" + this.mCanDisconnect + ", playbackType=" + this.mPlaybackType + ", playbackStream=" + this.mPlaybackStream + ", deviceType=" + this.mDeviceType + ", volumeHandling=" + this.mVolumeHandling + ", volume=" + this.mVolume + ", volumeMax=" + this.mVolumeMax + ", presentationDisplayId=" + this.mPresentationDisplayId + ", extras=" + this.mExtras + ", settingsIntent=" + this.mSettingsIntent + ", providerPackageName=" + this.mProvider.getPackageName() + " }";
    }
    
    int updateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      int j = 0;
      int i = 0;
      this.mDescriptor = paramMediaRouteDescriptor;
      if (paramMediaRouteDescriptor != null)
      {
        j = i;
        if (!MediaRouter.equal(this.mName, paramMediaRouteDescriptor.getName()))
        {
          this.mName = paramMediaRouteDescriptor.getName();
          j = 1;
        }
        i = j;
        if (!MediaRouter.equal(this.mDescription, paramMediaRouteDescriptor.getDescription()))
        {
          this.mDescription = paramMediaRouteDescriptor.getDescription();
          i = j | 0x1;
        }
        j = i;
        if (!MediaRouter.equal(this.mIconUri, paramMediaRouteDescriptor.getIconUri()))
        {
          this.mIconUri = paramMediaRouteDescriptor.getIconUri();
          j = i | 0x1;
        }
        i = j;
        if (this.mEnabled != paramMediaRouteDescriptor.isEnabled())
        {
          this.mEnabled = paramMediaRouteDescriptor.isEnabled();
          i = j | 0x1;
        }
        j = i;
        if (this.mConnecting != paramMediaRouteDescriptor.isConnecting())
        {
          this.mConnecting = paramMediaRouteDescriptor.isConnecting();
          j = i | 0x1;
        }
        i = j;
        if (this.mConnectionState != paramMediaRouteDescriptor.getConnectionState())
        {
          this.mConnectionState = paramMediaRouteDescriptor.getConnectionState();
          i = j | 0x1;
        }
        j = i;
        if (!this.mControlFilters.equals(paramMediaRouteDescriptor.getControlFilters()))
        {
          this.mControlFilters.clear();
          this.mControlFilters.addAll(paramMediaRouteDescriptor.getControlFilters());
          j = i | 0x1;
        }
        i = j;
        if (this.mPlaybackType != paramMediaRouteDescriptor.getPlaybackType())
        {
          this.mPlaybackType = paramMediaRouteDescriptor.getPlaybackType();
          i = j | 0x1;
        }
        j = i;
        if (this.mPlaybackStream != paramMediaRouteDescriptor.getPlaybackStream())
        {
          this.mPlaybackStream = paramMediaRouteDescriptor.getPlaybackStream();
          j = i | 0x1;
        }
        i = j;
        if (this.mDeviceType != paramMediaRouteDescriptor.getDeviceType())
        {
          this.mDeviceType = paramMediaRouteDescriptor.getDeviceType();
          i = j | 0x1;
        }
        j = i;
        if (this.mVolumeHandling != paramMediaRouteDescriptor.getVolumeHandling())
        {
          this.mVolumeHandling = paramMediaRouteDescriptor.getVolumeHandling();
          j = i | 0x3;
        }
        i = j;
        if (this.mVolume != paramMediaRouteDescriptor.getVolume())
        {
          this.mVolume = paramMediaRouteDescriptor.getVolume();
          i = j | 0x3;
        }
        j = i;
        if (this.mVolumeMax != paramMediaRouteDescriptor.getVolumeMax())
        {
          this.mVolumeMax = paramMediaRouteDescriptor.getVolumeMax();
          j = i | 0x3;
        }
        i = j;
        if (this.mPresentationDisplayId != paramMediaRouteDescriptor.getPresentationDisplayId())
        {
          this.mPresentationDisplayId = paramMediaRouteDescriptor.getPresentationDisplayId();
          this.mPresentationDisplay = null;
          i = j | 0x5;
        }
        j = i;
        if (!MediaRouter.equal(this.mExtras, paramMediaRouteDescriptor.getExtras()))
        {
          this.mExtras = paramMediaRouteDescriptor.getExtras();
          j = i | 0x1;
        }
        i = j;
        if (!MediaRouter.equal(this.mSettingsIntent, paramMediaRouteDescriptor.getSettingsActivity()))
        {
          this.mSettingsIntent = paramMediaRouteDescriptor.getSettingsActivity();
          i = j | 0x1;
        }
        j = i;
        if (this.mCanDisconnect != paramMediaRouteDescriptor.canDisconnectAndKeepPlaying())
        {
          this.mCanDisconnect = paramMediaRouteDescriptor.canDisconnectAndKeepPlaying();
          j = i | 0x5;
        }
      }
      return j;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/media/MediaRouter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */