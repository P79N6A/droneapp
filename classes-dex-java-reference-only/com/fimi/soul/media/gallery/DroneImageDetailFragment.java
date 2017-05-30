package com.fimi.soul.media.gallery;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.c;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class DroneImageDetailFragment
  extends Fragment
{
  private int a = 0;
  private String b;
  private boolean c = false;
  private String d;
  private PhotoDraweeView e;
  private ProgressBar f;
  private Bitmap g = null;
  private d h;
  
  public static DroneImageDetailFragment a(String paramString)
  {
    return new DroneImageDetailFragment();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(d paramd)
  {
    this.h = paramd;
  }
  
  public void b()
  {
    if (this.b.contains("&&")) {
      this.b = this.b.split("&&")[0];
    }
    if (this.d != null) {
      x.a(this.e, this.d, this.b, new a(null));
    }
    for (;;)
    {
      this.c = true;
      return;
      x.a(this.e, this.b, new a(null));
    }
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public PhotoDraweeView c()
  {
    return this.e;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.e.getLayoutParams().height = c.d(getActivity()).heightPixels;
    this.e.getLayoutParams().width = c.d(getActivity()).widthPixels;
    if (this.h != null) {
      this.e.setOnPhotoTapListener(this.h);
    }
    if (this.c) {
      b();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968706, paramViewGroup, false);
    this.f = ((ProgressBar)paramLayoutInflater.findViewById(2131690320));
    if ((this.b != null) && (!this.b.endsWith(".MP4"))) {
      this.f.setVisibility(0);
    }
    for (;;)
    {
      this.e = ((PhotoDraweeView)paramLayoutInflater.findViewById(2131689624));
      return paramLayoutInflater;
      this.f.setVisibility(8);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.g = null;
    System.gc();
  }
  
  public void onStop()
  {
    super.onStop();
    if ((this.g != null) && (!this.g.isRecycled())) {
      this.g.recycle();
    }
    System.gc();
  }
  
  private class a
    extends BaseControllerListener<ImageInfo>
  {
    private a() {}
    
    public void a(String paramString, ImageInfo paramImageInfo, Animatable paramAnimatable)
    {
      super.onFinalImageSet(paramString, paramImageInfo, paramAnimatable);
      DroneImageDetailFragment.a(DroneImageDetailFragment.this).setVisibility(8);
      if ((paramImageInfo == null) || (DroneImageDetailFragment.b(DroneImageDetailFragment.this) == null)) {
        return;
      }
      DroneImageDetailFragment.b(DroneImageDetailFragment.this).a(paramImageInfo.getWidth(), paramImageInfo.getHeight());
    }
    
    public void onFailure(String paramString, Throwable paramThrowable)
    {
      super.onFailure(paramString, paramThrowable);
      DroneImageDetailFragment.a(DroneImageDetailFragment.this).setVisibility(8);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/DroneImageDetailFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */