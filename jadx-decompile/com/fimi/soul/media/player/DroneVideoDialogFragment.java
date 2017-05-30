package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;
import com.fimi.overseas.soul.R;
import com.fimi.soul.media.player.FermiPlayerViewBuilder.OnClickCloseListener;
import com.fimi.soul.media.player.FermiPlayerViewBuilder.OnDisappearButtonListener;

@SuppressLint({"ValidFragment"})
public class DroneVideoDialogFragment extends DialogFragment implements OnDisappearButtonListener {
    private static final String SP_KEY_FRAGMENT_POSITION = "SP_KEY_FRAGMENT_POSITION_VideoDialogFragment";
    private static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
    private View bottomView;
    private int currentPosition = 0;
    a manager = null;
    private IFermiMediaPlayer player;
    private View topView;
    private String url = "";

    public static DroneVideoDialogFragment newInstance(String str) {
        DroneVideoDialogFragment droneVideoDialogFragment = new DroneVideoDialogFragment();
        droneVideoDialogFragment.url = str;
        c.c().a("SP_KEY_PLAYER_ADDR_VideoDialogFragment", str);
        return droneVideoDialogFragment;
    }

    public void dismissDialog() {
        this.player.stop();
        this.currentPosition = 0;
        this.manager.a(SP_KEY_FRAGMENT_POSITION, this.currentPosition);
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
        this.currentPosition = this.manager.b(SP_KEY_FRAGMENT_POSITION);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.player = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.SystemMediaPlayer);
        this.player.setAutoPlay(true);
        this.player.setPlayPosition(this.currentPosition);
        this.url = this.manager.a("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
        View create = FermiPlayerViewBuilder.Builder(getActivity(), R.layout.layout_dronevideovideo_fullscreen).setFermiMediaPlayer(this.player).setOnClickCloseListenner(new OnClickCloseListener() {
            public void onClose(View view) {
                DroneVideoDialogFragment.this.player.stop();
                DroneVideoDialogFragment.this.dismissDialog();
            }
        }).setOnDisappearButtonListener(this).create();
        this.topView = create.findViewById(R.id.rl_topView);
        this.bottomView = create.findViewById(R.id.rl_bottomView);
        this.player.setMediaUri(this.url);
        this.player.prepare();
        return create;
    }

    public void onDisappearButton(boolean z) {
        if (z) {
            this.topView.setVisibility(8);
            this.bottomView.setVisibility(8);
            return;
        }
        this.topView.setVisibility(0);
        this.bottomView.setVisibility(0);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.player.play();
    }
}
