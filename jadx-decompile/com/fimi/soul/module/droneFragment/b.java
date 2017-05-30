package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnErrorListener;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;
import com.fimi.soul.view.WriteCamera9Grid;

public class b implements OnTouchListener {
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

    public b(Activity activity, View view) {
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.a);
        this.i = (float) this.a.widthPixels;
        this.j = (float) this.a.heightPixels;
        a(view);
        this.d = activity;
        this.g = view;
        b();
        if (this.l == null && activity != null) {
            this.l = v.a((Context) activity).a();
        }
    }

    private void a(View view) {
        this.b = (FimiVideoView) view.findViewById(R.id.ids_video_view);
        this.b.setKeepScreenOn(true);
        this.b.setZOrderMediaOverlay(true);
        this.b.setOnErrorListener(new OnErrorListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return false;
            }
        });
        c = view.findViewById(R.id.control_cantairn);
        c.setVisibility(0);
        view.setOnTouchListener(this);
        this.h = (TextView) view.findViewById(R.id.gc_error_text);
        this.k = (WriteCamera9Grid) view.findViewById(R.id.gridviewCamera);
    }

    public Activity a() {
        return this.d;
    }

    public void a(String str) {
        if (str == null) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.h.setText(str);
    }

    public void a(boolean z) {
        LayoutParams layoutParams = this.g.getLayoutParams();
        if (this.e <= 10 || this.f <= 10) {
            layoutParams.height = this.a.heightPixels;
            layoutParams.width = this.a.widthPixels;
        } else {
            layoutParams.height = this.f;
            layoutParams.width = this.e;
        }
        d();
        this.b.setHideSurfaceView(false);
        this.g.setLayoutParams(layoutParams);
    }

    public void b() {
        LayoutParams layoutParams = this.g.getLayoutParams();
        this.f = layoutParams.height;
        this.e = layoutParams.width;
        layoutParams.height = 1;
        layoutParams.width = 1;
        this.g.setLayoutParams(layoutParams);
        c.setVisibility(0);
        this.b.setHideSurfaceView(true);
        e();
    }

    public void c() {
    }

    public void d() {
        this.b.setVisibility(0);
        this.b.setDecodeType(0);
        this.b.setVideoPath(e.d());
        this.b.start();
        this.b.setOnPreparedListener(new OnPreparedListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onPrepared(IMediaPlayer iMediaPlayer) {
                b.c.setVisibility(8);
            }
        });
        this.b.setOnInfoListener(new OnInfoListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                this.a.b.toggleAspectRatio();
                return false;
            }
        });
    }

    public void e() {
        c.setVisibility(0);
        if (this.b.isPlaying()) {
            this.b.stopPlayback();
            this.b.release(true);
        }
    }

    public void f() {
        c.setVisibility(0);
        this.b.setVisibility(8);
    }

    public void g() {
        if (this.l != null && this.l.getBoolean(c.bM, false) && this.k != null && !this.k.isShown()) {
            this.k.setVisibility(0);
        }
    }

    public void h() {
        if (this.k != null && this.k.isShown()) {
            this.k.setVisibility(8);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x < this.i / com.fimi.soul.view.photodraweeview.c.a || x > (this.i * 2.0f) / com.fimi.soul.view.photodraweeview.c.a || y < this.j / com.fimi.soul.view.photodraweeview.c.a || y > (this.j * 2.0f) / com.fimi.soul.view.photodraweeview.c.a;
    }
}
