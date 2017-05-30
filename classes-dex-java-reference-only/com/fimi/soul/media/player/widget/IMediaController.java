package com.fimi.soul.media.player.widget;

import android.view.View;

public abstract interface IMediaController
{
  public abstract void hide();
  
  public abstract boolean isShowing();
  
  public abstract void setAnchorView(View paramView);
  
  public abstract void setEnabled(boolean paramBoolean);
  
  public abstract void setMediaPlayer(FmMediaController.MediaPlayerControl paramMediaPlayerControl);
  
  public abstract void show();
  
  public abstract void show(int paramInt);
  
  public abstract void showOnce(View paramView);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/IMediaController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */