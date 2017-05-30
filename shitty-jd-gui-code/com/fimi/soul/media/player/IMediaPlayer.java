package com.fimi.soul.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.util.Map;

public abstract interface IMediaPlayer
{
  public static final int MEDIA_ERROR_IO = -1004;
  public static final int MEDIA_ERROR_MALFORMED = -1007;
  public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
  public static final int MEDIA_ERROR_SERVER_DIED = 100;
  public static final int MEDIA_ERROR_TIMED_OUT = -110;
  public static final int MEDIA_ERROR_UNKNOWN = 1;
  public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
  public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
  public static final int MEDIA_INFO_BUFFERING_END = 702;
  public static final int MEDIA_INFO_BUFFERING_START = 701;
  public static final int MEDIA_INFO_METADATA_UPDATE = 802;
  public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
  public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
  public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
  public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
  public static final int MEDIA_INFO_UNKNOWN = 1;
  public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
  public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
  public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
  
  public abstract int getAudioSessionId();
  
  public abstract long getCurrentPosition();
  
  public abstract String getDataSource();
  
  public abstract long getDuration();
  
  public abstract MediaInfo getMediaInfo();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoSarDen();
  
  public abstract int getVideoSarNum();
  
  public abstract int getVideoWidth();
  
  @Deprecated
  public abstract boolean isPlayable();
  
  public abstract boolean isPlaying();
  
  public abstract void pause();
  
  public abstract void prepareAsync();
  
  public abstract void release();
  
  public abstract void reset();
  
  public abstract void seekTo(long paramLong);
  
  public abstract void setAudioStreamType(int paramInt);
  
  public abstract void setDataSource(Context paramContext, Uri paramUri);
  
  @TargetApi(14)
  public abstract void setDataSource(Context paramContext, Uri paramUri, Map<String, String> paramMap);
  
  public abstract void setDataSource(FileDescriptor paramFileDescriptor);
  
  public abstract void setDataSource(String paramString);
  
  public abstract void setDisplay(SurfaceHolder paramSurfaceHolder);
  
  @Deprecated
  public abstract void setKeepInBackground(boolean paramBoolean);
  
  @Deprecated
  public abstract void setLogEnabled(boolean paramBoolean);
  
  public abstract void setOnBufferingUpdateListener(OnBufferingUpdateListener paramOnBufferingUpdateListener);
  
  public abstract void setOnCompletionListener(OnCompletionListener paramOnCompletionListener);
  
  public abstract void setOnErrorListener(OnErrorListener paramOnErrorListener);
  
  public abstract void setOnInfoListener(OnInfoListener paramOnInfoListener);
  
  public abstract void setOnPreparedListener(OnPreparedListener paramOnPreparedListener);
  
  public abstract void setOnSeekCompleteListener(OnSeekCompleteListener paramOnSeekCompleteListener);
  
  public abstract void setOnVideoSizeChangedListener(OnVideoSizeChangedListener paramOnVideoSizeChangedListener);
  
  public abstract void setScreenOnWhilePlaying(boolean paramBoolean);
  
  @TargetApi(14)
  public abstract void setSurface(Surface paramSurface);
  
  public abstract void setVolume(float paramFloat1, float paramFloat2);
  
  @Deprecated
  public abstract void setWakeMode(Context paramContext, int paramInt);
  
  public abstract void start();
  
  public abstract void stop();
  
  public static abstract interface OnBufferingUpdateListener
  {
    public abstract void onBufferingUpdate(IMediaPlayer paramIMediaPlayer, int paramInt);
  }
  
  public static abstract interface OnCompletionListener
  {
    public abstract void onCompletion(IMediaPlayer paramIMediaPlayer);
  }
  
  public static abstract interface OnErrorListener
  {
    public abstract boolean onError(IMediaPlayer paramIMediaPlayer, int paramInt1, int paramInt2);
  }
  
  public static abstract interface OnInfoListener
  {
    public abstract boolean onInfo(IMediaPlayer paramIMediaPlayer, int paramInt1, int paramInt2);
  }
  
  public static abstract interface OnPreparedListener
  {
    public abstract void onPrepared(IMediaPlayer paramIMediaPlayer);
  }
  
  public static abstract interface OnSeekCompleteListener
  {
    public abstract void onSeekComplete(IMediaPlayer paramIMediaPlayer);
  }
  
  public static abstract interface OnVideoSizeChangedListener
  {
    public abstract void onVideoSizeChanged(IMediaPlayer paramIMediaPlayer, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/IMediaPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */