package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnErrorListener;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;
import com.fimi.soul.view.WriteCamera9Grid;

public class b
  implements View.OnTouchListener
{
  private static View c;
  DisplayMetrics a = new DisplayMetrics();
  private FimiVideoView b;
  private Activity d;
  private int e;
  private int f;
  private View g;
  private TextView h;
  private float i;
  private float j;
  private WriteCamera9Grid k;
  private SharedPreferences l;
  
  public b(Activity paramActivity, View paramView)
  {
    ((WindowManager)paramActivity.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.a);
    this.i = this.a.widthPixels;
    this.j = this.a.heightPixels;
    a(paramView);
    this.d = paramActivity;
    this.g = paramView;
    b();
    if ((this.l == null) && (paramActivity != null)) {
      this.l = v.a(paramActivity).a();
    }
  }
  
  private void a(View paramView)
  {
    this.b = ((FimiVideoView)paramView.findViewById(2131690211));
    this.b.setKeepScreenOn(true);
    this.b.setZOrderMediaOverlay(true);
    this.b.setOnErrorListener(new IMediaPlayer.OnErrorListener()
    {
      public boolean onError(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        return false;
      }
    });
    c = paramView.findViewById(2131690087);
    c.setVisibility(0);
    paramView.setOnTouchListener(this);
    this.h = ((TextView)paramView.findViewById(2131690212));
    this.k = ((WriteCamera9Grid)paramView.findViewById(2131690213));
  }
  
  public Activity a()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    if (paramString == null)
    {
      this.h.setVisibility(8);
      return;
    }
    this.h.setVisibility(0);
    this.h.setText(paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams = this.g.getLayoutParams();
    if ((this.e > 10) && (this.f > 10)) {
      localLayoutParams.height = this.f;
    }
    for (localLayoutParams.width = this.e;; localLayoutParams.width = this.a.widthPixels)
    {
      d();
      this.b.setHideSurfaceView(false);
      this.g.setLayoutParams(localLayoutParams);
      return;
      localLayoutParams.height = this.a.heightPixels;
    }
  }
  
  public void b()
  {
    ViewGroup.LayoutParams localLayoutParams = this.g.getLayoutParams();
    this.f = localLayoutParams.height;
    this.e = localLayoutParams.width;
    localLayoutParams.height = 1;
    localLayoutParams.width = 1;
    this.g.setLayoutParams(localLayoutParams);
    c.setVisibility(0);
    this.b.setHideSurfaceView(true);
    e();
  }
  
  public void c() {}
  
  public void d()
  {
    this.b.setVisibility(0);
    this.b.setDecodeType(0);
    this.b.setVideoPath(e.d());
    this.b.start();
    this.b.setOnPreparedListener(new IMediaPlayer.OnPreparedListener()
    {
      public void onPrepared(IMediaPlayer paramAnonymousIMediaPlayer)
      {
        b.i().setVisibility(8);
      }
    });
    this.b.setOnInfoListener(new IMediaPlayer.OnInfoListener()
    {
      public boolean onInfo(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        b.a(b.this).toggleAspectRatio();
        return false;
      }
    });
  }
  
  public void e()
  {
    c.setVisibility(0);
    if (this.b.isPlaying())
    {
      this.b.stopPlayback();
      this.b.release(true);
    }
  }
  
  public void f()
  {
    c.setVisibility(0);
    this.b.setVisibility(8);
  }
  
  public void g()
  {
    if ((this.l != null) && (this.l.getBoolean("Show_9_Grid", false)) && (this.k != null) && (!this.k.isShown())) {
      this.k.setVisibility(0);
    }
  }
  
  public void h()
  {
    if ((this.k != null) && (this.k.isShown())) {
      this.k.setVisibility(8);
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    return (f1 < this.i / 3.0F) || (f1 > this.i * 2.0F / 3.0F) || (f2 < this.j / 3.0F) || (f2 > this.j * 2.0F / 3.0F);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */