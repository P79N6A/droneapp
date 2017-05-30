package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap.Config;
import com.facebook.common.internal.Closeables;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.GifFormatChecker;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.animated.factory.AnimatedImageFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import java.io.InputStream;

public class ImageDecoder {
    private final AnimatedImageFactory mAnimatedImageFactory;
    private final Config mBitmapConfig;
    private final PlatformDecoder mPlatformDecoder;

    public ImageDecoder(AnimatedImageFactory animatedImageFactory, PlatformDecoder platformDecoder, Config config) {
        this.mAnimatedImageFactory = animatedImageFactory;
        this.mBitmapConfig = config;
        this.mPlatformDecoder = platformDecoder;
    }

    public CloseableImage decodeAnimatedWebp(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
        return this.mAnimatedImageFactory.decodeWebP(encodedImage, imageDecodeOptions, this.mBitmapConfig);
    }

    public CloseableImage decodeGif(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
        InputStream inputStream = encodedImage.getInputStream();
        if (inputStream == null) {
            return null;
        }
        try {
            CloseableImage decodeGif;
            if (GifFormatChecker.isAnimated(inputStream)) {
                decodeGif = this.mAnimatedImageFactory.decodeGif(encodedImage, imageDecodeOptions, this.mBitmapConfig);
                return decodeGif;
            }
            decodeGif = decodeStaticImage(encodedImage);
            Closeables.closeQuietly(inputStream);
            return decodeGif;
        } finally {
            Closeables.closeQuietly(inputStream);
        }
    }

    public CloseableImage decodeImage(EncodedImage encodedImage, int i, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
        ImageFormat imageFormat = encodedImage.getImageFormat();
        if (imageFormat == null || imageFormat == ImageFormat.UNKNOWN) {
            imageFormat = ImageFormatChecker.getImageFormat_WrapIOException(encodedImage.getInputStream());
        }
        switch (imageFormat) {
            case UNKNOWN:
                throw new IllegalArgumentException("unknown image format");
            case JPEG:
                return decodeJpeg(encodedImage, i, qualityInfo);
            case GIF:
                return decodeGif(encodedImage, imageDecodeOptions);
            case WEBP_ANIMATED:
                return decodeAnimatedWebp(encodedImage, imageDecodeOptions);
            default:
                return decodeStaticImage(encodedImage);
        }
    }

    public CloseableStaticBitmap decodeJpeg(EncodedImage encodedImage, int i, QualityInfo qualityInfo) {
        CloseableReference decodeJPEGFromEncodedImage = this.mPlatformDecoder.decodeJPEGFromEncodedImage(encodedImage, this.mBitmapConfig, i);
        try {
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(decodeJPEGFromEncodedImage, qualityInfo, encodedImage.getRotationAngle());
            return closeableStaticBitmap;
        } finally {
            decodeJPEGFromEncodedImage.close();
        }
    }

    public CloseableStaticBitmap decodeStaticImage(EncodedImage encodedImage) {
        CloseableReference decodeFromEncodedImage = this.mPlatformDecoder.decodeFromEncodedImage(encodedImage, this.mBitmapConfig);
        try {
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(decodeFromEncodedImage, ImmutableQualityInfo.FULL_QUALITY, encodedImage.getRotationAngle());
            return closeableStaticBitmap;
        } finally {
            decodeFromEncodedImage.close();
        }
    }
}
