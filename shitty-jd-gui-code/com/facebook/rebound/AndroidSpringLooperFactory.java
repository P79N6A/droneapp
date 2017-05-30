package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

abstract class AndroidSpringLooperFactory
{
  public static SpringLooper createSpringLooper()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return ChoreographerAndroidSpringLooper.create();
    }
    return LegacyAndroidSpringLooper.create();
  }
  
  @TargetApi(16)
  private static class ChoreographerAndroidSpringLooper
    extends SpringLooper
  {
    private final Choreographer mChoreographer;
    private final Choreographer.FrameCallback mFrameCallback;
    private long mLastTime;
    private boolean mStarted;
    
    public ChoreographerAndroidSpringLooper(Choreographer paramChoreographer)
    {
      this.mChoreographer = paramChoreographer;
      this.mFrameCallback = new Choreographer.FrameCallback()
      {
        public void doFrame(long paramAnonymousLong)
        {
          if ((!AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mStarted) || (AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mSpringSystem == null)) {
            return;
          }
          paramAnonymousLong = SystemClock.uptimeMillis();
          AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mSpringSystem.loop(paramAnonymousLong - AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mLastTime);
          AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.access$502(AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this, paramAnonymousLong);
          AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mChoreographer.postFrameCallback(AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.this.mFrameCallback);
        }
      };
    }
    
    public static ChoreographerAndroidSpringLooper create()
    {
      return new ChoreographerAndroidSpringLooper(Choreographer.getInstance());
    }
    
    public void start()
    {
      if (this.mStarted) {
        return;
      }
      this.mStarted = true;
      this.mLastTime = SystemClock.uptimeMillis();
      this.mChoreographer.removeFrameCallback(this.mFrameCallback);
      this.mChoreographer.postFrameCallback(this.mFrameCallback);
    }
    
    public void stop()
    {
      this.mStarted = false;
      this.mChoreographer.removeFrameCallback(this.mFrameCallback);
    }
  }
  
  private static class LegacyAndroidSpringLooper
    extends SpringLooper
  {
    private final Handler mHandler;
    private long mLastTime;
    private final Runnable mLooperRunnable;
    private boolean mStarted;
    
    public LegacyAndroidSpringLooper(Handler paramHandler)
    {
      this.mHandler = paramHandler;
      this.mLooperRunnable = new Runnable()
      {
        public void run()
        {
          if ((!AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mStarted) || (AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mSpringSystem == null)) {
            return;
          }
          long l = SystemClock.uptimeMillis();
          AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mSpringSystem.loop(l - AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mLastTime);
          AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mHandler.post(AndroidSpringLooperFactory.LegacyAndroidSpringLooper.this.mLooperRunnable);
        }
      };
    }
    
    public static SpringLooper create()
    {
      return new LegacyAndroidSpringLooper(new Handler());
    }
    
    public void start()
    {
      if (this.mStarted) {
        return;
      }
      this.mStarted = true;
      this.mLastTime = SystemClock.uptimeMillis();
      this.mHandler.removeCallbacks(this.mLooperRunnable);
      this.mHandler.post(this.mLooperRunnable);
    }
    
    public void stop()
    {
      this.mStarted = false;
      this.mHandler.removeCallbacks(this.mLooperRunnable);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/AndroidSpringLooperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */