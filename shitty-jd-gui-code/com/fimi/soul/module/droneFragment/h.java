package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class h
{
  private View a;
  private FimiVideoView b;
  private String c = e.d();
  private ImageView d;
  private Context e;
  
  public h(View paramView, Context paramContext)
  {
    this.a = paramView;
    this.b = ((FimiVideoView)paramView.findViewById(2131690084));
    this.d = ((ImageView)paramView.findViewById(2131690105));
    this.e = paramContext;
  }
  
  private void c()
  {
    this.b.setKeepScreenOn(true);
    this.b.setHideSurfaceView(false);
    this.b.setVisibility(0);
    this.b.setZOrderMediaOverlay(true);
    this.b.setDecodeType(0);
    this.b.setVideoPath(this.c);
    this.b.start();
    this.b.setOnPreparedListener(new IMediaPlayer.OnPreparedListener()
    {
      public void onPrepared(IMediaPlayer paramAnonymousIMediaPlayer) {}
    });
    this.b.setOnInfoListener(new IMediaPlayer.OnInfoListener()
    {
      public boolean onInfo(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (h.a(h.this).isPlaying()) {
          h.b(h.this).setVisibility(0);
        }
        h.a(h.this).toggleAspectRatioPOi();
        return false;
      }
    });
  }
  
  public void a()
  {
    this.b.setVisibility(0);
    c();
  }
  
  public void b()
  {
    if (this.b.isPlaying())
    {
      this.b.stopPlayback();
      this.b.setKeepScreenOn(false);
      this.b.setZOrderMediaOverlay(false);
      this.b.destroyDrawingCache();
      this.b.release(true);
    }
    this.d.setVisibility(8);
    this.b.setHideSurfaceView(true);
    this.b.setVisibility(8);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */