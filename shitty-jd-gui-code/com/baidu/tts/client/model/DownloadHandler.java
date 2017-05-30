package com.baidu.tts.client.model;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.d.b;
import com.baidu.tts.d.b.d;
import java.util.UUID;
import java.util.concurrent.Future;

public class DownloadHandler
{
  public static final int DOWNLOAD_SUCCESS = 0;
  private b a;
  private Future<com.baidu.tts.d.a> b;
  private TtsError c;
  private com.baidu.tts.d.b.a d = com.baidu.tts.d.b.a.a();
  private volatile boolean e = false;
  private com.baidu.tts.l.a f;
  private RecordData g = null;
  private String h = UUID.randomUUID().toString();
  
  public DownloadHandler(com.baidu.tts.l.a parama)
  {
    this.f = parama;
  }
  
  private OnDownloadListener a()
  {
    return this.a.c();
  }
  
  /* Error */
  private void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 65	com/baidu/tts/client/model/RecordData
    //   4: dup
    //   5: aload_0
    //   6: getfield 54	com/baidu/tts/client/model/DownloadHandler:f	Lcom/baidu/tts/l/a;
    //   9: invokespecial 67	com/baidu/tts/client/model/RecordData:<init>	(Lcom/baidu/tts/l/a;)V
    //   12: putfield 40	com/baidu/tts/client/model/DownloadHandler:g	Lcom/baidu/tts/client/model/RecordData;
    //   15: aload_0
    //   16: monitorenter
    //   17: getstatic 72	com/baidu/tts/client/model/Statistics:isStatistics	Z
    //   20: ifeq +38 -> 58
    //   23: new 74	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   30: invokestatic 81	java/lang/System:currentTimeMillis	()J
    //   33: invokevirtual 85	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   36: ldc 87
    //   38: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore_2
    //   45: aload_0
    //   46: getfield 40	com/baidu/tts/client/model/DownloadHandler:g	Lcom/baidu/tts/client/model/RecordData;
    //   49: aload_0
    //   50: getfield 52	com/baidu/tts/client/model/DownloadHandler:h	Ljava/lang/String;
    //   53: aload_1
    //   54: aload_2
    //   55: invokevirtual 95	com/baidu/tts/client/model/RecordData:setStartInfo	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_0
    //   61: invokespecial 97	com/baidu/tts/client/model/DownloadHandler:a	()Lcom/baidu/tts/client/model/OnDownloadListener;
    //   64: astore_2
    //   65: aload_2
    //   66: ifnull +21 -> 87
    //   69: aload_0
    //   70: monitorenter
    //   71: aload_0
    //   72: getfield 38	com/baidu/tts/client/model/DownloadHandler:e	Z
    //   75: ifne +10 -> 85
    //   78: aload_2
    //   79: aload_1
    //   80: invokeinterface 102 2 0
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	DownloadHandler
    //   0	98	1	paramString	String
    //   44	35	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	58	88	finally
    //   58	60	88	finally
    //   89	91	88	finally
    //   71	85	93	finally
    //   85	87	93	finally
    //   94	96	93	finally
  }
  
  /* Error */
  private void a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 97	com/baidu/tts/client/model/DownloadHandler:a	()Lcom/baidu/tts/client/model/OnDownloadListener;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +30 -> 36
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 38	com/baidu/tts/client/model/DownloadHandler:e	Z
    //   15: ifne +19 -> 34
    //   18: aload_3
    //   19: aload_1
    //   20: iload_2
    //   21: invokeinterface 106 3 0
    //   26: aload_0
    //   27: getfield 58	com/baidu/tts/client/model/DownloadHandler:a	Lcom/baidu/tts/d/b;
    //   30: aconst_null
    //   31: invokevirtual 109	com/baidu/tts/d/b:a	(Lcom/baidu/tts/client/model/OnDownloadListener;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_0
    //   37: monitorenter
    //   38: getstatic 72	com/baidu/tts/client/model/Statistics:isStatistics	Z
    //   41: ifeq +39 -> 80
    //   44: new 74	java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   51: invokestatic 81	java/lang/System:currentTimeMillis	()J
    //   54: invokevirtual 85	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   57: ldc 87
    //   59: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: astore_3
    //   66: aload_0
    //   67: getfield 40	com/baidu/tts/client/model/DownloadHandler:g	Lcom/baidu/tts/client/model/RecordData;
    //   70: aload_0
    //   71: getfield 52	com/baidu/tts/client/model/DownloadHandler:h	Ljava/lang/String;
    //   74: aload_1
    //   75: iload_2
    //   76: aload_3
    //   77: invokevirtual 113	com/baidu/tts/client/model/RecordData:setEndInfo	(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   80: getstatic 72	com/baidu/tts/client/model/Statistics:isStatistics	Z
    //   83: ifeq +45 -> 128
    //   86: new 69	com/baidu/tts/client/model/Statistics
    //   89: dup
    //   90: aload_0
    //   91: getfield 54	com/baidu/tts/client/model/DownloadHandler:f	Lcom/baidu/tts/l/a;
    //   94: invokevirtual 118	com/baidu/tts/l/a:d	()Landroid/content/Context;
    //   97: invokespecial 121	com/baidu/tts/client/model/Statistics:<init>	(Landroid/content/Context;)V
    //   100: invokevirtual 125	com/baidu/tts/client/model/Statistics:start	()I
    //   103: istore_2
    //   104: ldc 127
    //   106: new 74	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   113: ldc -127
    //   115: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: iload_2
    //   119: invokevirtual 132	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   122: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 137	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_0
    //   129: monitorexit
    //   130: return
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    //   136: astore_1
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_1
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	DownloadHandler
    //   0	141	1	paramString	String
    //   0	141	2	paramInt	int
    //   4	73	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	34	131	finally
    //   34	36	131	finally
    //   132	134	131	finally
    //   38	80	136	finally
    //   80	128	136	finally
    //   128	130	136	finally
    //   137	139	136	finally
  }
  
  private void a(String paramString, long paramLong1, long paramLong2)
  {
    OnDownloadListener localOnDownloadListener = a();
    if (localOnDownloadListener != null) {
      try
      {
        if (!this.e) {
          localOnDownloadListener.onProgress(paramString, paramLong1, paramLong2);
        }
        return;
      }
      finally {}
    }
  }
  
  public b getDownloadParams()
  {
    return this.a;
  }
  
  public int getErrorCode()
  {
    return getErrorCode(this.c);
  }
  
  public int getErrorCode(TtsError paramTtsError)
  {
    if (paramTtsError != null) {
      return paramTtsError.getDetailCode();
    }
    return 0;
  }
  
  public String getErrorMessage()
  {
    return getErrorMessage(this.c);
  }
  
  public String getErrorMessage(TtsError paramTtsError)
  {
    if (paramTtsError != null) {
      return paramTtsError.getDetailMessage();
    }
    return null;
  }
  
  public String getModelId()
  {
    return this.a.a();
  }
  
  public TtsError getTtsError()
  {
    return this.c;
  }
  
  public void reset()
  {
    try
    {
      LoggerProxy.d("DownloadHandler", "reset");
      this.e = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void reset(b paramb)
  {
    setDownloadParams(paramb);
    reset();
  }
  
  public void setCheckFuture(Future<com.baidu.tts.d.a> paramFuture)
  {
    this.b = paramFuture;
  }
  
  public void setDownloadParams(b paramb)
  {
    this.a = paramb;
  }
  
  public void setTtsError(TtsError paramTtsError)
  {
    this.c = paramTtsError;
  }
  
  public void stop()
  {
    try
    {
      LoggerProxy.d("DownloadHandler", "stop");
      this.e = true;
      if (this.b != null)
      {
        this.b.cancel(true);
        this.b = null;
      }
      this.d.a(this);
      this.a.a(null);
      return;
    }
    finally {}
  }
  
  public void updateFinish(d paramd, TtsError paramTtsError)
  {
    updateFinish(paramd.g(), paramTtsError);
  }
  
  public void updateFinish(String paramString, TtsError paramTtsError)
  {
    setTtsError(paramTtsError);
    a(paramString, getErrorCode());
  }
  
  public void updateProgress(d paramd)
  {
    long l1 = paramd.h();
    long l2 = paramd.c();
    a(paramd.g(), l1, l2);
  }
  
  public void updateStart(d paramd)
  {
    a(paramd.g());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/client/model/DownloadHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */