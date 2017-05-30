package com.facebook.cache.common;

public abstract interface CacheKey
{
  public abstract boolean equals(Object paramObject);
  
  public abstract int hashCode();
  
  public abstract String toString();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/cache/common/CacheKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */