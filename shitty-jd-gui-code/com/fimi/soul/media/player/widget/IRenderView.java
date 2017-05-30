package com.fimi.soul.media.player.widget;

import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import com.fimi.soul.media.player.IMediaPlayer;

public abstract interface IRenderView
{
  public static final int AR_16_9_FIT_PARENT = 4;
  public static final int AR_4_3_FIT_PARENT = 5;
  public static final int AR_ASPECT_FILL_PARENT = 1;
  public static final int AR_ASPECT_FIT_PARENT = 0;
  public static final int AR_ASPECT_WRAP_CONTENT = 2;
  public static final int AR_MATCH_PARENT = 3;
  
  public abstract void addRenderCallback(@NonNull IRenderCallback paramIRenderCallback);
  
  public abstract View getView();
  
  public abstract void removeRenderCallback(@NonNull IRenderCallback paramIRenderCallback);
  
  public abstract void setAspectRatio(int paramInt);
  
  public abstract void setVideoRotation(int paramInt);
  
  public abstract void setVideoSampleAspectRatio(int paramInt1, int paramInt2);
  
  public abstract void setVideoSize(int paramInt1, int paramInt2);
  
  public abstract boolean shouldWaitForResize();
  
  public static abstract interface IRenderCallback
  {
    public abstract void onSurfaceChanged(@NonNull IRenderView.ISurfaceHolder paramISurfaceHolder, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void onSurfaceCreated(@NonNull IRenderView.ISurfaceHolder paramISurfaceHolder, int paramInt1, int paramInt2);
    
    public abstract void onSurfaceDestroyed(@NonNull IRenderView.ISurfaceHolder paramISurfaceHolder);
  }
  
  public static abstract interface ISurfaceHolder
  {
    public abstract void bindToMediaPlayer(IMediaPlayer paramIMediaPlayer);
    
    @NonNull
    public abstract IRenderView getRenderView();
    
    @Nullable
    public abstract SurfaceHolder getSurfaceHolder();
    
    @Nullable
    public abstract SurfaceTexture getSurfaceTexture();
    
    @Nullable
    public abstract Surface openSurface();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/IRenderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */