package com.facebook.rebound;

public abstract interface SpringListener
{
  public abstract void onSpringActivate(Spring paramSpring);
  
  public abstract void onSpringAtRest(Spring paramSpring);
  
  public abstract void onSpringEndStateChange(Spring paramSpring);
  
  public abstract void onSpringUpdate(Spring paramSpring);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */