package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

public class LocalFileFetchProducer
  extends LocalFetchProducer
{
  @VisibleForTesting
  static final String PRODUCER_NAME = "LocalFileFetchProducer";
  
  public LocalFileFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, boolean paramBoolean)
  {
    super(paramExecutor, paramPooledByteBufferFactory, paramBoolean);
  }
  
  protected EncodedImage getEncodedImage(ImageRequest paramImageRequest)
  {
    return getEncodedImage(new FileInputStream(paramImageRequest.getSourceFile().toString()), (int)paramImageRequest.getSourceFile().length());
  }
  
  protected String getProducerName()
  {
    return "LocalFileFetchProducer";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/LocalFileFetchProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */