package com.facebook.rebound;

public class SynchronousLooper
  extends SpringLooper
{
  public static double SIXTY_FPS = 16.6667D;
  private boolean mRunning;
  private double mTimeStep = SIXTY_FPS;
  
  public double getTimeStep()
  {
    return this.mTimeStep;
  }
  
  public void setTimeStep(double paramDouble)
  {
    this.mTimeStep = paramDouble;
  }
  
  public void start()
  {
    this.mRunning = true;
    for (;;)
    {
      if ((this.mSpringSystem.getIsIdle()) || (!this.mRunning)) {
        return;
      }
      this.mSpringSystem.loop(this.mTimeStep);
    }
  }
  
  public void stop()
  {
    this.mRunning = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SynchronousLooper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */