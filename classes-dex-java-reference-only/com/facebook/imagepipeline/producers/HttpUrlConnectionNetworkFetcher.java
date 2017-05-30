package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HttpUrlConnectionNetworkFetcher
  extends BaseNetworkFetcher<FetchState>
{
  private static final int NUM_NETWORK_THREADS = 3;
  private final ExecutorService mExecutorService = Executors.newFixedThreadPool(3);
  
  public FetchState createFetchState(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    return new FetchState(paramConsumer, paramProducerContext);
  }
  
  public void fetch(final FetchState paramFetchState, final NetworkFetcher.Callback paramCallback)
  {
    final Future localFuture = this.mExecutorService.submit(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 23	com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher$1:val$fetchState	Lcom/facebook/imagepipeline/producers/FetchState;
        //   4: invokevirtual 38	com/facebook/imagepipeline/producers/FetchState:getUri	()Landroid/net/Uri;
        //   7: invokevirtual 44	android/net/Uri:getScheme	()Ljava/lang/String;
        //   10: astore 4
        //   12: aload_0
        //   13: getfield 23	com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher$1:val$fetchState	Lcom/facebook/imagepipeline/producers/FetchState;
        //   16: invokevirtual 38	com/facebook/imagepipeline/producers/FetchState:getUri	()Landroid/net/Uri;
        //   19: invokevirtual 47	android/net/Uri:toString	()Ljava/lang/String;
        //   22: astore_2
        //   23: aconst_null
        //   24: astore_1
        //   25: aload_1
        //   26: astore_3
        //   27: new 49	java/net/URL
        //   30: dup
        //   31: aload_2
        //   32: invokespecial 52	java/net/URL:<init>	(Ljava/lang/String;)V
        //   35: invokevirtual 56	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   38: checkcast 58	java/net/HttpURLConnection
        //   41: astore_2
        //   42: aload_2
        //   43: ldc 60
        //   45: invokevirtual 64	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
        //   48: astore_3
        //   49: aload_3
        //   50: ifnonnull +43 -> 93
        //   53: aconst_null
        //   54: astore_1
        //   55: aload_3
        //   56: ifnull +12 -> 68
        //   59: aload_1
        //   60: aload 4
        //   62: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   65: ifeq +39 -> 104
        //   68: aload_2
        //   69: invokevirtual 74	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   72: astore_1
        //   73: aload_0
        //   74: getfield 25	com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher$1:val$callback	Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;
        //   77: aload_1
        //   78: iconst_m1
        //   79: invokeinterface 80 3 0
        //   84: aload_2
        //   85: ifnull +7 -> 92
        //   88: aload_2
        //   89: invokevirtual 83	java/net/HttpURLConnection:disconnect	()V
        //   92: return
        //   93: aload_3
        //   94: invokestatic 87	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
        //   97: invokevirtual 44	android/net/Uri:getScheme	()Ljava/lang/String;
        //   100: astore_1
        //   101: goto -46 -> 55
        //   104: aload_2
        //   105: ifnull +7 -> 112
        //   108: aload_2
        //   109: invokevirtual 83	java/net/HttpURLConnection:disconnect	()V
        //   112: aload_1
        //   113: astore 4
        //   115: aload_2
        //   116: astore_1
        //   117: aload_3
        //   118: astore_2
        //   119: goto -94 -> 25
        //   122: astore_3
        //   123: aload_2
        //   124: astore_1
        //   125: aload_3
        //   126: astore_2
        //   127: aload_1
        //   128: astore_3
        //   129: aload_0
        //   130: getfield 25	com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher$1:val$callback	Lcom/facebook/imagepipeline/producers/NetworkFetcher$Callback;
        //   133: aload_2
        //   134: invokeinterface 91 2 0
        //   139: aload_1
        //   140: ifnull -48 -> 92
        //   143: aload_1
        //   144: invokevirtual 83	java/net/HttpURLConnection:disconnect	()V
        //   147: return
        //   148: astore_1
        //   149: aload_2
        //   150: ifnull +7 -> 157
        //   153: aload_2
        //   154: invokevirtual 83	java/net/HttpURLConnection:disconnect	()V
        //   157: aload_1
        //   158: athrow
        //   159: astore_1
        //   160: aload_3
        //   161: astore_2
        //   162: goto -13 -> 149
        //   165: astore_2
        //   166: goto -39 -> 127
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	169	0	this	1
        //   24	120	1	localObject1	Object
        //   148	10	1	localObject2	Object
        //   159	1	1	localObject3	Object
        //   22	140	2	localObject4	Object
        //   165	1	2	localException1	Exception
        //   26	92	3	localObject5	Object
        //   122	4	3	localException2	Exception
        //   128	33	3	localObject6	Object
        //   10	104	4	localObject7	Object
        // Exception table:
        //   from	to	target	type
        //   42	49	122	java/lang/Exception
        //   59	68	122	java/lang/Exception
        //   68	84	122	java/lang/Exception
        //   93	101	122	java/lang/Exception
        //   42	49	148	finally
        //   59	68	148	finally
        //   68	84	148	finally
        //   93	101	148	finally
        //   27	42	159	finally
        //   129	139	159	finally
        //   27	42	165	java/lang/Exception
      }
    });
    paramFetchState.getContext().addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        if (localFuture.cancel(false)) {
          paramCallback.onCancellation();
        }
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */