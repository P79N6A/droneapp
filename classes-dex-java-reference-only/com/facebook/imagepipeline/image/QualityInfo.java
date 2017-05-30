package com.facebook.imagepipeline.image;

public abstract interface QualityInfo
{
  public abstract int getQuality();
  
  public abstract boolean isOfFullQuality();
  
  public abstract boolean isOfGoodEnoughQuality();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/image/QualityInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */