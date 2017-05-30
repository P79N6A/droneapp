package com.fimi.soul.media.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class FermiSystemMediaPlayer
  implements SurfaceHolder.Callback, SeekBar.OnSeekBarChangeListener, IFermiMediaPlayer
{
  private Context context;
  private String dataSourceUrl;
  private Handler handler = new InnerHandler();
  private boolean isAutoPlay;
  private boolean ischanging = false;
  private OnMediaSizeChangedListener onMediaSizeChangedListener;
  private List<OnPlayerStateChangedListener> onPlayerStateChangedListenerArray = new ArrayList();
  private OnProgressChangedListener onProgressChangedListener;
  private MediaPlayer player = null;
  private SeekBar seekBar;
  private int startPosition = 0;
  private SurfaceView surfaceView;
  private Timer timer = new Timer();
  private TimerTask timerTask;
  
  public FermiSystemMediaPlayer(Context paramContext)
  {
    this.context = paramContext;
    this.timerTask = new TimerTask()
    {
      public void run()
      {
        if (FermiSystemMediaPlayer.this.ischanging) {}
        while ((FermiSystemMediaPlayer.this.player == null) || (FermiSystemMediaPlayer.this.seekBar == null) || (FermiSystemMediaPlayer.this.ischanging)) {
          return;
        }
        FermiSystemMediaPlayer.this.seekBar.setProgress(FermiSystemMediaPlayer.this.player.getCurrentPosition());
        Message localMessage = new Message();
        localMessage.arg1 = FermiSystemMediaPlayer.this.player.getCurrentPosition();
        localMessage.arg2 = FermiSystemMediaPlayer.this.player.getDuration();
        FermiSystemMediaPlayer.this.handler.sendMessage(localMessage);
      }
    };
    this.timer.schedule(this.timerTask, 0L, 1000L);
  }
  
  private Context getContext()
  {
    return this.context;
  }
  
  private void onPlayerStateChange(IFermiMediaPlayer.FermiPlyaerState paramFermiPlyaerState)
  {
    if (this.onPlayerStateChangedListenerArray.size() > 0)
    {
      Iterator localIterator = this.onPlayerStateChangedListenerArray.iterator();
      while (localIterator.hasNext()) {
        ((OnPlayerStateChangedListener)localIterator.next()).OnPlayerStateChanged(paramFermiPlyaerState, this);
      }
    }
  }
  
  public void addOnPlayerStateChangedListener(OnPlayerStateChangedListener paramOnPlayerStateChangedListener)
  {
    if (paramOnPlayerStateChangedListener != null) {
      this.onPlayerStateChangedListenerArray.add(paramOnPlayerStateChangedListener);
    }
  }
  
  public long getCurrentPosition()
  {
    return this.player.getCurrentPosition();
  }
  
  public long getDuration()
  {
    return this.player.getDuration();
  }
  
  public int getPosition()
  {
    return this.player.getCurrentPosition();
  }
  
  public boolean isAutoPlay()
  {
    return this.isAutoPlay;
  }
  
  public boolean isPlaying()
  {
    if (this.player != null) {
      return this.player.isPlaying();
    }
    return false;
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.player.seekTo(paramInt);
      if (this.onProgressChangedListener != null) {
        this.onProgressChangedListener.onProgressChanged(paramInt, this.player.getDuration());
      }
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.ischanging = true;
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
  
  public void pause()
  {
    if ((this.player != null) && (this.player.isPlaying()))
    {
      this.player.pause();
      onPlayerStateChange(IFermiMediaPlayer.FermiPlyaerState.Pause);
    }
  }
  
  public void play()
  {
    if (this.player != null) {}
    try
    {
      if ((this.player != null) && (!this.player.isPlaying())) {
        this.player.stop();
      }
      this.player.prepare();
      if (!isAutoPlay())
      {
        this.player.start();
        onPlayerStateChange(IFermiMediaPlayer.FermiPlyaerState.Playing);
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localIllegalStateException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public void prepare()
  {
    if (this.player != null) {}
    try
    {
      this.player.prepare();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public void seekTo(long paramLong)
  {
    this.player.seekTo((int)paramLong);
  }
  
  public void setAutoPlay(boolean paramBoolean)
  {
    this.isAutoPlay = paramBoolean;
  }
  
  public void setMediaUri(String paramString)
  {
    setMediaUri(paramString, null, null);
  }
  
  public void setMediaUri(String paramString1, String paramString2, String paramString3)
  {
    this.dataSourceUrl = paramString1;
    if (this.player != null) {}
    try
    {
      this.player.setDataSource(this.dataSourceUrl);
      return;
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (SecurityException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (IllegalStateException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public void setOnMediaSizeChangedListener(OnMediaSizeChangedListener paramOnMediaSizeChangedListener)
  {
    this.onMediaSizeChangedListener = paramOnMediaSizeChangedListener;
  }
  
  public void setOnProgressChangedListener(OnProgressChangedListener paramOnProgressChangedListener)
  {
    this.onProgressChangedListener = paramOnProgressChangedListener;
  }
  
  public void setPlayPosition(int paramInt)
  {
    this.startPosition = paramInt;
  }
  
  public void setSeekBar(SeekBar paramSeekBar)
  {
    this.seekBar = paramSeekBar;
    paramSeekBar.setOnSeekBarChangeListener(this);
  }
  
  public void setSurfaceView(SurfaceView paramSurfaceView)
  {
    paramSurfaceView.getHolder().addCallback(this);
  }
  
  public void stop()
  {
    if (this.player != null)
    {
      this.player.stop();
      onPlayerStateChange(IFermiMediaPlayer.FermiPlyaerState.Stop);
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.player = new MediaPlayer();
    this.player.setAudioStreamType(3);
    this.player.setDisplay(paramSurfaceHolder);
    this.player.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener()
    {
      public void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
      {
        FermiSystemMediaPlayer.access$002(FermiSystemMediaPlayer.this, false);
        paramAnonymousMediaPlayer.start();
      }
    });
    try
    {
      this.player.setDataSource(this.dataSourceUrl);
      this.player.prepare();
      this.player.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
      {
        public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
        {
          if (FermiSystemMediaPlayer.this.seekBar != null) {
            FermiSystemMediaPlayer.this.seekBar.setMax(paramAnonymousMediaPlayer.getDuration());
          }
          if (FermiSystemMediaPlayer.this.isAutoPlay)
          {
            FermiSystemMediaPlayer.this.seekTo(FermiSystemMediaPlayer.this.startPosition);
            paramAnonymousMediaPlayer.start();
            FermiSystemMediaPlayer.this.onPlayerStateChange(IFermiMediaPlayer.FermiPlyaerState.Playing);
          }
        }
      });
      this.player.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
      {
        public void onCompletion(MediaPlayer paramAnonymousMediaPlayer) {}
      });
      this.player.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener()
      {
        public void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          if (FermiSystemMediaPlayer.this.onMediaSizeChangedListener != null)
          {
            Log.d("Good", paramAnonymousInt1 + ":" + paramAnonymousInt2);
            FermiSystemMediaPlayer.this.onMediaSizeChangedListener.onMediaSizeChanged(FermiSystemMediaPlayer.this, paramAnonymousInt1, paramAnonymousInt2);
          }
        }
      });
      this.player.prepareAsync();
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      paramSurfaceHolder.printStackTrace();
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (this.player.isPlaying()) {
      this.player.stop();
    }
  }
  
  class InnerHandler
    extends Handler
  {
    InnerHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      if (FermiSystemMediaPlayer.this.onProgressChangedListener != null) {
        FermiSystemMediaPlayer.this.onProgressChangedListener.onProgressChanged(paramMessage.arg1, paramMessage.arg2);
      }
      super.handleMessage(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FermiSystemMediaPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */