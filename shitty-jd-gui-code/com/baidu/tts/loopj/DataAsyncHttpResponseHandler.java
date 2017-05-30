package com.baidu.tts.loopj;

import android.os.Message;

public abstract class DataAsyncHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "DataAsyncHttpRH";
  protected static final int PROGRESS_DATA_MESSAGE = 7;
  
  public static byte[] copyOfRange(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException();
    }
    int i = paramArrayOfByte.length;
    if ((paramInt1 < 0) || (paramInt1 > i)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    paramInt2 -= paramInt1;
    i = Math.min(paramInt2, i - paramInt1);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  /* Error */
  byte[] getResponseData(org.apache.http.HttpEntity paramHttpEntity)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aload 8
    //   5: astore 7
    //   7: aload_1
    //   8: ifnull +162 -> 170
    //   11: aload_1
    //   12: invokeinterface 46 1 0
    //   17: astore 9
    //   19: aload 8
    //   21: astore 7
    //   23: aload 9
    //   25: ifnull +145 -> 170
    //   28: aload_1
    //   29: invokeinterface 50 1 0
    //   34: lstore 5
    //   36: lload 5
    //   38: ldc2_w 51
    //   41: lcmp
    //   42: ifle +13 -> 55
    //   45: new 20	java/lang/IllegalArgumentException
    //   48: dup
    //   49: ldc 54
    //   51: invokespecial 57	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   54: athrow
    //   55: lload 5
    //   57: lstore_3
    //   58: lload 5
    //   60: lconst_0
    //   61: lcmp
    //   62: ifge +7 -> 69
    //   65: ldc2_w 58
    //   68: lstore_3
    //   69: new 61	org/apache/http/util/ByteArrayBuffer
    //   72: dup
    //   73: lload_3
    //   74: l2i
    //   75: invokespecial 64	org/apache/http/util/ByteArrayBuffer:<init>	(I)V
    //   78: astore_1
    //   79: sipush 4096
    //   82: newarray <illegal type>
    //   84: astore 7
    //   86: aload 9
    //   88: aload 7
    //   90: invokevirtual 70	java/io/InputStream:read	([B)I
    //   93: istore_2
    //   94: iload_2
    //   95: iconst_m1
    //   96: if_icmpeq +63 -> 159
    //   99: invokestatic 76	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   102: invokevirtual 80	java/lang/Thread:isInterrupted	()Z
    //   105: ifne +54 -> 159
    //   108: aload_1
    //   109: aload 7
    //   111: iconst_0
    //   112: iload_2
    //   113: invokevirtual 84	org/apache/http/util/ByteArrayBuffer:append	([BII)V
    //   116: aload_0
    //   117: aload 7
    //   119: iconst_0
    //   120: iload_2
    //   121: invokestatic 86	com/baidu/tts/loopj/DataAsyncHttpResponseHandler:copyOfRange	([BII)[B
    //   124: invokevirtual 90	com/baidu/tts/loopj/DataAsyncHttpResponseHandler:sendProgressDataMessage	([B)V
    //   127: aload_0
    //   128: iconst_0
    //   129: i2l
    //   130: lload_3
    //   131: invokevirtual 94	com/baidu/tts/loopj/DataAsyncHttpResponseHandler:sendProgressMessage	(JJ)V
    //   134: goto -48 -> 86
    //   137: astore_1
    //   138: aload 9
    //   140: invokestatic 100	com/baidu/tts/loopj/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   143: aload_1
    //   144: athrow
    //   145: astore_1
    //   146: invokestatic 103	java/lang/System:gc	()V
    //   149: new 105	java/io/IOException
    //   152: dup
    //   153: ldc 107
    //   155: invokespecial 108	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   158: athrow
    //   159: aload 9
    //   161: invokestatic 100	com/baidu/tts/loopj/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   164: aload_1
    //   165: invokevirtual 112	org/apache/http/util/ByteArrayBuffer:toByteArray	()[B
    //   168: astore 7
    //   170: aload 7
    //   172: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	DataAsyncHttpResponseHandler
    //   0	173	1	paramHttpEntity	org.apache.http.HttpEntity
    //   93	28	2	i	int
    //   57	74	3	l1	long
    //   34	25	5	l2	long
    //   5	166	7	localObject1	Object
    //   1	19	8	localObject2	Object
    //   17	143	9	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   79	86	137	finally
    //   86	94	137	finally
    //   99	134	137	finally
    //   69	79	145	java/lang/OutOfMemoryError
    //   138	145	145	java/lang/OutOfMemoryError
    //   159	170	145	java/lang/OutOfMemoryError
  }
  
  protected void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    paramMessage = (Object[])paramMessage.obj;
    if ((paramMessage != null) && (paramMessage.length >= 1)) {
      try
      {
        onProgressData((byte[])paramMessage[0]);
        return;
      }
      catch (Throwable paramMessage)
      {
        AsyncHttpClient.log.e("DataAsyncHttpRH", "custom onProgressData contains an error", paramMessage);
        return;
      }
    }
    AsyncHttpClient.log.e("DataAsyncHttpRH", "PROGRESS_DATA_MESSAGE didn't got enough params");
  }
  
  public void onProgressData(byte[] paramArrayOfByte)
  {
    AsyncHttpClient.log.d("DataAsyncHttpRH", "onProgressData(byte[]) was not overriden, but callback was received");
  }
  
  public final void sendProgressDataMessage(byte[] paramArrayOfByte)
  {
    sendMessage(obtainMessage(7, new Object[] { paramArrayOfByte }));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/loopj/DataAsyncHttpResponseHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */