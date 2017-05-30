package com.fimi.soul.module.droneFragment;

import android.view.View;
import android.widget.ImageView;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class j
{
  private FimiVideoView a;
  private String b = e.d();
  private ImageView c;
  private ImageView d;
  
  public j(View paramView)
  {
    this.a = ((FimiVideoView)paramView.findViewById(2131690084));
    this.c = ((ImageView)paramView.findViewById(2131690105));
    this.d = ((ImageView)paramView.findViewById(2131690087));
  }
  
  public void a()
  {
    if (this.a.isPlaying())
    {
      this.a.stopPlayback();
      this.a.setKeepScreenOn(false);
      this.a.setZOrderMediaOverlay(false);
      this.a.destroyDrawingCache();
      this.a.release(true);
    }
    this.c.setVisibility(8);
    this.a.setHideSurfaceView(true);
    this.a.setVisibility(8);
    this.d.setVisibility(0);
  }
  
  public void b()
  {
    this.a.setKeepScreenOn(true);
    this.a.setHideSurfaceView(false);
    this.a.setVisibility(0);
    this.a.setZOrderMediaOverlay(true);
    this.a.setDecodeType(0);
    this.a.setVideoPath(this.b);
    this.a.start();
    this.d.setVisibility(8);
    this.a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener()
    {
      public void onPrepared(IMediaPlayer paramAnonymousIMediaPlayer) {}
    });
    this.a.setOnInfoListener(new IMediaPlayer.OnInfoListener()
    {
      public boolean onInfo(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (j.a(j.this).isPlaying()) {
          j.b(j.this).setVisibility(0);
        }
        j.a(j.this).toggleAspectRatioPOi();
        return false;
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */