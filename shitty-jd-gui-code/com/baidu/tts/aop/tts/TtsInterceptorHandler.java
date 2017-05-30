package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptorHandler;

public class TtsInterceptorHandler
  extends AInterceptorHandler
{
  public void registerMethods()
  {
    registerMethod("speak");
    registerMethod("synthesize");
    registerMethod("setTtsListener");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/aop/tts/TtsInterceptorHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */