package com.fimi.soul.media.player.widget;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.fimi.soul.media.player.FimiMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnBufferingUpdateListener;
import com.fimi.soul.media.player.IMediaPlayer.OnCompletionListener;
import com.fimi.soul.media.player.IMediaPlayer.OnErrorListener;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import com.fimi.soul.media.player.widget.FmMediaController.MediaPlayerControl;
import com.fimi.soul.media.player.widget.IRenderView.IRenderCallback;
import com.fimi.soul.media.player.widget.IRenderView.ISurfaceHolder;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class FimiVideoView extends FrameLayout implements MediaPlayerControl {
    public static final int RENDER_NONE = 0;
    public static final int RENDER_SURFACE_VIEW = 1;
    public static final int RENDER_TEXTURE_VIEW = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private static final int[] s_allAspectRatio = new int[]{0, 1, 2, 3, 4, 5};
    private String TAG = "IjkVideoView";
    private int decodeType = 0;
    private List<Integer> mAllRenders = new ArrayList();
    private Context mAppContext;
    private OnBufferingUpdateListener mBufferingUpdateListener = new OnBufferingUpdateListener() {
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            FimiVideoView.this.mCurrentBufferPercentage = i;
        }
    };
    private boolean mCanPause = true;
    private boolean mCanSeekBack;
    private boolean mCanSeekForward;
    private OnCompletionListener mCompletionListener = new OnCompletionListener() {
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            FimiVideoView.this.mCurrentState = 5;
            FimiVideoView.this.mTargetState = 5;
            if (FimiVideoView.this.mMediaController != null) {
                FimiVideoView.this.mMediaController.hide();
            }
            if (FimiVideoView.this.mOnCompletionListener != null) {
                FimiVideoView.this.mOnCompletionListener.onCompletion(FimiVideoView.this.mMediaPlayer);
            }
        }
    };
    private int mCurrentAspectRatio = s_allAspectRatio[0];
    private int mCurrentAspectRatioIndex = 0;
    private int mCurrentBufferPercentage;
    private int mCurrentRender = 0;
    private int mCurrentRenderIndex = 0;
    private int mCurrentState = 0;
    private OnErrorListener mErrorListener = new OnErrorListener() {
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            Log.d(FimiVideoView.this.TAG, "Error: " + i + Constants.ACCEPT_TIME_SEPARATOR_SP + i2);
            FimiVideoView.this.mCurrentState = -1;
            FimiVideoView.this.mTargetState = -1;
            if (FimiVideoView.this.mMediaController != null) {
                FimiVideoView.this.mMediaController.hide();
            }
            if (iMediaPlayer.getDataSource().contains("rtsp:")) {
                Intent intent = new Intent("resetRTSP");
                intent.putExtra("rtsp", 1);
                FimiVideoView.this.mAppContext.sendBroadcast(intent);
            }
            return FimiVideoView.this.mOnErrorListener != null && FimiVideoView.this.mOnErrorListener.onError(FimiVideoView.this.mMediaPlayer, i, i2);
        }
    };
    private Map<String, String> mHeaders;
    private OnInfoListener mInfoListener = new OnInfoListener() {
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            if (FimiVideoView.this.mOnInfoListener != null) {
                FimiVideoView.this.mOnInfoListener.onInfo(iMediaPlayer, i, i2);
            }
            switch (i) {
                case 10001:
                    FimiVideoView.this.mVideoRotationDegree = i2;
                    Log.d(FimiVideoView.this.TAG, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i2);
                    if (FimiVideoView.this.mRenderView != null) {
                        FimiVideoView.this.mRenderView.setVideoRotation(i2);
                        break;
                    }
                    break;
            }
            return true;
        }
    };
    private IMediaController mMediaController;
    private IMediaPlayer mMediaPlayer = null;
    private OnCompletionListener mOnCompletionListener;
    private OnErrorListener mOnErrorListener;
    private OnInfoListener mOnInfoListener;
    private OnPreparedListener mOnPreparedListener;
    OnPreparedListener mPreparedListener = new OnPreparedListener() {
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            FimiVideoView.this.mCurrentState = 2;
            if (FimiVideoView.this.mOnPreparedListener != null) {
                FimiVideoView.this.mOnPreparedListener.onPrepared(FimiVideoView.this.mMediaPlayer);
            }
            if (FimiVideoView.this.mMediaController != null) {
                FimiVideoView.this.mMediaController.setEnabled(true);
            }
            FimiVideoView.this.mVideoWidth = iMediaPlayer.getVideoWidth();
            FimiVideoView.this.mVideoHeight = iMediaPlayer.getVideoHeight();
            int access$900 = FimiVideoView.this.mSeekWhenPrepared;
            if (access$900 != 0) {
                FimiVideoView.this.seekTo(access$900);
            }
            if (FimiVideoView.this.mVideoWidth == 0 || FimiVideoView.this.mVideoHeight == 0) {
                if (FimiVideoView.this.mTargetState == 3) {
                    FimiVideoView.this.start();
                }
            } else if (FimiVideoView.this.mRenderView != null) {
                FimiVideoView.this.mRenderView.setVideoSize(FimiVideoView.this.mVideoWidth, FimiVideoView.this.mVideoHeight);
                FimiVideoView.this.mRenderView.setVideoSampleAspectRatio(FimiVideoView.this.mVideoSarNum, FimiVideoView.this.mVideoSarDen);
                if (!FimiVideoView.this.mRenderView.shouldWaitForResize() || (FimiVideoView.this.mSurfaceWidth == FimiVideoView.this.mVideoWidth && FimiVideoView.this.mSurfaceHeight == FimiVideoView.this.mVideoHeight)) {
                    if (FimiVideoView.this.mTargetState == 3) {
                        FimiVideoView.this.start();
                        if (FimiVideoView.this.mMediaController != null) {
                            FimiVideoView.this.mMediaController.show();
                        }
                    } else if (!FimiVideoView.this.isPlaying() && ((access$900 != 0 || FimiVideoView.this.getCurrentPosition() > 0) && FimiVideoView.this.mMediaController != null)) {
                        FimiVideoView.this.mMediaController.show(0);
                    }
                }
            }
            if (iMediaPlayer.getDataSource().contains("rtsp:")) {
                FimiVideoView.this.getHandler().sendEmptyMessage(0);
                Intent intent = new Intent("resetRTSP");
                intent.putExtra("rtsp", 0);
                FimiVideoView.this.mAppContext.sendBroadcast(intent);
            }
        }
    };
    private IRenderView mRenderView;
    IRenderCallback mSHCallback = new IRenderCallback() {
        public void onSurfaceChanged(@NonNull ISurfaceHolder iSurfaceHolder, int i, int i2, int i3) {
            Object obj = null;
            if (iSurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView) {
                Log.e(FimiVideoView.this.TAG, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            FimiVideoView.this.mSurfaceWidth = i2;
            FimiVideoView.this.mSurfaceHeight = i3;
            Object obj2 = FimiVideoView.this.mTargetState == 3 ? 1 : null;
            if (!FimiVideoView.this.mRenderView.shouldWaitForResize() || (FimiVideoView.this.mVideoWidth == i2 && FimiVideoView.this.mVideoHeight == i3)) {
                obj = 1;
            }
            if (FimiVideoView.this.mMediaPlayer != null && obj2 != null && r2 != null) {
                if (FimiVideoView.this.mSeekWhenPrepared != 0) {
                    FimiVideoView.this.seekTo(FimiVideoView.this.mSeekWhenPrepared);
                }
                FimiVideoView.this.start();
            }
        }

        public void onSurfaceCreated(@NonNull ISurfaceHolder iSurfaceHolder, int i, int i2) {
            if (iSurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView) {
                Log.e(FimiVideoView.this.TAG, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            FimiVideoView.this.mSurfaceHolder = iSurfaceHolder;
            if (FimiVideoView.this.mMediaPlayer != null) {
                FimiVideoView.this.bindSurfaceHolder(FimiVideoView.this.mMediaPlayer, iSurfaceHolder);
            } else {
                FimiVideoView.this.openVideo(FimiVideoView.this.decodeType);
            }
        }

        public void onSurfaceDestroyed(@NonNull ISurfaceHolder iSurfaceHolder) {
            if (iSurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView) {
                Log.e(FimiVideoView.this.TAG, "onSurfaceDestroyed: unmatched render callback\n");
                return;
            }
            FimiVideoView.this.mSurfaceHolder = null;
            FimiVideoView.this.releaseWithoutStop();
        }
    };
    private int mSeekWhenPrepared;
    OnVideoSizeChangedListener mSizeChangedListener = new OnVideoSizeChangedListener() {
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            FimiVideoView.this.mVideoWidth = iMediaPlayer.getVideoWidth();
            FimiVideoView.this.mVideoHeight = iMediaPlayer.getVideoHeight();
            FimiVideoView.this.mVideoSarNum = iMediaPlayer.getVideoSarNum();
            FimiVideoView.this.mVideoSarDen = iMediaPlayer.getVideoSarDen();
            if (FimiVideoView.this.mVideoWidth != 0 && FimiVideoView.this.mVideoHeight != 0) {
                if (FimiVideoView.this.mRenderView != null) {
                    FimiVideoView.this.mRenderView.setVideoSize(FimiVideoView.this.mVideoWidth, FimiVideoView.this.mVideoHeight);
                    FimiVideoView.this.mRenderView.setVideoSampleAspectRatio(FimiVideoView.this.mVideoSarNum, FimiVideoView.this.mVideoSarDen);
                }
                FimiVideoView.this.requestLayout();
            }
        }
    };
    private int mSurfaceHeight;
    private ISurfaceHolder mSurfaceHolder = null;
    private int mSurfaceWidth;
    private int mTargetState = 0;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoRotationDegree;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;

    public FimiVideoView(Context context) {
        super(context);
        initVideoView(context);
    }

    public FimiVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initVideoView(context);
    }

    public FimiVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initVideoView(context);
    }

    public FimiVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        initVideoView(context);
    }

    private void attachMediaController() {
        if (this.mMediaPlayer != null && this.mMediaController != null) {
            this.mMediaController.setMediaPlayer(this);
            this.mMediaController.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
            this.mMediaController.setEnabled(isInPlaybackState());
        }
    }

    private void bindSurfaceHolder(IMediaPlayer iMediaPlayer, ISurfaceHolder iSurfaceHolder) {
        if (iMediaPlayer != null) {
            if (iSurfaceHolder == null) {
                iMediaPlayer.setDisplay(null);
            } else {
                iSurfaceHolder.bindToMediaPlayer(iMediaPlayer);
            }
        }
    }

    private void initRenders() {
        this.mAllRenders.clear();
        this.mAllRenders.add(Integer.valueOf(1));
        if (this.mAllRenders.isEmpty()) {
            this.mAllRenders.add(Integer.valueOf(1));
        }
        this.mCurrentRender = ((Integer) this.mAllRenders.get(this.mCurrentRenderIndex)).intValue();
        setRender(this.mCurrentRender);
    }

    private void initVideoView(Context context) {
        this.mAppContext = context.getApplicationContext();
        initRenders();
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.mCurrentState = 0;
        this.mTargetState = 0;
    }

    private boolean isInPlaybackState() {
        return (this.mMediaPlayer == null || this.mCurrentState == -1 || this.mCurrentState == 0 || this.mCurrentState == 1) ? false : true;
    }

    private void openVideo(int i) {
        if (this.mUri != null && this.mSurfaceHolder != null) {
            release(false);
            ((AudioManager) this.mAppContext.getSystemService("audio")).requestAudioFocus(null, 3, 1);
            IMediaPlayer iMediaPlayer = null;
            try {
                if (this.mUri != null) {
                    iMediaPlayer = FimiMediaPlayer.getIntance();
                    FimiMediaPlayer.native_setLogLevel(3);
                    iMediaPlayer.setOption(4, "mediacodec", (long) i);
                    iMediaPlayer.setOption(4, "framedrop", 20);
                    iMediaPlayer.setOption(4, "start-on-prepared", 0);
                    iMediaPlayer.setOption(1, "http-detect-range-support", 0);
                    iMediaPlayer.setOption(2, "skip_loop_filter", 48);
                    iMediaPlayer.setOption(1, "analyzeduration", "20000");
                    iMediaPlayer.setOption(1, "probsize", "4096");
                }
                this.mMediaPlayer = iMediaPlayer;
                getContext();
                this.mMediaPlayer.setOnPreparedListener(this.mPreparedListener);
                this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
                this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
                this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
                this.mMediaPlayer.setOnInfoListener(this.mInfoListener);
                this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
                this.mCurrentBufferPercentage = 0;
                if (VERSION.SDK_INT > 14) {
                    this.mMediaPlayer.setDataSource(this.mAppContext, this.mUri, this.mHeaders);
                } else {
                    this.mMediaPlayer.setDataSource(this.mUri.toString());
                }
                bindSurfaceHolder(this.mMediaPlayer, this.mSurfaceHolder);
                this.mMediaPlayer.setAudioStreamType(3);
                this.mMediaPlayer.setScreenOnWhilePlaying(true);
                this.mMediaPlayer.prepareAsync();
                this.mCurrentState = 1;
                attachMediaController();
            } catch (Throwable e) {
                Log.w(this.TAG, "Unable to open content: " + this.mUri, e);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            } catch (Throwable e2) {
                Log.w(this.TAG, "Unable to open content: " + this.mUri, e2);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            }
        }
    }

    private void setVideoURI(Uri uri, Map<String, String> map) {
        this.mUri = uri;
        this.mHeaders = map;
        this.mSeekWhenPrepared = 0;
        openVideo(this.decodeType);
        requestLayout();
        invalidate();
    }

    private void toggleMediaControlsVisiblity() {
        if (this.mMediaController.isShowing()) {
            this.mMediaController.hide();
        } else {
            this.mMediaController.show();
        }
    }

    public boolean canPause() {
        return this.mCanPause;
    }

    public boolean canSeekBackward() {
        return this.mCanSeekBack;
    }

    public boolean canSeekForward() {
        return this.mCanSeekForward;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        return this.mMediaPlayer != null ? this.mCurrentBufferPercentage : 0;
    }

    public int getCurrentPosition() {
        return isInPlaybackState() ? (int) this.mMediaPlayer.getCurrentPosition() : 0;
    }

    public int getDuration() {
        Log.d("player", "getDuration");
        return isInPlaybackState() ? (int) this.mMediaPlayer.getDuration() : -1;
    }

    public int getmCurrentState() {
        return this.mCurrentState;
    }

    public boolean isPlaying() {
        return isInPlaybackState() && this.mMediaPlayer.isPlaying();
    }

    public void onFinishInflate() {
        Log.d("player", "onFinishInflate");
        super.onFinishInflate();
        if (isPlaying()) {
            pause();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == Opcodes.IF_ICMPLE || i == 82 || i == 5 || i == 6) ? false : true;
        if (isInPlaybackState() && z && this.mMediaController != null) {
            if (i == 79 || i == 85) {
                if (this.mMediaPlayer.isPlaying()) {
                    pause();
                    this.mMediaController.show();
                    return true;
                }
                start();
                this.mMediaController.hide();
                return true;
            } else if (i == 126) {
                if (this.mMediaPlayer.isPlaying()) {
                    return true;
                }
                start();
                this.mMediaController.hide();
                return true;
            } else if (i != 86 && i != 127) {
                toggleMediaControlsVisiblity();
            } else if (!this.mMediaPlayer.isPlaying()) {
                return true;
            } else {
                pause();
                this.mMediaController.show();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isInPlaybackState() && this.mMediaController != null) {
            toggleMediaControlsVisiblity();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (isInPlaybackState() && this.mMediaController != null) {
            toggleMediaControlsVisiblity();
        }
        return false;
    }

    public void pause() {
        Log.d("player", "pause");
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.pause();
            if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
                this.mMediaPlayer.pause();
                this.mCurrentState = 4;
            }
            this.mTargetState = 4;
        }
    }

    public void release(boolean z) {
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            if (z) {
                this.mTargetState = 0;
            }
            ((AudioManager) this.mAppContext.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void releaseWithoutStop() {
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setDisplay(null);
        }
    }

    public void resume() {
        Log.d("Good", "resume");
        openVideo(this.decodeType);
    }

    public void seekTo(int i) {
        Log.d("player", "seekto");
        if (isInPlaybackState()) {
            this.mMediaPlayer.seekTo((long) i);
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = i;
    }

    public void setDecodeType(int i) {
        this.decodeType = i;
    }

    public void setHideSurfaceView(boolean z) {
        if (this.mRenderView instanceof SurfaceRenderView) {
            ((SurfaceRenderView) this.mRenderView).getHolder().setFormat(z ? -2 : 4);
        }
    }

    public void setMediaController(IMediaController iMediaController) {
        if (this.mMediaController != null) {
            this.mMediaController.hide();
        }
        this.mMediaController = iMediaController;
        attachMediaController();
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setRender(int i) {
        switch (i) {
            case 0:
                setRenderView(null);
                return;
            case 1:
                setRenderView(new SurfaceRenderView(getContext()));
                return;
            case 2:
                IRenderView textureRenderView = new TextureRenderView(getContext());
                if (this.mMediaPlayer != null) {
                    textureRenderView.getSurfaceHolder().bindToMediaPlayer(this.mMediaPlayer);
                    textureRenderView.setVideoSize(this.mMediaPlayer.getVideoWidth(), this.mMediaPlayer.getVideoHeight());
                    textureRenderView.setVideoSampleAspectRatio(this.mMediaPlayer.getVideoSarNum(), this.mMediaPlayer.getVideoSarDen());
                    textureRenderView.setAspectRatio(this.mCurrentAspectRatio);
                }
                setRenderView(textureRenderView);
                return;
            default:
                Log.e(this.TAG, String.format(Locale.getDefault(), "invalid render %d\n", new Object[]{Integer.valueOf(i)}));
                return;
        }
    }

    public void setRenderView(IRenderView iRenderView) {
        if (this.mRenderView != null) {
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.setDisplay(null);
            }
            View view = this.mRenderView.getView();
            this.mRenderView.removeRenderCallback(this.mSHCallback);
            this.mRenderView = null;
            removeView(view);
        }
        if (iRenderView != null) {
            this.mRenderView = iRenderView;
            iRenderView.setAspectRatio(this.mCurrentAspectRatio);
            if (this.mVideoWidth > 0 && this.mVideoHeight > 0) {
                iRenderView.setVideoSize(this.mVideoWidth, this.mVideoHeight);
            }
            if (this.mVideoSarNum > 0 && this.mVideoSarDen > 0) {
                iRenderView.setVideoSampleAspectRatio(this.mVideoSarNum, this.mVideoSarDen);
            }
            view = this.mRenderView.getView();
            view.setLayoutParams(new LayoutParams(-2, -2, 17));
            addView(view);
            this.mRenderView.addRenderCallback(this.mSHCallback);
            this.mRenderView.setVideoRotation(this.mVideoRotationDegree);
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, null);
    }

    public void setZOrderMediaOverlay(boolean z) {
        if (this.mRenderView instanceof SurfaceRenderView) {
            ((SurfaceRenderView) this.mRenderView).setZOrderMediaOverlay(z);
        }
    }

    public void start() {
        if (this.mCurrentState == 5) {
            setVideoURI(this.mUri);
        }
        if (isInPlaybackState()) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
        }
        this.mTargetState = 3;
    }

    public void stopPlayback() {
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            this.mTargetState = 0;
            ((AudioManager) this.mAppContext.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void suspend() {
        Log.d("Good", "suspend");
        release(false);
    }

    public int toggleAspectRatio() {
        this.mCurrentAspectRatioIndex++;
        this.mCurrentAspectRatioIndex %= s_allAspectRatio.length;
        this.mCurrentAspectRatio = 1;
        if (this.mRenderView != null) {
            this.mRenderView.setAspectRatio(this.mCurrentAspectRatio);
        }
        return this.mCurrentAspectRatio;
    }

    public int toggleAspectRatioPOi() {
        this.mCurrentAspectRatioIndex++;
        this.mCurrentAspectRatioIndex %= s_allAspectRatio.length;
        this.mCurrentAspectRatio = 3;
        if (this.mRenderView != null) {
            this.mRenderView.setAspectRatio(this.mCurrentAspectRatio);
        }
        return this.mCurrentAspectRatio;
    }

    public int toggleRender() {
        this.mCurrentRenderIndex++;
        this.mCurrentRenderIndex %= this.mAllRenders.size();
        this.mCurrentRender = ((Integer) this.mAllRenders.get(this.mCurrentRenderIndex)).intValue();
        setRender(this.mCurrentRender);
        return this.mCurrentRender;
    }
}
