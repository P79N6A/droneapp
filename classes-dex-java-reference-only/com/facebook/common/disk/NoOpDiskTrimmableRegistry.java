package com.facebook.common.disk;

public class NoOpDiskTrimmableRegistry
  implements DiskTrimmableRegistry
{
  private static NoOpDiskTrimmableRegistry sInstance = null;
  
  public static NoOpDiskTrimmableRegistry getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new NoOpDiskTrimmableRegistry();
      }
      NoOpDiskTrimmableRegistry localNoOpDiskTrimmableRegistry = sInstance;
      return localNoOpDiskTrimmableRegistry;
    }
    finally {}
  }
  
  public void registerDiskTrimmable(DiskTrimmable paramDiskTrimmable) {}
  
  public void unregisterDiskTrimmable(DiskTrimmable paramDiskTrimmable) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/disk/NoOpDiskTrimmableRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */