package com.facebook.imagepipeline.producers;

import a.j;
import a.l;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.ImageType;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskCacheProducer
  implements Producer<EncodedImage>
{
  @VisibleForTesting
  static final String PRODUCER_NAME = "DiskCacheProducer";
  @VisibleForTesting
  static final String VALUE_FOUND = "cached_value_found";
  private final CacheKeyFactory mCacheKeyFactory;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final Producer<EncodedImage> mInputProducer;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  
  public DiskCacheProducer(BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory, Producer<EncodedImage> paramProducer)
  {
    this.mDefaultBufferedDiskCache = paramBufferedDiskCache1;
    this.mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    this.mCacheKeyFactory = paramCacheKeyFactory;
    this.mInputProducer = paramProducer;
  }
  
  @VisibleForTesting
  static Map<String, String> getExtraMap(ProducerListener paramProducerListener, String paramString, boolean paramBoolean)
  {
    if (!paramProducerListener.requiresExtraMap(paramString)) {
      return null;
    }
    return ImmutableMap.of("cached_value_found", String.valueOf(paramBoolean));
  }
  
  private void maybeStartInputProducer(Consumer<EncodedImage> paramConsumer1, Consumer<EncodedImage> paramConsumer2, ProducerContext paramProducerContext)
  {
    if (paramProducerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue())
    {
      paramConsumer1.onNewResult(null, true);
      return;
    }
    this.mInputProducer.produceResults(paramConsumer2, paramProducerContext);
  }
  
  private void subscribeTaskForRequestCancellation(final AtomicBoolean paramAtomicBoolean, ProducerContext paramProducerContext)
  {
    paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        paramAtomicBoolean.set(true);
      }
    });
  }
  
  public void produceResults(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext)
  {
    final Object localObject1 = paramProducerContext.getImageRequest();
    if (!((ImageRequest)localObject1).isDiskCacheEnabled())
    {
      maybeStartInputProducer(paramConsumer, paramConsumer, paramProducerContext);
      return;
    }
    final Object localObject2 = paramProducerContext.getListener();
    final String str = paramProducerContext.getId();
    ((ProducerListener)localObject2).onProducerStart(str, "DiskCacheProducer");
    final CacheKey localCacheKey = this.mCacheKeyFactory.getEncodedCacheKey((ImageRequest)localObject1);
    if (((ImageRequest)localObject1).getImageType() == ImageRequest.ImageType.SMALL) {}
    for (localObject1 = this.mSmallImageBufferedDiskCache;; localObject1 = this.mDefaultBufferedDiskCache)
    {
      paramConsumer = new j()
      {
        public Void then(l<EncodedImage> paramAnonymousl)
        {
          if ((paramAnonymousl.c()) || ((paramAnonymousl.d()) && ((paramAnonymousl.f() instanceof CancellationException))))
          {
            localObject2.onProducerFinishWithCancellation(str, "DiskCacheProducer", null);
            paramConsumer.onCancellation();
            return null;
          }
          if (paramAnonymousl.d())
          {
            localObject2.onProducerFinishWithFailure(str, "DiskCacheProducer", paramAnonymousl.f(), null);
            DiskCacheProducer.this.maybeStartInputProducer(paramConsumer, new DiskCacheProducer.DiskCacheConsumer(DiskCacheProducer.this, paramConsumer, localObject1, localCacheKey, null), paramProducerContext);
            return null;
          }
          paramAnonymousl = (EncodedImage)paramAnonymousl.e();
          if (paramAnonymousl != null)
          {
            localObject2.onProducerFinishWithSuccess(str, "DiskCacheProducer", DiskCacheProducer.getExtraMap(localObject2, str, true));
            paramConsumer.onProgressUpdate(1.0F);
            paramConsumer.onNewResult(paramAnonymousl, true);
            paramAnonymousl.close();
            return null;
          }
          localObject2.onProducerFinishWithSuccess(str, "DiskCacheProducer", DiskCacheProducer.getExtraMap(localObject2, str, false));
          DiskCacheProducer.this.maybeStartInputProducer(paramConsumer, new DiskCacheProducer.DiskCacheConsumer(DiskCacheProducer.this, paramConsumer, localObject1, localCacheKey, null), paramProducerContext);
          return null;
        }
      };
      localObject2 = new AtomicBoolean(false);
      ((BufferedDiskCache)localObject1).get(localCacheKey, (AtomicBoolean)localObject2).a(paramConsumer);
      subscribeTaskForRequestCancellation((AtomicBoolean)localObject2, paramProducerContext);
      return;
    }
  }
  
  private class DiskCacheConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private final BufferedDiskCache mCache;
    private final CacheKey mCacheKey;
    
    private DiskCacheConsumer(BufferedDiskCache paramBufferedDiskCache, CacheKey paramCacheKey)
    {
      super();
      this.mCache = paramCacheKey;
      CacheKey localCacheKey;
      this.mCacheKey = localCacheKey;
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, boolean paramBoolean)
    {
      if ((paramEncodedImage != null) && (paramBoolean)) {
        this.mCache.put(this.mCacheKey, paramEncodedImage);
      }
      getConsumer().onNewResult(paramEncodedImage, paramBoolean);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/DiskCacheProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */