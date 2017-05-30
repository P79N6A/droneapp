package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.aaa;

@aaa
@TargetApi(14)
public abstract class i
  extends TextureView
{
  public i(Context paramContext)
  {
    super(paramContext);
  }
  
  public abstract String a();
  
  public abstract void a(float paramFloat);
  
  public abstract void a(float paramFloat1, float paramFloat2);
  
  public abstract void a(int paramInt);
  
  public abstract void a(h paramh);
  
  public abstract void b();
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract int getCurrentPosition();
  
  public abstract int getDuration();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoWidth();
  
  public abstract void setVideoPath(String paramString);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */