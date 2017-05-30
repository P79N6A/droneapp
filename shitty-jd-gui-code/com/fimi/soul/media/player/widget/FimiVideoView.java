package com.fimi.soul.media.player.widget;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnBufferingUpdateListener;
import com.fimi.soul.media.player.IMediaPlayer.OnCompletionListener;
import com.fimi.soul.media.player.IMediaPlayer.OnErrorListener;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class FimiVideoView
  extends FrameLayout
  implements FmMediaController.MediaPlayerControl
{
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
  private static final int[] s_allAspectRatio = { 0, 1, 2, 3, 4, 5 };
  private String TAG = "IjkVideoView";
  private int decodeType = 0;
  private List<Integer> mAllRenders = new ArrayList();
  private Context mAppContext;
  private IMediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener = new IMediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt)
    {
      FimiVideoView.access$1902(FimiVideoView.this, paramAnonymousInt);
    }
  };
  private boolean mCanPause = true;
  private boolean mCanSeekBack;
  private boolean mCanSeekForward;
  private IMediaPlayer.OnCompletionListener mCompletionListener = new IMediaPlayer.OnCompletionListener()
  {
    public void onCompletion(IMediaPlayer paramAnonymousIMediaPlayer)
    {
      FimiVideoView.access$502(FimiVideoView.this, 5);
      FimiVideoView.access$1202(FimiVideoView.this, 5);
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
  private IMediaPlayer.OnErrorListener mErrorListener = new IMediaPlayer.OnErrorListener()
  {
    public boolean onError(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      Log.d(FimiVideoView.this.TAG, "Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
      FimiVideoView.access$502(FimiVideoView.this, -1);
      FimiVideoView.access$1202(FimiVideoView.this, -1);
      if (FimiVideoView.this.mMediaController != null) {
        FimiVideoView.this.mMediaController.hide();
      }
      if (paramAnonymousIMediaPlayer.getDataSource().contains("rtsp:"))
      {
        paramAnonymousIMediaPlayer = new Intent("resetRTSP");
        paramAnonymousIMediaPlayer.putExtra("rtsp", 1);
        FimiVideoView.this.mAppContext.sendBroadcast(paramAnonymousIMediaPlayer);
      }
      return (FimiVideoView.this.mOnErrorListener != null) && (FimiVideoView.this.mOnErrorListener.onError(FimiVideoView.this.mMediaPlayer, paramAnonymousInt1, paramAnonymousInt2));
    }
  };
  private Map<String, String> mHeaders;
  private IMediaPlayer.OnInfoListener mInfoListener = new IMediaPlayer.OnInfoListener()
  {
    public boolean onInfo(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (FimiVideoView.this.mOnInfoListener != null) {
        FimiVideoView.this.mOnInfoListener.onInfo(paramAnonymousIMediaPlayer, paramAnonymousInt1, paramAnonymousInt2);
      }
      switch (paramAnonymousInt1)
      {
      }
      for (;;)
      {
        return true;
        FimiVideoView.access$1602(FimiVideoView.this, paramAnonymousInt2);
        Log.d(FimiVideoView.this.TAG, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + paramAnonymousInt2);
        if (FimiVideoView.this.mRenderView != null) {
          FimiVideoView.this.mRenderView.setVideoRotation(paramAnonymousInt2);
        }
      }
    }
  };
  private IMediaController mMediaController;
  private IMediaPlayer mMediaPlayer = null;
  private IMediaPlayer.OnCompletionListener mOnCompletionListener;
  private IMediaPlayer.OnErrorListener mOnErrorListener;
  private IMediaPlayer.OnInfoListener mOnInfoListener;
  private IMediaPlayer.OnPreparedListener mOnPreparedListener;
  IMediaPlayer.OnPreparedListener mPreparedListener = new IMediaPlayer.OnPreparedListener()
  {
    public void onPrepared(IMediaPlayer paramAnonymousIMediaPlayer)
    {
      FimiVideoView.access$502(FimiVideoView.this, 2);
      if (FimiVideoView.this.mOnPreparedListener != null) {
        FimiVideoView.this.mOnPreparedListener.onPrepared(FimiVideoView.this.mMediaPlayer);
      }
      if (FimiVideoView.this.mMediaController != null) {
        FimiVideoView.this.mMediaController.setEnabled(true);
      }
      FimiVideoView.access$002(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoWidth());
      FimiVideoView.access$102(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoHeight());
      int i = FimiVideoView.this.mSeekWhenPrepared;
      if (i != 0) {
        FimiVideoView.this.seekTo(i);
      }
      if ((FimiVideoView.this.mVideoWidth != 0) && (FimiVideoView.this.mVideoHeight != 0)) {
        if (FimiVideoView.this.mRenderView != null)
        {
          FimiVideoView.this.mRenderView.setVideoSize(FimiVideoView.this.mVideoWidth, FimiVideoView.this.mVideoHeight);
          FimiVideoView.this.mRenderView.setVideoSampleAspectRatio(FimiVideoView.this.mVideoSarNum, FimiVideoView.this.mVideoSarDen);
          if ((!FimiVideoView.this.mRenderView.shouldWaitForResize()) || ((FimiVideoView.this.mSurfaceWidth == FimiVideoView.this.mVideoWidth) && (FimiVideoView.this.mSurfaceHeight == FimiVideoView.this.mVideoHeight)))
          {
            if (FimiVideoView.this.mTargetState != 3) {
              break label336;
            }
            FimiVideoView.this.start();
            if (FimiVideoView.this.mMediaController != null) {
              FimiVideoView.this.mMediaController.show();
            }
          }
        }
      }
      for (;;)
      {
        if (paramAnonymousIMediaPlayer.getDataSource().contains("rtsp:"))
        {
          FimiVideoView.this.getHandler().sendEmptyMessage(0);
          paramAnonymousIMediaPlayer = new Intent("resetRTSP");
          paramAnonymousIMediaPlayer.putExtra("rtsp", 0);
          FimiVideoView.this.mAppContext.sendBroadcast(paramAnonymousIMediaPlayer);
        }
        return;
        label336:
        if ((!FimiVideoView.this.isPlaying()) && ((i != 0) || (FimiVideoView.this.getCurrentPosition() > 0)) && (FimiVideoView.this.mMediaController != null))
        {
          FimiVideoView.this.mMediaController.show(0);
          continue;
          if (FimiVideoView.this.mTargetState == 3) {
            FimiVideoView.this.start();
          }
        }
      }
    }
  };
  private IRenderView mRenderView;
  IRenderView.IRenderCallback mSHCallback = new IRenderView.IRenderCallback()
  {
    public void onSurfaceChanged(@NonNull IRenderView.ISurfaceHolder paramAnonymousISurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      int j = 0;
      if (paramAnonymousISurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView)
      {
        Log.e(FimiVideoView.this.TAG, "onSurfaceChanged: unmatched render callback\n");
        return;
      }
      FimiVideoView.access$1002(FimiVideoView.this, paramAnonymousInt2);
      FimiVideoView.access$1102(FimiVideoView.this, paramAnonymousInt3);
      if (FimiVideoView.this.mTargetState == 3) {}
      for (paramAnonymousInt1 = 1;; paramAnonymousInt1 = 0)
      {
        int i;
        if (FimiVideoView.this.mRenderView.shouldWaitForResize())
        {
          i = j;
          if (FimiVideoView.this.mVideoWidth == paramAnonymousInt2)
          {
            i = j;
            if (FimiVideoView.this.mVideoHeight != paramAnonymousInt3) {}
          }
        }
        else
        {
          i = 1;
        }
        if ((FimiVideoView.this.mMediaPlayer == null) || (paramAnonymousInt1 == 0) || (i == 0)) {
          break;
        }
        if (FimiVideoView.this.mSeekWhenPrepared != 0) {
          FimiVideoView.this.seekTo(FimiVideoView.this.mSeekWhenPrepared);
        }
        FimiVideoView.this.start();
        return;
      }
    }
    
    public void onSurfaceCreated(@NonNull IRenderView.ISurfaceHolder paramAnonymousISurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (paramAnonymousISurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView)
      {
        Log.e(FimiVideoView.this.TAG, "onSurfaceCreated: unmatched render callback\n");
        return;
      }
      FimiVideoView.access$2002(FimiVideoView.this, paramAnonymousISurfaceHolder);
      if (FimiVideoView.this.mMediaPlayer != null)
      {
        FimiVideoView.this.bindSurfaceHolder(FimiVideoView.this.mMediaPlayer, paramAnonymousISurfaceHolder);
        return;
      }
      FimiVideoView.this.openVideo(FimiVideoView.this.decodeType);
    }
    
    public void onSurfaceDestroyed(@NonNull IRenderView.ISurfaceHolder paramAnonymousISurfaceHolder)
    {
      if (paramAnonymousISurfaceHolder.getRenderView() != FimiVideoView.this.mRenderView)
      {
        Log.e(FimiVideoView.this.TAG, "onSurfaceDestroyed: unmatched render callback\n");
        return;
      }
      FimiVideoView.access$2002(FimiVideoView.this, null);
      FimiVideoView.this.releaseWithoutStop();
    }
  };
  private int mSeekWhenPrepared;
  IMediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new IMediaPlayer.OnVideoSizeChangedListener()
  {
    public void onVideoSizeChanged(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
    {
      FimiVideoView.access$002(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoWidth());
      FimiVideoView.access$102(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoHeight());
      FimiVideoView.access$202(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoSarNum());
      FimiVideoView.access$302(FimiVideoView.this, paramAnonymousIMediaPlayer.getVideoSarDen());
      if ((FimiVideoView.this.mVideoWidth != 0) && (FimiVideoView.this.mVideoHeight != 0))
      {
        if (FimiVideoView.this.mRenderView != null)
        {
          FimiVideoView.this.mRenderView.setVideoSize(FimiVideoView.this.mVideoWidth, FimiVideoView.this.mVideoHeight);
          FimiVideoView.this.mRenderView.setVideoSampleAspectRatio(FimiVideoView.this.mVideoSarNum, FimiVideoView.this.mVideoSarDen);
        }
        FimiVideoView.this.requestLayout();
      }
    }
  };
  private int mSurfaceHeight;
  private IRenderView.ISurfaceHolder mSurfaceHolder = null;
  private int mSurfaceWidth;
  private int mTargetState = 0;
  private Uri mUri;
  private int mVideoHeight;
  private int mVideoRotationDegree;
  private int mVideoSarDen;
  private int mVideoSarNum;
  private int mVideoWidth;
  
  public FimiVideoView(Context paramContext)
  {
    super(paramContext);
    initVideoView(paramContext);
  }
  
  public FimiVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initVideoView(paramContext);
  }
  
  public FimiVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initVideoView(paramContext);
  }
  
  public FimiVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    initVideoView(paramContext);
  }
  
  private void attachMediaController()
  {
    if ((this.mMediaPlayer != null) && (this.mMediaController != null))
    {
      this.mMediaController.setMediaPlayer(this);
      if (!(getParent() instanceof View)) {
        break label66;
      }
    }
    label66:
    for (Object localObject = (View)getParent();; localObject = this)
    {
      this.mMediaController.setAnchorView((View)localObject);
      this.mMediaController.setEnabled(isInPlaybackState());
      return;
    }
  }
  
  private void bindSurfaceHolder(IMediaPlayer paramIMediaPlayer, IRenderView.ISurfaceHolder paramISurfaceHolder)
  {
    if (paramIMediaPlayer == null) {
      return;
    }
    if (paramISurfaceHolder == null)
    {
      paramIMediaPlayer.setDisplay(null);
      return;
    }
    paramISurfaceHolder.bindToMediaPlayer(paramIMediaPlayer);
  }
  
  private void initRenders()
  {
    this.mAllRenders.clear();
    this.mAllRenders.add(Integer.valueOf(1));
    if (this.mAllRenders.isEmpty()) {
      this.mAllRenders.add(Integer.valueOf(1));
    }
    this.mCurrentRender = ((Integer)this.mAllRenders.get(this.mCurrentRenderIndex)).intValue();
    setRender(this.mCurrentRender);
  }
  
  private void initVideoView(Context paramContext)
  {
    this.mAppContext = paramContext.getApplicationContext();
    initRenders();
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    this.mCurrentState = 0;
    this.mTargetState = 0;
  }
  
  private boolean isInPlaybackState()
  {
    return (this.mMediaPlayer != null) && (this.mCurrentState != -1) && (this.mCurrentState != 0) && (this.mCurrentState != 1);
  }
  
  /* Error */
  private void openVideo(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   4: ifnull +10 -> 14
    //   7: aload_0
    //   8: getfield 117	com/fimi/soul/media/player/widget/FimiVideoView:mSurfaceHolder	Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
    //   11: ifnonnull +4 -> 15
    //   14: return
    //   15: aload_0
    //   16: iconst_0
    //   17: invokevirtual 348	com/fimi/soul/media/player/widget/FimiVideoView:release	(Z)V
    //   20: aload_0
    //   21: getfield 194	com/fimi/soul/media/player/widget/FimiVideoView:mAppContext	Landroid/content/Context;
    //   24: ldc_w 350
    //   27: invokevirtual 354	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   30: checkcast 356	android/media/AudioManager
    //   33: aconst_null
    //   34: iconst_3
    //   35: iconst_1
    //   36: invokevirtual 360	android/media/AudioManager:requestAudioFocus	(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
    //   39: pop
    //   40: aconst_null
    //   41: astore_2
    //   42: aload_0
    //   43: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   46: ifnull +83 -> 129
    //   49: invokestatic 366	com/fimi/soul/media/player/FimiMediaPlayer:getIntance	()Lcom/fimi/soul/media/player/FimiMediaPlayer;
    //   52: astore_2
    //   53: iconst_3
    //   54: invokestatic 369	com/fimi/soul/media/player/FimiMediaPlayer:native_setLogLevel	(I)V
    //   57: aload_2
    //   58: iconst_4
    //   59: ldc_w 371
    //   62: iload_1
    //   63: i2l
    //   64: invokevirtual 375	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;J)V
    //   67: aload_2
    //   68: iconst_4
    //   69: ldc_w 377
    //   72: ldc2_w 378
    //   75: invokevirtual 375	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;J)V
    //   78: aload_2
    //   79: iconst_4
    //   80: ldc_w 381
    //   83: lconst_0
    //   84: invokevirtual 375	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;J)V
    //   87: aload_2
    //   88: iconst_1
    //   89: ldc_w 383
    //   92: lconst_0
    //   93: invokevirtual 375	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;J)V
    //   96: aload_2
    //   97: iconst_2
    //   98: ldc_w 385
    //   101: ldc2_w 386
    //   104: invokevirtual 375	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;J)V
    //   107: aload_2
    //   108: iconst_1
    //   109: ldc_w 389
    //   112: ldc_w 391
    //   115: invokevirtual 394	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;Ljava/lang/String;)V
    //   118: aload_2
    //   119: iconst_1
    //   120: ldc_w 396
    //   123: ldc_w 398
    //   126: invokevirtual 394	com/fimi/soul/media/player/FimiMediaPlayer:setOption	(ILjava/lang/String;Ljava/lang/String;)V
    //   129: aload_0
    //   130: aload_2
    //   131: putfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   134: aload_0
    //   135: invokevirtual 401	com/fimi/soul/media/player/widget/FimiVideoView:getContext	()Landroid/content/Context;
    //   138: pop
    //   139: aload_0
    //   140: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   143: aload_0
    //   144: getfield 131	com/fimi/soul/media/player/widget/FimiVideoView:mPreparedListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnPreparedListener;
    //   147: invokeinterface 405 2 0
    //   152: aload_0
    //   153: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   156: aload_0
    //   157: getfield 128	com/fimi/soul/media/player/widget/FimiVideoView:mSizeChangedListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnVideoSizeChangedListener;
    //   160: invokeinterface 409 2 0
    //   165: aload_0
    //   166: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   169: aload_0
    //   170: getfield 134	com/fimi/soul/media/player/widget/FimiVideoView:mCompletionListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnCompletionListener;
    //   173: invokeinterface 413 2 0
    //   178: aload_0
    //   179: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   182: aload_0
    //   183: getfield 140	com/fimi/soul/media/player/widget/FimiVideoView:mErrorListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnErrorListener;
    //   186: invokeinterface 417 2 0
    //   191: aload_0
    //   192: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   195: aload_0
    //   196: getfield 137	com/fimi/soul/media/player/widget/FimiVideoView:mInfoListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnInfoListener;
    //   199: invokeinterface 421 2 0
    //   204: aload_0
    //   205: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   208: aload_0
    //   209: getfield 143	com/fimi/soul/media/player/widget/FimiVideoView:mBufferingUpdateListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnBufferingUpdateListener;
    //   212: invokeinterface 425 2 0
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield 214	com/fimi/soul/media/player/widget/FimiVideoView:mCurrentBufferPercentage	I
    //   222: getstatic 430	android/os/Build$VERSION:SDK_INT	I
    //   225: bipush 14
    //   227: if_icmple +138 -> 365
    //   230: aload_0
    //   231: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   234: aload_0
    //   235: getfield 194	com/fimi/soul/media/player/widget/FimiVideoView:mAppContext	Landroid/content/Context;
    //   238: aload_0
    //   239: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   242: aload_0
    //   243: getfield 432	com/fimi/soul/media/player/widget/FimiVideoView:mHeaders	Ljava/util/Map;
    //   246: invokeinterface 436 4 0
    //   251: aload_0
    //   252: aload_0
    //   253: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   256: aload_0
    //   257: getfield 117	com/fimi/soul/media/player/widget/FimiVideoView:mSurfaceHolder	Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
    //   260: invokespecial 226	com/fimi/soul/media/player/widget/FimiVideoView:bindSurfaceHolder	(Lcom/fimi/soul/media/player/IMediaPlayer;Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)V
    //   263: aload_0
    //   264: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   267: iconst_3
    //   268: invokeinterface 439 2 0
    //   273: aload_0
    //   274: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   277: iconst_1
    //   278: invokeinterface 442 2 0
    //   283: aload_0
    //   284: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   287: invokeinterface 445 1 0
    //   292: aload_0
    //   293: iconst_1
    //   294: putfield 113	com/fimi/soul/media/player/widget/FimiVideoView:mCurrentState	I
    //   297: aload_0
    //   298: invokespecial 447	com/fimi/soul/media/player/widget/FimiVideoView:attachMediaController	()V
    //   301: return
    //   302: astore_2
    //   303: aload_0
    //   304: getfield 111	com/fimi/soul/media/player/widget/FimiVideoView:TAG	Ljava/lang/String;
    //   307: new 449	java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial 450	java/lang/StringBuilder:<init>	()V
    //   314: ldc_w 452
    //   317: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: aload_0
    //   321: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   324: invokevirtual 459	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: aload_2
    //   331: invokestatic 469	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   334: pop
    //   335: aload_0
    //   336: iconst_m1
    //   337: putfield 113	com/fimi/soul/media/player/widget/FimiVideoView:mCurrentState	I
    //   340: aload_0
    //   341: iconst_m1
    //   342: putfield 115	com/fimi/soul/media/player/widget/FimiVideoView:mTargetState	I
    //   345: aload_0
    //   346: getfield 140	com/fimi/soul/media/player/widget/FimiVideoView:mErrorListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnErrorListener;
    //   349: aload_0
    //   350: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   353: iconst_1
    //   354: iconst_0
    //   355: invokeinterface 475 4 0
    //   360: pop
    //   361: return
    //   362: astore_2
    //   363: aload_2
    //   364: athrow
    //   365: aload_0
    //   366: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   369: aload_0
    //   370: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   373: invokevirtual 478	android/net/Uri:toString	()Ljava/lang/String;
    //   376: invokeinterface 481 2 0
    //   381: goto -130 -> 251
    //   384: astore_2
    //   385: aload_0
    //   386: getfield 111	com/fimi/soul/media/player/widget/FimiVideoView:TAG	Ljava/lang/String;
    //   389: new 449	java/lang/StringBuilder
    //   392: dup
    //   393: invokespecial 450	java/lang/StringBuilder:<init>	()V
    //   396: ldc_w 452
    //   399: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload_0
    //   403: getfield 345	com/fimi/soul/media/player/widget/FimiVideoView:mUri	Landroid/net/Uri;
    //   406: invokevirtual 459	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   409: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: aload_2
    //   413: invokestatic 469	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   416: pop
    //   417: aload_0
    //   418: iconst_m1
    //   419: putfield 113	com/fimi/soul/media/player/widget/FimiVideoView:mCurrentState	I
    //   422: aload_0
    //   423: iconst_m1
    //   424: putfield 115	com/fimi/soul/media/player/widget/FimiVideoView:mTargetState	I
    //   427: aload_0
    //   428: getfield 140	com/fimi/soul/media/player/widget/FimiVideoView:mErrorListener	Lcom/fimi/soul/media/player/IMediaPlayer$OnErrorListener;
    //   431: aload_0
    //   432: getfield 119	com/fimi/soul/media/player/widget/FimiVideoView:mMediaPlayer	Lcom/fimi/soul/media/player/IMediaPlayer;
    //   435: iconst_1
    //   436: iconst_0
    //   437: invokeinterface 475 4 0
    //   442: pop
    //   443: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	444	0	this	FimiVideoView
    //   0	444	1	paramInt	int
    //   41	90	2	localFimiMediaPlayer	com.fimi.soul.media.player.FimiMediaPlayer
    //   302	29	2	localIOException	java.io.IOException
    //   362	2	2	localObject	Object
    //   384	29	2	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   42	129	302	java/io/IOException
    //   129	251	302	java/io/IOException
    //   251	301	302	java/io/IOException
    //   365	381	302	java/io/IOException
    //   42	129	362	finally
    //   129	251	362	finally
    //   251	301	362	finally
    //   303	361	362	finally
    //   365	381	362	finally
    //   385	443	362	finally
    //   42	129	384	java/lang/IllegalArgumentException
    //   129	251	384	java/lang/IllegalArgumentException
    //   251	301	384	java/lang/IllegalArgumentException
    //   365	381	384	java/lang/IllegalArgumentException
  }
  
  private void setVideoURI(Uri paramUri, Map<String, String> paramMap)
  {
    this.mUri = paramUri;
    this.mHeaders = paramMap;
    this.mSeekWhenPrepared = 0;
    openVideo(this.decodeType);
    requestLayout();
    invalidate();
  }
  
  private void toggleMediaControlsVisiblity()
  {
    if (this.mMediaController.isShowing())
    {
      this.mMediaController.hide();
      return;
    }
    this.mMediaController.show();
  }
  
  public boolean canPause()
  {
    return this.mCanPause;
  }
  
  public boolean canSeekBackward()
  {
    return this.mCanSeekBack;
  }
  
  public boolean canSeekForward()
  {
    return this.mCanSeekForward;
  }
  
  public int getAudioSessionId()
  {
    return 0;
  }
  
  public int getBufferPercentage()
  {
    if (this.mMediaPlayer != null) {
      return this.mCurrentBufferPercentage;
    }
    return 0;
  }
  
  public int getCurrentPosition()
  {
    if (isInPlaybackState()) {
      return (int)this.mMediaPlayer.getCurrentPosition();
    }
    return 0;
  }
  
  public int getDuration()
  {
    Log.d("player", "getDuration");
    if (isInPlaybackState()) {
      return (int)this.mMediaPlayer.getDuration();
    }
    return -1;
  }
  
  public int getmCurrentState()
  {
    return this.mCurrentState;
  }
  
  public boolean isPlaying()
  {
    return (isInPlaybackState()) && (this.mMediaPlayer.isPlaying());
  }
  
  public void onFinishInflate()
  {
    Log.d("player", "onFinishInflate");
    super.onFinishInflate();
    if (isPlaying()) {
      pause();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    if ((paramInt != 4) && (paramInt != 24) && (paramInt != 25) && (paramInt != 164) && (paramInt != 82) && (paramInt != 5) && (paramInt != 6))
    {
      i = 1;
      if ((!isInPlaybackState()) || (i == 0) || (this.mMediaController == null)) {
        break label196;
      }
      if ((paramInt != 79) && (paramInt != 85)) {
        break label120;
      }
      if (!this.mMediaPlayer.isPlaying()) {
        break label105;
      }
      pause();
      this.mMediaController.show();
    }
    label105:
    label120:
    label153:
    do
    {
      do
      {
        return true;
        i = 0;
        break;
        start();
        this.mMediaController.hide();
        return true;
        if (paramInt != 126) {
          break label153;
        }
      } while (this.mMediaPlayer.isPlaying());
      start();
      this.mMediaController.hide();
      return true;
      if ((paramInt != 86) && (paramInt != 127)) {
        break label192;
      }
    } while (!this.mMediaPlayer.isPlaying());
    pause();
    this.mMediaController.show();
    return true;
    label192:
    toggleMediaControlsVisiblity();
    label196:
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((isInPlaybackState()) && (this.mMediaController != null)) {
      toggleMediaControlsVisiblity();
    }
    return false;
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    if ((isInPlaybackState()) && (this.mMediaController != null)) {
      toggleMediaControlsVisiblity();
    }
    return false;
  }
  
  public void pause()
  {
    Log.d("player", "pause");
    if (this.mMediaPlayer == null) {
      return;
    }
    this.mMediaPlayer.pause();
    if ((isInPlaybackState()) && (this.mMediaPlayer.isPlaying()))
    {
      this.mMediaPlayer.pause();
      this.mCurrentState = 4;
    }
    this.mTargetState = 4;
  }
  
  public void release(boolean paramBoolean)
  {
    if (this.mMediaPlayer != null)
    {
      this.mMediaPlayer.reset();
      this.mMediaPlayer.release();
      this.mMediaPlayer = null;
      this.mCurrentState = 0;
      if (paramBoolean) {
        this.mTargetState = 0;
      }
      ((AudioManager)this.mAppContext.getSystemService("audio")).abandonAudioFocus(null);
    }
  }
  
  public void releaseWithoutStop()
  {
    if (this.mMediaPlayer != null) {
      this.mMediaPlayer.setDisplay(null);
    }
  }
  
  public void resume()
  {
    Log.d("Good", "resume");
    openVideo(this.decodeType);
  }
  
  public void seekTo(int paramInt)
  {
    Log.d("player", "seekto");
    if (isInPlaybackState())
    {
      this.mMediaPlayer.seekTo(paramInt);
      this.mSeekWhenPrepared = 0;
      return;
    }
    this.mSeekWhenPrepared = paramInt;
  }
  
  public void setDecodeType(int paramInt)
  {
    this.decodeType = paramInt;
  }
  
  public void setHideSurfaceView(boolean paramBoolean)
  {
    SurfaceHolder localSurfaceHolder;
    if ((this.mRenderView instanceof SurfaceRenderView))
    {
      localSurfaceHolder = ((SurfaceRenderView)this.mRenderView).getHolder();
      if (!paramBoolean) {
        break label36;
      }
    }
    label36:
    for (int i = -2;; i = 4)
    {
      localSurfaceHolder.setFormat(i);
      return;
    }
  }
  
  public void setMediaController(IMediaController paramIMediaController)
  {
    if (this.mMediaController != null) {
      this.mMediaController.hide();
    }
    this.mMediaController = paramIMediaController;
    attachMediaController();
  }
  
  public void setOnCompletionListener(IMediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.mOnCompletionListener = paramOnCompletionListener;
  }
  
  public void setOnErrorListener(IMediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.mOnErrorListener = paramOnErrorListener;
  }
  
  public void setOnInfoListener(IMediaPlayer.OnInfoListener paramOnInfoListener)
  {
    this.mOnInfoListener = paramOnInfoListener;
  }
  
  public void setOnPreparedListener(IMediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.mOnPreparedListener = paramOnPreparedListener;
  }
  
  public void setRender(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      Log.e(this.TAG, String.format(Locale.getDefault(), "invalid render %d\n", new Object[] { Integer.valueOf(paramInt) }));
      return;
    case 0: 
      setRenderView(null);
      return;
    case 2: 
      TextureRenderView localTextureRenderView = new TextureRenderView(getContext());
      if (this.mMediaPlayer != null)
      {
        localTextureRenderView.getSurfaceHolder().bindToMediaPlayer(this.mMediaPlayer);
        localTextureRenderView.setVideoSize(this.mMediaPlayer.getVideoWidth(), this.mMediaPlayer.getVideoHeight());
        localTextureRenderView.setVideoSampleAspectRatio(this.mMediaPlayer.getVideoSarNum(), this.mMediaPlayer.getVideoSarDen());
        localTextureRenderView.setAspectRatio(this.mCurrentAspectRatio);
      }
      setRenderView(localTextureRenderView);
      return;
    }
    setRenderView(new SurfaceRenderView(getContext()));
  }
  
  public void setRenderView(IRenderView paramIRenderView)
  {
    if (this.mRenderView != null)
    {
      if (this.mMediaPlayer != null) {
        this.mMediaPlayer.setDisplay(null);
      }
      View localView = this.mRenderView.getView();
      this.mRenderView.removeRenderCallback(this.mSHCallback);
      this.mRenderView = null;
      removeView(localView);
    }
    if (paramIRenderView == null) {
      return;
    }
    this.mRenderView = paramIRenderView;
    paramIRenderView.setAspectRatio(this.mCurrentAspectRatio);
    if ((this.mVideoWidth > 0) && (this.mVideoHeight > 0)) {
      paramIRenderView.setVideoSize(this.mVideoWidth, this.mVideoHeight);
    }
    if ((this.mVideoSarNum > 0) && (this.mVideoSarDen > 0)) {
      paramIRenderView.setVideoSampleAspectRatio(this.mVideoSarNum, this.mVideoSarDen);
    }
    paramIRenderView = this.mRenderView.getView();
    paramIRenderView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
    addView(paramIRenderView);
    this.mRenderView.addRenderCallback(this.mSHCallback);
    this.mRenderView.setVideoRotation(this.mVideoRotationDegree);
  }
  
  public void setVideoPath(String paramString)
  {
    setVideoURI(Uri.parse(paramString));
  }
  
  public void setVideoURI(Uri paramUri)
  {
    setVideoURI(paramUri, null);
  }
  
  public void setZOrderMediaOverlay(boolean paramBoolean)
  {
    if ((this.mRenderView instanceof SurfaceRenderView)) {
      ((SurfaceRenderView)this.mRenderView).setZOrderMediaOverlay(paramBoolean);
    }
  }
  
  public void start()
  {
    if (this.mCurrentState == 5) {
      setVideoURI(this.mUri);
    }
    if (isInPlaybackState())
    {
      this.mMediaPlayer.start();
      this.mCurrentState = 3;
    }
    this.mTargetState = 3;
  }
  
  public void stopPlayback()
  {
    if (this.mMediaPlayer != null)
    {
      this.mMediaPlayer.stop();
      this.mMediaPlayer.release();
      this.mMediaPlayer = null;
      this.mCurrentState = 0;
      this.mTargetState = 0;
      ((AudioManager)this.mAppContext.getSystemService("audio")).abandonAudioFocus(null);
    }
  }
  
  public void suspend()
  {
    Log.d("Good", "suspend");
    release(false);
  }
  
  public int toggleAspectRatio()
  {
    this.mCurrentAspectRatioIndex += 1;
    this.mCurrentAspectRatioIndex %= s_allAspectRatio.length;
    this.mCurrentAspectRatio = 1;
    if (this.mRenderView != null) {
      this.mRenderView.setAspectRatio(this.mCurrentAspectRatio);
    }
    return this.mCurrentAspectRatio;
  }
  
  public int toggleAspectRatioPOi()
  {
    this.mCurrentAspectRatioIndex += 1;
    this.mCurrentAspectRatioIndex %= s_allAspectRatio.length;
    this.mCurrentAspectRatio = 3;
    if (this.mRenderView != null) {
      this.mRenderView.setAspectRatio(this.mCurrentAspectRatio);
    }
    return this.mCurrentAspectRatio;
  }
  
  public int toggleRender()
  {
    this.mCurrentRenderIndex += 1;
    this.mCurrentRenderIndex %= this.mAllRenders.size();
    this.mCurrentRender = ((Integer)this.mAllRenders.get(this.mCurrentRenderIndex)).intValue();
    setRender(this.mCurrentRender);
    return this.mCurrentRender;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/FimiVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */