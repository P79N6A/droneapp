package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fimi.soul.media.player.annotations.AccessedByNative;
import com.fimi.soul.media.player.annotations.CalledByNative;
import com.fimi.soul.media.player.pragma.DebugLog;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class FimiMediaPlayer
  extends AbstractMediaPlayer
{
  public static final int IJK_LOG_DEBUG = 3;
  public static final int IJK_LOG_DEFAULT = 1;
  public static final int IJK_LOG_ERROR = 6;
  public static final int IJK_LOG_FATAL = 7;
  public static final int IJK_LOG_INFO = 4;
  public static final int IJK_LOG_SILENT = 8;
  public static final int IJK_LOG_UNKNOWN = 0;
  public static final int IJK_LOG_VERBOSE = 2;
  public static final int IJK_LOG_WARN = 5;
  private static final int MEDIA_BUFFERING_UPDATE = 3;
  private static final int MEDIA_ERROR = 100;
  private static final int MEDIA_INFO = 200;
  private static final int MEDIA_NOP = 0;
  private static final int MEDIA_PLAYBACK_COMPLETE = 2;
  private static final int MEDIA_PREPARED = 1;
  private static final int MEDIA_SEEK_COMPLETE = 4;
  protected static final int MEDIA_SET_VIDEO_SAR = 10001;
  private static final int MEDIA_SET_VIDEO_SIZE = 5;
  private static final int MEDIA_TIMED_TEXT = 99;
  public static final int OPT_CATEGORY_CODEC = 2;
  public static final int OPT_CATEGORY_FORMAT = 1;
  public static final int OPT_CATEGORY_PLAYER = 4;
  public static final int OPT_CATEGORY_SWS = 3;
  public static final int SDL_FCC_RV16 = 909203026;
  public static final int SDL_FCC_RV32 = 842225234;
  public static final int SDL_FCC_YV12 = 842094169;
  private static final String TAG = FimiMediaPlayer.class.getName();
  private static FimiMediaPlayer fimiMediaPlayer;
  private static volatile boolean mIsLibLoaded = false;
  private static volatile boolean mIsNativeInitialized = false;
  private static FimiLibLoader sLocalLibLoader = new FimiLibLoader()
  {
    public void loadLibrary(String paramAnonymousString)
    {
      System.loadLibrary(paramAnonymousString);
    }
  };
  private String mDataSource;
  private EventHandler mEventHandler;
  @AccessedByNative
  private int mListenerContext;
  @AccessedByNative
  private long mNativeMediaPlayer;
  @AccessedByNative
  private int mNativeSurfaceTexture;
  private OnControlMessageListener mOnControlMessageListener;
  private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
  private OnNativeInvokeListener mOnNativeInvokeListener;
  private boolean mScreenOnWhilePlaying;
  private boolean mStayAwake;
  private SurfaceHolder mSurfaceHolder;
  private int mVideoHeight;
  private int mVideoSarDen;
  private int mVideoSarNum;
  private int mVideoWidth;
  private PowerManager.WakeLock mWakeLock = null;
  
  public FimiMediaPlayer()
  {
    this(sLocalLibLoader);
  }
  
  public FimiMediaPlayer(FimiLibLoader paramFimiLibLoader)
  {
    initPlayer(paramFimiLibLoader);
  }
  
  private native String _getAudioCodecInfo();
  
  private static native String _getColorFormatName(int paramInt);
  
  private native Bundle _getMediaMeta();
  
  private native String _getVideoCodecInfo();
  
  private native void _pause();
  
  private native void _release();
  
  private native void _reset();
  
  private native void _setDataSource(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);
  
  private native void _setDataSourceFd(int paramInt);
  
  private native void _setOption(int paramInt, String paramString, long paramLong);
  
  private native void _setOption(int paramInt, String paramString1, String paramString2);
  
  private native void _setVideoSurface(Surface paramSurface);
  
  private native void _start();
  
  private native void _stop();
  
  private native int _stream2jpg(String paramString1, String paramString2);
  
  public static String getColorFormatName(int paramInt)
  {
    return _getColorFormatName(paramInt);
  }
  
  public static FimiMediaPlayer getIntance()
  {
    if (fimiMediaPlayer == null) {
      return new FimiMediaPlayer();
    }
    return fimiMediaPlayer;
  }
  
  private static void initNativeOnce()
  {
    try
    {
      long l = new File("com.fimi.soul.media.player.FimiMediaPlayer.java").lastModified();
      if (!mIsNativeInitialized)
      {
        native_init();
        mIsNativeInitialized = true;
        DebugLog.w(TAG, "aizj version=" + l);
      }
      return;
    }
    finally {}
  }
  
  private void initPlayer(FimiLibLoader paramFimiLibLoader)
  {
    loadLibrariesOnce(paramFimiLibLoader);
    initNativeOnce();
    paramFimiLibLoader = Looper.myLooper();
    if (paramFimiLibLoader != null) {
      this.mEventHandler = new EventHandler(this, paramFimiLibLoader);
    }
    for (;;)
    {
      native_setup(new WeakReference(this));
      return;
      paramFimiLibLoader = Looper.getMainLooper();
      if (paramFimiLibLoader != null) {
        this.mEventHandler = new EventHandler(this, paramFimiLibLoader);
      } else {
        this.mEventHandler = null;
      }
    }
  }
  
  public static void loadLibrariesOnce(FimiLibLoader paramFimiLibLoader)
  {
    try
    {
      if (!mIsLibLoaded)
      {
        FimiLibLoader localFimiLibLoader = paramFimiLibLoader;
        if (paramFimiLibLoader == null) {
          localFimiLibLoader = sLocalLibLoader;
        }
        localFimiLibLoader.loadLibrary("fmffmpeg");
        localFimiLibLoader.loadLibrary("fmsdl");
        localFimiLibLoader.loadLibrary("fmplayer");
        mIsLibLoaded = true;
      }
      return;
    }
    finally {}
  }
  
  private native void native_finalize();
  
  private static native void native_init();
  
  private native void native_message_loop(Object paramObject);
  
  public static native void native_profileBegin(String paramString);
  
  public static native void native_profileEnd();
  
  public static native void native_setLogLevel(int paramInt);
  
  private native void native_setup(Object paramObject);
  
  @CalledByNative
  private static String onControlResolveSegmentUrl(Object paramObject, int paramInt)
  {
    DebugLog.ifmt(TAG, "onControlResolveSegmentUrl %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramObject == null) || (!(paramObject instanceof WeakReference))) {
      return null;
    }
    paramObject = (FimiMediaPlayer)((WeakReference)paramObject).get();
    if (paramObject == null) {
      return null;
    }
    paramObject = ((FimiMediaPlayer)paramObject).mOnControlMessageListener;
    if (paramObject == null) {
      return null;
    }
    return ((OnControlMessageListener)paramObject).onControlResolveSegmentUrl(paramInt);
  }
  
  @CalledByNative
  private static boolean onNativeInvoke(Object paramObject, int paramInt, Bundle paramBundle)
  {
    DebugLog.ifmt(TAG, "onNativeInvoke %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramObject == null) || (!(paramObject instanceof WeakReference))) {
      return false;
    }
    paramObject = (FimiMediaPlayer)((WeakReference)paramObject).get();
    if (paramObject == null) {
      return false;
    }
    paramObject = ((FimiMediaPlayer)paramObject).mOnNativeInvokeListener;
    if (paramObject == null) {
      return false;
    }
    return ((OnNativeInvokeListener)paramObject).onNativeInvoke(paramInt, paramBundle);
  }
  
  @CalledByNative
  private static String onSelectCodec(Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramObject == null) || (!(paramObject instanceof WeakReference))) {
      return null;
    }
    FimiMediaPlayer localFimiMediaPlayer = (FimiMediaPlayer)((WeakReference)paramObject).get();
    if (localFimiMediaPlayer == null) {
      return null;
    }
    OnMediaCodecSelectListener localOnMediaCodecSelectListener = localFimiMediaPlayer.mOnMediaCodecSelectListener;
    paramObject = localOnMediaCodecSelectListener;
    if (localOnMediaCodecSelectListener == null) {
      paramObject = DefaultMediaCodecSelector.sInstance;
    }
    return ((OnMediaCodecSelectListener)paramObject).onMediaCodecSelect(localFimiMediaPlayer, paramString, paramInt1, paramInt2);
  }
  
  @CalledByNative
  private static void postEventFromNative(Object paramObject1, int paramInt1, int paramInt2, int paramInt3, Object paramObject2)
  {
    if (paramObject1 == null) {}
    do
    {
      do
      {
        return;
        paramObject1 = (FimiMediaPlayer)((WeakReference)paramObject1).get();
      } while (paramObject1 == null);
      if ((paramInt1 == 200) && (paramInt2 == 2)) {
        ((FimiMediaPlayer)paramObject1).start();
      }
    } while (((FimiMediaPlayer)paramObject1).mEventHandler == null);
    paramObject2 = ((FimiMediaPlayer)paramObject1).mEventHandler.obtainMessage(paramInt1, paramInt2, paramInt3, paramObject2);
    ((FimiMediaPlayer)paramObject1).mEventHandler.sendMessage((Message)paramObject2);
  }
  
  private void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2)
  {
    setDataSource(paramFileDescriptor);
  }
  
  @SuppressLint({"Wakelock"})
  private void stayAwake(boolean paramBoolean)
  {
    if (this.mWakeLock != null)
    {
      if ((!paramBoolean) || (this.mWakeLock.isHeld())) {
        break label38;
      }
      this.mWakeLock.acquire();
    }
    for (;;)
    {
      this.mStayAwake = paramBoolean;
      updateSurfaceScreenOn();
      return;
      label38:
      if ((!paramBoolean) && (this.mWakeLock.isHeld())) {
        this.mWakeLock.release();
      }
    }
  }
  
  private void updateSurfaceScreenOn()
  {
    SurfaceHolder localSurfaceHolder;
    if (this.mSurfaceHolder != null)
    {
      localSurfaceHolder = this.mSurfaceHolder;
      if ((!this.mScreenOnWhilePlaying) || (!this.mStayAwake)) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      localSurfaceHolder.setKeepScreenOn(bool);
      return;
    }
  }
  
  public native void _prepareAsync();
  
  public int concatVedio(String paramString1, String paramString2)
  {
    return fm_avp_concatVid(paramString1, paramString2);
  }
  
  protected void finalize()
  {
    native_finalize();
  }
  
  public native int fm_avp_concatVid(String paramString1, String paramString2);
  
  public native int fm_avp_mergeAV(String paramString1, String paramString2, String paramString3);
  
  public native int fm_avp_splitVid(String paramString1, String paramString2, int paramInt1, int paramInt2);
  
  public native int fm_avp_vid2img(String paramString1, String paramString2);
  
  public native int getAudioSessionId();
  
  public native long getCurrentPosition();
  
  public String getDataSource()
  {
    return this.mDataSource;
  }
  
  public native long getDuration();
  
  public MediaInfo getMediaInfo()
  {
    MediaInfo localMediaInfo = new MediaInfo();
    localMediaInfo.mMediaPlayerName = "ijkplayer";
    Object localObject = _getVideoCodecInfo();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = ((String)localObject).split(",");
      if (localObject.length >= 2)
      {
        localMediaInfo.mVideoDecoder = localObject[0];
        localMediaInfo.mVideoDecoderImpl = localObject[1];
      }
    }
    else
    {
      localObject = _getAudioCodecInfo();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = ((String)localObject).split(",");
        if (localObject.length < 2) {
          break label131;
        }
        localMediaInfo.mAudioDecoder = localObject[0];
        localMediaInfo.mAudioDecoderImpl = localObject[1];
      }
    }
    for (;;)
    {
      try
      {
        localMediaInfo.mMeta = FimiMediaMeta.parse(_getMediaMeta());
        return localMediaInfo;
      }
      catch (Throwable localThrowable)
      {
        label131:
        localThrowable.printStackTrace();
      }
      if (localObject.length < 1) {
        break;
      }
      localMediaInfo.mVideoDecoder = localObject[0];
      localMediaInfo.mVideoDecoderImpl = "";
      break;
      if (localObject.length >= 1)
      {
        localMediaInfo.mAudioDecoder = localObject[0];
        localMediaInfo.mAudioDecoderImpl = "";
      }
    }
    return localMediaInfo;
  }
  
  public Bundle getMediaMeta()
  {
    return _getMediaMeta();
  }
  
  public int getVideoHeight()
  {
    return this.mVideoHeight;
  }
  
  public int getVideoSarDen()
  {
    return this.mVideoSarDen;
  }
  
  public int getVideoSarNum()
  {
    return this.mVideoSarNum;
  }
  
  public int getVideoWidth()
  {
    return this.mVideoWidth;
  }
  
  public boolean isPlayable()
  {
    return true;
  }
  
  public native boolean isPlaying();
  
  public int mergeAudio2Vedio(String paramString1, String paramString2, String paramString3)
  {
    return fm_avp_mergeAV(paramString1, paramString2, paramString3);
  }
  
  public void pause()
  {
    stayAwake(false);
    _pause();
  }
  
  public void prepareAsync()
  {
    _prepareAsync();
  }
  
  public void release()
  {
    stayAwake(false);
    updateSurfaceScreenOn();
    resetListeners();
    _release();
  }
  
  public void reset()
  {
    stayAwake(false);
    _reset();
    this.mEventHandler.removeCallbacksAndMessages(null);
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
  }
  
  public void resetListeners()
  {
    super.resetListeners();
    this.mOnMediaCodecSelectListener = null;
  }
  
  public native void seekTo(long paramLong);
  
  public void setAudioStreamType(int paramInt) {}
  
  public void setDataSource(Context paramContext, Uri paramUri)
  {
    setDataSource(paramContext, paramUri, null);
  }
  
  /* Error */
  @TargetApi(14)
  public void setDataSource(Context paramContext, Uri paramUri, Map<String, String> paramMap)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 482	android/net/Uri:getScheme	()Ljava/lang/String;
    //   4: astore 5
    //   6: ldc_w 484
    //   9: aload 5
    //   11: invokevirtual 488	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: ifeq +12 -> 26
    //   17: aload_0
    //   18: aload_2
    //   19: invokevirtual 491	android/net/Uri:getPath	()Ljava/lang/String;
    //   22: invokevirtual 493	com/fimi/soul/media/player/FimiMediaPlayer:setDataSource	(Ljava/lang/String;)V
    //   25: return
    //   26: aload_2
    //   27: astore 4
    //   29: ldc_w 495
    //   32: aload 5
    //   34: invokevirtual 488	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   37: ifeq +46 -> 83
    //   40: aload_2
    //   41: astore 4
    //   43: ldc_w 497
    //   46: aload_2
    //   47: invokevirtual 500	android/net/Uri:getAuthority	()Ljava/lang/String;
    //   50: invokevirtual 488	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   53: ifeq +30 -> 83
    //   56: aload_1
    //   57: aload_2
    //   58: invokestatic 506	android/media/RingtoneManager:getDefaultType	(Landroid/net/Uri;)I
    //   61: invokestatic 510	android/media/RingtoneManager:getActualDefaultRingtoneUri	(Landroid/content/Context;I)Landroid/net/Uri;
    //   64: astore_2
    //   65: aload_2
    //   66: astore 4
    //   68: aload_2
    //   69: ifnonnull +14 -> 83
    //   72: new 512	java/io/FileNotFoundException
    //   75: dup
    //   76: ldc_w 514
    //   79: invokespecial 515	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   82: athrow
    //   83: aconst_null
    //   84: astore_2
    //   85: aload_1
    //   86: invokevirtual 521	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   89: aload 4
    //   91: ldc_w 523
    //   94: invokevirtual 529	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnonnull +12 -> 111
    //   102: aload_1
    //   103: ifnull -78 -> 25
    //   106: aload_1
    //   107: invokevirtual 534	android/content/res/AssetFileDescriptor:close	()V
    //   110: return
    //   111: aload_1
    //   112: invokevirtual 537	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   115: lconst_0
    //   116: lcmp
    //   117: ifge +20 -> 137
    //   120: aload_0
    //   121: aload_1
    //   122: invokevirtual 541	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   125: invokevirtual 328	com/fimi/soul/media/player/FimiMediaPlayer:setDataSource	(Ljava/io/FileDescriptor;)V
    //   128: aload_1
    //   129: ifnull -104 -> 25
    //   132: aload_1
    //   133: invokevirtual 534	android/content/res/AssetFileDescriptor:close	()V
    //   136: return
    //   137: aload_0
    //   138: aload_1
    //   139: invokevirtual 541	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   142: aload_1
    //   143: invokevirtual 544	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   146: aload_1
    //   147: invokevirtual 537	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   150: invokespecial 546	com/fimi/soul/media/player/FimiMediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   153: goto -25 -> 128
    //   156: astore_2
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 534	android/content/res/AssetFileDescriptor:close	()V
    //   165: getstatic 107	com/fimi/soul/media/player/FimiMediaPlayer:TAG	Ljava/lang/String;
    //   168: ldc_w 548
    //   171: invokestatic 553	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload_0
    //   176: aload 4
    //   178: invokevirtual 554	android/net/Uri:toString	()Ljava/lang/String;
    //   181: aload_3
    //   182: invokevirtual 557	com/fimi/soul/media/player/FimiMediaPlayer:setDataSource	(Ljava/lang/String;Ljava/util/Map;)V
    //   185: return
    //   186: astore_1
    //   187: aconst_null
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull -25 -> 165
    //   193: aload_1
    //   194: invokevirtual 534	android/content/res/AssetFileDescriptor:close	()V
    //   197: goto -32 -> 165
    //   200: astore_1
    //   201: aconst_null
    //   202: astore_3
    //   203: aload_1
    //   204: astore_2
    //   205: aload_3
    //   206: ifnull +7 -> 213
    //   209: aload_3
    //   210: invokevirtual 534	android/content/res/AssetFileDescriptor:close	()V
    //   213: aload_2
    //   214: athrow
    //   215: astore_2
    //   216: aload_1
    //   217: astore_3
    //   218: goto -13 -> 205
    //   221: astore_2
    //   222: goto -33 -> 189
    //   225: astore_1
    //   226: aload_2
    //   227: astore_1
    //   228: goto -71 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	this	FimiMediaPlayer
    //   0	231	1	paramContext	Context
    //   0	231	2	paramUri	Uri
    //   0	231	3	paramMap	Map<String, String>
    //   27	150	4	localUri	Uri
    //   4	29	5	str	String
    // Exception table:
    //   from	to	target	type
    //   111	128	156	java/lang/SecurityException
    //   137	153	156	java/lang/SecurityException
    //   85	98	186	java/io/IOException
    //   85	98	200	finally
    //   111	128	215	finally
    //   137	153	215	finally
    //   111	128	221	java/io/IOException
    //   137	153	221	java/io/IOException
    //   85	98	225	java/lang/SecurityException
  }
  
  @TargetApi(13)
  public void setDataSource(FileDescriptor paramFileDescriptor)
  {
    if (Build.VERSION.SDK_INT < 12) {
      try
      {
        Field localField = paramFileDescriptor.getClass().getDeclaredField("descriptor");
        localField.setAccessible(true);
        int i = localField.getInt(paramFileDescriptor);
        _setDataSourceFd(i);
        return;
      }
      catch (NoSuchFieldException paramFileDescriptor)
      {
        throw new RuntimeException(paramFileDescriptor);
      }
      catch (IllegalAccessException paramFileDescriptor)
      {
        throw new RuntimeException(paramFileDescriptor);
      }
    }
    paramFileDescriptor = ParcelFileDescriptor.dup(paramFileDescriptor);
    try
    {
      _setDataSourceFd(paramFileDescriptor.getFd());
      return;
    }
    finally
    {
      paramFileDescriptor.close();
    }
  }
  
  public void setDataSource(String paramString)
  {
    this.mDataSource = paramString;
    _setDataSource(paramString, null, null);
  }
  
  public void setDataSource(String paramString, Map<String, String> paramMap)
  {
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append(":");
        if (!TextUtils.isEmpty((String)localEntry.getValue())) {
          localStringBuilder.append((String)localEntry.getValue());
        }
        localStringBuilder.append("\r\n");
      }
    }
    setDataSource(paramString);
  }
  
  public void setDisplay(SurfaceHolder paramSurfaceHolder)
  {
    this.mSurfaceHolder = paramSurfaceHolder;
    if (paramSurfaceHolder != null) {}
    for (paramSurfaceHolder = paramSurfaceHolder.getSurface();; paramSurfaceHolder = null)
    {
      _setVideoSurface(paramSurfaceHolder);
      updateSurfaceScreenOn();
      return;
    }
  }
  
  public void setKeepInBackground(boolean paramBoolean) {}
  
  public void setLogEnabled(boolean paramBoolean) {}
  
  public void setOnControlMessageListener(OnControlMessageListener paramOnControlMessageListener)
  {
    this.mOnControlMessageListener = paramOnControlMessageListener;
  }
  
  public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener paramOnMediaCodecSelectListener)
  {
    this.mOnMediaCodecSelectListener = paramOnMediaCodecSelectListener;
  }
  
  public void setOnNativeInvokeListener(OnNativeInvokeListener paramOnNativeInvokeListener)
  {
    this.mOnNativeInvokeListener = paramOnNativeInvokeListener;
  }
  
  public void setOption(int paramInt, String paramString, long paramLong)
  {
    _setOption(paramInt, paramString, paramLong);
  }
  
  public void setOption(int paramInt, String paramString1, String paramString2)
  {
    _setOption(paramInt, paramString1, paramString2);
  }
  
  public void setScreenOnWhilePlaying(boolean paramBoolean)
  {
    if (this.mScreenOnWhilePlaying != paramBoolean)
    {
      if ((paramBoolean) && (this.mSurfaceHolder == null)) {
        DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
      }
      this.mScreenOnWhilePlaying = paramBoolean;
      updateSurfaceScreenOn();
    }
  }
  
  public void setSurface(Surface paramSurface)
  {
    if ((this.mScreenOnWhilePlaying) && (paramSurface != null)) {
      DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
    }
    this.mSurfaceHolder = null;
    _setVideoSurface(paramSurface);
    updateSurfaceScreenOn();
  }
  
  public native void setVolume(float paramFloat1, float paramFloat2);
  
  @SuppressLint({"Wakelock"})
  public void setWakeMode(Context paramContext, int paramInt)
  {
    int i;
    if (this.mWakeLock != null) {
      if (this.mWakeLock.isHeld())
      {
        i = 1;
        this.mWakeLock.release();
        this.mWakeLock = null;
      }
    }
    for (;;)
    {
      this.mWakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(0x20000000 | paramInt, FimiMediaPlayer.class.getName());
      this.mWakeLock.setReferenceCounted(false);
      if (i != 0) {
        this.mWakeLock.acquire();
      }
      return;
      i = 0;
      break;
      i = 0;
    }
  }
  
  public int spliteVedio(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    return fm_avp_splitVid(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public void start()
  {
    stayAwake(true);
    _start();
  }
  
  public void stop()
  {
    stayAwake(false);
    _stop();
  }
  
  public int vid2imgArray(String paramString1, String paramString2)
  {
    return fm_avp_vid2img(paramString1, paramString2);
  }
  
  public boolean videoToJpg(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {}
    while (_stream2jpg(paramString1, paramString2) != 0) {
      return false;
    }
    return true;
  }
  
  public static class DefaultMediaCodecSelector
    implements FimiMediaPlayer.OnMediaCodecSelectListener
  {
    public static DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();
    
    @TargetApi(16)
    public String onMediaCodecSelect(IMediaPlayer paramIMediaPlayer, String paramString, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT < 16) {
        return null;
      }
      if (TextUtils.isEmpty(paramString)) {
        return null;
      }
      Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      Object localObject1 = new ArrayList();
      int i = MediaCodecList.getCodecCount();
      paramInt1 = 0;
      if (paramInt1 < i)
      {
        paramIMediaPlayer = MediaCodecList.getCodecInfoAt(paramInt1);
        Log.d(FimiMediaPlayer.TAG, String.format(Locale.US, "  found codec: %s", new Object[] { paramIMediaPlayer.getName() }));
        if (paramIMediaPlayer.isEncoder()) {}
        String[] arrayOfString;
        do
        {
          paramInt1 += 1;
          break;
          arrayOfString = paramIMediaPlayer.getSupportedTypes();
        } while (arrayOfString == null);
        int j = arrayOfString.length;
        paramInt2 = 0;
        label143:
        Object localObject2;
        if (paramInt2 < j)
        {
          localObject2 = arrayOfString[paramInt2];
          if (!TextUtils.isEmpty((CharSequence)localObject2)) {
            break label174;
          }
        }
        for (;;)
        {
          paramInt2 += 1;
          break label143;
          break;
          label174:
          Log.d(FimiMediaPlayer.TAG, String.format(Locale.US, "    mime: %s", new Object[] { localObject2 }));
          if (((String)localObject2).equalsIgnoreCase(paramString))
          {
            localObject2 = FimiMediaCodecInfo.setupCandidate(paramIMediaPlayer, paramString);
            if (localObject2 != null)
            {
              ((ArrayList)localObject1).add(localObject2);
              Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "candidate codec: %s rank=%d", new Object[] { paramIMediaPlayer.getName(), Integer.valueOf(((FimiMediaCodecInfo)localObject2).mRank) }));
              ((FimiMediaCodecInfo)localObject2).dumpProfileLevels(paramString);
            }
          }
        }
      }
      if (((ArrayList)localObject1).isEmpty()) {
        return null;
      }
      paramIMediaPlayer = (FimiMediaCodecInfo)((ArrayList)localObject1).get(0);
      localObject1 = ((ArrayList)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        paramString = (FimiMediaCodecInfo)((Iterator)localObject1).next();
        if (paramString.mRank <= paramIMediaPlayer.mRank) {
          break label425;
        }
        paramIMediaPlayer = paramString;
      }
      label425:
      for (;;)
      {
        break;
        if (paramIMediaPlayer.mRank < FimiMediaCodecInfo.RANK_LAST_CHANCE)
        {
          Log.w(FimiMediaPlayer.TAG, String.format(Locale.US, "unaccetable codec: %s", new Object[] { paramIMediaPlayer.mCodecInfo.getName() }));
          return null;
        }
        Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "selected codec: %s rank=%d", new Object[] { paramIMediaPlayer.mCodecInfo.getName(), Integer.valueOf(paramIMediaPlayer.mRank) }));
        return paramIMediaPlayer.mCodecInfo.getName();
      }
    }
  }
  
  private static class EventHandler
    extends Handler
  {
    private WeakReference<FimiMediaPlayer> mWeakPlayer;
    
    public EventHandler(FimiMediaPlayer paramFimiMediaPlayer, Looper paramLooper)
    {
      super();
      this.mWeakPlayer = new WeakReference(paramFimiMediaPlayer);
    }
    
    public void handleMessage(Message paramMessage)
    {
      FimiMediaPlayer localFimiMediaPlayer = (FimiMediaPlayer)this.mWeakPlayer.get();
      if ((localFimiMediaPlayer == null) || (localFimiMediaPlayer.mNativeMediaPlayer == 0L))
      {
        DebugLog.w(FimiMediaPlayer.TAG, "FimiMediaPlayer went away with unhandled events");
        return;
      }
      long l2;
      switch (paramMessage.what)
      {
      case 0: 
      case 99: 
      default: 
        DebugLog.e(FimiMediaPlayer.TAG, "Unknown message type " + paramMessage.what);
        return;
      case 1: 
        localFimiMediaPlayer.notifyOnPrepared();
        return;
      case 2: 
        localFimiMediaPlayer.notifyOnCompletion();
        localFimiMediaPlayer.stayAwake(false);
        return;
      case 3: 
        l2 = paramMessage.arg1;
        l1 = l2;
        if (l2 < 0L) {
          l1 = 0L;
        }
        l2 = localFimiMediaPlayer.getDuration();
        if (l2 <= 0L) {
          break;
        }
      }
      for (long l1 = l1 * 100L / l2;; l1 = 0L)
      {
        l2 = l1;
        if (l1 >= 100L) {
          l2 = 100L;
        }
        localFimiMediaPlayer.notifyOnBufferingUpdate((int)l2);
        return;
        localFimiMediaPlayer.notifyOnSeekComplete();
        return;
        FimiMediaPlayer.access$302(localFimiMediaPlayer, paramMessage.arg1);
        FimiMediaPlayer.access$402(localFimiMediaPlayer, paramMessage.arg2);
        localFimiMediaPlayer.notifyOnVideoSizeChanged(localFimiMediaPlayer.mVideoWidth, localFimiMediaPlayer.mVideoHeight, localFimiMediaPlayer.mVideoSarNum, localFimiMediaPlayer.mVideoSarDen);
        return;
        DebugLog.e(FimiMediaPlayer.TAG, "Error (" + paramMessage.arg1 + "," + paramMessage.arg2 + ")");
        if (!localFimiMediaPlayer.notifyOnError(paramMessage.arg1, paramMessage.arg2)) {
          localFimiMediaPlayer.notifyOnCompletion();
        }
        localFimiMediaPlayer.stayAwake(false);
        return;
        switch (paramMessage.arg1)
        {
        }
        for (;;)
        {
          localFimiMediaPlayer.notifyOnInfo(paramMessage.arg1, paramMessage.arg2);
          return;
          DebugLog.i(FimiMediaPlayer.TAG, "Info: MEDIA_INFO_VIDEO_RENDERING_START\n");
        }
        FimiMediaPlayer.access$502(localFimiMediaPlayer, paramMessage.arg1);
        FimiMediaPlayer.access$602(localFimiMediaPlayer, paramMessage.arg2);
        localFimiMediaPlayer.notifyOnVideoSizeChanged(localFimiMediaPlayer.mVideoWidth, localFimiMediaPlayer.mVideoHeight, localFimiMediaPlayer.mVideoSarNum, localFimiMediaPlayer.mVideoSarDen);
        return;
      }
    }
  }
  
  public static abstract interface OnControlMessageListener
  {
    public abstract String onControlResolveSegmentUrl(int paramInt);
  }
  
  public static abstract interface OnMediaCodecSelectListener
  {
    public abstract String onMediaCodecSelect(IMediaPlayer paramIMediaPlayer, String paramString, int paramInt1, int paramInt2);
  }
  
  public static abstract interface OnNativeInvokeListener
  {
    public abstract boolean onNativeInvoke(int paramInt, Bundle paramBundle);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FimiMediaPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */