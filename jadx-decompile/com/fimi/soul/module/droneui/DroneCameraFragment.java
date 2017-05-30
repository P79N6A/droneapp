package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseDroneFragment;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.FermiMediaManager;
import com.fimi.soul.media.player.FermiMediaPlayerType;
import com.fimi.soul.media.player.IFermiMediaPlayer;
import com.fimi.soul.media.player.IFermiMediaPlayer.FermiPlyaerState;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.OnPlayerStateChangedListener;
import com.fimi.soul.module.droneui.FlightActivity.b;

public class DroneCameraFragment extends BaseDroneFragment {
    private static final String a = DroneCameraFragment.class.getSimpleName();
    private static final int b = 2;
    private static View e;
    private SurfaceView c;
    private String d = e.d();
    private IFermiMediaPlayer f;
    private boolean g = false;

    private void a(View view) {
        this.c = (SurfaceView) view.findViewById(R.id.ids_video_view);
        e = view.findViewById(R.id.control_cantairn);
        e.setVisibility(0);
    }

    private void i() {
        this.c.setKeepScreenOn(true);
        PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.c.setZOrderMediaOverlay(true);
        this.f = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.FimiMediaPlayer);
        this.f.setSurfaceView(this.c);
        this.f.setAutoPlay(false);
        this.f.setMediaUri(this.d);
        this.f.addOnPlayerStateChangedListener(new OnPlayerStateChangedListener(this) {
            final /* synthetic */ DroneCameraFragment a;

            {
                this.a = r1;
            }

            public void OnPlayerStateChanged(FermiPlyaerState fermiPlyaerState, IFermiMediaPlayer iFermiMediaPlayer) {
                Log.d("Good", "播放器状态-->" + fermiPlyaerState.toString());
                if (fermiPlyaerState == FermiPlyaerState.Inited) {
                    this.a.g = true;
                    this.a.f();
                }
                if (!this.a.g) {
                    return;
                }
                if (fermiPlyaerState == FermiPlyaerState.Playing) {
                    this.a.getActivity().runOnUiThread(new Runnable(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.a.c().sendEmptyMessageDelayed(2, 500);
                        }
                    });
                } else {
                    this.a.getActivity().runOnUiThread(new Runnable(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            DroneCameraFragment.e.setVisibility(0);
                        }
                    });
                }
            }
        });
    }

    public void a(Message message) {
        a().c();
        if (message.what == 2) {
            e.setVisibility(8);
        }
    }

    public void f() {
        if (((FlightActivity) getActivity()).b() == b.Camera && this.f != null && this.d != null && this.g) {
            try {
                this.c.setVisibility(0);
                this.f.prepare();
                this.f.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void g() {
        e.setVisibility(0);
        this.c.setZOrderMediaOverlay(false);
        this.c.setVisibility(8);
        if (this.f.isPlaying()) {
            this.f.stop();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_camera_preview, null);
        getActivity().setVolumeControlStream(3);
        a(inflate);
        i();
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f.isPlaying()) {
            this.f.stop();
        }
        if (this.f instanceof IMediaPlayer) {
            ((IMediaPlayer) this.f).release();
        }
    }

    public void onStart() {
        Log.d("Good", "onStart");
        f();
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        if (this.f.isPlaying()) {
            this.f.stop();
        }
    }
}
