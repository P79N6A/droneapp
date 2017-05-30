package com.baidu.tts.tools;

import java.lang.reflect.Method;

public class ReflectTool
{
  public static Method getSupportedMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    if (paramClass == null) {
      throw new NoSuchMethodException();
    }
    try
    {
      Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return getSupportedMethod(paramClass.getSuperclass(), paramString, paramArrayOfClass);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/tools/ReflectTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */