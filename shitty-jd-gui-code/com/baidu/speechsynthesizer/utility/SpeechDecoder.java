package com.baidu.speechsynthesizer.utility;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;

public class SpeechDecoder
{
  static
  {
    try
    {
      LoggerProxy.d("SpeechDecoder", "before load gnustl_shared");
      System.loadLibrary("gnustl_shared");
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        try
        {
          LoggerProxy.d("SpeechDecoder", "before load BDSpeechDecoder_V1");
          System.loadLibrary("BDSpeechDecoder_V1");
          LoggerProxy.d("SpeechDecoder", "after load BDSpeechDecoder_V1");
          return;
        }
        catch (Throwable localThrowable2)
        {
          LoggerProxy.e("SpeechDecoder", "so file BDSpeechDecoder_V1 load fail");
        }
        localThrowable1 = localThrowable1;
        LoggerProxy.e("SpeechDecoder", "so file gnustl_shared load fail");
      }
    }
  }
  
  public native int decode(byte[] paramArrayOfByte, int paramInt1, short[] paramArrayOfShort, int[] paramArrayOfInt, int paramInt2, int paramInt3);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/speechsynthesizer/utility/SpeechDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */