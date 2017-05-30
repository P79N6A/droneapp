package com.fimi.soul.media.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.fimi.soul.media.player.IFermiMediaPlayer.FermiPlyaerState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class FermiSystemMediaPlayer implements Callback, OnSeekBarChangeListener, IFermiMediaPlayer {
    private Context context;
    private String dataSourceUrl;
    private Handler handler = new InnerHandler();
    private boolean isAutoPlay;
    private boolean ischanging = false;
    private OnMediaSizeChangedListener onMediaSizeChangedListener;
    private List<OnPlayerStateChangedListener> onPlayerStateChangedListenerArray = new ArrayList();
    private OnProgressChangedListener onProgressChangedListener;
    private MediaPlayer player = null;
    private SeekBar seekBar;
    private int startPosition = 0;
    private SurfaceView surfaceView;
    private Timer timer = new Timer();
    private TimerTask timerTask;

    class InnerHandler extends Handler {
        InnerHandler() {
        }

        public void handleMessage(Message message) {
            if (FermiSystemMediaPlayer.this.onProgressChangedListener != null) {
                FermiSystemMediaPlayer.this.onProgressChangedListener.onProgressChanged((long) message.arg1, (long) message.arg2);
            }
            super.handleMessage(message);
        }
    }

    public FermiSystemMediaPlayer(Context context) {
        this.context = context;
        this.timerTask = new TimerTask() {
            public void run() {
                if (!FermiSystemMediaPlayer.this.ischanging && FermiSystemMediaPlayer.this.player != null && FermiSystemMediaPlayer.this.seekBar != null && !FermiSystemMediaPlayer.this.ischanging) {
                    FermiSystemMediaPlayer.this.seekBar.setProgress(FermiSystemMediaPlayer.this.player.getCurrentPosition());
                    Message message = new Message();
                    message.arg1 = FermiSystemMediaPlayer.this.player.getCurrentPosition();
                    message.arg2 = FermiSystemMediaPlayer.this.player.getDuration();
                    FermiSystemMediaPlayer.this.handler.sendMessage(message);
                }
            }
        };
        this.timer.schedule(this.timerTask, 0, 1000);
    }

    private Context getContext() {
        return this.context;
    }

    private void onPlayerStateChange(FermiPlyaerState fermiPlyaerState) {
        if (this.onPlayerStateChangedListenerArray.size() > 0) {
            for (OnPlayerStateChangedListener OnPlayerStateChanged : this.onPlayerStateChangedListenerArray) {
                OnPlayerStateChanged.OnPlayerStateChanged(fermiPlyaerState, this);
            }
        }
    }

    public void addOnPlayerStateChangedListener(OnPlayerStateChangedListener onPlayerStateChangedListener) {
        if (onPlayerStateChangedListener != null) {
            this.onPlayerStateChangedListenerArray.add(onPlayerStateChangedListener);
        }
    }

    public long getCurrentPosition() {
        return (long) this.player.getCurrentPosition();
    }

    public long getDuration() {
        return (long) this.player.getDuration();
    }

    public int getPosition() {
        return this.player.getCurrentPosition();
    }

    public boolean isAutoPlay() {
        return this.isAutoPlay;
    }

    public boolean isPlaying() {
        return this.player != null ? this.player.isPlaying() : false;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.player.seekTo(i);
            if (this.onProgressChangedListener != null) {
                this.onProgressChangedListener.onProgressChanged((long) i, (long) this.player.getDuration());
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.ischanging = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void pause() {
        if (this.player != null && this.player.isPlaying()) {
            this.player.pause();
            onPlayerStateChange(FermiPlyaerState.Pause);
        }
    }

    public void play() {
        if (this.player != null) {
            try {
                if (!(this.player == null || this.player.isPlaying())) {
                    this.player.stop();
                }
                this.player.prepare();
                if (!isAutoPlay()) {
                    this.player.start();
                    onPlayerStateChange(FermiPlyaerState.Playing);
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void prepare() {
        if (this.player != null) {
            try {
                this.player.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void seekTo(long j) {
        this.player.seekTo((int) j);
    }

    public void setAutoPlay(boolean z) {
        this.isAutoPlay = z;
    }

    public void setMediaUri(String str) {
        setMediaUri(str, null, null);
    }

    public void setMediaUri(String str, String str2, String str3) {
        this.dataSourceUrl = str;
        if (this.player != null) {
            try {
                this.player.setDataSource(this.dataSourceUrl);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (SecurityException e2) {
                e2.printStackTrace();
            } catch (IllegalStateException e3) {
                e3.printStackTrace();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void setOnMediaSizeChangedListener(OnMediaSizeChangedListener onMediaSizeChangedListener) {
        this.onMediaSizeChangedListener = onMediaSizeChangedListener;
    }

    public void setOnProgressChangedListener(OnProgressChangedListener onProgressChangedListener) {
        this.onProgressChangedListener = onProgressChangedListener;
    }

    public void setPlayPosition(int i) {
        this.startPosition = i;
    }

    public void setSeekBar(SeekBar seekBar) {
        this.seekBar = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    public void setSurfaceView(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(this);
    }

    public void stop() {
        if (this.player != null) {
            this.player.stop();
            onPlayerStateChange(FermiPlyaerState.Stop);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.player = new MediaPlayer();
        this.player.setAudioStreamType(3);
        this.player.setDisplay(surfaceHolder);
        this.player.setOnSeekCompleteListener(new OnSeekCompleteListener() {
            public void onSeekComplete(MediaPlayer mediaPlayer) {
                FermiSystemMediaPlayer.this.ischanging = false;
                mediaPlayer.start();
            }
        });
        try {
            this.player.setDataSource(this.dataSourceUrl);
            this.player.prepare();
            this.player.setOnPreparedListener(new OnPreparedListener() {
                public void onPrepared(MediaPlayer mediaPlayer) {
                    if (FermiSystemMediaPlayer.this.seekBar != null) {
                        FermiSystemMediaPlayer.this.seekBar.setMax(mediaPlayer.getDuration());
                    }
                    if (FermiSystemMediaPlayer.this.isAutoPlay) {
                        FermiSystemMediaPlayer.this.seekTo((long) FermiSystemMediaPlayer.this.startPosition);
                        mediaPlayer.start();
                        FermiSystemMediaPlayer.this.onPlayerStateChange(FermiPlyaerState.Playing);
                    }
                }
            });
            this.player.setOnCompletionListener(new OnCompletionListener() {
                public void onCompletion(MediaPlayer mediaPlayer) {
                }
            });
            this.player.setOnVideoSizeChangedListener(new OnVideoSizeChangedListener() {
                public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                    if (FermiSystemMediaPlayer.this.onMediaSizeChangedListener != null) {
                        Log.d("Good", i + ":" + i2);
                        FermiSystemMediaPlayer.this.onMediaSizeChangedListener.onMediaSizeChanged(FermiSystemMediaPlayer.this, i, i2);
                    }
                }
            });
            this.player.prepareAsync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.player.isPlaying()) {
            this.player.stop();
        }
    }
}