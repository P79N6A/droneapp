package com.fimi.soul.media.player;

import android.os.Bundle;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class FermiPlayerFullActivity extends BaseActivity {
    public static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
    private FimiVideoView player;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_player_full);
        this.player = (FimiVideoView) findViewById(R.id.video_view);
        this.player.setDecodeType(0);
        this.player.setVideoPath(e.d());
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        this.player.start();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        if (this.player != null) {
            this.player.release(true);
        }
    }
}