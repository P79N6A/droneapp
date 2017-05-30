package com.fimi.soul.utils;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.cache.disk.DiskCacheConfig;
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
import com.facebook.imagepipeline.listener.RequestLoggingListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.fimi.kernel.c;
import com.fimi.soul.biz.camera.entity.X11FileInfo;

public class x {
    private static final String a = "imagepipeline_cache";
    private static final int b = ((int) Runtime.getRuntime().maxMemory());
    private static final int c = 41943040;
    private static final int d = (b / 4);
    private static ImagePipelineConfig e;

    public static void a() {
        Fresco.initialize(c.a(), c());
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str) {
        a(simpleDraweeView, str, null);
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str, ControllerListener controllerListener) {
        if (str != null) {
            int i = simpleDraweeView.getLayoutParams().width;
            int i2 = simpleDraweeView.getLayoutParams().height;
            PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
            newDraweeControllerBuilder.setOldController(simpleDraweeView.getController());
            newDraweeControllerBuilder.setAutoPlayAnimations(true);
            ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str));
            newBuilderWithSource.setProgressiveRenderingEnabled(true);
            Log.d("Good", str);
            if (i > 0 && i2 > 0) {
                newBuilderWithSource.setResizeOptions(new ResizeOptions(i, i2));
            }
            newDraweeControllerBuilder.setImageRequest(newBuilderWithSource.build());
            newDraweeControllerBuilder.setControllerListener(controllerListener);
            simpleDraweeView.setController(newDraweeControllerBuilder.build());
        }
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str, String str2, ControllerListener controllerListener) {
        if (str2 != null) {
            int i = simpleDraweeView.getLayoutParams().width;
            int i2 = simpleDraweeView.getLayoutParams().height;
            PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
            if (!str.startsWith("file:///")) {
                str = "file://" + str;
            }
            if (str != null && str.length() > 0) {
                newDraweeControllerBuilder.setLowResImageRequest(ImageRequest.fromUri(str));
            }
            newDraweeControllerBuilder.setOldController(simpleDraweeView.getController());
            newDraweeControllerBuilder.setAutoPlayAnimations(true);
            ImageRequestBuilder newBuilderWithSource = str2.endsWith(X11FileInfo.FILE_TYPE_MP4) ? ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)) : ImageRequestBuilder.newBuilderWithSource(Uri.parse(str2));
            if (i > 0 && i2 > 0) {
                newBuilderWithSource.setResizeOptions(new ResizeOptions(i, i2));
            }
            newDraweeControllerBuilder.setImageRequest(newBuilderWithSource.build());
            newDraweeControllerBuilder.setControllerListener(controllerListener);
            simpleDraweeView.setController(newDraweeControllerBuilder.build());
        }
    }

    private static void a(Builder builder) {
        builder.setRequestListeners(Sets.newHashSet(new RequestLoggingListener()));
    }

    private static void a(Builder builder, Context context) {
        final MemoryCacheParams memoryCacheParams = new MemoryCacheParams(d, Integer.MAX_VALUE, d, Integer.MAX_VALUE, Integer.MAX_VALUE);
        builder.setBitmapMemoryCacheParamsSupplier(new Supplier<MemoryCacheParams>() {
            public MemoryCacheParams a() {
                return memoryCacheParams;
            }

            public /* synthetic */ Object get() {
                return a();
            }
        }).setMainDiskCacheConfig(DiskCacheConfig.newBuilder().setBaseDirectoryPath(context.getApplicationContext().getCacheDir()).setBaseDirectoryName(a).setMaxCacheSize(41943040).build());
    }

    public static void b() {
        Fresco.shutDown();
    }

    public static ImagePipelineConfig c() {
        if (e == null) {
            Builder newBuilder = ImagePipelineConfig.newBuilder(c.a());
            a(newBuilder, c.a());
            a(newBuilder);
            e = newBuilder.build();
        }
        return e;
    }

    public static void d() {
        ImagePipeline imagePipeline = Fresco.getImagePipeline();
        imagePipeline.clearMemoryCaches();
        imagePipeline.clearDiskCaches();
    }
}
