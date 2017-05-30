package com.fimi.soul.utils;

public class GPointUtil
{
  static
  {
    System.loadLibrary("chineseshit");
  }
  
  public static native double[] transformFromGCJToWGS(double paramDouble1, double paramDouble2);
  
  public static native double[] transformFromWGSToGCJ(double paramDouble1, double paramDouble2);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/GPointUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */