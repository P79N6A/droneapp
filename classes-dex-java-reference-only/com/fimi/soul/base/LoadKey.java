package com.fimi.soul.base;

public class LoadKey
{
  static
  {
    System.loadLibrary("key-service-jni");
  }
  
  public static native String getKeyToken();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/LoadKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */