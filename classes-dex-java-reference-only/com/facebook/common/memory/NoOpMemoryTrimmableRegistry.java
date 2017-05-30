package com.facebook.common.memory;

public class NoOpMemoryTrimmableRegistry
  implements MemoryTrimmableRegistry
{
  private static NoOpMemoryTrimmableRegistry sInstance = null;
  
  public static NoOpMemoryTrimmableRegistry getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new NoOpMemoryTrimmableRegistry();
      }
      NoOpMemoryTrimmableRegistry localNoOpMemoryTrimmableRegistry = sInstance;
      return localNoOpMemoryTrimmableRegistry;
    }
    finally {}
  }
  
  public void registerMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable) {}
  
  public void unregisterMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/memory/NoOpMemoryTrimmableRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */