package com.facebook.rebound;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AnimationQueue
{
  private final Queue<Double> mAnimationQueue = new LinkedList();
  private final List<Callback> mCallbacks = new ArrayList();
  private final ChoreographerCompat mChoreographer = ChoreographerCompat.getInstance();
  private final ChoreographerCompat.FrameCallback mChoreographerCallback = new ChoreographerCompat.FrameCallback()
  {
    public void doFrame(long paramAnonymousLong)
    {
      AnimationQueue.this.onFrame(paramAnonymousLong);
    }
  };
  private final Queue<Double> mPendingQueue = new LinkedList();
  private boolean mRunning;
  private final ArrayList<Double> mTempValues = new ArrayList();
  
  private void onFrame(long paramLong)
  {
    Double localDouble = (Double)this.mPendingQueue.poll();
    if (localDouble != null) {
      this.mAnimationQueue.offer(localDouble);
    }
    for (int i = 0;; i = Math.max(this.mCallbacks.size() - this.mAnimationQueue.size(), 0))
    {
      this.mTempValues.addAll(this.mAnimationQueue);
      int j = this.mTempValues.size() - 1;
      while (j > -1)
      {
        localDouble = (Double)this.mTempValues.get(j);
        int k = this.mTempValues.size() - 1 - j + i;
        if (this.mCallbacks.size() > k) {
          ((Callback)this.mCallbacks.get(k)).onFrame(localDouble);
        }
        j -= 1;
      }
    }
    this.mTempValues.clear();
    while (this.mAnimationQueue.size() + i >= this.mCallbacks.size()) {
      this.mAnimationQueue.poll();
    }
    if ((this.mAnimationQueue.isEmpty()) && (this.mPendingQueue.isEmpty()))
    {
      this.mRunning = false;
      return;
    }
    this.mChoreographer.postFrameCallback(this.mChoreographerCallback);
  }
  
  private void runIfIdle()
  {
    if (!this.mRunning)
    {
      this.mRunning = true;
      this.mChoreographer.postFrameCallback(this.mChoreographerCallback);
    }
  }
  
  public void addAllValues(Collection<Double> paramCollection)
  {
    this.mPendingQueue.addAll(paramCollection);
    runIfIdle();
  }
  
  public void addCallback(Callback paramCallback)
  {
    this.mCallbacks.add(paramCallback);
  }
  
  public void addValue(Double paramDouble)
  {
    this.mPendingQueue.add(paramDouble);
    runIfIdle();
  }
  
  public void clearCallbacks()
  {
    this.mCallbacks.clear();
  }
  
  public void clearValues()
  {
    this.mPendingQueue.clear();
  }
  
  public void removeCallback(Callback paramCallback)
  {
    this.mCallbacks.remove(paramCallback);
  }
  
  public static abstract interface Callback
  {
    public abstract void onFrame(Double paramDouble);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/AnimationQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */