package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class h {
    private View a;
    private FimiVideoView b;
    private String c = e.d();
    private ImageView d;
    private Context e;

    public h(View view, Context context) {
        this.a = view;
        this.b = (FimiVideoView) view.findViewById(R.id.my_video_view);
        this.d = (ImageView) view.findViewById(R.id.targeImage);
        this.e = context;
    }

    private void c() {
        this.b.setKeepScreenOn(true);
        this.b.setHideSurfaceView(false);
        this.b.setVisibility(0);
        this.b.setZOrderMediaOverlay(true);
        this.b.setDecodeType(0);
        this.b.setVideoPath(this.c);
        this.b.start();
        this.b.setOnPreparedListener(new OnPreparedListener(this) {
            final /* synthetic */ h a;

            {
                this.a = r1;
            }

            public void onPrepared(IMediaPlayer iMediaPlayer) {
            }
        });
        this.b.setOnInfoListener(new OnInfoListener(this) {
            final /* synthetic */ h a;

            {
                this.a = r1;
            }

            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                if (this.a.b.isPlaying()) {
                    this.a.d.setVisibility(0);
                }
                this.a.b.toggleAspectRatioPOi();
                return false;
            }
        });
    }

    public void a() {
        this.b.setVisibility(0);
        c();
    }

    public void b() {
        if (this.b.isPlaying()) {
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
