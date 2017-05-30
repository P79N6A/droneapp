package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;
import com.fimi.overseas.soul.R;
import com.fimi.soul.media.player.FermiPlayerViewBuilder.OnClickCloseListener;
import com.fimi.soul.media.player.FermiPlayerViewBuilder.OnDoubleTapListener;

@SuppressLint({"ValidFragment"})
public class VideoDialogFragment extends DialogFragment {
    private static final String SP_KEY_FRAGMENT_LOADING_AGAIN = "SP_KEY_FRAGMENT_LOADING_AGAIN_VideoDialogFragment";
    private static final String SP_KEY_FRAGMENT_ORIGIN_ORIENTATION = "SP_KEY_FRAGMENT_ORIGIN_ORIENTATION_VideoDialogFragment";
    private static final String SP_KEY_FRAGMENT_POSITION = "SP_KEY_FRAGMENT_POSITION_VideoDialogFragment";
    private static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
    private int currentPosition = 0;
    private boolean isPortait = false;
    private boolean loadingAgain = false;
    a manager = null;
    private IFermiMediaPlayer player;
    private String url = "";

    private void changeScreenOrientation() {
        this.player.pause();
        this.currentPosition = this.player.getPosition();
        Log.d("Good", this.currentPosition + "");
        if (this.currentPosition < 2000) {
            this.currentPosition = 0;
        } else {
            this.currentPosition -= 2000;
        }
        this.manager.a(SP_KEY_FRAGMENT_POSITION, this.currentPosition);
        if (this.isPortait) {
            getActivity().setRequestedOrientation(0);
        }
    }

    public static VideoDialogFragment newInstance(String str) {
        VideoDialogFragment videoDialogFragment = new VideoDialogFragment();
        videoDialogFragment.url = str;
        c.c().a("SP_KEY_PLAYER_ADDR_VideoDialogFragment", str);
        return videoDialogFragment;
    }

    public void dismissDialog() {
        this.player.stop();
        if (this.manager.d(SP_KEY_FRAGMENT_ORIGIN_ORIENTATION) != this.isPortait) {
            if (this.manager.d(SP_KEY_FRAGMENT_ORIGIN_ORIENTATION)) {
                getActivity().setRequestedOrientation(1);
            } else {
                getActivity().setRequestedOrientation(0);
            }
        }
        this.currentPosition = 0;
        this.manager.a(SP_KEY_FRAGMENT_POSITION, this.currentPosition);
        this.manager.a(SP_KEY_FRAGMENT_LOADING_AGAIN, false);
        dismiss();
    }

    public void onCancel(DialogInterface dialogInterface) {
        dismissDialog();
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.manager = c.c();
        setStyle(R.style.videoDialog, 16973831);
        this.isPortait = getResources().getConfiguration().orientation == 1;
        this.currentPosition = this.manager.b(SP_KEY_FRAGMENT_POSITION);
        this.loadingAgain = this.manager.d(SP_KEY_FRAGMENT_LOADING_AGAIN);
        if (!this.loadingAgain) {
            this.manager.a(SP_KEY_FRAGMENT_ORIGIN_ORIENTATION, this.isPortait);
            this.manager.a(SP_KEY_FRAGMENT_LOADING_AGAIN, true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.isPortait ? R.layout.layout_videoview_popup : R.layout.layout_videoview_popup_fullscreen;
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.player.setAutoPlay(true);
        this.player.setPlayPosition(this.currentPosition);
        this.url = this.manager.a("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
        View create = FermiPlayerViewBuilder.Builder(getActivity(), i).setFermiMediaPlayer(this.player).setOnClickFullscreenListener(new OnClickListener() {
            public void onClick(View view) {
                VideoDialogFragment.this.changeScreenOrientation();
            }
        }).setOnClickCloseListenner(new OnClickCloseListener() {
            public void onClose(View view) {
                VideoDialogFragment.this.player.stop();
                VideoDialogFragment.this.dismissDialog();
            }
        }).setOnDoubleTapListener(new OnDoubleTapListener() {
            public void onDoubleTap(MotionEvent motionEvent) {
                VideoDialogFragment.this.changeScreenOrientation();
            }
        }).create();
        this.player.setMediaUri(this.url);
        this.player.prepare();
        return create;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.player.play();
    }
}
