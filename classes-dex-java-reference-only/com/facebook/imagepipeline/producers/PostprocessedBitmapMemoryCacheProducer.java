package com.facebook.imagepipeline.producers;

import com.android.internal.util.Predicate;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;

public class PostprocessedBitmapMemoryCacheProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  @VisibleForTesting
  static final String PRODUCER_NAME = "PostprocessedBitmapMemoryCacheProducer";
  @VisibleForTesting
  static final String VALUE_FOUND = "cached_value_found";
  private final CacheKeyFactory mCacheKeyFactory;
  private final Producer<CloseableReference<CloseableImage>> mInputProducer;
  private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  
  public PostprocessedBitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> paramMemoryCache, CacheKeyFactory paramCacheKeyFactory, Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    this.mMemoryCache = paramMemoryCache;
    this.mCacheKeyFactory = paramCacheKeyFactory;
    this.mInputProducer = paramProducer;
  }
  
  protected String getProducerName()
  {
    return "PostprocessedBitmapMemoryCacheProducer";
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    Object localObject3 = null;
    ProducerListener localProducerListener = paramProducerContext.getListener();
    String str = paramProducerContext.getId();
    Object localObject1 = paramProducerContext.getImageRequest();
    Postprocessor localPostprocessor = ((ImageRequest)localObject1).getPostprocessor();
    if (localPostprocessor == null)
    {
      this.mInputProducer.produceResults(paramConsumer, paramProducerContext);
      return;
    }
    localProducerListener.onProducerStart(str, getProducerName());
    if (localPostprocessor.getPostprocessorCacheKey() != null)
    {
      localObject2 = this.mCacheKeyFactory.getPostprocessedBitmapCacheKey((ImageRequest)localObject1);
      localObject1 = this.mMemoryCache.get(localObject2);
      if (localObject1 == null) {
        break label171;
      }
      localObject2 = getProducerName();
      if (!localProducerListener.requiresExtraMap(str)) {
        break label166;
      }
    }
    label166:
    for (paramProducerContext = ImmutableMap.of("cached_value_found", "true");; paramProducerContext = null)
    {
      localProducerListener.onProducerFinishWithSuccess(str, (String)localObject2, paramProducerContext);
      paramConsumer.onProgressUpdate(1.0F);
      paramConsumer.onNewResult(localObject1, true);
      ((CloseableReference)localObject1).close();
      return;
      localObject1 = null;
      localObject2 = null;
      break;
    }
    label171:
    localObject1 = new CachedPostprocessorConsumer(paramConsumer, (CacheKey)localObject2, localPostprocessor instanceof RepeatedPostprocessor, localPostprocessor.getClass().getName(), this.mMemoryCache);
    Object localObject2 = getProducerName();
    paramConsumer = (Consumer<CloseableReference<CloseableImage>>)localObject3;
    if (localProducerListener.requiresExtraMap(str)) {
      paramConsumer = ImmutableMap.of("cached_value_found", "false");
    }
    localProducerListener.onProducerFinishWithSuccess(str, (String)localObject2, paramConsumer);
    this.mInputProducer.produceResults((Consumer)localObject1, paramProducerContext);
  }
  
  public static class CachedPostprocessorConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  {
    private final CacheKey mCacheKey;
    private final boolean mIsRepeatedProcessor;
    private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    private final String mProcessorName;
    
    public CachedPostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, CacheKey paramCacheKey, boolean paramBoolean, String paramString, MemoryCache<CacheKey, CloseableImage> paramMemoryCache)
    {
      super();
      this.mCacheKey = paramCacheKey;
      this.mIsRepeatedProcessor = paramBoolean;
      this.mProcessorName = paramString;
      this.mMemoryCache = paramMemoryCache;
    }
    
    protected void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, boolean paramBoolean)
    {
      if ((!paramBoolean) && (!this.mIsRepeatedProcessor)) {
        return;
      }
      if (paramCloseableReference == null)
      {
        getConsumer().onNewResult(null, paramBoolean);
        return;
      }
      if (this.mCacheKey != null) {
        this.mMemoryCache.removeAll(new Predicate()
        {
          public boolean apply(CacheKey paramAnonymousCacheKey)
          {
            if ((paramAnonymousCacheKey instanceof BitmapMemoryCacheKey)) {
              return PostprocessedBitmapMemoryCacheProducer.CachedPostprocessorConsumer.this.mProcessorName.equals(((BitmapMemoryCacheKey)paramAnonymousCacheKey).getPostprocessorName());
            }
            return false;
          }
        });
      }
      for (localObject = this.mMemoryCache.cache(this.mCacheKey, paramCloseableReference);; localObject = paramCloseableReference) {
        try
        {
          getConsumer().onProgressUpdate(1.0F);
          Consumer localConsumer = getConsumer();
          if (localObject != null) {
            paramCloseableReference = (CloseableReference<CloseableImage>)localObject;
          }
          localConsumer.onNewResult(paramCloseableReference, paramBoolean);
          return;
        }
        finally
        {
          CloseableReference.closeSafely((CloseableReference)localObject);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/PostprocessedBitmapMemoryCacheProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */