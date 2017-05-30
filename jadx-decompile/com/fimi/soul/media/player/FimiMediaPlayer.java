package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
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
import com.facebook.common.util.UriUtil;
import com.fimi.soul.media.player.annotations.AccessedByNative;
import com.fimi.soul.media.player.annotations.CalledByNative;
import com.fimi.soul.media.player.pragma.DebugLog;
import com.google.android.gms.drive.e;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public final class FimiMediaPlayer extends AbstractMediaPlayer {
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
    private static FimiLibLoader sLocalLibLoader = new FimiLibLoader() {
        public void loadLibrary(String str) {
            System.loadLibrary(str);
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
    private WakeLock mWakeLock;

    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2);
    }

    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
            if (VERSION.SDK_INT < 16) {
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}));
            ArrayList arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                Log.d(FimiMediaPlayer.TAG, String.format(Locale.US, "  found codec: %s", new Object[]{codecInfoAt.getName()}));
                if (!codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    if (supportedTypes != null) {
                        for (Object obj : supportedTypes) {
                            if (!TextUtils.isEmpty(obj)) {
                                Log.d(FimiMediaPlayer.TAG, String.format(Locale.US, "    mime: %s", new Object[]{obj}));
                                if (obj.equalsIgnoreCase(str)) {
                                    FimiMediaCodecInfo fimiMediaCodecInfo = FimiMediaCodecInfo.setupCandidate(codecInfoAt, str);
                                    if (fimiMediaCodecInfo != null) {
                                        arrayList.add(fimiMediaCodecInfo);
                                        Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "candidate codec: %s rank=%d", new Object[]{codecInfoAt.getName(), Integer.valueOf(fimiMediaCodecInfo.mRank)}));
                                        fimiMediaCodecInfo.dumpProfileLevels(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            FimiMediaCodecInfo fimiMediaCodecInfo2 = (FimiMediaCodecInfo) arrayList.get(0);
            Iterator it = arrayList.iterator();
            FimiMediaCodecInfo fimiMediaCodecInfo3 = fimiMediaCodecInfo2;
            while (it.hasNext()) {
                fimiMediaCodecInfo2 = (FimiMediaCodecInfo) it.next();
                if (fimiMediaCodecInfo2.mRank <= fimiMediaCodecInfo3.mRank) {
                    fimiMediaCodecInfo2 = fimiMediaCodecInfo3;
                }
                fimiMediaCodecInfo3 = fimiMediaCodecInfo2;
            }
            if (fimiMediaCodecInfo3.mRank < FimiMediaCodecInfo.RANK_LAST_CHANCE) {
                Log.w(FimiMediaPlayer.TAG, String.format(Locale.US, "unaccetable codec: %s", new Object[]{fimiMediaCodecInfo3.mCodecInfo.getName()}));
                return null;
            }
            Log.i(FimiMediaPlayer.TAG, String.format(Locale.US, "selected codec: %s rank=%d", new Object[]{fimiMediaCodecInfo3.mCodecInfo.getName(), Integer.valueOf(fimiMediaCodecInfo3.mRank)}));
            return fimiMediaCodecInfo3.mCodecInfo.getName();
        }
    }

    private static class EventHandler extends Handler {
        private WeakReference<FimiMediaPlayer> mWeakPlayer;

        public EventHandler(FimiMediaPlayer fimiMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference(fimiMediaPlayer);
        }

        public void handleMessage(Message message) {
            FimiMediaPlayer fimiMediaPlayer = (FimiMediaPlayer) this.mWeakPlayer.get();
            if (fimiMediaPlayer == null || fimiMediaPlayer.mNativeMediaPlayer == 0) {
                DebugLog.w(FimiMediaPlayer.TAG, "FimiMediaPlayer went away with unhandled events");
                return;
            }
            switch (message.what) {
                case 0:
                case 99:
                    return;
                case 1:
                    fimiMediaPlayer.notifyOnPrepared();
                    return;
                case 2:
                    fimiMediaPlayer.notifyOnCompletion();
                    fimiMediaPlayer.stayAwake(false);
                    return;
                case 3:
                    long j = (long) message.arg1;
                    if (j < 0) {
                        j = 0;
                    }
                    long duration = fimiMediaPlayer.getDuration();
                    j = duration > 0 ? (j * 100) / duration : 0;
                    if (j >= 100) {
                        j = 100;
                    }
                    fimiMediaPlayer.notifyOnBufferingUpdate((int) j);
                    return;
                case 4:
                    fimiMediaPlayer.notifyOnSeekComplete();
                    return;
                case 5:
                    fimiMediaPlayer.mVideoWidth = message.arg1;
                    fimiMediaPlayer.mVideoHeight = message.arg2;
                    fimiMediaPlayer.notifyOnVideoSizeChanged(fimiMediaPlayer.mVideoWidth, fimiMediaPlayer.mVideoHeight, fimiMediaPlayer.mVideoSarNum, fimiMediaPlayer.mVideoSarDen);
                    return;
                case 100:
                    DebugLog.e(FimiMediaPlayer.TAG, "Error (" + message.arg1 + Constants.ACCEPT_TIME_SEPARATOR_SP + message.arg2 + ")");
                    if (!fimiMediaPlayer.notifyOnError(message.arg1, message.arg2)) {
                        fimiMediaPlayer.notifyOnCompletion();
                    }
                    fimiMediaPlayer.stayAwake(false);
                    return;
                case 200:
                    switch (message.arg1) {
                        case 3:
                            DebugLog.i(FimiMediaPlayer.TAG, "Info: MEDIA_INFO_VIDEO_RENDERING_START\n");
                            break;
                    }
                    fimiMediaPlayer.notifyOnInfo(message.arg1, message.arg2);
                    return;
                case 10001:
                    fimiMediaPlayer.mVideoSarNum = message.arg1;
                    fimiMediaPlayer.mVideoSarDen = message.arg2;
                    fimiMediaPlayer.notifyOnVideoSizeChanged(fimiMediaPlayer.mVideoWidth, fimiMediaPlayer.mVideoHeight, fimiMediaPlayer.mVideoSarNum, fimiMediaPlayer.mVideoSarDen);
                    return;
                default:
                    DebugLog.e(FimiMediaPlayer.TAG, "Unknown message type " + message.what);
                    return;
            }
        }
    }

    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i);
    }

    public interface OnNativeInvokeListener {
        boolean onNativeInvoke(int i, Bundle bundle);
    }

    public FimiMediaPlayer() {
        this(sLocalLibLoader);
    }

    public FimiMediaPlayer(FimiLibLoader fimiLibLoader) {
        this.mWakeLock = null;
        initPlayer(fimiLibLoader);
    }

    private native String _getAudioCodecInfo();

    private static native String _getColorFormatName(int i);

    private native Bundle _getMediaMeta();

    private native String _getVideoCodecInfo();

    private native void _pause();

    private native void _release();

    private native void _reset();

    private native void _setDataSource(String str, String[] strArr, String[] strArr2);

    private native void _setDataSourceFd(int i);

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setVideoSurface(Surface surface);

    private native void _start();

    private native void _stop();

    private native int _stream2jpg(String str, String str2);

    public static String getColorFormatName(int i) {
        return _getColorFormatName(i);
    }

    public static FimiMediaPlayer getIntance() {
        return fimiMediaPlayer == null ? new FimiMediaPlayer() : fimiMediaPlayer;
    }

    private static void initNativeOnce() {
        synchronized (FimiMediaPlayer.class) {
            long lastModified = new File("com.fimi.soul.media.player.FimiMediaPlayer.java").lastModified();
            if (!mIsNativeInitialized) {
                native_init();
                mIsNativeInitialized = true;
                DebugLog.w(TAG, "aizj version=" + lastModified);
            }
        }
    }

    private void initPlayer(FimiLibLoader fimiLibLoader) {
        loadLibrariesOnce(fimiLibLoader);
        initNativeOnce();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(this, myLooper);
        } else {
            myLooper = Looper.getMainLooper();
            if (myLooper != null) {
                this.mEventHandler = new EventHandler(this, myLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        native_setup(new WeakReference(this));
    }

    public static void loadLibrariesOnce(FimiLibLoader fimiLibLoader) {
        synchronized (FimiMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (fimiLibLoader == null) {
                    fimiLibLoader = sLocalLibLoader;
                }
                fimiLibLoader.loadLibrary("fmffmpeg");
                fimiLibLoader.loadLibrary("fmsdl");
                fimiLibLoader.loadLibrary("fmplayer");
                mIsLibLoaded = true;
            }
        }
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    @CalledByNative
    private static String onControlResolveSegmentUrl(Object obj, int i) {
        DebugLog.ifmt(TAG, "onControlResolveSegmentUrl %d", Integer.valueOf(i));
        if (obj == null || !(obj instanceof WeakReference)) {
            return null;
        }
        FimiMediaPlayer fimiMediaPlayer = (FimiMediaPlayer) ((WeakReference) obj).get();
        if (fimiMediaPlayer == null) {
            return null;
        }
        OnControlMessageListener onControlMessageListener = fimiMediaPlayer.mOnControlMessageListener;
        return onControlMessageListener == null ? null : onControlMessageListener.onControlResolveSegmentUrl(i);
    }

    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i, Bundle bundle) {
        DebugLog.ifmt(TAG, "onNativeInvoke %d", Integer.valueOf(i));
        if (obj == null || !(obj instanceof WeakReference)) {
            return false;
        }
        FimiMediaPlayer fimiMediaPlayer = (FimiMediaPlayer) ((WeakReference) obj).get();
        if (fimiMediaPlayer == null) {
            return false;
        }
        OnNativeInvokeListener onNativeInvokeListener = fimiMediaPlayer.mOnNativeInvokeListener;
        return onNativeInvokeListener == null ? false : onNativeInvokeListener.onNativeInvoke(i, bundle);
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        if (obj == null || !(obj instanceof WeakReference)) {
            return null;
        }
        FimiMediaPlayer fimiMediaPlayer = (FimiMediaPlayer) ((WeakReference) obj).get();
        if (fimiMediaPlayer == null) {
            return null;
        }
        OnMediaCodecSelectListener onMediaCodecSelectListener = fimiMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(fimiMediaPlayer, str, i, i2);
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        if (obj != null) {
            FimiMediaPlayer fimiMediaPlayer = (FimiMediaPlayer) ((WeakReference) obj).get();
            if (fimiMediaPlayer != null) {
                if (i == 200 && i2 == 2) {
                    fimiMediaPlayer.start();
                }
                if (fimiMediaPlayer.mEventHandler != null) {
                    fimiMediaPlayer.mEventHandler.sendMessage(fimiMediaPlayer.mEventHandler.obtainMessage(i, i2, i3, obj2));
                }
            }
        }
    }

    private void setDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        setDataSource(fileDescriptor);
    }

    @SuppressLint({"Wakelock"})
    private void stayAwake(boolean z) {
        if (this.mWakeLock != null) {
            if (z && !this.mWakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        if (this.mSurfaceHolder != null) {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            boolean z = this.mScreenOnWhilePlaying && this.mStayAwake;
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    public native void _prepareAsync();

    public int concatVedio(String str, String str2) {
        return fm_avp_concatVid(str, str2);
    }

    protected void finalize() {
        native_finalize();
    }

    public native int fm_avp_concatVid(String str, String str2);

    public native int fm_avp_mergeAV(String str, String str2, String str3);

    public native int fm_avp_splitVid(String str, String str2, int i, int i2);

    public native int fm_avp_vid2img(String str, String str2);

    public native int getAudioSessionId();

    public native long getCurrentPosition();

    public String getDataSource() {
        return this.mDataSource;
    }

    public native long getDuration();

    public MediaInfo getMediaInfo() {
        String[] split;
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        Object _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            split = _getVideoCodecInfo.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length >= 2) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = split[1];
            } else if (split.length >= 1) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        _getVideoCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            split = _getVideoCodecInfo.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length >= 2) {
                mediaInfo.mAudioDecoder = split[0];
                mediaInfo.mAudioDecoderImpl = split[1];
            } else if (split.length >= 1) {
                mediaInfo.mAudioDecoder = split[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = FimiMediaMeta.parse(_getMediaMeta());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mediaInfo;
    }

    public Bundle getMediaMeta() {
        return _getMediaMeta();
    }

    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public boolean isPlayable() {
        return true;
    }

    public native boolean isPlaying();

    public int mergeAudio2Vedio(String str, String str2, String str3) {
        return fm_avp_mergeAV(str, str2, str3);
    }

    public void pause() {
        stayAwake(false);
        _pause();
    }

    public void prepareAsync() {
        _prepareAsync();
    }

    public void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        resetListeners();
        _release();
    }

    public void reset() {
        stayAwake(false);
        _reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    public void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    public native void seekTo(long j);

    public void setAudioStreamType(int i) {
    }

    public void setDataSource(Context context, Uri uri) {
        setDataSource(context, uri, null);
    }

    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        Throwable th;
        String scheme = uri.getScheme();
        if (UriUtil.LOCAL_FILE_SCHEME.equals(scheme)) {
            setDataSource(uri.getPath());
            return;
        }
        if ("content".equals(scheme) && "settings".equals(uri.getAuthority())) {
            uri = RingtoneManager.getActualDefaultRingtoneUri(context, RingtoneManager.getDefaultType(uri));
            if (uri == null) {
                throw new FileNotFoundException("Failed to resolve default ringtone");
            }
        }
        AssetFileDescriptor assetFileDescriptor = null;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                try {
                    if (openAssetFileDescriptor.getDeclaredLength() < 0) {
                        setDataSource(openAssetFileDescriptor.getFileDescriptor());
                    } else {
                        setDataSource(openAssetFileDescriptor.getFileDescriptor(), openAssetFileDescriptor.getStartOffset(), openAssetFileDescriptor.getDeclaredLength());
                    }
                    if (openAssetFileDescriptor != null) {
                        openAssetFileDescriptor.close();
                    }
                } catch (SecurityException e) {
                    assetFileDescriptor = openAssetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    Log.d(TAG, "Couldn't open file on client side, trying server side");
                    setDataSource(uri.toString(), (Map) map);
                } catch (IOException e2) {
                    if (openAssetFileDescriptor != null) {
                        openAssetFileDescriptor.close();
                    }
                    Log.d(TAG, "Couldn't open file on client side, trying server side");
                    setDataSource(uri.toString(), (Map) map);
                } catch (Throwable th2) {
                    th = th2;
                    if (openAssetFileDescriptor != null) {
                        openAssetFileDescriptor.close();
                    }
                    throw th;
                }
            } else if (openAssetFileDescriptor != null) {
                openAssetFileDescriptor.close();
            }
        } catch (SecurityException e3) {
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            Log.d(TAG, "Couldn't open file on client side, trying server side");
            setDataSource(uri.toString(), (Map) map);
        } catch (IOException e4) {
            openAssetFileDescriptor = null;
            if (openAssetFileDescriptor != null) {
                openAssetFileDescriptor.close();
            }
            Log.d(TAG, "Couldn't open file on client side, trying server side");
            setDataSource(uri.toString(), (Map) map);
        } catch (Throwable th3) {
            openAssetFileDescriptor = null;
            th = th3;
            if (openAssetFileDescriptor != null) {
                openAssetFileDescriptor.close();
            }
            throw th;
        }
    }

    @TargetApi(13)
    public void setDataSource(FileDescriptor fileDescriptor) {
        if (VERSION.SDK_INT < 12) {
            try {
                Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                _setDataSourceFd(declaredField.getInt(fileDescriptor));
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            _setDataSourceFd(dup.getFd());
        } finally {
            dup.close();
        }
    }

    public void setDataSource(String str) {
        this.mDataSource = str;
        _setDataSource(str, null, null);
    }

    public void setDataSource(String str, Map<String, String> map) {
        if (!(map == null || map.isEmpty())) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append(":");
                if (!TextUtils.isEmpty((String) entry.getValue())) {
                    stringBuilder.append((String) entry.getValue());
                }
                stringBuilder.append("\r\n");
            }
        }
        setDataSource(str);
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        _setVideoSurface(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        updateSurfaceScreenOn();
    }

    public void setKeepInBackground(boolean z) {
    }

    public void setLogEnabled(boolean z) {
    }

    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    public void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    public void setOption(int i, String str, long j) {
        _setOption(i, str, j);
    }

    public void setOption(int i, String str, String str2) {
        _setOption(i, str, str2);
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    public native void setVolume(float f, float f2);

    @SuppressLint({"Wakelock"})
    public void setWakeMode(Context context, int i) {
        boolean z;
        if (this.mWakeLock != null) {
            boolean z2;
            if (this.mWakeLock.isHeld()) {
                z2 = true;
                this.mWakeLock.release();
            } else {
                z2 = false;
            }
            this.mWakeLock = null;
            z = z2;
        } else {
            z = false;
        }
        this.mWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(e.c | i, FimiMediaPlayer.class.getName());
        this.mWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    public int spliteVedio(String str, String str2, int i, int i2) {
        return fm_avp_splitVid(str, str2, i, i2);
    }

    public void start() {
        stayAwake(true);
        _start();
    }

    public void stop() {
        stayAwake(false);
        _stop();
    }

    public int vid2imgArray(String str, String str2) {
        return fm_avp_vid2img(str, str2);
    }

    public boolean videoToJpg(String str, String str2) {
        return (str == null || "".equals(str) || _stream2jpg(str, str2) != 0) ? false : true;
    }
}
