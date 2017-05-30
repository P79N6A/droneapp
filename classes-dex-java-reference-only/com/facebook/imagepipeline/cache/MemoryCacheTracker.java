package com.facebook.imagepipeline.cache;

public abstract interface MemoryCacheTracker
{
  public abstract void onCacheHit();
  
  public abstract void onCacheMiss();
  
  public abstract void onCachePut();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/cache/MemoryCacheTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */