package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.QualityInfo;

public abstract interface ProgressiveJpegConfig
{
  public abstract int getNextScanNumberToDecode(int paramInt);
  
  public abstract QualityInfo getQualityInfo(int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/decoder/ProgressiveJpegConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */