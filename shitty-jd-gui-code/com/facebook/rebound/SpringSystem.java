package com.facebook.rebound;

public class SpringSystem
  extends BaseSpringSystem
{
  private SpringSystem(SpringLooper paramSpringLooper)
  {
    super(paramSpringLooper);
  }
  
  public static SpringSystem create()
  {
    return new SpringSystem(AndroidSpringLooperFactory.createSpringLooper());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */