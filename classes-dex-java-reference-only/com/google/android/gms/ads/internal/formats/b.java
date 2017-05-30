package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abw;
import java.util.Iterator;
import java.util.List;

@aaa
class b
  extends RelativeLayout
{
  private static final float[] a = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private final RelativeLayout b;
  @Nullable
  private AnimationDrawable c;
  
  public b(Context paramContext, a parama)
  {
    super(paramContext);
    d.a(parama);
    Object localObject1 = new RelativeLayout.LayoutParams(-2, -2);
    switch (parama.g())
    {
    case 1: 
    default: 
      ((RelativeLayout.LayoutParams)localObject1).addRule(10);
      ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    }
    for (;;)
    {
      Object localObject2 = new ShapeDrawable(new RoundRectShape(a, null, null));
      ((ShapeDrawable)localObject2).getPaint().setColor(parama.c());
      this.b = new RelativeLayout(paramContext);
      this.b.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      u.g().a(this.b, (Drawable)localObject2);
      localObject1 = new RelativeLayout.LayoutParams(-2, -2);
      if (!TextUtils.isEmpty(parama.a()))
      {
        localObject2 = new RelativeLayout.LayoutParams(-2, -2);
        TextView localTextView = new TextView(paramContext);
        localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localTextView.setId(1195835393);
        localTextView.setTypeface(Typeface.DEFAULT);
        localTextView.setText(parama.a());
        localTextView.setTextColor(parama.d());
        localTextView.setTextSize(parama.e());
        localTextView.setPadding(ac.a().a(paramContext, 4), 0, ac.a().a(paramContext, 4), 0);
        this.b.addView(localTextView);
        ((RelativeLayout.LayoutParams)localObject1).addRule(1, localTextView.getId());
      }
      paramContext = new ImageView(paramContext);
      paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramContext.setId(1195835394);
      localObject1 = parama.b();
      if (((List)localObject1).size() <= 1) {
        break label432;
      }
      this.c = new AnimationDrawable();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Drawable)((Iterator)localObject1).next();
        this.c.addFrame((Drawable)localObject2, parama.f());
      }
      ((RelativeLayout.LayoutParams)localObject1).addRule(10);
      ((RelativeLayout.LayoutParams)localObject1).addRule(9);
      continue;
      ((RelativeLayout.LayoutParams)localObject1).addRule(12);
      ((RelativeLayout.LayoutParams)localObject1).addRule(9);
      continue;
      ((RelativeLayout.LayoutParams)localObject1).addRule(12);
      ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    }
    u.g().a(paramContext, this.c);
    for (;;)
    {
      this.b.addView(paramContext);
      addView(this.b);
      return;
      label432:
      if (((List)localObject1).size() == 1) {
        paramContext.setImageDrawable((Drawable)((List)localObject1).get(0));
      }
    }
  }
  
  public ViewGroup a()
  {
    return this.b;
  }
  
  public void onAttachedToWindow()
  {
    if (this.c != null) {
      this.c.start();
    }
    super.onAttachedToWindow();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */