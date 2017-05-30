package com.fimi.soul.media.player;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.fimi.kernel.utils.s;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.media.player.widget.FimiVideoView;
import java.io.File;
import java.util.Formatter;
import java.util.Locale;

public class FermiPlayerActivity
  extends BaseActivity
  implements View.OnClickListener
{
  public static final String ONLINEFILE = "online_file";
  public static final String PLAY_NOW = "play_start";
  public static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
  public static final String SP_KEY_PLAYER_IS_REMOTE_ADDR = "SP_KEY_PLAYER_IS_REMOTE_ADDR_VideoDialogFragment";
  private final int BOTTOM_MSG_GONE = 3;
  private final int BOTTOM_MSG_SHOW = 2;
  private final int PROGRESS_MSG = 1;
  private Bitmap bitmap;
  private PercentRelativeLayout bottom_layout;
  private ImageButton btnClose;
  private int current_position;
  boolean finishPlay = false;
  Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
      case 0: 
      case 1: 
        do
        {
          return;
          super.handleMessage(paramAnonymousMessage);
          return;
        } while ((FermiPlayerActivity.this.player == null) || (!FermiPlayerActivity.this.player.isPlaying()));
        FermiPlayerActivity.this.videoThumbnail.setVisibility(4);
        FermiPlayerActivity.this.setProgress();
        return;
      case 2: 
        FermiPlayerActivity.this.top_layout.setVisibility(0);
        FermiPlayerActivity.this.bottom_layout.setVisibility(0);
        FermiPlayerActivity.this.handler.sendEmptyMessageDelayed(3, 3000L);
        FermiPlayerActivity.this.isShow = true;
        return;
      }
      FermiPlayerActivity.this.top_layout.setVisibility(8);
      FermiPlayerActivity.this.bottom_layout.setVisibility(8);
      FermiPlayerActivity.this.isShow = false;
    }
  };
  boolean isPause = false;
  boolean isShow = false;
  private TextView mCurrentTime;
  private TextView mEndTime;
  StringBuilder mFormatBuilder;
  Formatter mFormatter;
  private TextView mNameText;
  private SeekBar mProgress;
  boolean onlineFile;
  public String onlineUrl = null;
  private ImageButton playBtn;
  boolean play_start;
  private FimiVideoView player;
  Thread thread = new Thread()
  {
    public void run()
    {
      try
      {
        while (FermiPlayerActivity.this.player != null)
        {
          if (FermiPlayerActivity.this.player.getCurrentPosition() == FermiPlayerActivity.this.player.getDuration()) {
            return;
          }
          if (FermiPlayerActivity.this.player.isPlaying())
          {
            Message localMessage = FermiPlayerActivity.this.handler.obtainMessage(1);
            FermiPlayerActivity.this.handler.sendMessageDelayed(localMessage, 1L);
          }
          sleep(1000L);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
  };
  private View top_layout;
  public String url = null;
  private ImageView videoThumbnail;
  
  private void initMediaContoller()
  {
    this.bottom_layout = ((PercentRelativeLayout)findViewById(2131689851));
    this.mEndTime = ((TextView)this.bottom_layout.findViewById(2131690209));
    this.mCurrentTime = ((TextView)this.bottom_layout.findViewById(2131690206));
    this.playBtn = ((ImageButton)this.bottom_layout.findViewById(2131690207));
    this.mProgress = ((SeekBar)this.bottom_layout.findViewById(2131690208));
    this.mFormatBuilder = new StringBuilder();
    this.mFormatter = new Formatter(this.mFormatBuilder, Locale.getDefault());
    this.playBtn.setOnClickListener(this);
    this.mProgress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          FermiPlayerActivity.this.bottom_layout.setVisibility(0);
          FermiPlayerActivity.this.top_layout.setVisibility(0);
          FermiPlayerActivity.this.isPause = true;
        }
      }
      
      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {}
      
      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        int i = paramAnonymousSeekBar.getProgress();
        FermiPlayerActivity.this.player.seekTo(i);
        if (FermiPlayerActivity.this.player.isPlaying()) {
          FermiPlayerActivity.this.setProgress();
        }
        for (;;)
        {
          FermiPlayerActivity.this.isPause = false;
          return;
          FermiPlayerActivity.this.preferencesUtil.a(i);
          if (FermiPlayerActivity.this.mCurrentTime != null) {
            FermiPlayerActivity.this.mCurrentTime.setText(FermiPlayerActivity.this.stringForTime(i));
          }
        }
      }
    });
  }
  
  private void initPlay()
  {
    this.player.setDecodeType(1);
    this.player.setVideoPath(this.url);
    this.finishPlay = false;
    this.player.setOnPreparedListener(new IMediaPlayer.OnPreparedListener()
    {
      public void onPrepared(IMediaPlayer paramAnonymousIMediaPlayer)
      {
        FermiPlayerActivity.this.handler.sendEmptyMessageDelayed(2, 500L);
        int i = (int)FermiPlayerActivity.this.preferencesUtil.n();
        FermiPlayerActivity.this.mProgress.setMax(FermiPlayerActivity.this.player.getDuration());
        FermiPlayerActivity.this.player.seekTo(i);
      }
    });
  }
  
  private void play()
  {
    if (!this.player.isPlaying())
    {
      this.player.start();
      this.playBtn.setBackgroundResource(2130837902);
    }
  }
  
  private int setProgress()
  {
    int i;
    if ((this.player == null) || (this.isPause)) {
      i = 0;
    }
    int j;
    do
    {
      return i;
      j = this.player.getCurrentPosition();
      i = this.player.getDuration();
      if (this.mProgress != null) {
        this.mProgress.setProgress(j);
      }
      if (this.mEndTime != null) {
        this.mEndTime.setText(stringForTime(i));
      }
      if ((this.mCurrentTime != null) && (!this.mCurrentTime.getText().toString().equals(this.mEndTime.getText().toString()))) {
        this.mCurrentTime.setText(stringForTime(j));
      }
      i = j;
    } while (j != 0);
    this.mCurrentTime.setText(stringForTime(j));
    return j;
  }
  
  @TargetApi(16)
  private void showVideoThumbnail(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.videoThumbnail.setBackground(s.a(paramBitmap));
      this.videoThumbnail.setVisibility(0);
    }
  }
  
  private String stringForTime(int paramInt)
  {
    int j = paramInt / 1000;
    paramInt = j % 60;
    int i = j / 60 % 60;
    j /= 3600;
    this.mFormatBuilder.setLength(0);
    if (j > 0) {
      return this.mFormatter.format("%d:%02d:%02d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt) }).toString();
    }
    return this.mFormatter.format("%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) }).toString();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689849: 
      finish();
      return;
    case 2131689847: 
      play();
      return;
    }
    if (this.player.isPlaying())
    {
      this.player.pause();
      this.playBtn.setBackgroundResource(2130837898);
      return;
    }
    if (this.finishPlay) {
      initPlay();
    }
    this.player.start();
    this.playBtn.setBackgroundResource(2130837902);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968627);
    initMediaContoller();
    this.videoThumbnail = ((ImageView)findViewById(2131689846));
    this.btnClose = ((ImageButton)getWindow().findViewById(2131689849));
    this.btnClose.setOnClickListener(this);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.url = paramBundle.getStringExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
      this.onlineUrl = paramBundle.getStringExtra("SP_KEY_PLAYER_IS_REMOTE_ADDR_VideoDialogFragment");
    }
    this.preferencesUtil.a(0L);
    this.top_layout = findViewById(2131689848);
    this.mNameText = ((TextView)findViewById(2131689850));
    this.play_start = getIntent().getBooleanExtra("play_start", false);
    this.onlineFile = getIntent().getBooleanExtra("online_file", false);
    int i = this.url.lastIndexOf("/");
    if (i > 1)
    {
      this.mNameText.setText(this.url.substring(i + 1));
      if ((this.onlineUrl == null) || (!new File(this.onlineUrl).exists())) {
        break label300;
      }
    }
    label300:
    for (this.bitmap = BitmapFactory.decodeFile(this.onlineUrl);; this.bitmap = FermiPlayerUtils.createVideoThumbnail(this.url))
    {
      showVideoThumbnail(this.bitmap);
      this.player = ((FimiVideoView)findViewById(2131689845));
      this.player.setOnClickListener(this);
      this.player.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            return true;
            if (FermiPlayerActivity.this.isShow)
            {
              FermiPlayerActivity.this.handler.sendEmptyMessage(3);
            }
            else
            {
              FermiPlayerActivity.this.handler.sendEmptyMessage(2);
              continue;
              FermiPlayerActivity.this.handler.removeMessages(2);
              FermiPlayerActivity.this.handler.removeMessages(3);
              FermiPlayerActivity.this.bottom_layout.setVisibility(0);
              FermiPlayerActivity.this.top_layout.setVisibility(0);
            }
          }
        }
      });
      initPlay();
      this.player.setOnErrorListener(new IMediaPlayer.OnErrorListener()
      {
        public boolean onError(IMediaPlayer paramAnonymousIMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          FermiPlayerActivity.this.player.stopPlayback();
          z.a(FermiPlayerActivity.this, 2131362248);
          FermiPlayerActivity.this.finish();
          return false;
        }
      });
      this.player.setOnCompletionListener(new IMediaPlayer.OnCompletionListener()
      {
        public void onCompletion(IMediaPlayer paramAnonymousIMediaPlayer)
        {
          FermiPlayerActivity.this.player.seekTo(FermiPlayerActivity.this.player.getCurrentPosition());
          FermiPlayerActivity.this.preferencesUtil.a(0L);
          FermiPlayerActivity.this.playBtn.setBackgroundResource(2130837898);
          FermiPlayerActivity.this.player.release(true);
          FermiPlayerActivity.this.finishPlay = true;
        }
      });
      this.thread.start();
      return;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if ((this.bitmap != null) && (!this.bitmap.isRecycled()))
    {
      this.bitmap.recycle();
      Log.d("player", "bitmap recycle");
    }
    this.bitmap = null;
    this.player.release(true);
    this.player = null;
    getIntent().putExtra("play_start", false);
    System.gc();
  }
  
  public void onResume()
  {
    super.onResume();
    this.player.setDecodeType(1);
    this.player.setVideoPath(this.url);
    if (this.play_start) {
      play();
    }
    showVideoThumbnail(this.bitmap);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    this.preferencesUtil.a(this.current_position);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
    this.player.pause();
    this.current_position = this.player.getCurrentPosition();
    this.preferencesUtil.a(this.current_position);
    this.playBtn.setBackgroundResource(2130837898);
    if (!this.onlineFile) {
      this.player.release(true);
    }
    this.play_start = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FermiPlayerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */