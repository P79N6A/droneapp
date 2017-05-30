package com.facebook.imagepipeline.cache;

import a.l;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteStreams;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class BufferedDiskCache
{
  private static final Class<?> TAG = BufferedDiskCache.class;
  private final FileCache mFileCache;
  private final ImageCacheStatsTracker mImageCacheStatsTracker;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  private final PooledByteStreams mPooledByteStreams;
  private final Executor mReadExecutor;
  private final StagingArea mStagingArea;
  private final Executor mWriteExecutor;
  
  public BufferedDiskCache(FileCache paramFileCache, PooledByteBufferFactory paramPooledByteBufferFactory, PooledByteStreams paramPooledByteStreams, Executor paramExecutor1, Executor paramExecutor2, ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    this.mFileCache = paramFileCache;
    this.mPooledByteBufferFactory = paramPooledByteBufferFactory;
    this.mPooledByteStreams = paramPooledByteStreams;
    this.mReadExecutor = paramExecutor1;
    this.mWriteExecutor = paramExecutor2;
    this.mImageCacheStatsTracker = paramImageCacheStatsTracker;
    this.mStagingArea = StagingArea.getInstance();
  }
  
  /* Error */
  private com.facebook.imagepipeline.memory.PooledByteBuffer readFromDiskCache(CacheKey paramCacheKey)
  {
    // Byte code:
    //   0: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   3: ldc 87
    //   5: aload_1
    //   6: invokeinterface 93 1 0
    //   11: invokestatic 99	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   14: aload_0
    //   15: getfield 43	com/facebook/imagepipeline/cache/BufferedDiskCache:mFileCache	Lcom/facebook/cache/disk/FileCache;
    //   18: aload_1
    //   19: invokeinterface 105 2 0
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull +28 -> 54
    //   29: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   32: ldc 107
    //   34: aload_1
    //   35: invokeinterface 93 1 0
    //   40: invokestatic 99	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   43: aload_0
    //   44: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   47: invokeinterface 112 1 0
    //   52: aconst_null
    //   53: areturn
    //   54: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   57: ldc 114
    //   59: aload_1
    //   60: invokeinterface 93 1 0
    //   65: invokestatic 99	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   68: aload_0
    //   69: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   72: invokeinterface 117 1 0
    //   77: aload_3
    //   78: invokeinterface 123 1 0
    //   83: astore_2
    //   84: aload_0
    //   85: getfield 45	com/facebook/imagepipeline/cache/BufferedDiskCache:mPooledByteBufferFactory	Lcom/facebook/imagepipeline/memory/PooledByteBufferFactory;
    //   88: aload_2
    //   89: aload_3
    //   90: invokeinterface 127 1 0
    //   95: l2i
    //   96: invokeinterface 133 3 0
    //   101: astore_3
    //   102: aload_2
    //   103: invokevirtual 138	java/io/InputStream:close	()V
    //   106: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   109: ldc -116
    //   111: aload_1
    //   112: invokeinterface 93 1 0
    //   117: invokestatic 99	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   120: aload_3
    //   121: areturn
    //   122: astore_2
    //   123: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   126: aload_2
    //   127: ldc -114
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_1
    //   136: invokeinterface 93 1 0
    //   141: aastore
    //   142: invokestatic 146	com/facebook/common/logging/FLog:w	(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   145: aload_0
    //   146: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   149: invokeinterface 149 1 0
    //   154: aload_2
    //   155: athrow
    //   156: astore_3
    //   157: aload_2
    //   158: invokevirtual 138	java/io/InputStream:close	()V
    //   161: aload_3
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	BufferedDiskCache
    //   0	163	1	paramCacheKey	CacheKey
    //   83	20	2	localInputStream	java.io.InputStream
    //   122	36	2	localIOException	IOException
    //   24	97	3	localObject1	Object
    //   156	6	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	25	122	java/io/IOException
    //   29	52	122	java/io/IOException
    //   54	84	122	java/io/IOException
    //   102	120	122	java/io/IOException
    //   157	163	122	java/io/IOException
    //   84	102	156	finally
  }
  
  private void writeToDiskCache(CacheKey paramCacheKey, final EncodedImage paramEncodedImage)
  {
    FLog.v(TAG, "About to write to disk-cache for key %s", paramCacheKey.toString());
    try
    {
      this.mFileCache.insert(paramCacheKey, new WriterCallback()
      {
        public void write(OutputStream paramAnonymousOutputStream)
        {
          BufferedDiskCache.this.mPooledByteStreams.copy(paramEncodedImage.getInputStream(), paramAnonymousOutputStream);
        }
      });
      FLog.v(TAG, "Successful disk-cache write for key %s", paramCacheKey.toString());
      return;
    }
    catch (IOException paramEncodedImage)
    {
      FLog.w(TAG, paramEncodedImage, "Failed to write to disk-cache for key %s", new Object[] { paramCacheKey.toString() });
    }
  }
  
  public l<Void> clearAll()
  {
    this.mStagingArea.clearAll();
    try
    {
      l locall = l.a(new Callable()
      {
        public Void call()
        {
          BufferedDiskCache.this.mStagingArea.clearAll();
          BufferedDiskCache.this.mFileCache.clearAll();
          return null;
        }
      }, this.mWriteExecutor);
      return locall;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache clear", new Object[0]);
      return l.a(localException);
    }
  }
  
  public l<Boolean> contains(final CacheKey paramCacheKey)
  {
    Preconditions.checkNotNull(paramCacheKey);
    Object localObject = this.mStagingArea.get(paramCacheKey);
    if (localObject != null)
    {
      ((EncodedImage)localObject).close();
      FLog.v(TAG, "Found image for %s in staging area", paramCacheKey.toString());
      this.mImageCacheStatsTracker.onStagingAreaHit();
      return l.a(Boolean.valueOf(true));
    }
    try
    {
      localObject = l.a(new Callable()
      {
        public Boolean call()
        {
          EncodedImage localEncodedImage = BufferedDiskCache.this.mStagingArea.get(paramCacheKey);
          if (localEncodedImage != null)
          {
            localEncodedImage.close();
            FLog.v(BufferedDiskCache.TAG, "Found image for %s in staging area", paramCacheKey.toString());
            BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaHit();
            return Boolean.valueOf(true);
          }
          FLog.v(BufferedDiskCache.TAG, "Did not find image for %s in staging area", paramCacheKey.toString());
          BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaMiss();
          try
          {
            boolean bool = BufferedDiskCache.this.mFileCache.hasKey(paramCacheKey);
            return Boolean.valueOf(bool);
          }
          catch (Exception localException) {}
          return Boolean.valueOf(false);
        }
      }, this.mReadExecutor);
      return (l<Boolean>)localObject;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache read for %s", new Object[] { paramCacheKey.toString() });
      return l.a(localException);
    }
  }
  
  public l<EncodedImage> get(final CacheKey paramCacheKey, final AtomicBoolean paramAtomicBoolean)
  {
    Preconditions.checkNotNull(paramCacheKey);
    Preconditions.checkNotNull(paramAtomicBoolean);
    EncodedImage localEncodedImage = this.mStagingArea.get(paramCacheKey);
    if (localEncodedImage != null)
    {
      FLog.v(TAG, "Found image for %s in staging area", paramCacheKey.toString());
      this.mImageCacheStatsTracker.onStagingAreaHit();
      return l.a(localEncodedImage);
    }
    try
    {
      paramAtomicBoolean = l.a(new Callable()
      {
        /* Error */
        public EncodedImage call()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 24	com/facebook/imagepipeline/cache/BufferedDiskCache$2:val$isCancelled	Ljava/util/concurrent/atomic/AtomicBoolean;
          //   4: invokevirtual 39	java/util/concurrent/atomic/AtomicBoolean:get	()Z
          //   7: ifeq +11 -> 18
          //   10: new 41	java/util/concurrent/CancellationException
          //   13: dup
          //   14: invokespecial 42	java/util/concurrent/CancellationException:<init>	()V
          //   17: athrow
          //   18: aload_0
          //   19: getfield 22	com/facebook/imagepipeline/cache/BufferedDiskCache$2:this$0	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
          //   22: invokestatic 46	com/facebook/imagepipeline/cache/BufferedDiskCache:access$000	(Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Lcom/facebook/imagepipeline/cache/StagingArea;
          //   25: aload_0
          //   26: getfield 26	com/facebook/imagepipeline/cache/BufferedDiskCache$2:val$key	Lcom/facebook/cache/common/CacheKey;
          //   29: invokevirtual 51	com/facebook/imagepipeline/cache/StagingArea:get	(Lcom/facebook/cache/common/CacheKey;)Lcom/facebook/imagepipeline/image/EncodedImage;
          //   32: astore_1
          //   33: aload_1
          //   34: ifnull +64 -> 98
          //   37: invokestatic 55	com/facebook/imagepipeline/cache/BufferedDiskCache:access$100	()Ljava/lang/Class;
          //   40: ldc 57
          //   42: aload_0
          //   43: getfield 26	com/facebook/imagepipeline/cache/BufferedDiskCache$2:val$key	Lcom/facebook/cache/common/CacheKey;
          //   46: invokeinterface 63 1 0
          //   51: invokestatic 69	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
          //   54: aload_0
          //   55: getfield 22	com/facebook/imagepipeline/cache/BufferedDiskCache$2:this$0	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
          //   58: invokestatic 73	com/facebook/imagepipeline/cache/BufferedDiskCache:access$200	(Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
          //   61: invokeinterface 78 1 0
          //   66: aload_1
          //   67: astore_2
          //   68: invokestatic 83	java/lang/Thread:interrupted	()Z
          //   71: ifeq +97 -> 168
          //   74: invokestatic 55	com/facebook/imagepipeline/cache/BufferedDiskCache:access$100	()Ljava/lang/Class;
          //   77: ldc 85
          //   79: invokestatic 88	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;)V
          //   82: aload_1
          //   83: ifnull +7 -> 90
          //   86: aload_1
          //   87: invokevirtual 93	com/facebook/imagepipeline/image/EncodedImage:close	()V
          //   90: new 95	java/lang/InterruptedException
          //   93: dup
          //   94: invokespecial 96	java/lang/InterruptedException:<init>	()V
          //   97: athrow
          //   98: invokestatic 55	com/facebook/imagepipeline/cache/BufferedDiskCache:access$100	()Ljava/lang/Class;
          //   101: ldc 98
          //   103: aload_0
          //   104: getfield 26	com/facebook/imagepipeline/cache/BufferedDiskCache$2:val$key	Lcom/facebook/cache/common/CacheKey;
          //   107: invokeinterface 63 1 0
          //   112: invokestatic 69	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
          //   115: aload_0
          //   116: getfield 22	com/facebook/imagepipeline/cache/BufferedDiskCache$2:this$0	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
          //   119: invokestatic 73	com/facebook/imagepipeline/cache/BufferedDiskCache:access$200	(Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
          //   122: invokeinterface 101 1 0
          //   127: aload_0
          //   128: getfield 22	com/facebook/imagepipeline/cache/BufferedDiskCache$2:this$0	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
          //   131: aload_0
          //   132: getfield 26	com/facebook/imagepipeline/cache/BufferedDiskCache$2:val$key	Lcom/facebook/cache/common/CacheKey;
          //   135: invokestatic 105	com/facebook/imagepipeline/cache/BufferedDiskCache:access$400	(Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lcom/facebook/cache/common/CacheKey;)Lcom/facebook/imagepipeline/memory/PooledByteBuffer;
          //   138: invokestatic 111	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
          //   141: astore_2
          //   142: new 90	com/facebook/imagepipeline/image/EncodedImage
          //   145: dup
          //   146: aload_2
          //   147: invokespecial 114	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
          //   150: astore_1
          //   151: aload_2
          //   152: invokestatic 117	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
          //   155: goto -89 -> 66
          //   158: astore_1
          //   159: aload_2
          //   160: invokestatic 117	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
          //   163: aload_1
          //   164: athrow
          //   165: astore_1
          //   166: aconst_null
          //   167: astore_2
          //   168: aload_2
          //   169: areturn
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	170	0	this	2
          //   32	119	1	localEncodedImage	EncodedImage
          //   158	6	1	localObject1	Object
          //   165	1	1	localException	Exception
          //   67	102	2	localObject2	Object
          // Exception table:
          //   from	to	target	type
          //   142	151	158	finally
          //   127	142	165	java/lang/Exception
          //   151	155	165	java/lang/Exception
          //   159	165	165	java/lang/Exception
        }
      }, this.mReadExecutor);
      return paramAtomicBoolean;
    }
    catch (Exception paramAtomicBoolean)
    {
      FLog.w(TAG, paramAtomicBoolean, "Failed to schedule disk-cache read for %s", new Object[] { paramCacheKey.toString() });
    }
    return l.a(paramAtomicBoolean);
  }
  
  public void put(final CacheKey paramCacheKey, EncodedImage paramEncodedImage)
  {
    Preconditions.checkNotNull(paramCacheKey);
    Preconditions.checkArgument(EncodedImage.isValid(paramEncodedImage));
    this.mStagingArea.put(paramCacheKey, paramEncodedImage);
    final EncodedImage localEncodedImage = EncodedImage.cloneOrNull(paramEncodedImage);
    try
    {
      this.mWriteExecutor.execute(new Runnable()
      {
        public void run()
        {
          try
          {
            BufferedDiskCache.this.writeToDiskCache(paramCacheKey, localEncodedImage);
            return;
          }
          finally
          {
            BufferedDiskCache.this.mStagingArea.remove(paramCacheKey, localEncodedImage);
            EncodedImage.closeSafely(localEncodedImage);
          }
        }
      });
      return;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache write for %s", new Object[] { paramCacheKey.toString() });
      this.mStagingArea.remove(paramCacheKey, paramEncodedImage);
      EncodedImage.closeSafely(localEncodedImage);
    }
  }
  
  public l<Void> remove(final CacheKey paramCacheKey)
  {
    Preconditions.checkNotNull(paramCacheKey);
    this.mStagingArea.remove(paramCacheKey);
    try
    {
      l locall = l.a(new Callable()
      {
        public Void call()
        {
          BufferedDiskCache.this.mStagingArea.remove(paramCacheKey);
          BufferedDiskCache.this.mFileCache.remove(paramCacheKey);
          return null;
        }
      }, this.mWriteExecutor);
      return locall;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache remove for %s", new Object[] { paramCacheKey.toString() });
      return l.a(localException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/cache/BufferedDiskCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */