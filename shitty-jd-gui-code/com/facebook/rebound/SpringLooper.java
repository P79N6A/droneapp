package com.facebook.rebound;

public abstract class SpringLooper
{
  protected BaseSpringSystem mSpringSystem;
  
  public void setSpringSystem(BaseSpringSystem paramBaseSpringSystem)
  {
    this.mSpringSystem = paramBaseSpringSystem;
  }
  
  public abstract void start();
  
  public abstract void stop();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringLooper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */