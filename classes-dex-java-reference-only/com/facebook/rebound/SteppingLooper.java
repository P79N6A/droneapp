package com.facebook.rebound;

public class SteppingLooper
  extends SpringLooper
{
  private long mLastTime;
  private boolean mStarted;
  
  public void start()
  {
    this.mStarted = true;
    this.mLastTime = 0L;
  }
  
  public boolean step(long paramLong)
  {
    if ((this.mSpringSystem == null) || (!this.mStarted)) {
      return false;
    }
    paramLong = this.mLastTime + paramLong;
    this.mSpringSystem.loop(paramLong);
    this.mLastTime = paramLong;
    return this.mSpringSystem.getIsIdle();
  }
  
  public void stop()
  {
    this.mStarted = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SteppingLooper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */