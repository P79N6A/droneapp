package com.fimi.soul.media.player;

public abstract class AbstractMediaPlayer
  implements IMediaPlayer
{
  private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
  private IMediaPlayer.OnCompletionListener mOnCompletionListener;
  private IMediaPlayer.OnErrorListener mOnErrorListener;
  private IMediaPlayer.OnInfoListener mOnInfoListener;
  private IMediaPlayer.OnPreparedListener mOnPreparedListener;
  private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
  private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
  
  protected final void notifyOnBufferingUpdate(int paramInt)
  {
    if (this.mOnBufferingUpdateListener != null) {
      this.mOnBufferingUpdateListener.onBufferingUpdate(this, paramInt);
    }
  }
  
  protected final void notifyOnCompletion()
  {
    if (this.mOnCompletionListener != null) {
      this.mOnCompletionListener.onCompletion(this);
    }
  }
  
  protected final boolean notifyOnError(int paramInt1, int paramInt2)
  {
    if (this.mOnErrorListener != null) {
      return this.mOnErrorListener.onError(this, paramInt1, paramInt2);
    }
    return false;
  }
  
  protected final boolean notifyOnInfo(int paramInt1, int paramInt2)
  {
    if (this.mOnInfoListener != null) {
      return this.mOnInfoListener.onInfo(this, paramInt1, paramInt2);
    }
    return false;
  }
  
  protected final void notifyOnPrepared()
  {
    if (this.mOnPreparedListener != null) {
      this.mOnPreparedListener.onPrepared(this);
    }
  }
  
  protected final void notifyOnSeekComplete()
  {
    if (this.mOnSeekCompleteListener != null) {
      this.mOnSeekCompleteListener.onSeekComplete(this);
    }
  }
  
  protected final void notifyOnVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.mOnVideoSizeChangedListener != null) {
      this.mOnVideoSizeChangedListener.onVideoSizeChanged(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void resetListeners()
  {
    this.mOnPreparedListener = null;
    this.mOnBufferingUpdateListener = null;
    this.mOnCompletionListener = null;
    this.mOnSeekCompleteListener = null;
    this.mOnVideoSizeChangedListener = null;
    this.mOnErrorListener = null;
    this.mOnInfoListener = null;
  }
  
  public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener paramOnBufferingUpdateListener)
  {
    this.mOnBufferingUpdateListener = paramOnBufferingUpdateListener;
  }
  
  public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.mOnCompletionListener = paramOnCompletionListener;
  }
  
  public final void setOnErrorListener(IMediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.mOnErrorListener = paramOnErrorListener;
  }
  
  public final void setOnInfoListener(IMediaPlayer.OnInfoListener paramOnInfoListener)
  {
    this.mOnInfoListener = paramOnInfoListener;
  }
  
  public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.mOnPreparedListener = paramOnPreparedListener;
  }
  
  public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener paramOnSeekCompleteListener)
  {
    this.mOnSeekCompleteListener = paramOnSeekCompleteListener;
  }
  
  public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener paramOnVideoSizeChangedListener)
  {
    this.mOnVideoSizeChangedListener = paramOnVideoSizeChangedListener;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/AbstractMediaPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */