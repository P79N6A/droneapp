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
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.fimi.soul.media.player.IMediaPlayer;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@aaa
public class c extends i implements OnAudioFocusChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
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
    private float m = 1.0f;
    private boolean n;
    private boolean o;
    private w p;
    private boolean q;
    private int r;
    private h s;

    static {
        if (VERSION.SDK_INT >= 17) {
            a.put(Integer.valueOf(IMediaPlayer.MEDIA_ERROR_IO), "MEDIA_ERROR_IO");
            a.put(Integer.valueOf(IMediaPlayer.MEDIA_ERROR_MALFORMED), "MEDIA_ERROR_MALFORMED");
            a.put(Integer.valueOf(IMediaPlayer.MEDIA_ERROR_UNSUPPORTED), "MEDIA_ERROR_UNSUPPORTED");
            a.put(Integer.valueOf(IMediaPlayer.MEDIA_ERROR_TIMED_OUT), "MEDIA_ERROR_TIMED_OUT");
            a.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        a.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        a.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        a.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_START), "MEDIA_INFO_BUFFERING_START");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_END), "MEDIA_INFO_BUFFERING_END");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), "MEDIA_INFO_BAD_INTERLEAVING");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE), "MEDIA_INFO_NOT_SEEKABLE");
        a.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_METADATA_UPDATE), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            a.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            a.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public c(Context context, boolean z, boolean z2, x xVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.b = xVar;
        this.q = z;
        this.c = z2;
        this.b.a((i) this);
    }

    private void a(boolean z) {
        abr.e("AdMediaPlayerView release");
        if (this.p != null) {
            this.p.b();
            this.p = null;
        }
        if (this.f != null) {
            this.f.reset();
            this.f.release();
            this.f = null;
            b(0);
            if (z) {
                this.e = 0;
                c(0);
            }
            j();
        }
    }

    private void b(float f) {
        if (this.f != null) {
            try {
                this.f.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        b.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private void b(int i) {
        if (i == 3) {
            this.b.c();
        } else if (this.d == 3) {
            this.b.d();
        }
        this.d = i;
    }

    private void c(int i) {
        this.e = i;
    }

    private void g() {
        Throwable e;
        String valueOf;
        abr.e("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.g != null && surfaceTexture != null) {
            a(false);
            try {
                SurfaceTexture c;
                this.f = u.v().a();
                this.f.setOnBufferingUpdateListener(this);
                this.f.setOnCompletionListener(this);
                this.f.setOnErrorListener(this);
                this.f.setOnInfoListener(this);
                this.f.setOnPreparedListener(this);
                this.f.setOnVideoSizeChangedListener(this);
                this.j = 0;
                if (this.q) {
                    this.p = new w(getContext());
                    this.p.a(surfaceTexture, getWidth(), getHeight());
                    this.p.start();
                    c = this.p.c();
                    if (c == null) {
                        this.p.b();
                        this.p = null;
                    }
                    this.f.setDataSource(getContext(), this.g);
                    this.f.setSurface(u.w().a(c));
                    this.f.setAudioStreamType(3);
                    this.f.setScreenOnWhilePlaying(true);
                    this.f.prepareAsync();
                    b(1);
                }
                c = surfaceTexture;
                this.f.setDataSource(getContext(), this.g);
                this.f.setSurface(u.w().a(c));
                this.f.setAudioStreamType(3);
                this.f.setScreenOnWhilePlaying(true);
                this.f.prepareAsync();
                b(1);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(this.g);
                b.d(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                valueOf = String.valueOf(this.g);
                b.d(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f, 1, 0);
            } catch (IllegalStateException e4) {
                e = e4;
                valueOf = String.valueOf(this.g);
                b.d(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f, 1, 0);
            }
        }
    }

    private void h() {
        if (this.c && k() && this.f.getCurrentPosition() > 0 && this.e != 3) {
            abr.e("AdMediaPlayerView nudging MediaPlayer");
            b(0.0f);
            this.f.start();
            int currentPosition = this.f.getCurrentPosition();
            long a = u.k().a();
            while (k() && this.f.getCurrentPosition() == currentPosition) {
                if (u.k().a() - a > 250) {
                    break;
                }
            }
            this.f.pause();
            n();
        }
    }

    private void i() {
        AudioManager o = o();
        if (o != null && !this.o) {
            if (o.requestAudioFocus(this, 3, 2) == 1) {
                l();
            } else {
                b.d("AdMediaPlayerView audio focus request failed");
            }
        }
    }

    private void j() {
        abr.e("AdMediaPlayerView abandon audio focus");
        AudioManager o = o();
        if (o != null && this.o) {
            if (o.abandonAudioFocus(this) == 1) {
                this.o = false;
            } else {
                b.d("AdMediaPlayerView abandon audio focus failed");
            }
        }
    }

    private boolean k() {
        return (this.f == null || this.d == -1 || this.d == 0 || this.d == 1) ? false : true;
    }

    private void l() {
        abr.e("AdMediaPlayerView audio focus gained");
        this.o = true;
        n();
    }

    private void m() {
        abr.e("AdMediaPlayerView audio focus lost");
        this.o = false;
        n();
    }

    private void n() {
        if (this.n || !this.o) {
            b(0.0f);
        } else {
            b(this.m);
        }
    }

    private AudioManager o() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    public String a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.q ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public void a(float f) {
        this.m = f;
        n();
    }

    public void a(float f, float f2) {
        if (this.p != null) {
            this.p.a(f, f2);
        }
    }

    public void a(int i) {
        abr.e("AdMediaPlayerView seek " + i);
        if (k()) {
            this.f.seekTo(i);
            this.r = 0;
            return;
        }
        this.r = i;
    }

    public void a(h hVar) {
        this.s = hVar;
    }

    public void b() {
        abr.e("AdMediaPlayerView stop");
        if (this.f != null) {
            this.f.stop();
            this.f.release();
            this.f = null;
            b(0);
            c(0);
            j();
        }
        this.b.b();
    }

    public void c() {
        abr.e("AdMediaPlayerView play");
        if (k()) {
            this.f.start();
            b(3);
            abv.a.post(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.s != null) {
                        this.a.s.c();
                    }
                }
            });
        }
        c(3);
    }

    public void d() {
        abr.e("AdMediaPlayerView pause");
        if (k() && this.f.isPlaying()) {
            this.f.pause();
            b(4);
            abv.a.post(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.s != null) {
                        this.a.s.d();
                    }
                }
            });
        }
        c(4);
    }

    public void e() {
        this.n = true;
        n();
    }

    public void f() {
        this.n = false;
        n();
    }

    public int getCurrentPosition() {
        return k() ? this.f.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return k() ? this.f.getDuration() : -1;
    }

    public int getVideoHeight() {
        return this.f != null ? this.f.getVideoHeight() : 0;
    }

    public int getVideoWidth() {
        return this.f != null ? this.f.getVideoWidth() : 0;
    }

    public void onAudioFocusChange(int i) {
        if (i > 0) {
            l();
        } else if (i < 0) {
            m();
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.j = i;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        abr.e("AdMediaPlayerView completion");
        b(5);
        c(5);
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.s != null) {
                    this.a.s.e();
                }
            }
        });
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        final String str = (String) a.get(Integer.valueOf(i));
        final String str2 = (String) a.get(Integer.valueOf(i2));
        b.d(new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        b(-1);
        c(-1);
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c c;

            public void run() {
                if (this.c.s != null) {
                    this.c.s.a(str, str2);
                }
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) a.get(Integer.valueOf(i));
        String str2 = (String) a.get(Integer.valueOf(i2));
        abr.e(new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.h, i);
        int defaultSize2 = getDefaultSize(this.i, i2);
        if (this.h > 0 && this.i > 0 && this.p == null) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.h * defaultSize2 < this.i * size) {
                    defaultSize = (this.h * defaultSize2) / this.i;
                } else if (this.h * defaultSize2 > this.i * size) {
                    defaultSize2 = (this.i * size) / this.h;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.i * size) / this.h;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.h * defaultSize2) / this.i;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.h;
                defaultSize = this.i;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.h * defaultSize2) / this.i;
                }
                if (mode == Integer.MIN_VALUE && r1 > size) {
                    defaultSize2 = (this.i * size) / this.h;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.p != null) {
            this.p.a(defaultSize, defaultSize2);
        }
        if (VERSION.SDK_INT == 16) {
            if ((this.k > 0 && this.k != defaultSize) || (this.l > 0 && this.l != defaultSize2)) {
                h();
            }
            this.k = defaultSize;
            this.l = defaultSize2;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        abr.e("AdMediaPlayerView prepared");
        b(2);
        this.b.a();
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.s != null) {
                    this.a.s.b();
                }
            }
        });
        this.h = mediaPlayer.getVideoWidth();
        this.i = mediaPlayer.getVideoHeight();
        if (this.r != 0) {
            a(this.r);
        }
        h();
        int i = this.h;
        b.c("AdMediaPlayerView stream dimensions: " + i + " x " + this.i);
        if (this.e == 3) {
            c();
        }
        i();
        n();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        abr.e("AdMediaPlayerView surface created");
        g();
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.s != null) {
                    this.a.s.a();
                }
            }
        });
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        abr.e("AdMediaPlayerView surface destroyed");
        if (this.f != null && this.r == 0) {
            this.r = this.f.getCurrentPosition();
        }
        if (this.p != null) {
            this.p.b();
        }
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.s != null) {
                    this.a.s.d();
                    this.a.s.f();
                }
            }
        });
        a(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object obj = 1;
        abr.e("AdMediaPlayerView surface changed");
        Object obj2 = this.e == 3 ? 1 : null;
        if (!(this.h == i && this.i == i2)) {
            obj = null;
        }
        if (!(this.f == null || obj2 == null || r1 == null)) {
            if (this.r != 0) {
                a(this.r);
            }
            c();
        }
        if (this.p != null) {
            this.p.a(i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.b.b(this);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        abr.e("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.h = mediaPlayer.getVideoWidth();
        this.i = mediaPlayer.getVideoHeight();
        if (this.h != 0 && this.i != 0) {
            requestLayout();
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.g = uri;
        this.r = 0;
        g();
        requestLayout();
        invalidate();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getName());
        String valueOf2 = String.valueOf(Integer.toHexString(hashCode()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }
}
