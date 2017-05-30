package com.baidu.tts.client;

public class SpeechError
{
  public int code;
  public String description;
  
  public String toString()
  {
    return "(" + this.code + ")" + this.description;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/client/SpeechError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */