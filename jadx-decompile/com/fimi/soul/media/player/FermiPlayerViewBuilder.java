package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.media.player.IFermiMediaPlayer.FermiPlyaerState;

@SuppressLint({"HandlerLeak"})
final class FermiPlayerViewBuilder {
    private Button btnClose;
    private Button btnFullscreen;
    private Button btnPause;
    private Button btnPlay;
    private Context context = null;
    private long dismissTime = 3000;
    private GestureDetector gestureDetector;
    private Handler handler;
    private boolean isAutoPlay = false;
    private long lastTouchTime;
    private int layoutID = -1;
    private OnClickCloseListener onClickCloseListenner = null;
    private OnClickListener onClickFullscreenListener;
    private OnDisappearButtonListener onDisappearButtonListener = null;
    private OnDoubleTapListener onDoubleTapListener = null;
    private IFermiMediaPlayer player;
    private View popupView;
    private SeekBar seekBar;
    private SurfaceView sfThumbnail;
    private SurfaceView surfaceView;
    private TextView tvCurrentPosition;
    private TextView tvDuration;

    public interface OnClickCloseListener {
        void onClose(View view);
    }

    public interface OnDisappearButtonListener {
        void onDisappearButton(boolean z);
    }

    public interface OnDoubleTapListener {
        void onDoubleTap(MotionEvent motionEvent);
    }

    class InnerHandler extends Handler {
        InnerHandler() {
        }

        public void handleMessage(Message message) {
            if (System.currentTimeMillis() - FermiPlayerViewBuilder.this.lastTouchTime >= FermiPlayerViewBuilder.this.dismissTime) {
                FermiPlayerViewBuilder.this.btnPlay.setVisibility(4);
                FermiPlayerViewBuilder.this.btnClose.setVisibility(4);
                FermiPlayerViewBuilder.this.btnPause.setVisibility(4);
                FermiPlayerViewBuilder.this.seekBar.setVisibility(4);
                FermiPlayerViewBuilder.this.btnFullscreen.setVisibility(4);
                if (!(FermiPlayerViewBuilder.this.tvCurrentPosition == null || FermiPlayerViewBuilder.this.tvDuration == null)) {
                    FermiPlayerViewBuilder.this.tvCurrentPosition.setVisibility(4);
                    FermiPlayerViewBuilder.this.tvDuration.setVisibility(4);
                }
                if (FermiPlayerViewBuilder.this.onDisappearButtonListener != null) {
                    FermiPlayerViewBuilder.this.onDisappearButtonListener.onDisappearButton(true);
                }
            }
            if (message.what == InnerHandlerType.HiddenMessage.ordinal()) {
                FermiPlayerViewBuilder.this.hiddenLoadingImage(true);
            }
            if (message.what == InnerHandlerType.ShowMessage.ordinal()) {
                FermiPlayerViewBuilder.this.hiddenLoadingImage(false);
            }
            super.handleMessage(message);
        }
    }

    private enum InnerHandlerType {
        TouchMessage,
        HiddenMessage,
        ShowMessage,
        MediaSizeChangeMessage
    }

    private FermiPlayerViewBuilder() {
    }

    public static FermiPlayerViewBuilder Builder(Context context, int i) {
        FermiPlayerViewBuilder fermiPlayerViewBuilder = new FermiPlayerViewBuilder();
        fermiPlayerViewBuilder.context = context;
        fermiPlayerViewBuilder.layoutID = i;
        fermiPlayerViewBuilder.buildWindow();
        return fermiPlayerViewBuilder;
    }

    private void buildWindow() {
        this.handler = new InnerHandler();
        this.popupView = LayoutInflater.from(getContext()).inflate(this.layoutID, null);
        this.btnPlay = (Button) this.popupView.findViewById(R.id.iv_play);
        this.btnClose = (Button) this.popupView.findViewById(R.id.iv_close);
        this.btnPause = (Button) this.popupView.findViewById(R.id.iv_pause);
        this.btnFullscreen = (Button) this.popupView.findViewById(R.id.btn_fullScreen);
        this.seekBar = (SeekBar) this.popupView.findViewById(R.id.sb_seekbar);
        this.tvCurrentPosition = (TextView) this.popupView.findViewById(R.id.tv_position);
        this.tvDuration = (TextView) this.popupView.findViewById(R.id.tv_duration);
        this.surfaceView = (SurfaceView) this.popupView.findViewById(R.id.sf_video);
        this.surfaceView.setZOrderMediaOverlay(true);
        this.sfThumbnail = (SurfaceView) this.popupView.findViewById(R.id.sf_video_thumbnail);
        this.popupView.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                FermiPlayerViewBuilder.this.sendTouchMessage();
                return FermiPlayerViewBuilder.this.gestureDetector.onTouchEvent(motionEvent);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (FermiPlayerViewBuilder.this.onDoubleTapListener != null) {
                    FermiPlayerViewBuilder.this.onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return true;
            }

            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }
        });
        this.btnClose.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                FermiPlayerViewBuilder.this.sendTouchMessage();
                if (FermiPlayerViewBuilder.this.onClickCloseListenner != null) {
                    FermiPlayerViewBuilder.this.onClickCloseListenner.onClose(view);
                }
            }
        });
        this.btnPlay.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                FermiPlayerViewBuilder.this.sendTouchMessage();
                if (!FermiPlayerViewBuilder.this.player.isPlaying()) {
                    FermiPlayerViewBuilder.this.player.play();
                }
                FermiPlayerViewBuilder.this.changePlayState(true);
            }
        });
        this.btnPause.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (FermiPlayerViewBuilder.this.player.isPlaying()) {
                    FermiPlayerViewBuilder.this.player.pause();
                }
                FermiPlayerViewBuilder.this.changePlayState(false);
            }
        });
        this.btnFullscreen.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (FermiPlayerViewBuilder.this.onClickFullscreenListener != null) {
                    FermiPlayerViewBuilder.this.onClickFullscreenListener.onClick(view);
                }
            }
        });
        this.surfaceView.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                FermiPlayerViewBuilder.this.surfaceView.setZOrderMediaOverlay(true);
                FermiPlayerViewBuilder.this.surfaceView.setZOrderOnTop(false);
                FermiPlayerViewBuilder.this.changePlayState();
                return false;
            }
        });
    }

    private void changePlayState() {
        changePlayState(this.player.isPlaying());
    }

    private void changePlayState(boolean z) {
        if (z) {
            this.sfThumbnail.setVisibility(8);
            this.btnPlay.setVisibility(4);
            this.btnPause.bringToFront();
            this.btnPause.setVisibility(0);
            return;
        }
        this.btnPause.setVisibility(4);
        this.btnPlay.bringToFront();
        this.btnPlay.setVisibility(0);
    }

    private Context getContext() {
        return this.context;
    }

    private void sendTouchMessage() {
        this.lastTouchTime = System.currentTimeMillis();
        this.btnClose.setVisibility(0);
        this.seekBar.setVisibility(0);
        this.btnFullscreen.setVisibility(0);
        if (!(this.tvCurrentPosition == null || this.tvDuration == null)) {
            this.tvCurrentPosition.setVisibility(0);
            this.tvDuration.setVisibility(0);
        }
        if (this.onDisappearButtonListener != null) {
            this.onDisappearButtonListener.onDisappearButton(false);
        }
        new Message().what = InnerHandlerType.TouchMessage.ordinal();
        this.handler.sendMessageDelayed(new Message(), this.dismissTime);
    }

    private void setSurfaceViewSize(int i, int i2) {
        int i3 = 1;
        if (getContext().getResources().getConfiguration().orientation != 1) {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = (this.surfaceView.getWidth() - ((this.surfaceView.getHeight() * i) / i2)) / 2;
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(i3, 0, i3, 0);
            this.surfaceView.setLayoutParams(layoutParams);
        }
    }

    public View create() {
        return this.popupView;
    }

    public FermiPlayerViewBuilder hiddenLoadingImage(boolean z) {
        if (z) {
            this.sfThumbnail.setVisibility(8);
        } else {
            this.sfThumbnail.setVisibility(0);
        }
        return this;
    }

    public FermiPlayerViewBuilder setContentView(int i) {
        this.layoutID = i;
        return this;
    }

    public FermiPlayerViewBuilder setControlDisplayDuration(int i) {
        this.dismissTime = (long) i;
        return this;
    }

    public FermiPlayerViewBuilder setFermiMediaPlayer(IFermiMediaPlayer iFermiMediaPlayer) {
        this.player = iFermiMediaPlayer;
        this.player.setSurfaceView(this.surfaceView);
        this.player.setSeekBar(this.seekBar);
        this.player.setOnProgressChangedListener(new OnProgressChangedListener() {
            public void onProgressChanged(long j, long j2) {
                FermiPlayerViewBuilder.this.seekBar.setMax((int) j2);
                FermiPlayerViewBuilder.this.seekBar.setProgress((int) j);
                FermiPlayerViewBuilder.this.seekBar.setEnabled(j2 != 0);
                if (FermiPlayerViewBuilder.this.tvDuration != null && FermiPlayerViewBuilder.this.tvCurrentPosition != null) {
                    FermiPlayerViewBuilder.this.tvDuration.setText(FermiPlayerUtils.getTimelineString(j2));
                    FermiPlayerViewBuilder.this.tvCurrentPosition.setText(FermiPlayerUtils.getTimelineString(j));
                }
            }
        });
        this.player.addOnPlayerStateChangedListener(new OnPlayerStateChangedListener() {
            public void OnPlayerStateChanged(FermiPlyaerState fermiPlyaerState, IFermiMediaPlayer iFermiMediaPlayer) {
                Message message = new Message();
                if (fermiPlyaerState == FermiPlyaerState.Playing) {
                    message.what = InnerHandlerType.HiddenMessage.ordinal();
                } else {
                    message.what = InnerHandlerType.ShowMessage.ordinal();
                }
                FermiPlayerViewBuilder.this.handler.sendMessage(message);
            }
        });
        return this;
    }

    public FermiPlayerViewBuilder setNoSeekBar() {
        this.btnPlay.setVisibility(0);
        this.btnPause.setVisibility(4);
        this.btnClose.setVisibility(0);
        this.seekBar.setVisibility(8);
        return this;
    }

    public FermiPlayerViewBuilder setOnClickCloseListenner(OnClickCloseListener onClickCloseListener) {
        this.onClickCloseListenner = onClickCloseListener;
        return this;
    }

    public FermiPlayerViewBuilder setOnClickFullscreenListener(OnClickListener onClickListener) {
        this.onClickFullscreenListener = onClickListener;
        return this;
    }

    public FermiPlayerViewBuilder setOnDisappearButtonListener(OnDisappearButtonListener onDisappearButtonListener) {
        this.onDisappearButtonListener = onDisappearButtonListener;
        return this;
    }

    public FermiPlayerViewBuilder setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
        return this;
    }
}
