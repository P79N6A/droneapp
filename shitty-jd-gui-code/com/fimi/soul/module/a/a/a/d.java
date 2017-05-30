package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.gui.BitmapProcessor;
import com.mob.tools.utils.R;

public class d
  extends LinearLayout
{
  private static final int a = 64;
  private static final int b = 24;
  private static final int c = 96;
  private static final int d = 20;
  private ImageView e;
  private AsyncImageView f;
  private TextView g;
  private Bitmap h;
  private Bitmap i;
  
  public d(Context paramContext, float paramFloat)
  {
    super(paramContext);
    int j = (int)(20.0F * paramFloat);
    setPadding(j, 0, j, 0);
    setMinimumHeight((int)(96.0F * paramFloat));
    setBackgroundColor(-1);
    this.e = new ImageView(paramContext);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 16;
    addView(this.e, localLayoutParams);
    this.f = new AsyncImageView(paramContext);
    j = (int)(64.0F * paramFloat);
    localLayoutParams = new LinearLayout.LayoutParams(j, j);
    localLayoutParams.gravity = 16;
    j = (int)(24.0F * paramFloat);
    localLayoutParams.setMargins(j, 0, j, 0);
    addView(this.f, localLayoutParams);
    this.g = new TextView(paramContext);
    this.g.setTextColor(-16777216);
    this.g.setTextSize(2, 18.0F);
    this.g.setSingleLine();
    localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 16;
    localLayoutParams.weight = 1.0F;
    addView(this.g, localLayoutParams);
    j = R.getBitmapRes(paramContext, "ssdk_oks_classic_check_checked");
    if (j > 0) {
      this.h = BitmapFactory.decodeResource(paramContext.getResources(), j);
    }
    j = R.getBitmapRes(getContext(), "ssdk_oks_classic_check_default");
    if (j > 0) {
      this.i = BitmapFactory.decodeResource(paramContext.getResources(), j);
    }
  }
  
  public void a(c.b paramb, boolean paramBoolean)
  {
    this.g.setText(paramb.b);
    ImageView localImageView = this.e;
    if (paramb.a) {}
    for (Bitmap localBitmap = this.h;; localBitmap = this.i)
    {
      localImageView.setImageBitmap(localBitmap);
      if (this.f != null)
      {
        if (!paramBoolean) {
          break label92;
        }
        paramb = BitmapProcessor.getBitmapFromCache(paramb.e);
        if ((paramb == null) || (paramb.isRecycled())) {
          break;
        }
        this.f.setImageBitmap(paramb);
      }
      return;
    }
    this.f.execute(null, 0);
    return;
    label92:
    this.f.execute(paramb.e, 0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */