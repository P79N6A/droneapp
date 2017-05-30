package com.facebook.common.soloader;

public class SoLoaderShim
{
  private static volatile Handler sHandler = new DefaultHandler();
  
  public static void loadLibrary(String paramString)
  {
    sHandler.loadLibrary(paramString);
  }
  
  public static void setHandler(Handler paramHandler)
  {
    if (paramHandler == null) {
      throw new NullPointerException("Handler cannot be null");
    }
    sHandler = paramHandler;
  }
  
  public static void setInTestMode()
  {
    setHandler(new Handler()
    {
      public void loadLibrary(String paramAnonymousString) {}
    });
  }
  
  public static class DefaultHandler
    implements SoLoaderShim.Handler
  {
    public void loadLibrary(String paramString)
    {
      System.loadLibrary(paramString);
    }
  }
  
  public static abstract interface Handler
  {
    public abstract void loadLibrary(String paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/soloader/SoLoaderShim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */