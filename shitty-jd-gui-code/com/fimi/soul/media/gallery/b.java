package com.fimi.soul.media.gallery;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class b
  extends AlertDialog
  implements View.OnClickListener
{
  private Bitmap a;
  private ProgressBar b;
  
  public b(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    super(paramContext, paramInt);
    this.a = paramBitmap;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    dismiss();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968702);
    paramBundle = (PhotoDraweeView)findViewById(2131690294);
    paramBundle.setOnPhotoTapListener(new d()
    {
      public void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        b.this.dismiss();
      }
    });
    this.b = ((ProgressBar)findViewById(2131690295));
    paramBundle.setOnClickListener(this);
    if (this.a != null)
    {
      paramBundle.setImageBitmap(this.a);
      this.b.setVisibility(4);
      paramBundle.setVisibility(0);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */