package com.facebook.imageformat;

public class ImageFileExtensionMap
{
  public static String getFileExtension(ImageFormat paramImageFormat)
  {
    switch (paramImageFormat)
    {
    default: 
      throw new UnsupportedOperationException("Unknown image format " + paramImageFormat.name());
    case ???: 
    case ???: 
    case ???: 
    case ???: 
    case ???: 
      return "webp";
    case ???: 
      return "jpeg";
    case ???: 
      return "png";
    case ???: 
      return "gif";
    }
    return "bmp";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imageformat/ImageFileExtensionMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */