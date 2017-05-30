package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.Contacts;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.JfifUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class LocalContentUriFetchProducer
  extends LocalFetchProducer
{
  private static final float ACCEPTABLE_REQUESTED_TO_ACTUAL_SIZE_RATIO = 1.3333334F;
  private static final String DISPLAY_PHOTO_PATH;
  private static final Rect MICRO_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 96, 96);
  private static final Rect MINI_THUMBNAIL_DIMENSIONS;
  private static final int NO_THUMBNAIL = 0;
  @VisibleForTesting
  static final String PRODUCER_NAME = "LocalContentUriFetchProducer";
  private static final String[] PROJECTION;
  private static final Class<?> TAG = LocalContentUriFetchProducer.class;
  private static final String[] THUMBNAIL_PROJECTION;
  private final ContentResolver mContentResolver;
  
  static
  {
    DISPLAY_PHOTO_PATH = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").getPath();
    PROJECTION = new String[] { "_id", "_data" };
    THUMBNAIL_PROJECTION = new String[] { "_data" };
    MINI_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 512, 384);
  }
  
  public LocalContentUriFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, ContentResolver paramContentResolver, boolean paramBoolean)
  {
    super(paramExecutor, paramPooledByteBufferFactory, paramBoolean);
    this.mContentResolver = paramContentResolver;
  }
  
  @Nullable
  private EncodedImage getCameraImage(Uri paramUri, ResizeOptions paramResizeOptions)
  {
    paramUri = this.mContentResolver.query(paramUri, PROJECTION, null, null, null);
    if (paramUri == null) {
      return null;
    }
    try
    {
      int i = paramUri.getCount();
      if (i == 0) {
        return null;
      }
      paramUri.moveToFirst();
      String str = paramUri.getString(paramUri.getColumnIndex("_data"));
      if (paramResizeOptions != null)
      {
        paramResizeOptions = getThumbnail(paramResizeOptions, paramUri.getInt(paramUri.getColumnIndex("_id")));
        if (paramResizeOptions != null)
        {
          paramResizeOptions.setRotationAngle(getRotationAngle(str));
          return paramResizeOptions;
        }
      }
      if (str != null)
      {
        paramResizeOptions = getEncodedImage(new FileInputStream(str), getLength(str));
        return paramResizeOptions;
      }
      return null;
    }
    finally
    {
      paramUri.close();
    }
  }
  
  private static int getLength(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    return (int)new File(paramString).length();
  }
  
  private static int getRotationAngle(String paramString)
  {
    int i = 0;
    if (paramString != null) {}
    try
    {
      i = JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(paramString).getAttributeInt("Orientation", 1));
      return i;
    }
    catch (IOException localIOException)
    {
      FLog.e(TAG, localIOException, "Unable to retrieve thumbnail rotation for %s", new Object[] { paramString });
    }
    return 0;
  }
  
  private EncodedImage getThumbnail(ResizeOptions paramResizeOptions, int paramInt)
  {
    Object localObject1 = null;
    int i = getThumbnailKind(paramResizeOptions);
    if (i == 0) {}
    for (;;)
    {
      return (EncodedImage)localObject1;
      try
      {
        paramResizeOptions = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.mContentResolver, paramInt, i, THUMBNAIL_PROJECTION);
        if (paramResizeOptions == null)
        {
          if (paramResizeOptions == null) {
            continue;
          }
          paramResizeOptions.close();
          return null;
        }
      }
      finally
      {
        try
        {
          paramResizeOptions.moveToFirst();
          if (paramResizeOptions.getCount() > 0)
          {
            localObject3 = paramResizeOptions.getString(paramResizeOptions.getColumnIndex("_data"));
            if (new File((String)localObject3).exists())
            {
              localObject3 = getEncodedImage(new FileInputStream((String)localObject3), getLength((String)localObject3));
              localObject1 = localObject3;
              if (paramResizeOptions == null) {
                continue;
              }
              paramResizeOptions.close();
              return (EncodedImage)localObject3;
            }
          }
          if (paramResizeOptions == null) {
            continue;
          }
          paramResizeOptions.close();
          return null;
        }
        finally
        {
          Object localObject3 = paramResizeOptions;
        }
        paramResizeOptions = finally;
        localObject3 = null;
        localObject1 = paramResizeOptions;
      }
    }
    if (localObject3 != null) {
      ((Cursor)localObject3).close();
    }
    throw ((Throwable)localObject1);
  }
  
  private static int getThumbnailKind(ResizeOptions paramResizeOptions)
  {
    if (isThumbnailBigEnough(paramResizeOptions, MICRO_THUMBNAIL_DIMENSIONS)) {
      return 3;
    }
    if (isThumbnailBigEnough(paramResizeOptions, MINI_THUMBNAIL_DIMENSIONS)) {
      return 1;
    }
    return 0;
  }
  
  private static boolean isCameraUri(Uri paramUri)
  {
    paramUri = paramUri.toString();
    return (paramUri.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) || (paramUri.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString()));
  }
  
  private static boolean isContactUri(Uri paramUri)
  {
    return ("com.android.contacts".equals(paramUri.getAuthority())) && (!paramUri.getPath().startsWith(DISPLAY_PHOTO_PATH));
  }
  
  @VisibleForTesting
  static boolean isThumbnailBigEnough(ResizeOptions paramResizeOptions, Rect paramRect)
  {
    return (paramResizeOptions.width <= paramRect.width() * 1.3333334F) && (paramResizeOptions.height <= paramRect.height() * 1.3333334F);
  }
  
  protected EncodedImage getEncodedImage(ImageRequest paramImageRequest)
  {
    Uri localUri = paramImageRequest.getSourceUri();
    if (isContactUri(localUri)) {
      if (localUri.toString().endsWith("/photo"))
      {
        paramImageRequest = this.mContentResolver.openInputStream(localUri);
        paramImageRequest = getEncodedImage(paramImageRequest, -1);
      }
    }
    EncodedImage localEncodedImage;
    do
    {
      return paramImageRequest;
      paramImageRequest = ContactsContract.Contacts.openContactPhotoInputStream(this.mContentResolver, localUri);
      break;
      if (!isCameraUri(localUri)) {
        break label77;
      }
      localEncodedImage = getCameraImage(localUri, paramImageRequest.getResizeOptions());
      paramImageRequest = localEncodedImage;
    } while (localEncodedImage != null);
    label77:
    return getEncodedImage(this.mContentResolver.openInputStream(localUri), -1);
  }
  
  protected String getProducerName()
  {
    return "LocalContentUriFetchProducer";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/producers/LocalContentUriFetchProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */