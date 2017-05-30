package com.baidu.tts.a.a;

import android.util.Log;
import com.baidu.speechsynthesizer.utility.SpeechDecoder;
import com.baidu.tts.tools.CommonUtility;

public class b
  implements c<byte[], byte[]>
{
  public void a() {}
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[0];
    short[] arrayOfShort = new short[i * 50 / 2];
    int[] arrayOfInt = new int[1];
    try
    {
      if (new SpeechDecoder().decode(paramArrayOfByte, i, arrayOfShort, arrayOfInt, i * 50, 0) != 0)
      {
        Log.e("AudioDecoderAdapter", "ret != 0");
        return arrayOfByte;
      }
      i = arrayOfInt[0] / 2;
      paramArrayOfByte = new short[i];
      System.arraycopy(arrayOfShort, 0, paramArrayOfByte, 0, i);
      paramArrayOfByte = CommonUtility.shortArrayToByteArray(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return arrayOfByte;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */