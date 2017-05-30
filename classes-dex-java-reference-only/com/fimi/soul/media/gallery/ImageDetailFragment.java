package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.c;
import com.fimi.kernel.utils.s;
import com.fimi.soul.utils.v;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class ImageDetailFragment
  extends Fragment
{
  private static boolean e;
  Bitmap a = null;
  private String b;
  private PhotoDraweeView c;
  private ProgressBar d;
  
  public static ImageDetailFragment a(String paramString, boolean paramBoolean)
  {
    ImageDetailFragment localImageDetailFragment = new ImageDetailFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString);
    localImageDetailFragment.setArguments(localBundle);
    e = paramBoolean;
    return localImageDetailFragment;
  }
  
  @SuppressLint({"NewApi"})
  private void a(PhotoDraweeView paramPhotoDraweeView, String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      paramPhotoDraweeView.setImageResource(2130837953);
      return;
    }
    if (v.c(paramString, getActivity()))
    {
      paramPhotoDraweeView.setBackground(s.a(paramBitmap));
      paramPhotoDraweeView.setImageResource(2130838611);
      return;
    }
    paramPhotoDraweeView.setImageBitmap(paramBitmap);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (e) {
      this.b = ("file://" + this.b);
    }
    this.c.getLayoutParams().height = c.d(getActivity()).heightPixels;
    this.c.getLayoutParams().width = c.d(getActivity()).widthPixels;
    x.a(this.c, this.b, new BaseControllerListener()
    {
      public void a(String paramAnonymousString, ImageInfo paramAnonymousImageInfo, Animatable paramAnonymousAnimatable)
      {
        super.onFinalImageSet(paramAnonymousString, paramAnonymousImageInfo, paramAnonymousAnimatable);
        if ((paramAnonymousImageInfo == null) || (ImageDetailFragment.a(ImageDetailFragment.this) == null)) {
          return;
        }
        ImageDetailFragment.a(ImageDetailFragment.this).a(paramAnonymousImageInfo.getWidth(), paramAnonymousImageInfo.getHeight());
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null) {}
    for (paramBundle = getArguments().getString("url");; paramBundle = null)
    {
      this.b = paramBundle;
      return;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968706, paramViewGroup, false);
    this.c = ((PhotoDraweeView)paramLayoutInflater.findViewById(2131689624));
    this.c.setOnPhotoTapListener(new d()
    {
      public void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        ImageDetailFragment.this.getActivity().finish();
        ImageDetailFragment.this.getActivity().overridePendingTransition(17432576, 17432577);
      }
    });
    this.d = ((ProgressBar)paramLayoutInflater.findViewById(2131690320));
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.a = null;
    System.gc();
  }
  
  public void onStop()
  {
    super.onStop();
    if ((this.a != null) && (!this.a.isRecycled())) {
      this.a.recycle();
    }
    System.gc();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/ImageDetailFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */