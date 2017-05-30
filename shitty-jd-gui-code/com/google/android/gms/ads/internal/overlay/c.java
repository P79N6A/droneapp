package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@aaa
@TargetApi(14)
public class c
  extends i
  implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map<Integer, String> a = new HashMap();
  private final x b;
  private final boolean c;
  private int d = 0;
  private int e = 0;
  private MediaPlayer f;
  private Uri g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private float m = 1.0F;
  private boolean n;
  private boolean o;
  private w p;
  private boolean q;
  private int r;
  private h s;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a.put(Integer.valueOf(64532), "MEDIA_ERROR_IO");
      a.put(Integer.valueOf(64529), "MEDIA_ERROR_MALFORMED");
      a.put(Integer.valueOf(64526), "MEDIA_ERROR_UNSUPPORTED");
      a.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
      a.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    }
    a.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    a.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    a.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    a.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    a.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    a.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    a.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    a.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    a.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    if (Build.VERSION.SDK_INT >= 19)
    {
      a.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
      a.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
  }
  
  public c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, x paramx)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.b = paramx;
    this.q = paramBoolean1;
    this.c = paramBoolean2;
    this.b.a(this);
  }
  
  private void a(boolean paramBoolean)
  {
    abr.e("AdMediaPlayerView release");
    if (this.p != null)
    {
      this.p.b();
      this.p = null;
    }
    if (this.f != null)
    {
      this.f.reset();
      this.f.release();
      this.f = null;
      b(0);
      if (paramBoolean)
      {
        this.e = 0;
        c(0);
      }
      j();
    }
  }
  
  private void b(float paramFloat)
  {
    if (this.f != null) {}
    try
    {
      this.f.setVolume(paramFloat, paramFloat);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
    abr.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    return;
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 3) {
      this.b.c();
    }
    for (;;)
    {
      this.d = paramInt;
      return;
      if (this.d == 3) {
        this.b.d();
      }
    }
  }
  
  private void c(int paramInt)
  {
    this.e = paramInt;
  }
  
  private void g()
  {
    abr.e("AdMediaPlayerView init MediaPlayer");
    Object localObject1 = getSurfaceTexture();
    if ((this.g == null) || (localObject1 == null)) {
      return;
    }
    a(false);
    try
    {
      this.f = u.v().a();
      this.f.setOnBufferingUpdateListener(this);
      this.f.setOnCompletionListener(this);
      this.f.setOnErrorListener(this);
      this.f.setOnInfoListener(this);
      this.f.setOnPreparedListener(this);
      this.f.setOnVideoSizeChangedListener(this);
      this.j = 0;
      if (!this.q) {
        break label276;
      }
      this.p = new w(getContext());
      this.p.a((SurfaceTexture)localObject1, getWidth(), getHeight());
      this.p.start();
      localObject2 = this.p.c();
      if (localObject2 == null) {
        break label264;
      }
      localObject1 = localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject2 = String.valueOf(this.g);
        abr.d(String.valueOf(localObject2).length() + 36 + "Failed to initialize MediaPlayer at " + (String)localObject2, localIOException);
        onError(this.f, 1, 0);
        return;
        this.p.b();
        this.p = null;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    this.f.setDataSource(getContext(), this.g);
    localObject1 = u.w().a((SurfaceTexture)localObject1);
    this.f.setSurface((Surface)localObject1);
    this.f.setAudioStreamType(3);
    this.f.setScreenOnWhilePlaying(true);
    this.f.prepareAsync();
    b(1);
  }
  
  private void h()
  {
    if (!this.c) {}
    while ((!k()) || (this.f.getCurrentPosition() <= 0) || (this.e == 3)) {
      return;
    }
    abr.e("AdMediaPlayerView nudging MediaPlayer");
    b(0.0F);
    this.f.start();
    int i1 = this.f.getCurrentPosition();
    long l1 = u.k().a();
    while ((k()) && (this.f.getCurrentPosition() == i1) && (u.k().a() - l1 <= 250L)) {}
    this.f.pause();
    n();
  }
  
  private void i()
  {
    AudioManager localAudioManager = o();
    if ((localAudioManager != null) && (!this.o))
    {
      if (localAudioManager.requestAudioFocus(this, 3, 2) == 1) {
        l();
      }
    }
    else {
      return;
    }
    abr.d("AdMediaPlayerView audio focus request failed");
  }
  
  private void j()
  {
    abr.e("AdMediaPlayerView abandon audio focus");
    AudioManager localAudioManager = o();
    if ((localAudioManager != null) && (this.o))
    {
      if (localAudioManager.abandonAudioFocus(this) == 1) {
        this.o = false;
      }
    }
    else {
      return;
    }
    abr.d("AdMediaPlayerView abandon audio focus failed");
  }
  
  private boolean k()
  {
    return (this.f != null) && (this.d != -1) && (this.d != 0) && (this.d != 1);
  }
  
  private void l()
  {
    abr.e("AdMediaPlayerView audio focus gained");
    this.o = true;
    n();
  }
  
  private void m()
  {
    abr.e("AdMediaPlayerView audio focus lost");
    this.o = false;
    n();
  }
  
  private void n()
  {
    if ((!this.n) && (this.o))
    {
      b(this.m);
      return;
    }
    b(0.0F);
  }
  
  private AudioManager o()
  {
    return (AudioManager)getContext().getSystemService("audio");
  }
  
  public String a()
  {
    if (this.q) {}
    for (String str = " spherical";; str = "")
    {
      str = String.valueOf(str);
      if (str.length() == 0) {
        break;
      }
      return "MediaPlayer".concat(str);
    }
    return new String("MediaPlayer");
  }
  
  public void a(float paramFloat)
  {
    this.m = paramFloat;
    n();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if (this.p != null) {
      this.p.a(paramFloat1, paramFloat2);
    }
  }
  
  public void a(int paramInt)
  {
    abr.e(34 + "AdMediaPlayerView seek " + paramInt);
    if (k())
    {
      this.f.seekTo(paramInt);
      this.r = 0;
      return;
    }
    this.r = paramInt;
  }
  
  public void a(h paramh)
  {
    this.s = paramh;
  }
  
  public void b()
  {
    abr.e("AdMediaPlayerView stop");
    if (this.f != null)
    {
      this.f.stop();
      this.f.release();
      this.f = null;
      b(0);
      c(0);
      j();
    }
    this.b.b();
  }
  
  public void c()
  {
    abr.e("AdMediaPlayerView play");
    if (k())
    {
      this.f.start();
      b(3);
      abv.a.post(new Runnable()
      {
        public void run()
        {
          if (c.a(c.this) != null) {
            c.a(c.this).c();
          }
        }
      });
    }
    c(3);
  }
  
  public void d()
  {
    abr.e("AdMediaPlayerView pause");
    if ((k()) && (this.f.isPlaying()))
    {
      this.f.pause();
      b(4);
      abv.a.post(new Runnable()
      {
        public void run()
        {
          if (c.a(c.this) != null) {
            c.a(c.this).d();
          }
        }
      });
    }
    c(4);
  }
  
  public void e()
  {
    this.n = true;
    n();
  }
  
  public void f()
  {
    this.n = false;
    n();
  }
  
  public int getCurrentPosition()
  {
    if (k()) {
      return this.f.getCurrentPosition();
    }
    return 0;
  }
  
  public int getDuration()
  {
    if (k()) {
      return this.f.getDuration();
    }
    return -1;
  }
  
  public int getVideoHeight()
  {
    if (this.f != null) {
      return this.f.getVideoHeight();
    }
    return 0;
  }
  
  public int getVideoWidth()
  {
    if (this.f != null) {
      return this.f.getVideoWidth();
    }
    return 0;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0) {
      l();
    }
    while (paramInt >= 0) {
      return;
    }
    m();
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.j = paramInt;
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    abr.e("AdMediaPlayerView completion");
    b(5);
    c(5);
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null) {
          c.a(c.this).e();
        }
      }
    });
  }
  
  public boolean onError(final MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)a.get(Integer.valueOf(paramInt1));
    final String str = (String)a.get(Integer.valueOf(paramInt2));
    abr.d(String.valueOf(paramMediaPlayer).length() + 38 + String.valueOf(str).length() + "AdMediaPlayerView MediaPlayer error: " + paramMediaPlayer + ":" + str);
    b(-1);
    c(-1);
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null) {
          c.a(c.this).a(paramMediaPlayer, str);
        }
      }
    });
    return true;
  }
  
  public boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)a.get(Integer.valueOf(paramInt1));
    String str = (String)a.get(Integer.valueOf(paramInt2));
    abr.e(String.valueOf(paramMediaPlayer).length() + 37 + String.valueOf(str).length() + "AdMediaPlayerView MediaPlayer info: " + paramMediaPlayer + ":" + str);
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = getDefaultSize(this.h, paramInt1);
    int i4 = getDefaultSize(this.i, paramInt2);
    int i2 = i4;
    int i1 = i3;
    int i5;
    if (this.h > 0)
    {
      i2 = i4;
      i1 = i3;
      if (this.i > 0)
      {
        i2 = i4;
        i1 = i3;
        if (this.p == null)
        {
          i4 = View.MeasureSpec.getMode(paramInt1);
          paramInt1 = View.MeasureSpec.getSize(paramInt1);
          i5 = View.MeasureSpec.getMode(paramInt2);
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          if ((i4 != 1073741824) || (i5 != 1073741824)) {
            break label242;
          }
          if (this.h * paramInt2 >= this.i * paramInt1) {
            break label209;
          }
          i1 = this.h * paramInt2 / this.i;
          i2 = paramInt2;
        }
      }
    }
    for (;;)
    {
      setMeasuredDimension(i1, i2);
      if (this.p != null) {
        this.p.a(i1, i2);
      }
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((this.k > 0) && (this.k != i1)) || ((this.l > 0) && (this.l != i2))) {
          h();
        }
        this.k = i1;
        this.l = i2;
      }
      return;
      label209:
      if (this.h * paramInt2 > this.i * paramInt1)
      {
        i2 = this.i * paramInt1 / this.h;
        i1 = paramInt1;
        continue;
        label242:
        if (i4 == 1073741824)
        {
          i2 = this.i * paramInt1 / this.h;
          if ((i5 == Integer.MIN_VALUE) && (i2 > paramInt2))
          {
            i2 = paramInt2;
            i1 = paramInt1;
          }
        }
        else
        {
          if (i5 == 1073741824)
          {
            i3 = this.h * paramInt2 / this.i;
            i2 = paramInt2;
            i1 = i3;
            if (i4 != Integer.MIN_VALUE) {
              continue;
            }
            i2 = paramInt2;
            i1 = i3;
            if (i3 <= paramInt1) {
              continue;
            }
            i2 = paramInt2;
            i1 = paramInt1;
            continue;
          }
          i3 = this.h;
          i1 = this.i;
          if ((i5 == Integer.MIN_VALUE) && (i1 > paramInt2)) {
            i3 = this.h * paramInt2 / this.i;
          }
          for (;;)
          {
            i2 = paramInt2;
            i1 = i3;
            if (i4 != Integer.MIN_VALUE) {
              break;
            }
            i2 = paramInt2;
            i1 = i3;
            if (i3 <= paramInt1) {
              break;
            }
            i2 = this.i * paramInt1 / this.h;
            i1 = paramInt1;
            break;
            paramInt2 = i1;
          }
        }
        i1 = paramInt1;
      }
      else
      {
        i2 = paramInt2;
        i1 = paramInt1;
      }
    }
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    abr.e("AdMediaPlayerView prepared");
    b(2);
    this.b.a();
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null) {
          c.a(c.this).b();
        }
      }
    });
    this.h = paramMediaPlayer.getVideoWidth();
    this.i = paramMediaPlayer.getVideoHeight();
    if (this.r != 0) {
      a(this.r);
    }
    h();
    int i1 = this.h;
    int i2 = this.i;
    abr.c(62 + "AdMediaPlayerView stream dimensions: " + i1 + " x " + i2);
    if (this.e == 3) {
      c();
    }
    i();
    n();
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    abr.e("AdMediaPlayerView surface created");
    g();
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null) {
          c.a(c.this).a();
        }
      }
    });
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    abr.e("AdMediaPlayerView surface destroyed");
    if ((this.f != null) && (this.r == 0)) {
      this.r = this.f.getCurrentPosition();
    }
    if (this.p != null) {
      this.p.b();
    }
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null)
        {
          c.a(c.this).d();
          c.a(c.this).f();
        }
      }
    });
    a(true);
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int i2 = 1;
    abr.e("AdMediaPlayerView surface changed");
    int i1;
    if (this.e == 3)
    {
      i1 = 1;
      if ((this.h != paramInt1) || (this.i != paramInt2)) {
        break label95;
      }
    }
    for (;;)
    {
      if ((this.f != null) && (i1 != 0) && (i2 != 0))
      {
        if (this.r != 0) {
          a(this.r);
        }
        c();
      }
      if (this.p != null) {
        this.p.a(paramInt1, paramInt2);
      }
      return;
      i1 = 0;
      break;
      label95:
      i2 = 0;
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.b.b(this);
  }
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    abr.e(57 + "AdMediaPlayerView size changed: " + paramInt1 + " x " + paramInt2);
    this.h = paramMediaPlayer.getVideoWidth();
    this.i = paramMediaPlayer.getVideoHeight();
    if ((this.h != 0) && (this.i != 0)) {
      requestLayout();
    }
  }
  
  public void setVideoPath(String paramString)
  {
    setVideoURI(Uri.parse(paramString));
  }
  
  public void setVideoURI(Uri paramUri)
  {
    this.g = paramUri;
    this.r = 0;
    g();
    requestLayout();
    invalidate();
  }
  
  public String toString()
  {
    String str1 = String.valueOf(getClass().getName());
    String str2 = String.valueOf(Integer.toHexString(hashCode()));
    return String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + "@" + str2;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */