package com.facebook.imageformat;

import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Ints;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.imagepipeline.webp.WebpSupportStatus;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class ImageFormatChecker
{
  private static final byte[] BMP_HEADER = asciiBytes("BM");
  private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
  private static final byte[] GIF_HEADER_87A;
  private static final byte[] GIF_HEADER_89A;
  private static final int GIF_HEADER_LENGTH = 6;
  private static final byte[] JPEG_HEADER = { -1, -40, -1 };
  private static final int MAX_HEADER_LENGTH = Ints.max(new int[] { 21, 20, JPEG_HEADER.length, PNG_HEADER.length, 6, BMP_HEADER.length });
  private static final byte[] PNG_HEADER = { -119, 80, 78, 71, 13, 10, 26, 10 };
  private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
  
  static
  {
    GIF_HEADER_87A = asciiBytes("GIF87a");
    GIF_HEADER_89A = asciiBytes("GIF89a");
  }
  
  private static byte[] asciiBytes(String paramString)
  {
    Preconditions.checkNotNull(paramString);
    try
    {
      paramString = paramString.getBytes("ASCII");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("ASCII not found!", paramString);
    }
  }
  
  private static ImageFormat doGetImageFormat(byte[] paramArrayOfByte, int paramInt)
  {
    Preconditions.checkNotNull(paramArrayOfByte);
    if (WebpSupportStatus.isWebpHeader(paramArrayOfByte, 0, paramInt)) {
      return getWebpFormat(paramArrayOfByte, paramInt);
    }
    if (isJpegHeader(paramArrayOfByte, paramInt)) {
      return ImageFormat.JPEG;
    }
    if (isPngHeader(paramArrayOfByte, paramInt)) {
      return ImageFormat.PNG;
    }
    if (isGifHeader(paramArrayOfByte, paramInt)) {
      return ImageFormat.GIF;
    }
    if (isBmpHeader(paramArrayOfByte, paramInt)) {
      return ImageFormat.BMP;
    }
    return ImageFormat.UNKNOWN;
  }
  
  public static ImageFormat getImageFormat(InputStream paramInputStream)
  {
    Preconditions.checkNotNull(paramInputStream);
    byte[] arrayOfByte = new byte[MAX_HEADER_LENGTH];
    return doGetImageFormat(arrayOfByte, readHeaderFromStream(paramInputStream, arrayOfByte));
  }
  
  /* Error */
  public static ImageFormat getImageFormat(String paramString)
  {
    // Byte code:
    //   0: new 138	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 141	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_1
    //   9: aload_1
    //   10: astore_0
    //   11: aload_1
    //   12: invokestatic 143	com/facebook/imageformat/ImageFormatChecker:getImageFormat	(Ljava/io/InputStream;)Lcom/facebook/imageformat/ImageFormat;
    //   15: astore_2
    //   16: aload_1
    //   17: invokestatic 149	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   20: aload_2
    //   21: areturn
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: astore_0
    //   27: getstatic 125	com/facebook/imageformat/ImageFormat:UNKNOWN	Lcom/facebook/imageformat/ImageFormat;
    //   30: astore_2
    //   31: aload_1
    //   32: invokestatic 149	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   35: aload_2
    //   36: areturn
    //   37: astore_0
    //   38: aconst_null
    //   39: astore_2
    //   40: aload_0
    //   41: astore_1
    //   42: aload_2
    //   43: invokestatic 149	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   46: aload_1
    //   47: athrow
    //   48: astore_1
    //   49: aload_0
    //   50: astore_2
    //   51: goto -9 -> 42
    //   54: astore_0
    //   55: goto -30 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramString	String
    //   8	39	1	localObject1	Object
    //   48	1	1	localObject2	Object
    //   15	36	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	9	22	java/io/IOException
    //   0	9	37	finally
    //   11	16	48	finally
    //   27	31	48	finally
    //   11	16	54	java/io/IOException
  }
  
  public static ImageFormat getImageFormat_WrapIOException(InputStream paramInputStream)
  {
    try
    {
      paramInputStream = getImageFormat(paramInputStream);
      return paramInputStream;
    }
    catch (IOException paramInputStream)
    {
      throw Throwables.propagate(paramInputStream);
    }
  }
  
  private static ImageFormat getWebpFormat(byte[] paramArrayOfByte, int paramInt)
  {
    Preconditions.checkArgument(WebpSupportStatus.isWebpHeader(paramArrayOfByte, 0, paramInt));
    if (WebpSupportStatus.isSimpleWebpHeader(paramArrayOfByte, 0)) {
      return ImageFormat.WEBP_SIMPLE;
    }
    if (WebpSupportStatus.isLosslessWebpHeader(paramArrayOfByte, 0)) {
      return ImageFormat.WEBP_LOSSLESS;
    }
    if (WebpSupportStatus.isExtendedWebpHeader(paramArrayOfByte, 0, paramInt))
    {
      if (WebpSupportStatus.isAnimatedWebpHeader(paramArrayOfByte, 0)) {
        return ImageFormat.WEBP_ANIMATED;
      }
      if (WebpSupportStatus.isExtendedWebpHeaderWithAlpha(paramArrayOfByte, 0)) {
        return ImageFormat.WEBP_EXTENDED_WITH_ALPHA;
      }
      return ImageFormat.WEBP_EXTENDED;
    }
    return ImageFormat.UNKNOWN;
  }
  
  private static boolean isBmpHeader(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt < BMP_HEADER.length) {
      return false;
    }
    return matchBytePattern(paramArrayOfByte, 0, BMP_HEADER);
  }
  
  private static boolean isGifHeader(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt < 6) {}
    while ((!matchBytePattern(paramArrayOfByte, 0, GIF_HEADER_87A)) && (!matchBytePattern(paramArrayOfByte, 0, GIF_HEADER_89A))) {
      return false;
    }
    return true;
  }
  
  private static boolean isJpegHeader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= JPEG_HEADER.length)
    {
      bool1 = bool2;
      if (matchBytePattern(paramArrayOfByte, 0, JPEG_HEADER)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static boolean isPngHeader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= PNG_HEADER.length)
    {
      bool1 = bool2;
      if (matchBytePattern(paramArrayOfByte, 0, PNG_HEADER)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static boolean matchBytePattern(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    Preconditions.checkNotNull(paramArrayOfByte1);
    Preconditions.checkNotNull(paramArrayOfByte2);
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool);
      if (paramArrayOfByte2.length + paramInt <= paramArrayOfByte1.length) {
        break;
      }
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte2.length) {
        break label65;
      }
      if (paramArrayOfByte1[(i + paramInt)] != paramArrayOfByte2[i]) {
        break;
      }
      i += 1;
    }
    label65:
    return true;
  }
  
  private static int readHeaderFromStream(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    Preconditions.checkNotNull(paramInputStream);
    Preconditions.checkNotNull(paramArrayOfByte);
    if (paramArrayOfByte.length >= MAX_HEADER_LENGTH) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool);
      if (!paramInputStream.markSupported()) {
        break;
      }
      try
      {
        paramInputStream.mark(MAX_HEADER_LENGTH);
        int i = ByteStreams.read(paramInputStream, paramArrayOfByte, 0, MAX_HEADER_LENGTH);
        return i;
      }
      finally
      {
        paramInputStream.reset();
      }
    }
    return ByteStreams.read(paramInputStream, paramArrayOfByte, 0, MAX_HEADER_LENGTH);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imageformat/ImageFormatChecker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */