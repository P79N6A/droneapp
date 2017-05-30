package com.baidu.tts.client;

import com.baidu.tts.f.m;

public enum TtsMode
{
  private final m a;
  
  private TtsMode(m paramm)
  {
    this.a = paramm;
  }
  
  public String getDescription()
  {
    return this.a.b();
  }
  
  public int getMode()
  {
    return this.a.a();
  }
  
  public m getTtsEnum()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/client/TtsMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */