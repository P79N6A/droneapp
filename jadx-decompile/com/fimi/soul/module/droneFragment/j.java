package com.fimi.soul.module.droneFragment;

import android.view.View;
import android.widget.ImageView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer.OnInfoListener;
import com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class j {
    private FimiVideoView a;
    private String b = e.d();
    private ImageView c;
    private ImageView d;

    public j(View view) {
        this.a = (FimiVideoView) view.findViewById(R.id.my_video_view);
        this.c = (ImageView) view.findViewById(R.id.targeImage);
        this.d = (ImageView) view.findViewById(R.id.control_cantairn);
    }

    public void a() {
        if (this.a.isPlaying()) {
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

    public void b() {
        this.a.setKeepScreenOn(true);
        this.a.setHideSurfaceView(false);
        this.a.setVisibility(0);
        this.a.setZOrderMediaOverlay(true);
        this.a.setDecodeType(0);
        this.a.setVideoPath(this.b);
        this.a.start();
        this.d.setVisibility(8);
        this.a.setOnPreparedListener(new OnPreparedListener(this) {
            final /* synthetic */ j a;

            {
                this.a = r1;
            }

            public void onPrepared(IMediaPlayer iMediaPlayer) {
            }
        });
        this.a.setOnInfoListener(new OnInfoListener(this) {
            final /* synthetic */ j a;

            {
                this.a = r1;
            }

            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                if (this.a.a.isPlaying()) {
                    this.a.c.setVisibility(0);
                }
                this.a.a.toggleAspectRatioPOi();
                return false;
            }
        });
    }
}
