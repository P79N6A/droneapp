package com.baidu.tts.loopj;

class Utils
{
  public static void asserts(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean) {
      throw new AssertionError(paramString);
    }
  }
  
  public static <T> T notNull(T paramT, String paramString)
  {
    if (paramT == null) {
      throw new IllegalArgumentException(paramString + " should not be null!");
    }
    return paramT;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/loopj/Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */