package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskCacheConfig.Builder;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.imagepipeline.animated.factory.AnimatedImageFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultBitmapMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultEncodedMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.NoOpImageCacheStatsTracker;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.PoolConfig;
import com.facebook.imagepipeline.memory.PoolConfig.Builder;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ImagePipelineConfig
{
  @Nullable
  private final AnimatedImageFactory mAnimatedImageFactory;
  private final Bitmap.Config mBitmapConfig;
  private final Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
  private final CacheKeyFactory mCacheKeyFactory;
  private final Context mContext;
  private final boolean mDecodeFileDescriptorEnabled;
  private final boolean mDecodeMemoryFileEnabled;
  private final boolean mDownsampleEnabled;
  private final Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
  private final ExecutorSupplier mExecutorSupplier;
  private final ImageCacheStatsTracker mImageCacheStatsTracker;
  @Nullable
  private final ImageDecoder mImageDecoder;
  private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
  private final DiskCacheConfig mMainDiskCacheConfig;
  private final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  private final NetworkFetcher mNetworkFetcher;
  @Nullable
  private final PlatformBitmapFactory mPlatformBitmapFactory;
  private final PoolFactory mPoolFactory;
  private final ProgressiveJpegConfig mProgressiveJpegConfig;
  private final Set<RequestListener> mRequestListeners;
  private final boolean mResizeAndRotateEnabledForNetwork;
  private final DiskCacheConfig mSmallImageDiskCacheConfig;
  
  private ImagePipelineConfig(Builder paramBuilder)
  {
    this.mAnimatedImageFactory = paramBuilder.mAnimatedImageFactory;
    Object localObject;
    label58:
    label76:
    boolean bool;
    label112:
    label149:
    label167:
    label198:
    label220:
    label238:
    label260:
    label296:
    label318:
    label340:
    label367:
    int i;
    if (paramBuilder.mBitmapMemoryCacheParamsSupplier == null)
    {
      localObject = new DefaultBitmapMemoryCacheParamsSupplier((ActivityManager)paramBuilder.mContext.getSystemService("activity"));
      this.mBitmapMemoryCacheParamsSupplier = ((Supplier)localObject);
      if (paramBuilder.mBitmapConfig != null) {
        break label412;
      }
      localObject = Bitmap.Config.ARGB_8888;
      this.mBitmapConfig = ((Bitmap.Config)localObject);
      if (paramBuilder.mCacheKeyFactory != null) {
        break label421;
      }
      localObject = DefaultCacheKeyFactory.getInstance();
      this.mCacheKeyFactory = ((CacheKeyFactory)localObject);
      this.mContext = ((Context)Preconditions.checkNotNull(paramBuilder.mContext));
      if ((!paramBuilder.mDownsampleEnabled) || (!paramBuilder.mDecodeFileDescriptorEnabled)) {
        break label430;
      }
      bool = true;
      this.mDecodeFileDescriptorEnabled = bool;
      this.mDecodeMemoryFileEnabled = paramBuilder.mDecodeMemoryFileEnabled;
      this.mDownsampleEnabled = paramBuilder.mDownsampleEnabled;
      if (paramBuilder.mEncodedMemoryCacheParamsSupplier != null) {
        break label435;
      }
      localObject = new DefaultEncodedMemoryCacheParamsSupplier();
      this.mEncodedMemoryCacheParamsSupplier = ((Supplier)localObject);
      if (paramBuilder.mImageCacheStatsTracker != null) {
        break label444;
      }
      localObject = NoOpImageCacheStatsTracker.getInstance();
      this.mImageCacheStatsTracker = ((ImageCacheStatsTracker)localObject);
      this.mImageDecoder = paramBuilder.mImageDecoder;
      if (paramBuilder.mIsPrefetchEnabledSupplier != null) {
        break label453;
      }
      localObject = new Supplier()
      {
        public Boolean get()
        {
          return Boolean.valueOf(true);
        }
      };
      this.mIsPrefetchEnabledSupplier = ((Supplier)localObject);
      if (paramBuilder.mMainDiskCacheConfig != null) {
        break label462;
      }
      localObject = getDefaultMainDiskCacheConfig(paramBuilder.mContext);
      this.mMainDiskCacheConfig = ((DiskCacheConfig)localObject);
      if (paramBuilder.mMemoryTrimmableRegistry != null) {
        break label471;
      }
      localObject = NoOpMemoryTrimmableRegistry.getInstance();
      this.mMemoryTrimmableRegistry = ((MemoryTrimmableRegistry)localObject);
      if (paramBuilder.mNetworkFetcher != null) {
        break label480;
      }
      localObject = new HttpUrlConnectionNetworkFetcher();
      this.mNetworkFetcher = ((NetworkFetcher)localObject);
      this.mPlatformBitmapFactory = paramBuilder.mPlatformBitmapFactory;
      if (paramBuilder.mPoolFactory != null) {
        break label489;
      }
      localObject = new PoolFactory(PoolConfig.newBuilder().build());
      this.mPoolFactory = ((PoolFactory)localObject);
      if (paramBuilder.mProgressiveJpegConfig != null) {
        break label498;
      }
      localObject = new SimpleProgressiveJpegConfig();
      this.mProgressiveJpegConfig = ((ProgressiveJpegConfig)localObject);
      if (paramBuilder.mRequestListeners != null) {
        break label507;
      }
      localObject = new HashSet();
      this.mRequestListeners = ((Set)localObject);
      this.mResizeAndRotateEnabledForNetwork = paramBuilder.mResizeAndRotateEnabledForNetwork;
      if (paramBuilder.mSmallImageDiskCacheConfig != null) {
        break label516;
      }
      localObject = this.mMainDiskCacheConfig;
      this.mSmallImageDiskCacheConfig = ((DiskCacheConfig)localObject);
      i = this.mPoolFactory.getFlexByteArrayPoolMaxNumThreads();
      if (paramBuilder.mExecutorSupplier != null) {
        break label525;
      }
    }
    label412:
    label421:
    label430:
    label435:
    label444:
    label453:
    label462:
    label471:
    label480:
    label489:
    label498:
    label507:
    label516:
    label525:
    for (paramBuilder = new DefaultExecutorSupplier(i);; paramBuilder = paramBuilder.mExecutorSupplier)
    {
      this.mExecutorSupplier = paramBuilder;
      return;
      localObject = paramBuilder.mBitmapMemoryCacheParamsSupplier;
      break;
      localObject = paramBuilder.mBitmapConfig;
      break label58;
      localObject = paramBuilder.mCacheKeyFactory;
      break label76;
      bool = false;
      break label112;
      localObject = paramBuilder.mEncodedMemoryCacheParamsSupplier;
      break label149;
      localObject = paramBuilder.mImageCacheStatsTracker;
      break label167;
      localObject = paramBuilder.mIsPrefetchEnabledSupplier;
      break label198;
      localObject = paramBuilder.mMainDiskCacheConfig;
      break label220;
      localObject = paramBuilder.mMemoryTrimmableRegistry;
      break label238;
      localObject = paramBuilder.mNetworkFetcher;
      break label260;
      localObject = paramBuilder.mPoolFactory;
      break label296;
      localObject = paramBuilder.mProgressiveJpegConfig;
      break label318;
      localObject = paramBuilder.mRequestListeners;
      break label340;
      localObject = paramBuilder.mSmallImageDiskCacheConfig;
      break label367;
    }
  }
  
  private static DiskCacheConfig getDefaultMainDiskCacheConfig(Context paramContext)
  {
    DiskCacheConfig.newBuilder().setBaseDirectoryPathSupplier(new Supplier()
    {
      public File get()
      {
        return this.val$context.getApplicationContext().getCacheDir();
      }
    }).setBaseDirectoryName("image_cache").setMaxCacheSize(41943040L).setMaxCacheSizeOnLowDiskSpace(10485760L).setMaxCacheSizeOnVeryLowDiskSpace(2097152L).build();
  }
  
  public static Builder newBuilder(Context paramContext)
  {
    return new Builder(paramContext, null);
  }
  
  @Nullable
  public AnimatedImageFactory getAnimatedImageFactory()
  {
    return this.mAnimatedImageFactory;
  }
  
  public Bitmap.Config getBitmapConfig()
  {
    return this.mBitmapConfig;
  }
  
  public Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier()
  {
    return this.mBitmapMemoryCacheParamsSupplier;
  }
  
  public CacheKeyFactory getCacheKeyFactory()
  {
    return this.mCacheKeyFactory;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier()
  {
    return this.mEncodedMemoryCacheParamsSupplier;
  }
  
  public ExecutorSupplier getExecutorSupplier()
  {
    return this.mExecutorSupplier;
  }
  
  public ImageCacheStatsTracker getImageCacheStatsTracker()
  {
    return this.mImageCacheStatsTracker;
  }
  
  @Nullable
  public ImageDecoder getImageDecoder()
  {
    return this.mImageDecoder;
  }
  
  public Supplier<Boolean> getIsPrefetchEnabledSupplier()
  {
    return this.mIsPrefetchEnabledSupplier;
  }
  
  public DiskCacheConfig getMainDiskCacheConfig()
  {
    return this.mMainDiskCacheConfig;
  }
  
  public MemoryTrimmableRegistry getMemoryTrimmableRegistry()
  {
    return this.mMemoryTrimmableRegistry;
  }
  
  public NetworkFetcher getNetworkFetcher()
  {
    return this.mNetworkFetcher;
  }
  
  @Nullable
  public PlatformBitmapFactory getPlatformBitmapFactory()
  {
    return this.mPlatformBitmapFactory;
  }
  
  public PoolFactory getPoolFactory()
  {
    return this.mPoolFactory;
  }
  
  public ProgressiveJpegConfig getProgressiveJpegConfig()
  {
    return this.mProgressiveJpegConfig;
  }
  
  public Set<RequestListener> getRequestListeners()
  {
    return Collections.unmodifiableSet(this.mRequestListeners);
  }
  
  public DiskCacheConfig getSmallImageDiskCacheConfig()
  {
    return this.mSmallImageDiskCacheConfig;
  }
  
  public boolean isDecodeFileDescriptorEnabled()
  {
    return this.mDecodeFileDescriptorEnabled;
  }
  
  public boolean isDecodeMemoryFileEnabled()
  {
    return this.mDecodeMemoryFileEnabled;
  }
  
  public boolean isDownsampleEnabled()
  {
    return this.mDownsampleEnabled;
  }
  
  public boolean isResizeAndRotateEnabledForNetwork()
  {
    return this.mResizeAndRotateEnabledForNetwork;
  }
  
  public static class Builder
  {
    private AnimatedImageFactory mAnimatedImageFactory;
    private Bitmap.Config mBitmapConfig;
    private Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
    private CacheKeyFactory mCacheKeyFactory;
    private final Context mContext;
    private boolean mDecodeFileDescriptorEnabled = this.mDownsampleEnabled;
    private boolean mDecodeMemoryFileEnabled;
    private boolean mDownsampleEnabled = false;
    private Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
    private ExecutorSupplier mExecutorSupplier;
    private ImageCacheStatsTracker mImageCacheStatsTracker;
    private ImageDecoder mImageDecoder;
    private Supplier<Boolean> mIsPrefetchEnabledSupplier;
    private DiskCacheConfig mMainDiskCacheConfig;
    private MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    private NetworkFetcher mNetworkFetcher;
    private PlatformBitmapFactory mPlatformBitmapFactory;
    private PoolFactory mPoolFactory;
    private ProgressiveJpegConfig mProgressiveJpegConfig;
    private Set<RequestListener> mRequestListeners;
    private boolean mResizeAndRotateEnabledForNetwork = true;
    private DiskCacheConfig mSmallImageDiskCacheConfig;
    
    private Builder(Context paramContext)
    {
      this.mContext = ((Context)Preconditions.checkNotNull(paramContext));
    }
    
    public ImagePipelineConfig build()
    {
      return new ImagePipelineConfig(this, null);
    }
    
    public Builder setAnimatedImageFactory(AnimatedImageFactory paramAnimatedImageFactory)
    {
      this.mAnimatedImageFactory = paramAnimatedImageFactory;
      return this;
    }
    
    public Builder setBitmapMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> paramSupplier)
    {
      this.mBitmapMemoryCacheParamsSupplier = ((Supplier)Preconditions.checkNotNull(paramSupplier));
      return this;
    }
    
    public Builder setBitmapsConfig(Bitmap.Config paramConfig)
    {
      this.mBitmapConfig = paramConfig;
      return this;
    }
    
    public Builder setCacheKeyFactory(CacheKeyFactory paramCacheKeyFactory)
    {
      this.mCacheKeyFactory = paramCacheKeyFactory;
      return this;
    }
    
    public Builder setDecodeFileDescriptorEnabled(boolean paramBoolean)
    {
      this.mDecodeFileDescriptorEnabled = paramBoolean;
      return this;
    }
    
    public Builder setDecodeMemoryFileEnabled(boolean paramBoolean)
    {
      this.mDecodeMemoryFileEnabled = paramBoolean;
      return this;
    }
    
    public Builder setDownsampleEnabled(boolean paramBoolean)
    {
      this.mDownsampleEnabled = paramBoolean;
      return this;
    }
    
    public Builder setEncodedMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> paramSupplier)
    {
      this.mEncodedMemoryCacheParamsSupplier = ((Supplier)Preconditions.checkNotNull(paramSupplier));
      return this;
    }
    
    public Builder setExecutorSupplier(ExecutorSupplier paramExecutorSupplier)
    {
      this.mExecutorSupplier = paramExecutorSupplier;
      return this;
    }
    
    public Builder setImageCacheStatsTracker(ImageCacheStatsTracker paramImageCacheStatsTracker)
    {
      this.mImageCacheStatsTracker = paramImageCacheStatsTracker;
      return this;
    }
    
    public Builder setImageDecoder(ImageDecoder paramImageDecoder)
    {
      this.mImageDecoder = paramImageDecoder;
      return this;
    }
    
    public Builder setIsPrefetchEnabledSupplier(Supplier<Boolean> paramSupplier)
    {
      this.mIsPrefetchEnabledSupplier = paramSupplier;
      return this;
    }
    
    public Builder setMainDiskCacheConfig(DiskCacheConfig paramDiskCacheConfig)
    {
      this.mMainDiskCacheConfig = paramDiskCacheConfig;
      return this;
    }
    
    public Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry paramMemoryTrimmableRegistry)
    {
      this.mMemoryTrimmableRegistry = paramMemoryTrimmableRegistry;
      return this;
    }
    
    public Builder setNetworkFetcher(NetworkFetcher paramNetworkFetcher)
    {
      this.mNetworkFetcher = paramNetworkFetcher;
      return this;
    }
    
    public Builder setPlatformBitmapFactory(PlatformBitmapFactory paramPlatformBitmapFactory)
    {
      this.mPlatformBitmapFactory = paramPlatformBitmapFactory;
      return this;
    }
    
    public Builder setPoolFactory(PoolFactory paramPoolFactory)
    {
      this.mPoolFactory = paramPoolFactory;
      return this;
    }
    
    public Builder setProgressiveJpegConfig(ProgressiveJpegConfig paramProgressiveJpegConfig)
    {
      this.mProgressiveJpegConfig = paramProgressiveJpegConfig;
      return this;
    }
    
    public Builder setRequestListeners(Set<RequestListener> paramSet)
    {
      this.mRequestListeners = paramSet;
      return this;
    }
    
    public Builder setResizeAndRotateEnabledForNetwork(boolean paramBoolean)
    {
      this.mResizeAndRotateEnabledForNetwork = paramBoolean;
      return this;
    }
    
    public Builder setSmallImageDiskCacheConfig(DiskCacheConfig paramDiskCacheConfig)
    {
      this.mSmallImageDiskCacheConfig = paramDiskCacheConfig;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/core/ImagePipelineConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */