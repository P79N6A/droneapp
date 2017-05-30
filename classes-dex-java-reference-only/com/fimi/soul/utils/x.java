package com.fimi.soul.utils;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskCacheConfig.Builder;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineConfig.Builder;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestLoggingListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.fimi.kernel.c;

public class x
{
  private static final String a = "imagepipeline_cache";
  private static final int b = (int)Runtime.getRuntime().maxMemory();
  private static final int c = 41943040;
  private static final int d = b / 4;
  private static ImagePipelineConfig e;
  
  public static void a()
  {
    Fresco.initialize(c.a(), c());
  }
  
  public static void a(SimpleDraweeView paramSimpleDraweeView, String paramString)
  {
    a(paramSimpleDraweeView, paramString, null);
  }
  
  public static void a(SimpleDraweeView paramSimpleDraweeView, String paramString, ControllerListener paramControllerListener)
  {
    if (paramString == null) {
      return;
    }
    int i = paramSimpleDraweeView.getLayoutParams().width;
    int j = paramSimpleDraweeView.getLayoutParams().height;
    PipelineDraweeControllerBuilder localPipelineDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
    localPipelineDraweeControllerBuilder.setOldController(paramSimpleDraweeView.getController());
    localPipelineDraweeControllerBuilder.setAutoPlayAnimations(true);
    ImageRequestBuilder localImageRequestBuilder = ImageRequestBuilder.newBuilderWithSource(Uri.parse(paramString));
    localImageRequestBuilder.setProgressiveRenderingEnabled(true);
    Log.d("Good", paramString);
    if ((i > 0) && (j > 0)) {
      localImageRequestBuilder.setResizeOptions(new ResizeOptions(i, j));
    }
    localPipelineDraweeControllerBuilder.setImageRequest(localImageRequestBuilder.build());
    localPipelineDraweeControllerBuilder.setControllerListener(paramControllerListener);
    paramSimpleDraweeView.setController(localPipelineDraweeControllerBuilder.build());
  }
  
  public static void a(SimpleDraweeView paramSimpleDraweeView, String paramString1, String paramString2, ControllerListener paramControllerListener)
  {
    if (paramString2 == null) {
      return;
    }
    int i = paramSimpleDraweeView.getLayoutParams().width;
    int j = paramSimpleDraweeView.getLayoutParams().height;
    PipelineDraweeControllerBuilder localPipelineDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
    String str = paramString1;
    if (!paramString1.startsWith("file:///")) {
      str = "file://" + paramString1;
    }
    if ((str != null) && (str.length() > 0)) {
      localPipelineDraweeControllerBuilder.setLowResImageRequest(ImageRequest.fromUri(str));
    }
    localPipelineDraweeControllerBuilder.setOldController(paramSimpleDraweeView.getController());
    localPipelineDraweeControllerBuilder.setAutoPlayAnimations(true);
    if (paramString2.endsWith(".MP4")) {}
    for (paramString1 = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str));; paramString1 = ImageRequestBuilder.newBuilderWithSource(Uri.parse(paramString2)))
    {
      if ((i > 0) && (j > 0)) {
        paramString1.setResizeOptions(new ResizeOptions(i, j));
      }
      localPipelineDraweeControllerBuilder.setImageRequest(paramString1.build());
      localPipelineDraweeControllerBuilder.setControllerListener(paramControllerListener);
      paramSimpleDraweeView.setController(localPipelineDraweeControllerBuilder.build());
      return;
    }
  }
  
  private static void a(ImagePipelineConfig.Builder paramBuilder)
  {
    paramBuilder.setRequestListeners(Sets.newHashSet(new RequestListener[] { new RequestLoggingListener() }));
  }
  
  private static void a(ImagePipelineConfig.Builder paramBuilder, Context paramContext)
  {
    paramBuilder.setBitmapMemoryCacheParamsSupplier(new Supplier()
    {
      public MemoryCacheParams a()
      {
        return this.a;
      }
    }).setMainDiskCacheConfig(DiskCacheConfig.newBuilder().setBaseDirectoryPath(paramContext.getApplicationContext().getCacheDir()).setBaseDirectoryName("imagepipeline_cache").setMaxCacheSize(41943040L).build());
  }
  
  public static void b() {}
  
  public static ImagePipelineConfig c()
  {
    if (e == null)
    {
      ImagePipelineConfig.Builder localBuilder = ImagePipelineConfig.newBuilder(c.a());
      a(localBuilder, c.a());
      a(localBuilder);
      e = localBuilder.build();
    }
    return e;
  }
  
  public static void d()
  {
    ImagePipeline localImagePipeline = Fresco.getImagePipeline();
    localImagePipeline.clearMemoryCaches();
    localImagePipeline.clearDiskCaches();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */