package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

public abstract interface ControllerListener<INFO>
{
  public abstract void onFailure(String paramString, Throwable paramThrowable);
  
  public abstract void onFinalImageSet(String paramString, @Nullable INFO paramINFO, @Nullable Animatable paramAnimatable);
  
  public abstract void onIntermediateImageFailed(String paramString, Throwable paramThrowable);
  
  public abstract void onIntermediateImageSet(String paramString, @Nullable INFO paramINFO);
  
  public abstract void onRelease(String paramString);
  
  public abstract void onSubmit(String paramString, Object paramObject);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/drawee/controller/ControllerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */