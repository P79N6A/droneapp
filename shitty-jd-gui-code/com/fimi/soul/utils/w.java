package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class w
{
  private Context a;
  
  public w(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public Toast a(int paramInt)
  {
    View localView = LayoutInflater.from(this.a).inflate(paramInt, null);
    Toast localToast = new Toast(this.a);
    localToast.setGravity(53, 12, 40);
    localToast.setDuration(1);
    localToast.setView(localView);
    return localToast;
  }
  
  public Toast a(String paramString)
  {
    return Toast.makeText(this.a, paramString, 0);
  }
  
  public Toast a(String paramString, Drawable paramDrawable)
  {
    paramString = Toast.makeText(this.a, paramString, 1);
    paramString.setGravity(17, 0, 0);
    LinearLayout localLinearLayout = (LinearLayout)paramString.getView();
    ImageView localImageView = new ImageView(this.a);
    localImageView.setBackgroundDrawable(paramDrawable);
    localLinearLayout.addView(localImageView, 0);
    return paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */