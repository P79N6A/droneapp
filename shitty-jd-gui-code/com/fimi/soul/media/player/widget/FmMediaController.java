package com.fimi.soul.media.player.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Formatter;
import java.util.Locale;

public class FmMediaController
  extends FrameLayout
{
  private static final int FADE_OUT = 1;
  private static final int SHOW_PROGRESS = 2;
  private static final int sDefaultTimeout = 3000;
  private static final int updatePause = 0;
  private View mAnchor;
  private Context mContext;
  private TextView mCurrentTime;
  private View mDecor;
  private WindowManager.LayoutParams mDecorLayoutParams;
  private boolean mDragging;
  private TextView mEndTime;
  private ImageButton mFfwdButton;
  private View.OnClickListener mFfwdListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      int i = FmMediaController.this.mPlayer.getCurrentPosition();
      FmMediaController.this.mPlayer.seekTo(i + 15000);
      FmMediaController.this.setProgress();
      FmMediaController.this.show(3000);
    }
  };
  StringBuilder mFormatBuilder;
  Formatter mFormatter;
  private boolean mFromXml;
  private Handler mHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
      case 1: 
      case 2: 
        int i;
        do
        {
          return;
          FmMediaController.this.hide();
          return;
          Log.d("player", "handle SHOW_PROGRESS");
          i = FmMediaController.this.setProgress();
        } while ((FmMediaController.this.mDragging) || (!FmMediaController.this.mShowing) || (!FmMediaController.this.mPlayer.isPlaying()));
        sendMessageDelayed(obtainMessage(2), 1000 - i % 1000);
        return;
      }
      if (FmMediaController.this.mPlayer.isPlaying())
      {
        FmMediaController.this.mPauseButton.setBackgroundResource(2130837902);
        return;
      }
      FmMediaController.this.mPauseButton.setBackgroundResource(2130837898);
    }
  };
  private View.OnLayoutChangeListener mLayoutChangeListener = new View.OnLayoutChangeListener()
  {
    public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
    {
      FmMediaController.this.updateFloatingWindowLayout();
      if (FmMediaController.this.mShowing) {
        FmMediaController.this.mWindowManager.updateViewLayout(FmMediaController.this.mDecor, FmMediaController.this.mDecorLayoutParams);
      }
    }
  };
  private boolean mListenersSet;
  private ImageButton mNextButton;
  private View.OnClickListener mNextListener;
  private ImageButton mPauseButton;
  private View.OnClickListener mPauseListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      FmMediaController.this.doPauseResume();
      FmMediaController.this.show(3000);
    }
  };
  private MediaPlayerControl mPlayer;
  private ImageButton mPrevButton;
  private View.OnClickListener mPrevListener;
  private SeekBar mProgress;
  private ImageButton mRewButton;
  private View.OnClickListener mRewListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      int i = FmMediaController.this.mPlayer.getCurrentPosition();
      FmMediaController.this.mPlayer.seekTo(i - 5000);
      FmMediaController.this.setProgress();
      FmMediaController.this.show(3000);
    }
  };
  private View mRoot;
  private SeekBar.OnSeekBarChangeListener mSeekListener = new SeekBar.OnSeekBarChangeListener()
  {
    public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
    {
      Log.d("player", "onProgressChanged");
      if (!paramAnonymousBoolean) {}
      long l;
      do
      {
        return;
        l = FmMediaController.this.mPlayer.getDuration() * paramAnonymousInt / 1000L;
        FmMediaController.this.mPlayer.seekTo((int)l);
      } while (FmMediaController.this.mCurrentTime == null);
      FmMediaController.this.mCurrentTime.setText(FmMediaController.this.stringForTime((int)l));
    }
    
    public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
    {
      Log.d("player", "onStartTrackingTouch");
      FmMediaController.this.show(3600000);
      FmMediaController.access$602(FmMediaController.this, true);
      FmMediaController.this.mHandler.removeMessages(2);
    }
    
    public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
    {
      Log.d("player", "onStopTrackingTouch");
      FmMediaController.access$602(FmMediaController.this, false);
      FmMediaController.this.setProgress();
      FmMediaController.this.updatePausePlay();
      FmMediaController.this.show(3000);
      FmMediaController.this.mHandler.sendEmptyMessage(2);
    }
  };
  private boolean mShowing;
  private View.OnTouchListener mTouchListener = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if ((paramAnonymousMotionEvent.getAction() == 0) && (FmMediaController.this.mShowing)) {
        FmMediaController.this.hide();
      }
      return false;
    }
  };
  private boolean mUseFastForward;
  private Window mWindow;
  private WindowManager mWindowManager;
  
  public FmMediaController(Context paramContext)
  {
    this(paramContext, true);
  }
  
  public FmMediaController(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mRoot = this;
    this.mContext = paramContext;
    this.mUseFastForward = true;
    this.mFromXml = true;
  }
  
  public FmMediaController(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mUseFastForward = paramBoolean;
    initFloatingWindowLayout();
    initFloatingWindow();
  }
  
  private void disableUnsupportedButtons()
  {
    try
    {
      if ((this.mPauseButton != null) && (!this.mPlayer.canPause())) {
        this.mPauseButton.setEnabled(false);
      }
      if ((this.mRewButton != null) && (!this.mPlayer.canSeekBackward())) {
        this.mRewButton.setEnabled(false);
      }
      if ((this.mFfwdButton != null) && (!this.mPlayer.canSeekForward())) {
        this.mFfwdButton.setEnabled(false);
      }
      return;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError) {}
  }
  
  private void doPauseResume()
  {
    if (this.mPlayer.isPlaying()) {
      this.mPlayer.pause();
    }
    for (;;)
    {
      updatePausePlay();
      return;
      this.mPlayer.start();
    }
  }
  
  private void initControllerView(View paramView)
  {
    this.mPauseButton = ((ImageButton)paramView.findViewById(2131690207));
    if (this.mPauseButton != null)
    {
      this.mPauseButton.requestFocus();
      this.mPauseButton.setOnClickListener(this.mPauseListener);
    }
    this.mFfwdButton = ((ImageButton)paramView.findViewById(2131690203));
    ImageButton localImageButton;
    if (this.mFfwdButton != null)
    {
      this.mFfwdButton.setOnClickListener(this.mFfwdListener);
      if (!this.mFromXml)
      {
        localImageButton = this.mFfwdButton;
        if (!this.mUseFastForward) {
          break label383;
        }
        i = 0;
        localImageButton.setVisibility(i);
      }
    }
    this.mRewButton = ((ImageButton)paramView.findViewById(2131690202));
    if (this.mRewButton != null)
    {
      this.mRewButton.setOnClickListener(this.mRewListener);
      if (!this.mFromXml)
      {
        localImageButton = this.mRewButton;
        if (!this.mUseFastForward) {
          break label389;
        }
      }
    }
    label383:
    label389:
    for (int i = 0;; i = 8)
    {
      localImageButton.setVisibility(i);
      this.mNextButton = ((ImageButton)paramView.findViewById(2131690204));
      if ((this.mNextButton != null) && (!this.mFromXml) && (!this.mListenersSet)) {
        this.mNextButton.setVisibility(8);
      }
      this.mPrevButton = ((ImageButton)paramView.findViewById(2131690201));
      if ((this.mPrevButton != null) && (!this.mFromXml) && (!this.mListenersSet)) {
        this.mPrevButton.setVisibility(8);
      }
      this.mProgress = ((SeekBar)paramView.findViewById(2131690208));
      if (this.mProgress != null)
      {
        if ((this.mProgress instanceof SeekBar)) {
          this.mProgress.setOnSeekBarChangeListener(this.mSeekListener);
        }
        this.mProgress.setMax(1000);
      }
      this.mEndTime = ((TextView)paramView.findViewById(2131690209));
      this.mCurrentTime = ((TextView)paramView.findViewById(2131690206));
      this.mFormatBuilder = new StringBuilder();
      this.mFormatter = new Formatter(this.mFormatBuilder, Locale.getDefault());
      ao.a(((Activity)this.mContext).getAssets(), new View[] { this.mEndTime, this.mCurrentTime });
      installPrevNextListeners();
      return;
      i = 8;
      break;
    }
  }
  
  private void initFloatingWindow()
  {
    this.mWindowManager = ((WindowManager)this.mContext.getSystemService("window"));
    initWindow();
    this.mWindow.setWindowManager(this.mWindowManager, null, null);
    this.mWindow.requestFeature(1);
    this.mDecor = this.mWindow.getDecorView();
    this.mDecor.setOnTouchListener(this.mTouchListener);
    this.mWindow.setContentView(this);
    this.mWindow.setBackgroundDrawableResource(17170445);
    this.mWindow.setVolumeControlStream(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    setDescendantFocusability(262144);
    requestFocus();
  }
  
  private void initFloatingWindowLayout()
  {
    this.mDecorLayoutParams = new WindowManager.LayoutParams();
    WindowManager.LayoutParams localLayoutParams = this.mDecorLayoutParams;
    localLayoutParams.gravity = 51;
    localLayoutParams.height = -2;
    localLayoutParams.x = 0;
    localLayoutParams.format = -3;
    localLayoutParams.type = 1000;
    localLayoutParams.flags |= 0x820020;
    localLayoutParams.token = null;
    localLayoutParams.windowAnimations = 0;
  }
  
  private void initWindow()
  {
    for (;;)
    {
      int i;
      try
      {
        Method[] arrayOfMethod = Class.forName("com.android.internal.policy.PolicyManager").getMethods();
        Method localMethod = null;
        i = 0;
        if (i < arrayOfMethod.length)
        {
          if (arrayOfMethod[i].getName().endsWith("makeNewWindow")) {
            localMethod = arrayOfMethod[i];
          }
        }
        else
        {
          this.mWindow = ((Window)localMethod.invoke(null, new Object[] { this.mContext }));
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      i += 1;
    }
  }
  
  private void installPrevNextListeners()
  {
    boolean bool2 = true;
    ImageButton localImageButton;
    if (this.mNextButton != null)
    {
      this.mNextButton.setOnClickListener(this.mNextListener);
      localImageButton = this.mNextButton;
      if (this.mNextListener != null)
      {
        bool1 = true;
        localImageButton.setEnabled(bool1);
      }
    }
    else if (this.mPrevButton != null)
    {
      this.mPrevButton.setOnClickListener(this.mPrevListener);
      localImageButton = this.mPrevButton;
      if (this.mPrevListener == null) {
        break label82;
      }
    }
    label82:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localImageButton.setEnabled(bool1);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static void main(String[] paramArrayOfString)
  {
    System.out.println(9);
  }
  
  private int setProgress()
  {
    Log.d("player", "setProgress");
    if ((this.mPlayer == null) || (this.mDragging))
    {
      i = 0;
      return i;
    }
    int j = this.mPlayer.getCurrentPosition();
    int i = this.mPlayer.getDuration();
    Log.d("player", "position" + j + " duration" + i);
    if ((this.mProgress != null) && (i > 0))
    {
      if (i / 1000 <= 0) {
        break label219;
      }
      long l = 1000L * (j / 1000) / (i / 1000);
      this.mProgress.setProgress((int)l);
    }
    for (;;)
    {
      if (this.mEndTime != null) {
        this.mEndTime.setText(stringForTime(i));
      }
      if ((this.mCurrentTime != null) && (!this.mCurrentTime.getText().toString().equals(this.mEndTime.getText().toString()))) {
        this.mCurrentTime.setText(stringForTime(j));
      }
      i = j;
      if (j != 0) {
        break;
      }
      this.mCurrentTime.setText(stringForTime(j));
      return j;
      label219:
      this.mProgress.setProgress(0);
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
  
  private void updateFloatingWindowLayout()
  {
    int[] arrayOfInt = new int[2];
    this.mAnchor.getLocationOnScreen(arrayOfInt);
    this.mDecor.measure(View.MeasureSpec.makeMeasureSpec(this.mAnchor.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.mAnchor.getHeight(), Integer.MIN_VALUE));
    WindowManager.LayoutParams localLayoutParams = this.mDecorLayoutParams;
    localLayoutParams.width = this.mAnchor.getWidth();
    localLayoutParams.x = (arrayOfInt[0] + (this.mAnchor.getWidth() - localLayoutParams.width) / 2);
    localLayoutParams.y = (arrayOfInt[1] + this.mAnchor.getHeight() - this.mDecor.getMeasuredHeight());
  }
  
  private void updatePausePlay()
  {
    if ((this.mRoot == null) || (this.mPauseButton == null)) {
      return;
    }
    if (this.mPlayer.isPlaying()) {
      this.mPauseButton.setBackgroundResource(2130837902);
    }
    for (;;)
    {
      this.mHandler.sendEmptyMessageDelayed(0, 200L);
      return;
      this.mPauseButton.setBackgroundResource(2130837898);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int j = paramKeyEvent.getKeyCode();
    if ((paramKeyEvent.getRepeatCount() == 0) && (paramKeyEvent.getAction() == 0)) {}
    for (int i = 1; (j == 79) || (j == 85) || (j == 62); i = 0)
    {
      if (i != 0)
      {
        doPauseResume();
        show(3000);
        if (this.mPauseButton != null) {
          this.mPauseButton.requestFocus();
        }
      }
      return true;
    }
    if (j == 126)
    {
      if ((i != 0) && (!this.mPlayer.isPlaying()))
      {
        this.mPlayer.start();
        updatePausePlay();
        show(3000);
      }
      return true;
    }
    if ((j == 86) || (j == 127))
    {
      if ((i != 0) && (this.mPlayer.isPlaying()))
      {
        this.mPlayer.pause();
        updatePausePlay();
        show(3000);
      }
      return true;
    }
    if ((j == 25) || (j == 24) || (j == 164) || (j == 27)) {
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    if (j == 4)
    {
      if (i != 0)
      {
        hide();
        ((Activity)this.mContext).finish();
      }
      return true;
    }
    if (j == 82)
    {
      if (i != 0) {
        hide();
      }
      return true;
    }
    show(3000);
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void hide()
  {
    if (this.mAnchor == null) {}
    while (!this.mShowing) {
      return;
    }
    try
    {
      this.mHandler.removeMessages(2);
      this.mWindowManager.removeView(this.mDecor);
      this.mShowing = false;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Log.w("MediaController", "already removed");
      }
    }
  }
  
  public boolean isShowing()
  {
    return this.mShowing;
  }
  
  protected View makeControllerView()
  {
    this.mRoot = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130968684, null);
    initControllerView(this.mRoot);
    return this.mRoot;
  }
  
  public void onFinishInflate()
  {
    if (this.mRoot != null) {
      initControllerView(this.mRoot);
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(FmMediaController.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(FmMediaController.class.getName());
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    show(3000);
    return true;
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    show(3000);
    return false;
  }
  
  public void setAnchorView(View paramView)
  {
    if (this.mAnchor != null) {
      this.mAnchor.removeOnLayoutChangeListener(this.mLayoutChangeListener);
    }
    this.mAnchor = paramView;
    if (this.mAnchor != null) {
      this.mAnchor.addOnLayoutChangeListener(this.mLayoutChangeListener);
    }
    paramView = new FrameLayout.LayoutParams(-1, -1);
    removeAllViews();
    addView(makeControllerView(), paramView);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    boolean bool2 = true;
    if (this.mPauseButton != null) {
      this.mPauseButton.setEnabled(paramBoolean);
    }
    if (this.mFfwdButton != null) {
      this.mFfwdButton.setEnabled(paramBoolean);
    }
    if (this.mRewButton != null) {
      this.mRewButton.setEnabled(paramBoolean);
    }
    ImageButton localImageButton;
    if (this.mNextButton != null)
    {
      localImageButton = this.mNextButton;
      if ((paramBoolean) && (this.mNextListener != null))
      {
        bool1 = true;
        localImageButton.setEnabled(bool1);
      }
    }
    else if (this.mPrevButton != null)
    {
      localImageButton = this.mPrevButton;
      if ((!paramBoolean) || (this.mPrevListener == null)) {
        break label141;
      }
    }
    label141:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localImageButton.setEnabled(bool1);
      if (this.mProgress != null) {
        this.mProgress.setEnabled(paramBoolean);
      }
      disableUnsupportedButtons();
      super.setEnabled(paramBoolean);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void setMediaPlayer(MediaPlayerControl paramMediaPlayerControl)
  {
    this.mPlayer = paramMediaPlayerControl;
    updatePausePlay();
  }
  
  public void setPrevNextListeners(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    this.mNextListener = paramOnClickListener1;
    this.mPrevListener = paramOnClickListener2;
    this.mListenersSet = true;
    if (this.mRoot != null)
    {
      installPrevNextListeners();
      if ((this.mNextButton != null) && (!this.mFromXml)) {
        this.mNextButton.setVisibility(0);
      }
      if ((this.mPrevButton != null) && (!this.mFromXml)) {
        this.mPrevButton.setVisibility(0);
      }
    }
  }
  
  public void show()
  {
    show(3000);
  }
  
  public void show(int paramInt)
  {
    Log.d("player", "show");
    if ((!this.mShowing) && (this.mAnchor != null))
    {
      setProgress();
      if (this.mPauseButton != null) {
        this.mPauseButton.requestFocus();
      }
      disableUnsupportedButtons();
      updateFloatingWindowLayout();
    }
    try
    {
      this.mWindowManager.addView(this.mDecor, this.mDecorLayoutParams);
      this.mShowing = true;
      updatePausePlay();
      this.mHandler.sendEmptyMessage(2);
      Message localMessage = this.mHandler.obtainMessage(1);
      if (paramInt != 0)
      {
        this.mHandler.removeMessages(1);
        this.mHandler.sendMessageDelayed(localMessage, paramInt);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("player", "mWindowManager addview error");
      }
    }
  }
  
  public void update()
  {
    updatePausePlay();
  }
  
  public static abstract interface MediaPlayerControl
  {
    public abstract boolean canPause();
    
    public abstract boolean canSeekBackward();
    
    public abstract boolean canSeekForward();
    
    public abstract int getAudioSessionId();
    
    public abstract int getBufferPercentage();
    
    public abstract int getCurrentPosition();
    
    public abstract int getDuration();
    
    public abstract boolean isPlaying();
    
    public abstract void pause();
    
    public abstract void seekTo(int paramInt);
    
    public abstract void start();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/FmMediaController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */